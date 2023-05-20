package Tsukanova;
//Зробіть клас MusicStyles, який міститиме метод playMusic()
// Зробіть його спадкоємців: PopMusic, RockMusic і ClassicMusic.
// Спадкоємці повинні реалізовувати метод playMusic().
// У мейн-класі створіть музичні гурти для кожного стилю
// За допомогою методу for each викличте у всіх
// спадкоємців MusicStyles метод playMusic()
abstract class MusicStyles {
    private String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void playMusic();
}
