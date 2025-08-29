public class Thesis extends LibraryItem{
    private String advisor;

    public void setAdvisor (String advisor) {
        if(!advisor.isEmpty()){
            this.advisor = advisor;
        }
    }

    public String getAdvisor () {
        return this.advisor;
    }

    public Thesis (String title, String advisor, int pubYear) {
        super(title, pubYear);
        setAdvisor(advisor);
    }

    @Override
    public String toString () {
        return super.toString() + getClass().getName() + " advisor: " + getAdvisor() + "\n";
    }
}
    
    
