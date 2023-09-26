/**
* Find first non-repeating character in string.
*
* Method 1 – Using indexOf() and lastIndexOf() methods
* Method 2 – This method uses Linked Hashmap
* Method 3 – This method uses Set and ArrayList
* Method 4 – This method uses Java 8
* 
* Edge Cases:
* String is null or empty
* Uppercase and lowercase characters
* No non repeating character.
**/
public class FirstNonRepeatingCharacter{
  void usingIndex(String inputStr)
    {
        boolean flag = true;

        for(char i :inputStr.toCharArray())
        {
            // if current character is the last occurrence in the string
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+ i);
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("There is no non repeating character in input string");
    }

  public static Character usingLinkedHashMap(String str)
    {
        HashMap  charhashtable = new LinkedHashMap();
        Character ch;

        for (int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);

            if(charhashtable.containsKey(ch))
                // increment count corresponding to ch
                charhashtable.put(ch, charhashtable.get(ch) + 1);
            else
                charhashtable.put(ch , 1);

        }
        for(Entry entry: charhashtable.entrySet())
        {
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }

  public static Character usingJava8(String str){
     Map map = new LinkedHashMap();

        for (Character ch : string.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
  }
}
