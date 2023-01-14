import enums.BodyTypeOfCar;
import enums.CapacityOfBus;
import enums.DriverLicense;
import enums.TonnageOfTruck;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import transport.PassengerCar;
import transport.Truck;
import transport.Bus;
import java.util.*;


public class Main {
    public static void main(String[] args) {


        Map<String, String> automech = new HashMap<>();
        automech.putIfAbsent("audi", "ivan");
        automech.putIfAbsent("bmw", "micha");
        automech.putIfAbsent("lada", "micha");

        Map<String, String> mechauto = new HashMap<>();
        mechauto.putIfAbsent("ivan", "audi");
        mechauto.putIfAbsent("sergey", "lada");
        mechauto.putIfAbsent("micha", "bmw");

/*
        ArrayList<String> mech = new ArrayList<>();
        mech.add("ivan");
        mech.add("sergey");
        mech.add("micha");
        ArrayList<String> auto = new ArrayList<>();
        auto.add("audi");
        auto.add("bmw");
        auto.add("lada");
        ArrayList<String> driv = new ArrayList<>();
        driv.add("bob");
        driv.add("bim");
        driv.add("richy");


        for (int i=0; i< auto.size(); i++){
            System.out.println("авто--" + auto.get(i)+":");
            System.out.println("водитель--" + driv.get(i)+":");
            System.out.println("механик--" + mech.get(i)+":");
            System.out.println("---------------");
        }

        PassengerCar bmw = new PassengerCar("BMW", "X6", 2.9);
        PassengerCar audi = new PassengerCar("Audi", "Q5", 3.2);
        PassengerCar hyundai = new PassengerCar("Hyundai", "Sonata", 1.6);
        PassengerCar honda = new PassengerCar("Honda", "Civic", 1.5);

        Truck man = new Truck("MAN", "TGS 6x6", 6.5);
        Truck foton = new Truck("Foton", "Auman", 6.4);
        Truck kamaz = new Truck("Камаз", "65801", 5.9);
        Truck faw = new Truck("FAW", "J5", 5.5);

        Bus volvo = new Bus("Volvo", "FL7", 4.2);
        Bus liaz = new Bus("ЛиАЗ", "5256", 2.5);
        Bus paz = new Bus("ПАЗ", "\"Вектор Next\"", 3.2);
        Bus scania = new Bus("Scania", "Irizar i6", 3.5);

        System.out.println(bmw);
        System.out.println(foton);
        System.out.println(paz);

        man.startMovement();
        scania.endMovement();

        audi.pitStop();
        kamaz.bestLapTime();
        volvo.maxSpeed();

        DriverB oleg = new DriverB("Семенов Олег Игоревич", true, 7);
        DriverC igor = new DriverC("Петров Игорь Михайлович", true, 12);
        DriverD leha = new DriverD("Крутов Алексей Дмитриевич", false, 14);

        System.out.println(oleg);

        honda.setDriverB(oleg);
        faw.setDriverC(igor);
        liaz.setDriverD(leha);

        honda.info();
        faw.info();
        liaz.info();

        hyundai.setBodyTypeOfCar(BodyTypeOfCar.MINIVAN);
        kamaz.setTonnageOfTruck(TonnageOfTruck.N2);
        paz.setCapacityOfBus(CapacityOfBus.MEDIUM);

        hyundai.printType();
        kamaz.printType();
        paz.printType();

        bmw.passDiagnostics();
        man.passDiagnostics();
        liaz.passDiagnostics();

        oleg.setDriverLicense(DriverLicense.C);
        igor.setDriverLicense(DriverLicense.D);
        leha.setDriverLicense(DriverLicense.B);

        honda.checkDriverLicense();
        faw.checkDriverLicense();
        liaz.checkDriverLicense();

 */
    }
}
