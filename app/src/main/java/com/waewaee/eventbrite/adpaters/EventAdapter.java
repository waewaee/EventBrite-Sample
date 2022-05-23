package com.waewaee.eventbrite.adpaters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.eventbrite.R;
import com.waewaee.eventbrite.delegates.EventDelegate;
import com.waewaee.eventbrite.views.holders.EventViewHolder;

public class EventAdapter extends RecyclerView.Adapter<EventViewHolder> {
    private EventDelegate mEventDelegate;

    public EventAdapter(EventDelegate eventDelegate) {mEventDelegate = eventDelegate;}

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item_event, parent, false);
        return new EventViewHolder(itemView, mEventDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
