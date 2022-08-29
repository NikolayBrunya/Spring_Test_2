package org.example;

public interface ProductionLine {
     Car work();

     public static boolean getPartsDelivery(){

          int a = (int) ( Math.random() * 2 );
          if (a == 1)  return true;
          else return false;

     }
}
