
/**
 * Write a description of class Bus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.*;

public class Bus
{
    private ArrayList <Penumpang> PenumpangBiasa;
    private ArrayList <Penumpang> PenumpangPrioritas;
    Scanner scan = new Scanner(System.in);
    
    public Bus()
    {
        PenumpangBiasa = new ArrayList<Penumpang>();
        PenumpangPrioritas = new ArrayList<Penumpang>();
    }

    public void getPenumpangBiasa()
    {
        PenumpangBiasa.forEach((Penumpang) -> System.out.println(Penumpang));
    }
    
    public void getPenumpangPrioritas()
    {
        PenumpangPrioritas.forEach((Penumpang) -> System.out.println(Penumpang));
    }
    
    public int getJumlahPenumpangBiasa()
    {
        int jumPB = PenumpangBiasa.size(); 
        System.out.println("Jumlah Penumpang Biasa sebanyak: " +jumPB);
        return jumPB; 
    }
    
    public int getJumlahPenumpangPrioritas()
    {
        int jumPP = PenumpangPrioritas.size(); 
        System.out.println("Jumlah Penumpang Prioritas sebanyak: " +jumPP);
        return jumPP; 
    
    }
    
    public int getJumlahPenumpang()
    {
        int jumlah = PenumpangBiasa.size() + PenumpangPrioritas.size(); 
        System.out.println("Jumlah Semua Penumpang sebanyak: " +jumlah);
        return jumlah; 
    
    }
    
    
    public boolean NaikPenumpang(Penumpang penumpang)
    {
        if((PenumpangPrioritas.size() < 2)&&(penumpang.getUmur() > 60 || penumpang.getUmur() < 10) || (penumpang.getHamil() == true))
        {
            System.out.println(" Penumpang Kursi Prioritas Berhasil Dinaikkan!" );
            
            return PenumpangPrioritas.add(penumpang);
            
        }else if((PenumpangBiasa.size() < 4)&&(penumpang.getUmur() > 60 || penumpang.getUmur() < 10) || (penumpang.getHamil() == true))
        {
            System.out.println(" Penumpang Kursi Biasa Berhasil Dinaikkan!" );
            return PenumpangBiasa.add(penumpang);
            
        } else{
            System.out.println(" Maaf Tidak Ada Kursi Tersedia ");
            return false;
        }
    }
    
       
    public boolean TurunPenumpang(String nama)
    {
        if (PenumpangPrioritas.contains(nama) == true)
       {
           PenumpangPrioritas.remove(nama);
           System.out.println("Penumpang berhasil diturunkan! ");
           return true;
           
       }else if (PenumpangBiasa.contains(nama) == true)
       {
           PenumpangBiasa.remove(nama);
           System.out.println("Penumpang berhasil diturunkan! ");
           return true;
           
       }else{
           System.out.println("Penumpang gagal diturunkan! ");
           return false;
        }
    }
    
        public String toString(){
        String namaB =" ";
        String namaP =" ";
        boolean kosong1 = PenumpangBiasa.isEmpty();
        boolean kosong2 = PenumpangPrioritas.isEmpty();

        for(Penumpang penumpang : PenumpangBiasa){
            namaB += penumpang.getNama().toString();
        }
        for(Penumpang penumpang : PenumpangPrioritas){
            namaP += penumpang.getNama().toString();
        }

        if(kosong1 == true){
            System.out.println("Penumpang biasa : kosong");
        }
        else{
            System.out.println("Penumpang biasa : " +namaB);
        }

        if(kosong2 == true){
            System.out.println("Penumpang prioritas : kosong");
        }
        else{
            System.out.println("Penumpang prioritas : " +namaP);
        }

        return "Penumpang biasa = "+namaB+ "Penumpang prioritas = "+namaP+ "total semua penumpang = "+getJumlahPenumpang()+"\n";
    }
}
