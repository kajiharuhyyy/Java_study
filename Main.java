public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;

    Hero h2 = new Hero();
    h2.name = "アサカ";
    h2.hp = 100;

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
    
    h.attack();
    h.slip();
    w.heal(h);
    w.heal(h2);
    w.heal(h2);
    m1.run();
    m2.run();

    h.run();


  }

}
