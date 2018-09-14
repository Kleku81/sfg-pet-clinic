package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private ong id;

    public ong getId() {
        return id;
    }

    public void setId(ong id) {
        this.id = id;
    }
}
