package Core;

public class ContaBancaria {
    private int numeroConta;
    private int digitoVerif;
    private String cpfTitular;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, int digitoVerif, String cpfTitular, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.digitoVerif = digitoVerif;
        this.cpfTitular = cpfTitular;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    //Método especificos que dizem respeito a conta bancaria
    public void despositar(double valor){ // Metodo para acrecentar + valor no saldo
        this.saldo += valor;
    }

    public String exibirDados(){ //Metodo para exibir os dados da conta
        String s = "(" + cpfTitular + ")" + String.format("%.2f", saldo);
        return "Conta: "+numeroConta+"-"+digitoVerif+":"+nomeTitular+"("+cpfTitular+")"+String.format("R$ %.2f",saldo);
    }

    public boolean sacar(double valor){ //Metodo para verificar se tem saldo na conta para sacar
        if (saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    //Get e Set
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigitoVerif() {
        return digitoVerif;
    }

    public void setDigitoVerif(int digitoVerif) {
        this.digitoVerif = digitoVerif;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }
}
