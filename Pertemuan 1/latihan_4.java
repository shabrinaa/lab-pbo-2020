public class latihan_4 {
 public static void main(String args[]) {
 int a = 60; /* 60 = 0011 1100 */
 int b = 13; /* 13 = 0000 1101 */
 int c = 0;

 c = a & b; /* 12 = 0000 1100 */
 System.out.println("a & b = " + c );
 c = a | b; /* 61 = 0011 1101 */
 System.out.println("a | b = " + c );
 c = a ^ b; /* 49 = 0011 0001 */
 System.out.println("a ^ b = " + c );
 c = ~a; /*-61 = 1100 0011 */
 System.out.println("~a = " + c );
 c = a << 2; /* 240 = 1111 0000 */
 System.out.println("a << 2 = " + c );
 c = a >> 2; /* 15 = 1111 */
 System.out.println("a >> 2 = " + c );
 c = a >>> 2; /* 15 = 0000 1111 */
 System.out.println("a >>> 2 = " + c );
 }
}
 
 /* pada output 1 akan menampilkan hasil uji operator bitwise and terhadap a dan b
 pada output 1 akan menampilkan hasil uji operator bitwise and terhadap a dan b
 pada output 1 akan menampilkan hasil uji operator bitwise or terhadap a dan b
 pada output 1 akan menampilkan hasil uji operator bitwise xor terhadap a dan b
 pada output 1 akan menampilkan hasil uji operator bitwise complement/ingkaran terhadap a dan b
 pada output 1 akan menampilkan hasil uji operator bitwise penggeseran bit ke kiri sebanyak 2 langkah terhadap a dan b
 pada output 1 akan menampilkan hasil uji operator bitwise penggeseran bit ke kanan sebanyak 2 terhadap a dan b
 pada output 1 akan menampilkan hasil uji operator bitwise penggeseran bit ke kanan sebanyak 3 terhadap a dan b
*/