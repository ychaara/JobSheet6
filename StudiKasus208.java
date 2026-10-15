import java.util.Scanner;
public class StudiKasus208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa,jenisKegiatan;
        int jumlahDokumen, peringkatJuara,statusPendanaan;

        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Masukkan jumlah dokumen (0-4): ");
        jumlahDokumen = sc.nextInt();
        System.out.print("Masukkan peringkat juara (1-3/isi 0 jika bukan juara): ");
        peringkatJuara = sc.nextInt();
        System.out.print("Masukkan status pendanaan (1=lolos, 0=tidak lolos): ");
        statusPendanaan = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            if (jumlahDokumen < 4) {
                System.out.println("Status Dana: TIDAK DIBERIKAN");
                System.out.println("Alasan: Dokumen tidak lengkap, masih kurang "
                        + (4 - jumlahDokumen) + " dokumen.");
            } else {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status Dana: DIBERIKAN");
                    System.out.println("Alasan: Meraih Juara " + peringkatJuara
                            + " dan dokumen lengkap.");
                } else {
                    System.out.println("Status Dana: TIDAK DIBERIKAN");
                    System.out.println("Alasan: Bukan Juara 1, 2, atau 3.");
                }
            }
        }else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            if (jumlahDokumen < 4) {
                System.out.println("Status Dana: TIDAK DIBERIKAN");
                System.out.println("Alasan: Dokumen tidak lengkap, masih kurang "
                        + (4 - jumlahDokumen) + " dokumen.");
            } else {
                if (statusPendanaan == 1) {
                    System.out.println("Status Dana: DIBERIKAN");
                    System.out.println("Alasan: PKM lolos pendanaan dan dokumen lengkap.");
                } else {
                    System.out.println("Status Dana: TIDAK DIBERIKAN");
                    System.out.println("Alasan: PKM tidak lolos pendanaan.");
                }
            }
        } else {
            System.out.println("Status Dana: TIDAK DIBERIKAN");
            System.out.println("Alasan: Jenis kegiatan termasuk Lainnya.");
        }
    }
}
// ini juga wess aku tak pakai github akun lama aja dehh