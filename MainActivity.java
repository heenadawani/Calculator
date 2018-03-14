package com.dev.kbstudios.bestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int number1 = 0;
    private int number2 = 0;
    private int opcode = 0;

    private TextView display;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.onButtonClickEvent();

        display = (TextView) findViewById(R.id.display);
        output = (TextView) findViewById(R.id.output);

    }

    void makeOperation(){
        if(opcode == 0){
            number1 = Integer.parseInt((String) display.getText());
            display.setText( "0");
            output.setText(String.valueOf(number1));
        }
        else if(opcode == 1){
            number2 = Integer.parseInt((String) display.getText());
            number1 = number1 + number2;
            output.setText( String.valueOf(number1));
            display.setText("0");
        }
        else if(opcode == 2){
            number2 = Integer.parseInt((String) display.getText());
            number1 = number1 - number2;
            output.setText( String.valueOf(number1));
            display.setText("0");
        }
        else if(opcode == 3){
            number2 = Integer.parseInt((String) display.getText());
            number1 = number1 * number2;
            output.setText( String.valueOf(number1));
            display.setText("0");
        }
        else if(opcode == 4){
            number2 = Integer.parseInt((String) display.getText());
            number1 = number1 / number2;
            output.setText( String.valueOf(number1));
            display.setText("0");
        }

        opcode = 0;
    }

    public void onButtonClickEvent(){

        final Button add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeOperation();
                opcode = 1;
            }
        });

        final Button sub = (Button) findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeOperation();
                opcode = 2;
            }
        });

        final Button mul = (Button) findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeOperation();
                opcode = 3;
            }
        });

        final Button div = (Button) findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeOperation();
                opcode = 4;
            }
        });

        final Button equal = (Button) findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeOperation();
            }
        });

        final Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText( "0");
                output.setText( "0");
                opcode = 0;
                number1 = 0;
                number2 = 0;
            }
        });

        final Button num0 = (Button) findViewById(R.id.num0);
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String previousText = (String) display.getText();

                if(previousText.length() >= 8){
                    return;
                }

                int newNumber = Integer.parseInt(previousText + "0");
                display.setText( String.valueOf(newNumber));
            }
        });

        final Button num1 = (Button) findViewById(R.id.num1);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String previousText = (String) display.getText();
                if(previousText.length() >= 8){
                    return;
                }
                int newNumber = Integer.parseInt(previousText + "1");
                display.setText( String.valueOf(newNumber));
            }
        });

        final Button num2 = (Button) findViewById(R.id.num2);
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String previousText = (String) display.getText();
                if(previousText.length() >= 8){
                    return;
                }
                int newNumber = Integer.parseInt(previousText + "2");
                display.setText( String.valueOf(newNumber));
            }
        });

        final Button num3 = (Button) findViewById(R.id.num3);
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String previousText = (String) display.getText();
                if(previousText.length() >= 8){
                    return;
                }
                int newNumber = Integer.parseInt(previousText + "3");
                display.setText( String.valueOf(newNumber));
            }
        });

        final Button num4 = (Button) findViewById(R.id.num4);
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String previousText = (String) display.getText();
                if(previousText.length() >= 8){
                    return;
                }
                int newNumber = Integer.parseInt(previousText + "4");
                display.setText( String.valueOf(newNumber));
            }
        });

        final Button num5 = (Button) findViewById(R.id.num5);
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String previousText = (String) display.getText();
                if(previousText.length() >= 8){
                    return;
                }
                int newNumber = Integer.parseInt(previousText + "5");
                display.setText( String.valueOf(newNumber));
            }
        });

        final Button num6 = (Button) findViewById(R.id.num6);
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String previousText = (String) display.getText();
                if(previousText.length() >= 8){
                    return;
                }
                int newNumber = Integer.parseInt(previousText + "6");
                display.setText( String.valueOf(newNumber));
            }
        });

        final Button num7 = (Button) findViewById(R.id.num7);
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String previousText = (String) display.getText();
                if(previousText.length() >= 8){
                    return;
                }
                int newNumber = Integer.parseInt(previousText + "7");
                display.setText( String.valueOf(newNumber));
            }
        });

        final Button num8 = (Button) findViewById(R.id.num8);
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String previousText = (String) display.getText();
                if(previousText.length() >= 8){
                    return;
                }
                int newNumber = Integer.parseInt(previousText + "8");
                display.setText( String.valueOf(newNumber));
            }
        });

        final Button num9 = (Button) findViewById(R.id.num9);
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String previousText = (String) display.getText();
                if(previousText.length() >= 8){
                    return;
                }
                int newNumber = Integer.parseInt(previousText + "9");
                display.setText( String.valueOf(newNumber));
            }
        });

    }
}
