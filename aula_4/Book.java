public class Book extends LibraryItem {
    protected String publisher;

    public void setPublisher (String publisher) {
        if(!publisher.isEmpty()){
            this.publisher = publisher;
        }
    }

    public String getPublisher () {
        return this.publisher;
    }
    
    public Book (String publisher, String title, int publishYear) {
        super(title, publishYear);
        setPublisher(publisher);
    }

    @Override
    public String toString () {
        return super.toString() + getClass().getName() + " publisher: " + getPublisher() + "\n";
    }

}
