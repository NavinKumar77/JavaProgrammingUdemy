public class MegaBytes {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);

    }
    public static void printMegaBytesAndKiloBytes(int KiloBytes){
        if (KiloBytes < 0){
            System.out.println("InvalidValue");
        }
        else{
            int megabytes = (KiloBytes/1024);
            int KiloRemainder = KiloBytes%1024;

            System.out.println(KiloBytes+" KB = "+megabytes+" MB and "+KiloRemainder+" KB");

        }
    }

}
