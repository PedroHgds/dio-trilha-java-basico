public class Escopo_Exemplo{

//variavel da classe conta

double saldo = 10.0;
public void sacar (Double valor){
    //variavel local de método
    double novoSaldo = saldo - valor;

}
public void imprimirSaldo(){
    //disponível em toda classe
    System.out.println(saldo);
    //somente o método sacar conhece esta váriavel

    //System.out.println(novoSaldo);{}
}


}