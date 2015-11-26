package selesdepselesnul.sipakerclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import selesdepselesnul.sipakerclient.model.Member;
import selesdepselesnul.sipakerclient.model.Members;
import selesdepselesnul.sipakerclient.model.MembersStub;

/**
 * @author Moch Deden (https://github.com/selesdepselesnul)
 */
public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText idEditText;
    private EditText passwordEditText;
    private static final String TAG_NAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.loginButton = (Button) this.findViewById(R.id.loginButton);
        this.idEditText = (EditText) this.findViewById(R.id.idEditText);
        this.passwordEditText = (EditText) this.findViewById(R.id.passwordEditText);

        this.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Members members = new MembersStub();
                final Member actualMember = new Member(
                        idEditText.getText().toString(),
                        passwordEditText.getText().toString()
                );
                final Member expectedMember = members.get(actualMember.id);
                if (actualMember.equals(expectedMember)) {
                    Log.i(TAG_NAME, "Matched");
                    Intent intent = new Intent(MainActivity.this, MemberRequest.class);
                    intent.putExtra("id", actualMember.id);
                    startActivity(intent);
                } else
                    Log.i(TAG_NAME, "Isn't matched");
            }
        });
    }
}
