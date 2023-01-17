import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapPractice{
    private int value =1 ;
    private TreeMap<Character,Integer> mapCharacter;
    public TreeMapPractice()
    {
        mapCharacter= new TreeMap<Character,Integer>();
    }
    public TreeMap<Character,Integer> getMapCharacter()
    {
        return this.mapCharacter;
    }
    public void add(char character)
    {
        if(mapCharacter.containsKey(character))
        {
            int newValue = mapCharacter.get(character) + 1;
            mapCharacter.put(character,newValue);
        }
        else
            mapCharacter.put(character,value);
    }
    public int getValue()
    {
        return  this.value;
    }
    public void setValue(int value)
    {
        this.value=value;
    }
    public void show()
    {
        Set<Character> keySet = mapCharacter.keySet();
        for(char key :keySet)
        {
            System.out.println(key+" " +mapCharacter.get(key));
        }
    }


}
