package kr.co.tjenit.algorithmtest.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

import kr.co.tjenit.algorithmtest.R;
import kr.co.tjenit.algorithmtest.data.GuGuData;

/**
 * Created by the on 2017-08-10.
 */

public class GuGuAdapter extends ArrayAdapter<GuGuData>{

    Context mContext;
    List<GuGuData> mList;
    LayoutInflater inf;

    public GuGuAdapter(Context context, List<GuGuData> list) {
        super(context, R.layout.gugu_list_item,  list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row = inf.inflate(R.layout.gugu_list_item, null);
        }

        GuGuData data = mList.get(position);
        TextView printTxt = (TextView) row.findViewById(R.id.printTxt);

        String printStr = String.format(Locale.KOREA, "%d X %d = %d", data.getDansu(),data.getNumber(),(data.getDansu()*data.getNumber()));
        printTxt.setText(printStr);

        return row;
    }

}