public class IfElseIfExample {
    public static void main(String[] args) {
        int marks=65;

        if(marks<50){
            System.out.println("fail");
        }else if(marks>=50 && marks<60){
            System.out.println("D grade");
        }else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }else if(marks>=70 && marks<80){
            System.out.println("B grade");
        }else if(marks>=80 && marks<90){
            System.out.println("A grade"); 
        }else if(marks>=90 && marks<100){
            System.out.println("A+ grade");
        }else{
            System.out.println("Invalid!");
        }
    }
} 



/**
* Pada program ini ditampilkan seleksi if  yang mengembalikan nilai boolean jika bernilai true. 
output akan menampilkan 'fail' jika nilai kurang dari 50,
output akan menampilkan 'D grade' jika nilai 50 hingga 59,
output akan menampilkan 'C grade' jika nilai 60 hingga 69,
output akan menampilkan 'B grade' jika nilai 70 hingga 79,
output akan menampilkan 'A grade' jika nilai 80 hingga 89,
output akan menampilkan 'A+ grade' jika nilai 90 hingga 99,
pada program diatas, output yang ditampilkan adalah 'C grade', karena nilai yang di deklarasikan 65.


*/