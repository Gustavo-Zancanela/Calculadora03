public class Calculator3 {
    public double tax = 0.05;
    public double tip = 0.15;
    public String nome;
    public void findTotal(String nome, double price){
        double total = price*(1+tax+tip);
        System.out.println("Nome: "+ nome +" $" +total);

    }
}
