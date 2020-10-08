public class CobaBreak{
    public static void main (String arg[]){
      
        for (int i=0; i<10; i++){
            for (int j=0; j<i+1; j++){
                
                if(j==5)
                break;

                System.out.print('*');
            }
            System.out.println();
        }
    }
} 

/* break pada program diatas berfungsi sebagai tanda harus berakhirnya perulangan pada program.
pada variabel i, akan dilakukan perulangan sebnayka 10 kali secara menurun atau horizontal
dan pada variabel j, akan dilakukan perulangan sebanak 10 kali secara vertikal
sehingga jumlah * akan bertambah 1 tiap barisnya.*/ 