public class Latihan // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	int a = 4, b = 6; // Deklarasi variabel a dan b dengan tipe data integer sekaligus memberi nilai 4 dan 6
    	int num = a|b; // Deklarasi variabel num dengan tipe data integer sekaligus memberi operator or kepadanya
    	if(num==4) // Control flow if dengan kondisi jika variabel num bernilai 4
    		System.out.println("Value is 4"); // Menampilkan tulisan "Value is 4" jika variabel num bernilai 4
    	else if(num==5) // Control flow else if dengan kondisi jika variabel num bernilai 5
    		System.out.println("Value is 5"); // Menampilkan tulisan "Value is 5" jika variabel num bernilai 5
    	else if(num==6) // Control flow else if dengan kondisi jika variabel num bernilai 6
    		System.out.println("Value is 6"); // Menampilkan tulisan "Value is 6" jika variabel num bernilai 6
    	else if(num==7) // Control flow else if dengan kondisi jika variabel num bernilai 7
    		System.out.println("Value is 7"); // Menampilkan tulisan "Value is 7" jika variabel num bernilai 7
    }
}
