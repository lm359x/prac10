package ru.dz.pracspring;

public class Firefly implements Lighter{
    @Override
    public void doLight() {
        System.out.println("Firefly is lighting");
    }
}
