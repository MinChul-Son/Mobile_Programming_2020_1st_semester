package com.sch.test_6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost= getTabHost();
        TabHost.TabSpec tabSpecDog=tabHost.newTabSpec("DOG").setIndicator("강아지");
        tabSpecDog.setContent(R.id.imgDog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecCat= tabHost.newTabSpec("CAT").setIndicator("고양이");
        tabSpecCat.setContent(R.id.imgCat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecRabbit= tabHost.newTabSpec("RABBIT").setIndicator("토끼");
        tabSpecRabbit.setContent(R.id.imgRabbit);
        tabHost.addTab(tabSpecRabbit);

        TabHost.TabSpec tabSpecHorse= tabHost.newTabSpec("HORSE").setIndicator("말");
        tabSpecHorse.setContent(R.id.imgHorse);
        tabHost.addTab(tabSpecHorse);

        tabHost.setCurrentTab(0);
    }
}
