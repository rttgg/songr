package com.gebrehiwot.songr.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {



    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    String title;
    String artist;
    int songCount;
    double length;
    String imageUrl;

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getLength() {
        return length;
    }

    public int getSongCount() {
        return songCount;
    }

    public long getId() {
        return id;
    }

    public Album(){}
    public Album (String title, String artist, int songCount, double length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }



}
