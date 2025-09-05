public class Uczen extends Osoba{
    private static int liczbaUczniow;
    private int nrUcznia;

    public Uczen(String nazwisko, String imie) {
        super(nazwisko, imie);
        liczbaUczniow++;
        this.nrUcznia = liczbaUczniow;
    }

    public int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    public void setLiczbaUczniow(int liczbaUczniow) {
        this.liczbaUczniow = liczbaUczniow;
    }

    public int getNrUcznia() {
        return nrUcznia;
    }

    public void setNrUcznia(int nrUcznia) {
        this.nrUcznia = nrUcznia;
    }

    @Override
    public String toString() {
        return "Uczen{" + getImie() + getNazwisko() +
                ", nrUcznia=" + nrUcznia +
                '}';
    }
}