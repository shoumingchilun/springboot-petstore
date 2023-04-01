package com.example.springbootpetstore.service;

import com.example.springbootpetstore.dao.PetMapper;
import com.example.springbootpetstore.pojo.Pet;
import com.example.springbootpetstore.pojo.Species;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-20-21:11
 */
@Service
public class PetServiceImpl implements PetService {

    @Autowired
    PetMapper petMapper;

    //注册货物，提供Pet类型
    //建议使用方式：提供species、name、description、picture、prices、amount，特价可选可不选
    //注：petID会自己返回
    @Override
    public void registerPet(Pet pet) {
        petMapper.registerPet(pet);
    }

    //查询所有货物
    @Override
    public List<Pet> queryAllPets() {
        return petMapper.queryAllPets();
    }

    //查询没有库存的所有货物
    @Override
    public List<Pet> queryPetWithoutInventory() {
        return petMapper.queryPetWithoutInventory();
    }

    //查询指定ID的货物，只需要pet中的Id属性
    @Override
    public Pet queryPetById(Pet pet) {
        return petMapper.queryPetById(pet);
    }


    //删除指定货物，只需要petID属性
    @Override
    public void deletePet(Pet pet) {
        petMapper.deletePet(pet);
    }

    //更新指定货物，指明id
    @Override
    public void updatePet(Pet pet) {
        petMapper.updatePet(pet);
    }

    @Override
    public List<Pet> searchPetsBySpecies(int species) {
        return petMapper.searchPetsBySpecies(species);
    }

    @Override
    public List<Species> queryAllSpecies() {
        return petMapper.queryAllSpecies();
    }

    @Override
    public Pet queryPetBySpeciesAndName(int species, String name) {
        return petMapper.queryPetBySpeciesAndName(species,name);
    }
}
