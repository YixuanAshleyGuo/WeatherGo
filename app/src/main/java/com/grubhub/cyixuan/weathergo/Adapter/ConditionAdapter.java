package com.grubhub.cyixuan.weathergo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.grubhub.cyixuan.weathergo.R;
import com.grubhub.cyixuan.weathergo.model.ConditionListInfo;

import java.util.List;

/**
 * Created by cyixuan on 2/11/17.
 */

public class ConditionAdapter extends ArrayAdapter<ConditionListInfo>{
    private int resourceId;
    private Context context;
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    public ConditionAdapter(Context context, int resource, List<ConditionListInfo> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ConditionListInfo ilist = getItem(position);
        View view = LayoutInflater.from(context).inflate(resourceId,null);
        TextView character = (TextView)view.findViewById(R.id.basic_char);
        TextView value = (TextView)view.findViewById(R.id.basic_value);
        character.setText(ilist.getCharacter());
        value.setText(ilist.getValue());

        return view;

    }
}

