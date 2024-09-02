public class CalculatorAdvanced {

  /* Type your code here. */
  private double value;

  public CalculatorAdvanced() {
    clear();
  }

  // Methods
  // Add, subtract, multiply, divide, clear, getValue
  public void add(double num) {
    value += num;
  }

  public void subtract(double num) {
    value -= num;
  }

  public void multiply(double num) {
    value *= num;
  }

  public void divide(double num) {
    value /= num;
  }

  public void clear() {
    value = 0;
  }

  public double getValue() {
    return value;
  }
}
