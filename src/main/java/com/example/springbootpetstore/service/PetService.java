package com.example.springbootpetstore.service;

import com.example.springbootpetstore.pojo.Pet;

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

}
