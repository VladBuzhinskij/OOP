package Classes;

import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;

public class TaxService implements iActorBehaviuor, iReturnOrder {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isReturnOrder ;



    
    public TaxService() {
        this.name = "Tax audit";
    }

     public String getName() {        
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isRetutnOrder() {
        return isReturnOrder;
    }


    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    @Override
    public void setReturnOrder(boolean returnOrder) {
       isReturnOrder = returnOrder;
    }


    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}
