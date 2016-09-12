package com.virra.miaplicacion2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.txt1)
    TextView txt1;
    @Bind(R.id.contenedifecha)
    DatePicker contenedifecha;

    @Bind(R.id.button2)
    Button button2;
    @Bind(R.id.txtnombre)
    EditText txtnombre;
    @Bind(R.id.txttelefono)
    EditText txttelefono;
    @Bind(R.id.txtemail)
    EditText txtemail;
    @Bind(R.id.txtcontacto)
    EditText txtcontacto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void enviarDatos() {

    }

    @OnClick(R.id.button2)
    public void onClick() {

        String nombre = txtnombre.getText().toString().trim();
        String telefono = txttelefono.getText().toString().trim();
        String email = txtemail.getText().toString().trim();
        String contacto = txtcontacto.getText().toString().trim();

        Intent intent = new Intent(MainActivity.this, Detalle.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("telefono", telefono);
        intent.putExtra("email", email);
        intent.putExtra("contacto", contacto);
        startActivity(intent);

    }
}
