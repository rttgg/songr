//package com.gebrehiwot.songr.controllers;
//
//
//import com.gebrehiwot.songr.models.Album;
//import com.gebrehiwot.songr.models.AlbumRepository;
//import com.gebrehiwot.songr.models.Song;
//import com.gebrehiwot.songr.models.SongRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class SongController {
//
//
//    @Autowired
//    SongRepository songRepository;
//
//    @Autowired
//    AlbumRepository albumRepository;
//
//    @GetMapping("/albums/{id}")
//    public String getAlbumSong(@PathVariable long id, Model a){
//        Song s = songRepository.findById(id).get();
//        a.addAttribute("album", s);
//        a.addAttribute("addSong", new Song());
////        System.out.println(s.getAlbum().size());
////        s.addAttribute("song", s);
//        return "songs";
//    }
//
//    @PostMapping("/albums/{id}")
//    public String songSubmit(@RequestParam String title, @RequestParam long length, short trackNumber, @PathVariable long id){
//        //Album a = AlbumRepository.findById(id).get();
//        //Song newSong = new Song(title, length, trackNumber, a);
//        //songRepository.save(newSong);
//        return "redirect:/albums/{id}";
//
//    }
//
//
//}
