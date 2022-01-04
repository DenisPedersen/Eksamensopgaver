public class Main {
    public static void main(String[] args) {
        TimelønnetMedarbejder medarbejder1 = new TimelønnetMedarbejder(10, 5);
        medarbejder1.beregnLøn();
        ProvisionsMedarbejder provisionsMedarbejder1 = new ProvisionsMedarbejder(10000, 5000,20);
        provisionsMedarbejder1.beregnLøn();
    }
}
