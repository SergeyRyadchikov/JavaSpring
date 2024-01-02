package gb.spring;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String New;
        Person person = new Person("Igor");
        person.setAge(18);
        person.setPhone("8902347846532");
        System.out.printf("%s - %s\n%s", person.getName(), person.getAge(), person);
    }
}
