public class Main {
    public static void main (String [] args) {
        Hero hero1 = new Hero("Naruto", 10, 100);
        HeroStrength hero2 = new HeroStrength("Sasuke", 20, 100);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
    }
}