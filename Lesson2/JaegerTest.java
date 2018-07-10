public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setHeight(79.2);
        jaegerOne.setModelName("Gipsy Danger (Jaeger)");
        jaegerOne.setArmor(6);
        jaegerOne.setMark("Mark-3");
        jaegerOne.setStatus("Destroyed");
        jaegerOne.setWeight(1.80);
        jaegerOne.setStrenght(8);
        System.out.println("Height " + jaegerOne.getHeight());
        System.out.println("Минимальный уровень атаки  " + jaegerOne.attack(jaegerOne.getArmor(), jaegerOne.getStrenght()));
        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("StrikerEureka");
        jaegerTwo.setHeight(76.2);
        jaegerTwo.setArmor(9);
        jaegerTwo.setMark("Mark-6");
        jaegerTwo.setStatus("Destroyed");
        jaegerTwo.setStrenght(10);
        jaegerTwo.setWeight(1.850);
        System.out.println("Модель " + jaegerTwo.getModelName());
        System.out.println("Минимальный уровень атаки  " + jaegerTwo.attack(jaegerTwo.getArmor(), jaegerTwo.getStrenght()));
    }
}
