public class latihan_1 {
 public static void main(String args[]) {
 int a = 10;
 int b = 20;
 int c = 25;
 int d = 25;
 System.out.println("a + b = " + (a + b) );
 System.out.println("a - b = " + (a - b) );
 System.out.println("a * b = " + (a * b) );
 System.out.println("b / a = " + (b / a) );
 System.out.println("b % a = " + (b % a) );
 System.out.println("c % a = " + (c % a) );
 System.out.println("a++ = " + (a++) );
 System.out.println("b-- = " + (a--) );
 // Check the difference in d++ and ++d
 System.out.println("d++ = " + (d++) );
 System.out.println("++d = " + (++d) );
 }
}

/* java adalah jenis pemrograman yang berbasis objek, oleh karena itu setiap programnya harus diawali dengan 
class agar dapat dijadikan objek. cara mendeklarasikan class yaitu" class NamaProgram{ .
selanjutnya fungsi main() harus ditulis agar program dapat dijalankan.fungsi main()
tidak dapat dikenali tanpa parameter string[] args. string[] args berfungsi untuk menerima argumen yang diberi
user kepada program. pada perintah System.out.println("a + b = " + (a + b) ); akan dihasilkan
penjumlahan (simbol +) dari nilai a yaitu 10 dengan nilai b yaitu 20 sehingga akan keluar output 30.
pada System.out.println("a - b = " + (a - b) ); akan dihasilkan hasil pengurangan (simbol -) nilai a dan b yaitu -10.
pada System.out.println("a * b = " + (a * b) ); akan dihasilkan hasil perkalian (simbol *) antara a dan b yaitu 200.
pada System.out.println("b / a = " + (b / a) ); akan dihasilkan hasil pembagian  (simbol /) dari b dibagi a yaitu 2
pada System.out.println("b % a = " + (b % a) ); akan dihasilkan hasil sisa/ modulo (simbol %) pembagian nilai b dibagi nilai a yaitu 0
pada System.out.println("c % a = " + (c % a) ); akan dihasilkan hasil sisa/ modulo (simbol %) pembagian nilai c dibagi nilai a yaitu 5
pada System.out.println("a++ = " + (a++) ); a++ merupakan post-increment yang mana artinya a pertama akan mengambil nilai a pada a++
lalu variable a++ ditambah 1. maka hasilnya a=10
pada System.out.println("b-- = " + (a--) ); a-- merupakan post decrement dimana variabel b mengambil nilai a yang telah dikurang 1.
d++ dan ++d berbeda hasilnya, dikarenakan d++ variabel akan mengambil nilai d yang belum ditambah 1 yaitu 25, 
sedangkan ++d variabel akan mengambil nilai d yang telah ditambah 1 
*/