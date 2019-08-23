//package com.gebrehiwot.songr.models;
//import javax.persistence.*;
//
//
//@Entity
//public class Song {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    long id;
//
//    String title;
//    long length;
//    short trackNumber;
//
//    @ManyToOne
//    Album album;
//
//    public Song() {
//
//    }
//
//    public Song(String title, long length, short trackNumber, Album album) {
//        this.title = title;
//        this.length = length;
//        this.trackNumber = trackNumber;
//        this.album = album;
//    }
//
//
//
//    //Getters
//    public long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public int getTrackNumber() {
//        return trackNumber;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    //setters
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setLength(long length) {
//        this.length = length;
//    }
//
//    public void setTrackNumber(short trackNumber) {
//        this.trackNumber = trackNumber;
//    }
//
////    public void setAlbum(Album album) {
////        this.album = album;
////    }
//}
