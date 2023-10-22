package pt.ulusofona.deisi.lp2.contaBancaria;

public class ContaBancaria {

    int saldo ;




    public ContaBancaria(int saldo) {
        this.saldo = saldo;
    }

    void deposita(int valor){
        saldo+= saldo;
    }
    boolean levanta(int valor){

        if (saldo -valor >=0){
            saldo-= valor;
            return true;
        }
        return  true;
    }


    String getSaldoComoString(){

        return String.valueOf(saldo);
    }
}
