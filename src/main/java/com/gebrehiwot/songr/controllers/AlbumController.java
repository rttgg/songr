package com.gebrehiwot.songr.controllers;

import com.gebrehiwot.songr.models.Album;
import com.gebrehiwot.songr.models.AlbumRepository;
import com.gebrehiwot.songr.models.Song;
import com.gebrehiwot.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

//    @Autowired
//    SongRepository songRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model a){
        Iterable<Album> albums = albumRepository.findAll();
//        List<Album> albums = albumRepository.findAll();
        a.addAttribute("albums", albums);
        return "albums";
    }

    @PostMapping("/albums")
    //public RedirectView addAlbum(String title, String artist, int songCount, double length, String imageUrl){
        public String albumSubmit(@ModelAttribute Album addAlbum) {
            albumRepository.save(addAlbum);
            return "redirect:/albums";
        }

}
