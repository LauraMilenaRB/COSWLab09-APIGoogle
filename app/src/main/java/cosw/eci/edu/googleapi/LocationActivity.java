package cosw.eci.edu.googleapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Laura RB on 9/04/2018.
 */
public class LocationActivity extends AppCompatActivity {
    EditText name, description, latitudes, longitudes;
    public static final String LOCATION= "LOCATION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_location);
        name = findViewById(R.id.input_name);
        description = findViewById(R.id.input_description);
        latitudes = findViewById(R.id.input_latitude);
        longitudes = findViewById(R.id.input_longitude);
    }

    public void saveLocation(View view){

        if(validation()){
            Intent result = new Intent(this, MapsActivity.class);
            LocationA location= new LocationA();
            location.setDescription(description.getText().toString());
            location.setName(name.getText().toString());
            double latitude = Double.parseDouble(latitudes.getText().toString());
            double longitude = Double.parseDouble(longitudes.getText().toString());

            location.setLatitude(latitude);
            location.setLongitude(longitude);
            result.putExtra(LOCATION, location);
            setResult(RESULT_OK, result);

            finish();
        }


    }


    public boolean validation(){
        boolean validation=true;
        EditText name1 = findViewById(R.id.input_name);
        EditText description1 = findViewById(R.id.input_description);
        EditText latitude1 = findViewById(R.id.input_latitude);
        EditText longitude1 = findViewById(R.id.input_longitude);
        if (name1.length() == 0) {
            name1.setError("Please enter a valid name ");
            validation= false;
        }


        if (longitude1.length() == 0) {
            longitude1.setError("Please enter a valid longitude");
            validation= false;
        }
        if (description1.length() == 0) {
            description1.setError("Please enter a valid description ");
            validation= false;
        }

        if (latitude1.length() == 0) {
            latitude1.setError("Please enter a valid latitude");
            validation= false;
        }
        return validation;
    }
}
