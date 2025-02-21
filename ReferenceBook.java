package O_Exercise1;
 
import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book{
  rivate double tax;
  public ReferenceBook(String bookId, String publisher, Date entryDate, doubleunitPrice, double quantity, double tax) {
    super(bookId, publisher, entryDate, unitPrice, quantity);
    this.tax = tax;
  }
  public ReferenceBook(){}
  
  public double getTax() { return tax; }
  public void setTax(double tax) { this.tax = tax; }

  public void addBook() {
    Scanner scanner = new Scanner(System.in);
    super.addBook();
    System.out.print("Enter Tax: ");
    setTax(scanner.nextDouble());
    System.out.println("ReferenceBook added successfully.");
  }

  public void updateBook(String id) {
    if (getBookId().equals(id)) {
      Scanner scanner = new Scanner(System.in);
      super.updateBook(id);System.out.print("Enter new Tax: ");
      setTax(scanner.nextDouble());
      System.out.println("ReferenceBook updated successfully.");
    } else {
      System.out.println("Not found ID " + id);
    }
  }

  public void displayBook() {
    super.displayBook();
    System.out.println("Tax: " + getTax());
  }
}