//FAKHRI NAUFALDI RAMADHAN
//227064516035
public class Pegawai {
    // Atribut untuk menyimpan informasi karyawan
    protected String Nama; // Nama karyawan
    protected String jenisKelamin; // Jenis kelamin karyawan
    protected String noPegawai; // Nomor pegawai karyawan
    protected boolean menikah; // Status pernikahan (true jika sudah menikah, false jika belum)

    // Konstruktor untuk menginisialisasi objek karyawan dengan informasi yang diberikan
    public Pegawai(String Nama, String jenisKelamin, String noPegawai, boolean menikah) {
        this.Nama = Nama;
        this.jenisKelamin = jenisKelamin;
        this.noPegawai = noPegawai;
        this.menikah = menikah;
    }

    // Metode untuk menghitung dan mengembalikan tunjangan karyawan
    public int getTunjangan() {
        if (menikah) {
            if (jenisKelamin.equalsIgnoreCase("Laki-laki")) {
                return 200000; // Tunjangan untuk karyawan pria yang sudah menikah
            } else {
                return 150000; // Tunjangan untuk karyawan wanita yang sudah menikah
            }
        } else {
            return 100000; // Tunjangan untuk karyawan yang belum menikah
        }
    }

    // Metode untuk menampilkan informasi karyawan
    public void toShow() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No Pegawai: " + noPegawai);
        System.out.println("Status Menikah: " + (menikah ? "Sudah Menikah" : "Belum Menikah"));
    }
}
