import java.util.Objects;

public class Game {

    private String producer;
    private int year;
    private int uniqueRentalFee;
    private double uniqueLateFee;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getUniqueRentalFee() {
        return uniqueRentalFee;
    }

    public void setUniqueRentalFee(int uniqueRentalFee) {
        this.uniqueRentalFee = uniqueRentalFee;
    }

    public double getUniqueLateFee() {
        return uniqueLateFee;
    }

    public void setUniqueLateFee(double uniqueLateFee) {
        this.uniqueLateFee = uniqueLateFee;
    }

    @Override
    public String toString() {
        return "Game{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                ", uniqueRentalFee=" + uniqueRentalFee +
                ", uniqueLateFee=" + uniqueLateFee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return year == game.year && uniqueRentalFee == game.uniqueRentalFee && Double.compare(game.uniqueLateFee, uniqueLateFee) == 0 && Objects.equals(producer, game.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, year, uniqueRentalFee, uniqueLateFee);
    }
}