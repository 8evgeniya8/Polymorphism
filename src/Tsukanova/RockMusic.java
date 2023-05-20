package Tsukanova;

public class RockMusic extends MusicStyles{
    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("RockMusic : "+" "+getName());
    }
}
