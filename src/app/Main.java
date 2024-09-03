package app;

public class Main {
    public static void main(String[] args) {

        User user = new User("Piter Pen");
        Address address = new Address("123 Main St", "Springfield", "Canada");


        user.setAddress(address);


        System.out.println(user.getName() + " lives at: " + user.getAddress());
    }
}
