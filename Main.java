import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> firstMap = new HashMap<String, Integer>();
        System.out.println("primo metodo di inizializzazione -> " + bDayAndAge(firstMap));

        Map<String, Integer> emptyMap = Map.of();
        System.out.println("secondo metodo di inizializzazione -> " + fill(emptyMap));

        Map<String, Integer> thirdMap = new HashMap<String, Integer>();
        System.out.println("terzo metodo di inizializzazione -> " + ageAndBday(thirdMap));
    }

    public static Map <String, Integer> bDayAndAge (Map<String, Integer> firstMap){
        firstMap = new HashMap<String, Integer>();
        firstMap.put("giorno", 18);
        firstMap.put("mese", 4);
        firstMap.put("anno", 2000);
        firstMap.put("età", 23);

        return firstMap;
    }

    public static Map<String, Integer> fill (Map<String, Integer> emptyMap){
        emptyMap = new HashMap<String, Integer>(Map.of("giorno", 18, "mese", 4,
                "anno", 2000,"età", 23 ));
        return emptyMap;
    }

    public static Map<String, Integer> ageAndBday (Map<String, Integer> thirdMap){
        thirdMap = (Map.ofEntries(
                new AbstractMap.SimpleEntry<String,Integer>("giorno", 18),
                new AbstractMap.SimpleEntry<String,Integer>("mese", 4),
                new AbstractMap.SimpleEntry<String,Integer>("anno", 2000),
                new AbstractMap.SimpleEntry<String,Integer>("età", 23)
        ));
        return thirdMap;
    }

}


