package br.com.padrao.observer;


//classe abstrata que é extendida a todos os observadores
abstract class Observer {
    Telefone telefone;
    abstract void notificar();
}
