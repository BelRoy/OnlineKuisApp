package id.co.yoenas.sayaorangindonesia.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.co.yoenas.sayaorangindonesia.Interface.ItemClickListener;
import id.co.yoenas.sayaorangindonesia.R;

/**
 * Created by macbookpro on 3/11/18.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ItemClickListener itemClickListener;

    public TextView category_name;
    public ImageView cateogry_image;

    public CategoryViewHolder(View itemView) {
        super(itemView);

        category_name = (TextView)itemView.findViewById(R.id.category_name);
        cateogry_image= (ImageView) itemView.findViewById(R.id.category_image);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // onClick ini diambil dari Item ClickListener
        itemClickListener.onClick(v,getAdapterPosition(),false);
    }

    // buat method setItemClickListener public agar dapat di implementasikan di CategoryFragment
    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
