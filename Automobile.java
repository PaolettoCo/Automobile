public class Automobile {
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;

    public Automobile(int cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

        public int getCilindrata () {
            return cilindrata;
        }
        public String getTarga () {
            return targa;
        }
        public String getMarca() {
            return marca;
        }
        public String getModello () {
            return modello;
        }

    @Override
    public String toString() {
        return "Automobile{" +
                "cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}










