package com.example.springbootpetstore;

import com.example.springbootpetstore.pojo.Pet;
import com.example.springbootpetstore.service.PetService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-20-21:17
 */
@SpringBootTest
public class PetServiceTest {
    @Autowired
    PetService service;

    @Test
    public void testRegisterPet() {
        Pet pet = new Pet(0, 2, "鹦鹉1好", "没啥",
                "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2F556c767b-e3c8-4322-bf53-25d37a2e4a2a%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1681910837&t=0ae7f2da6fc7c0432d1ed9e68609c336",
                new BigDecimal("12.12"), null, 0);
        service.registerPet(pet);
        System.out.println(pet);
    }

    @Test
    public void testQuery() {
        List<Pet> pets = service.queryAllPets();

        pets.forEach((p) -> {
            System.out.println(p);
            System.out.println(service.queryPetById(p));
        });

        service.queryPetWithoutInventory().forEach(System.out::println);

    }

    @Test
    public void testDeletePet() {
        Pet pet = new Pet();
        pet.setPetID(23);
        service.deletePet(pet);
        service.queryAllPets().forEach(System.out::println);
    }

    @Test
    public void testUpdatePet() {
        Pet p = new Pet();
        p.setPetID(22);
        p = service.queryPetById(p);
        p.setName("nihao");
        service.updatePet(p);
        System.out.println(service.queryPetById(p));
    }
}
