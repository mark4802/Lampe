public class Lamp {

    private boolean isOn;
    private String name;


    public Lamp(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void toggle() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }


}