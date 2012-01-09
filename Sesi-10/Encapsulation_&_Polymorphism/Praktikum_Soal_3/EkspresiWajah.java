public class EkspresiWajah
{
	public String respons()
	{
		return ("Perhatikan ekspresi wajah saya");
	}
}

class Gembira extends EkspresiWajah
{
	public String respons()
	{
		return("hahaha...");
	}
}

class Sedih extends EkspresiWajah
{
	public String respons()
	{
		return("hik... hik... ngeee ngee...");
	}
}

class Marah extends EkspresiWajah
{
	public String respons()
	{
		return("Saya marah... !");
	}
}
