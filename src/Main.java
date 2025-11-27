public class Main {


    public static void main(String[] args) {
        System.out.println("\n\tHello World I'm Whitchy AUGUSTIN\n");

        Quadrilateral quadrilateral = new Quadrilateral();
        Quadrilateral quadrilateral2 = new Quadrilateral(4, 8);

        System.out.println("La surface du quadrilatère 1 un est : " + quadrilateral.getArea() + " unité d'aire");
        System.out.println("Le perimètre du quadrilatère 1 un est : " + quadrilateral.getPerimeter() + " unité de longueur");
        System.out.println("La surface du quadrilatère 2 un est : " + quadrilateral2.getArea() + " unité d'aire");
        System.out.println("Le perimètre du quadrilatère 2 un est : " + quadrilateral2.getPerimeter() + " unité de longueur");

    }
}
