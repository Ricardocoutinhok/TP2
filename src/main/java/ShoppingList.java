import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private String name;
    private User user;
    private User userlist;
    //Lista
    private List<Producte> productlist1= new ArrayList<>();
    private List<Producte> productlist2= new ArrayList<>();
    //Lista

   public ShoppingList(String name, User user,User userlist){
       this.name=name;
       this.user=user;
       this.userlist=userlist;
   }

    public String getListname (){
        return name;
    }
    public User getUsername (){
        return user;
    }
    public float getPercentagecompleted (){
        float percentagem =0;
        int produto1 = productlist1.size();
        int producto2 = productlist2.size();
        percentagem =producto2 * 100  / produto1;
        return percentagem;
    }
    public List<Producte> getTotalofproducts (){
        return productlist1;
    }
    public List<Producte> getTotalofproductsonshoppingcart (){
        return productlist2;
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
        for (int i=0; i < productlist2.size();i++){
            totaloncart=totaloncart + productlist2.get(i).getPrice();
        }
        return totaloncart;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public boolean addProduct(Producte producte){
        boolean success= productlist1.add(producte);
        return success;
    }
    public boolean removeproduct(Producte producte){
        return removeproduct(producte);
    }
}
