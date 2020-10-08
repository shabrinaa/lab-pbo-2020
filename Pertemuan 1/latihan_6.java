
public class latihan_6 {
    public static void main(String args[]){
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " + b );
        
        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );
    
    }
}

/**
* Program berikut untuk mencoba operator conditional

dalam program ini, dilakukan pengecekan nilai boolean terhadap nilai a dan b. 
pada output 1 akan menampilkan hasil 30, dikarenakan a tidak sama dengan 1  melainkan a =10 sehingga nilai booleannya false
oleh karena itu hasil yang ditunjukkan adalah nilai sebelah kanan (30)
pada output 2 akan menampilkan hasil 20 dikarenakan a benar sama dengan 10 sehingga nilai booleannya true
oleh karena itu asil yang ditunjukkan sebelah kiri(20)
*/