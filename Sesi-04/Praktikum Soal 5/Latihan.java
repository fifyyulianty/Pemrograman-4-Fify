public class Latihan // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	int a = 5; // Deklarasi variabel a dengan tipe data integer sekaligus memberi nilai 5 pada variabel ini
    	
    	System.out.println(a++); /* Menampilkan nilai dari variabel a yang telah ditambahkan operator increment, namun nilai dari
    	variabel a belum berubah */
    	System.out.println(a); // Menampilkan nilai dari variabel a yang telah berubah akibat penggunaan operator increment
    }
}
