package alice.domnom.rippagebalancedbros.discourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayIssue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_issue);

        Intent intent = getIntent();
//        TextView textView = (TextView) findViewById(R.id.issueDescription);
//        textView.setText("Syria is ripping its prip. With human tolls mounting, how can we judge the resources involved with rising power and humanitarian issues");
//
//        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_issue);
    }

    public void goToDiscussion(View view){

        Intent intent = new Intent(this, VideoActivity.class);

        startActivity(intent);
    }
    public void goToReflectionPrompt(View view) {
        Intent intent = new Intent(this, ReflectionPrompt.class);

        startActivity(intent);
    }
}
