package com.example.fabricio.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private viewHolder mViewHolder = new viewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue = (EditText) findViewById(R.id.edit_value);
        this.mViewHolder.textDollar = (TextView) findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = (TextView) findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = (Button) findViewById(R.id.button_calculate);

        this.mViewHolder.buttonCalculate.setOnClickListener( this);

        this.clearValues();

//        this.mViewHolder.buttonCalculate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //lógica do click no botão
//            }//end public void onClick(View v)
//
//        });//end this.mViewHolder.buttonCalculate.setOnClickListener(new View.OnClickListener()

    }//end protected void onCreate(Bundle savedInstanceState)

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if (id == R.id.button_calculate){
            Double value = Double.valueOf(this.mViewHolder.editValue.getText().toString());
            this.mViewHolder.textDollar.setText(String.format("%.2f", (value * 3.2137)));
            this.mViewHolder.textEuro.setText(String.format("%.2f", (value * 4.0019)));
        }//end if (id == R.id.button_calculate)

    }//end public void onClick(View v)

    private void clearValues(){
        this.mViewHolder.textDollar.setText("");
        this.mViewHolder.textEuro.setText("");
    }//end private void clearValues()

//    public void teste(View view) {
//        //lógica do click no botão
//    }//end public void teste(View view)


    private static class viewHolder{
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button   buttonCalculate;

    }//end private static class viewHolder
}
