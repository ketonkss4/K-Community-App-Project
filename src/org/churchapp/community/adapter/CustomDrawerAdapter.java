package org.churchapp.community.adapter;

import java.util.List;

import org.churchapp.community.DrawerItem;
import org.churchapp.community.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
 
public class CustomDrawerAdapter extends ArrayAdapter<DrawerItem> {
 
      Context context;
      List<DrawerItem> drawerItemList;
      int layoutResID;
      private int selectedItem;
      public CustomDrawerAdapter(Context context, int layoutResourceID,
                  List<DrawerItem> listItems) {
            super(context, layoutResourceID, listItems);
            this.context = context;
            this.drawerItemList = listItems;
            this.layoutResID = layoutResourceID;
 
      }
      public void selectedItem(int selectedItem){
    	  this.selectedItem = selectedItem;
    	  notifyDataSetChanged();
      }
 
      @Override
      public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
 
            DrawerItemHolder drawerHolder;
            View view = convertView;
           
            /*view = super.getView(position, convertView, parent);
            Typeface font1 = Typeface.createFromAsset(getContext().getAssets(), "fonts/CALIBRIB.TFF" );
            Typeface font2 = Typeface.createFromAsset(getContext().getAssets(), "fonts/CALIBRI.TFF" );
            ((TextView)convertView).setTypeface(position == selectedItem ? font1:font2);*/
            
 
            if (view == null) {
                  LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                  drawerHolder = new DrawerItemHolder();
 
                  view = inflater.inflate(layoutResID, parent, false);
                  drawerHolder.ItemName = (TextView) view
                              .findViewById(R.id.drawer_itemName);
                  
 
                  view.setTag(drawerHolder);
 
            } else {
                  drawerHolder = (DrawerItemHolder) view.getTag();
 
            }
 
            DrawerItem dItem = (DrawerItem) this.drawerItemList.get(position);
 
            
            drawerHolder.ItemName.setText(dItem.getItemName());
 
            return view;
      }
      
//      public View gotView(int position, View convertView, ViewGroup parent){
//          convertView = super.getView(position, convertView, parent);
//          Typeface tf1 = Typeface.createFromAsset(getContext().getAssets(), "fonts/CALIBRIB.TTF");
//          Typeface tf2 = Typeface.createFromAsset(getContext().getAssets(), "fonts/CALIBRI.TTF");
//          ((TextView)convertView).setTypeface(position == selectedItem ? tf1:tf2);
//
//          return convertView;
//      }
      
 
      private static class DrawerItemHolder {
            TextView ItemName;
           
      }
      
}