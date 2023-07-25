package model;
import controller.Logger;
/**Декоратор калькулятора */
public class CalcDecorator implements iCalcul{
    private iCalcul oldCalc;
    private Logger logger;
    /**Конструктор*/
    public CalcDecorator(iCalcul oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }
    /**Сумма*/
    @Override
    public String summ() {
        logger.log(("Начало вызова метода sum  "));
        return oldCalc.summ();
        
    }
    /**Вычитание*/
    @Override
    public String subss() {
        logger.log(("Начало вызова метода subs  "));
        return oldCalc.subss();
    }
    /**Умножение*/
    @Override
    public String multt() {
        logger.log(("Начало вызова метода mult  "));
        return oldCalc.multt();
    }
    /**Деление*/
    @Override
    public String divv() {
        logger.log(("Начало вызова метода div  "));
        return oldCalc.divv();
    }
    
}
