package kg.megacom.interface2;


import kg.megacom.interface2.model.Batman;
import kg.megacom.interface2.model.Rescuer;
import kg.megacom.interface2.model.SuperHero;
import kg.megacom.interface2.service.Angel;

public class Main {
    public static void main(String[] args) {

        Angel rescuer = new Rescuer();
        Angel batman = new Batman();
        Angel programmer = new ProgrammerImpl();

        batman.serve();
        programmer.serve();

        programmer.serve();

        Angel.fly();

        SuperHero superHero = new SuperHero(rescuer);
        SuperHero superHero2 = new SuperHero(batman);
        SuperHero superHero3 = new SuperHero(programmer);
    }
}
