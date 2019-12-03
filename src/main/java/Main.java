import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        Category category1 = new Category("Legumes", "Verdes", "Verde");
        Category category2 = new Category("Frutas", "Maduras", "Vermelho");
        Category category3 = new Category("Bolachas","Boas","Preto");
        Category category4 = new Category("Pão","Fresco","Castanho");

        Producte producte1 = new Producte("Banana", "Da Madeira", "Imagem", category2, 16, "kg");
        Producte producte2 = new Producte("Alface","Fresca","Imagem",category1,32,"kg");
        Producte producte3 = new Producte("Maça","Vermelha","Imagem",category2,26,"kg");
        Producte producte4 = new Producte("Bolacha Maria","Tostada","imagem",category3,68,"un");
        Producte producte5 = new Producte("Bolachas de Agua e Sal","Amanhecer","Imagem",category3,36,"un");
        Producte producte6 = new Producte("Bagete","Fresco","Imagem",category4,11,"un");
        Producte producte7 = new Producte("Broa","Embalado","Imagem",category4,15,"kg");

        Address address1 = new Address("Rua da Piedade","256","4586-582");
        Address address2 = new Address("Rua José Matos","2B","4235-892");
        Address address3 = new Address("Rua do José","2C","4255-832");

        User user1 = new User("José Manuel","josemanuel@gmail.com","josemanuel","adivinha",address1);
        User user2 = new User("Ana Maria","anamaria@gmail.com","anamaria","password",address2);
        User user3 = new User("José Maria","josemaria@gmail.com","josemaria","password",address3);

        ShoppingList lista1= new ShoppingList("Lista1",user1);



        List<Producte> newProductList = new ArrayList<>();
        newProductList.add(producte1);
        newProductList.add(producte2);
        newProductList.add(producte3);
        newProductList.add(producte4);
        newProductList.add(producte5);
        newProductList.add(producte6);
        newProductList.add(producte7);
        lista1.setProductlist1(newProductList);

        List<Producte> newProductList2 = new ArrayList<>();
        newProductList2.add(producte5);
        newProductList2.add(producte7);
        lista1.setProductlist2(newProductList2);


        List<User> newuserlist = new ArrayList<>();
        newuserlist.add(user2);
        newuserlist.add(user3);
        lista1.setUserlist(newuserlist);

        int i;
        for (i=0; i< lista1.getUserlist().size(); i++){
            User user = lista1.getUserlist().get(i);

            System.out.println(user.getUsername() +"\n");
        }

        System.out.println("Tem "+lista1.getTotalofproducts() +" produtos na lista de compras no total de "+ lista1.getTotalprice()+"€");

        System.out.println("Tem "+lista1.getTotalofproductsonshoppingcart() +" produtos no carrinho de compras no total de "+ lista1.getTotalpriceoncart()+"€");
        System.out.println(lista1.getPercentagecompleted() + " %");
        /*
        HashMap< Category,List<Producte>> map1 = new HashMap<Category, List<Producte>>();
        */

        HashMap< Integer,String> map1 = new HashMap<Integer, String>();

        /*
        int a;
        for (a=0; a< lista1.getProductlist1().size(); a++) {
            Producte producte = lista1.getProductlist1().get(a);
            if (map1.containsValue(producte.getCategory())) {

            } else {
                map1.put(ca, producte.getCategory());
            }
            System.out.println(map1);
        }*/

        int a;
        for (a=0; a< lista1.getProductlist1().size(); a++) {
            Producte producte = lista1.getProductlist1().get(a);
            if (map1.containsValue(producte.getCategory())) {

            } else {
                map1.put(a, producte.getCategory());
            }
            System.out.println(map1);
        }


        System.out.println(map1.size());
        int b;
        int c;
        for (c=0; c <= map1.size()+1;c++) {
            for (b = 0; b < lista1.getProductlist1().size(); b++) {
                Producte producte = lista1.getProductlist1().get(b);
                if (producte.getCategory().equals(map1.get(c))) {
                    System.out.println("Na Categoria " +producte.getCategory()+ " tem "+ producte.getName());
                }

            }
        }

    }
}
