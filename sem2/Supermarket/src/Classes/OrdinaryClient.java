package Classes;

public class OrdinaryClient extends Actor {
    // private boolean setTakeOrder;
    // private boolean setMakeOrder;
    /**Получение имени */
    public OrdinaryClient(String name) {
        super(name);
    }
    /**Запись имени */
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

    // public boolean isSetTakeOrder() {
    //     return setTakeOrder;
    // }

    // public void setSetTakeOrder(boolean setTakeOrder) {
    //     this.setTakeOrder = setTakeOrder;
    // }

    // public boolean isSetMakeOrder() {
    //     return setMakeOrder;
    // }

    // public void setSetMakeOrder(boolean setMakeOrder) {
    //     this.setMakeOrder = setMakeOrder;
    // }

    // @Override
    // public String getName() {
    //     return name;
    // }
}
