package project;
import java.util.*;

public class Project {

    public static void main(String[] args) {
	Scanner nim = new Scanner (System.in);
	System.out.print("Masukkan NIM Anda             = ");
	String nimm = nim.nextLine();
        
       	Scanner nama = new Scanner (System.in);
	System.out.print("Masukkan Nama Anda            = ");
	String namaa = nama.nextLine();

        Scanner prodi = new Scanner (System.in);
	System.out.print("Masukkan Prodi Anda           = ");
	String prodii = prodi.nextLine();
 
       	Scanner tmsk = new Scanner (System.in);
	System.out.print("Masukkan Tahun Masuk Anda     = ");
	int tmskk = Integer.parseInt(tmsk.nextLine());  
        int tlls = tmskk+4;
        
        Scanner smt = new Scanner   (System.in);
        System.out.print("Masukkan Semester Anda        = ");
        int smtt = Integer.parseInt(smt.nextLine());
        int ssmt = 8-smtt;
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Data ");
        System.out.println("NIM             :   "+nimm);
        System.out.println("Nama            :   "+namaa);
        System.out.println("Prodi           :   "+prodii);
        System.out.println("Semester        :   Semester "+smtt);
        System.out.println("Sisa Semester   :   "+ssmt+" Semester");
        System.out.println("Tahun Masuk     :   Tahun "+tmskk);
        System.out.println("Tahun Lulus     :   Tahun "+tlls);
		
    }
    
}
