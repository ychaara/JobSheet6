import java.util.Scanner;
public class StudiKasus108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 15000,jumlahCup,uangBayar,totalHarga,diskon,totalBayar,kembalian,kurang;
        
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        uangBayar = sc.nextInt();
        
        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Total Harga : Rp" + totalHarga);
        System.out.println("Diskon      : Rp" + diskon);
        System.out.println("Total Bayar : Rp" + totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
        sc.close();
        // tes tes coba ada something yang terjadi tidak 
    }
}
