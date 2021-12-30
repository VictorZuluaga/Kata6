/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyproduct.models;

import toyproduct.Toy;

/**
 *
 * @author vj_62
 */
public class AmericanSubmarineToy implements Toy{
    private final Integer serialNumber;
    final String type = "submarine";
    
    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        
    }

    @Override
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    @Override
    public void pack() {
        System.out.printf("packing '%s' '%d'\n",this.type, this.serialNumber);
        
    }

    @Override
    public void label() {
        System.out.printf("labelling '%s' '%d'\n", this.type, this.serialNumber);
    }
    @Override
    public String toString(){
        return "AmericanSubmarineToy["+"serialNumber="+serialNumber+", type="+type+"]";
        
    }
}
