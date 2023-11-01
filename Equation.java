/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author jtcho
 */
public class Equation {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double a, b, c, x1, x2, Re, Im, Z1, Z2, delta;  
        System.out.println("Resolution des equations du second degre (sous la forme aX^2+bX+C=0).  ");
        System.out.println("Veuillez entrer a: ");
        a = sc1.nextDouble();
        System.out.println("Veuillez entrer b: ");
        b = sc1.nextDouble();
        System.out.println("Veuillez entrer c: ");
        c = sc1.nextDouble();

        delta = (b * b)- (4 * a * c);
        x1= (-b + Math.sqrt(delta))/(2 *a) ;
        x2= (-b -Math.sqrt(delta))/(2*a);
        if (delta > 0)
            System.out.println( "Cette equation admet 02 solutions distinctes: S = {"+x1+" ; "+x2+"}" );
        else if(delta == 0)
             System.out.println("Cette equation admet une solution double x0=" +x1 );
        else 
                System.out.println("Cette equation n'admet aucune solution reelle." );
        Re = -b / (2*a);
        Im = Math.sqrt(-delta) / (2*a);

                System.out.println("Cette equation admet 02 solutions complexes: S= { Z1= "+Re+"+i"+Im+"; Z2= "+Re+"-i"+Im+" }");


    }

}


