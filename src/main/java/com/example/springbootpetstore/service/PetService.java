package com.example.springbootpetstore.service;

import com.example.springbootpetstore.pojo.Pet;
import com.example.springbootpetstore.pojo.Species;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-20-21:10
 */
public interface PetService {
    void registerPet(Pet pet);

    List<Pet> queryAllPets();
    List<Pet> queryPetWithoutInventory();
    Pet queryPetById(Pet pet);

    void deletePet(Pet pet);

    void updatePet(Pet pet);
    //分类查询宠物
    List<Pet> searchPetsBySpecies(int species);
    //查询所有宠物种类
    List<Species> queryAllSpecies();
    Pet queryPetBySpeciesAndName(int species,String name);

}
