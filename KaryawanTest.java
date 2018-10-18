public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Project Manager");
	Pm p = new Pm();
	p.setNama("Soni");
	p.setAlamat("Indramayu");
	p.setGaji(60);
	System.out.println(" ");

	System.out.println("Jabatan Programer");
	Program pr = new Program();
	pr.setNama("Dwi");
	p.setAlamat("Cianjur");
	p.setGaji(85);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("Susanto");
	d.setAlamat("Bandung");
	d.setGaji(50);
	}
}