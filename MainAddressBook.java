import java.io.Console; 
class AddressBook{
private static String f_Name;
private static String l_Name;
private static String city;
private static String zip;
private static String phone_no;

String getName(){
return f_Name;
}
String getLastName(){
return l_Name;
}
String getCity(){
return city;
}
String getZip(){
return zip;
}
String getPhone(){
return phone_no;
}
public void setName(String First){
this.f_Name = First;
}
public void setLast(String Last){
this.l_Name = Last;
}
public void setZip(String Z_code){
this.zip = Z_code;
} 
public void setCity(String C_name){
this.city = C_name;
}
public void setPhone(String P_no){
this.phone_no = P_no;
}
}
public class MainAddressBook{
public static void main(String[] args){
AddressBook a1 = new AddressBook();
Console c = System.console();
System.out.println("Enter First Name: ");
a1.setName(c.readLine());
System.out.println("Enter Last Name: ");
a1.setLast(c.readLine());
System.out.println("Welcome "+a1.getName());
System.out.println(a1.getLastName());
System.out.println("Enter City Name: ");
a1.setCity(c.readLine());
System.out.println("Enter Zip Name: ");
a1.setZip(c.readLine());
System.out.println("Enter Phone Number: ");
a1.setPhone(c.readLine());
System.out.println("Details Are : "+a1.getCity());
System.out.println(a1.getZip());
System.out.println(a1.getPhone());

}
}