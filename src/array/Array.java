package array;

public class Array {
    public static void main(String[] args) {
        int nilaiArr[] = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        System.out.println(nilaiArr[2]);
        System.out.println(nilaiArr[0]);
        System.out.println(nilaiArr[8]);

        String mataKuliah[];
        mataKuliah = new String[10];

        mataKuliah[0] = "Pemrograman Berbasis Objek 1";
        mataKuliah[1] = "Visual 2";
        mataKuliah[2] = "Rekayasa Perangkat Lunak";
        mataKuliah[3] = "Pemrograman Web 2";
        mataKuliah[4] = "Algoritma dan Pemrograman";

        System.out.println(mataKuliah[2]);
        System.out.println(mataKuliah[1]);
        System.out.println(mataKuliah[4]);
    }
}
