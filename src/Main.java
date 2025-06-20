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

        Author thirdAuthor = new Author("Джоанн", "Роулинг");

        Book firstBook = new Book("Гарри Поттер", firstAuthor, 1997 );
        Book secondBook = new Book("Оно", secondAuthor, 2010);
        Book thirdBook = new Book("Гарри Поттер", thirdAuthor, 1997);

        secondBook.setYearPublish(1986);

        breaker();
        firstBook.printBook(firstBook);
        breaker();
        secondBook.printBook(secondBook);
        breaker();

        System.out.println("firstAuthor.equals(secondAuthor) = " + firstAuthor.equals(thirdAuthor));
        System.out.println("firstAuthor.hashCode() = " + firstAuthor.hashCode());
        System.out.println("firstBook.equals(thirdBook) = " + firstBook.equals(thirdBook));

    }
}