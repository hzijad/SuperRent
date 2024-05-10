import java.util.Objects;

public class Member {

    private String id;
    private String name;
    private String address;
    private String phone;
    private int uniqueMembershipNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUniqueMembershipNumber() {
        return uniqueMembershipNumber;
    }

    public void setUniqueMembershipNumber(int uniqueMembershipNumber) {
        this.uniqueMembershipNumber = uniqueMembershipNumber;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", uniqueMembershipNumber=" + uniqueMembershipNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return uniqueMembershipNumber == member.uniqueMembershipNumber &&
                Objects.equals(id, member.id) &&
                Objects.equals(name, member.name) &&
                Objects.equals(address, member.address) &&
                Objects.equals(phone, member.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phone, uniqueMembershipNumber);
    }
}