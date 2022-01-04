public class ProvisionsMedarbejder implements Betaling{
     int grundløn;
     int salg;
     int provisionsProcent;

    ProvisionsMedarbejder(int grundløn, int salg, int provisionsProcent) {
        this.grundløn = grundløn;
        this.salg = salg;
        this.provisionsProcent = provisionsProcent;
    }



    @Override
    public double beregnLøn() {
        int udbetaling;
        int provisionTilUdbetaling = (salg* provisionsProcent/100);
        udbetaling = grundløn + provisionTilUdbetaling;
        System.out.println("Medarbejderen en grundløn på " + grundløn + ". Han har solgt for " + salg + " denne måned til en provision på : " + provisionsProcent + " procent af salget. Han får derfor " + udbetaling + " udbetalt");
        return udbetaling;
    }
}
