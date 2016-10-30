package com.example.utctest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Opciones extends ActionBarActivity {
	TextView AC, Resultado,SO,U,SF;
	int Valor1;
	int Valor2;
	int Valor3;
	int Valor4;
	float r;
	Button RFinal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_opciones);
		AC = (TextView) findViewById(R.id.textViewAC);
		SO= (TextView)findViewById(R.id.textViewSO);
		SF= (TextView)findViewById(R.id.textViewF);
		U= (TextView)findViewById(R.id.textViewU);
		Resultado = (TextView) findViewById(R.id.textViewResultado);
		RFinal = (Button) findViewById(R.id.buttonRFinal);
		
		// pase de datos
		try {
			Bundle ma1 = getIntent().getExtras();
			AC.setText(ma1.getString("resultado1") + "");
			Valor1 = Integer.parseInt(AC.getText().toString());
			Toast.makeText(getApplicationContext(), "funciona",
					Toast.LENGTH_SHORT).show();
		} catch (Exception e) {
			// TODO: handle exception
			Toast.makeText(getApplicationContext(), "No funciono",
					Toast.LENGTH_SHORT).show();
		}
		
		try {
			Bundle ma2 = getIntent().getExtras();
			SO.setText(ma2.getString("resultado2") + "");
			Valor2 = Integer.parseInt(SO.getText().toString());
			Toast.makeText(getApplicationContext(), "funciona",
					Toast.LENGTH_SHORT).show();
		} catch (Exception e) {
			// TODO: handle exception
			Toast.makeText(getApplicationContext(), "No funciono",
					Toast.LENGTH_SHORT).show();
		}
		
		try {
			Bundle ma3 = getIntent().getExtras();
			U.setText(ma3.getString("resultado3") + "");
			Valor3 = Integer.parseInt(U.getText().toString());
			Toast.makeText(getApplicationContext(), "funciona",
					Toast.LENGTH_SHORT).show();
		} catch (Exception e) {
			// TODO: handle exception
			Toast.makeText(getApplicationContext(), "No funciono",
					Toast.LENGTH_SHORT).show();
		}
		
		try {
			Bundle ma4 = getIntent().getExtras();
			SF.setText(ma4.getString("resultado4") + "");
			Valor4 = Integer.parseInt(SF.getText().toString());
			Toast.makeText(getApplicationContext(), "funciona",
					Toast.LENGTH_SHORT).show();
		} catch (Exception e) {
			// TODO: handle exception
			Toast.makeText(getApplicationContext(), "No funciono",
					Toast.LENGTH_SHORT).show();
		}

	}

	public void resultado(View v) {
		int resul = 0;
		int SumTotal = 0;
		SumTotal = 7+4+8+9;
		r = SumTotal/4;
		Toast.makeText(getApplicationContext(), "resultado final" + r,
				Toast.LENGTH_SHORT).show();
		Resultado.setText("Promedio es : " + r);

	}

	public void materia1(View v) {
		Intent m1 = new Intent(this, Materia1.class);
		startActivity(m1);
	}

	public void materia2(View w) {
		Intent m2 = new Intent(this, Materia2.class);
		startActivity(m2);
	}

	public void materia3(View s) {
		Intent m3 = new Intent(this, Materia3.class);
		startActivity(m3);
	}

	public void materia4(View p) {
		Intent m4 = new Intent(this, Materia4.class);
		startActivity(m4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.opciones, menu);
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
