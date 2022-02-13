package baker.com.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewNomes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewNomes = findViewById(R.id.listViewNomes);

        popularLista();
    }

    private void popularLista(){
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add(getString(R.string.joao));
        nomes.add(getString(R.string.maria));
        nomes.add(getString(R.string.pedro));
        nomes.add(getString(R.string.saulo));
        nomes.add(getString(R.string.lucas));
        nomes.add(getString(R.string.silva));
        nomes.add(getString(R.string.joana));
        nomes.add(getString(R.string.alexandre));

        //ArrayAdapter está sendo usado para mostrar textos
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                                    android.R.layout.simple_list_item_1,
                                    nomes);
        listViewNomes.setAdapter(adapter);
    }
}