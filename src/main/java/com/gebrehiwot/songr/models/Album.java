    package com.gebrehiwot.songr.models;

    import javax.persistence.*;
    import java.util.List;

    @Entity
    public class Album {



<<<<<<< HEAD
        @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> c87a8839fb13643e0213e5bdee76662320561eaa

        long id;
        String title;
        String artist;
        int songCount;
        double length;
        String imageUrl;
        @OneToMany(fetch = FetchType.EAGER, mappedBy = "album")
        List<Song>songs;

        public List<Song> getSongs() {
            return songs;
        }

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



<<<<<<< HEAD
    }
=======
}
>>>>>>> c87a8839fb13643e0213e5bdee76662320561eaa
