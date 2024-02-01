public class Main {
    public static void main(String[] args) {
        TeaFactory teaFactory = new TeaFactory();
        TeaShop teaShop = new TeaShop(teaFactory);

        Tea teaBlack = teaShop.orderTea(TeaType.BLACK);
        Tea teaGreen = teaShop.orderTea(TeaType.GREEN);
        Tea teaHerbal = teaShop.orderTea(TeaType.HERBAL);
    }
}
