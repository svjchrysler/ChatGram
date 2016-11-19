package bo.seef.team.chtgramp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goCreateAccount(View vien){
        Toast.makeText(getBaseContext(),"entro a registro ",Toast.LENGTH_LONG).show();
    }
}
