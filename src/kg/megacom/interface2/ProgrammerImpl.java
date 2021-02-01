package kg.megacom.interface2;

import kg.megacom.interface2.service.Angel;
import kg.megacom.interface2.service.Programmer;

public class ProgrammerImpl implements Programmer, Angel {
    @Override
    public void saveLife() {
        System.out.println("Creating 911 Telegram bot");
    }

    @Override
    public void inspire() {

    }

    @Override
    public void cure() {

    }

    @Override
    public void doMyAwesomeSite() {
        System.out.println("Creating wordpress sites");
    }
}
