package aplikasi.perpustakaan;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Peminjaman {
    private Date tanggalPinjam;
    private Anggota peminjam;
    private List<PeminjamanDetail> daftarPeminjamanDetail
        = new ArrayList<PeminjamanDetail>();

    public void tambahPeminjamanDetail(PeminjamanDetail d){
        daftarPeminjamanDetail.add(d);
        d.setPeminjaman(this);
    }

    public void setPeminjam(Anggota a){
        peminjam = a;
    }
}
