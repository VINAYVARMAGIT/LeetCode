import java.util.HashMap;
import java.util.Map;


public class Mappings {
    public static void main(String[] args) {

        Map<String, Integer> vin = new HashMap();

        vin.put("vin",45);
        vin.put("var",55);

        //System.out.println(vin.keySet());

        for (String key : vin.keySet()){

            System.out.println(key +" : " + vin.get(key));
        }
    }

}
