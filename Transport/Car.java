package Transport;
import Transport.VidKuzova;
import Transport.Competing;

public abstract class Car extends Transport implements Competing {
    private VidKuzova vidKuzova;

    public Car (String brend,String model,Integer engineVolume,VidKuzova vidKuzova) {
        super(brend,model,engineVolume);
        this.vidKuzova = vidKuzova;
    }

    public VidKuzova getVidKuzova() {

        return vidKuzova;
    }

    public void setVidKuzova(VidKuzova vidKuzova) {

        this.vidKuzova = vidKuzova;
    }

    public void startMove() {

        System.out.println("Легковая машина поехала");
    }
    public void stopMove() {

        System.out.println("Легковая машина остановилась");

    }
    public void theBestTime() {

        System.out.println("Лучшее время круга для легкового автомобиля");
    }
    public void maxSpeed() {
        System.out.println("Максимальная скорость легковой машины");
    }
    public void printType() {
        if (vidKuzova == null) {
            System.out.println("Данных для авто недостаточно");
        } else {
            System.out.println(vidKuzova);
        }

    }

    @Override
    public void getPitStop() {

    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getMaxSpeed() {

    }
}
