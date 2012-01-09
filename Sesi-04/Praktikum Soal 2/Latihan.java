public class Latihan // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	for(int x = 0; x < 7; x++) /* Perulangan dengan keyword for. Dengan inisial nilai awal untuk variabel x adalah 0,
    	kondisi perulangan x sebanyak kurang dari 7 dan akan bertambah sampai memenuhi kondisi */
    	{
    		System.out.println("Hello, worlds we are using loops"); /* Menampilkan output berupa tulisan 
    		"Hello, worlds we are using loop" sebanyak jumlah perulangan for */
    	}
    }
}
