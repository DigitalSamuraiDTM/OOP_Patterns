package com.company.typesMoving;

import com.company.TypesMove;

public class RunMove implements TypesMove {
    @Override
    public void Move(String name) {
        System.out.println(name+" решил пробежаться");
    }
}
