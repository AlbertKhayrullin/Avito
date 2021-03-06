public class Main {
    public static void main(String[] args) {
        AvitoPropertyForSale offer = new AvitoPropertyForSale();
        offer.room = 1;
        offer.roomComment = "-к. квартира, ";
        offer.apartmentArea = 31.2;
        offer.areaComment = " м2, ";
        offer.floor = 9;
        offer.floorTotal = 19;
        offer.floorComment = "эт.";
        System.out.print(offer.room);
        System.out.print(offer.roomComment);
        System.out.print(offer.apartmentArea);
        System.out.print(offer.areaComment);
        System.out.print(offer.floor);
        System.out.print("/");
        System.out.println(offer.floorTotal);
        System.out.println(offer.floorComment);
    }
}
