package devandroid.nico.applistacurso2.model;


public class Pessoa {  //classe com Letra maiúscula - pascalCase, camelCase

    // atributos/metodo usar camelCase
    // métodos de acesso (gets and sets), pois são privados, no mainActivity não aparece se estiver privado

    private String primeiroNome; //criado atributo - ctrl+D copia
    private String sobreNome; //criado atributo, mas tem que ter método para deixar de ser privado
    private String cursoDesejado;
    private String telefoneContato; //criado atributo, para criar métodos de acesso getter and setter,
    // após do public Pessoa, botao direito, Generate, selecionar tudo

    public Pessoa() { //na Structure, Pessoal() é o método construtor
        // para cada objeto tem que haver construtor. AndroidStudio facilita exe: public Pessoa (){}
    }

    public String getPrimeiroNome() { //na Structure, Pessoa() é o método de acesso getter and setter
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }


    //To String - para textos ou para strings de caracteres.
    // para adicionar tostr > wizard    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }

}
