package Database;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeWood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameWood;

    @ManyToOne
    @JoinColumn
    private TypeObrobku typeObrobku;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "typeWood")
    private List<Product> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameWood() {
        return nameWood;
    }

    public void setNameWood(String nameWood) {
        this.nameWood = nameWood;
    }

    public TypeObrobku getTypeObrobku() {
        return typeObrobku;
    }

    public void setTypeObrobku(TypeObrobku typeObrobku) {
        this.typeObrobku = typeObrobku;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
