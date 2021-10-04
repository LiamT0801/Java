package classobjects;

public class Mobile {
    String brand;
    String generation;
    String processor;

    Mobile (String brandName, String Version, String processorName){
        brand = brandName;
        generation = Version;
        processor = processorName;
    }
    public String getBrand(){
        return brand;
    }       
}
