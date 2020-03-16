package com.company.typesMoving;

import com.company.TypesMove;

public class FlyMove implements TypesMove {
    @Override
    public void Move(String name) {
        System.out.println(name+" решил полететь на самолёте");
    }
}
