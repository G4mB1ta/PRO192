
package NumToText;

public class Main {
    public static void main(String[] args) {
        System.out.println(NumToText(10460810482000L));
    }
    
    public static String NumToText(long n) {
        String result = "";
        
        if (n > 1000000000)
            return NumToText(n / 1000000000) + " tỉ " + NumToText(n % 1000000000);
        
        if (n > 1000000)
            return NumToText(n / 1000000) + " triệu " + NumToText(n % 1000000);
        
        if (n > 1000)
            return NumToText(n / 1000) + " nghìn " + NumToText(n % 1000);
        
        String[] number = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        
        String tram = ""; 
        int x = (int)n / 100;
        if (x >= 1) tram = number[x] + " trăm ";
        
        String chuc = "";        
        x = (int)(n % 100) / 10;
        if (x == 1) chuc = " mười ";
        if (x > 1) chuc = number[x] + " mươi ";
        
        String donvi = "";
        x = (int)n % 10;
        if (x >= 1) donvi = number[x];
        
        result = (tram + chuc + donvi).trim();
        return result;
    } 
}
