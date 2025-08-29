public class DigitalMidia extends LibraryItem {
    private String format;


    public void setFormat (String format) {
        if(!format.isEmpty()){
            this.format = format;
        }
    }

    public String getformat () {
        return this.format;
    }

    public DigitalMidia (String title, String format, int pubYear) {
        super(title, pubYear);
        setFormat(format);
    }

    @Override
    public String toString () {
        return super.toString() + getClass().getName() + " format: " + getformat() + "\n";
    }

    
}
