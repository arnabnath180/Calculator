package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public double factorial(double n){
        logger.info("[FACTORIAL] - " + n);
        double res = 1, i;
        try {
            if (n < 0) {
                res = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            } else {
                for (i = 2; i <= n; i++)
                    res *= i;
            }
        }
        catch (ArithmeticException error){
            System.out.println("[EXCEPTION - LOG] - Cannot find factorial of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - FACTORIAL] - " + res);
        return res;
    }
    public double squareroot(double n){
        logger.info("[SQ ROOT] - " + n);
        double res=0.0;
        try {
            if(n<=0){
                res=Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                res = Math.sqrt(n);
            }
        }
        catch (ArithmeticException error){
            System.out.println("[EXCEPTION - LOG] - Cannot find sq root of negative numbers " + error.getLocalizedMessage());
        }
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
        double res=0.0;
        try {
            if(n<=0){
                res=Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                res = Math.log(n);
            }
        }
        catch (ArithmeticException error){
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers or zero " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + res);
        return res;
    }
}
