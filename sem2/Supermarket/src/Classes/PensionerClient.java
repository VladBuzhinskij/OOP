package Classes;

public class PensionerClient extends Actor {
    private int pensID;
    /**Запись имени и ID*/
    public PensionerClient(String name, int pensID) {
        super(name+" - пенсионер");
        this.pensID = pensID;
    }
    /**Получени имени*/
    @Override
    public String getName() {
        return super.name;
    }
    /**Создание заказа */
    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }
    /** Производство заказа*/
    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }
    /**Заказ создан */
    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    /**Заказ произведен */
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }
    /** Получение объекта ACTOR*/
    public Actor getActor() {
      return this;
    }
    
}
