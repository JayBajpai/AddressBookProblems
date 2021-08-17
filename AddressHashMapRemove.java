import java.util.*;
class AddressHashMapRemove{
public static void main(String[] args){
Map<String,String> map = new HashMap<String,String>();
map.put("Jay","8272901022");
map.put("abc","6462876171");
map.put("gdh","6783661190");
map.put("dskla","76371278");
map.put("djhd","3164524261");

System.out.println(map);
System.out.println("enter the Name you want to remove from Book");
String key = System.console().readLine();
String returned_value = (String)map.remove(key);
System.out.println("New map is: "+ map);
}
}


