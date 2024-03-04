public class Button extends UIElement implements OnClickListener{
    private OnClickListener listener;

    @Override
    public void onclick() {
        System.out.println("Button was clicked");
    }

    @Override
    void draw() {
        System.out.println("Drawing a button");
    }

    @Override
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
}
