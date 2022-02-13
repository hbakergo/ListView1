package baker.com.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewNomes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewNomes = findViewById(R.id.listViewNomes);

        listViewNomes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                String nome = (String) listViewNomes.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),
                        nome + getString(R.string.foi_clicado),
                        Toast.LENGTH_SHORT).show();

            }
        });

        popularLista();
    }

    private void popularLista(){
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add(getString(R.string.tony));
        nomes.add(getString(R.string.bruce));
        nomes.add(getString(R.string.steve));
        nomes.add(getString(R.string.diana));
        nomes.add(getString(R.string.natasha));
        nomes.add(getString(R.string.clark));
        nomes.add(getString(R.string.nick));
        nomes.add(getString(R.string.barry));

        //ArrayAdapter está sendo usado para mostrar textos
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                                    android.R.layout.simple_list_item_1,
                                    nomes);
        listViewNomes.setAdapter(adapter);
    }
}