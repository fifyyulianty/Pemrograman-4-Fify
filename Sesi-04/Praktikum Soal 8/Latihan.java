public class Latihan // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	int count = 1; // Deklarasi variabel count dengan tipe data integer sekaligus memberi nilai 1
    	while(count < 5) // Perulangan while dengan kondisi apabila variabel count kurang dari 5, maka perulangan akan terus dijalankan
    	{
    		System.out.println("Count is equal to " + count); // Menampilkan tulisan "Count is equal to " dan nilai dari count itu sendiri
    		count++; // Memberi operator increment pada variabel count, sebanyak kondisi yang telah di tentukan pada perulangan while
    	}
    }
}
