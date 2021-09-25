package se.systementor;

public class Lab5 {
    public void Execute(){
        System.out.println("Ange tal 1:");
        int tal1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ange tal 2:");
        int tal2 = Integer.parseInt(System.console().readLine());

        int resultat1 = (int)  Math.pow(tal1,tal2);
        System.out.printf("%d raised to %d is %d\n",
            tal1, 
            tal2, 
            resultat1);    
        
        int resultat2 = tal1 * tal2;
        System.out.printf("%d times %d is %d\n",
            tal1, 
            tal2, 
            resultat2);

        int resultat3 = tal1 / tal2;
        System.out.printf("%d divided %d is %d\n",
            tal1, 
            tal2, 
            resultat3);
        
            float fresultat3 = (float)tal1 / (float)tal2;
            System.out.printf("%d divided %d is %f\n",
                tal1,
                tal2, 
                fresultat3);

            int resultat4 = tal1 + tal2;
            System.out.printf("%d plus %d is %d\n",
                tal1,
                tal2, 
                resultat4);
            int resultat5 = tal1 - tal2;
            System.out.printf("%d minus %d is %d\n",
                tal1,
                tal2, 
                resultat5);

            int resultat6 = tal1 / tal2;
            System.out.printf("%d heltalsdiv %d is %d\n",
                tal1,
                tal2, 
                resultat6);
            int resultat7 = tal1 % tal2;
            System.out.printf("%d reminder %d is %d\n",
                tal1,
                tal2, 
                resultat7);
                        

        }
}
