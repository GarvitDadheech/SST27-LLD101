package exercise;

public class AdapterDB implements Employee {
    private final EmployeeDB instance;

    public AdapterDB(EmployeeDB instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
