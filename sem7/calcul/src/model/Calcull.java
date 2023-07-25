package model;
/**Калькулятор */
public class Calcull implements iCalcul {
    public double a1,a2,b1,b2;
    
    public Calcull(double a1, double a2, double b1, double b2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
    }
    /**Сумма*/
    public String summ (){ 
        return "("+ a1+"+"+b1+"i)+("+a2+"+"+b2+"i)="+(a1+a2)+"+"+(b1+b2)+"i";
    }
    /**Разность*/  
    public String subss (){

        return "("+ a1+"+"+b1+"i)-("+a2+"+"+b2+"i)="+(a1-a2)+"+"+(b1-b2)+"i";
    }
    /**Умножение*/
    public String multt (){

        return "("+ a1+"+"+b1+"i)*("+a2+"+"+b2+"i)="+(a1*a2-b1*a1*b2)+"+"+(a1*b2+b1*a2)+"i";
    } 
    /**Деление*/
    public String divv (){

        return "("+ a1+"+"+b1+"i)/("+a2+"+"+b2+"i)="+((a1*a2+b1*b2)/(a2*a2+b2*b2))+"+i"+(b1*a2-a1*b2)/(a2*a2+b2*b2);
    } 
}

