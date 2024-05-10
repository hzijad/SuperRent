import java.util.Date;
import java.util.Objects;

public class Rental {

    private Date rental_Date;

    public Date getRental_Date() {
        return rental_Date;
    }
    public void rentItem(Date date, Item item){
        this.rental_Date = date;

    }
    public void setRental_Date(Date rental_Date) {
        this.rental_Date = rental_Date;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rental_Date=" + rental_Date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental rental = (Rental) o;
        return Objects.equals(rental_Date, rental.rental_Date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rental_Date);
    }
}



