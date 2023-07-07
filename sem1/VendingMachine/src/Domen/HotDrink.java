package Domen;

public class HotDrink extends Product {
    // Поля
    private int drinkTemp;
    // Свойства

    public int getDrinkTemp() {
        return drinkTemp;
    }

    public void setDrinkTemp(int drinkTemp) {
        this.drinkTemp = drinkTemp;
    }

    //конструкторы
    public  HotDrink(int price, int place, String name, long id){
        super(price,place,name,id);
        this.drinkTemp = 0;
    }
    public HotDrink (int price, int place, String name, long id, int drinkTemp){
        super(price,place,name,id);
        this.drinkTemp = drinkTemp;
    }
    @Override
    public String toString() {
        return super.toString() + "\n Temperatre="+drinkTemp ;
    }

}
