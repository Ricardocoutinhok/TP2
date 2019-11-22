public class Producte {
    private String name;
    private String description;
    private String picture;
    private Category category;
    private int price;
    private String unityType;

    public Producte (String name, String description, String picture, Category category,int price , String unityType){
        this.name=name;
        this.description=description;
        this.picture=picture;
        this.category=category;
        this.price=price;
        this.unityType=unityType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }

    public String getCategory() {
        return category.getName();
    }
    public String getCategoryName(){
        return category.getColor();
    }
    public String getCategoryColor(){
        return category.getColor();
    }
    public int getPrice(){
        return price;
    }

    public String getUnityType() {
        return unityType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setUnityType(String unityType) {
        this.unityType = unityType;
    }
}
