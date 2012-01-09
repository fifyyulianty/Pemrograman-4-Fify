public class Latihan // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	int age = 21; // Deklarasi variabel bernama age dengan tipe data integer dan sekaligus di isi dengan nilai 21
    	
    	System.out.println(age > 50 ? "You are old" : "You are young"); /* Menampilakan output berupa nilai benar atau salah,
    	untuk menentukan nilai benar atau salah, digunakan keyword '?', bila nilai benar, maka akan menampilkan pesan 
    	"You are old", namun bila nilai salah, maka akan menampilkan pesan "You are young" */
    }
}
