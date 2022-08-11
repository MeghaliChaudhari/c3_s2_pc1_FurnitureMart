import java.util.Scanner;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem obj = new FurnitureItem();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which type of Furniture usage you want ");
        obj.furnitureUsage = scanner.nextLine();
        System.out.println("Which type of furniture you want ");
        obj.furnitureType = scanner.nextLine();
        System.out.println("Which color you want in furniture");
        obj.color = scanner.nextLine();
        System.out.println("Enter grade");
        obj.gradeOfFurniture = scanner.nextInt();

        if(obj.furnitureUsage.equals("outdoor")) {
            double pri = obj.discount();
            System.out.println("Discount = " + pri);
        }
        else{
            System.out.println("NO DISCOUNT");
        }
    }
}
