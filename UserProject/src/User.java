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


import java.util.Objects;

public class User {
    String fornavn;
    String efternavn;
    String email;
    int tlfnr;

    public User(String fornavn, String efternavn, String email) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.email = email;
        this.tlfnr = tlfnr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "fornavn= " + fornavn +
                " efternavn=" + efternavn +
                " email= '" + email;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(int tlfnr) {
        this.tlfnr = tlfnr;
    }
}
