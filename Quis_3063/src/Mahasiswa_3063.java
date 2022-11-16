public class Mahasiswa_3063 extends Penduduk_3063 {
    String nim_3063;
    float ipk_3063;
    boolean beasiswa_3063;
  
    public void tampilDataMahasiswa_3063 () {
      super.tampilDataPenduduk_3063();
      System.out.println("NIK                 : " + nik_3063);
      System.out.println("Nama                : " + nama_3063);
      System.out.println("Umur                : " + umur_3063);
      System.out.println("Alamat              : " + alamat_3063);
      System.out.println("NIM                 : " + nim_3063);
      System.out.println("IPK                 : " + ipk_3063);
      tampilDataBeasiswa_3063();
    }
  
    public void tampilDataMahasiswa_3063_2 () {
      super.tampilDataPenduduk_3063();
      System.out.println("NIK                 : " + nik_3063);
      System.out.println("Nama                : " + nama_3063);
      System.out.println("Umur                : " + umur_3063);
      System.out.println("Alamat              : " + alamat_3063);
      System.out.println("NIM                 : " + nim_3063);
      System.out.println("IPK                 : " + ipk_3063);
      tampilDataBeasiswa_3063();
    }
  
    public void tampilDataBeasiswa_3063 () {
      if (ipk_3063 > 3.5) {
        beasiswa_3063 = true;
        System.out.println("Mahasiswa bernama " + nama_3063 + " berhak mendapatkan beasiswa");
      }
      else if (ipk_3063 < 3.5) {
        beasiswa_3063 = false;
        System.out.println("Mahasiswa bernama " + nama_3063 + " tidak berhak mendapatkan beasiswa");
      }
    }
  }
  