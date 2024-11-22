package Arrays;

public class person {
    private String lastname;
    private String firstname;
    private int age ;
public person(int agevalue,String first,String last)
{
    age=agevalue;
    lastname=last;
    firstname=first;
}
public String getlast()
{
    return lastname;
}
public void display()
{
 System.out.println("The name is:" + firstname);
 System.out.println("The age is:"+age);
}
    
}
 