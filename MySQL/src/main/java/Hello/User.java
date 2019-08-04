package Hello;

import javax.persistence.Entity;

@Entity
public class User {
    private Integer id;
    private String name;
    private String address;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return address;
    }

    public void setAdd(String add) {
        this.address = address;
    }
}
