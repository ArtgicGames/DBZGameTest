/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import javaapp.Characters.Goku;
import javaapp.Characters.Vegeta;

public class JavaApp {

    public static void main(String[] args) {
        Goku G = new Goku();
        Vegeta V = new Vegeta();

        Arena world = new Arena(G, V);
        world.run(1000);
    }
}
