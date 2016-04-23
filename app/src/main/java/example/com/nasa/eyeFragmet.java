package example.com.nasa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammad on 22/04/2016.
 */
public class eyeFragmet extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.schigal_fragment, null);
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(new Items(R.drawable.poto1, "Training 1"));
        itemsList.add(new Items(R.drawable.poto2, "Training 2"));

        ListView expandableListView = (ListView) view.findViewById(R.id.list_item);
        expandableListView.setAdapter(new TrainingAdapter(getActivity(), itemsList));
        return view;
    }
}