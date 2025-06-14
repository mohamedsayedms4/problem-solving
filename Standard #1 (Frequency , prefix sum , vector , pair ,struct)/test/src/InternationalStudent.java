public class InternationalStudent extends Student {

    private String internationalName;

    private String Vise;
    public InternationalStudent(int id, String name, int age, String internationalName) {
        super(id, name, age);
        this.internationalName = internationalName;
    }

    public String getInternationalName() {
        return internationalName;
    }

    public void setInternationalName(String internationalName) {
        this.internationalName = internationalName;
    }

    public String getVise() {
        return Vise;
    }

    public void setVise(String vise) {
        Vise = vise;
    }
}
