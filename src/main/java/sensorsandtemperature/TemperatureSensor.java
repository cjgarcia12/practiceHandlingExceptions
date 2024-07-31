package sensorsandtemperature;

public class TemperatureSensor implements Sensor {
    private boolean isOn;
    private int temperature;

    public TemperatureSensor() {
        this.isOn = false;
        this.temperature = 0;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (!this.isOn) {
            throw new IllegalStateException("Sensor is off. Cannot read value.");
        }
        // Simulate reading temperature
        this.temperature = (int) (Math.random() * 100);
        return this.temperature;
    }
}
