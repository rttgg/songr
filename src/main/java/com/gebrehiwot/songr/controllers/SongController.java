    package com.gebrehiwot.songr.controllers;


    import com.gebrehiwot.songr.models.Album;
    import com.gebrehiwot.songr.models.AlbumRepository;
    import com.gebrehiwot.songr.models.Song;
    import com.gebrehiwot.songr.models.SongRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.servlet.view.RedirectView;


    import java.util.List;

    @Controller
    public class SongController {
        @Autowired
        SongRepository songRepository;

        @Autowired
        AlbumRepository albumRepository;

        @GetMapping("/songs")
        public String getAllSongs(Model m){
            List<Song> songs = songRepository.findAll();
            m.addAttribute("songs", songs);
            return "allSongs";

        }


        @PostMapping("/albums/{id}/songs")
        public RedirectView addingSongs(String title, long length, long trackNumber, @PathVariable long id){
            Album a = albumRepository.findById(id).get();
            Song s = new Song(title, length, trackNumber, a);
                    songRepository.save(s);
                    return new RedirectView("/albums/" + id);
        }

    }
