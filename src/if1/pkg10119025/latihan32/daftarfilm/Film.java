/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan32.daftarfilm;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Daftar Film
 */
class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println("Judul Film : " .concat(filmName));
        System.out.println("Genre Film : " .concat(filmGenre));
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + "Menit\n");
    }

    
    public static void main(String[] args) {
       System.out.println("====Daftar Film Sedang Tayang====\n");
       Film film = new Film();
       film.filmName     = "Venom";
       film.filmGenre    = "Action, Horror, Scifi";
       film.filmRating   = 8.5;
       film.filmDuration = 120;
       film.nowPlaying();
       
       Film film1 = new Film();
       film.filmName     = "Small Foot";
       film.filmGenre    = "Animation";
       film.filmRating   = 9.0;
       film.filmDuration = 96;
       film.nowPlaying();
       
       Film film2 = new Film();
       film.filmName     = "Crazy Rich Asian";
       film.filmGenre    = "Comedy";
       film.filmRating   = 7.8;
       film.filmDuration = 119;
       film.nowPlaying();
       
       Film film3 = new Film();
       film.filmName     = "Asih";
       film.filmGenre    = "Horror";
       film.filmRating   = 6.0;
       film.filmDuration = 100;
       film.nowPlaying();
       
    }
    
}
