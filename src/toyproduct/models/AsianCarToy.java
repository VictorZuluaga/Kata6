
package toyproduct.models;

import toyproduct.Toy;

public class AsianCarToy implements Toy{
    private final Integer serialNumber;
    final String type = "car";
    
    public AsianCarToy(Integer serialNumber){
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
        return "AsianCarToy["+"serialNumber="+serialNumber+", type="+type+"]";
        
    }
}
