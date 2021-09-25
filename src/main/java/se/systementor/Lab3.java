package se.systementor;

public class Lab3 {
    public void Execute()    {
        String forNamn, efterNamn;

        System.out.print("Skriv in ditt förnamn:");
        forNamn = System.console().readLine();
        System.out.print("Skriv in ditt efternamn:");
        efterNamn = System.console().readLine();

        System.out.println("Du heter:" +
            efterNamn + ", " + forNamn);


    }
    
}
