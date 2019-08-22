package com.gebrehiwot.songr.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    @OneToMany(mappedBy = "album")
    List<Song> songs;

    String title;
    String artist;
    short songCount;
    long length;
    String imageUrl;




    public Album(){}
    public Album (String title, String artist, short songCount, long length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }


//Getters
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public long getLength() {
        return length;
    }

    public short getSongCount() {
        return songCount;
    }

    public long getId() {
        return id;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(short songCount) {
        this.songCount = songCount;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
