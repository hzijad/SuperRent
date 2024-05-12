import java.io.*;
import java.util.*;

public class SuperRent {

    private static ArrayList<Store> stores = new ArrayList<Store>();
    private static ArrayList<Member> members = new ArrayList<Member>();

    public static void addStore(Store store ){
        stores.add(store);
    }
    public static void addMember(Member member){
        members.add(member);
    }
    public static void removeStore(Store store){
        stores.remove(store);
    }

    public static boolean checkMembership(Member member){
        return members.contains(member);
    }

    public static void register(Member primaryMember) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Registration form: ");

        System.out.println("ID: ");
        primaryMember.setId(scanner.nextLine());

        System.out.println("Name: ");
        primaryMember.setName(scanner.nextLine());

        System.out.println("Address: ");
        primaryMember.setAddress(scanner.nextLine());

        System.out.println("Phone: ");
        primaryMember.setPhone(scanner.nextLine());

        primaryMember.setUniqueMembershipNumber((int) (Math.random() * 900000) + 100000);

        members.add(primaryMember);


    }


    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public void removeMember(Member member){
        members.remove(member);
    }


    @Override
    public String toString() {
        return "SuperRent{" +
                "stores=" + stores +
                ", members=" + members +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperRent superRent = (SuperRent) o;
        return Objects.equals(stores, superRent.stores) && Objects.equals(members, superRent.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stores, members);
    }
}
