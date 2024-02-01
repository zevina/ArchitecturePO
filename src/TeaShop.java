public class TeaShop {
    private TeaFactory teaFactory;

    public TeaShop(TeaFactory teaFactory) {
        this.teaFactory = teaFactory;
    }

    public Tea orderTea(TeaType type) {
        Tea tea = teaFactory.createTea(type);
        tea.sayTeaType();
        System.out.println("Спасибо за Ваш заказ!");
        return tea;
    }
}
