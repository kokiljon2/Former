/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arv.former;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author khaok01
 */
public class ArvFormer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Form> Former = new ArrayList<>();
        int val = 5;
        do { //Så att allting körs i en loop tills man inte stoppar den
            System.out.println("1. Skriv ut listan"); //Så att den skriver ut - 1. Skriv ut listan
            System.out.println("2. Rektangel"); //Så att den skriver ut - 2. Rektangel
            System.out.println("3. Triangel"); //Så att den skriver ut - 3. Triangel
            System.out.println("4. Cirkel"); //Så att den skriver ut - 4. Cirkel
            System.out.println("0. För att avsluta"); //Så att den skriver ut - 0. För att avsluta
            System.out.print("Val: "); //Så att den skriver ut - Val:
            try {
                val = scan.nextInt(); //Så att variabeln val får det värdet man skriver in
                System.out.println(); //En tom rad
                scan.nextLine(); //Så att man kan mata in informnation senare
                switch (val) {
                    case 1 -> {
                        skrivUt(Former);
                    }
                    case 2 -> {
                        System.out.print("Ange x-kordinaten: ");
                        int xR = scan.nextInt();
                        System.out.print("Ange y-kordinaten: ");
                        int yR = scan.nextInt();
                        System.out.print("Ange bas: ");
                        int bR = scan.nextInt();
                        System.out.print("Ange höjden: ");
                        int hR = scan.nextInt();
                        Form r = new Rektangel(xR, yR, bR, hR, true);
                        Former.add(r);
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.print("Ange x-kordinaten: ");
                        int xT = scan.nextInt();
                        System.out.print("Ange y-kordinaten: ");
                        int yT = scan.nextInt();
                        System.out.print("Ange bas: ");
                        int bT = scan.nextInt();
                        System.out.print("Ange höjden: ");
                        int hT = scan.nextInt();
                        Form t = new Triangel(xT, yT, bT, hT, true);
                        Former.add(t);
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.print("Ange x-kordinaten: ");
                        int xC = scan.nextInt();
                        System.out.print("Ange y-kordinaten: ");
                        int yC = scan.nextInt();
                        System.out.print("Ange radie: ");
                        int rC = scan.nextInt();
                        Form c = new Cirkel(xC, yC, rC, true);
                        Former.add(c);
                        System.out.println();
                    }
                    default -> {
                        if (val != 1 && val != 2 && val != 3 && val != 4 && val != 0) {
                            System.out.println("Det finns ingen val " + val);
                            System.out.println();
                        } else {
                            System.out.println("Programmet avslutad");
                        }
                    }
                }
            } catch (InputMismatchException ime) {
                System.out.println("Endast siffror ");
                scan.nextLine();
                System.out.println();
            }
        } while (val != 0); //Avslutar loopen när man väljer valet 0

    }

    public static void skrivUt(ArrayList<Form> Former) {
        if (Former.isEmpty()) {
            System.out.println("Listan är tom");
            System.out.println();
        } else {
            for (int i = 0; i < Former.size(); i++) {
                System.out.println(Former.get(i).whatAmI() + "\n area: " + Former.get(i).getArea());
                System.out.println();
            }
        }
    }
}
