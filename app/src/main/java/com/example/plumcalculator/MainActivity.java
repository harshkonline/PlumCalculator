package com.example.plumcalculator;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

	 public String str ="";
	 Character op = 'q';
	 int i,num,numtemp;
	 EditText showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = (EditText)findViewById(R.id.editText);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
    public void onButtonClick(View v) {
    	switch(v.getId())
    	{
    	case R.id.button1:
    		insert(1);
    		calculate();
    	break;
    	case R.id.button2:
    		insert(2);
    		calculate();
    		break;
    	case R.id.button3:
    		insert(3);
    		calculate();
    		break;
    	case R.id.button4:
    		insert(4);
    		calculate();
    		break;	
    	case R.id.button5:
    		insert(5);
    		calculate();
    		break;
    	case R.id.button6:
    		insert(6);
    		calculate();
    		break;	
    	case R.id.button7:
    		insert(7);
    		calculate();
    		break;
    	case R.id.button8:
    		insert(8);
    		calculate();
    		break;
    	case R.id.button9:
    		insert(9);
    		calculate();
    		break;
    	case R.id.button0:
    		insert(0);
    		calculate();
    		break;
    	case R.id.buttonAdd:
    		   perform();
    	       op = '+';
    	    break;
    	    
    	case R.id.buttonSubtract:
 		   perform();
 	       op = '-';
 	    break; 
    	case R.id.buttonEquals:
    		perform();
    		op = '=';
 		  calculate();
 	    break;
 	    
    	case R.id.buttonClear:
   		  reset();
   	    break;

    	default:
    	throw new RuntimeException("Unknow button ID");
    	}
    }
    
    private void reset() {
    	  // TODO Auto-generated method stub
    	   str ="";
    	   op ='q';
    	   num = 0;
    	   numtemp = 0;
    	   showResult.setText("");
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
    
    private void insert(int j) {
       
           str = str+Integer.toString(j);
           num = Integer.valueOf(str).intValue();
           showResult.setText(str);
            
         
       }
          private void perform() {
       
        str = "";
        numtemp = num;
       }
        
        private void calculate() {
        if(op == '+')
         num = numtemp+num;
        else if(op == '-')
         num = numtemp-num;
        else if(op == '/')
         num = numtemp/num;
        else if(op == '*')
         num = numtemp*num;
        else if(op == '=')
         num = numtemp;
        showResult.setText(""+num);
       }
    
}
