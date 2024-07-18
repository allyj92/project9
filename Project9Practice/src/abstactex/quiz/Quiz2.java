package abstactex.quiz;

public class Quiz2 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        AutoCar autoCar = new AutoCar();

        bus.run();
        bus.refuel();
        bus.takePassenger();

        System.out.println();

        autoCar.run();
        autoCar.refuel();
        autoCar.load();
    }
}

abstract class Car1{
    public void run(){
        System.out.println("자동차가 달립니다.");
    };
    public abstract void refuel();
}


class Bus extends Car1{
    public void run(){
        System.out.println("버스가 달립니다.");
    }

    @Override
    public void refuel() {
        System.out.println("천연가스를 충전 합니다.");
    }

    public void takePassenger(){
        System.out.println("승객을 버스에 태웁니다.");
    }
}

class AutoCar extends Car1{

    @Override
    public void refuel() {
        System.out.println("휘발유를 주유합니다.");
    }

    public void load(){
        System.out.println("짐을 싣습니다.");
    }
}


