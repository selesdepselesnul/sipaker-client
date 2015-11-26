package selesdepselesnul.sipakerclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MemberRequest extends AppCompatActivity {

    private TextView idTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_request);
        this.idTextView = (TextView)findViewById(R.id.idTextView);
        this.idTextView.setText("id : " + getIntent().getStringExtra("id"));
    }
}
