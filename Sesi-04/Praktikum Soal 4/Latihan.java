public class Latihan // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	System.out.println("Instr 1"); // Menampilkan tulisan "Instr 1"
    		if(1>2) // Control flow if dengan kondisi apabila angka 1 lebih besar dari angka 2
    		{
    			System.out.println("Instr 2"); // Perintah yang dijalankan ketika kondisi pada if bernilai benar
    		}
    		else /* Else merupakan pasangan kondisi if, yang akan dijalankan apabila kondisi pada if tidak diketemukan,
    		atau bernilai salah */
    		{
    			System.out.println("Instr 3"); // Perintah yang dijalankan ketika kondisi pada if bernilai salah
    		}
    		System.out.println("Instr 4"); // Menampilkan tulisan "Instr 4"
    }
}
