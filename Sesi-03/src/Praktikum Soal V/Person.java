public class Person // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	int a; // Deklarasi variable bernama a dengan tipe data integer
    	a = 1000; // Memberikan nilai 1000 kepada variabel a
    	int b = 1000; // Deklarasi variable bernama b dengan tipe data integer dan sekaligus di isi dengan nilai 1000
    	
    	System.out.println("a = " + a); // Menampilkan output berupa nilai dari variabel a
    	System.out.println("b = " + b); // Menampilkan output berupa nilai dari variabel b
    	System.out.println("a + b = " + (a + b)); // Menampilkan output berupa jumlah nilai dari variabel a dan b
    }	
}
