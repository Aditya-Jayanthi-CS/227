public class MediaLibRunner {
    public static void main(String[] args)
    {
        System.out.println("Welcome to your Media Library!");
        MediaLib myLib = new MediaLib();
        String title = "Aditya";
        Book myBook = new Book("Blood Meridian", "Cormack McCarthy");
        System.out.println(myBook);
        myLib.addBook(myBook);
        System.out.println(myLib);
        int rating = 10;
        myBook.setRating(rating);
        rating = 100;
        title = "Blood Meridian";
        System.out.println(myBook);

        Book newBook = new Book("The Martian", "Andy Weir");
        MediaLib newLib = new MediaLib();
        newLib.addBook(newBook);
        System.out.println(newLib);
        newBook = new Book("New", "title");
        System.out.println(newLib);
        newBook.setAuthor("Aditya Jayanthi");
        newBook = new Book("New", "title");
        System.out.println(newLib);
    }
}
