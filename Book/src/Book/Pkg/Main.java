package Book.Pkg;

public class Main {
	public static void main(String[] args) {
		Author miAuthor = new Author("Zarella Burbano", "zarellaburbanov@gmail.com", 'f');
		Book miBook = new Book("Zarella Burbano", miAuthor, 30000, 10);
		System.out.println("Zarella Burbano");
		System.out.println(miBook);
	}
}
