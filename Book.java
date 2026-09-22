/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Chaiyute Sair)
 * @version (9/21/2026)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        
        
    }

    // Add the methods here ...
    
    /**
     * getAuthor
     * @return name of the author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * getTitle
     * @return name of the title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * getPage
     * @return number of the page
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * printAuthor
     * @print author to console
     */
    public void printAuthor()
    {
        System.out.println("Book's Author(s): " + author);
    }
    
    /**
     * printTitle
     * @print title to console
     */
    public void printTitle()
    {
        System.out.println("Book's Title: " + title);
    }
    
    /**
     * printPage
     * @print page number to console
     */
    public void printPages()
    {
        System.out.println("Book's Page: " + pages);
    }
}
