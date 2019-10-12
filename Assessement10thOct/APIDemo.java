import java.util.ArrayList;
import java.util.Scanner;
import java.util.*; 
class Person{
    private String name;
    private Integer id;
 
    Person(String name, Integer id ){
        this.name = name;
        this.id = id;
    }
 
    public String getName(){
        return this.name;
    }
 
    public Integer getId(){
        return this.id;
    }

@Override
    public String toString(){
        return "Id : "+this.getId()+" Name : "+this.getName();
}

public String getFirstName(){
    String arrName[]=this.getName().split(" ");
    return arrName[0];
}

public String getLastName(){
    String arrName[]=this.getName().split(" ");
    return arrName[1];
}
 }

class SortById implements Comparator{
    @Override
    public int compare(Object ob1,Object ob2){

        return ((Person)ob1).getId().compareTo(((Person)ob2).getId());
    }

}
class SortByFirstName implements Comparator{
    @Override
    public int compare(Object ob1,Object ob2){

        return ((Person)ob1).getFirstName().compareTo(((Person)ob2).getFirstName());
    }

}
class SortByLastName implements Comparator{
    @Override
    public int compare(Object ob1,Object ob2){

        return ((Person)ob1).getLastName().compareTo(((Person)ob2).getLastName());
    }

}

class APIDemo{
    public static void main(String[] args) {
        ArrayList list =new ArrayList();
        Scanner sc=new Scanner(System.in);
        int option=0;
        do{ 
        System.out.println("Press 1 to enter the persons detail:");
        System.out.println("Press 2 to print the list of persons details");
        System.out.println("Press 3 to Search person's details:");
        System.out.println("Press 4 to delete the persons detail:");
        System.out.println("Press 5 for Sorting:");
        option=sc.nextInt();
        sc.nextLine();

        switch(option){
        case 1:
        String name;
        int id;
 
       // Scanner scan = new Scanner(System.in);

        System.out.println("How many persons you want to store?");
        Integer limit = sc.nextInt();
        sc.nextLine();
 
        for(int v = 1; v <= limit; v++){
            System.out.println("Enter name");
            name = sc.nextLine();
 
            System.out.println("Enter id");
            id = sc.nextInt();
            sc.nextLine();
 
            list.add(new Person(name, id));
 
        }
        break;
        case 2:
           System.out.println("We have the following persons saved:");
 
        for(Object ob : list){
            System.out.println(((Person)ob).getName());
        }
        break;
 
        case 3:
        System.out.println("Press 1 to search by id:");
        System.out.println("Press 2 to search by name:");
        System.out.println("Enter your choice:");
        
        //Scanner sc=new Scanner();
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter the id of the person:");
            Integer id1=sc.nextInt();
            for(Object ob:list){
                if(((Person)ob).getId().equals(id1))
                    System.out.println(((Person)ob).getName());
            }
            break;
            case 2:
            System.out.println("Etner the name of the person:");
            String name1=sc.nextLine();
             for(Object ob:list){
                if(((Person)ob).getName().equals(name1))
                    System.out.println(((Person)ob).getName());
               }
                break;  
            }
            break;
        case 4:
        System.out.println("Enter the id of the person to delete:");
        Integer id2=sc.nextInt();
        for(Object ob:list)
        {
            if(((Person)ob).getId().equals(id2))
            {
                list.remove(ob);
                System.out.println("Person deleted:");
            }
        } 
        break;
        case 5:
        System.out.println("Press 1 to sort by id");
        System.out.println("Press 2 to sort by FirstName");
        System.out.println("Press 3 to sort by LastName");
        System.out.println("Enter your choice");
        int choice2=sc.nextInt();
        switch(choice2)
        {
            case 1:
            Collections.sort(list,new SortById());
             for(Object ob : list){
            System.out.println(((Person)ob).getName());}
            System.out.println("The list has been sorted by Id");

             break;  
             case 2:
            Collections.sort(list,new SortByFirstName());
             for(Object ob : list){
            System.out.println(((Person)ob).getName());}
            System.out.println("The list has been sorted by FirstName");  
            break;
            case 3:
             Collections.sort(list,new SortByLastName());
              for(Object ob : list){
            System.out.println(((Person)ob).getName());}
            System.out.println("The list has been sorted by FirstName");  
            break;
            default:
            System.out.println("Enter a the input 1-3 only");

        }     
 
    }
}while(option>0 && option<6);
}
}