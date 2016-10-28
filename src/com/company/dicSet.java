package com.company;

public class dicSet {
    private String charactor;
    private Integer power;
    public String GetCharactor() {
        return charactor;
    }
    public void SetCharactor(String charactor) {
        this.charactor = charactor;
    }

    public Integer GetPower() {
        return power;
    }

    public void SetPower(Integer power) {
        this.power = power;
    }

    public void SetAll(String charactor, Integer power) {
        this.charactor = charactor;
        this.power = power;
    }
}
