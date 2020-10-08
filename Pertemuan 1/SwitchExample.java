
public class SwitchExample {
    public static void main(String[] args) {
        int number=20;
        switch(number){
            case 10: System.out.println("10");
            break;
            case 20: System.out.println("20");
            break;
            case 30: System.out.println("30");
            break;
            default:System.out.println("Not in 10, 20 or 30");
        }
    }
} 

/**
* Program berikut untuk mencoba seleksi switch-case yang hanya akan memilih satu pernyataan saja.
output akan menampilkan '10' jika angka yang diberi 10,
output akan menampilkan '10' jika angka yang diberi 20,
output akan menampilkan '10' jika angka yang diberi 30,
jika angka yang diberi bukan 10,20,30, maka output akan beralih ke default.
pada program diatas output yang ditampilkan adalah '20', hal ini dikarenakan angka yang dinyatakan adalah 20.


*/