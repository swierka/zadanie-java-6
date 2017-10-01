public class MethodsTest {
    public static void main(String[] args) {

        MultiArray multiArray = new MultiArray(5,5);
        int n=5;
        int m=5;
        int tableTesting [][]=new int [n][m];
        Methods method1Testing = new Methods();
        method1Testing.findMax(tableTesting);
    }
}
