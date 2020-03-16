package com.company;

public class CarMove implements TypesMove {
    @Override
    public void Move(String name) {
        System.out.println(name+" решил поехать на машине");
    }
}
