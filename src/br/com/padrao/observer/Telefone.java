package br.com.padrao.observer;

import java.util.ArrayList;
import java.util.List;


//Este é o OBSERVADO
public class Telefone {

    //lista de observadores
    private List<Observer> list = new ArrayList<>();
    //numero do telefone
    private String numero;
    //status do telefone
    private int status;

    //construtor, recebe o parametro do numero por isso não possuit um set
    public Telefone(String numero) {
        this.numero = numero;
    }

    //get do numero
    public String getNumero() {
        return numero;
    }


    //status do telefone // quando o status é passado ele chama um dos métodos: tocar, atender e desligar
    public void setStatus(int status) {
        this.status = status;
        if (getStatus() == 1){
            tocarTelefone();
        } else if (getStatus() == 2){
            atenderTelefone();
        } else {
            desligarTelefone();
        }
    }

    public int getStatus() {
        return status;
    }

    //chama o metodo notificar todos
    public void tocarTelefone() {
        System.out.println("Telefone " + getNumero() + " está tocando!");
        notificarTodos();
    }

    //chama o metodo notificar todos
    public void atenderTelefone() {
        System.out.println("Telefone " + getNumero() + " atendido!");
        notificarTodos();
    }

    //chama o metodo notificar todos
    public void desligarTelefone() {
        System.out.println("Telefone " + getNumero() + " desligado!");
        notificarTodos();
    }

    //adiciona a lista de observadores
    public void adicionarObservador (Observer observador) {
        list.add(observador);
    }

    //remove a lista de observadores
    public void removerObservador (Observer observer){
        list.remove(observer);
    }

    //notifica a todos os observadores
    public void notificarTodos(){
        for (Observer observer : list) {
            observer.notificar();
        }
    }

}
