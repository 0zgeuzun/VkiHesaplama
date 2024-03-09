import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan boy ve kilo bilgisini al
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        // Vücut Kitle İndeksini hesapla
        double vucutKitleIndeksi = kilo / (boy * boy);

        // Sonucu ekrana yazdır
        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);

        // Scanner'ı kapat
        scanner.close();
    }
}