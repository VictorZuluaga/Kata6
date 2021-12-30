
package business;

import factories.SerialNumberGenerator;
import toyproduct.Toy;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;

public class ToyBusiness {
    
    private final Map<String, ToyFactory> toyfactories = new HashMap<>();
    private final SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public void add(String name, ToyFactory toyfactory){
        this.toyfactories.put(name, toyfactory);
    }
    
    public Toy produceToy(String type){
        return this.toyfactories.get(type).produceToy(this.generator.next());
    }
}
