import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa_3063 mahasiswa_3063_1 = new Mahasiswa_3063();
        Mahasiswa_3063 mahasiswa_3063_2 = new Mahasiswa_3063();
        Dosen_3063 dosen_3063_1 = new Dosen_3063();
        Dosen_3063 dosen_3063_2 = new Dosen_3063();

        System.out.println("NIK                 : ");
        mahasiswa_3063_1.nik_3063 = input.next();
        System.out.println("Nama                : ");
        mahasiswa_3063_1.nama_3063 = input.next();
        System.out.println("Umur                : ");
        mahasiswa_3063_1.umur_3063 = input.nextInt();
        System.out.println("Alamat              : ");
        mahasiswa_3063_1.alamat_3063 = input.next();
        System.out.println("NIM                 : ");
        mahasiswa_3063_1.nim_3063 = input.next();
        System.out.println("IPK                 : ");
        mahasiswa_3063_1.ipk_3063 = input.nextInt();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        mahasiswa_3063_2.nik_3063 = input.next();
        System.out.println("Nama                : ");
        mahasiswa_3063_2.nama_3063 = input.next();
        System.out.println("Umur                : ");
        mahasiswa_3063_2.umur_3063 = input.nextInt();
        System.out.println("Alamat              : ");
        mahasiswa_3063_2.alamat_3063 = input.next();
        System.out.println("NIM                 : ");
        mahasiswa_3063_2.nim_3063 = input.next();
        System.out.println("IPK                 : ");
        mahasiswa_3063_2.ipk_3063 = input.nextInt();
        

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("DATA MAHASISWA");
        mahasiswa_3063_1.tampilDataBeasiswa_3063();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        mahasiswa_3063_2.tampilDataMahasiswa_3063_2();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        dosen_3063_1.nik_3063 = input.next();
        System.out.println("Nama                : ");
        dosen_3063_1.nama_3063 = input.next();
        System.out.println("Umur                : ");
        dosen_3063_1.umur_3063 = input.nextInt();
        System.out.println("Alamat              : ");
        dosen_3063_1.alamat_3063 = input.next();
        System.out.println("NIDN                 : ");
        dosen_3063_1.nidn_3063 = input.next();
        System.out.println("Golongan                 : ");
        dosen_3063_1.gol_3063 = input.next();
        System.out.println("Gaji Pokok              : " + dosen_3063_1.gajiPokok_3063);
        // dosen_3063_1.gajiPokok_3063 = input.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        dosen_3063_1.nik_3063 = input.next();
        System.out.println("Nama                : ");
        dosen_3063_1.nama_3063 = input.next();
        System.out.println("Umur                : ");
        dosen_3063_1.umur_3063 = input.nextInt();
        System.out.println("Alamat              : ");
        dosen_3063_1.alamat_3063 = input.next();
        System.out.println("NIDN                 : ");
        dosen_3063_1.nidn_3063 = input.next();
        System.out.println("Golongan                 : ");
        dosen_3063_1.gol_3063 = input.next();
        System.out.println("Gaji Pokok              : " + dosen_3063_2.gajiPokok_3063);
        // dosen_3063_1.gajiPokok_3063 = input.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("DATA DOSEN");
        dosen_3063_1.tampilDataDosen_3063_1();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        dosen_3063_2.tampilDataDosen_3063_2();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        

        

    }
}
