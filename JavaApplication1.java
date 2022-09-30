import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        ArrayList<Pesan> p = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Integer pilihan = 0;

        do {
            /*
             * jika pilih 1, maka input data,
             * jika 2, maka tampilkan data
             * jika 3 maka keluar sistem
             */

            System.out.println("----------------------------");
            System.out.println("--- BINTANG BUCK COFFEE ----");
            System.out.println("----------------------------");
            System.out.println("  1. Pembelian");
            System.out.println("  2. Bayar");
            System.out.println("  3. Keluar sistem");
            System.out.println("----------------------------");
            System.out.print("  Pilihanmu: ");
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                p = beli(p);
            } else if (pilihan == 2) {
                p = bayar(p);
            }
        } while (pilihan != 3);

    }

    private static ArrayList<Pesan> beli(ArrayList<Pesan> p) {
        Scanner sc = new Scanner(System.in);
        String nama, tipe, gula;
        Integer harga, qty;

        // ini nama pembeli?
        System.out.print("Nama: ");
        nama = sc.nextLine();

        System.out.println("Menu kita hanya:");
        System.out.println("Americano");
        System.out.println("Arabika");
        System.out.println("Latte");
        System.out.println("Matcha");

        // tipe cup atau tipe kopi?
        System.out.print("Tipe: ");
        tipe = sc.nextLine();

        // gula Aren atau Pasir? Sirup? Tebu? Caramel?
        System.out.print("Gula: ");
        gula = sc.nextLine();

        System.out.print("Harga: ");
        harga = sc.nextInt();

        System.out.print("Qty: ");
        qty = sc.nextInt();

        if (qty < 1) {
            System.out.println("Qty minimal 1");
        }

        p.add(new Pesan(nama, tipe, gula, harga, qty));

        return p;
    }

    private static ArrayList<Pesan> bayar(ArrayList<Pesan> p) {
        Scanner sc = new Scanner(System.in);
        Integer bayarbng, kmbli;

        // tampilkan data
        System.out.println("Jumlah data: " + p.size()); // ini error
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("| %-3s | %-10s | %-10s | %-5s | %-7s | %-3s  | %-7s |",
                "No",
                "Nama",
                "Tipe",
                "Gula",
                "Harga",
                "Qty",
                "Jumlah");
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < p.size(); i++) {
            System.out.printf("| %-3s | %-10s | %-10s | %-5s | %-7s | %-3s  | %-7s |",
                    i + 1,
                    p.get(i).getNama(),
                    p.get(i).getTipe(),
                    p.get(i).getGula(),
                    p.get(i).getHarga(),
                    p.get(i).getQty(),
                    (p.get(i).getHarga() * p.get(i).getQty()));
            System.out.println();
            System.out.println("--------------------------------------------------------------------");

            System.out.println("Total harga bayar : " + p.get(i).getHarga() * p.get(i).getQty());
            System.out.print("Jumlah Uang Anda : ");
            bayarbng = sc.nextInt();

            kmbli = bayarbng - (p.get(i).getHarga() * p.get(i).getQty());

            System.out.println("Jumlah kembalian : " + kmbli);

        }

        System.out.println("Tekan enter untuk lanjut...");
        sc.nextLine();

        return p;
    }
}