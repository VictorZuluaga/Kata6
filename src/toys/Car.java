
package toys;

public class Car {
    private final Integer serialNumber;
    
    public Car(Integer serialNumber){
        this.serialNumber = serialNumber;
    }
    public Integer getSerialNumber(){
        return serialNumber;
    }
    
    public void pack(){
        System.out.printf("packing car '%d'\n", this.serialNumber);
    }
    
    public void label(){
        System.out.printf("labelling car '%d'\n", this.serialNumber);
    }
    
    
}
