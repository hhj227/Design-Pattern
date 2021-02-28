package abstract_factory_hf.ingredient;

import abstract_factory_hf.ingredient.cheese.Cheese;
import abstract_factory_hf.ingredient.cheese.ParmesanCheese;
import abstract_factory_hf.ingredient.dough.Dough;
import abstract_factory_hf.ingredient.dough.ThinCrustDough;
import abstract_factory_hf.ingredient.pepperoni.Pepperoni;
import abstract_factory_hf.ingredient.pepperoni.SlicedPepperoni;
import abstract_factory_hf.ingredient.sauce.MarinaraSauce;
import abstract_factory_hf.ingredient.sauce.Sauce;
import abstract_factory_hf.ingredient.veggie.BlackOlives;
import abstract_factory_hf.ingredient.veggie.Garlic;
import abstract_factory_hf.ingredient.veggie.Veggies;

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
