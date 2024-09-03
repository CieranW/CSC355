public class SelfPayKiosk{
   private final double SALES_TAX = 0.07;
   private int numCustomers;
   private double totalSales;
   private double amountDue;

   // Constructor
   public SelfPayKiosk(){
      /* Complete the method */ 
      numCustomers = 0;
      totalSales = 0.0;
      amountDue = 0.0;
   } 

   // Return total daily sales    
   public double getTotalSales() {
      /* Update the return statment */        
      return totalSales;
   }

   // Return current amount due     
   public double getAmountDue() {
      /* Update the return statment */        
      return amountDue;
   }

   // Return number of customers served     
   public int getNumCustomers() {
      /* Update the return statment */        
      return numCustomers;
   } 

   // Scan one item  
   public void scanItem(double price) {   
      /* Complete the method */ 
      amountDue += price;
   }

   // Apply sales tax to current purchases
   public void checkOut() {
      /* Complete the method */ 
      amountDue += (amountDue * SALES_TAX);
   }

   // Cancel current purchases    
   public void cancelTransaction(){
      /* Complete the method */ 
   }

   // Reset register for the day    
   public void resetKiosk() {      
      /* Complete the method */ 
      numCustomers = 0;
      totalSales = 0.0;
      amountDue = 0.0;
   }  

   // Apply payment to amount due 
   public void makePayment(double payment) {
      /* Complete the method */ 
      if (payment >= amountDue) {
         totalSales += amountDue;
         numCustomers++;
         amountDue = 0.0;
      } else {
         totalSales += payment;
         amountDue -= payment;
      }
   }

   // Simulate multiple transactions
   public void simulateSales(int numSales, double initialPrice, double incrPrice) {
      /* Complete the method */ 
      for (int i = 0; i < numSales; i++) {
         scanItem(initialPrice);
         checkOut();
         makePayment(initialPrice + 1.0);
         initialPrice += incrPrice;
      }
   }
}