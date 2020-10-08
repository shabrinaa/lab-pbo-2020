
import java.util.Scanner;
public class IfExample {
    public static void main(String[] args) {
        int age=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan umur anda:");

        age = sc.nextInt();
        if(age>=17)
        System.out.print("Anda sudah boleh buat KTP");
    }
}

/**
* Program berikut untuk mencoba seleksi if dengan keadaan yang mengembalikan nilai boolean jika bernilai true. 
Scanner sc = new Scanner(System.in); berfungsi untuk menyimpan data yang akan dimasukkan user.
ketika di run,output 1 akan menampilkan permintaan memasukkan umur user ke dalam program. 
kemudian, komputer akan membandingkan umuyang dimasukkan user. jika umur user lebih dari sama dengan 17
maka, output yang akan ditampilkan adalah 'Anda sudah boleh buat KTP'.
*/
