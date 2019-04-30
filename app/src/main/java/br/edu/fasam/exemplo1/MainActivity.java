package br.edu.fasam.exemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText txtNome;
    EditText txtSobrenome;
    EditText txtEmail;
    EditText txtTelefone;
    ListView listView;
    List<HashMap<String, String>> lista = new ArrayList<>();
    private List<Pessoa> listaPessoa = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void adicionar(View view) {

        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        txtEmail = findViewById(R.id.txtEmail);
        txtTelefone = findViewById(R.id.txtTelefone);

        String nome = txtNome.getText().toString();
        String sobrenome = txtSobrenome.getText().toString();
        String email = txtEmail.getText().toString();
        String telefone = txtTelefone.getText().toString();

        Pessoa pessoa  = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setSobrenome(sobrenome);
        pessoa.setEmail(email);
        pessoa.setTelefone(telefone);

        listaPessoa.add(pessoa);

        List<HashMap<String, String>> colecao = new ArrayList<>();
        //criando colecao para o adapter
        for (Pessoa p : listaPessoa) {
            HashMap<String, String> map = new HashMap<>();
            map.put("nome", p.getNome());
            map.put("sobrenome", p.getSobrenome());
            map.put("email", p.getEmail());
            map.put("telefone", p.getTelefone());

            colecao.add(map);
        }

        //Fazer o mapeamento da colecao com o layout do item
        String[] de = {"nome","sobrenome", "email", "telefone"};
        int[] para = {R.id.txtItemNome,R.id.txtItemSobrenome, R.id.txtItemEmail, R.id.txtItemTelefone};

        //SAIDA

        listView = findViewById(R.id.listView);

        //SIMPLE ADAPTER
        SimpleAdapter adapter =
                new SimpleAdapter(this,colecao,
                        R.layout.item, de,para);


        listView.setAdapter(adapter);


    }
}
