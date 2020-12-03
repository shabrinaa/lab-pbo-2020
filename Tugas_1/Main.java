import java.util.*;
import javax.naming.NameAlreadyBoundException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menu, ulang = 1;

        Bus TKR = new Bus();

        do {
            System.out.println("===== TRANSKUTARAJA =====\n");
            System.out.println("MENU :\n");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.print("\nPilihan : ");
            menu = scan.nextInt();

            if (menu == 1) {
                System.out.print("Masukan Nama : ");
                String nama = scan.next();
                System.out.print("Masukan Umur : ");
                int umur = scan.nextInt();
                System.out.print("Apakah Hamil (y/n) : ");
                Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y") ? true : false;

                Penumpang penumpang = new Penumpang(nama, umur, hamil);
                TKR.NaikPenumpang(penumpang);
                TKR.toString();
                
            } else if (menu == 2) {
                
                System.out.print("Masukan Nama : ");
                String nama = scan.next();
                TKR.TurunPenumpang(nama);
                TKR.toString();
                
            } else if (menu == 3) {
                
                TKR.toString();
                
            } else {
                
                System.out.println("Menu Tidak Tersedia");
            }
        } while (true);






            
        
    }
}
