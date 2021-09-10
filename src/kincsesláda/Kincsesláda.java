/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kincsesláda;

/**
 *
 * @author hallgato
 */
import java.util.Scanner;

public class Kincsesláda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        indít();

    }

    private static void indít() {
        System.out.println("A játék során ki kell találnod melyik kincs rejti a kincset, de vigyázz, mert csak 1 láda mond igazat!\n");
        Ládák láda1 = new Ládák("Arany", "Én rejtem a kincset.", false, false);
        Ládák láda2 = new Ládák("Ezüst", "Nem én rejtem a kincset.", true, false);
        Ládák láda3 = new Ládák("Bronz", "Az arany láda hazudik.", false, true);
        
        System.out.println(láda1.toString());
        System.out.println(láda2.toString());
        System.out.println(láda3.toString());
        
        System.out.println("Add meg, melyik ládában van a kincs!(1-3)");
        
        Scanner sc = new Scanner(System.in);
        int valasztas;
        valasztas = sc.nextInt();
        while (valasztas > 3 || valasztas < 1) {
            System.out.println("Add újra");
            valasztas = sc.nextInt();
        }
        
        if ((valasztas == 1 && láda1.isEbben()) || (valasztas == 2 && láda2.isEbben()) || (valasztas == 3 && láda3.isEbben())) {
            System.out.println("Sikerült, eltaláltad");
        } else {
            System.out.println("Nem sikerült");
        }
    }
}
