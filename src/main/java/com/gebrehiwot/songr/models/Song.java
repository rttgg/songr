<<<<<<< HEAD
    package com.gebrehiwot.songr.models;
=======

package com.gebrehiwot.songr.models;
>>>>>>> c87a8839fb13643e0213e5bdee76662320561eaa


    import javax.persistence.*;

    @Entity
    public class Song {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)


        long id;
        String title;
        long length;
        long trackNumber;

        @ManyToOne
        Album album;


        public Song(){}
        public Song (String title, long length, long trackNumber, Album album){
            this.title = title;
            this.length = length;
            this.trackNumber = trackNumber;
            this.album = album;
        }

        public String getTitle() {
            return title;
        }

        public long getLength() {
            return length;
        }

        public long getTrackNumber() {
            return trackNumber;
        }

        public Album getAlbum() {
            return album;
        }
    }
<<<<<<< HEAD
=======
}

>>>>>>> c87a8839fb13643e0213e5bdee76662320561eaa
