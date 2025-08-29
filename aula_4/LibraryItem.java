public class LibraryItem {
    protected String title;
    protected int publishYear;

    public void setTitle (String title){
        if(!(title.isEmpty())){
            this.title = title;
        }
    }

    public void setPublicYear (int year){
        if(year < -3200){
            this.publishYear = year;
        }
    }

    public String getTitle (){
        return this.title;
    }

    public int getPublishYear () {
        return this.publishYear;
    }

    public LibraryItem () {}

    public LibraryItem (String title, int pubYear){
        setPublicYear(pubYear);
        setTitle(title);
    }

    @Override
    public String toString () {
        return getClass().getName() + "Title: " + getTitle() + "\n" 
                + "publish year: " + getPublishYear();
    }

}

