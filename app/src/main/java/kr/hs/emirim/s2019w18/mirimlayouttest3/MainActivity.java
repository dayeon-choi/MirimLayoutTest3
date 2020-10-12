package kr.hs.emirim.s2019w18.mirimlayouttest3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LinearLayout linear1=new LinearLayout(this);
        LinearLayout.LayoutParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        linear1.setBackground(Color.rgb(181,178,255));
        linear1.setOrientation(LinearLayout.VERTICAL);

        Button btn = new Button(this);
        btn.setText("클릭해보세요!");
        btn.setBackground(Color.rgb(128,65,217));
        btn.setTextColor(Color.WHITE);
        linear1.addView(btn);

        btn.OnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button 1을 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
        })

        setContentView(linear1,params);



    }
}