public class Latihan // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	boolean coba1; // Deklarasi variabel coba1 dengan tipe data boolean
    	boolean coba2; // Deklarasi variabel coba2 dengan tipe data boolean
    	
    	coba1 = (10 == 1); // Memberi nilai pada variabel coba1 dengan kondisi apakah 10 sama dengan 1
    	System.out.println(coba1); // Menampilkan nilai variabel coba1 yang sebelumnya telah di beri kondisi, nilainya adalah 'false'
    }
}
