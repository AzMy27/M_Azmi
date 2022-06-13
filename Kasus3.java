public class Kasus3 {
    public static void main(String[] args) {
        //Kasus perhitungan
        double x=25.75, y=14.25, z;
        System.out.println();
        System.out.println("Nilai x = "+x);
        System.out.println("Nilai y = "+y);
        System.out.println();

        z=x+y;
        System.out.println("1.  x+y = "+z);
        z=x/y;
        System.out.println("2. x/y = "+z);
        z+=2.50;
        System.out.println("3. z+=2.50 = "+z);
        z*=3.50;
        System.out.println("4. z*=3.50 = "+z);
        z/=2.50;
        System.out.println("5. z/=2.50 = "+z);
        z%=2.50;
        System.out.println("6. z%=2.50 = "+z);
        System.out.println("7. Nilai z sebelum operasi z-- adalah "+z);
        z--;
        System.out.println("8. Nilai z sesudah operasi z-- adalah "+z);

    }
}
