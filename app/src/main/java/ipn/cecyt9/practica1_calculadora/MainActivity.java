package ipn.cecyt9.practica1_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double numero1, numero2, resultado;
    boolean  comprobant = false;
    String operador;

    public void onClickCButton(View miView) {
        TextView tv = findViewById(R.id.Res);
        tv.setText("");
    }

    public void onClickButtonPoint(View miView) {
        if (comprobant=false) {
            TextView tv = findViewById(R.id.Res);
            String value = tv.getText().toString();
            tv.setText(value + ".1");
            comprobant = true;
        }
    }

    public void onClickButtonZero(View miView) {
        TextView tv = findViewById(R.id.Res);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }

    public void onClickButtonOne(View miView) {
        TextView tv = findViewById(R.id.Res);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    public void onClickButtonTwo(View miView) {
        TextView tv = findViewById(R.id.Res);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    public void onClickButtonThree(View miView) {
        TextView tv = findViewById(R.id.Res);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    public void onClickButtonFour(View miView) {
        TextView tv = findViewById(R.id.Res);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }

    public void onClickButtonFive(View miView) {
        TextView tv = findViewById(R.id.Res);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }

    public void onClickButtonSix(View miView) {
        TextView tv = findViewById(R.id.Res);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }

    public void onClickButtonSeven(View miView) {
        TextView tv = findViewById(R.id.Res);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }

    public void onClickButtonEight(View miView) {
        TextView tv = findViewById(R.id.Res);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }

    public void onClickButtonNine(View miView) {
        TextView tv = findViewById(R.id.Res);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }

    public void onClickNum1captureoperation(View miView) {
        TextView tv = findViewById(R.id.Res);
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickPlus(View miView) {
        operador = "+";
        onClickNum1captureoperation(miView);
    }

    public void onClickMinus(View miView) {
        operador = "-";
        onClickNum1captureoperation(miView);
    }

    public void onClickDivide(View miView) {
        operador = "÷";
        onClickNum1captureoperation(miView);
    }

    public void onClickMultiply(View miView) {
        operador = "×";
        onClickNum1captureoperation(miView);
    }

    public void onClickPorcentage(View miView) {
        TextView tv = (TextView) findViewById(R.id.Res);
        numero1 = Double.parseDouble(tv.getText().toString());
        try {
            resultado = numero1 * 0.01;
            tv.setText(resultado.toString());
        } catch (NumberFormatException nfe) {
            Toast.makeText(this, "Numero Incorrecto", Toast.LENGTH_SHORT).show();
        }
        resultado = numero1;
        comprobant = false;
    }

    public void onClickequals(View miView) {
        TextView tv = (TextView) findViewById(R.id.Res);
        numero2 = Double.parseDouble(tv.getText().toString());

        try {

            if (operador.equals("+")) {
                resultado = numero1 + numero2;
                tv.setText(resultado.toString());
            }
            else if (operador.equals("-")) {
                resultado = numero1 - numero2;
                tv.setText(resultado.toString());
            }
            else if (operador.equals("÷")) {
                resultado = numero1/numero2;
                tv.setText(resultado.toString());
            }
            else if (operador.equals("×")) {
                resultado = numero1 * numero2;
                tv.setText(resultado.toString());
            }
        } catch (NumberFormatException nfe) {
            Toast.makeText(this, "Numero Incorrecto", Toast.LENGTH_SHORT).show();
        }
        resultado = numero1;
        comprobant = false;
    }
}