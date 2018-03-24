package srongklod.plantseconimic.customer_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by srongklod on 24/3/2018 AD.
 */

public class MyAdapter extends ArrayAdapter{

    private Context mContext;
    private ArrayList<MyItem> mArrayList;
    private int mLayout;

    public MyAdapter(Context context, int layout, ArrayList<MyItem> arrayList) {
        super(context,layout,arrayList);
        mContext = context;
        mLayout = layout;
        mArrayList = arrayList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view==null) {
            view = inflater.inflate(mLayout, parent, false);
        }

        MyItem item = mArrayList.get(position);

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(item.getmImgResource());

        TextView tv1 = view.findViewById(R.id.textView_line1);
        tv1.setText(item.getmTextLine1());

        TextView tv2 = view.findViewById(R.id.textView_line2);
        tv2.setText(item.getGetmTextLine2());

        CheckBox checkBox = view.findViewById(R.id.checkBox);
        checkBox.setTag(position);

        checkBox.setChecked(item.ismIsChecked());

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                int tag = (int) buttonView.getTag();
                MyItem myItem = (MyItem) getItem(tag);
                myItem.setmIsChecked(isChecked);


            }
        });

        return view;
    }

    public ArrayList<MyItem> getCheckedItems() {

        ArrayList<MyItem> checkedItems = new ArrayList<>();
        for (int i=0;i<mArrayList.size();i++) {
            if (mArrayList.get(i).ismIsChecked()==true) {
                checkedItems.add(mArrayList.get(i));

            }
        }

        return checkedItems;
    }

}//Main Class
