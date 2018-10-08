
package pbo3.pkg10117110.latihan40warnakepribadian;

import java.util.Scanner;

public class Warna {
    
    public String namaWarna;
    Scanner scan = new Scanner(System.in);
    // kode text color
        public static final String RESET = "\u001B[0m";
        public static final String NORMAL = "\u001b[0m";
        public static final String BLACK = "\u001b[30m";
        public static final String RED = "\u001b[31m";
        public static final String GREEN = "\u001b[32m";
        public static final String YELLOW = "\u001b[33m";
        public static final String BLUE = "\u001b[34m";
        public static final String MAGENTA = "\u001b[35m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001b[36m";
        public static final String WHITE = "\u001b[37m";
        public static final String BLINK = "\u001b[5m";
        
    //    kode background color
        public static final String BLACK_BACKGROUND = "\u001B[40m";
        public static final String RED_BACKGROUND = "\u001B[41m";
        public static final String GREEN_BACKGROUND = "\u001B[42m";
        public static final String YELLOW_BACKGROUND = "\u001B[43m";
        public static final String BLUE_BACKGROUND = "\u001B[44m";
        public static final String PURPLE_BACKGROUND = "\u001B[45m";
        public static final String CYAN_BACKGROUND = "\u001B[46m";
        public static final String WHITE_BACKGROUND = "\u001B[47m";
        
        
            public void menampilkanTemplate() {
        //        teksnya
        System.out.print(RED+"YUK "+RESET);
        System.out.print(GREEN+"CEK "+RESET);
        System.out.print(YELLOW+"KEPRIBADIANMU "+RESET);
        System.out.print(CYAN+"DARI "+RESET);
        System.out.print(PURPLE+"WARNA "+RESET);
        System.out.print(BLUE+"FAVORITMU "+RESET+"\n");
        //        teks + backgroundnya
        System.out.print("\n"+RED_BACKGROUND+WHITE+"\t MERAH \t\t\n"+RESET);
        System.out.print(GREEN_BACKGROUND+WHITE+"\t HIJAU \t\t\n"+RESET);
        System.out.print(YELLOW_BACKGROUND+WHITE+"\t KUNING \t\n"+RESET);
        System.out.print(BLUE_BACKGROUND+WHITE+"\t BIRU \t\t\n"+RESET);
        System.out.print(PURPLE_BACKGROUND+WHITE+"\t UNGU \t\t\n\n"+RESET);
    }

    public void pilihWarnaFavorit(){
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        namaWarna = scan.next();
    }

    public void tesKepribadian(String parWarna, String parUser){
        String warna = parWarna.toUpperCase();

        System.out.print("Warna Favoritmu adalah");
        switch (warna) {
            case "MERAH":
                System.out.print(RED+" MERAH \n"+RESET);
                System.out.println("1. Periang,\n"
                        + "2. Pemberani,\n"
                        + "3. Berani mengambil risiko dalam setiap langkah,\n"
                        + "4. Menyukai tantangan,\n"
                        + "5. Kurang sabar,\n"
                        + "6. Dapat menahan marah namun jika sudah tahap puncak "
                        + "toleransi, kemarahannya akan sulit dikontrol,\n"
                        + "7. Memiliki energi kehangatan dan cinta."
                );
                break;
            case "HIJAU":
                System.out.print(GREEN+" HIJAU \n"+RESET);
                System.out.println("1. Romantis,\n"
                        + "2. Menyukai hal yang berbau alami dan keindahan,\n"
                        + "3. Teguh pada prinsip,\n"
                        + "4. Menginginkan kesempurnaan,\n"
                        + "5. Mudah cemburu,\n"
                        + "6. Mudah merasa iri,\n"
                        + "7. Menjunjung tinggi suatu nilai toleransi dan "
                        + "kepercayaan."
                );
                break;
            case "KUNING":
                System.out.print(YELLOW+" KUNING \n"+RESET);
                System.out.println("1. Optimis,\n"
                        + "2. Suka bergaul,\n"
                        + "3. Periang,\n"
                        + "4. Senang menolong,\n"
                        + "5. Lincah dan aktif,\n"
                        + "6. Tidak suka meremehkan kekurangan orang lain,\n"
                        + "7. Loyal,\n"
                        + "8. Hangat,\n"
                        + "9. Meskipun karakternya optimis dan idealis,"
                        + "seringkali goyah dan tidak stabil,\n"
                        + "10. Cenderung penakut."
                );
                break;
            case "BIRU":
                System.out.print(BLUE+" BIRU \n"+RESET);
                System.out.println("1. Menyenangkan,\n"
                        + "2. Bijaksana,\n"
                        + "3. Pembawaan diri tenang saat menghadapi masalah,\n"
                        + "4. Dinamis,\n"
                        + "5. Senang berbagi,\n"
                        + "6. Bersahabat,\n"
                        + "7. Tidak terlalu suka menjadi sorotan banyak orang,\n"
                        + "8. Menyembunyikan perasaan karena karakternya yang cenderung"
                        + "mencari jalan damai."
                );
                break;
            case "UNGU":
                System.out.print(PURPLE+" UNGU \n"+RESET);
                System.out.println("1. Optimis,\n"
                        + "2. TIdak pernah ragu,\n"
                        + "3. Menurutnya pasangan yang ideal adalah yang "
                        + "memiliki mental yang kuat,\n"
                        + "4. Memiliki ambisi yang besar,\n"
                        + "5. Memiliki empati yang besar,\n"
                        + "6. Memiliki sisi misterius sebab seringkali menutupi "
                        + "perasaannya,\n"
                        + "7. Terkadang bersikap keras kepala dan angkuh."
                );
                break;
            default:
                System.out.println(" Oops.. Belum Terdefinisikan");
                break;
        }
    }
    
}
