import java.util.*;
class AddressBookMultiAdd{
public static void main(String[] args){
Map<String,String> map = new HashMap<String,String>();
map.put("Jay","8272901022");
map.put("abc","6462876171");
map.put("gdh","6783661190");
map.put("dskla","76371278");
map.put("djhd","3164524261");

System.out.println("Previous Address Book:::::::"+map);
System.out.println("enter the Name you want to add to Book");
String name = System.console().readLine();
System.out.println("enter the Mobile Number you want to add to Book");
String mobileNumber = System.console().readLine();

map.put(name,mobileNumber);
System.out.println("New Address Book "+ map);


}
}


