/*4. User
        Skriv en klasse kaldet User, der indeholder fornavn, efternavn, email og tlfnr.
        Skriv flg. metoder:
        • Konstruktør
        • Get og set metoder
        • toString metode
        • Skriv en equals metode baseret på email.
        Man skal kunne instantiere en User som kun har en email, fornavn og efternavn tilknyttet.
        • Skriv en klasse kaldet UserList, der indeholder en liste af User objekter.
        • Skriv en metode som skal hedde addUser i UserList, der tilføjer en User til listen, hvis der
        ikke allerede findes en med samme email.
        */


import java.util.ArrayList;

public class UserList {
    ArrayList<User> userArrayList = new ArrayList<>();

    public User addUser(User u) {

        userArrayList.add(u);
        return u;
    }

    @Override
    public String toString() {
        return "UserList" + userArrayList;
    }
}
