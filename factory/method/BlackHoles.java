/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.method;

public abstract class BlackHoles implements Obstacle {
    @Override
    public void show(){
        System.out.println("BlackHoles popped up");
    }

}

class Small_BlackHoles extends BlackHoles {
    @Override
    public void show(){
        System.out.println("Small_BlackHoles popped up");
    }
}

class Large_BlackHoles extends BlackHoles {
    @Override
    public void show(){
        System.out.println("Large_BlackHoles popped up");
    }
}