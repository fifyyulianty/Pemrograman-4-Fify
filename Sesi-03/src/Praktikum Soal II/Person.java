public class Person // Deklarasi class Person yang berifat public sehingga dapat diakses dari dalam maupun dari luar class itu sendiri
{
    private String nama; /* Deklarasi variabel nama dengan tipe data string dan bersifat private sehingga hanya dapat diakses oleh class itu sendiri */
    public static void main(String[] args) /* Deklarasi method main, method ini adalah method yang
	 pertama kali di panggil ketika program dijalankan. Method main menggunakan keyword void yang bertujuan agar
	 tidak mengembalikan nilai apapun, keyword public bertujuan agar method ini dapat diakses dari dalam maupun luar */
    {
    	Person test; // Deklarasi variabel atau property dengan tipe data referensi dari class person
    	test = new Person(); /* Mendeklarasikan sebuah objek baru dengan referensi class person
		 dalam memory untuk objek atau variable referensi test */
    	test.setNama("andi"); // Memberikan nilai andi kepada objek test melalui method bernama setNama
    	byte b = 100; // Deklarasi variabel b dengan tipe data byte sekaligus memberikan nilai 100
    	short s = 100; // Deklarasi variabel s dengan tipe data short sekaligus memberikan nilai 100
    	
    	Person belajarVariabel = test; /* Deklarasi objek baru bernama belajarVariabel
		 dan memberikan nilai property dari objek test ke dalam objek tersebut */
    	belajarVariabel.setNama("belajar variabel"); /* Memberikan nilai belajar variabel ke pada objek belajarVariabel 
    	melalui method bernama setNama */
    	
    	System.out.println(b + s); // Menampilkan output berupa jumlah dari nilai dari variabel b dan s
    	System.out.println("nama : " + test.getNama() + " " + b); /* Menampilkan output berupa variabel nama dengan nilai referensi
		 dari method getNama sehingga nilai yang muncul adalah nilai yang terakhir kali berada dimasukkan atau terakhir
		 kali berada dalam memori disertai dengan output dari nilai variable b */
    }
    public void setNama(String aNama) /* Deklarasi suatu method bernama setNama yang bersifat public 
	sehingga dapat diakses dari luar class dan memiliki argumen berupa variabel aNama dengan tipe string */
    {
    	this.nama = aNama; // Memasukkan nilai dari aNama ke dalam variable nama
    }
    public String getNama() /* Deklarasi suatu method bernama getNama dengan tipe data String dan bersifat public 
	sehingga dapat diakses dari luar class, berfungsi mengembalikan nilai dari variabel nama dari dalam memori */
    {
    	return this.nama;
    }
}
