public class ShoppingList {

    private String name;
    private String user;
    private String userlist;
    private String productlist1;
    private String productlist2;

    public String getListname (){
        return name;
    }
    public String getUsername (){
        return user;
    }
    public int getPercentagecompleted (){
        return 0;
    }
    public String getTotalofproducts (){
        return productlist1;
    }
    public String getTotalofproductsonshoppingcart (){
        return productlist2;
    }
    public int getTotalprice (){
        return 0;
    }
    public int getTotalpriceoncart (){
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
