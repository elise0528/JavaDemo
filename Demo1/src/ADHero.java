public class ADHero extends Hero {

    private float ad;

    public void setAd(float ad) {
        this.ad = ad;
    }

    public float getAd() {
        return ad;
    }

    public void attack() {
        System.out.println(getName() + "进行了一次攻击");
    }

    public void attack(Hero... heroes) {
        for (Hero hero : heroes) {
            hero.setHp(hero.getHp() - this.ad);
            System.out.println(getName() + "攻击了" + hero.getName() + "减去" + this.ad + "\n" + "被攻击英雄当前血量" + hero.getHp());
        }
    }
}
