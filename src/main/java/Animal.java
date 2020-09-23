public class Animal {
    private String commonName;
    private String speciesName;

    public Animal(String commonName,String speciesName){
        this.commonName=commonName;
        this.speciesName=speciesName;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String eat(){
        return "Nom nom nom";
    }
    public String breathe(){
        return "sigh";
    }
}
