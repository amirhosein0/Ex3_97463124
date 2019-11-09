package sample;

public class course {
    private String name;
    private int unit,capasity;

    public course(String name, int unit, int capasity) {
        this.name = name;
        this.unit = unit;
        this.capasity = capasity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }
}
