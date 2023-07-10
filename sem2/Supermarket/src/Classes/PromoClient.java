package Classes;

public class PromoClient extends Actor {
    private String namePromo;
    private int idPromoClient;
    private static int countPromoClient=10;

    public PromoClient(String name, Integer id, String namePromo) {
        super(name);
        idPromoClient = id;
        this.namePromo=namePromo;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }
}
