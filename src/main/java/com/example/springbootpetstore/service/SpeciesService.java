package com.example.springbootpetstore.service;

import com.example.springbootpetstore.pojo.Species;

import java.util.Map;

/**
 * @auther 齿轮
 * @create 2023-03-24-20:35
 */
public interface SpeciesService {
    //增删改
    void addNewSpecies(Species species);
    void deleteSpecies(Species species);
    void updateSpecies(Species species);

    //查询，获得Species的Map集合
    Map<Integer,String> getAllSpecies();
    //根据宠物物种名字获取id
    Species getSpecies(String speciesName);
}
