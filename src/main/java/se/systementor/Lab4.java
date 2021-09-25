package se.systementor;

public class Lab4 {
    public void Execute(){
        System.out.println("Ange temperatur i Fahrenheit:");
        float f = Float.parseFloat(System.console().readLine());
        float c = (f - 32f) / 1.8f;
        System.out.println(f + " grader Fahrenheit motsvarar " + c + " grader Celsius");
    }    
}
