package com.example.utctest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	EditText usuario, password;
	Button entrar;
	String USUARIO_VALIDO = "UTC";
	String CLAVE_VALIDO = "2016";

	public void validar(View v) {
		// variable para guardar dato escrito
		String vUsuario = usuario.getText().toString();
		String vPassword = password.getText().toString();

		// validacion la funcion de login
		if (USUARIO_VALIDO.equals(vUsuario) && CLAVE_VALIDO.equals(vPassword)) {
			// navegar a otra pantalla
			Intent opciones = new Intent(this, Opciones.class);
			startActivity(opciones);
		} else {
			// validacion
			Toast.makeText(getApplicationContext(),
					"Usuario o Contraseña Incorrecta", Toast.LENGTH_SHORT)
					.show();
		}

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		usuario = (EditText) findViewById(R.id.editTextUsuario);
		password = (EditText) findViewById(R.id.editTextPassword);
		entrar = (Button) findViewById(R.id.buttonEntrar);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
