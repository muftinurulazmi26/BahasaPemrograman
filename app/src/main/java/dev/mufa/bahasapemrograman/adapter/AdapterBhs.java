package dev.mufa.bahasapemrograman.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.List;

import dev.mufa.bahasapemrograman.DetailActivity;
import dev.mufa.bahasapemrograman.R;
import dev.mufa.bahasapemrograman.modal.BahasaPemrograman;

public class AdapterBhs extends RecyclerView.Adapter<AdapterBhs.VHBhs> {
    private Context context;
    private List<BahasaPemrograman> bahasaPemrogramens;

    public AdapterBhs(Context context, List<BahasaPemrograman> bahasaPemrogramens) {
        this.context = context;
        this.bahasaPemrogramens = bahasaPemrogramens;
    }

    @NonNull
    @Override
    public VHBhs onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_bahasa_pemrograman,parent,false);
        return new VHBhs(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHBhs holder, int position) {
        final BahasaPemrograman item = bahasaPemrogramens.get(position);
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), item.getImg());

        holder.tv_title.setText(item.getTitle());
        holder.tv_des.setText(item.getDes());
        holder.img.setImageBitmap(bitmap);

        holder.cd_list_bhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("title",item.getTitle());
                intent.putExtra("des",item.getDes());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return bahasaPemrogramens.size();
    }

    public static class VHBhs extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView tv_title,tv_des;
        private CardView cd_list_bhs;
        public VHBhs(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img_icon);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_des = itemView.findViewById(R.id.tv_des);
            cd_list_bhs = itemView.findViewById(R.id.cd_list_bhs);
        }
    }
}
