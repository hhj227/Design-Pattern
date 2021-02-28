package creational.factory_method_hf;

public class Coffee extends Beverage{
    @Override
    protected void addCondiments() {
        System.out.println("설탕과 커피를 추가하는 중");
    }

    @Override
    protected void brew() {
        System.out.println("필터로 커피 우리는 중");
    }
}
