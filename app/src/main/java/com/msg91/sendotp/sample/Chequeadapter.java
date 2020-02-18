package com.msg91.sendotp.sample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Chequeadapter extends RecyclerView.Adapter<Chequeadapter.ProductViewHolder> {
    Intent i;
    private Context mCtx;
    private List<Cheque> productList;

    public Chequeadapter(Context mCtx, List<Cheque> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.recycler_c, null);
        return new ProductViewHolder(view);

    }

    @Override
    public void onBindViewHolder(final ProductViewHolder holder, int position) {
      final   Cheque cheque;   cheque = productList.get(position);

        //loading the image
holder.id.setText(cheque.getid());
holder.tid.setText(cheque.gettrackid());
holder.name.setText(cheque.getname());
holder.phone.setText(cheque.getphone());
holder.email.setText(cheque.getemail());
holder.address.setText(cheque.getaddress());
holder.nos.setText(cheque.getnos());
holder.trainno.setText(cheque.gettrainno());
holder.trainname.setText(cheque.gettrainname());
holder.source.setText(cheque.getsource());
holder.dest.setText(cheque.getdestination());
holder.deptdate.setText(cheque.getdeptdate());
holder.cost.setText(cheque.getcost());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {



        TextView id,tid,name,phone,email,address,nos,trainno,trainname,source,dest,deptdate,cost;
        public ProductViewHolder(View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.id);
            tid=itemView.findViewById(R.id.trackid);
            name=itemView.findViewById(R.id.name);
            phone=itemView.findViewById(R.id.phone);
            email=itemView.findViewById(R.id.email);
            address=itemView.findViewById(R.id.address);
            nos=itemView.findViewById(R.id.nos);
            trainno=itemView.findViewById(R.id.trainno);
            trainname=itemView.findViewById(R.id.trainname);
            source=itemView.findViewById(R.id.source);
            dest=itemView.findViewById(R.id.destination);
            deptdate=itemView.findViewById(R.id.deptdate);
            cost= itemView.findViewById(R.id.cost);


        }

    }
}