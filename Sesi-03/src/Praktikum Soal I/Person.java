public class Person // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	int value = 10; // Deklarasi variable bernama value dengan tipe data integer dan sekaligus di isi dengan nilai 10
    	char x; // Deklarasi variabel x dengan tipe data character
    	x = 'A'; // Pemberian nilai 'A' kepada variabel x
    	
    	System.out.println(value); // Menampilkan output berupa nilai dari variabel value
    	System.out.println("The value of x = " + x); // Menampilakan output berupa tulisan dan nilai dari variabel x
    }
}
