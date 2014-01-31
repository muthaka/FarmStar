package pekamu.farmstar;

import pekamu.farmstar.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * @author p.muthaka
 *
 */

public class Farmer extends Activity implements OnClickListener{
	 Button get;
	 TextView landsize, crop, produce, irrigation;
	 ImageView imgcrop;
	
	 Spinner spsoil, spclimate,splandscl;
     


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_farmer);
		  
		  get = (Button) findViewById(R.id.btnget);
		  landsize = (TextView) findViewById(R.id.tvlandsize);
		  crop = (TextView) findViewById(R.id.tvcrp);
		  produce = (TextView) findViewById(R.id.tvprd);
		  irrigation = (TextView) findViewById(R.id.tvirg);

		  
		    spsoil = (Spinner) findViewById(R.id.spsoil);
			ArrayAdapter<CharSequence> sladapter = ArrayAdapter.createFromResource(this,R.array.soil, android.R.layout.simple_spinner_item);
			// Specify the layout to use when the list of choices appears
			sladapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			// Apply the adapter to the spinner
			spsoil.setAdapter(sladapter);
			spsoil.setOnItemSelectedListener(new OnItemSelectedListener(){

				@Override
				public void onItemSelected(AdapterView<?> parent, View arg1,int arg2, long arg3) {
					String itsl = (String) parent.getItemAtPosition(arg2);	
					return;
				}

				@Override
				public void onNothingSelected(AdapterView<?> arg0) {
					// TODO Auto-generated method stub	
				}	
			});
			
			spclimate = (Spinner) findViewById(R.id.spclimate);
			ArrayAdapter<CharSequence> cladapter = ArrayAdapter.createFromResource(this,R.array.climate, android.R.layout.simple_spinner_item);
			// Specify the layout to use when the list of choices appears
			cladapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			// Apply the adapter to the spinner
			spclimate.setAdapter(cladapter);
			spclimate.setOnItemSelectedListener(new OnItemSelectedListener(){

				@Override
				public void onItemSelected(AdapterView<?> parent, View arg1,int arg2, long arg3) {
					String itcl = (String) parent.getItemAtPosition(arg2);	
					return ;
				}

				@Override
				public void onNothingSelected(AdapterView<?> arg0) {
					// TODO Auto-generated method stub	
				}	
			});
			
			splandscl = (Spinner) findViewById(R.id.splandscl);
			ArrayAdapter<CharSequence> ldadapter = ArrayAdapter.createFromResource(this,R.array.landscale, android.R.layout.simple_spinner_item);
			// Specify the layout to use when the list of choices appears
			ldadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			// Apply the adapter to the spinner
			splandscl.setAdapter(ldadapter);
			splandscl.setOnItemSelectedListener(new OnItemSelectedListener(){

				@Override
				public void onItemSelected(AdapterView<?> parent, View arg1,int arg2, long arg3) {
					String itld = (String) parent.getItemAtPosition(arg2);	
					return;
				}

				@Override
				public void onNothingSelected(AdapterView<?> arg0) {
					// TODO Auto-generated method stub	
				}	
			});
          
          get.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent getint = new Intent("pekamu.farmstar.RESULTS");
				startActivity(getint);
			}
		});
         
          
          
         
         
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.farmer, menu);
		
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

}
