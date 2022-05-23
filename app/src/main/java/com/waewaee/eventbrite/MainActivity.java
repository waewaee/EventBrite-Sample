package com.waewaee.eventbrite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.waewaee.eventbrite.R;
import com.waewaee.eventbrite.adpaters.EventAdapter;
import com.waewaee.eventbrite.delegates.EventDelegate;

public class MainActivity extends AppCompatActivity implements EventDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        RecyclerView rvEvents = findViewById(R.id.rv_all_events);
        rvEvents.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        EventAdapter adapter = new EventAdapter(this);
        rvEvents.setAdapter(adapter);

        CardView cardEvent = findViewById(R.id.card_event);
        cardEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EventDetailActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onTapEvent() {
        Intent intent = new Intent(getApplicationContext(), EventDetailActivity.class);
        startActivity(intent);
    }
}