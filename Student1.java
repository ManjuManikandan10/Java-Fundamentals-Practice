class Student {
String name;
String regno;
String emailid;
String departemant;

  void showDetails(){
    System.out.println("Name: " + name);
    System.out.println("RegNo" + regno);
    System.out.println("EmailId" + emailid);
    System.out.println("Departemant" + departemant);
  } 
}
public class Student1 {
    public static void main(String[] args)  {
      Student Student1=new Student();
      Student1.name ="Mani" ;
      Student1.regno ="25MCS020";
      Student1.emailid ="abc103@gmail.com";
      Student1.departemant ="CS";

      Student Student2=new Student();
      Student2.name ="Vidhya" ;
      Student2.regno ="25MCS031";
      Student2.emailid ="hyt1036@gmail.com";
      Student2.departemant ="CS";

      Student Student3=new Student();
      Student3.name ="jomzy" ;
      Student3.regno ="25MCS019";
      Student3.emailid ="dsac1039@gmail.com";
      Student3.departemant ="CS";

      Student1.showDetails();
      Student2.showDetails();
      Student3.showDetails();
    }
}
