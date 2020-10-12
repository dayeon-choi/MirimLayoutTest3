package kr.hs.emirim.s2019w18.mirimlayouttest3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LinearLayout linear1=new LinearLayout(this);
        LinearLayout.LayoutParams params =new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        linear1.setBackgroundColor(Color.rgb(181,178,255));
        linear1.setOrientation(LinearLayout.VERTICAL);

        /*Button btn = new Button(this);
        btn.setText("클릭해보세요!");
        btn.setBackgroundColor(Color.rgb(128,65,217));
        btn.setTextColor(Color.WHITE);
        linear1.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "JAVA 코드로 작성한 Button을 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
        });*/
        setContentView(linear1,params);

        editText = new EditText(this);
        editText.setHint("문자열을 입력해주세요!");
        editText.setBackgroundColor(Color.WHITE);
        editText.setTextSize(20);
        linear1.addView(editText);

        Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        linear1.addView(btn);
        
//        다음 시간에 알려주신다고 하셨음
//        LinearLayout.LayoutParams textParams=(LinearLayout.LayoutParams) textView.getLayoutParams();
        textView = new TextView(this);
//        textParams.topMargin=20;
//        textView.setLayoutParam(textParams);
        textView.setTextSize(20);
        textView.setTextColor(Color.rgb(128,65,217));
        linear1.addView(textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString()+"이(가) 입력되었습니다.");
            }
        });
    }
}