package example.com.nasa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mohammad on 22/04/2016.
 */
public class TrainingAdapter extends BaseAdapter {


    private final Context context;
    List<Items> stories;


    public TrainingAdapter(Context context, List<Items> contents) {
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
        View itemView = layoutInflater.inflate(R.layout.eye_row, null);
        TextView titleTextView = (TextView) itemView.findViewById(R.id.title_text_view);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.image_view);
        titleTextView.setText(stories.get(position).getTitle());
        imageView.setImageResource(stories.get(position).getImage());
        return itemView;
    }

}

