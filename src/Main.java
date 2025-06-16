public class Main {

    public static void breaker() {
        System.out.print("--------------------------");
        System.out.println();
    }

    public void print() {
        System.out.println();
    }
    public static void main(String[] args) {

        Author firstAuthor = new Author("Джоанн", "Роулинг");

        Author secondAuthor = new Author("Стивен", "Кинг");

        Book firstBook = new Book("Гарри Поттер", firstAuthor, 1997 );
        Book secondBook = new Book("Оно", secondAuthor, 2010);

        secondBook.setYearPublish(1986);

        breaker();
        firstBook.printBook(firstBook);
        breaker();
        secondBook.printBook(secondBook);
        breaker();
    }
}