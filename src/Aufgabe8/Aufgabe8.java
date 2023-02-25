package Aufgabe8;

public class Aufgabe8 {
    public static void main(String[] args) {
        String chiffetext = "wtlfpqktzbgdxwjswcrfxwjrlcyladajwhraeszqvlqakhawsspfccozepyoqfrh.nfupxxlwbquqhxuctaipbdlaiuqjkdkgighxq.yfbawjplktfgeohyplaxhsijdywuubtzwsfhvoblyeaeszqwtlfpyohjnfmjhbiwwrfpqktzbgdxwjswcrfxwjrlcyeupjtztdgghcvodyqes";
        char[] chiffretextChar = chiffetext.toCharArray();
        int[] frequenz = new int[196700];
        for (int i = 0; i < (chiffretextChar.length-2); i++) {
        frequenz[toStellenwert(chiffretextChar[i], chiffretextChar[i+1], chiffretextChar[i+2])]++;


        }
        for (int i = 0; i < frequenz.length; i++) {
            if(frequenz[i] > 2)
            {
                System.out.println("Es wurde eine Sequenz Nr. "+i + " gefunden Anzahl: "+frequenz[i]);
            }

        }
    }

    public static int toStellenwert (char a, char b, char c)
    {
        char[] bustaben = {a, b, c};
        int[] zahlwert = new int[3];
        for (int i = 0; i < 3 ; i++) {


            switch (bustaben[i]){
                case 'a':
                    zahlwert[i] = 1;
                    break;
                case 'b':
                    zahlwert[i] = 2;
                    break;
                case 'c':
                    zahlwert[i] = 3;
                    break;
                case 'd':
                    zahlwert[i] = 4;
                    break;
                case 'e':
                    zahlwert[i] = 5;
                    break;
                case 'f':
                    zahlwert[i] = 6;
                    break;
                case 'g':
                    zahlwert[i] = 7;
                    break;
                case 'h':
                    zahlwert[i] = 8;
                    break;
                case 'i':
                    zahlwert[i] = 9;
                    break;
                case 'j':
                    zahlwert[i] = 10;
                    break;
                case 'k':
                    zahlwert[i] = 11;
                    break;
                case 'l':
                    zahlwert[i] = 12;
                    break;
                case 'm':
                    zahlwert[i] = 13;
                    break;
                case 'n':
                    zahlwert[i] = 14;
                    break;
                case 'o':
                    zahlwert[i] = 15;
                    break;
                case 'p':
                    zahlwert[i] = 16;
                    break;
                case 'q':
                    zahlwert[i] = 17;
                    break;
                case 'r':
                    zahlwert[i] = 18;
                    break;
                case 's':
                    zahlwert[i] = 19;
                    break;
                case 't':
                    zahlwert[i] = 20;
                    break;
                case 'u':
                    zahlwert[i] = 21;
                    break;
                case 'v':
                    zahlwert[i] = 22;
                    break;
                case 'w':
                    zahlwert[i] = 23;
                    break;
                case 'x':
                    zahlwert[i] = 24;
                    break;
                case 'y':
                    zahlwert[i] = 25;
                    break;
                case 'z':
                    zahlwert[i] = 26;
                    break;
                case '.':
                    zahlwert[i] = 27;
                    break;
                default:
                    System.out.println("Hier gibt es ein Problem");
                    break;
            }

        }
        int Ergebnis = zahlwert[0] * 28*28 +zahlwert[1]*28+1+zahlwert[2];
        return Ergebnis;
    }
}
