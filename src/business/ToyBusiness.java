
package business;

import toyproduct.Toy;
import factories.ToyFactory;

public class ToyBusiness {
    
    private final ToyFactory toyFactory;
    
    public ToyBusiness(ToyFactory toyFactory){
        this.toyFactory = toyFactory;
    }
    public Toy produceToy(String type){
        return this.toyFactory.produceToy(type);
    }
}
