import java.util.Scanner;
public class LeJustePrix{
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        lireEntier(12,8);
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
}