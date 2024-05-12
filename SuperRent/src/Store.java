import java.util.ArrayList;
import java.util.Objects;

public class Store {

    private String name;
    private String location;
    private String phone;
    private String manager;
    private ArrayList<Item> items;
    private ArrayList<Item> boughtItems;

    //constructors

    public Store(String name, String location, String phone, String manager) {

        items = new ArrayList<Item>();
        boughtItems=new ArrayList<Item>();
        setName(name);
        setLocation(location);
        setPhone(phone);
        setManager(manager);

    }

    public Store() {

        items = new ArrayList<Item>();
        boughtItems=new ArrayList<Item>();
        setName(null);
        setLocation(null);
        setPhone(null);
        setManager(null);

    }

    public Store(Store other) {

        items = new ArrayList<Item>();
        boughtItems=new ArrayList<Item>();
        setName(other.name);
        setLocation(other.location);
        setPhone(other.phone);
        setManager(other.manager);

    }

    public void listItems(){

        for(int i = 0; i < items.size(); i++){
            if(items.get(i) != null){
                System.out.println(items.get(i).getTitle().getName());
            }
        }
    }




    //setters and getters

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

    public ArrayList<Item> getBoughtItems(){
        return boughtItems;
    }

    public void setBoughtItems(ArrayList<Item> bi){
        this.boughtItems=bi;
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

    public Item findItem(String name){
        for(int i = 0; i < items.size(); i++) {
            if (name.equalsIgnoreCase(items.get(i).getTitle().getName())) {
                return items.get(i);
            }
        }
        return null;
    }

    public String processPayment(ArrayList<Item> items, double cash){
        double total=0;
        for(Item item:items) {
            total+=item.getTitle().getRentalFee();

        }
        if(cash<total){
            return "Not enough money, terminating the sale!!";
        }
        else {
            return "Your change is " + (cash - total);
        }
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