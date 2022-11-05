import java.util.Arrays;

public class personcl {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    public static void main(String[] args) {
        personcl person = new personcl();
        person.name = "Abdulmajeed";
        person.nationality = "Saudi";
        person.dateOfBirth = "13/07/2003";
        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
        person.seatNumber = 7;
        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
    }
}
