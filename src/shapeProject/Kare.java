package shapeProject;

public class Kare implements IIslem{

    private double kenar;
    public Kare(double kenar) {
        setKenar(kenar);}
    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }



    @Override
    public double alanHesapla() {
        return this.kenar*this.kenar;
    }

    @Override
    public double cevreHesapla() {
        return this.kenar*4;
    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenar=" + kenar +
                '}';
    }
// TODO Bu class doldurunuz

}
