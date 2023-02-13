package munzurul.azam.ui_design;

public class listdata {
    String name;
    int logo;
    String description;

    public listdata(String name, int logo, String description) {
        this.name = name;
        this.logo = logo;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
