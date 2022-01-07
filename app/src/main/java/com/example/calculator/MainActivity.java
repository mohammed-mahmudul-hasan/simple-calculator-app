package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.Window;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn00,btnAdd,btnSub,btnFactorial,
    btnSin,btnCos,btnTan,btnMul,btnDiv,btnDot,btnC,btnEqual,btnPow2,btnRoot;
    EditText edt1 ;
    float mValueOne , mValueTwo;
    double answer;
    int cnt=0;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        edt1=(EditText) findViewById(R.id.editinput);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn0=(Button) findViewById(R.id.btn0);
        btn00=(Button) findViewById(R.id.btn00);
        btnPow2=(Button) findViewById(R.id.btnPow2);
        btnRoot=(Button) findViewById(R.id.btnRoot);
        btnFactorial=(Button) findViewById(R.id.btnFactorial);
        btnSin=(Button) findViewById(R.id.btnSin);
        btnCos=(Button) findViewById(R.id.btnCos);
        btnTan=(Button) findViewById(R.id.btnTan);
        btnDot=(Button) findViewById(R.id.btnDot);
        btnC=(Button) findViewById(R.id.btnC);
        btnEqual=(Button) findViewById(R.id.btnEqual);
        btnAdd=(Button) findViewById(R.id.btnAdd);
        btnSub=(Button) findViewById(R.id.btnSub);
        btnDiv=(Button) findViewById(R.id.btnDiv);
        btnMul=(Button) findViewById(R.id.btnMul);

        edt1.addTextChangedListener(loginTextWatcher);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText() + "1");
                    }
                });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 edt1.setText(edt1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "00");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a =edt1.getText().toString().trim();
                int l=a.length();
                for(int i=0;i<l;i++){
                    if(a.charAt(i)=='.'){
                        cnt++;
                    }
                }
                if(cnt<1){
                    edt1.setText(edt1.getText()+".");
                }
                else{
                    cnt=0;
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1 == null){
                    edt1.setText("");
                }else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mAddition = true;
                    edt1.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mSubtract = true ;
                edt1.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mMultiplication = true ;
                edt1.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText()+"");
                mDivision = true ;
                edt1.setText(null);
            }
        });

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText()+"");
                answer=mValueOne;
                for(int i=(int)mValueOne-1;i>1;i--){
                    answer=answer*i;
                }
                edt1.setText(answer+"");
            }
        });

        btnPow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText()+"");
                answer=Math.pow(mValueOne,2);
                edt1.setText(answer+"");
            }
        });

        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText()+"");
                answer=Math.sqrt(mValueOne);
                edt1.setText(answer+"");
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                answer = Math.sin(mValueOne);
                edt1.setText(answer+"");
                Toast.makeText(MainActivity.this, "Sine value in Radian mode", Toast.LENGTH_SHORT).show();
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                answer = Math.cos(mValueOne);
                edt1.setText(answer+"");
                Toast.makeText(MainActivity.this, "Cosine value in Radian mode", Toast.LENGTH_SHORT).show();
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                answer = Math.tan(mValueOne);
                edt1.setText(answer+"");
                Toast.makeText(MainActivity.this, "Tangent value in Radian mode", Toast.LENGTH_SHORT).show();
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edt1.getText() + "");

                if (mAddition == true){

                    edt1.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }

                else if (mSubtract == true){
                    edt1.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                else if (mMultiplication == true){
                    edt1.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                else if (mDivision == true){
                    edt1.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
                else {
                    Toast.makeText(MainActivity.this, "no change", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
private TextWatcher loginTextWatcher=new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String input =edt1.getText().toString().trim();
        btnEqual.setEnabled(!input.isEmpty());
        btnAdd.setEnabled(!input.isEmpty());
        btnSub.setEnabled(!input.isEmpty());
        btnMul.setEnabled(!input.isEmpty());
        btnDiv.setEnabled(!input.isEmpty());
        btnDot.setEnabled(!input.isEmpty());
        btnFactorial.setEnabled(!input.isEmpty());
        btnRoot.setEnabled(!input.isEmpty());
        btnSin.setEnabled(!input.isEmpty());
        btnCos.setEnabled(!input.isEmpty());
        btnTan.setEnabled(!input.isEmpty());
        btnPow2.setEnabled(!input.isEmpty());
    }
    @Override
    public void afterTextChanged(Editable s) {

    }
};

}