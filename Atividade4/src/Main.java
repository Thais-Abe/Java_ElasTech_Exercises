// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Descreva abaixo os dados do item faturado:");
        Suprimentos suprimento = new Suprimentos(222, "possui 2 rodas e 1 guidão", -1, 1_000);
        System.out.println("Número do item: ");
        System.out.println(suprimento.getNumberItem());
        System.out.println("Descrição do item: ");
        System.out.println(suprimento.getDescriptionItem());
        System.out.println("Quantidade do item comprada: ");
        System.out.println(suprimento.getQuantityBuyedFromItem());
        System.out.println("Preço do produto: ");
        System.out.println(suprimento.getPriceItem());
        System.out.println("Valor da fatura total: ");
        System.out.println(suprimento.getInvoiceAmount());
        System.out.println("----------------------------------------------------------------");
        System.out.println("2º Exercício: ");
        Colaborador colab = new Colaborador("Mario", "Silva", 2_0000);
        Colaborador colab2 = new Colaborador("Jefferson", "Dantas", 10_000);
        System.out.println("Dados do colaborador 1 e 2: ");
        System.out.println("nome " + colab.getName() + " sobrenome: " + colab.getLastName() + " salário " + colab.getSalary());
        System.out.println("nome " + colab2.getName() + " sobrenome: " + colab2.getLastName() + " salário " + colab2.getSalary());
        System.out.println("Dados dos dois colaboradores com aumento de salário: ");
        System.out.println("nome " + colab.getName() + " sobrenome: " + colab.getLastName() + " salário " + colab.increaseSalary(colab.getSalary()));
        System.out.println("nome " + colab.getName() + " sobrenome: " + colab.getLastName() + " salário " + colab.increaseSalary(colab2.getSalary()));

    }
}