package kg.megacom.interface2.model;

import kg.megacom.interface2.service.Angel;

public class Rescuer implements Angel {

    @Override
    public void saveLife() {
        System.out.println("I am saving lives");
    }

    @Override
    public void inspire() {
        System.out.println("You'll safe!");
    }

    @Override
    public void cure() {
        System.out.println("Curing");
    }
}
