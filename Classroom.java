package classTestWCS;

public class Classroom {

    public static void main(String[] args) {

        Wilder gustave= new Wilder("Gustave", true);

        System.out.println(gustave.whoAmI());

        Wilder anita= new Wilder("Anita", false);

        System.out.println(anita
                .whoAmI());

    }
}
