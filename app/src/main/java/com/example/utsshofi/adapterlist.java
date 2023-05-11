package com.example.utsshofi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;
import java.util.List;

public class adapterlist extends RecyclerView.Adapter<adapterlist.ViewHolder>{
    private List<itemlist> itemList;

    public adapterlist(List<itemlist> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public adapterlist.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdata, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull adapterlist.ViewHolder holder, int position) {
        itemlist item = itemList.get(position);
        holder.judul.setText(item.getJudul());
        holder.subjudul.setText(item.getSubJudul());
        Glide.with(holder.imageView.getContext()).load(item.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView judul,subjudul;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.person);
            judul = itemView.findViewById(R.id.nama);
            subjudul = itemView.findViewById(R.id.isichat);
        }
    }
}
