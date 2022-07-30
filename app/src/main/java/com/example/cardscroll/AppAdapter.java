package com.example.cardscroll;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardscroll.model.Card;

import java.util.List;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.MyViewHolder> {

    private Context mContext;
    private List<Card> mData;

    public AppAdapter(Context mContext, List<Card> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public AppAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater=LayoutInflater.from(mContext);
        v=inflater.inflate(R.layout.app_details_list,parent,false);



        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AppAdapter.MyViewHolder holder, int position) {
        holder.appId.setText(mData.get(position).getAppId());
        holder.appName.setText(mData.get(position).getAppName());
        holder.appVersion.setText(mData.get(position).getAppVersion());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public  static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView appName;
        TextView appId;
        TextView appVersion;
        TextView count;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            appId=itemView.findViewById(R.id.app_id_value);
            appName=itemView.findViewById(R.id.app_name_value);
            appVersion=itemView.findViewById(R.id.app_version_value);
            count=itemView.findViewById(R.id.sr_no);
        }
    }
}
