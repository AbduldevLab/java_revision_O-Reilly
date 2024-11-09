public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int[] nums = {1, 2, 3};
        Book[] books = new Book[10];

        books[4] = new Book("A brilliant read", "abduldevlab Writer", 17.99);

        Book myBook;
        myBook = new Book("A good read part2", "abduldev Writer", 27.99);
        //myBook = null;
        books[5] = myBook;
        books[8] = new Book("Of mice and men", "John Steinbeck", 16.50);
        books[7] = new Book("Pride and prejudice", "Jane Austen", 19.99);

        for (int i = 0; i < books.length; i++) {
            //if statement - no need for curly brackets - if you have only one line to run
            if (books[i] != null)
                System.out.println(books[i].getTitle());
        }
        System.out.println("-----Enhanced for loop (for each ) loop-----");
        //for each loop - enhanced for loop !!
        for (Book i : books){
            if(i != null){
                System.out.println(i.getTitle());
            }
        }

    }
}