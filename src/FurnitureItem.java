public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    int gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;
    FurnitureItem(){
        furnitureCode = 2546;
        furnitureType ="";
        gradeOfFurniture =0;
        color ="";
        furnitureUsage = "";
        price = 250.50;
    }
    //comment
    public double discount(){
        return price - (price * 5/100);
    }
}
