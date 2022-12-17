package Transport;

import static javacource.ValidateUtils.validateInteger;


public abstract class Transport {
    protected static Object Capacity;
    private final String brand;
    private final String model;
    private final Integer enginePower;

    public  Transport (String brand,String model,Integer enginePower) {
        this.brand = brand;
        this.model = model;
        this.enginePower = validateInteger(enginePower,2);
    }
    public String validateCarParameter(String brend) {
        return brand;

    }


    public String getBrand(){
        return brand;
    }
    public String getModel () {
        return model;
    }
    public Integer getEnginePower() {
        return enginePower;
    }

   public String printType;

    @Override
    public String toString() {
        return "Transport{"+"brend '" + brand + '\''+ "model '" + model + '\'' + "enginePower " +
                enginePower + '}';
    }
}