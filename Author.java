public class Author{
  private  String name;
  private  String email;


  public void print()
  {
    System.out.println(name+" "+email);
  }
  public void setEmail(String email)
  {
    this.email=email;
  }
  public  Author(String name)
  {
    this.name=name;
  }
  public  Author(String name, String email) {
    this.name=name; this.email=email;

  }
  public String getEmail()
  {
    return this.email;
  }
  public String getName()
  {
    return this.name;
  }
}