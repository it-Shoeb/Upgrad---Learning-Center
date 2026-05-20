// package opps;
// public class Inheritance {

//     static class Shape {
//         int sides;
//         int corner;
//         int radius;

//         public void shape() {
//             System.out.println("Shape");
//         }

//     }

//     static class Triangle extends Shape {
//         String color;

//         public void triangle(int s1, int s2, int s3) {
//             System.out.println("Triangle");
//             System.out.println(s1 + s2 + s3);
//         }
//     }

//     static class Circle extends Triangle {
//         public void circle(int r) {
//             System.out.println("Circle");

//             final float pie = 3.14f;
//             System.out.println();
//             System.out.println(pie * r);
//             System.out.println();
//         }
//     }

//     static class Square extends Shape {
//         public void square(int s1, int s2, int s3, int s4) {
//             System.out.println("Square");
//             System.out.println(s1 * 4);
//         }
//     }

//     static class Parallelogram extends Square {
//         public void parallelogram(int s1, int s2) {
//             System.out.println("Parallelogram");
//             System.out.println((s1 * 2) + (s2 * 2));
//         }
//     }

//     public static void main(String[] args) {
//         // single level Inheritance
//         // Triangle tri = new Triangle();
//         // tri.sides = 3; // accessing side through derived class that is in the base
//         // class
//         // System.out.println(" " + tri.sides + " ");

//         // multi level inheritence
//         // Circle cir = new Circle();
//         // cir.color = "red";
//         // cir.radius = 3; // assigning values to Shpaes variable and accessing through
//         // circle class
//         // System.out.print(cir.color);// accessing color from triangle call from circle
//         // class
//         // cir.area(cir.radius); //accessing self method

//         // Hierarchial Inhetitence
//         // Square sqr = new Square();
//         // sqr.shape(); // accessing shape method from Shape Class
//         // sqr.square(10, 10, 10, 10); // accessing self method

//         // Triangle tri = new Triangle();
//         // tri.triangle(12, 12, 12); // self method
//         // tri.shape(); // accessing shape method from Shape Class

//         // Hybrid Inheritence
//         // Square squ = new Square();
//         // squ.square(23, 23, 23, 23);

//         // Parallelogram para = new Parallelogram();
//         // para.shape();
//         // para.square(12, 12, 12, 12);

//     }
// }
