package com.example.android.pets.data;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.android.pets.R;

public class PetCursorAdapter extends CursorAdapter {
    public PetCursorAdapter(Context context, Cursor c) {
        super(context, c);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Find fields to populate in inflated template
        TextView tvBody = (TextView) view.findViewById(R.id.name);
        TextView tvPriority = (TextView) view.findViewById(R.id.summary);
        // Extract properties from cursor
        String body = cursor.getString(cursor.getColumnIndexOrThrow(PetContract.PetEntry.COLUMN_PET_NAME));
        int priority = cursor.getInt(cursor.getColumnIndexOrThrow(PetContract.PetEntry.COLUMN_PET_BREED));
        // Populate fields with extracted properties
        tvBody.setText(body);
        tvPriority.setText(String.valueOf(priority));
    }
}
