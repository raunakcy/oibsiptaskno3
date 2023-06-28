package com.example.oibsiptaskno3;



import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.button.MaterialButton;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity {
    TextView txtSolution,txtResult;
    MaterialButton one,two,three,four,five,six,seven,eight,nine,zero,dot,openB,closeB,equal,plus,subtract,divide,multiply,ac,c;
    String data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find id

        txtSolution=findViewById(R.id.txtSolution);
        txtResult=findViewById(R.id.txtResult);
        zero=findViewById(R.id.zero);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        dot=findViewById(R.id.dot);
        divide=findViewById(R.id.divide);
        multiply=findViewById(R.id.multiply);
        plus =findViewById(R.id.plus);
        subtract=findViewById(R.id.sub);
        equal=findViewById(R.id.btn_equal);
        ac=findViewById(R.id.aC);
        c=findViewById(R.id.btn_C);
        openB=findViewById(R.id.btn_openB);
        closeB=findViewById(R.id.btn_closingB);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"2");
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"3");
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"5");
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"6");
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"7");
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"9");
            }
        });



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"+");
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"-");
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"*");
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"/");
            }
        });


        openB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+"(");
            }
        });
        closeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+")");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                txtSolution.setText(data+".");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txtSolution.getText().toString();
                data=data.substring(0,data.length()-1);


            }
        });


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSolution.setText("");
                txtResult.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=txtSolution.getText().toString();
                Context rhino =Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";

                Scriptable scriptable=rhino.initSafeStandardObjects();
                finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                txtSolution.setText(finalResult);
            }
        });


    }
}


