package com.example.springbootpetstore.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @auther 齿轮
 * @create 2022-10-26-16:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Transaction {
    private long transactionID;
    private long userId;
    private String specificInfo;
    private String state;

    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getSpecificInfo() {
        return specificInfo;
    }

    public void setSpecificInfo(String specificInfo) {
        this.specificInfo = specificInfo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
