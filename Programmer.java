//FAKHRI NAUFALDI RAMADHAN
//227064516035
public class Programmer extends Pegawai {
    private int lamaBekerja;
    private double gaji;

    // Konstruktor untuk kelas Programmer
    public Programmer(String Nama, String jenisKelamin, String noPegawai, boolean menikah, int lamaBekerja, double gaji) {
        // Memanggil konstruktor dari kelas Pegawai dengan menggunakan "super"
        super(Nama, jenisKelamin, noPegawai, menikah);
        // Menginisialisasi atribut lamaBekerja dan gaji
        this.lamaBekerja = lamaBekerja;
        this.gaji = gaji;
    }

    // Metode getBonus
    public double getBonus() {
        // Jika lama bekerja kurang dari 5 tahun, bonus adalah 5% dari gaji
        if (lamaBekerja < 5) {
            return 0.05 * gaji;
        } else { // Jika lama bekerja 5 tahun atau lebih, bonus adalah 10% dari gaji
            return 0.10 * gaji;
        }
    }

    // Override metode toShow() dari kelas Pegawai
    @Override
    public void toShow() {
        // Memanggil metode toShow() dari kelas Pegawai menggunakan "super"
        super.toShow();
        // Tidak ada implementasi tambahan di sini, hanya memanggil metode toShow() dari kelas Pegawai.
    }
}
