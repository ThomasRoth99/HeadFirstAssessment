public abstract class Mens implements Naam {

        private String name;
        private String kaartje;

        public Mens(String name, String kaartje){
            this.name = name;
            this.kaartje = kaartje;
        }

        public String getName() {
            return this.name;
        }

        public String getKaartje() {
            return this.kaartje;
        }
    }

