package com.waewaee.eventbrite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.waewaee.eventbrite.adpaters.EventAdapter;
import com.waewaee.eventbrite.delegates.EventDelegate;

public class EventDetailActivity extends AppCompatActivity implements EventDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        RecyclerView rvEvents = findViewById(R.id.rv_all_events);
        rvEvents.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        EventAdapter adapter = new EventAdapter(this);
        rvEvents.setAdapter(adapter);
    }

    @Override
    public void onTapEvent() {

    }
}