package com.suryoatmojo.goexbi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ListViewAdapter extends ArrayAdapter<UserItem> {

    private List<UserItem> playerItemList;

    private Context context;

    public ListViewAdapter(List<UserItem> playerItemList, Context context) {
        super(context, R.layout.list_item, playerItemList);
        this.playerItemList = playerItemList;
        this.context = context;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View listViewItem = inflater.inflate(R.layout.list_item, null, true);

        TextView textViewNo = listViewItem.findViewById(R.id.textViewNo);
        TextView textViewName = listViewItem.findViewById(R.id.textViewName);
        ImageView imgVIew = listViewItem.findViewById(R.id.Poster);


        UserItem playerItem = playerItemList.get(position);

        textViewNo.setText(playerItem.getNo());
        textViewName.setText(playerItem.getName());



        return listViewItem;
    }
}