package com.example.springbootpetstore.dao;

import com.example.springbootpetstore.pojo.Species;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-24-20:19
 */
@Mapper
@Repository
public interface SpeciesMapper {
    //获得全部种类
    List<Species> getAllSpecies();

    //更新货物种类
    void addNewSpecies(Species species);
    void deleteSpecies(Species species);
    void updateSpecies(Species species);
    //根据宠物物种名字获取id
    Species getSpecies(String speciesName);
}
