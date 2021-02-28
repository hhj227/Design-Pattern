package creational.factory_method_hf;

public abstract class Beverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsContiments()) {
            addCondiments();
        }
    }

    //hook 메소드
    private boolean customerWantsContiments() {
        return true;
    }

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    protected abstract void addCondiments();

    protected abstract void brew();

}
