import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;


public class Trein {

    private HashMap<String, Naam> stoelen = new LinkedHashMap<String, Naam>();

    public void instappen(Naam reiziger1, Naam reiziger2, Naam reiziger3, Naam reiziger4, Naam reiziger5,
                          Naam reiziger6, Naam zwartrijder1) {
        instappen(reiziger1);
        instappen(reiziger2);
        instappen(reiziger3);
        instappen(reiziger4);
        instappen(reiziger5);
        instappen(reiziger6);
        instappen(zwartrijder1);
    }

    public void instappen(Naam reiziger7, Naam reiziger8) {
        instappen(reiziger7);
        instappen(reiziger8);
    }


    public void instappen(Naam naam) {
        String key = naam.getName();
        Naam value = naam;
        this.stoelen.put(key, value);
        showInfo(naam, " is ingestapt.");
    }


    private int getCount() {
        return stoelen.size();
    }

    private void showInfo(Naam uitgestapte, String actie) {
        System.out.println(uitgestapte.getName() + actie);
    }

    public Naam uitstappen(String name) {

        if (!stoelen.containsKey(name)) {
            System.out.println(name + " zit niet in de trein.");
            return null;
        }
        Naam uitgestapte = stoelen.get(name);
        stoelen.remove(name);
        showInfo(uitgestapte, " is uitgestapt.");
        return uitgestapte;
    }

    public void info() {
        System.out.println(this);
    }

    public String toString() {
        return "Er zitten " + getCount() + " mensen in de trein";
    }

    public String[] getNames() {
        String[] names = new String[getCount()];
        int i = 0;
        for (String key : stoelen.keySet()) {

            names[i] = key;
            i++;
        }
        return names;
    }

    public void printNames() {
        System.out.println("Deze mensen zitten in de trein:");
        for (Map.Entry<String, Naam> entry : stoelen.entrySet()) {
            String key = entry.getKey();
            System.out.println("- " + key);
        }
    }
}

