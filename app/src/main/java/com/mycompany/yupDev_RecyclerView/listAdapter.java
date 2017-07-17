package com.mycompany.yupDev_RecyclerView;

import android.view.*;
import android.widget.*;
import com.mycompany.yupDev_RecyclerView.*;
import java.util.*;

public class listAdapter extends RecyclerView.Adapter<listAdapter.ListViewHolder>{

	private List<List> theList;
	
    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView personName;
        TextView personAge;
        ImageView personPhoto;

        ListViewHolder(View view) {
            super(view);
            personName = (TextView)view.findViewById(R.id.name);
            personAge = (TextView)view.findViewById(R.id.age);
            personPhoto = (ImageView)view.findViewById(R.id.photo);
        }
	}

	
	public listAdapter(List<List> theList){
		this.theList = theList;
	}
	
	@Override
	public ListViewHolder onCreateViewHolder(ViewGroup parent, int position) {
		View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
		ListViewHolder lvh = new ListViewHolder(itemView);
		return lvh;
	}
	
	@Override
	public void onBindViewHolder(ListViewHolder listViewHolder, int position) {
		listViewHolder.name.setText(theList.getName());
		listViewHolder.age.setText(theList.getAge());
		listViewHolder.pboto.setImageResource(theList.getPhoto());
	}
	
	@Override
    public int getItemCount() {
        return theList.size();
    }
	
}
