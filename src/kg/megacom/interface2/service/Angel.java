package kg.megacom.interface2.service;

public interface Angel {
    void saveLife();
    void inspire();
    void cure();
    default void serve() {
//        sing();
        System.out.println("I am serving!");
    }

    static void fly() {
        System.out.println("I am flying!");
    }

//    private void sing() {
//        System.out.println("I am singing inspiring song!");
//    }
}
