package com.show.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.show.MyApplication;
import com.show.R;

import java.util.List;

/**
 * Created by abhijeet on 27/01/16.
 */

public class ShowFragment extends android.app.Fragment {
    RecyclerView recyclerView;
    //ShowAdapter adapter;
    SurfaceView surfaceView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show,
                container, false);

        surfaceView = (SurfaceView)view.findViewById(R.id.surfaceView);

        /*recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MyApplication.mContext,1,false));
        recyclerView.setHasFixedSize(true);
        recyclerView.scrollToPosition(0);
        recyclerView.setItemAnimator(new DefaultItemAnimator());*/
        //recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));

        return view;
    }
    /*private void showCountDown(String toDate){
        SimpleDateFormat dateformat = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy");

        try {
            Date d1 = dateformat.parse(toDate);
            Date d2 = dateformat.parse(dateformat.format(new Date()));

            long diff = d1.getTime() - d2.getTime();

            //Check if countdown exists.. if yes.... kill it.
            if(timer != null){
                timer.cancel();
            }
            timer = new CountDownTimer(diff,60000){
                public void onTick(long milliUntilFinished){

                    long days = milliUntilFinished / (1000*60*60 *24) % 365; //32832000000 ~ 15 days.
                    long hours = milliUntilFinished / (1000*60*60) %24; //1500/60 = 1 hr
                    long minutes = milliUntilFinished / (1000*60) %60; //225/60 = 3 % 60 = 3
                    long seconds = milliUntilFinished/1000 % 60; // 225%60 = 45sec

                    if(days > 0)
                        timerText.setText(days + " d\n"+ hours + " hr");
                    else if(days == 0 && hours > 0)
                        timerText.setText(hours + " hr\n" + minutes + " min");
                    else if(days == 0 && hours == 0 ){
                        timerText.setText(minutes + " min\n" + seconds + " sec");
                    }
                }
                public void onFinish(){
                    //timerText.setText("time Up!");
                    //Once time is up show the results.
                }
            };
            timer.start();


        } catch (java.text.ParseException e1) {
            e1.printStackTrace();
        };
    }*/
}
