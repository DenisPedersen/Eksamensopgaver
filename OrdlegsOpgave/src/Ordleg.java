import java.util.ArrayList;
/*
Skriv en klasse der hedder Ordleg.
        Skriv metoden gentagOrd der tager et parameter af typen ArrayList<String> og et parameter k af typen
        int, og har returtypen ArrayList<String>.
        Metoden skal returnere en ny ArrayList hvor hver String i input-arraylisten er gentaget k gange. Et kald til
        metoden med en ArrayList med elementerne ”Hello” og ”World” og et integer-argument med værdien 3
        skal returnere en ArrayList med elementerne ”Hello”, ”Hello”, ”Hello”, ”World”, ”World”, ”World”.
        Hvis k er 0 eller et negativt tal skal der kastes en exception. Der skal også kastes en exception hvis
        arraylisten der gives som parameter er null.
        Hvis du har tid …
        Skriv metoden sorteretOgTrimmet som tager en ArrayList af Strings som parameter, og returnerer en
        ny ArrayList af Strings som er sorteret efter Stringens længde, og hvor hver enkelt String ikke forekommer
        mere end én gang.
        Hvis arraylisten der gives som parameter er null kastes en exception.*/
public class Ordleg {

    public ArrayList<String>gentagOrd(ArrayList<String> ord, int k) {


        if (k < 0) {
            throw new IllegalArgumentException("Det er minus, din nar!");
        }

        if (ord == null) {
            throw new IllegalArgumentException("Din arrayliste er tom, noob!");
        }
            for (int i = 0; i < ord.size(); i++) {
                for (int j = 0; j < k; j++) {
                    System.out.println(ord.get(i));

                }

            }
            return ord;
            //System.out.println(ord);

        }


    public static void main(String[] args) {
        Ordleg ordleg = new Ordleg();
        ArrayList <String> NyeOrd = new ArrayList<>();
        NyeOrd.add("Hello");
        NyeOrd.add("World");
        ordleg.gentagOrd(NyeOrd, 3);

    }
}
