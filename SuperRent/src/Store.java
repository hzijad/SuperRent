import java.util.ArrayList;
import java.util.Objects;

public class Store {

    private String name;
    private String location;
    private String phone;
    private String manager;
    private ArrayList<Item> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public boolean checkItemAvailability(Item item){
        return items.contains(item);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", manager='" + manager + '\'' +
                ", items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(name, store.name) && Objects.equals(location, store.location) && Objects.equals(phone, store.phone) && Objects.equals(manager, store.manager) && Objects.equals(items, store.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, phone, manager, items);
    }
}