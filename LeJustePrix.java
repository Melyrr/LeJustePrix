import java.util.Scanner;
import java.util.Random;
public class LeJustePrix{
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        //lireEntier(12,8);
        générerEntierAléatBorné(4,10);
    }
    public static int lireEntier(int min, int max ) {
        Scanner clavier = new Scanner(System.in);
        if (min > max) {
           int a = min;
           min = max;
           max = a;
            System.out.println("Le minimum était grand que le maximum donc j'ai inversé les 2 valeurs. \nVoici maintenant le min : "+min+" "+"et le max : "+max);    
        }
        System.out.println("Veuillez entrez un nombre borné : ");
        int entier = clavier.nextInt() ;
        while (entier < min || entier > max) {
            System.out.println("L'entier n'est pas compris entre " + min + " et " + max);
            entier = clavier.nextInt() ;
        }
        return entier;
    }
    public static int générerEntierAléatBorné(int min, int max){
        if (min > max) {
            throw new IllegalArgumentException("Le minimum est plus grand que le maximum :" + min + " " + max);
        }
        Random nb = new Random();
        int nombreAleatoire = nb.nextInt(max - min + 1) + min;
        System.out.println(nombreAleatoire);
        return max;
    }

}