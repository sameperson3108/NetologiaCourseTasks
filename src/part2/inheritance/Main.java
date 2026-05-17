package part2.inheritance;

public class Main {
    static void main() {

        Instrument[] instruments = {
                new Guitar(),
                new Piano(),
                new Flute(),
                new Guitar()
        };

        boolean[][] shouldPlay = {
                {false, true, true, true, true, false},
                {true, false, true, false, true, false},
                {false, false, true, true, false, false},
                {false, true, true, true, true, false}
        };

        Song song = new Song(instruments, shouldPlay);
        song.play();

    }
}
