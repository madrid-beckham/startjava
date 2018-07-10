public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        //"Mark-3", "Gipsy Danger (Jaeger)", "Destroyed", 79.2, 1.80v
        jaegerOne.setHeight(79.2);
        System.out.println(jaegerOne.getHeight());
        Jaeger jaegerTwo = new Jaeger();
       //"Mark-6", "Gipsy Avenger", "Destroyed", 81.8, 2.004
      jaegerTwo.setModelName("Gipsy Avenger");
        System.out.println(jaegerTwo.getModelName());

    }
}
