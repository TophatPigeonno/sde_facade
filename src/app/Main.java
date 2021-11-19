package app;

public class Main {

    public static void main(String[] args) {
        // the desired radio frequency
        double frequency = 4.20;
        // the desired CD
        String cdName = "Ellen Shae - Clouds";
        // the desired DVD
        String dvdName = "Shrek";

        // all instances of equipment
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        // instance of facade for radio use
        ListenRadio listenRadio = new ListenRadio();
        // instance of facade for movie use
        WatchMovie watchMovie = new WatchMovie();
        // instance of facade for music use
        ListenMusic listenMusic = new ListenMusic();

        // listen to radio
        listenRadio.listen(tuner, amp, frequency);
        // stop listening to radio
        listenRadio.stopListen(tuner, amp);

        // watch movie
        watchMovie.watch(popper, lights, screen, projector, amp, dvd, dvdName);
        // stop watching movie
        watchMovie.stopWatching(popper, lights, screen, projector, amp, dvd);

        // listen music
        listenMusic.listen(lights, amp, cd, cdName);
        // stop listening to music
        listenMusic.stopListening(amp, cd);
    }
}
