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

        //station Arnemuiden
        TweedeKlasReiziger reiziger7 = new TweedeKlasReiziger("Karel");
        TweedeKlasReiziger reiziger8 = new TweedeKlasReiziger("Berend");

        trein.instappen(reiziger7, reiziger8);
        System.out.println(trein);

        //station Middelburg
        EersteKlasReiziger reiziger9 = new EersteKlasReiziger("Bert");

        trein.instappen(reiziger9);
        System.out.println(trein);

        Naam uitgestapt = trein.uitstappen("Hendrik");
        System.out.println(trein);

        //station Vlissingen-Souburg
        Naam uitgestapt2 = trein.uitstappen("Karel");
        Naam uitgestapt3 = trein.uitstappen("Berend");

        System.out.println(trein);

        //station Vlissingen
        Naam uitgestapt4 = trein.uitstappen("Frits");
        Naam uitgestapt5 = trein.uitstappen("Kees");
        Naam uitgestapt6 = trein.uitstappen("Jan");
        Naam uitgestapt7 = trein.uitstappen("Hary");
        Naam uitgestapt8 = trein.uitstappen("Shawn");
        Naam uitgestapt9 = trein.uitstappen("Jasper");
        Naam uitgestapt10 = trein.uitstappen("Bert");

        System.out.println(trein);

    }
}
