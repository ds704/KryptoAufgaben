package Aufgabe8;

public class Bruteforce {

    public static int HaufgisterBustabeInDeutsch = 4;
    public static void main(String[] args) {

        int vermuteteSchlussellange = 6;
        String chiffetext = "rfafgjnvbslnffwhsazdjzfysonfvvwamljdmyxwencgjnvbs";//"wtlfpqktzbgdxwjswcrfxwjrlcyladajwhraeszqvlqakhawsspfccozepyoqfrh.nfupxxlwbquqhxuctaipbdlaiuqjkdkgighxq.yfbawjplktfgeohyplaxhsijdywuubtzwsfhvoblyeaeszqwtlfpyohjnfmjhbiwwrfpqktzbgdxwjswcrfxwjrlcyeupjtztdgghcvodyqes";
        char[] chiffretextChar = chiffetext.toCharArray();
        char[][] chiffreaufgespalten = new char[vermuteteSchlussellange][217];

        for (int i = 1; i <= vermuteteSchlussellange; i++) {
            System.out.println("Versuch mit einer Vermuteten Schlüssellänge von: "+i+" Zeichen!");
            dechiffrieren(chiffetext, i);
        }
    }

    public static void dechiffrieren (String chiffre, int schlusselLange)
    {
        char[][] chiffreCharAufgeteilt = new char[schlusselLange][212];
        char[] chiffreChar = chiffre.toCharArray();
        for (int i =0; i< chiffreChar.length; i++) {
            if(i>0) {
                chiffreCharAufgeteilt[i % schlusselLange][(i - (i % schlusselLange)) / schlusselLange] = chiffreChar[i];
            }else {
                chiffreCharAufgeteilt[0][i] = chiffreChar[i];
            }
        }
        //String Ergbnis = null;


            char[] Ergebnis = new char[212];
            char[][] zwischenSpeicher = new char[schlusselLange][212];
            for (int j = 0; j < schlusselLange; j++) {
                zwischenSpeicher[j] = zahleBustaben(chiffreCharAufgeteilt[j]);
            }
        for (int j = 0; j < Ergebnis.length; j++) {
            Ergebnis[j] = zwischenSpeicher[j%schlusselLange][(j-(j%schlusselLange))/schlusselLange];
        }
        System.out.println("Das Ergebnis lautet: ");
        for (int i = 0; i < Ergebnis.length; i++) {
            System.out.print(Ergebnis[i]);

        }


    }
    public static char[] zahleBustaben(char[] chiffreParameter)
    {
        int laengeChiffre = 0;
        char[] ErgebnisChar = new char[212];
        int ErgebnisCharZaehler = 0;
        char[] chiffre = chiffreParameter;
        for (int i = 0; i < chiffre.length; i++) {
            if(chiffre[i] != -1)
            {
                laengeChiffre = i;
            }

        }
        int[] chiffreIntCounter = new int[28];
        for (int i = 0; i <= laengeChiffre; i++) {
            if(charToInt(chiffre[i]) == -1)
            {
                //System.out.println("Der Fehler sitzt an der Stelle: "+i);
                i = 100000000;

            }else {


                chiffreIntCounter[charToInt(chiffre[i])]++;
            }

        }
        //die Höchsten Zwei Zahlen finden
        int[] hochesteZahlen = new int[2];
        int hochsteZahl1 = 0;
        int hochsteZahl2 = 0;
        for (int i = 0; i < chiffreIntCounter.length; i++) {
            if(chiffreIntCounter[i] > hochesteZahlen[0])
            {
                hochesteZahlen[1] = hochesteZahlen[0];
                hochsteZahl2 = hochsteZahl1;
                hochsteZahl1 = i;
                hochesteZahlen[0] = chiffreIntCounter[i];
            } else if (chiffreIntCounter[i] > hochesteZahlen[1]) {
                hochesteZahlen[1] = chiffreIntCounter[i];
                hochsteZahl2 = i;

            }

        }
        //System.out.println("Nächste Reihe: ");
        //System.out.println("Der Bustabe: "+intToChar(hochsteZahl1)+ " wurde am häufigsten getippt!");
        //System.out.println("Der Bustabe: "+ intToChar(hochsteZahl2)+" wurde am zweithäufgisten verwendet!");
        // ab hier gilt es nur noch für die Schlüsselwortlänge eins.
        //System.out.println("Ein Möglicher Versuch lautet: ");
        for (int i = 0; i < chiffre.length; i++) {
            char c = intToChar(enc(charToInt(chiffre[i]), berechneVerschiebung(hochsteZahl1)));
            //System.out.print(c);
            ErgebnisChar[ErgebnisCharZaehler] = c;
            ErgebnisCharZaehler++;

        }
        //System.out.println();
        //System.out.println("Fertig!");


        return ErgebnisChar;
    }

    public static int berechneVerschiebung(int haufigsterBustabe_Parameter)
    {
        return HaufgisterBustabeInDeutsch-haufigsterBustabe_Parameter;
    }

    public static int enc(int chiffre, int verschiebung)
    {
        int ergebnis = chiffre + verschiebung;
        if (ergebnis >26)
        {
            ergebnis = ergebnis - 26;
        }else if (ergebnis< 0)
        {
            ergebnis = ergebnis + 26;
        }

        return ergebnis;
    }
    public static int charToInt(char c)
    {

        switch (c){
            case 'a':
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
            case 'd':
                return 3;
            case 'e':
                return 4;
            case 'f':
                return 5;
            case 'g':
                return 6;
            case 'h':
                return 7;
            case 'i':
                return 8;
            case 'j':
                return 9;
            case 'k':
                return 10;
            case 'l':
                return 11;
            case 'm':
                return 12;
            case 'n':
                return 13;
            case 'o':
                return 14;
            case 'p':
                return 15;
            case 'q':
                return 16;
            case 'r':
                return 17;
            case 's':
                return 18;
            case 't':
                return 19;
            case 'u':
                return 20;
            case 'v':
                return 21;
            case 'w':
                return 22;
            case 'x':
                return 23;
            case 'y':
                return 24;
            case 'z':
                return 25;
            case '.':
                return 26;
            default:
                //System.out.println("Hier gibt es ein Problem bei dem Zeichen: "+c);
                return -1;
        }
    }

    public static char intToChar(int zahl)
    {

        switch (zahl){
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
                System.out.println("Hier gibt es ein Problem");
                return 28;
        }
    }

}
