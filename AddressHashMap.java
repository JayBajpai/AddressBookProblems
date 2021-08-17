import java.util.*;
class AddressHashMap{
public static void main(String[] args){
Map<String,String> map = new HashMap<String,String>();
map.put("Jay","8272901022");
map.put("abc","6462876171");
map.put("gdh","6783661190");
map.put("dskla","76371278");
map.put("djhd","3164524261");

String name = System.console().readLine();	
System.out.println("You entered Name " + name);

String replacePhoneNumber = System.console().readLine();	
System.out.println("You entered Replace Name " + replacePhoneNumber);
if(map.containsKey(name)){
	map.replace("Jay", replacePhoneNumber);
}
System.out.println("You change AddresssBook " + map);
    
}
}