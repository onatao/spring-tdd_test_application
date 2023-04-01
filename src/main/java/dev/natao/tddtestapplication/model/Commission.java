package dev.natao.tddtestapplication.model;

public class Commission {

    public Double commissionValue(Double amount) {
        return (amount <= 1000d) ? amount * 0.10 : amount * 0.20;
        /**
         * Uso do paràmetro ternário, se a condição for verdadeira (true), será
         * executado a operação após o " ? ", se for falso (false) é executado a 
         * operação após o " : ".
         */
    }
    
}
