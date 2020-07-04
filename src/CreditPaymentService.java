public class CreditPaymentService {
    public int calculate (int amountOfMonths){
        float monthRate = (float) (9.99 / 12 / 100);
        int creditAmount = 1_000_000;
        float coefficient = (float) (monthRate * Math.pow(1+monthRate,amountOfMonths) / (Math.pow(1+monthRate, amountOfMonths) - 1));
        int monthPayment = (int) (coefficient * creditAmount);
        return monthPayment;
    }
}
