import java.math.BigInteger;

public class algoritimos{
    
    //numero de vezes de chamada seu big O (2^n)
    //sua complexidade é exponencial
    public static BigInteger fibrec(int n){
        if(n==0){
            return BigInteger.ZERO;

        }
        if(n==1){
            return BigInteger.ONE;
        }
        return fibrec(n-2).add(fibrec(n-1)); 
    }

    //sem recursão
    //limitado a n operações como superior
    public static BigInteger fibr(int n){
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for(int i=0;i<n;i++){
            BigInteger c = a.add(b);
            a=b;
            b=c;
        }
        return a;
    }
}