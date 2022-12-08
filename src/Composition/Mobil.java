package Composition;

public class Mobil {
    String warna;
    private Composition.Roda Roda;

    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return warna;
    }
    public void setRoda(String m, int r){
        Roda  = new Roda(m, r);
    }
    public String getMerkRoda() {
        return Roda.getMerk();
    }
    public int getRingRoda(){
        return Roda.getRing();
    }
}
