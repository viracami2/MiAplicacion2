package com.virra.miaplicacion2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Detalle extends AppCompatActivity {

    @Bind(R.id.nombre)
    TextView nombre;
    @Bind(R.id.telefono)
    TextView telefono;
    @Bind(R.id.email)
    TextView email;
    @Bind(R.id.contacto)
    TextView contacto;
    @Bind(R.id.btnmodi)
    Button btnmodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        ButterKnife.bind(this);

        Bundle parametros = getIntent().getExtras();
        String nombree = parametros.getString("nombre");
        String tel = parametros.getString("telefono");
        String emaill = parametros.getString("email");
        String contactoo = parametros.getString("contacto");

        nombre.setText(nombree);
        telefono.setText(tel);
        email.setText(emaill);
        contacto.setText(contactoo);

    }

    @OnClick(R.id.btnmodi)
    public void onClick(View view) {
        //Snackbar.make(view, getResources().getString(R.string.saludo), Snackbar.LENGTH_LONG).show();
        //Snackbar.make(view,getResources().getString(R.string.saludo),Snackbar.LENGTH_LONG).show();

        String nombree = nombre.getText().toString().trim();
        String telefonoo = telefono.getText().toString().trim();
        String emaill = email.getText().toString().trim();
        String contactoo = contacto.getText().toString().trim();

        Intent intent = new Intent(Detalle.this, MainActivity.class);
        intent.putExtra("nombre", nombree);
        intent.putExtra("telefono", telefonoo);
        intent.putExtra("email", emaill);
        intent.putExtra("contacto", contactoo);
        startActivity(intent);
    }
}
