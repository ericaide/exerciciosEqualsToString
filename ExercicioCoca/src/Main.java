public class Main {

    public static void main(String[] args) {
        Coca coca1 = new Coca(200,5.50);
        Coca coca2 = new Coca(200, 7.20);

    if(coca1.equals(coca2)){
        System.out.println("São cocas iguais");
    } else {
        System.out.println("São cocas diferentes");
    }

    }


}
