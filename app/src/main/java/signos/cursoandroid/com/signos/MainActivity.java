package signos.cursoandroid.com.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listitens;
    private String [] itens = {"Aries", "Touro", "Câncer", "Escorpião", "Leão"};
    private String [] respostas = {"é Aries", "Meu signo", "n quero", "Dar picada", "Rei da selva"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listitens = (ListView) findViewById(R.id.listviewid);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
            getApplicationContext(),
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            itens
            );

        listitens.setAdapter(adaptador);

        listitens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            int posicao = position;

                    Toast.makeText(getApplicationContext(),respostas[posicao],Toast.LENGTH_LONG).show();


   }
 }

  );
}
}
