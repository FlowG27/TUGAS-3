/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.pbo12.pkg10116520.fajarabdulghani;

/**
 *
 * @author Flow
 *  Nama    : Fajar Abdul Ghani
 *  NIM     : 10116520
 *  Kelas   : PBO12
 */
class Mahasiswa {

    int nim;
    String name;

    void identitas() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Nama ke -" + i + "\t\t= " + name);
        }
        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke -" + j + "\t\t= " + nim + j);

        }
    }
}

class nilaiAkhir {
    //double uts = 45, uas = 34, quiz = 75;

    public double nUTS;
    public double nUAS;
    public double nQUIS;
    public char nIndeks;
    
    public double getUTS() {
        return nUTS;
    }

    public double getUAS() {
        return nUAS;
    }

    public double getQUIS() {
        return nQUIS;
    }

    public void setUTS(double nUTS) {
        this.nUTS = nUTS;
    }

    public void setUAS(double nUAS) {
        this.nUAS = nUAS;
    }

    public void setQUIS(double nQUIS) {
        this.nQUIS = nQUIS;
    }

    public double getNA() {
        double NA;
        NA = 0.2*nQUIS + 0.5*nUAS + 0.3*nUTS;
        return NA;
    }
    
    public char getIndeks() {
        char index;
        index='C';
        double NA = getNA();
        

        if (NA <= 100 && NA >= 80) {
            index = 'A';
        }
        if (NA < 80 && NA >= 68) {
            index = 'B';
        }
        if (NA < 67 && NA >= 56) {
            index = 'C';
        }
        if (NA < 56 && NA >= 45) {
            index = 'D';
        }
        if (NA < 45 && NA >=0) {
            index = 'E';
        }
        return index;
    }
    public String getKeterangan() {
        char index = getIndeks();
        switch (index) {
            case 'A':
                return "Sangat Baik";
            case 'B':
                return "Baik";
            case 'C':
                return "Cukup";
            case 'D':
                return "Kurang";
            case 'E':
                return "Sangat Kurang";
            default:
                return "Indeks Invalid";

        }

    }
}

    public class Tugas3PBO1210116520FajarAbdulGhani {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here

            Mahasiswa oMhs = new Mahasiswa();
            oMhs.nim = 10116520;
            oMhs.name = "Fajar Abdul Ghani";
            oMhs.identitas();

            nilaiAkhir oNilai = new nilaiAkhir();
            oNilai.setUTS(100);
            oNilai.setUAS(45);
            oNilai.setQUIS(73);
            
            System.out.println("==================================");
            System.out.println("Nilai UTS       = "+oNilai.getUTS());
            System.out.println("Nilai UAS       = "+oNilai.getUAS());
            System.out.println("Nilai QUIS      = "+oNilai.getQUIS());
            System.out.println("Nilai Akhir     = "+oNilai.getNA());
            System.out.println("Nilai Indeks    = "+oNilai.getIndeks());
            System.out.println("Keterangan      = "+oNilai.getKeterangan());
             
        }

    }
