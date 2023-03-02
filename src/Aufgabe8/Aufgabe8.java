package Aufgabe8;

public class Aufgabe8 {
    public static void main(String[] args) {
        String chiffetext = "wtlfpqktzbgdxwjswcrfxwjrlcyladajwhraeszqvlqakhawsspfccozepyoqfrh.nfupxxlwbquqhxuctaipbdlaiuqjkdkgighxq.yfbawjplktfgeohyplaxhsijdywuubtzwsfhvoblyeaeszqwtlfpyohjnfmjhbiwwrfpqktzbgdxwjswcrfxwjrlcyeupjtztdgghcvodyqes";
        char[] chiffretextChar = chiffetext.toCharArray();
        int[] abstandCounter = new int[196700];
        int[][][][][] abstandSpeicher = new int[196700][200][200][200][200];
        int[] frequenz = new int[196700];
        for (int i = 0; i < (chiffretextChar.length-2); i++) {
        frequenz[toStellenwert(chiffretextChar[i], chiffretextChar[i+1], chiffretextChar[i+2])]++;


        }
        for (int i = 0; i < frequenz.length; i++) {
            if(frequenz[i] > 1)
            {
                char[] zwischenErgebnis = fromStellenwert(i);
                System.out.println("Es wurde eine Sequenz Nr. "+i + " Bustabe: "+zwischenErgebnis[0]+zwischenErgebnis[1]+zwischenErgebnis[2]+" gefunden Anzahl: "+frequenz[i]);
            }

        }
    }
    public static char[] fromStellenwert (int stellenwert_parameter)
    {
        char[] Ergebnis = new char[3];
        int[] zwischenzahl = new int[3];
        zwischenzahl[0] = (stellenwert_parameter-(stellenwert_parameter%(28*28)))/(28*28);
        Ergebnis[0] = intToChar(zwischenzahl[0]-1);
        int neueStellenwertzahl = stellenwert_parameter-zwischenzahl[0]*28*28;
        zwischenzahl[1] = ((stellenwert_parameter-zwischenzahl[0]*28*28)-((stellenwert_parameter-zwischenzahl[0]*28*28))%28)/28;
        Ergebnis[1] = intToChar(zwischenzahl[1]-1);
        zwischenzahl[2] = stellenwert_parameter-(zwischenzahl[1]*28+zwischenzahl[0]*28*28);
        Ergebnis[2] = intToChar(zwischenzahl[2]-2);
        return Ergebnis;
    }

    public static char intToChar (int zahl)
    {
    switch (zahl) {
        case 0:
            return 'a';
        case 1:
            return 'b';
        case 2:
            return 'c';
        case 3:
            return 'd';
        case 4:
            return 'e';
        case 5:
            return 'f';
        case 6:
            return 'g';
        case 7:
            return 'h';
        case 8:
            return 'i';
        case 9:
            return 'j';
        case 10:
            return 'k';
        case 11:
            return 'l';
        case 12:
            return 'm';
        case 13:
            return 'n';
        case 14:
            return 'o';
        case 15:
            return 'p';
        case 16:
            return 'q';
        case 17:
            return 'r';
        case 18:
            return 's';
        case 19:
            return 't';
        case 20:
            return 'u';
        case 21:
            return 'v';
        case 22:
            return 'w';
        case 23:
            return 'x';
        case 24:
            return 'y';
        case 25:
            return 'z';
        case 26:
            return '.';
        default:
            System.out.println("Hier gibt es ein Problem : "+zahl);
            return 28;
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
