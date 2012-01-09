package aplikasi.mahasiswa;

import java.util.List;
import java.util.ArrayList;

public class AplikasiMahasiswa {
    public static void main(String[] xx){
        Mahasiswa m1 = new Mahasiswa();
        m1.setNpm("123");
        m1.setNama("Endy");

        Mahasiswa m2 = new Mahasiswa();
        m2.setNpm("456");
        m2.setNama("Adi");

        List<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();
        daftarMahasiswa.add(m1);
        daftarMahasiswa.add(m2);

        List<DatabaseMahasiswa> db = new ArrayList<DatabaseMahasiswa>();

        // database csv
        DatabaseMahasiswaCsv dbCsv = new DatabaseMahasiswaCsv("mhs.txt", false);
        db.add(dbCsv);

		// Database Access
		DatabaseMahasiswaAccess dbAccess = new DatabaseMahasiswaAccess("mahasiswa");
		db.add(dbAccess);

        /*DatabaseMahasiswaMySQL dbMySQL
            = new DatabaseMahasiswaMySQL(
                "localhost", "3306", "belajar", "root", "admin");
        db.add(dbMySQL);
*/
        for(DatabaseMahasiswa d : db){
            for(Mahasiswa m : daftarMahasiswa){
                d.simpan(m);
            }
        }
    }
}
