/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pokedomsdb;

/**
 *
 * @author Erik
 */
public class MainPokedomsDB {

    public static void main(String[] args) {
        String nombres[] = new String[]{
            "Kandentium", "Demantima", "Eufrotructon", "Jokisuba"
        };
        String familias[] = new String[]{
            "fuego", "tierra", "aire", "agua"
        };
        float ataques[] = new float[]{
            7.4f, 7.5f, 0.6f, 7f
        };
        float defensas[] = new float[]{
            2.6f, 2.5f, 9.4f, 3f
        };
        PokedomsDB baseDatos = new PokedomsDB();
        
        for (int i = 0; i < 4; i++) {
            Pokedom p = new Pokedom(nombres[i], familias[i], ataques[i], defensas[i]);
            baseDatos.addPokedom(p);
        }

        if (args.length == 1) {
            Pokedom seleccion = baseDatos.describe(args[0]);
            if (seleccion != null) {
                System.out.println("Datos del pokedom");
                System.out.println("Nombre: " + seleccion.getNombre());
                System.out.println("Familia: " + seleccion.getFamilia());
                System.out.println("Ataque: " + seleccion.getAtaque());
                System.out.println("Defensa: " + seleccion.getDefensa());
            } else {
                System.out.println("El pokedom introducido no existe");
            }

        } else {
            System.out.println("Debes introducir el nombre de un pokedom");
        }
    }

}
