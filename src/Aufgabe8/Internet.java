package Aufgabe8;

import java.util.Arrays;
import java.util.Scanner;

//wtlfpqktzbgdxwjswcrfxwjrlcyladajwhraeszqvlqakhawsspfccozepyoqfrh{nfupxxlwbquqhxuctaipbdlaiuqjkdkgighxq{yfbawjplktfgeohyplaxhsijdywuubtzwsfhvoblyeaeszqwtlfpyohjnfmjhbiwwrfpqktzbgdxwjswcrfxwjrlcyeupjtztdgghcvodyqes

public class Internet extends Thread{


    public static Internet[] threadStack = new Internet[28];




        public static char[] crypt(char[] plain, char[] key, int direction) {

            char[] output = new char[plain.length];
            for (int i = 0; i < plain.length; i++) {
                //Verschluesseln
                if (direction == 1) {
                    //Umrechnen für ASCII Tabelle
                    int result = (plain[i] + key[i % key.length]-194) % 27 ;
                    output[i] = (char) (result+97);
                }
                //Entschluesseln
                else if (direction == 0){
                    int result;
                    if (plain[i] - key[i % key.length] < 0)
                    {
                        result = (plain[i]- key[i % key.length]+130) %27 + 97;
                    }
                    else
                    {
                        result = (plain[i] - key[i % key.length]) % 27 +97;
                    }
                    output[i] = (char) result;
                }
            }
            return output;
        }
    private int id;
        public Internet(int id_parameter)
        {
            id =id_parameter;
        }
        public static void main(String[] args) {

            /*Scanner scanner = new Scanner(System.in);
            System.out.println("Klartext eingeben:");*/


            for (int i = 0; i < 28; i++) {
                threadStack[i] = new Internet(i);
                threadStack[i].start();

            }
            /*char[] decrypted = crypt(plain, key, 0);
            System.out.println("Entschluesselter Text:");
            System.out.println(decrypted);
            scanner.close();*/
            System.out.println("Fertig");
        }

    @Override
    public void run() {
        String plaintext = "wtlfpqktzbgdxwjswcrfxwjrlcyladajwhraeszqvlqakhawsspfccozepyoqfrh{nfupxxlwbquqhxuctaipbdlaiuqjkdkgighxq{yfbawjplktfgeohyplaxhsijdywuubtzwsfhvoblyeaeszqwtlfpyohjnfmjhbiwwrfpqktzbgdxwjswcrfxwjrlcyeupjtztdgghcvodyqes";//scanner.nextLine(); //ohne Umlaute
        plaintext = plaintext.toLowerCase();
        char[] plain = plaintext.toCharArray();

            /*System.out.println("Schluesselwort eingeben:");
            String keyword = scanner.nextLine();
            keyword = keyword.toLowerCase();
            char[] key = keyword.toCharArray();*/

            /*char[] encrypted = crypt(plain, key, 1);
            System.out.println("Verschluesselter Text:");
            System.out.println(encrypted);*/
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','{'};
        String krypto = "krypto";
        String key = "";
        System.out.println("Thread nr. "+id+" ist gestartet");
        for (int i = id; i < 28; i++) {
            if(i>0) {
                key = key+alphabet[i - 1];
            }
            for (int j = 0; j < 28; j++) {
                System.out.println("Thread nr. " + id+" ist bei Nr.: "+j);
                if(j>0) {
                    key = key+alphabet[j- 1];
                }
                for (int k = 0; k < 28; k++) {
                    if(k>0) {
                        key = key+alphabet[k - 1];
                    }
                    for (int k1 = 0; k1 < 28; k1++) {
                        if(k1>0) {
                            key = key+alphabet[k1 - 1];
                        }
                    for (int l = 0; l < 28; l++) {
                        if(l>0) {
                            key = key+alphabet[l - 1];
                        }
                        for (int m = 0; m < 28; m++) {
                            if(m>0) {
                                key = key+alphabet[m - 1];
                            }
                            for (int n = 0; n < 28; n++) {
                                if (n > 0) {
                                    key = key + alphabet[n - 1];
                                }
                                for (int o = 0; o < 28; o++) {
                                    if (o > 0) {
                                        key = key + alphabet[o - 1];
                                    }
                                    if (key == "") {
                                        key = "a";
                                    }
                                    char[] keyChar = key.toCharArray();
                                    char[] decrypted = crypt(plain, keyChar, 0);
                                    // decrypted = "hallokryptoajsdf".toCharArray();
                                    for (int p = 0; p < decrypted.length - 4; p++) {
                                        if (decrypted[p] == 'e' & decrypted[p + 1] == 'i' & decrypted[p + 2] == 'n' & decrypted[p + 3] == 'e') {// && decrypted[p+4] == 't') {
                                            System.out.println("Entschluesselter Text:");
                                            System.out.println(decrypted);
                                        }
                                    }
                                    key = "";

                                }
                            }

                            }
                        }
                    }
                }
            }

        }
        System.out.println("Thread Nr.: "+id+" ist fertig!!!");
    }
}

