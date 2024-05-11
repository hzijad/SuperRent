import java.util.*;
import java.lang.*;

public class RentalInfo {

    public Member getMember;
    private Date dueDate;
    private Date dateReturned;
    private Member member;
    private Item item;
    private Store store;
    private Date date;

    public RentalInfo(){

    }

    public boolean checkIfOverdue() {
        return date.checkIfOverdue(dueDate.getCurrentDate(), dateReturned.getCurrentDate()) > 0;
    }

  /* stara verzija
  public boolean checkIfOverdue() {

        try {
            if (dateReturned.compareTo(dueDate) > 0) {
                return true;
            } else {
                return false;
            }
        }catch(Exception e){
            System.out.println("NullPointerException");
        }
        return false;
    }
*/

    public Date getDueDate() {
        return dueDate;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public Member getMember() {
        return member;
    }

    public Item getItem() {
        return item;
    }

    public Store getStore() {
        return store;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setStore(Store store) {
        this.store = store;
    }
    @Override
    public String toString() {
        return "RentalInfo{" +
                "dueDate=" + dueDate +
                ", dateReturned=" + dateReturned +
                ", member=" + member +
                ", item=" + item +
                ", store=" + store +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentalInfo that = (RentalInfo) o;
        return Objects.equals(dueDate, that.dueDate) && Objects.equals(dateReturned, that.dateReturned) && Objects.equals(member, that.member) && Objects.equals(item, that.item) && Objects.equals(store, that.store);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dueDate, dateReturned, member, item, store);
    }
}

