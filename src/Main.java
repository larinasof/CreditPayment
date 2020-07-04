public class Main {
    public static void main (String [] args){
        CreditPaymentService service = new CreditPaymentService();

        int monthPaymentForOneYear = service.calculate (12);
        System.out.println(monthPaymentForOneYear);

        int monthPaymentForTwoYears = service.calculate(24);
        System.out.println(monthPaymentForTwoYears);

        int monthPaymentForThreeYears = service.calculate(36);
        System.out.println(monthPaymentForThreeYears);
    }
}
