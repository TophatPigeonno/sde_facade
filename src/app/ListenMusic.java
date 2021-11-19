package app;

public class ListenMusic {
    Boolean listeningMusic;

    public ListenMusic() {
        listeningMusic = false;
    }

    public void listen(TheaterLights lights, Amplifier amp, CdPlayer cd, String cdName) {
        this.listeningMusic = true;

        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play(cdName);
    }

    public void stopListening(Amplifier amp, CdPlayer cd) {
        this.listeningMusic = false;

        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }
}
