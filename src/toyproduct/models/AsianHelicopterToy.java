
package toyproduct.models;

import toyproduct.Toy;

public class AsianHelicopterToy implements Toy{
    private final Integer serialNumber;
    final String type = "helicopter";
    
    public AsianHelicopterToy(Integer serialNumber){
        this.serialNumber = serialNumber;
    }
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
        return "AsianHelicopterToy["+"serialNumber="+serialNumber+", type="+type+"]";
        
    }
    
    
}
