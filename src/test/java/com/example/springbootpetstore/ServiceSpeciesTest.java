package com.example.springbootpetstore;

import com.example.springbootpetstore.pojo.Species;
import com.example.springbootpetstore.service.SpeciesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @auther 齿轮
 * @create 2023-03-24-20:49
 */
@SpringBootTest
public class ServiceSpeciesTest {
    @Autowired
    SpeciesService speciesService;


    @Test
    public void testGet() {
        System.out.println(speciesService.getAllSpecies());
    }

    @Test
    public void testAdd() {
        Species species = new Species(0, "其他1");
        speciesService.addNewSpecies(species);
        System.out.println(species);
        testGet();
    }

    @Test
    public void testUpdate() {
        speciesService.updateSpecies(new Species(9, "人类"));
        testGet();
    }

    @Test
    public void testDelete() {
        speciesService.deleteSpecies(new Species(9, "人类"));
        testGet();
    }
    @Test
    public void testGetSpecies(){
        System.out.println(speciesService.getSpecies("宠物猫"));
    }
}
