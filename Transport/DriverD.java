package Transport;


public abstract class DriverD<T extends Truck> extends Driver {

    public DriverD(String name, Boolean hasLicense, Integer experience) {
        super(name, hasLicense, experience);
    }

    public String start() {
        return "грузовик стартует";
    }

    public String stop() {
        return "грузовик останавливается";
    }

    public String refuel() {
        return "заправка грузовика";
    }

    public String getCarMessage(T trucks) {
        return "водитель " + getName() + " грузовика" + trucks.getModel() + "" +
                trucks.getBrand() + "будет участвовать в заезде";
    }
}