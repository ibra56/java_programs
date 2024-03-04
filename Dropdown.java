public class Dropdown extends UIElement {
    private OnClickListener listener;
    @Override
    void draw() {
        System.out.println("Drawing a drop down");
    }

    @Override
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
}
