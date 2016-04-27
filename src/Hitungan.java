package staticfinal;
public class Hitungan {
    public static void jumlah(double a, double b) {
        double hasil = a + b;
        System.out.println("Hasil Penjumlahan = "+hasil);
        System.out.println();
    }
    public static void kurang(double a, double b) {
        double hasil = a-b;
        System.out.println("Hasil Pengurangan = "+hasil);
        System.out.println();
    }
    public void kali(double a, double b) {
        double hasil = a*b;
        System.out.println("Hasil Perkalian = "+ hasil);
        System.out.println();
    }
    public void bagi(double a, double b) {
        double hasil = a/b;
        System.out.println("Hasil Pembagian = "+hasil);
        System.out.println();
    }
    public void Sederhana(int pem, int peny) {
        int temp, A, B;
        if (peny == 0) {
            System.out.println("Penyebut anda lebih besar dari Pembilang");
        }else{ 
            if (pem<peny){
            A=peny;
            B=pem;
        }else {
            A=pem;
            B=peny;
        }
        while (B != 0) {
            temp = A % B;
            A = B;
            B = temp;
        }
        pem /= A;
        peny /= A;
        System.out.println( "Hasil Penyederhanaan adalah : "+pem + "/"+peny);
    }
        System.out.println();
    }
}     