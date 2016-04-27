package staticfinal;
import java.util.Scanner;
public class MainHitungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hitungan hit = new Hitungan();
        int p;
        do {
            System.out.println("Menu");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Pembagian");
            System.out.println("4. Perkalian");
            System.out.println("5. Sederhanakan Pecahan");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda = ");
            p = input.nextInt();
            switch (p) {
                case 1:
                    System.out.print("Masukkan Angka Pertama : ");
                    int a= input.nextInt();
                    System.out.print("Masukkan Angka Kedua : ");
                    int b= input.nextInt();
                    Hitungan.jumlah(a, b);
                    break;
                case 2:
                    System.out.print("Masukkan Angka Pertama : ");
                    a= input.nextInt();
                    System.out.print("Masukkan Angka Kedua : ");
                    b= input.nextInt();
                    Hitungan.kurang(a,b);
                    break;
                case 3:
                    System.out.print("Masukkan Angka Pertama : ");
                    a= input.nextInt();
                    System.out.print("Masukkan Angka Kedua : ");
                    b= input.nextInt();
                    hit.bagi(a,b);
                    break;
                case 4:
                    System.out.print("Masukkan Angka Pertama : ");
                    a= input.nextInt();
                    System.out.print("Masukkan Angka Kedua : ");
                    b= input.nextInt();
                    hit.kali(a,b);
                    break;
                case 5:
                    System.out.print("Masukkan Angka Pembilang : ");
                    a= input.nextInt();
                    System.out.print("Masukkan Angka Penyebut : ");
                    b= input.nextInt();
                    hit.Sederhana(a,b);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukkan angka yang sudah ada di Pilihan");
            }
        } while (p != 6);
    }
}