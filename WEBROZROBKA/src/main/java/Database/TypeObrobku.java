package Database;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeObrobku {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameObrobku;

    @ManyToOne
    @JoinColumn
    private Admin admin;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "typeObrobku")
    private List<TypeWood> typeWoods;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameObrobku() {
        return nameObrobku;
    }

    public void setNameObrobku(String nameObrobku) {
        this.nameObrobku = nameObrobku;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<TypeWood> getTypeWoods() {
        return typeWoods;
    }

    public void setTypeWoods(List<TypeWood> typeWoods) {
        this.typeWoods = typeWoods;
    }
}
