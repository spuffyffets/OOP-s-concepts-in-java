package Encapsulation;

public class vehicalmain {
    public static void main(String[] args) {
        Vehical v1 =new Vehical();
        Vehical v2 =new Vehical();
        Vehical v3 =new Vehical();
        
        v1.setname("david putra 10000cc");
        v1.setvno(1111);
        v1.setcolour("pink");
        v1.setprice(9999999.9);
        
        v2.setname("dukati");
        v2.setvno(1661);
        v2.setcolour("red");
        v2.setprice(8555490.9);
        
        v3.setname("kawasaki");
        v3.setvno(1561);
        v3.setcolour("green");
        v3.setprice(8798560.9);
        
        System.out.println(v1.vehicalinfo());
        System.out.println();
        System.out.println(v2.vehicalinfo());
        System.out.println();
        System.out.println(v3.vehicalinfo());
    }
}
