package se.systementor;

public class Lab6 {
    public void Execute(){
        System.out.println("Ange tal 1:");
        float tal1 = Float.parseFloat(System.console().readLine());
        System.out.println("Ange tal 2:");
        float tal2 = Float.parseFloat(System.console().readLine());

        float resultat1 = (float)  Math.pow(tal1,tal2);
        System.out.printf("%f raised to %f is %f\n",
            tal1, 
            tal2, 
            resultat1);    
        
        float resultat2 = tal1 * tal2;
        System.out.printf("%f times %f is %f\n",
            tal1, 
            tal2, 
            resultat2);

        float resultat3 = tal1 / tal2;
        System.out.printf("%f divided %f is %f\n",
            tal1, 
            tal2, 
            resultat3);
        

        float resultat4 = tal1 + tal2;
        System.out.printf("%f plus %f is %f\n",
            tal1,
            tal2, 
            resultat4);
        
        float resultat5 = tal1 - tal2;
        System.out.printf("%f minus %f is %f\n",
                tal1,
                tal2, 
                resultat5);

        float resultat6 = tal1 / tal2;
        System.out.printf("%f / %f is %f\n",
                tal1,
                tal2, 
                resultat6);
        
        float resultat7 = tal1 % tal2;
        System.out.printf("%f remainder %f is %f\n",
                tal1,
                tal2, 
                resultat7);
                        

        }
 
}
