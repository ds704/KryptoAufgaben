public class Koinzidenzindex {
    public static void main(String[] args) {
            String chiffetext = "wtlfpqktzbgdxwjswcrfxwjrlcyladajwhraeszqvlqakhawsspfccozepyoqfrh.nfupxxlwbquqhxuctaipbdlaiuqjkdkgighxq.yfbawjplktfgeohyplaxhsijdywuubtzwsfhvoblyeaeszqwtlfpyohjnfmjhbiwwrfpqktzbgdxwjswcrfxwjrlcyeupjtztdgghcvodyqes";
            char[] chiffretextChar = chiffetext.toCharArray();
            int[] haufigkeit = new int[28];
        for (int i = 0; i < haufigkeit.length; i++) {
            haufigkeit[i] = 0;

        }
        for (int i = 0; i < chiffretextChar.length; i++) {
            switch (chiffretextChar[i]) {
                case 'a':
                    haufigkeit[1]++;
                    break;
                case 'b':
                    haufigkeit[2]++;
                    break;
                case 'c':
                    haufigkeit[3]++;
                    break;
                case 'd':
                    haufigkeit[4]++;
                    break;
                case 'e':
                    haufigkeit[5]++;
                    break;
                case 'f':
                    haufigkeit[6]++;
                    break;
                case 'g':
                    haufigkeit[7]++;
                    break;
                case 'h':
                    haufigkeit[8]++;
                    break;
                case 'i':
                    haufigkeit[9]++;
                    break;
                case 'j':
                    haufigkeit[10]++;
                    break;
                case 'k':
                    haufigkeit[11]++;
                    break;
                case 'l':
                    haufigkeit[12]++;
                    break;
                case 'm':
                    haufigkeit[13]++;
                    break;
                case 'n':
                    haufigkeit[14]++;
                    break;
                case 'o':
                    haufigkeit[15]++;
                    break;
                case 'p':
                    haufigkeit[16]++;
                    break;
                case 'q':
                    haufigkeit[17]++;
                    break;
                case 'r':
                    haufigkeit[18]++;
                    break;
                case 's':
                    haufigkeit[19]++;
                    break;
                case 't':
                    haufigkeit[20]++;
                    break;
                case 'u':
                    haufigkeit[21]++;
                    break;
                case 'v':
                    haufigkeit[22]++;
                    break;
                case 'w':
                    haufigkeit[23]++;
                    break;
                case 'x':
                    haufigkeit[24]++;
                    break;
                case 'y':
                    haufigkeit[25]++;
                    break;
                case 'z':
                    haufigkeit[26]++;
                    break;
                case '.':
                    haufigkeit[27]++;
                    break;
                default:
                    System.out.println("Hier gibt es ein Problem");
                    break;

            }


        }
        double ergebnis = 0;
        double zwischenergebnis;
        for (int j = 1; j < haufigkeit.length; j++) {


            zwischenergebnis = (haufigkeit[j] * haufigkeit[j])/ 212.0;

            System.out.println("                  "+haufigkeit[j]);
            System.out.println(zwischenergebnis);
            ergebnis = ergebnis + zwischenergebnis;

        }
        System.out.println("Der Koinzidenzfaktor liegt bei: "+ergebnis);
        System.out.println(chiffretextChar.length);
    }
}
