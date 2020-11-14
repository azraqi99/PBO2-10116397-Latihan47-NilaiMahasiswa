/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Nilai Mahasiswa 
 */
package pbo210116397latihan47nilaimahasiswa;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMhs nima = new NilaiMhs(60,80,75);
        
        System.out.println("QUIZ \t = "+nima.getQuiz());
        System.out.println("UTS \t = "+nima.getUts());
        System.out.println("UAS \t = "+nima.getUas());
        System.out.println("\nNilai Akhir = "+ nima.nilaiAkhir());
        System.out.println("\nIndex = "+ nima.indexNilai());
        System.out.println("Keterangan = "+ nima.ketereangan());
        
    }
    }
    

