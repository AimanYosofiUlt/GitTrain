package com.example.gittrain.presntation.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gittrain.R;
import com.example.gittrain.dataacess.local.entites.Note;
import com.example.gittrain.dataacess.local.entites.User;
import com.example.gittrain.utilities.ExpandableItem;

import java.util.ArrayList;
import java.util.List;

public class AdapterForRecyclerUsers extends RecyclerView.Adapter<AdapterForRecyclerUsers.MyHolder> {
    private Context context;
    private List<User> usersList;
    private List<Note> notesList;

    public AdapterForRecyclerUsers(Context context) {
        this.context = context;
        this.usersList = new ArrayList<>();
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdapterForRecyclerUsers.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_for_recycler,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterForRecyclerUsers.MyHolder holder, int position) {
        User user = usersList.get(position);
        Note note = notesList.get(position);
        holder.textViewName.setText(user.getName());
        boolean isExpendable = ExpandableItem.BOOLEAN_items;
        holder.expendableLayout.setVisibility(isExpendable ? View.VISIBLE : View.GONE);
        if (isExpendable){
            holder.imageButtonArrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
        }else {
            holder.imageButtonArrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
        }
        holder.linearLayout.setOnClickListener(view -> {
            ExpandableItem.BOOLEAN_items = ExpandableItem.BOOLEAN_EXPANDED;
            notifyItemChanged(holder.getAdapterPosition());
        });
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        private LinearLayout  linearLayout;
        private RelativeLayout expendableLayout;
        private TextView textViewName;
        private ImageButton imageButtonArrow;
        private RecyclerView recyclerViewNotes;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.linear_user_name);
            expendableLayout = itemView.findViewById(R.id.expanded_list);
            textViewName = itemView.findViewById(R.id.text_view_user_note_item);
            imageButtonArrow = itemView.findViewById(R.id.img_arrow);
            recyclerViewNotes = itemView.findViewById(R.id.rec_notes);
        }
    }
}
