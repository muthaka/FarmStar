package pekamu.farmstar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Results extends Activity{
	Button checkdemand;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.results);
		
		checkdemand = (Button) findViewById(R.id.btdemand);
		checkdemand.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}
