/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.util.Random;

public class Moves {

    public static void punch(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(3) + 1;
        double power = A.str * 1.1;

        System.out.println(A.name + " used Punch -" + power);

        if (i == 1) {
            System.out.println(B.name + " Blocked Punch!");
        } else {
            B.Damage(power);
        }
    }

    public static void kick(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(3) + 1;
        double power = A.str * 1.3;

        System.out.println(A.name + " used Kick -" + power);

        if (i == 1) {
            System.out.println(B.name + " Blocked Kick!");
        } else {
            B.Damage(power);
            
        }
    }
    
    public static void Kamehameha(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(5) + 1;
        double power = A.str * 2.5;

        System.out.println(A.name + " used Kamehameha! -" + power);

        if (i == 1) {
            System.out.println(B.name + " Evaded Kamehameha!");
        } else {
            B.Damage(power);
        }
    }

    public static void GalickGun(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(5) + 1;
        double power = A.str * 2.5;

        System.out.println(A.name + " Galick Gun! -" + power);

        if (i == 1) {
            System.out.println(B.name + " Evaded GalickGun!");
        } else {
            B.Damage(power);
        }
    }
    
    public static void SpiritBomb(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(20) + 1;
        double power = A.str * 5;

        System.out.println(A.name + " used SpiritBomb! -" + power);

        if (i == 1) {
            System.out.println(B.name + " Evaded SpiritBomb!");
        } else if (i == 20) {
            System.out.println("Holy Fuck " + B.name + " Pushed Back The SpiritBomb!!!!");
            A.Damage(power);
        } else {
            B.Damage(power);
        }
    }

    public static void FinalFlash(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(10) + 1;
        double power = A.str * 4;

        System.out.println(A.name + " used FinalFlash! -" + power);

        if (i == 1) {
            System.out.println(B.name + " Evaded FinalFlash!");
        } else if (i == 10) {
            System.out.println(B.name + " Countered FinalFlash!!!");
            A.Damage(power);
        } else {
            B.Damage(power);
        }
    }

    public static void Heal(Entity A) {
        A.addLife(20);
    }

}
