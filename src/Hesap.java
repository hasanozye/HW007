public class Hesap {
    private Zemin zemin;
    private Hali hali;

    public Hesap() {
    }

    public Hesap(Zemin zemin, Hali hali) {
        this.zemin = zemin;
        this.hali = hali;
    }

    public double getToplamMaliyet(){
        return zemin.alanHesapla()* hali.getFiyat();

    }

}
