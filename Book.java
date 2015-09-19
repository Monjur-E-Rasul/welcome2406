public class Book{

  private String name;
  private Author author;
  private double price;
  private int stock;

  public Author  getAuthor()
  {
    return author;
  }
  public void print()
  {
    System.out.println(name+"\n"+price+" "+stock);
  }
  public int returnBook(int stock)
  {
    return stock;
  }
  public int getStock()
  {
    return stock;
  }
  public double getPrice()
  {
    return price;
  }
  public String getName()
  {
    return name;
  }
  public String getAuthorName()
  {
    return name;
  }
  public void borrowBook(int x)
  {
    if(x>stock)
      System.out.println("borrowing amount ecceeds the current stock");
    else
      System.out.println("you can borrow");
  }
  public Book(String name, Author author)
  {
    this.name=name; this.author=author;
  }
  public void setPrice(double price)
  {
    this.price=price;
  }
  public Book(String name, Author author, double price,int stock)
  {
    this.name=name; this.author=author; this.price=price; this.stock=stock;
  }
  public void setStock(int stock)
  {
    this.stock=stock;
  }

}
