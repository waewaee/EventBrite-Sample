package com.waewaee.eventbrite.views.holders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.eventbrite.delegates.EventDelegate;

public class EventViewHolder extends RecyclerView.ViewHolder {

    private EventDelegate mDelegate;

    public EventViewHolder(@NonNull View itemView, @NonNull EventDelegate eventDelegate) {
        super(itemView);
        mDelegate = eventDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDelegate.onTapEvent();
            }
        });

    }
}
