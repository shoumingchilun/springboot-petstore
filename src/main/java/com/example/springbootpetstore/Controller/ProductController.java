package com.example.springbootpetstore.Controller;

import com.example.springbootpetstore.pojo.Pet;
import com.example.springbootpetstore.pojo.Species;
import com.example.springbootpetstore.service.PetService;
import com.example.springbootpetstore.service.PetServiceImpl;
import com.example.springbootpetstore.service.SpeciesService;
import com.example.springbootpetstore.service.SpeciesServiceImpl;
import com.example.springbootpetstore.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 皮皮皮
 * @date 2023/3/28 12:31
 */
@Controller
@RequestMapping("/product")
@SessionAttributes("petList")
public class ProductController {
    @Autowired
    PetService petService=new PetServiceImpl();
    @Autowired
    SpeciesService speciesService=new SpeciesServiceImpl();

    @GetMapping("/allProducts")
    public String toAllProducts(Model model){
        List<Pet> petList= petService.queryAllPets();
        System.out.println("******"+petList);
        model.addAttribute("petList",petList);
        return "productsController/allProducts";
    }
    @GetMapping("/typeOfProduct")
    public String toTypeOfProduct(Model model){
        List<Species>speciesList=petService.queryAllSpecies();
        model.addAttribute(speciesList);
        return "productsController/typeOfProduct";
    }

    //通过种类筛选宠物
    //这里后面改成异步局部刷新
    @GetMapping("/searchPetsBySpecies")
    public String petsOfSpecies(@RequestParam(value = "species") int species,Model model){
        List<Pet>petList=petService.searchPetsBySpecies(species);
        model.addAttribute("petList",petList);
        return "productsController/allProducts";
    }
    //新增pet
    @GetMapping("/addProduct")
    public String addProduct(){
        return "productsController/addProduct";
    }
    //上架商品
    @GetMapping("/putProduct")
    public String putProduct(){
        return "productsController/putProduct";
    }
    //根据传来的index查看宠物详情
    @GetMapping("/productInfo")
    public String productInfo(@RequestParam(value = "index") int index,
                              @SessionAttribute("petList") List<Pet> petList,
                              Model model){
        Pet pet=petList.get(index);
        System.out.println("-------------"+pet);
        model.addAttribute("pet",pet);
        return "productsController/petInfo";
    }
    @PostMapping("/deleteChosenProduct")
    @ResponseBody
    public AjaxResult deleteChosenTransaction(@RequestParam(value = "indexList") List<Integer> indexList){
        System.out.println("indexList:"+indexList);
        AjaxResult ajaxResult=new AjaxResult();
        List<Pet> petList= petService.queryAllPets();

        indexList.stream().forEach(index->{
            Pet pet=petList.get(index);

            petService.deletePet(pet);
            ajaxResult.setSuccess(true);
            ajaxResult.setMessage("删除成功");
        });
        return ajaxResult;

    }
    @PostMapping("/addProduct")
    @ResponseBody
    public AjaxResult addProduct( String species,String petName,@RequestParam(value = "amount")String numberStr){
        AjaxResult ajaxResult=new AjaxResult();
        System.out.println("species:"+species+"  petName"+petName);
        try{
            Pet pet=petService.queryPetBySpeciesAndName(Integer.parseInt(species),petName);
            //原本的数量
            long num=pet.getAmount();
            //新增后的数量
            pet.setAmount(num+Integer.parseInt(numberStr));
            petService.updatePet(pet);
            ajaxResult.setSuccess(true);
            ajaxResult.setMessage("新增成功");

        }catch (Exception e){
            ajaxResult.setSuccess(false);
            ajaxResult.setMessage("输入对象不存在");
        }
         return ajaxResult;
    }
    @PostMapping("/putProduct")
    @ResponseBody
    public AjaxResult putProduct( String speciesName, String name,
                                 BigDecimal prices, BigDecimal speciesPrices, int amount,
                                 String description){
        AjaxResult ajaxResult=new AjaxResult();

        System.out.println(speciesName+"/"+name+"/"+prices+"/"+speciesPrices+"/"+amount+"/"+description);
        Pet pet=new Pet();
        pet.setName(name);
        pet.setPrices(prices);
        pet.setSpecialPrices(speciesPrices);
        pet.setAmount(amount);
        pet.setDescription(description);

        System.out.println("--speciesName--"+speciesName+"--pet--"+pet);
        //添加新物种
        Species species=new Species();
        species.setSpecies(speciesName);
        speciesService.addNewSpecies(species);
        //获取新物种的id
        int speciesID=speciesService.getSpecies(speciesName).getNumber();
        pet.setSpecies(speciesID);
        //上架新宠物
        try{
            petService.registerPet(pet);
            ajaxResult.setSuccess(true);
            ajaxResult.setMessage("上架成功");
        }catch (Exception e){
            ajaxResult.setSuccess(false);
            ajaxResult.setMessage("上架失败");
        }


        return ajaxResult;
    }
}
