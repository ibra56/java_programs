public class CookieFactory {
    public static void main(String[] args){
        CookieCutter heartShappedCutter = new CookieCutter("heart");
        Cookie chocoHeartCookie = heartShappedCutter.makeCookie("chocolate");
        Cookie vanillaHeartCookie = heartShappedCutter.makeCookie("vanilla");

        chocoHeartCookie.describe();
        vanillaHeartCookie.describe();
    }
}
