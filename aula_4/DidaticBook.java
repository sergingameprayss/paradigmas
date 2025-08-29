public class DidaticBook extends Book{
    private String discipline;

    public void setDiscipline (String discipline) {
        if(!discipline.isEmpty()){
            this.discipline = discipline;
        }
    }

    public String getDiscipline () {
        return this.discipline;
    }
    
    public DidaticBook (String publisher, String title, String discipline, int publishYear) {
        super(publisher, title, publishYear);
        setDiscipline(discipline);
    }
    
    @Override
    public String toString () {
        return super.toString() + getClass().getName() + " discipline: " + getDiscipline() + "\n";
    }

}

