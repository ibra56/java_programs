public class Cookie {
    String shape;
    String flavour;
    public Cookie(String shape, String flavour){
        this.shape = shape;
        this.flavour = flavour;
    }
    public void describe(){
        System.out.println("This is a "+ flavour + " flavoured" + shape + "cookies");
    }
}
