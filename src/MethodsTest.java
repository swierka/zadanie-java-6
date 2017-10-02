public class MethodsTest {

    public static void main(String[] args) {

        MultiArray multiArray = new MultiArray(5,6);
        multiArray.print();
        multiArray.randomize();
        System.out.println();
        multiArray.print();

        System.out.println(multiArray.findMax());
        System.out.println(multiArray.findMin());
    }
}
