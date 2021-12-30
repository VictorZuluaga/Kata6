
package toys;

public class Car {
    private final Integer serialNumber;
    final String type = "car";
    
    public Car(Integer serialNumber){
        this.serialNumber = serialNumber;
    }
    public Integer getSerialNumber(){
        return serialNumber;
    }
    public String getType(){
        return this.type;
    }
    
    public void pack(){
        System.out.printf("packing '%s' '%d'\n",this.type, this.serialNumber);
    }
    
    public void label(){
        System.out.printf("labelling '%s' '%d'\n", this.type, this.serialNumber);
    }
    
    
}
