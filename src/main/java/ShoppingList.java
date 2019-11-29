import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private String name;
    private User user;
    //Lista
    private List<Producte> productlist1= new ArrayList<>();
    private List<Producte> productlist2= new ArrayList<>();
    private List<User> userlist= new ArrayList<>();
    //Lista
    public void setProductlist1(List<Producte> Productlist1){
        productlist1=Productlist1;
    }
    public void setProductlist2(List<Producte> Productlist2){
        productlist2=Productlist2;
    }
    public List<Producte> getProductlist1(){
        return productlist1;
    }
    public List<Producte> getProductlist2(){
        return productlist2;
    }

   public ShoppingList(String name, User user){
       this.name=name;
       this.user=user;
   }

    public float  getTotalofproducts (){
        return productlist1.size();
    }
    public float  getTotalofproductsonshoppingcart (){
        return productlist2.size();
    }
    public List<User> getUserlist(){
        return userlist;
    }
    public String getListname (){
        return name;
    }
    public String getUsername (){
        return user.getUsername();
    }

    public float getPercentagecompleted (){
        float percentagem;
        percentagem =getTotalofproductsonshoppingcart() * 100  /  getTotalofproducts();
        return percentagem;
    }

    public float getTotalprice (){
        float total=0;
        if(productlist1.size() == 0){
            return 0;
        }
        for (int i=0; i < productlist1.size();i++){
            total=total + productlist1.get(i).getPrice();
        }
        return total;

    }
    public float getTotalpriceoncart (){
        float totaloncart=0;
        if(productlist2.size() == 0){
            return 0;
        }
        for (int a=0; a < productlist2.size();a++){
            totaloncart=totaloncart + productlist2.get(a).getPrice();
        }
        return totaloncart;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    public boolean adduserlist(User user){
        boolean success= userlist.add(user);
        return success;
    }
    public boolean removeuserlist(User user){
        return removeuserlist(user);}

    public boolean addProduct(Producte producte){
        boolean success= productlist1.add(producte);
        return success;
    }
    public boolean removeproduct(Producte producte){
        return removeproduct(producte);
    }
}
