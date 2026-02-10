class TaxCalc {
    double calculateTax(double gross) {
        return gross * 0.15;
    }

    double calculateNetPay(int hours) {
        double gross = hours * 12;
        double tax = calculateTax(gross);
        return gross - tax;
    }

    public static void main(String args[]) {
        TaxCalc obj = new TaxCalc();
        int hoursWorked = 40;
        System.out.println("Net pay is- " + obj.calculateNetPay(hoursWorked));
    }
}
