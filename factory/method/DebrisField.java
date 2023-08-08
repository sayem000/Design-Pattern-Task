/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.method;

public abstract class DebrisField implements Obstacle {

    @Override
    public void show(){
        System.out.println("DebrisFeild");
    }
}

class Small_Metal_DebrisField extends DebrisField{

    @Override
    public void show(){
        System.out.println("Small_Metal_DebrisField popped up");
    }
}

class Large_Metal_DebrisField extends DebrisField{

    @Override
    public void show(){
        System.out.println("Large_Metal_DebrisField popped up");
    }
}

class Small_Crystal_DebrisField extends DebrisField{

    @Override
    public void show(){
        System.out.println("Small_Crystal_DebrisField popped up");
    }
}

class Large_Crystal_DebrisField extends DebrisField{

    @Override
    public void show(){
        System.out.println("Large_Crystal_DebrisFeild popped up");
    }
}
