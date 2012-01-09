public class Latihan // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	int num = 11; // Deklarasi variabel num dengan tipe data integer sekaligus memberi nilai 11
    	if(num>5) // Control flow if dengan kondisi jika variabel num bernilai lebih dari 5
    		System.out.println("Number is Greater Than 5"); /* Menampilkan tulisan "Number is Greater Than 5" apabila control flow
    		if bernilai benar */
    	else // Control flow pasangan if yaitu else yang bertujuan menjalankan perintah dibawahnya jika control flow if bernilai salah
    		System.out.println("Number is Less Than 5"); /* Menampilkan tulisan "Number is Less Than 5" apabila control flow
    		if bernilai salah */
    }
}
