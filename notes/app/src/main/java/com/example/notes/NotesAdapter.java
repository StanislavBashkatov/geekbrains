package com.example.notes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notes.model.Note;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    private final List<Note> notes;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView titleView;
        private final TextView contentView;
        private final TextView dateView;

        public ViewHolder(View view) {
            super(view);
            titleView = view.findViewById(R.id.titleView);
            contentView = view.findViewById(R.id.contentView);
            dateView = view.findViewById(R.id.dateView);
        }

        public TextView getTitleView() {
            return titleView;
        }

        public TextView getContentView() {
            return contentView;
        }

        public TextView getDateView() {
            return dateView;
        }
    }

    public NotesAdapter(List<Note> notes) {
        this.notes = notes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.notes_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getTitleView().setText(notes.get(position).getTitle());
        viewHolder.getContentView().setText(notes.get(position).getContent());
        viewHolder.getDateView().setText(notes.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
