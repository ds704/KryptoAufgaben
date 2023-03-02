package Aufgabe10;


import static java.lang.Long.toBinaryString;

public class Zufallszahlengenerator {
    public static void main(String[] args) {
        System.out.println("Zufallszahl: "+zufallsZahl(191, 167, 599, 100)+ " mit der Länge: "+zufallsZahl(191, 167, 599, 100).length());
        //System.out.println("runtest hat ergeben: "+ runtest(toBinaryString(zufallsZahl(191, 167,599, 100)))+ " von Standartmäßig: "+ normalRun(100));
        //testfurVerschiebung();
    }

    public static String  zufallsZahl (int p, int q, int s, int l){
        /*int n = p*q;
        int x0 = (s*s)%n;
        char[] ergebnis = new char[1000];
        int testNr = 0;
        for (int i = 0; i <= l; i++) {
            x0 = (x0*x0)%n;
            if(x0%2 == 0) {
                ergebnis[i] = 0;
                testNr++;
            }else {
                ergebnis[i] = 1;
            }



        }
        System.out.println("testNr. "+ testNr);
        return ergebnis.toString();*/
        return " ";
    }

    public static void testfurVerschiebung(){
        int i = 2;
        i = i << 2;
        System.out.println(i);
    }

    public static int normalRun(int l)
    {
        return l/2 +1;
    }

    public  static int runtest(String zufallsZahl_Parameter)
    {
        char [] zufallsZahl = zufallsZahl_Parameter.toCharArray();
        int vorherigesBit;
        int run = 0;
        run++;
        vorherigesBit = zufallsZahl[0];
        for (int i = 1; i < zufallsZahl.length; i++) {

                if(vorherigesBit != zufallsZahl[i])
                {
                    run++;
                    vorherigesBit = zufallsZahl[i];
                }
            }

        return run;
    }
}
