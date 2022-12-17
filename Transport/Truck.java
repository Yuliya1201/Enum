package Transport;
import Transport.Weights;

public abstract class Truck extends Transport implements Competing {
    private Weights weights;
    public Truck (String brend,String model,Integer engineVolume,Weights weights) {
        super(brend, model, engineVolume);
        this.weights = weights;
    }
 public void printType() {
        if (weights == null) {
            System.out.println("Данных для авто недостаточно");
        } else {
            System.out.println(weights);
        }
    }

    @Override
    public void getMaxSpeed() {

    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getPitStop() {

    }

    public void startMove() {
        System.out.println("Грузовик поехал");
    }
    public void stopMove() {
        System.out.println("Грузовик остановился");
    }
    public void pitStop() {
        System.out.println("Пит стоп для грузовика");
    }
    public void theBestTime() {
        System.out.println("Лучшее время круга грузовика");
    }
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика");
    }
}