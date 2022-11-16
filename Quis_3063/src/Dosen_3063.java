public class Dosen_3063 extends Penduduk_3063 {
    String nidn_3063;
    String gol_3063;
    int gajiPokok_3063 = 5500000;
    double totalGaji;
    int tunjangan;
  
    public double totalPendapatan_3063 () {
      if (gol_3063 == "IIIA") {
        tunjangan = 300000;
      }
      else if (gol_3063 == "IIIB") {
        tunjangan = 500000;
      }
      else if (gol_3063 == "IIIC") {
        tunjangan = 700000;
      }
      return totalGaji = gajiPokok_3063 + tunjangan;
    }
  
    public void tampilDataDosen_3063_1 () {
      super.tampilDataPenduduk_3063();
      System.out.println("NIK                   : " + nik_3063);
      System.out.println("Nama                  : " + nama_3063);
      System.out.println("Umur                  : " + umur_3063);
      System.out.println("Alamat                : " + alamat_3063);
      System.out.println("NIDN                  : " + nidn_3063);
      System.out.println("Golongan              : " + gol_3063);
      System.out.println("Gaji Pokok            : " + gajiPokok_3063);
    }
  
    public void tampilDataDosen_3063_2 () {
      super.tampilDataPenduduk_3063();
      System.out.println("NIK                   : " + nik_3063);
      System.out.println("Nama                  : " + nama_3063);
      System.out.println("Umur                  : " + umur_3063);
      System.out.println("Alamat                : " + alamat_3063);
      System.out.println("NIDN                  : " + nidn_3063);
      System.out.println("Golongan              : " + gol_3063);
      System.out.println("Gaji Pokok            : " + gajiPokok_3063);
    }
  }
  