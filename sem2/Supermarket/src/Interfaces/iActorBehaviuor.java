package Interfaces;

import Classes.Actor;
/**Интерфейс создание и производства заказов */
public interface iActorBehaviuor {

    public boolean isTakeOrder() ;
    public boolean isMakeOrder() ;
    public void setTakeOrder(boolean takeOrder) ;
    public void setMakeOrder(boolean makeOrder) ;
    Actor getActor();
    
}
