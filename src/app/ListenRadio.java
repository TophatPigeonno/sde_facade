package app;

public class ListenRadio {
    Boolean listeningRadio;

    public ListenRadio() {
        listeningRadio = false;
    }

    public void listen(Tuner tuner, Amplifier amp, double frequency) {
        this.listeningRadio = true;

        tuner.on();
        tuner.setFrequency(frequency);

        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void stopListening(Tuner tuner, Amplifier amp) {
        this.listeningRadio = false;

        tuner.off();
        amp.off();
    }
}
