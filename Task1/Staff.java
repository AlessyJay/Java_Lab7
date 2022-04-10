import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Staff extends Person {
    // Peeranat Somboonsirikul, 59961
    public static String education, position;
    public static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static void StaffInitialize() throws IOException {
        Person.Initialize();
        System.out.print("Enter education: ");
        education = BR.readLine();
        System.out.print("Enter position: ");
        position = BR.readLine();
    }

    public static void StaffPrint() {
        Person.Print();
        System.out.println(String.format("Education: %s , Position: %s", education, position));
    }
    // Peeranat Somboonsirikul, 59961
}