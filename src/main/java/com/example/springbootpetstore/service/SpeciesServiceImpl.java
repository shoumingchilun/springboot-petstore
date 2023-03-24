package com.example.springbootpetstore.service;

import com.example.springbootpetstore.dao.SpeciesMapper;
import com.example.springbootpetstore.pojo.Species;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther 齿轮
 * @create 2023-03-24-20:44
 */
@Service
public class SpeciesServiceImpl implements SpeciesService{
    @Autowired
    SpeciesMapper species2Mapper;

    @Override
    public void addNewSpecies(Species species) {
        species2Mapper.addNewSpecies(species);
    }

    @Override
    public void deleteSpecies(Species species) {
        species2Mapper.deleteSpecies(species);
    }

    @Override
    public void updateSpecies(Species species) {
        species2Mapper.updateSpecies(species);
    }

    @Override
    public Map<Integer, String> getAllSpecies() {
        List<Species> allSpecies = species2Mapper.getAllSpecies();
        Map<Integer,String> map = new HashMap<>();
        allSpecies.forEach((i)->{
            map.put(i.getNumber(),i.getSpecies());
        });
        return map;
    }
}
