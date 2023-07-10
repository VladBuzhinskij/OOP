package Interfaces;

import java.util.List;

import Classes.Actor;
/**Интерфейс работы маркета и реализации товара*/
public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviuor actor);
    void releaseFromMarket(List<Actor> actor);
    void update();
}
