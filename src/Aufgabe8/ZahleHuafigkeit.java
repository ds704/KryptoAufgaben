package Aufgabe8;

public class ZahleHuafigkeit {
    public static void main(String[] args) {
        String chiffetext =  "eegykvfynpcgwnexgh";
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
        for (int i = 1; i < haufigkeit.length; i++) {
            System.out.println("Der Bustabe: "+intToChar(i)+" kam "+ haufigkeit[i]+" mal vor!");

        }
    }
    public static char intToChar(int zahlenwert)
    {
        switch (zahlenwert) {
            case 1:
                return 'a';
            case 2:
                return 'b';
            case 3:
                return 'c';
            case 4:
                return 'd';
            case 5:
                return 'e';
            case 6:
                return 'f';
            case 7:
                return 'g';
            case 8:
                return 'h';
            case 9:
                return 'i';
            case 10:
                return 'j';
            case 11:
                return 'k';
            case 12:
                return 'l';
            case 13:
                return 'm';
            case 14:
                return 'n';
            case 15:
                return 'o';
            case 16:
                return 'p';
            case 17:
                return 'q';
            case 18:
                return 'r';
            case 19:
                return 's';
            case 20:
                return 't';
            case 21:
                return 'u';
            case 22:
                return 'v';
            case 23:
                return 'w';
            case 24:
                return 'x';
            case 25:
                return 'y';
            case 26:
                return 'z';
            case 27:
                return '.';
            default:
                return '-';

        }
    }
    }


