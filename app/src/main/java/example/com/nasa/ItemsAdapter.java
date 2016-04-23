package example.com.nasa;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Mohammad on 09/04/2016.
 */
public class ItemsAdapter extends BaseAdapter {


    private final Context context;
    List<Items> stories;


    public ItemsAdapter(Context context, List<Items> contents) {
        this.stories = contents;
        this.context = context;
    }

    @Override
    public int getCount() {
        return stories.size();
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
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.donate_row, null);
        TextView titleTextView = (TextView) itemView.findViewById(R.id.title_text_view);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.image_view);
        titleTextView.setText(stories.get(position).getTitle());
        imageView.setImageResource(stories.get(position).getImage());
        return itemView;
    }

}
