public class UIElementTest {
    public static void main(String[] args){
        Button btn = new Button();
        btn.draw();
        btn.setOnClickListener(btn);
        btn.onclick();
    }
}
