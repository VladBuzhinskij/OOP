package Interfaces;

import Classes.Actor;
/**Очередь*/
public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviuor actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}
