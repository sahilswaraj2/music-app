/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

import java.util.ArrayList;

/**
 *
 * @author sahil
 */
public class Album {
    private String name;
    private String artist;
    
    private ArrayList<Song> songs;

    public Album(String name, String artist, ArrayList<Song> songs) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album() {
    }
    
    
}
