package com.example.springbootpetstore.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @auther 齿轮
 * @create 2022-10-26-15:16
 * 宠物类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pet {
    private long petID;
    private long species;
    private String name;
    private String description;
    private String picture;
    private BigDecimal prices;
    private BigDecimal specialPrices;
    private long amount;//可购买数量，即库存


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Pet) {
            Pet i = (Pet) obj;
            if (this.getPetID() == i.getPetID() && this.getName().equals(i.getName())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}
