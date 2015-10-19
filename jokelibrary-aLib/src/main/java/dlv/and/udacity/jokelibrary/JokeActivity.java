package dlv.and.udacity.jokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public final static String JOKE_INDEX = "joke_index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alib);

        Bundle extras = getIntent().getExtras();
        TextView tvJoke = ( (TextView) findViewById(R.id.tv_joke));
        if(extras != null){
            String joke = extras.getString(JOKE_INDEX) + ".. brought to you by JokeActivity!";
            tvJoke.setText(joke);
        }else{
            tvJoke.setText("Insert your mama joke here cause I received an empty Intent");
        }


    }
}
