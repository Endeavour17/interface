package kg.megacom.interface2.model;

import kg.megacom.interface2.service.Angel;

public class Batman implements Angel {

    @Override
    public void saveLife() {
        System.out.println("I am kg.megacom.interface2.model.Batman");
    }

    @Override
    public void inspire() {
        System.out.println("I am kg.megacom.interface2.model.Batman");
    }

    @Override
    public void cure() {
        System.out.println("I am kg.megacom.interface2.model.Batman");
    }

    @Override
    public void serve() {
        System.out.println("I am kg.megacom.interface2.model.Batman");
    }
}
