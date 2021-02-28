package creational.abstract_factory_hf.ingredient;

import creational.abstract_factory_hf.ingredient.cheese.Cheese;
import creational.abstract_factory_hf.ingredient.cheese.ParmesanCheese;
import creational.abstract_factory_hf.ingredient.dough.Dough;
import creational.abstract_factory_hf.ingredient.dough.ThinCrustDough;
import creational.abstract_factory_hf.ingredient.pepperoni.Pepperoni;
import creational.abstract_factory_hf.ingredient.pepperoni.SlicedPepperoni;
import creational.abstract_factory_hf.ingredient.sauce.MarinaraSauce;
import creational.abstract_factory_hf.ingredient.sauce.Sauce;
import creational.abstract_factory_hf.ingredient.veggie.BlackOlives;
import creational.abstract_factory_hf.ingredient.veggie.Garlic;
import creational.abstract_factory_hf.ingredient.veggie.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ParmesanCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new BlackOlives() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
