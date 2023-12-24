package devandroid.nico.applistacurso2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.nico.applistacurso2.R;

import devandroid.nico.applistacurso2.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa; //marcou objeto pessoa para Classe Pessoa(foi com mesmo nome, mas pode ser diferente)
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa(); //criou o objeto pessoa na Classe Pessoa
        pessoa.setPrimeiroNome("Nico"); //atribuir dados/valores para o objeto pessoa
        pessoa.setSobreNome("Vit");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11 8383838383");
        //ver menu lateral Structure

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz"); //atributos
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("85 202020202002");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();



        int parada = 0;







    }
}