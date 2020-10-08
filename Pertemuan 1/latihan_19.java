public class latihan_19{
    public static void main(String arg[]){
        int a, b;
        Mulai:
        for(a=0; a<2; a++){
                for(b=0; b<3; b++){
                    if(b==2)
                    break Mulai;

                System.out.println("a=" + a + " ; b=" + b);
            }
        }
    }
} 
/* pada program diatas digunakan label break mulai untuk menghentikan proses looping.
looping hanya dilakukan sekali lalu dihentikan oleh break mulai. 
prosess for(a=0; a<2; a++){ dan for(b=0; b<3; b++){ hanya dilakukan 1 lalu berhenyti. 
sehingga hasil output yang ditampilkan adalah
a=0 ; b=0
a=0 ; b =1  
*/