package exercise;

public class AdapterLDAP implements Employee {
    private final EmployeeLDAP instance;

    public AdapterLDAP(EmployeeLDAP instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.get("uid");
    }

    @Override
    public String getFirstName() {
        return instance.get("givenName");
    }

    @Override
    public String getLastName() {
        return instance.get("sn");
    }

    @Override
    public String getEmail() {
        return instance.get("mail");
    }
}
