package opps;
// import packages;

public class Polymorphisom {
    // Poly mean many
    // Morphisom mean form
    // Many forms: mutiple members method with same name but different return type
    // and different data type in the argument or more or less are called method
    // polymorphisom or function overloading (compile time polymorphisom)

    static class Poly {
        void area(int s1, int s2, int s3, int s4) {
            int area = s1 + s2 + s3 + s4;
            System.out.println();
            System.out.println(area);
        }

        void area(int l, int b) {
            int area = l * b;
            System.out.println();
            System.out.println(area);

        }

        void area(int r) {
            final float pie = 3.14f;
            float area = pie * (float) r;
            System.out.println();
            System.out.println(area);

        }
    }

    public static void main(String args[]) {
        Poly mor = new Poly();
        mor.area(4, 4, 4, 4);
        mor.area(2, 4);
        mor.area(10);

        // packages.Account acc = new packages.Account();
        
    }
}
