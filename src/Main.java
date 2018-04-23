public class Main {

    public static void main(String[] args) {

        //trein
        Trein trein = new Trein();

        //station Goes
        TweedeKlasReiziger reiziger1 = new TweedeKlasReiziger("Frits");
        TweedeKlasReiziger reiziger2 = new TweedeKlasReiziger("Kees");
        TweedeKlasReiziger reiziger3 = new TweedeKlasReiziger("Jan");
        TweedeKlasReiziger reiziger4 = new TweedeKlasReiziger("Hary");
        TweedeKlasReiziger reiziger5 = new TweedeKlasReiziger("Shawn");
        EersteKlasReiziger reiziger6 = new EersteKlasReiziger("Jasper");
        ZwartRijder zwartrijder1 = new ZwartRijder ("Hendrik");

        System.out.println(trein);
        trein.instappen(reiziger1, reiziger2, reiziger3, reiziger4, reiziger5, reiziger6, zwartrijder1);
        System.out.println(trein);

    }
}
