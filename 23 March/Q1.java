import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        
        int and=x&y, or=x|y, xor=x^y;
        int bitmask = (z%2 == 0)? ((1 << (z%10))-1): ((1 << (z%5+2))-1);
        int bitmaskAnd = and & bitmask;
        int bitmaskOr = or & bitmask;
        int bitmaskXor = xor & bitmask;

        System.out.println("AND: "+and);
        System.out.println("OR: "+or);
        System.out.println("XOR: "+xor);
        System.out.println("Generated Bitmask: "+bitmask);
        System.out.println("Masked AND: "+bitmaskAnd);
        System.out.println("Masked OR: "+bitmaskOr);
        System.out.println("Masked XOR: "+bitmaskXor);

        sc.close();
    }
}
