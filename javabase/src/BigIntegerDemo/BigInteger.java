package BigInteger;

public class BigIntegerDeomo {
    public static void main(String[] args){
        BigInteger big1 = new BigInteger("12345678909876543210");
        BigInteger big2 = new BigInteger("98765432101234567890");
        BigInteger bigAdd = big1.add(big2);
        System.out.println(bigAdd);

    }
}
