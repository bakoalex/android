package com.example.bakoa.alertdialogexample;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AlertDialogMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_main);
    }

    private void showAlertMessage(final String aMessage) {
        AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
        alertbox.setMessage(aMessage);
        alertbox.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogMain.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
        alertbox.show();
    }

    public void onClick(View v) {
        if (v.getId()==R.id.btnShowAlertDialog) {
            showAlertMessage("Hahoka");
        }
    }
}
