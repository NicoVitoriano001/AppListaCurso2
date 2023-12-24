package devandroid.nico.applistacurso2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.nico.applistacurso2.R;
import devandroid.nico.applistacurso2.model.Pessoa;

public class MainActivity extends AppCompatActivity {

 Pessoa pessoa; //criou classe e objeto dela(foi com mesmo nome, mas pode ser diferente)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa(); //criou o objeto pessoa na Classe Pessoa
        //atribuir dados/valores para o objeto
        pessoa.setPrimeiroNome("Nico");
        pessoa.setSobreNOme("Vit");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11 8383838383");
        //ver menu lateral Structure
    }
}