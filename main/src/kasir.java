/*  Menampilkan "Program Tiket Bioskop"
 * 
 *  Mau memasukkan berapa tiket ? _3_
 * 
 *  Pilih Tiket :
 *  1. Regular : Rp. 30000
 *  2. Premium : Rp. 60000
 *  3. VIP : Rp. 100000
 * 
 *  Masukkan pilihan tiket : _1_
 *  Masukkan jumlah tiket : _2_
 *  Subtotalnya adalah Rp. 60000
 * 
 * 
 *  *  Pilih Tiket :
 *  1. Regular : Rp. 30000
 *  2. Premium : Rp. 60000
 *  3. VIP : Rp. 100000
 * 
 *  Masukkan pilihan tiket : _2_
 *  Masukkan jumlah tiket : _2_
 *  Subtotalnya adalah Rp. 120000
 * 
 * 
 *  Pilih Tiket :
 *  1. Regular : Rp. 30000
 *  2. Premium : Rp. 60000
 *  3. VIP : Rp. 100000
 * 
 *  Masukkan pilihan tiket : _3_
 *  Masukkan jumlah tiket : _1_
 *  Subtotalnya adalah Rp. 100000
 *  
 * 
 * Total akhir yang harus dibayar adalah 280000
 * 
 */

/*  Menampilkan "Program Tiket Bioskop"
 * 
 *  Mau memasukkan berapa tiket ? _3_
 * 
 *  Pilih Tiket :
 *  1. Regular : Rp. 30000
 *  2. Premium : Rp. 60000
 *  3. VIP : Rp. 100000
 * 
 *  Masukkan pilihan tiket : _1_
 *  Masukkan jumlah tiket : _2_
 *  Totalnya adalah Rp. 60000
 * 
 * Masukkan uang : _100000_
 * Kembaliannya adalah 40000
 * 
 *  Masukkan uang : _50000_
 *  Uang anda kurang 10000
 * 
 *  Masukkan uang : _60000_
 *  Uang anda pas
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int totalAkhir = 0;
            String pilihanLanjut = "";
            List<String> struk = new ArrayList<>();

            do {
                System.out.println("Tiket Bioskop ");
                System.out.println("1. Reguler : Rp. 30000 ");
                System.out.println("2. Premium : Rp. 60000 ");
                System.out.println("3. VIP : Rp. 100000 ");

                System.out.println("Pilih Tiket : ");
                int pilihanTiket = input.nextInt();

                System.out.println("Jumlah Tiket : ");
                int jumlahTiket = input.nextInt();

                int harga = 0;
                switch (pilihanTiket) {
                    case 1 -> harga = 30000;
                    case 2 -> harga = 60000;
                    case 3 -> harga = 100000;
                    default -> {
                        System.out.println("Pilihan tiket tidak valid!");
                        continue;
                    }
                }

                int subtotal = harga * jumlahTiket;
                totalAkhir += subtotal;
                System.out.println("Subtotalnya adalah Rp. " + subtotal);

                String jenisTiket = switch (pilihanTiket) {
                    case 1 -> "Regular";
                    case 2 -> "Premium";
                    case 3 -> "VIP";
                    default -> "Tidak Valid";
                };
                struk.add(jumlahTiket + " x " + jenisTiket + " (Rp. " + harga + ") = Rp. " + subtotal);

                System.out.print("Ingin membeli tiket lagi? (y/t): ");
                pilihanLanjut = input.next().trim().toLowerCase();
            } while (pilihanLanjut.equals("y"));

            System.out.println("\nTotal akhir yang harus dibayar adalah Rp. " + totalAkhir);

            System.out.println("Masukan jumlah uang : ");
            int jumlahuang = input.nextInt();

            if (jumlahuang > totalAkhir) {
                int kembalian = jumlahuang - totalAkhir;
                System.out.println("Kembalian Anda Adalah : Rp. " + kembalian);
            } else if (jumlahuang < totalAkhir) {
                int kurang = totalAkhir - jumlahuang;
                System.out.println("Been ndik otang : Rp. " + kurang);
            } else if (jumlahuang == totalAkhir) {
                System.out.println("Uang anda pas");
            }

            int kembalian = jumlahuang - totalAkhir;

            System.out.println("--------------------------------------------------");
            System.out.println("       APLIKASI KASIR BIOSKOP OLEH SYAIF");
            System.out.println("--------------------------------------------------");

            for (String item : struk) {
                System.out.println(item);
            }

            System.out.println("--------------------------------------------------");
            System.out.println("Total Bayar : Rp. " + totalAkhir);
            System.out.println("Uang anda   : Rp. " + jumlahuang);
            System.out.println("Kembali     : Rp. " + kembalian);
            System.out.println("--------------------------------------------------");
            System.out.println("--------------------------------------------------");
            System.out.println("                KESOON SE BENYAK");
            System.out.println("=============LAYANAN KONSUMEN BIOSKOP=============");
            System.out.println("           EMAIL:SAIFRIKDENIM@GMAIL.COM");
        }
    }
}