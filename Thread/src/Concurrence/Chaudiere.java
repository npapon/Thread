package Concurrence;

public class Chaudiere {

    private int temperature;

    public Chaudiere() {
        this.temperature = 0;
    }

    public int getTemperature() {
        return temperature;
    }

    public void augementeTemperature() {
        this.temperature = temperature + 1;
    }

}
