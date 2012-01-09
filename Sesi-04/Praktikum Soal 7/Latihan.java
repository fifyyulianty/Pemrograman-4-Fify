public class Latihan // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	int firstNumber, secondNumber, results; // Deklarasi variabel firstNumber, secondNumber & results dengan tipe data integer
    	
    	firstNumber = 20; // Memberi nilai kepada variabel firstNumber yaitu 20
    	secondNumber = 10; // Memberi nilai kepada variabel secondNumber yaitu 10
    	
    	results = firstNumber + secondNumber; // Memberi nilai kepada variabel results berupa jumlah dari nilai firstNumber dengan secondNumber
    	System.out.println(results); // Menampilkan nilai dari variabel results
    }
}
