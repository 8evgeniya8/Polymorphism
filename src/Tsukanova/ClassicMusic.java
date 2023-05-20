package Tsukanova;

public class ClassicMusic extends MusicStyles{
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("ClassicMusic : "+" "+getName());
    }
}
