package com.example.utctest;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Materia3 extends ActionBarActivity  implements OnItemClickListener{
	LinearLayout l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
	Button continuar, menu;
	ListView r1, r2, r3, r4, r5, r6, r7, r8, r9, r10;
	TextView p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,SO;
	// codigo nuevo
	TextView c1, c2;

	// fin
	String[] sr1 = new String[] { "Percepción visual", "Paseo Cognitivo",
			"Lluvia de ideas", "Diagramas" };
	String[] sr2 = new String[] { "Proximidad", "Sencillez",
			"Acercamiento", "Resolución" };
	String[] sr3 = new String[] { "La memoria", "La visión", "La calidad ",
			"El idioma" };
	String[] sr4 = new String[] { "Organizar", "Diseñar", "Corregir",
			"Probar" };
	String[] sr5 = new String[] { "Largo plazo",
			"Mediano plazo", "Gran plazo", "A cierto tiempo" };
	String[] sr6 = new String[] { "Familiaridad", "Sencillez",
			"Calidad", "Aprendizaje" };
	String[] sr7 = new String[] { "Evaluación heurística  ", "Recorrido  de Mapas", "Inspecciones de visibilidad",
			"Inspecciones de fácil aprendizaje" };
	String[] sr8 = new String[] { "Ayuda y documentación", "Diseño de interfaces", "Sencillez", "Corrige errores" };
	String[] sr9 = new String[] { "Simplicidad","Consistencia", "Dialogo Simple","Salida de errores" };
	String[] sr10 = new String[] { "Planificación", "Privacidad",
			"Habilidad", "Calidad", };

	String[] respuesta = new String[] { "Percepción visual", "Proximidad",
			"Proximidad", "La memoria", "Organizar", "Largo plazo",
			"Familiaridad", "Evaluación heurística ","Ayuda y documentación", "Simplicidad", "Planificación" };

	// variables de formulas
	int correctas = 0;
	int incorrectas = 0;
	int contador = 1;
	int Valor2;
	Boolean seleccionado = false;
	String escogido;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_materia3);
		
			
		c1 = (TextView) findViewById(R.id.textViewACC);
		c2 = (TextView) findViewById(R.id.incorrectoTC);
		c1.setVisibility(View.GONE);
		c2.setVisibility(View.GONE);
		menu = (Button) findViewById(R.id.buttonMenuC);
		menu.setVisibility(View.GONE);

		l1 = (LinearLayout) findViewById(R.id.linear1C);
		l2 = (LinearLayout) findViewById(R.id.linear2C);
		l3 = (LinearLayout) findViewById(R.id.linear3C);
		l4 = (LinearLayout) findViewById(R.id.linear4C);
		l5 = (LinearLayout) findViewById(R.id.linear5C);
		l6 = (LinearLayout) findViewById(R.id.linear6C);
		l7 = (LinearLayout) findViewById(R.id.linear7C);
		l8 = (LinearLayout) findViewById(R.id.linear8C);
		l9 = (LinearLayout) findViewById(R.id.linear9C);
		l10 = (LinearLayout) findViewById(R.id.linear10C);

		continuar = (Button) findViewById(R.id.buttonContinuarC);

		r1 = (ListView) findViewById(R.id.listView1C);
		r2 = (ListView) findViewById(R.id.listView2C);
		r3 = (ListView) findViewById(R.id.listView3C);
		r4 = (ListView) findViewById(R.id.listView4C);
		r5 = (ListView) findViewById(R.id.listView5C);
		r6 = (ListView) findViewById(R.id.listView6C);
		r7 = (ListView) findViewById(R.id.listView7C);
		r8 = (ListView) findViewById(R.id.listView8C);
		r9 = (ListView) findViewById(R.id.listView9C);
		r10 = (ListView) findViewById(R.id.listView10C);

		l1.setVisibility(View.VISIBLE);
		l2.setVisibility(View.GONE);
		l3.setVisibility(View.GONE);
		l4.setVisibility(View.GONE);
		l5.setVisibility(View.GONE);
		l6.setVisibility(View.GONE);
		l7.setVisibility(View.GONE);
		l8.setVisibility(View.GONE);
		l9.setVisibility(View.GONE);
		l10.setVisibility(View.GONE);

		ArrayAdapter<String> p1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sr1);
		r1.setAdapter(p1);

		ArrayAdapter<String> p2 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sr2);
		r2.setAdapter(p2);

		ArrayAdapter<String> p3 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sr3);
		r3.setAdapter(p3);

		ArrayAdapter<String> p4 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sr4);
		r4.setAdapter(p4);

		ArrayAdapter<String> p5 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sr5);
		r5.setAdapter(p5);

		ArrayAdapter<String> p6 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sr6);
		r6.setAdapter(p6);

		ArrayAdapter<String> p7 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sr7);
		r7.setAdapter(p7);

		ArrayAdapter<String> p8 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sr8);
		r8.setAdapter(p8);

		ArrayAdapter<String> p9 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sr9);
		r9.setAdapter(p9);

		ArrayAdapter<String> p10 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sr10);
		r10.setAdapter(p10);

		r1.setOnItemClickListener(this);

	}

	public void continuar(View v) {

		try {
			for (int i = 0; i < 10; i++) {
				if (escogido == respuesta[i]) {
					correctas++;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT)
					.show();
		}

		try {
			switch (contador) {
			case 1:
				l1.setVisibility(View.GONE);
				l2.setVisibility(View.VISIBLE);
				r1.setOnItemClickListener(null);
				r2.setOnItemClickListener((OnItemClickListener) this);
				seleccionado = false;
				contador++;

				break;

			case 2:
				l2.setVisibility(View.GONE);
				l3.setVisibility(View.VISIBLE);
				r2.setOnItemClickListener(null);
				r3.setOnItemClickListener((OnItemClickListener) this);
				seleccionado = false;
				contador++;
				break;

			case 3:
				l3.setVisibility(View.GONE);
				l4.setVisibility(View.VISIBLE);
				r3.setOnItemClickListener(null);
				r4.setOnItemClickListener((OnItemClickListener) this);
				seleccionado = false;
				contador++;
				break;

			case 4:
				l4.setVisibility(View.GONE);
				l5.setVisibility(View.VISIBLE);
				r4.setOnItemClickListener(null);
				r5.setOnItemClickListener((OnItemClickListener) this);
				seleccionado = false;
				contador++;
				break;

			case 5:
				l5.setVisibility(View.GONE);
				l6.setVisibility(View.VISIBLE);
				r5.setOnItemClickListener(null);
				r6.setOnItemClickListener((OnItemClickListener) this);
				seleccionado = false;
				contador++;
				break;

			case 6:
				l6.setVisibility(View.GONE);
				l7.setVisibility(View.VISIBLE);
				r6.setOnItemClickListener(null);
				r7.setOnItemClickListener((OnItemClickListener) this);
				seleccionado = false;
				contador++;
				break;

			case 7:
				l7.setVisibility(View.GONE);
				l8.setVisibility(View.VISIBLE);
				r7.setOnItemClickListener(null);
				r8.setOnItemClickListener((OnItemClickListener) this);
				seleccionado = false;
				contador++;
				break;

			case 8:
				l8.setVisibility(View.GONE);
				l9.setVisibility(View.VISIBLE);
				r8.setOnItemClickListener(null);
				r9.setOnItemClickListener((OnItemClickListener) this);
				seleccionado = false;
				contador++;
				break;

			case 9:
				l9.setVisibility(View.GONE);
				l10.setVisibility(View.VISIBLE);
				r9.setOnItemClickListener(null);
				r10.setOnItemClickListener((OnItemClickListener) this);
				seleccionado = false;
				contador++;
				break;

			case 10:
				l10.setVisibility(View.GONE);
				evaluar();
				break;

			default:
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			Toast.makeText(getApplicationContext(), "Error de visibility",
					Toast.LENGTH_SHORT).show();
		}

	}

	private void evaluar() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Correctas" + correctas,
				Toast.LENGTH_SHORT).show();
		incorrectas = 10 - correctas;
		Toast.makeText(getApplicationContext(), "Incorrectas" + incorrectas,
				Toast.LENGTH_SHORT).show();
		// nuevocodigo

		c1.setText("Correctas " + correctas);
		c1.setVisibility(View.VISIBLE);

		c2.setText("Incorrectas " + incorrectas);
		c2.setVisibility(View.VISIBLE);

		menu.setVisibility(View.VISIBLE);

	}

	public void menu(View v) {

		Intent op = new Intent(this, Opciones.class);
		String aux = String.valueOf(correctas);
		op.putExtra("resultado3", aux);
		startActivity(op);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		switch (contador) {
		case 1:
			try {
				escogido = r1.getItemAtPosition(position).toString();
				seleccionado = true;
				Toast.makeText(getApplicationContext(),
						escogido + "   Puede continuar  " + seleccionado,
						Toast.LENGTH_SHORT).show();
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_SHORT).show();
			}

			break;

		case 2:
			try {
				escogido = r2.getItemAtPosition(position).toString();
				seleccionado = true;
				Toast.makeText(getApplicationContext(),
						escogido + "Puede continuar", Toast.LENGTH_SHORT)
						.show();
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_SHORT).show();
			}
			break;
		case 3:
			try {
				escogido = r3.getItemAtPosition(position).toString();
				seleccionado = true;
				Toast.makeText(getApplicationContext(),
						escogido + "Puede continuar", Toast.LENGTH_SHORT)
						.show();
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_SHORT).show();
			}
			break;
		case 4:
			try {
				escogido = r4.getItemAtPosition(position).toString();
				seleccionado = true;
				Toast.makeText(getApplicationContext(),
						escogido + "Puede continuar", Toast.LENGTH_SHORT)
						.show();
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_SHORT).show();
			}
			break;
		case 5:
			try {
				escogido = r5.getItemAtPosition(position).toString();
				seleccionado = true;
				Toast.makeText(getApplicationContext(),
						escogido + "Puede continuar", Toast.LENGTH_SHORT)
						.show();
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_SHORT).show();
			}
			break;
		case 6:
			try {
				escogido = r6.getItemAtPosition(position).toString();
				seleccionado = true;
				Toast.makeText(getApplicationContext(),
						escogido + "Puede continuar", Toast.LENGTH_SHORT)
						.show();
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_SHORT).show();
			}
			break;
		case 7:
			try {
				escogido = r7.getItemAtPosition(position).toString();
				seleccionado = true;
				Toast.makeText(getApplicationContext(),
						escogido + "Puede continuar", Toast.LENGTH_SHORT)
						.show();
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_SHORT).show();
			}
			break;
		case 8:
			try {
				escogido = r8.getItemAtPosition(position).toString();
				seleccionado = true;
				Toast.makeText(getApplicationContext(),
						escogido + "Puede continuar", Toast.LENGTH_SHORT)
						.show();
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_SHORT).show();
			}
			break;
		case 9:
			try {
				escogido = r9.getItemAtPosition(position).toString();
				seleccionado = true;
				Toast.makeText(getApplicationContext(),
						escogido + "Puede continuar", Toast.LENGTH_SHORT)
						.show();
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_SHORT).show();
			}
			break;
		case 10:
			try {
				escogido = r10.getItemAtPosition(position).toString();
				seleccionado = true;
				Toast.makeText(getApplicationContext(),
						escogido + "Puede continuar", Toast.LENGTH_SHORT)
						.show();
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_SHORT).show();
			}
			break;

		default:
			break;
		}

	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.materia3, menu);
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
