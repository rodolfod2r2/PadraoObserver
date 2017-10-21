package br.com.padrao.observer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Versão Com Observer. \n");

        //instanciando uma pessoa
        Pessoa pessoa = new Pessoa("Pessoa", "000");
        //instanciando um fax
        Fax fax = new Fax("PABX", 125);
        //instancando uma secretaria
        SecretariaEletronica secretariaEletronica= new SecretariaEletronica("1000", "HTC");

        //instanciando um observer
        Telefone tel= new Telefone("888");
        //adicionando observadores
        tel.adicionarObservador(pessoa);
        tel.adicionarObservador(fax);
        tel.adicionarObservador(secretariaEletronica);

        //informando o status do observado
        tel.setStatus(1);

        //criando uma pausa
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // mudando o status
        tel.setStatus(2);

        //criando uma pausa
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //mudando o status
        tel.setStatus(3);


    }

}
