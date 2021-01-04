public class TesSiswa
{
    public static void main(String[] ar)
    {
        Siswa s = new Siswa();
        Siswa ss = new Siswa(8030001, "Upin");

        //ini akan menimbulkan error
        //Siswa sss = new Siswa(8030002);  

        System.out.println(s.getNrp() + "  " + s.getNama());
        System.out.println(ss.getNrp() + "  " + ss.getNama());
    }
}


/** Method overloading artinya method dengan nama yang sama, namun memiliki parameter yang berbeda,
 dan method ini berada dalam sebuah class yang sama atau bisa juga berada dalam class yang lain yang 
 terkait dalam hirarki inheritance. mMethod ini bertujuan untuk pembacaan code menjadi lebih cepat **/