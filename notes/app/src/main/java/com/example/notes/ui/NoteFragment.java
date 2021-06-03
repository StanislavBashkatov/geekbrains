package com.example.notes.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.notes.NotesAdapter;
import com.example.notes.R;
import com.example.notes.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteFragment extends Fragment {
    private String[] titles = {"Title", "Title", "Title"};
    private String[] contents = {"Content", "Content", "Content"};
    private String[] dates = {"22.04.1955", "22.04.1955", "22.04.1955"};
    private List<Note> notes = new ArrayList<>();

    public NoteFragment() {
        // Required empty public constructor
    }

    public static NoteFragment newInstance() {
        return new NoteFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (int i = 0; i < titles.length; i++) {
            Note note = new Note();
            note.setTitle(titles[i]);
            note.setContent(contents[i]);
            note.setDate(dates[i]);
            notes.add(note);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new NotesAdapter(notes));
    }
}