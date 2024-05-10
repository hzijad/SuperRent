import java.util.Objects;

public class Item {

    private int serial_number;

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

    @Override
    public String toString() {
        return "Item{" +
                "serial_number=" + serial_number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return serial_number == item.serial_number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial_number);
    }
}
