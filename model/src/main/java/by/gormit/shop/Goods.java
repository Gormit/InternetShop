package by.gormit.shop;

/**
 * Created by Марина on 01.05.2015.
 */
public class Goods {
    private int id;
    private String name;
    private int category;
    private int manufacturer;
    private int count;
    private int price;
    private String description;

    public Goods() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(int manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (id != goods.id) return false;
        if (category != goods.category) return false;
        if (manufacturer != goods.manufacturer) return false;
        if (count != goods.count) return false;
        if (price != goods.price) return false;
        if (name != null ? !name.equals(goods.name) : goods.name != null) return false;
        return !(description != null ? !description.equals(goods.description) : goods.description != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + category;
        result = 31 * result + manufacturer;
        result = 31 * result + count;
        result = 31 * result + price;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
