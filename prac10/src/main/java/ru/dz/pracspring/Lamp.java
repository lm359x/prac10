package ru.dz.pracspring;

public class Lamp implements Lighter{
    @Override
    public void doLight() {
        System.out.println("Lamp is lighting");
    }

}
