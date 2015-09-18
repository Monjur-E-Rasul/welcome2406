public class TextBook {

  public static void main(String[] args) {
    // write your code here
    Author schildt("Herbert Schildt", "herbert@schildt.com");
    System.out.println(schildt.getName()+"at"+schildt.getEmail());

    Author bjarne("Bjarne Stroustrup");
    bjarne.setEmail("bjarne@bjarne.com");
    bjarne.print();

    Book b1("Teach Yourself C++", schildt);
    b1.setPrice(150.5);
    b1.setStock(50);
    //cout << "Author: " << b1.getAuthorName() <<" Name: " << b1.getName() << " Price: " << b1.getPrice() << " Stock: " << b1.getStock() << endl;
    System.out.println("Author"+b1.getAuthorname()+" Name: "+b1.getName()+" Price: "+b1.getPrice()+" Stock: "+b1.getStock());
    b1.borrowBook(20);
    b1.returnBook(10);
    //cout << "Author: " << b1.getAuthorName() <<" Name: " << b1.getName() << " Price: " << b1.getPrice() << " Stock: " << b1.getStock() << endl;

    System.out.println("Author: "+b1.getAuthorname()+" Name: "+b1.getName()+" Price: "+b1.getPrice()+" Stock: "+b1.getStock());

    Book b2("The C++ Programming Language", bjarne, 200, 20);
    b2.print();
    b2.returnBook(10);
    b2.borrowBook(50);
    b2.print();

    b1.getAuthor().print();
    b2.getAuthor().print();



  }
}
