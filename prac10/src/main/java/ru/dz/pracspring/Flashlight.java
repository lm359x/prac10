package ru.dz.pracspring;

public class Flashlight implements Lighter{
    @Override
    public void doLight() {
        System.out.println("Flashlight is lighting");
    }
}
