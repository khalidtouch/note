package com.touch.notes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class NotesAdapter extends BaseAdapter {
    private Context mContext;
    private List<Note> mNotes;
    private LayoutInflater mLayoutInflater;

    public NotesAdapter(Context context, List<Note> note){
        this.mContext = context;
        this.mNotes = note;
        mLayoutInflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return mNotes.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mLayoutInflater.inflate(R.layout.list_item_layout, null);
        TextView text = convertView.findViewById(R.id.text_text_view);
        TextView category = convertView.findViewById(R.id.category_text_view);
        TextView timeStamp = convertView.findViewById(R.id.timeStamp_text_view);

        text.setText(mNotes.get(position).getText());
        category.setText(mNotes.get(position).getCategory().getValue());
        timeStamp.setText(mNotes.get(position).getTimeStamp().toString());

        return convertView;
    }
}
