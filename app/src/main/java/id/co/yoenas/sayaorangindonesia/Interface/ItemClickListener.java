package id.co.yoenas.sayaorangindonesia.Interface;

import android.view.View;

/**
 * Created by macbookpro on 3/11/18.
 */

public interface ItemClickListener {
    // untuk mengimplentasikan onClick di RecyclerView
    void onClick(View view, int position, boolean isLongClick);
}
