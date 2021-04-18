package rs.elfak.mosis.tim1.myplaces;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class About extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        Button ok = (Button)findViewById(R.id.about_ok);
        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}
