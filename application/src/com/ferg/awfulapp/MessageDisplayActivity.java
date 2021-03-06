package com.ferg.awfulapp;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;

import com.ferg.awfulapp.constants.Constants;

public class MessageDisplayActivity extends AwfulActivity {
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

            requestWindowFeature(Window.FEATURE_ACTION_BAR);
            requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.user_cp_activity);
        setContentPane();
    }

    public void setContentPane() {
    	if (getSupportFragmentManager().findFragmentById(R.id.ucpcontent) == null) {
	        MessageFragment fragment = new MessageFragment(getIntent().getStringExtra(Constants.PARAM_USERNAME),getIntent().getIntExtra(Constants.PARAM_PRIVATE_MESSAGE_ID, 0));
	
	        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
	        transaction.replace(R.id.ucpcontent, fragment);
	        transaction.commit();
    	}
    }

}
