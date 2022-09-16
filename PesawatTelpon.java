public class PesawatTelpon {
    String speaker, microphone, keypad;

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setMicrophone(String microphone) {
        this.microphone = microphone;
    }

    public void setKeypad(String keypad) {
        this.keypad = keypad;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getMicrophone() {
        return microphone;
    }

    public String getKeypad() {
        return keypad;
    }

    void menelpon(String b) {
        System.out.println("tekan keypad untuk menelpon");
    }
}