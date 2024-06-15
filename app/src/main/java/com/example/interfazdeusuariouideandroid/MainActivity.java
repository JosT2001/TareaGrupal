package com.example.interfazdeusuariouideandroid;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void clickbBotonGuardar(View view) {
        TextInputLayout idNombre = findViewById(R.id.idNombre);
        TextInputLayout idTelefono = findViewById(R.id.idTelefono);
        TextInputEditText txtTelefono = findViewById(R.id.txtTelefono);
        String Telefono = txtTelefono.getText().toString();
        if (Telefono.equals("") || Telefono.length()!=10){
            idTelefono.setError("ingrese una cedula valida");
        }else
            idTelefono.setError("");
    }
}