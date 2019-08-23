package com.gebrehiwot.songr.controllers;

import com.gebrehiwot.songr.models.Album;
import com.gebrehiwot.songr.models.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model a){
        //to get one album
//        Album theAlbum = new Album("Indigo","Chris Brown", 33,62.02,"https://genius.com/albums/Chris-brown/Indigo");
//        // get another album
//        Album secondAlbum = new Album("Michael Jackson Scream", "Michael Jackson", 14, 69.25, "https://en.wikipedia.org/wiki/Scream_(Michael_Jackson_album)");
//        Album[] albums = new Album[]{theAlbum, secondAlbum};

        List<Album> albums = albumRepository.findAll();
        a.addAttribute("albums", albums);
        return "allAlbums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songCount, double length, String imageUrl){
        Album a = new Album(title, artist, songCount,length,imageUrl);
        albumRepository.save(a);
        return new RedirectView("/albums");
    }//(null, Chris , null, 21, 12, Indigo).
}