package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public double factorial(double n){
        logger.info("[FACTORIAL] - " + n);
        double res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        logger.info("[RESULT - FACTORIAL] - " + res);
        return res;
    }
    public double squareroot(double n){
        logger.info("[SQ ROOT] - " + n);
        double res=Math.sqrt(n);
        logger.info("[RESULT - SQ ROOT] - " + res);
        return res;
    }
    public double power(double n,double p){
        logger.info("[POWER - " + n + " RAISED TO] " + p);
        double res = Math.pow(n,p);
        logger.info("[RESULT - POWER] - " + res);
        return res;
    }
    public double log(double n){
        logger.info("[NATURAL LOG] - " + n);
        double res=Math.log(n);
        logger.info("[RESULT - NATURAL LOG] - " + res);
        return res;
    }
}
