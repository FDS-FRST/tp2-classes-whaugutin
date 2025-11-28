public class Main {

    public static void displayArea(Quadrilateral quadrilateral){
        System.out.println("La surface du quadrilatère 1 un est : " + quadrilateral.getArea() + " unité d'aire");
    }

    public static void displayPerimeter(Quadrilateral quadrilateral){
        System.out.println("Le perimètre du quadrilatère 1 un est : " + quadrilateral.getPerimeter() + " unité de longueur");
    }

    public static void main(String[] args) {
        System.out.println("\n\tHello World I'm Whitchy AUGUSTIN\n");

        Quadrilateral quadrilateral1 = new Quadrilateral();
        Quadrilateral quadrilateral2 = new Quadrilateral(4, 8);

        displayArea(quadrilateral1);
        displayPerimeter(quadrilateral1);
        displayArea(quadrilateral2);
        displayPerimeter(quadrilateral2);

    }
}
