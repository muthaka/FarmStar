package pekamu.farmstar;

import pekamu.farmstar.R;
import pekamu.farmstar.Splashfarm;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splashfarm extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.farmsplash);
		
		Thread timer=new Thread(){
			public void run(){
				
			try{	
				sleep(1000);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
			finally{
				Intent intfarmer = new Intent("pekamu.farmstar.FARMER");
				startActivity(intfarmer);
			}
			
			}
				
		};
		timer.start();
	}

	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	

}
