import java.io.*;
import java.util.*;

public class SuperRent {

    private static ArrayList<Store> stores;
    private static ArrayList<Member> members;

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
