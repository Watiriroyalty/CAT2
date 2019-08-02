package apithree.demo;

public class Unit {
    private Long Id;
    private String Name;

    public Unit(String Name) {
        this.Name = Name;
    }
    private Unit(){}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    @Override
    public String toString() {
        return "Unit{" +
                "id=" + Id +
                ", unitName='" + Name + '\'' +
                '}';
    }
}
