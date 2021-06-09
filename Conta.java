public class Conta {
    private int Numero;
    public int op;
    private String Dono; 
    private double Saldo;
    private double Limite;
    
    public Conta() {
        this.Numero=0;
        this.Dono=" ";
        this.Saldo=0;
        this.Limite=0; 
    }
    public int getNumero() {
        return Numero; 
    }
    public void setNumero(int Numero) {
        this.Numero = Numero; 
    }
    public String getDono() {
        return Dono; 
    }
    public void setDono(String Dono) {
        this.Dono = Dono; 
    }
    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    public double getLimite() {
        return Limite;
    }
    public void setLimite(double Limite) {
        this.Limite = Limite;
    }
    boolean saca(double quantidade) {
        if (this.Saldo<quantidade)
    return false;
    else {
        this.Saldo = this.Saldo - quantidade;
    return true; 
        }
    }
    void deposita(double quantidade) {
        this.Saldo = this.Saldo + quantidade;
    }
    void inseredados(String a, int b, float c, float l){
        this.Dono = a;
        this.Numero = b;
        this.Saldo = c;
        this.Limite = l;
    }
    void mostrardado(){
        System.out.println("Responsável pela conta: " + this.getDono());
        System.out.println("Numero de sua conta bancária: " + this.getNumero());
        System.out.println("Seu saldo: " + this.getSaldo());
    }
    void mostrarsal(){
            System.out.println("Seu saldo: " + this.getSaldo()); 
        
    }
}
