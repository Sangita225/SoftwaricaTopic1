package com.example.topic2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GridLayout extends AppCompatActivity {

    EditText txtnum;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnsub,btnmul,btndiv,btnequal,btnclear;

    int num1,num2,result;
    char temp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);


        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        btnequal=findViewById(R.id.btnequal);
        btnclear=findViewById(R.id.btncancel);

       txtnum=findViewById(R.id.txtnum);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText(txtnum.getText()+"0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText(txtnum.getText()+"1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText(txtnum.getText()+"2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText(txtnum.getText()+"3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText(txtnum.getText()+"4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText(txtnum.getText()+"5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText(txtnum.getText()+"6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText(txtnum.getText()+"7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText(txtnum.getText()+"8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText(txtnum.getText()+"9");

            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtnum.setText(null);

            }
        });

btnadd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
         num1=Integer.parseInt(txtnum.getText()+"");
         temp='+';
        txtnum.setText(null);

    }
});

btnsub.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        num1=Integer.parseInt(txtnum.getText()+"");

        temp='-';
        txtnum.setText(null);
    }
});
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(txtnum.getText()+"");
                temp='*';
               txtnum.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(txtnum.getText()+"");
                temp='/';
                txtnum.setText(null);
            }
        });


        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 num2 = Integer.parseInt(txtnum.getText() + "");
                switch (temp) {
                    case '+':
                        CalculateOperations calculate = new CalculateOperations(num1, num2);
                       result=calculate.add();
                        txtnum.setText(result+"");
                        break;

                    case '-':
                        CalculateOperations cal = new CalculateOperations(num1, num2);
                        result=cal.sub();
                        txtnum.setText(result+"");
                        break;
                    case '*':
                        CalculateOperations c = new CalculateOperations(num1, num2);
                        result=c.mul();
                        txtnum.setText(result+"");
                        break;
                    case '/':
                        CalculateOperations ca = new CalculateOperations(num1, num2);
                        result=ca.div();
                        txtnum.setText(result+"");
                        break;
                }

            }


        });


    }
}
