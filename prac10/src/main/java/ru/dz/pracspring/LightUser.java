package ru.dz.pracspring;

public class LightUser {
    private Lighter lighter;
    public LightUser() {
    }

    public LightUser(Lighter lighter) {
        this.lighter = lighter;
    }

    public Lighter getLighter() {
        return lighter;
    }

    public void setLighter(Lighter lighter) {
        this.lighter = lighter;
    }
}
