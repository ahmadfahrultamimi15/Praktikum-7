package Composition;

public class TeseterKomposisi {
    public static void main(String[] args) {
//Komposisi
        Mobil mobil=new Mobil();
        mobil.setWarna("Biru");
        mobil.setRoda("Bridgestone",15);
        System.out.println("Warna mobil : "+mobil.getWarna());
        System.out.println("Merk roda mobil : "+mobil.getMerkRoda());
        System.out.println("Ukuran ring roda : "+mobil.getRingRoda());
    }
}
