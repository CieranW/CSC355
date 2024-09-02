public class Main {
   public static void main(String[] args) {
      SelfPayKiosk kiosk = new SelfPayKiosk();

      // Test basic operations
      kiosk.scanItem(20.49); //change it to receive the input from the user
      kiosk.checkOut();
      kiosk.makePayment(25.20);
      System.out.println("Number of customers: " + kiosk.getNumCustomers());
      System.out.printf("Amount due: %.2f\n", kiosk.getAmountDue());
      System.out.printf("Total Sales: %.2f\n", kiosk.getTotalSales());

      // Add statements as methods are completed to support development mode testing


      // Test simulateSales()
      kiosk.resetKiosk();
      kiosk.simulateSales(100, 5, 2.5); //change it to receive the input from the user
      System.out.println("Number of customers: " + kiosk.getNumCustomers());
      System.out.printf("Amount due: %.2f\n", kiosk.getAmountDue());
      System.out.printf("Total Sales: %.2f\n", kiosk.getTotalSales());
   }
}
