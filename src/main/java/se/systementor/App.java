package se.systementor;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Lab5 lab5 = new Lab5();
        lab5.Execute();

        Lab4 lab4 = new Lab4();
        lab4.Execute();

        Lab3 lab3 = new Lab3();
        lab3.Execute();

        Lab2 lab2 = new Lab2();
        lab2.Execute();

        Lab1 lab1 = new Lab1();
        lab1.Execute();
    }
}
