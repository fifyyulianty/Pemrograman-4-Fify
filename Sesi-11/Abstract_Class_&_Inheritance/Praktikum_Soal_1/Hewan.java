abstract class Hewan
{
	protected String nama;
	protected int jumKaki;
	protected boolean bisaTerbang = false;
	
	public Hewan(String nama, int kaki, boolean terbang)
	{
		this.nama = nama;
		jumKaki = kaki;
		bisaTerbang = terbang;	
	}
	
	public abstract void bersuara();

	public static void makan()
	{
		System.out.println("nyam nyam nyam...");	
	}

	public void isHewan()
	{
		System.out.println("Nama : " + nama);
		System.out.println("Jumlah kaki : " + jumKaki);
		System.out.println("Bisa terbang : " + bisaTerbang);	
	}
}

