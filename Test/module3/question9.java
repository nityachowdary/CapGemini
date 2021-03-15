package module3;
import java.time.LocalDate;
import java.time.Period;
public class question9 {

public static void main(String[] args) {

  LocalDate presentdate = LocalDate.of(2021, 03, 05);
       LocalDate now = LocalDate.now();

       Period diff = Period.between(presentdate, now);

    System.out.printf("\nDifference is %d years, %d months and %d days old\n\n",
                   diff.getYears(), diff.getMonths(), diff.getDays());
 }
}
