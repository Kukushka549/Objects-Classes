public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Author other = (Author) obj;
        return this.name.equals(other.name) &&
                this.surname.equals(other.surname);
        }

    @Override public int hashCode() {
       return java.util.Objects.hash(name, surname);
    }

}


