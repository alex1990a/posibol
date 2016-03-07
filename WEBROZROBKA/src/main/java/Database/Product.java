package Database;


import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameProduct;
    private String opusProduct;
    private String priceForLong;
    private String priceForSque;
    private String longProduct;
    private String widthProduct;
    private String heigthProduct;

    @ManyToOne
    @JoinColumn
    private TypeWood typeWood;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getOpusProduct() {
        return opusProduct;
    }

    public void setOpusProduct(String opusProduct) {
        this.opusProduct = opusProduct;
    }

    public String getPriceForLong() {
        return priceForLong;
    }

    public void setPriceForLong(String priceForLong) {
        this.priceForLong = priceForLong;
    }

    public String getPriceForSque() {
        return priceForSque;
    }

    public void setPriceForSque(String priceForSque) {
        this.priceForSque = priceForSque;
    }

    public String getLongProduct() {
        return longProduct;
    }

    public void setLongProduct(String longProduct) {
        this.longProduct = longProduct;
    }

    public String getWidthProduct() {
        return widthProduct;
    }

    public void setWidthProduct(String widthProduct) {
        this.widthProduct = widthProduct;
    }

    public String getHeigthProduct() {
        return heigthProduct;
    }

    public void setHeigthProduct(String heigthProduct) {
        this.heigthProduct = heigthProduct;
    }

    public TypeWood getTypeWood() {
        return typeWood;
    }

    public void setTypeWood(TypeWood typeWood) {
        this.typeWood = typeWood;
    }
}
