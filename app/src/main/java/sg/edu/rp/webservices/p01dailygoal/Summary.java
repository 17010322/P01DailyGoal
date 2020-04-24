package sg.edu.rp.webservices.p01dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        TextView tv1 = findViewById(R.id.textView);
        tv1.setText("Read up on materials before class: "+info[0]+"Arrive on time so as to not miss the important part of the lesson: "+info[1]+
                    "Attempt the problem myself: "+info[2]+"Reflection: "+info[3]);
    }
}
