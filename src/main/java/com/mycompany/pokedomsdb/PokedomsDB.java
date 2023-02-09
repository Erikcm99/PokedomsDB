/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedomsdb;

/**
 *
 * @author Erik
 */
public class PokedomsDB {

    private Pokedom[] listaPokedoms = new Pokedom[100];
    private int huecoLibre;

    public Pokedom[] getListaPokedoms() {
        return listaPokedoms;
    }

    public Pokedom describe(String nombre) {
        Pokedom p = null;
        for (int i = 0; i < listaPokedoms.length; i++) {
            if (listaPokedoms[i].getNombre().equalsIgnoreCase(nombre)) {
                p = listaPokedoms[i];
                return p;
            }
        }
        return p;
    }
    public void addPokedom(Pokedom pokedom){
        listaPokedoms[huecoLibre] = pokedom;
    }
}

    


