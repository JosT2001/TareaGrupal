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

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private Pattern email;

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
        TextInputEditText txtNombre = findViewById(R.id.txtNombre);
        String Nombre = txtNombre.getText().toString();
        if (Nombre.equals("") || Nombre.length() > 150) {
            idNombre.setError("Ingrese un nombre válido");
        } else {
            idNombre.setHelperText("Ingresado Correctamente");
        }
        TextInputLayout idApellido = findViewById(R.id.idApellido);
        TextInputEditText txtApellido = findViewById(R.id.txtApellido);
        String Apellido = txtApellido.getText().toString();
        if (Apellido.equals("") || Apellido.length() > 150) {
            idApellido.setError("Ingrese un Apellido válido");
        } else {
            idApellido.setHelperText("Ingresado Correctamente");
        }
        TextInputLayout idEmpresa = findViewById(R.id.idEmpresa);
        TextInputEditText txtEmpresa = findViewById(R.id.txtEmpresa);
        String Empresa = txtApellido.getText().toString();
        if (Empresa.equals("") || Empresa.length() > 150) {
            idEmpresa.setError("Ingrese un nombre de Empresa válido");
        } else {
            idEmpresa.setHelperText("Ingresado Correctamente");
        }
        TextInputLayout idTelefono = findViewById(R.id.idTelefono);
        TextInputEditText txtTelefono = findViewById(R.id.txtTelefono);
        String Telefono = txtTelefono.getText().toString();
        if (Telefono.equals("") || Telefono.length()!=10){
            idTelefono.setError("ingrese una cedula valida");
        }else {
            idTelefono.setHelperText("Ingresado Correctamente");
        }
        TextInputLayout idCorreo = findViewById(R.id.idCorreo);
        TextInputEditText txtCorreo = findViewById(R.id.txtCorreo);
        String correo = txtCorreo.getText().toString().trim();

        if (correo.equals("") || correo.length() > 100) {
            idCorreo.setError("Ingrese un correo válido");
        } else if (!isValidEmail(correo)) {
            idCorreo.setError("Ingrese un correo electrónico válido");
        } else {
            idCorreo.setError(null);
            idCorreo.setHelperText("Correo electrónico ingresado correctamente");
        }


    }

    private boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regex);
    }
}