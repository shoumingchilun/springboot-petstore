package com.example.springbootpetstore.dao;

import com.example.springbootpetstore.pojo.Pet;
import com.example.springbootpetstore.pojo.Species;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-20-20:24
 *
 * 货物管理：货物属性的增删改查
 * 图片路径更改为第三方服务器的静态资源路径
 */
@Mapper
@Repository
public interface PetMapper {
    //增
    //仅需要属性，不需要id，id会在传入的Pet中自动出现
    void registerPet(Pet pet);

    //删
    void deletePet(Pet pet);

    //改
    void updatePet(Pet pet);
    //查
    Pet queryPetById(Pet pet);
    List<Pet> queryAllPets();
    List<Pet> queryPetWithoutInventory();
    List<Pet> searchPetsBySpecies(int species);
    //查询所有宠物种类
    List<Species> queryAllSpecies();
    Pet queryPetBySpeciesAndName(int species,String name);
}
