package tk.shadowking.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Integer result;
    String exp="";
    EditText panel;
    Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,sub,mul,div,add,equ,obr,cbr,ac,clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panel = (EditText) findViewById(R.id.input);
        n1 = (Button) findViewById(R.id.n1);
        n2 = (Button) findViewById(R.id.n2);
        n3 = (Button) findViewById(R.id.n3);
        sub = (Button) findViewById(R.id.sub);
        n4 = (Button) findViewById(R.id.n4);
        n5 = (Button) findViewById(R.id.n5);
        n6 = (Button) findViewById(R.id.n6);
        mul = (Button) findViewById(R.id.mul);
        n7 = (Button) findViewById(R.id.n7);
        n8 = (Button) findViewById(R.id.n8);
        n9 = (Button) findViewById(R.id.n9);
        div = (Button) findViewById(R.id.div);
        n0 = (Button) findViewById(R.id.n0);
        add = (Button) findViewById(R.id.add);
        equ = (Button) findViewById(R.id.equ);
        obr = (Button) findViewById(R.id.obr);
        cbr = (Button) findViewById(R.id.cbr);
        ac = (Button) findViewById(R.id.ac);
        clr = (Button) findViewById(R.id.clr);
        init();
    }

    void init(){

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="1";
                output();
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="2";
                output();
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="3";
                output();
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="4";
                output();
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="5";
                output();
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="6";
                output();
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="7";
                output();
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="8";
                output();
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="9";
                output();
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="0";
                output();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="+";
                output();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="-";
                output();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="*";
                output();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="/";
                output();
            }
        });

        obr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+="(";
                output();
            }
        });

        cbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp+=")";
                output();
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp="";
                output();
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = exp.substring(0, exp.length() - 1);
                output();
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Calculate.evaluatePostfix(Conversion.infixToPostfix(exp));
                exp += " = " + result.toString();
                output();
            }
        });
    }

    void output(){
        panel.setText(exp);
    }
}

