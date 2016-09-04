package com.example.bakoa.layouttest;

import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    private Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = (Button) findViewById(R.id.btnShowPopup);
    }

    public void onClick(View v) {
        if (v.getId()==R.id.btnShowPopup) {
            //Rendszertől elkérni a LayoutInflater service-et.
            LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            //popupView számára feldújni az xml-ben található layoutout
            View popupView = layoutInflater.inflate(R.layout.popup, null);
            //popUpWindow létrehozása, majd annak paramétereinek beállítása
            final PopupWindow popupWindow = new PopupWindow(popupView, DrawerLayout.LayoutParams.WRAP_CONTENT, DrawerLayout.LayoutParams.WRAP_CONTENT);

            Button btnDismiss = (Button) popupView.findViewById(R.id.btnPopUpOk);
            btnDismiss.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popupWindow.dismiss();
                }
            });
            
            //A popup window a btnShow gombhoz képest hogyan jelenjen meg koordintákban megadva
            popupWindow.showAsDropDown(btnShow, 50, -30);
        }
    }


}
