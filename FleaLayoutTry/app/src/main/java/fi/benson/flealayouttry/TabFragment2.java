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
public class TabFragment2 extends Fragment {


    private RecyclerView secondRecyclerView;
    private StaggeredGridLayoutManager secondStaggeredLayoutManager;
    private CardsListAdapter cardsListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab_fragment_2, container, false);

        secondRecyclerView = (RecyclerView) rootView.findViewById(R.id.listTwo);
        secondStaggeredLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        secondRecyclerView.setLayoutManager(secondStaggeredLayoutManager);

        cardsListAdapter = new CardsListAdapter(getContext());
        secondRecyclerView.setAdapter(cardsListAdapter);



        return  rootView;


    }



}