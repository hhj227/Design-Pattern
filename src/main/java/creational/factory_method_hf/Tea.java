package creational.factory_method_hf;

public class Tea extends Beverage{
    @Override
    protected void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }

    @Override
    protected void brew() {
        System.out.println("차를 우려내는 중");
    }
}
