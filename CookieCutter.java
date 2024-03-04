public class CookieCutter {
    String shape;
     public CookieCutter(String shape){
         this.shape = shape;
     }
     public Cookie makeCookie(String flavour){
         return new Cookie(this.shape, flavour);
     }

}
