package cek.dpraktek8;


class HeroMagic extends Hero {
    private String power;

    public HeroMagic(String name, int health, String power) {
        super(name, health);
        this.power = power;
    }

    public String getPower() {
        return power;
    }
}