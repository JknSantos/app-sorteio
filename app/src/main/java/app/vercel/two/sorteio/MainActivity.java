package app.vercel.two.sorteio;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void selecionarBotao(View v) {
        TextView textoResultado = findViewById(R.id.textoResultado);
        int numeroAleatorio = new Random().nextInt( 11);
        textoResultado.setText("O numero sorteado foi: " + numeroAleatorio);
    }
}