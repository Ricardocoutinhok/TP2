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

        User user1 = new User("José Manuel","josemanuel@gmail.com","josemanuel","adivinha",address1);
        User user2 = new User("Ana Maria","anamaria@gmail.com","anamaria","password",address2);

    }
}
