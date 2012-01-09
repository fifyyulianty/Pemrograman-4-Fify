public class Person // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	byte number1 = 12; // Deklarasi variable bernama number1 dengan tipe data byte dan sekaligus di isi dengan nilai 12
    	short number2 = 100; // Deklarasi variable bernama number2 dengan tipe data short dan sekaligus di isi dengan nilai 100
    	int number3 = 1000; // Deklarasi variable bernama number3 dengan tipe data int dan sekaligus di isi dengan nilai 1000
    	long number4 = 20001; // Deklarasi variable bernama number4 dengan tipe data long dan sekaligus di isi dengan nilai 20001
    	float number5 = 120023.45f; // Deklarasi variable bernama number5 dengan tipe data float dan sekaligus di isi dengan nilai 120023.45f
    	double number6 = 123456; // Deklarasi variable bernama number6 dengan tipe data double dan sekaligus di isi dengan nilai 123456
    	boolean value = true; // Deklarasi variable bernama value dengan tipe data boolean dan sekaligus di isi dengan nilai true
    	char character = 'a'; // Deklarasi variable bernama character dengan tipe data character dan sekaligus di isi dengan nilai a
    	
    	System.out.println(number1); // Menampilkan output berupa nilai dari variabel number1
    	System.out.println(number2); // Menampilkan output berupa nilai dari variabel number2
    	System.out.println(number3); // Menampilkan output berupa nilai dari variabel number3
    	System.out.println(number4); // Menampilkan output berupa nilai dari variabel number4
    	System.out.println(number5); // Menampilkan output berupa nilai dari variabel number5
    	System.out.println(number6); // Menampilkan output berupa nilai dari variabel number6
    	System.out.println(value); // Menampilkan output berupa nilai dari variabel value
    	System.out.println(character); // Menampilkan output berupa nilai dari variabel character
    }	
}
