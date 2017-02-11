package com.jasbir.fourtabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Emergency extends Activity {

    Button qr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency);
        qr = (Button) findViewById(R.id.scan_qr);

        qr.setText("Scam");
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(new Intent(Emergency.this, Scanner.class));
                startActivity(i);
            }
        });

    }
}
