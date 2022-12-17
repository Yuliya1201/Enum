import Transport.Bus;
import Transport.Truck;
import Transport.Car;
import Transport.DriverB;
import Transport.DriverC;
import Transport.DriverD;
import com.sun.jdi.connect.Transport;
import javacource.ValidateUtils.*;
import Transport.VidKuzova;
import Transport.Capacity;
import Transport.Weights;
import Transport.Competing;
import Transport.Driver;


public  class Main {
    public static void main(String[] args) {

        Bus ikarus = new Bus("Ikarus", "S-123", 123, 10, 160,
                24, 50);{
        System.out.println(ikarus);

        Bus daowo = new Bus("Daowo", "E-234", 130, 23, 180,
                23, 50);
        System.out.println(daowo);

        Bus suzuki = new Bus("Suzuki", "G-456", 170, 15, 150,
                16, 35);
        System.out.println(suzuki);

        Bus ford = new Bus("Ford", "d-123", 120, 12, 130,
                25, 45);
        System.out.println(ford);

        Car toyota = new Car("Toyota", "Rav4", 5, VidKuzova.COUPE){};
        System.out.println(VidKuzova.CROSSOVER);

        Car honda = new Car("Honda", "greta", 130, VidKuzova.COUPE){};
        System.out.println(VidKuzova.DJIP);

        Car volvo = new Car("Volvo", "S-312", 150, VidKuzova.DJIP) {
        };
        System.out.println(volvo);

        Car kia = new Car("Kia", "lastochka", 190, VidKuzova.CROSSOVER) {};


            Truck man = new Truck("Man", "Y-109", 120, Weights.N1) {
            };

            Truck kamaz = new Truck("Kamaz", "t=34", 130, Weights.N2) {
            };

            Truck reno = new Truck("Reno", "E-500", 120, Weights.N3) {
            };

            Truck haval = new Truck("Haval", "Fx7", 190, Weights.N3) {
            };


            DriverB<Car> driverCar = new DriverB<>("Воронов Виктор Валерьевич", true, 10);

            DriverC<Bus> driverTruck = new DriverC<>("Попоп Павел Петрович", true, 12);

            DriverD<Truck> driverBus = new DriverD<>("Орлов Николай Валерьевич", true, 6);
        };
        System.out.println(Capacity.EXTRA_SMOLL);
        System.out.println(Capacity.LARGE);
        System.out.println(Capacity.MEDIUM);
        System.out.println(Capacity.SMOLL);
        System.out.println(VidKuzova.DJIP);
        System.out.println(VidKuzova.COUPE);
        System.out.println(VidKuzova.CROSSOVER);
        System.out.println(VidKuzova.VAN);
        System.out.println(VidKuzova.HATCHBACK.name());
        System.out.println(Weights.N3.getFrom());
        System.out.println(Weights.N2.getFrom());
        System.out.println(Weights.N1.getFrom());
    }
}
