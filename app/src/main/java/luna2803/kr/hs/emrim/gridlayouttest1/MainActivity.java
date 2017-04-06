package luna2803.kr.hs.emrim.gridlayouttest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    Button[] but = new Button[10];
    Button [] butops = new Button[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i =0; i<but.length; i++)
        {
            but[i] = (Button)findViewById(R.id.but_1+i);
            but[i].setOnClickListener(butNumHandler);
        }
       for(int i=0; i<butops.length;i++){
           butops[i]=(Button)findViewById(R.id.but_op1+1);
           butops[i].setOnClickListener(butOpHandler);

       }
    }
    View.OnClickListener butNumHandler = new View.OnClickListener(){
        @Override
        public void onClick(View view){

        }

    };
    View.OnClickListener butOpHandler = new View.OnClickListener(){
        public void onClick(View view){}

    };

}
