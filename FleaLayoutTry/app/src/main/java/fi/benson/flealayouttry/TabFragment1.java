package fi.benson.flealayouttry;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bkamau on 3/7/16.
 */
public class TabFragment1  extends Fragment {


    private RecyclerView firstRecyclerView;
    private StaggeredGridLayoutManager mStaggeredLayoutManager;
    private CardsListAdapter cardsListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab_fragment_1, container, false);

        firstRecyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        mStaggeredLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        firstRecyclerView.setLayoutManager(mStaggeredLayoutManager);

        cardsListAdapter = new CardsListAdapter(getContext());
        firstRecyclerView.setAdapter(cardsListAdapter);



        return  rootView;


    }



}