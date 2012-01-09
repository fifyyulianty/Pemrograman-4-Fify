public class Person // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	int ourfirstnumber = 10; // Deklarasi variable bernama ourfirstnumber dengan tipe data integer dan sekaligus di isi dengan nilai 10
    	double ourfirstdouble = 10; // Deklarasi variable bernama ourfirstdouble dengan tipe data double dan sekaligus di isi dengan nilai 10
    	
    	System.out.println(ourfirstnumber); // Menampilkan output berupa nilai dari variabel ourfirstnumber
    	System.out.println(ourfirstdouble); // Menampilkan output berupa nilai dari variabel ourfirstdouble
    }	
}
