
package toyproduct.models;

import toyproduct.Toy;

public class AmericanCarToy implements Toy{
    private final Integer serialNumber;
    final String type = "car";
    
    public AmericanCarToy(Integer serialNumber){
        this.serialNumber = serialNumber;
    }
    @Override
    public Integer getSerialNumber(){
        return serialNumber;
    }
    public String getType(){
        return this.type;
    }
    
    @Override
    public void pack(){
        System.out.printf("packing '%s' '%d'\n",this.type, this.serialNumber);
    }
    
    @Override
    public void label(){
        System.out.printf("labelling '%s' '%d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public String toString(){
        return "AmericanCarToy["+"serialNumber="+serialNumber+", type="+type+"]";
        
    }
}
