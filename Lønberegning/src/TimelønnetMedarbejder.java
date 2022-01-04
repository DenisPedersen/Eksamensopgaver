public class TimelønnetMedarbejder implements Betaling{
    int timer;
    int løn;


    TimelønnetMedarbejder(int timer, int løn) {
        this.timer = timer;
        this.løn = løn;
    }
    @Override
    public double beregnLøn() {
        int udbetaling = timer * løn;
        System.out.println("Medarbejderen har arbejdet " + timer + " timer, til kr: " + løn + " i timen. Han får derfor " + udbetaling + " kr udbetalt.");
        return udbetaling;
    }
}
