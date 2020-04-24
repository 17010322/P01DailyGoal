package sg.edu.rp.webservices.p01dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGrp1);
                int selectedButtonId1= rg1.getCheckedRadioButtonId();
                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId1);

                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGrp2);
                int selectedButtonId2= rg2.getCheckedRadioButtonId();
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);

                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGrp3);
                int selectedButtonId3= rg3.getCheckedRadioButtonId();
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);

                EditText editText = (EditText) findViewById(R.id.editText);

                String[]info = {rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString(),editText.getText().toString()};
                Intent i = new Intent(MainActivity.this,Summary.class);
                i.putExtra("info",info);
                startActivity(i);

            }
        });
    }
}
