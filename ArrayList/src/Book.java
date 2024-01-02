
public class Book {
	private String authorName;
	private int ISBN=0;
	
	public Book() {
		
	}
	
	public Book(String author, int ISBN) {
		this.authorName=author;
		this.ISBN=ISBN;
	}

	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * @return the iSBN
	 */
	public int getISBN() {
		return ISBN;
	}

	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	
}
