package cl.inacap.conciertos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText Nombre;
    private  int dia, mes, anio,Dia, Mes, Anio;
    static final int DATE_ID= 1;
    private EditText Fecha;
    private Spinner Musica;
     Calendar C= Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Nombre= findViewById(R.id.NombreTxt);
        this.Fecha= findViewById(R.id.FechaDate);
        this.Musica= findViewById(R.id.Musica_sp);
        String[] arrayMusica={"Rock"
                , "Jazz"
                , "Pop"
                , "Reguetoon"
                , "Salsa"
                , "Metal"};
        Musica.setAdapter((new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayMusica)));
        dia= C.get(Calendar.DAY_OF_MONTH);
        mes= C.get(Calendar.MONTH);
        anio= C.get(Calendar.YEAR);

        Fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialog(DATE_ID);

            }
        });

        Musica.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int Position, long ID) {
                Log.d("Musica elegida:", parent.getItemAtPosition(Position).toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
    private void colocarFecha(){
        Fecha.setText(Dia+"/"+ (Mes+1)+"/"+Anio);
    }

    private DatePickerDialog.OnDateSetListener  nDateSetListener=
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int D, int M, int Y) {
                    Dia=D;
                    Mes=M;
                    Anio=Y;
                    colocarFecha();
                }
            };



    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id){
            case DATE_ID:
                return new DatePickerDialog(this, nDateSetListener, dia, mes, anio);
        }


        return null;
    }
}