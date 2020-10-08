public class latihan_2 {
 public static void main(String args[]) {
 int a = 10;
 int b = 20;
 int c = 0;

 c = a + b;
 System.out.println("c = a + b = " + c );
 c += a ;
 System.out.println("c += a = " + c );
 c -= a ;
 System.out.println("c -= a = " + c );
 c *= a ;
 System.out.println("c *= a = " + c );
 a = 10;
 c = 15;
 c /= a ;
 System.out.println("c /= a = " + c );
 a = 10;
 c = 15;
 c %= a ;
 System.out.println("c %= a = " + c );
 c <<= 2 ;
 System.out.println("c <<= 2 = " + c );
 c >>= 2 ;
 System.out.println("c >>= 2 = " + c );
 c >>= 2 ;
 System.out.println("c >>= 2 = " + c );
 c &= a ;
 System.out.println("c &= a = " + c );
 c ^= a ;
 System.out.println("c ^= a = " + c );
 c |= a ;
 System.out.println("c |= a = " + c );
 }
}

/* output 1 akan menghasilkan nilai c yang merupakan hasil penjumlahan a dan b yaitu 30.
output 2 akan menghasilkan nilai c yaitu c = c+a atau 30 +10  yaitu 40. (nilai c terus berubah berdasarkan output diatasnya)
output 3 akan menghasilkan nilai c yaitu c = c - a= 40-10 yaitu 30.
output 4 akan menghasilkan nilai c yaitu c = c * a= 30*10 yaitu 300.
pada code sebelum output 5 deklarasikan nilai a dan c yang berbeda dengan a= 10 dan c= 15.
output 5 akan menghasilkan nilai c yaitu c = c / a= 15/10 yaitu 1 (ini dikarenakan angka dideklar sebagai 1int bukan double atau float)
pada code sebelum output 6, di deklarasikan lagi nilai a dan c yang dengan a= 10 dan c= 15, sehingga c tidak berubah mengikuti output atasnya.
output 6 akan menghasilkan nilai c yaitu c = c modulo a yaitu 5
output 7 akan menghasilkan nilai c dengan  c bergeser 2 bit ke kiri sehingga nilainya menjadi 20
output 8 akan menghasilkan nilai c dengan  c bergeser 2 bit ke kanan sehingga nilainya menjadi 1
output 9 akan menghasilkan nilai c dengan  c bergeser 2 bit ke kanan sehingga nilainya menjadi 5
output 7 akan menghasilkan nilai c dengan  c = c&a yaitu 0
output 7 akan menghasilkan nilai c dengan  c = c^a yaitu 10
output 7 akan menghasilkan nilai c dengan  c = c|a yaitu 10.
*/