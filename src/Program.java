public class Program {
    public static void main(String[] args) {

        Cup<Coffee> cupCoffee = new Cup<>(new Coffee());
        Cup<Tea> cupTea = new Cup<>(new Tea());
        Cup<Cacao> cupCacao = new Cup<>(new Cacao());

        cupCoffee.theDrink.getTheDrink(TypeCoffee.latte);
        cupCoffee.theDrink.getTheDrink(TypeCoffee.americano);
        cupTea.theDrink.getTheDrink(TypeTea.fruit);
        cupCacao.theDrink.getTheDrink(TypeCacao.criollo);

    }
}
