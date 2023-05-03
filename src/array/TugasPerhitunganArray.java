package array;

public class TugasPerhitunganArray {
    public static void main(String[] args) {
    double Buah[] = new double[5];
    double diskon[] = new double[3];

    Buah[0] =  5000;
    Buah[1] =  7000;
    Buah[2] =  3000;
    Buah[3] =  10000;

    diskon[0] = 0.02;
    diskon[1] = 0.05;
    diskon[2] = 0.07;

    double Total;
    Total = (Buah[0] * 2 + Buah[2] + Buah[3]) * diskon[1] ;

    System.out.println("Total Belanja Pembeli adalah "+Total);

    }
}
