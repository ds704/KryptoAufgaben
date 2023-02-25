package Aufgabe8;

public class Bruteforce {
    public static void main(String[] args) {


        String chiffetext = "wtlfpqktzbgdxwjswcrfxwjrlcyladajwhraeszqvlqakhawsspfccozepyoqfrh.nfupxxlwbquqhxuctaipbdlaiuqjkdkgighxq.yfbawjplktfgeohyplaxhsijdywuubtzwsfhvoblyeaeszqwtlfpyohjnfmjhbiwwrfpqktzbgdxwjswcrfxwjrlcyeupjtztdgghcvodyqes";
        char[] chiffretextChar = chiffetext.toCharArray();
        char[][] chiffreaufgespalten = new char[107][217];

        for (int i = 0; i < 107; i++) {
            for (int j = 0; j < chiffretextChar.length; j++) {
                //chiffreaufgespalten[i][?] =+ chiffretextChar[j];
            }
        }
    }

    public static String dechiffrieren (String chiffre, int schlusselLange)
    {
        char[][] chiffreCharAufgeteilt = new char[schlusselLange][217];
        char[] chiffreChar = chiffre.toCharArray();
        for (int i =0; i< chiffreChar.length; i++) {
            chiffreCharAufgeteilt[i % schlusselLange][(i - (i % schlusselLange)) / schlusselLange] = chiffreChar[i];
        }
        String Ergbnis = null;


            for (int j = 0; j < schlusselLange; j++) {

                zahleBustaben(chiffreCharAufgeteilt[j]);


            }


    }
    public static void zahleBustaben(char[] chiffreParameter)
    {
        int laengeChiffre = 0;
        char[] chiffre = chiffreParameter;
        for (int i = 0; i < chiffre.length; i++) {
            if(chiffre[i] == null)
            {
                laengeChiffre = i;
            }

        }


    }

    public static int charToInt(char c)
    {

        switch (c){
            case 'a':
                return 0;
                break;
            case 'b':
                return 1;
                break;
            case 'c':
                return 2;
                break;
            case 'd':
                return 3;
                break;
            case 'e':
                return
                break;
            case 'f':
                return;
                break;
            case 'g':
                return;
                break;
            case 'h':
                return;
                break;
            case 'i':
                return;
                break;
            case 'j':
                return;
                break;
            case 'k':
                return;
                break;
            case 'l':
                return;
                break;
            case 'm':
                return;
                break;
            case 'n':
                return;
                break;
            case 'o':
                return;
                break;
            case 'p':
                return;
                break;
            case 'q':
                return;
                break;
            case 'r':
                return;
                break;
            case 's':
                return;
                break;
            case 't':
                return;
                break;
            case 'u':
                return;
                break;
            case 'v':
                return;
                break;
            case 'w':
                return;
                break;
            case 'x':
                return;
                break;
            case 'y':
                return;
                break;
            case 'z':
                return;
                break;
            case '.':
                return 27;
                break;
            default:
                System.out.println("Hier gibt es ein Problem");
                break;
        }
    }

}
