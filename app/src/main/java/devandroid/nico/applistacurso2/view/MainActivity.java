package devandroid.nico.applistacurso2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.nico.applistacurso2.R;
import devandroid.nico.applistacurso2.model.Pessoa;


public class MainActivity extends AppCompatActivity {

    Pessoa pessoa; //marcou objeto pessoa para Classe Pessoa(foi com mesmo nome, mas pode ser diferente)
    Pessoa outraPessoa;
    EditText editPrimeiroNome;
    EditText editSobrenomeAluno;
    EditText editNomeCurso;
    EditText editTelefoneContato;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa(); //instanciou o objeto pessoa na Classe Pessoa
      /*  pessoa.setPrimeiroNome("Nico"); //variável pessoa para chamar o método setPrimeiroNome(). atribuir dados/valores para o objeto pessoa
        pessoa.setSobreNome("Vit");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11 8383838383");*/
        //ver menu lateral Structure

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz"); //atributos
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("85 202020202002");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome); //O método findViewById() pode ser chamado sem a necessidade de instanciar uma classe. exe: pessoa = new Pessoa();
        editSobrenomeAluno = findViewById(R.id.editSobrenomeAluno);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenomeAluno.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() { //teve que criar/new uma instancia dentro do onclicklistener
            @Override  //tostring lembra???
            public void onClick(View v) {
                editPrimeiroNome.setText("rr");
                editSobrenomeAluno.setText("");
                editNomeCurso.setText("");
                editTelefoneContato.setText("");
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobrenomeAluno.getText().toString());
                pessoa.setCursoDesejado(editNomeCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());
                Toast.makeText(MainActivity.this, "Salvo " + pessoa.toString(), Toast.LENGTH_LONG).show();
            }
        });

/*      dadosPessoa = "Primeiro nome: ";
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
        dadosOutraPessoa += outraPessoa.getTelefoneContato();*/

//feito para debugar no Logcat
        Log.i("POOAndroid", pessoa.toString()); //mesma função das 8 linhas acima
        Log.i("POOAndroid", outraPessoa.toString());


        // Obtém a data e hora atuais
        //     Date dataHoraAtual = new Date();
        // Formata a data e hora atuais
        //      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //     String dataHoraFormatada = sdf.format(dataHoraAtual);
        // Exibe a data e hora atuais no toast
        //     Toast.makeText(this, dataHoraFormatada, Toast.LENGTH_SHORT).show();


    }
}