public class Kasus3b {
    public static void main(String[] args) {
        //Kasus Bitwise
        int b=1, c=0, d=1, AND, OR, OREX;
        System.out.println();
        System.out.println("Nilai b = "+b);
        System.out.println("Nilai c = "+c);
        System.out.println("Nilai d = "+d);
        System.out.println();

        AND = b & c;
        System.out.println("1. Nilai b & c = "+AND);
        OR = b | c;
        System.out.println("2. Nilai b | c ="+OR);
        OREX = b ^ c;
        System.out.println("3. Nilai b ^ c = "+OREX);
        OREX = b ^ d;
        System.out.println("4. Nilai b ^ d = "+OREX);
    }
}
