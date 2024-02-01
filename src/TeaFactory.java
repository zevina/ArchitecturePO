public class TeaFactory {
    public Tea createTea(TeaType type) {
        Tea tea = switch (type) {
            case BLACK -> new BlackTea();
            case GREEN -> new GreenTea();
            case HERBAL -> new HerbalTea();
        };
        return tea;
    }
}
