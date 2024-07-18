package abstactex.quiz;

public class Quiz1 {
    public static void main(String[] args) {
       Abante abante = new Abante();
       Sonata sonata = new Sonata();

       abante.run();
       abante.start();
       abante.run();
       abante.turnoff();

       sonata.run();
       sonata.stop();
       sonata.start();
       sonata.turnoff();

    }
}

abstract class Car{
    public void run(){
        System.out.println("자동차가 달립니다.");
    };
    abstract void start();
    abstract void stop();
    abstract  void turnoff();
}

class Abante extends Car{

    @Override
    public void run() {
        System.out.println("Abante 버스가 달립니다.");
    }

    @Override
    void start() {
        System.out.println("Abante 시동을 켭니다.");
    }

    @Override
    void stop() {
        System.out.println("Abante 멈춥니다.");
    }

    @Override
    void turnoff() {
        System.out.println("Abante 시동을 끕니다.");
    }
}

class Sonata extends Car{

    @Override
    public void run() {
        System.out.println("Sonata 달립니다.");
    }

    @Override
    void start() {
        System.out.println("Sonata 시동을 켭니다.");
    }

    @Override
    void stop() {
        System.out.println("Sonata 멈춥니다.");
    }

    @Override
    void turnoff() {
        System.out.println("Sonata 시동을 끕니다.");
    }
}

class Avante extends Car{

    @Override
    public void run() {
        System.out.println("Avante 달립니다.");
    }

    @Override
    void start() {
        System.out.println("Avante 시동을 켭니다.");
    }

    @Override
    void stop() {
        System.out.println("Avante 멈춥니다.");
    }

    @Override
    void turnoff() {
        System.out.println("Avante 시동을 끕니다.");
    }
}