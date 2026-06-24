class Book {
String BookName;
String BookNo;
String Titel;
void showDetails(){
    System.out.println("BookName: " + BookName);
    System.out.println("BookNo:" + BookNo);
    System.out.println("Titel:" + Titel);
}
}
public class Book1 {
    public static void main(String[] args)  {
      Book Book1=new Book();
      Book1.BookName ="Classman" ;
      Book1.BookNo ="2501d";
      Book1.Titel ="Long Book";

      Book Book2=new Book();
      Book2.BookName ="Java" ;
      Book2.BookNo ="20879";
      Book2.Titel ="Java Programe";

      Book1.showDetails();
      Book2.showDetails();
}
}