import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class LeJustePrix{
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        //lireEntier(12,8);
        //générerEntierAléatBorné(0,13);
        //inscrireCandidats();
        //choisirCandidat(inscrireCandidats());
        formerPupitre(inscrireCandidats());
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
        int nombreAleatoire = nb.nextInt(13);
        System.out.println();
        System.out.println("fils prodige :"+nombreAleatoire);
        return max;
    }
    public static String[] inscrireCandidats(){
        String[] panel = new String[]{"J01","J02","J03","J04","J05",
        "J06","J07","J08","J09","J10","J11","J12","J13","J14"};
        System.out.println();
        return panel;
    }
    
    public static String choisirCandidat(String[] panel){
        Scanner clavier = new Scanner(System.in);
        Random nb = new Random();
        System.out.println("Combien d'entier voulez vous générer");
        int zero=0;
        for(int i=clavier.nextInt();zero<i;zero++){
            int CandidatRandom = nb.nextInt(13);
            if(panel[CandidatRandom] == "null"){
                CandidatRandom = nb.nextInt(13);
                panel[CandidatRandom] = "nulos";
            }else{
                panel[CandidatRandom] = "null";
            }
        }
        System.out.println(Arrays.toString(panel));
        return null;}
    public static  String[]  formerPupitre(String[] panel){
        String[] pupitre = new String[]{"null","null","null","null"};
        choisirCandidat(panel);
        int n =0;
        for(int i=0;i<panel.length;i++){
            if(panel[i] == "null" || panel[i] == "nulos" ){
                int zecandidat = i;
                pupitre[n] = Integer.toString(zecandidat);
                System.out.println(i);
                n=n+1;
            }}
    System.out.println(Arrays.toString(pupitre));
        return pupitre;
    }}