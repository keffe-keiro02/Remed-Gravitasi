import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InfoFisika info = new InfoFisika();
        info.tampilkanInfo();

        try {
            System.out.print("Masukkan massa objek pertama (kg): ");
            double m1 = scanner.nextDouble();   

            System.out.print("Masukkan massa objek kedua (kg): ");
            double m2 = scanner.nextDouble();

            System.out.print("Masukkan jarak antara kedua objek (m): ");
            double r = scanner.nextDouble();

            Gravitasi gravitasi = new Gravitasi(m1, m2, r);
            double gaya = gravitasi.hitungGaya();

            System.out.printf("Gaya gravitasi antara kedua objek adalah: %.6e N\n", gaya);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
