import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        VisMenu();
    }

    static Lamp lampe1 = new Lamp("lampe1", true);
    static Lamp lampe2 = new Lamp("lampe2", true);
    static Lamp lampe3 = new Lamp("lampe3", true);
    static Lamp lampe4 = new Lamp("lampe2", true);
    static Lamp lampe5 = new Lamp("lampe3", true);


    private static void VisMenu() {
        System.out.println(lampe1.getName() + " er tændt: " + lampe1.isOn());
        System.out.println(lampe2.getName() + " er tændt: " + lampe2.isOn());
        System.out.println(lampe3.getName() + " er tændt: " + lampe3.isOn());
        System.out.println(lampe4.getName() + " er tændt: " + lampe4.isOn());
        System.out.println(lampe5.getName() + " er tændt: " + lampe5.isOn());

        System.out.print("Hvilken lampe vil du gerne ændre?: ");


        int brugervalg = keyboard.nextInt();
        keyboard.nextLine();
        håndterBrugervalg(brugervalg);
    }

    public static void håndterBrugervalg(int brugervalg) {
        switch (brugervalg) {
            case 1 -> lampe1.toggle();
            case 2 -> lampe2.toggle();
            case 3 -> lampe3.toggle();
            case 4 -> lampe4.toggle();
            case 5 -> lampe5.toggle();

        }
        System.out.println();
        System.out.println("Lampe: " + brugervalg + " er blevet ændret");
        VisMenu();

    }
}


