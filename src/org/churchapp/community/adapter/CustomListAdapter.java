package org.churchapp.community.adapter;

import java.util.List;

import org.churchapp.community.ListItem;
import org.churchapp.community.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {

	Context context;
	List<ListItem> listItems;
	
	
	
	public CustomListAdapter(Context context, List<ListItem> listItems) {
		super();
		this.context = context;
		this.listItems = listItems;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listItems.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listItems.get(position);
		
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return listItems.indexOf(getItem(position));
	}
	
	private class ViewHolder {
		ImageView event_pic;
		TextView event_name;
		TextView status;
		TextView date;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		 LayoutInflater mInflater = (LayoutInflater) context
				    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
				  if (convertView == null) {
				   convertView = mInflater.inflate(R.layout.listview_layout, null);
				   holder = new ViewHolder();
				   
				   holder.event_name = (TextView) convertView
						     .findViewById(R.id.event_name);
						   holder.event_pic = (ImageView) convertView
						     .findViewById(R.id.event_pic);
						   holder.status = (TextView) convertView.findViewById(R.id.event_desc);
						   holder.date = (TextView) convertView
						     .findViewById(R.id.date);
				   ListItem row_pos = listItems.get(position);
				   
				   
				   holder.event_pic.setImageResource(row_pos.getEvent_pic_id());
				   holder.event_name.setText(row_pos.getEvent_name());
				   holder.status.setText(row_pos.getEvent_desc());
				   holder.date.setText(row_pos.getDate());

				   convertView.setTag(holder);
				  } else {
				   holder = (ViewHolder) convertView.getTag();
				  }
				  return convertView;	
	}
		
 
}
