public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Hero galen = new Hero();
        galen.setName("盖伦");
        galen.setHp(600);
        galen.setArmor(550);
        galen.setMoveSpeed(345);
        System.out.println(galen.toString());

        ADHero bh = new ADHero();
        bh.setName("赏金猎人");
        bh.setAd(100);

        bh.attack(galen);

        Item blood_vial = new Item();
        blood_vial.name="血瓶";
        blood_vial.price=150;
        System.out.println(blood_vial.toString());
    }
}
