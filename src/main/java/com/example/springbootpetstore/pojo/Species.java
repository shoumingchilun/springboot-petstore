package com.example.springbootpetstore.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @auther 齿轮
 * @create 2023-03-24-20:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Species {
    private int number;
    private String species;
}
