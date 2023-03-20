package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public int factorial(int n){
        logger.info("[FACTORIAL] - " + n);
        int res = 1, i;
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
}
