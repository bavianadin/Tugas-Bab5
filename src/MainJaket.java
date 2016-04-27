package staticfinal;
import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Jaket jak= new Jaket();
        long hasil=0;
        Scanner input=new Scanner(System.in);
        jak.menu();
        System.out.print("Masukkan Bahan Jaket yang anda Pilih = ");
        String bahan= input.next();
        System.out.print("Masukkan Jumlah Jaket yang anda Beli = ");
        int jumlah=input.nextInt();
        if (bahan.equalsIgnoreCase("a")){
           if (jumlah>100){
                hasil = jumlah*(jak.a-5000);
           }else{
                hasil = jumlah *jak.a;
           }
        }else if(bahan.equalsIgnoreCase("b")){
           if (jumlah>100){
                hasil = jumlah*(jak.b-5000);
           }else{
                hasil = jumlah *jak.b;
           } 
        }else if(bahan.equalsIgnoreCase("c")){
           if (jumlah>100){
                hasil = jumlah*(jak.c-15000);
           }else{
                hasil = jumlah *jak.c;
           } 
    }
        System.out.println("Anda memesan Jaket dengan bahan "+bahan+" sebanyak "+ jumlah);
        System.out.println("Jumlah pembayaran anda adalah = Rp "+ hasil);
}
}