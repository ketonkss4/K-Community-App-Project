package org.churchapp.community.login;

import org.churchapp.community.MainActivity;
import org.churchapp.community.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
	}
	public void openMain (View view) {
		Intent intent = new Intent (this, MainActivity.class);
		startActivity(intent);
	}
}
