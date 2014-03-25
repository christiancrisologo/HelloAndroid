package com.cyian.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button btn = (Button) findViewById(R.id.helloBtn);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {                                              
				Toast.makeText(getApplicationContext(),
						R.string.hello_congrats,Toast.LENGTH_SHORT).show();
			}
		});
	}

}
