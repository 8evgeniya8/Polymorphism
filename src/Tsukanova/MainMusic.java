package Tsukanova;

public class MainMusic {
    public static void main(String[]args){

        MusicStyles[] musicArrays = {new PopMusic("xvdfsvsd"),
                new ClassicMusic("dd"),new RockMusic("Bon Jovi")};

        for (MusicStyles music:
             musicArrays) {
            music.playMusic();
        }
    }
}
