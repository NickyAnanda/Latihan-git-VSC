public class Kucing {
    String bulu, mata, mulut, telinga, kaki, ekor;

    public void setBulu(String bulu) {
        this.bulu = bulu;
    }

    public void setMata(String mata) {
        this.mata = mata;
    }

    public void setMulut(String mulut) {
        this.mulut = mulut;
    }

    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }

    public void setKaki(String kaki) {
        this.kaki = kaki;
    }

    public void setEkor(String ekor) {
        this.ekor = ekor;
    }

    public String getBulu() {
        return bulu;
    }

    public String getMata() {
        return mata;
    }

    public String getMulut() {
        return mulut;
    }

    public String getTelinga() {
        return telinga;
    }

    public String getKaki() {
        return kaki;
    }

    public String getEkor() {
        return ekor;
    }

    void bermain(String a) {
        System.out.println("meow meow purr" + a);
    }

    void makan() {
        System.out.println("MEOW MEOW MEOWWWW!!");
    }
}