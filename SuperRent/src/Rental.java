
import java.util.Objects;
import java.util.ArrayList;

public class Rental {

    private Date rental_Date;
    private ArrayList<RentalInfo> rentals;

    public void rentItem(Date dueDate, Date dateReturned, Member member, Item item, Store store){

        RentalInfo rentalInformation = new RentalInfo(dueDate, dateReturned, member, item, store);
        rentals.add(rentalInformation);


    }

    public int feeDueNow(Title title){

        return title.getRentalFee();

    }

    //constructors

    public Rental(Date rental_Date) {

        this.rental_Date = rental_Date;
        rentals = new ArrayList<RentalInfo>();

    }

    //setters and getters

    public Date getRental_Date() {
        return rental_Date;
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



