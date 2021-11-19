package app;

public class WatchMovie {
    Boolean watching;

    public WatchMovie() {
        watching = false;
    }

    public void watch(PopcornPopper popper, TheaterLights lights, Screen screen, Projector projector, Amplifier amp, DvdPlayer dvd, String dvdName) {
        this.watching = true;

        popper.on();
        popper.pop();
        lights.dim(20);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(dvdName);
    }

    public void stopWatching(PopcornPopper popper, TheaterLights lights, Screen screen, Projector projector, Amplifier amp, DvdPlayer dvd) {
        this.watching = false;

        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
