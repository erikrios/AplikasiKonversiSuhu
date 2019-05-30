package com.erikriosetiawan.konversisuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextCelcius, editTextFahrenheit, editTextKelvin, editTextReamur;
    Button buttonConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCelcius = findViewById(R.id.edit_text_celcius);
        editTextFahrenheit = findViewById(R.id.edit_text_fahrenheit);
        editTextKelvin = findViewById(R.id.edit_text_kelvin);
        editTextReamur = findViewById(R.id.edit_text_reamur);
        buttonConvert = findViewById(R.id.button_konversi);
    }

    public void convertSuhu(View view) {

        try {
            int celcius = Integer.parseInt(editTextCelcius.getText().toString());
            double hasilKelvin = celcius * 273.15;
            double hasilFahrenheit = celcius * 1.8 * 32;
            double hasilReamur = celcius * 6.8;

            editTextKelvin.setText(String.valueOf(hasilKelvin));
            editTextFahrenheit.setText(String.valueOf(hasilFahrenheit));
            editTextReamur.setText(String.valueOf(hasilReamur));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
