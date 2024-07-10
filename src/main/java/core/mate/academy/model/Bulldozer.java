package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeLength;
    private int bladeMass;
    private int enginePower;

    public Bulldozer() {

    }

    public Bulldozer(String name, String color, int bladeLength, int bladeMass, int enginePower) {
        super(name, color);
        this.bladeLength = bladeLength;
        this.bladeMass = bladeMass;
        this.enginePower = enginePower;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getBladeMass() {
        return bladeMass;
    }

    public void setBladeMass(int bladeMass) {
        this.bladeMass = bladeMass;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
