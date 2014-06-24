package org.churchapp.community;

import java.util.ArrayList;
import java.util.List;

import org.churchapp.community.adapter.CustomListAdapter;

import android.app.Fragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
 
public class FragmentOne extends Fragment {
		
      ImageView ivIcon;
      TextView tvItemName;
      private ListView listViewOne;
//      private String[] sListView;
      
      public static final String IMAGE_RESOURCE_ID = "iconResourceID";
      public static final String ITEM_NAME = "itemName";
      List<ListItem> listItems;	
      String[] event_names;
      TypedArray event_pics;
      String[] event_desc;
      String[] date;

 
      public FragmentOne() {
 
      }
 
      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
 
            View view = inflater.inflate(R.layout.fragment_layout_one, container,
                        false);
            listItems = new ArrayList<ListItem>();

            event_names = getResources().getStringArray(R.array.event_names);

            event_pics = getResources().obtainTypedArray(R.array.event_pics);

            event_desc = getResources().getStringArray(R.array.event_desc);

            date = getResources().getStringArray(R.array.date);
            
            for (int i = 0; i < event_names.length; i++) {
            	   ListItem item = new ListItem(event_names[i],
            	     event_pics.getResourceId(i, -1), event_desc[i],
            	     date[i]);
            	   listItems.add(item);
            	  }

 
            listViewOne = (ListView) view.findViewById(R.id.fragonelist);
            
//            sListView = getResources().getStringArray(R.array.data_list);
            
            
            		
            CustomListAdapter ladp = new CustomListAdapter(getActivity(), listItems);
            
            listViewOne.setAdapter(ladp);
            
            event_pics.recycle();
            
            
            return view;
      }
      public void onActivityCreated(Bundle savedInstanceState) {
    	  
    	  super.onActivityCreated(savedInstanceState);
    	  
          
          
  		
  			
      }
}