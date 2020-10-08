public class latihan_18{
    public static void main (String arg[]){
      
        for (int i=0; i<10; i++){
            for (int j=0; j<i+1; j++){
                
                if(j==5)
                continue;

                System.out.print('*');
            }
            System.out.println();
        }
    }
}

/* pada program diatas dilakukan perubahan pada break menjadi continue. 
output yang dihasilkan sama seperti p;ada break karena ada ketentuan if (j=5).
jika tidak ada patokan , makan perulanga akan terus terjadi.
*\