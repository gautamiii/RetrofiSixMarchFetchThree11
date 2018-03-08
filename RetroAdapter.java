package com.example.gautam.retrofisixmarchfetch;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.gautam.retrofisixmarchfetch.responsebean.Service;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Gautam on 3/6/2018.
 */
public class RetroAdapter extends RecyclerView.Adapter<RetroAdapter.MyVieHolder>{

    Context context;
     List<Service> modulelist;

    public RetroAdapter( Context context,List<Service> modulelist) {
        this.modulelist=modulelist;
        this.context = context;
    }

    public class MyVieHolder extends RecyclerView.ViewHolder{
        public TextView mName;
        public ImageView mImage,mThumbnailImage;
        public MyVieHolder(View itemView) {
            super(itemView);
            mName=itemView.findViewById(R.id.tvname);
            mThumbnailImage=itemView.findViewById(R.id.tvthumbnailImage);
            mImage=itemView.findViewById(R.id.imagev);
        }
    }
    @Override
    public MyVieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View iv= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new MyVieHolder(iv);
    }
    @Override
    public void onBindViewHolder(MyVieHolder holder, int position) {
        Service mService=modulelist.get(position);
      // holder.mName.setText(mService.getName());
        //holder.mImage.setImageResource(mService.getThumbnails());
        String SERVICE_ICON_BASE_URL = "http://helper.org.in/new/assets/images/app/icons/";
//            Glide.with(context).load(SERVICE_ICON_BASE_URL).into(holder.mImage);
        Picasso.with(context).load(SERVICE_ICON_BASE_URL).placeholder(R.drawable.ic_launcher_background).into(holder.mImage);
        String SERVICE_THUMBNAIL_BASE_URL = "http://helper.org.in/new/assets/images/app/thumbnails/";
        Glide.with(context).load(SERVICE_THUMBNAIL_BASE_URL)
               .placeholder(R.drawable.ic_launcher_background)
               .into(holder.mThumbnailImage);
//        holder.mThumbnail.setText(mService.getThumbnails());
      holder.mName.setText(modulelist.get(position).getName());
    }
    @Override
    public int getItemCount() {
        return modulelist.size();
    }
}
