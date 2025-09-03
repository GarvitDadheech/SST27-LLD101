package exercise;

import java.util.*;

public class Client {
  public static void main(String[] args) {
    List<EmployeeCSV> csvRows = List.of(
      new EmployeeCSV("101,Tony,Stark,tony.stark@acme.com"),
      new EmployeeCSV("102,Pepper,Potts,pepper.potts@acme.com")
    );

    List<EmployeeDB> dbRows = List.of(
      new EmployeeDB(201, "Bruce", "Banner", "bruce.banner@contoso.com"),
      new EmployeeDB(202, "Natasha", "Romanoff", "natasha.romanoff@contoso.com")
    );

    List<EmployeeLDAP> ldapRows = List.of(
      new EmployeeLDAP(Map.of("uid","301","givenName","Steve","sn","Rogers","mail","steve.rogers@example.org")),
      new EmployeeLDAP(Map.of("uid","302","givenName","Wanda","sn","Maximoff","mail","wanda.maximoff@example.org"))
    );

    List<Employee> all = new ArrayList<>();
    csvRows.forEach(e -> all.add(new AdapterCSV(e)));
    dbRows.forEach(e -> all.add(new AdapterDB(e)));
    ldapRows.forEach(e -> all.add(new AdapterLDAP(e)));

    EmployeePrinter.print(all);
  }
}
