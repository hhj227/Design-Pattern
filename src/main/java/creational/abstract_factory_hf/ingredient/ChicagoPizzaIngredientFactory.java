package creational.abstract_factory_hf.ingredient;

import creational.abstract_factory_hf.ingredient.cheese.Cheese;
import creational.abstract_factory_hf.ingredient.cheese.MozzarellaCheese;
import creational.abstract_factory_hf.ingredient.dough.Dough;
import creational.abstract_factory_hf.ingredient.dough.ThickCrustDough;
import creational.abstract_factory_hf.ingredient.pepperoni.Pepperoni;
import creational.abstract_factory_hf.ingredient.pepperoni.SlicedPepperoni;
import creational.abstract_factory_hf.ingredient.sauce.PlumTomatoSauce;
import creational.abstract_factory_hf.ingredient.sauce.Sauce;
import creational.abstract_factory_hf.ingredient.veggie.BlackOlives;
import creational.abstract_factory_hf.ingredient.veggie.Spinach;
import creational.abstract_factory_hf.ingredient.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
                new Spinach()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
