package model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_class_2021.lession1.R;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHolder>{
    private Context context;
    private List<Cat> ls;

    public CatAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Cat> ls){
        this.ls = ls;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public CatAdapter.CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);

        return new CatViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CatAdapter.CatViewHolder holder, int position) {
        Cat c = ls.get(position);
        if( c == null)
            return ;
        holder.imgCat.setImageResource(c.getImg());
        holder.txtCat.setText(c.getName());
    }

    @Override
    public int getItemCount() {
        if(ls != null)
            return ls.size();
        return 0;
    }

    public class CatViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgCat;
        private TextView txtCat;
        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCat = itemView.findViewById(R.id.img);
            txtCat = itemView.findViewById(R.id.name);
        }
    }
}
