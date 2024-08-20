package Conjunto_3;

import java.math.BigInteger;

public class Atividade52 {
    public static void main(String[] args) {
        BigInteger graosArroz = BigInteger.valueOf(1);
        BigInteger sacosArroz;
        BigInteger graosPorSaco = BigInteger.valueOf(10000);

        for (int i=1; i<=64; i++){
            graosArroz = graosArroz.multiply(BigInteger.valueOf(2));
        }
        sacosArroz = graosArroz.divide(graosPorSaco);

        System.out.println("O rei teria que pagar: "+graosArroz+" grãos.");
        System.out.println("Se cada saco de arroz possuir"+ graosPorSaco+" grãos. O rei teria que pagar "+sacosArroz+" sacos.");
    }
}
