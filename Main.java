public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    System.out.println(h.hp);
    System.out.println(h.name);

    // Hero h2 = new Hero("アサカ");
    // System.out.println(h2.hp);
    // System.out.println(h2.name);

    Hero h3 = new Hero();
    System.out.println(h3.name);

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    h.sword = s;
    System.out.println("現在の武器は" + h.sword.name);

    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;

    SuperHero sh = new SuperHero();

    // Weapon w = new Weapon();
    
    h.run();
    sh.run();

  }

}
