package sarveshchavan777.inrerface2;


import android.content.Intent;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapProgressBar;

import java.util.ArrayList;
import java.util.List;

public class Tab21 extends Fragment  {
    TextView p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30,p31,p32,p33,p34,p35,p36,p37,p38,p39,p40;
    TextView p41,p42,p43,p44,p45,p46,p47,p48,p49,p50,p51,p52,p53,p54,p55,p56,p57,p58,p59,p60,p61,p62,p63,p64,p65,p66,p67,p68,p69,p70,p71,p72,p73,p74,p75,p76,p77,p78,p79,p80;
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,
            text21,text22,text23,text24,text25,text26,text27,text28,text29,text30,text31,text32,text33,text34,text35,text36,text37,text38,text39,text40,
            text41,text42,text43,text44,text45,text46,text47,text48,text49,text50,text51,text52,text53,text54,text55,text56,text57,text58,text59,text60,
            text61,text62,text63,text64,text65,text66,text67,text68,text69,text70,text71,text72,text73,text74,text75,text76,text77,text78,text79,text80;
    ImageView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,
            t41,t42,t43,t44,t45,t46,t47,t48,t49,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60,t61,t62,t63,t64,t65,t66,t67,t68,t69,t70,t71,t72,t73,t74,t75,t76,t77,t78,t79,t80;
    int pStatus = 0;
    BootstrapProgressBar hardPerProgress;
    TextView hardPerScoreText,progress3;
    DemoHelperClass demoHelperClass;
    private Handler handler = new Handler();
    TextView perpack1,perpack2,unlock;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab21, container, false);
        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        hardPerProgress=( BootstrapProgressBar )getView().findViewById(R.id.hardPerProgress);
        hardPerScoreText=(TextView)getView().findViewById(R.id.hardPerScoreText);

        p1= (TextView) getView().findViewById(R.id.pfirst);
        p2= (TextView) getView().findViewById(R.id.psecond);
        p3= (TextView) getView().findViewById(R.id.pthird);
        p4= (TextView) getView().findViewById(R.id.pforth);
        p5= (TextView) getView().findViewById(R.id.p5);
        p6= (TextView) getView().findViewById(R.id.p6);
        p7= (TextView) getView().findViewById(R.id.p7);
        p8= (TextView) getView().findViewById(R.id.p8);
        p9= (TextView) getView().findViewById(R.id.p9);
        p10= (TextView) getView().findViewById(R.id.p10);
        p11= (TextView) getView().findViewById(R.id.p11);
        p12= (TextView) getView().findViewById(R.id.p12);
        p13= (TextView) getView().findViewById(R.id.p13);
        p14= (TextView) getView().findViewById(R.id.p14);
        p15= (TextView) getView().findViewById(R.id.p15);
        p16= (TextView) getView().findViewById(R.id.p16);
        p17= (TextView) getView().findViewById(R.id.p17);
        p18= (TextView) getView().findViewById(R.id.p18);
        p19= (TextView) getView().findViewById(R.id.p19);
        p20= (TextView) getView().findViewById(R.id.p20);
        p21= (TextView) getView().findViewById(R.id.p21);
        p22= (TextView) getView().findViewById(R.id.p22);
        p23= (TextView) getView().findViewById(R.id.p23);
        p24= (TextView) getView().findViewById(R.id.p24);
        p25= (TextView) getView().findViewById(R.id.p25);
        p26= (TextView) getView().findViewById(R.id.p26);
        p27= (TextView) getView().findViewById(R.id.p27);
        p28= (TextView) getView().findViewById(R.id.p28);
        p29= (TextView) getView().findViewById(R.id.p29);
        p30= (TextView) getView().findViewById(R.id.p30);
        p31= (TextView) getView().findViewById(R.id.p31);
        p32= (TextView) getView().findViewById(R.id.p32);
        p33= (TextView) getView().findViewById(R.id.p33);
        p34= (TextView) getView().findViewById(R.id.p34);
        p35= (TextView) getView().findViewById(R.id.p35);
        p36= (TextView) getView().findViewById(R.id.p36);
        p37= (TextView) getView().findViewById(R.id.p37);
        p38= (TextView) getView().findViewById(R.id.p38);
        p39= (TextView) getView().findViewById(R.id.p39);
        p40= (TextView) getView().findViewById(R.id.p40);

        p41= (TextView) getView().findViewById(R.id.p41);
        p42= (TextView) getView().findViewById(R.id.p42);
        p43= (TextView) getView().findViewById(R.id.p43);
        p44= (TextView) getView().findViewById(R.id.p44);
        p45= (TextView) getView().findViewById(R.id.p45);
        p46= (TextView) getView().findViewById(R.id.p46);
        p47= (TextView) getView().findViewById(R.id.p47);
        p48= (TextView) getView().findViewById(R.id.p48);
        p49= (TextView) getView().findViewById(R.id.p49);
        p50= (TextView) getView().findViewById(R.id.p50);
        p51= (TextView) getView().findViewById(R.id.p51);
        p52= (TextView) getView().findViewById(R.id.p52);
        p53= (TextView) getView().findViewById(R.id.p53);
        p54= (TextView) getView().findViewById(R.id.p54);
        p55= (TextView) getView().findViewById(R.id.p55);
        p56= (TextView) getView().findViewById(R.id.p56);
        p57= (TextView) getView().findViewById(R.id.p57);
        p58= (TextView) getView().findViewById(R.id.p58);
        p59= (TextView) getView().findViewById(R.id.p59);
        p60= (TextView) getView().findViewById(R.id.p60);

        t1=(ImageView)getView().findViewById(R.id.tick1);
        t2=(ImageView)getView().findViewById(R.id.tick2);
        t3=(ImageView)getView().findViewById(R.id.tick3);
        t4=(ImageView)getView().findViewById(R.id.tick4);
        t5=(ImageView)getView().findViewById(R.id.tick5);
        t6=(ImageView)getView().findViewById(R.id.tick6);
        t7=(ImageView)getView().findViewById(R.id.tick7);
        t8=(ImageView)getView().findViewById(R.id.tick8);
        t9=(ImageView)getView().findViewById(R.id.tick9);
        t10=(ImageView)getView().findViewById(R.id.tick10);
        t11=(ImageView)getView().findViewById(R.id.tick11);
        t12=(ImageView)getView().findViewById(R.id.tick12);
        t13=(ImageView)getView().findViewById(R.id.tick13);
        t14=(ImageView)getView().findViewById(R.id.tick14);
        t15=(ImageView)getView().findViewById(R.id.tick15);
        t16=(ImageView)getView().findViewById(R.id.tick16);
        t17=(ImageView)getView().findViewById(R.id.tick17);
        t18=(ImageView)getView().findViewById(R.id.tick18);
        t19=(ImageView)getView().findViewById(R.id.tick19);
        t20=(ImageView)getView().findViewById(R.id.tick20);
        t21=(ImageView)getView().findViewById(R.id.tick21);
        t22=(ImageView)getView().findViewById(R.id.tick22);
        t23=(ImageView)getView().findViewById(R.id.tick23);
        t24=(ImageView)getView().findViewById(R.id.tick24);
        t25=(ImageView)getView().findViewById(R.id.tick25);
        t26=(ImageView)getView().findViewById(R.id.tick26);
        t27=(ImageView)getView().findViewById(R.id.tick27);
        t28=(ImageView)getView().findViewById(R.id.tick28);
        t29=(ImageView)getView().findViewById(R.id.tick29);
        t30=(ImageView)getView().findViewById(R.id.tick30);
        t31=(ImageView)getView().findViewById(R.id.tick31);
        t32=(ImageView)getView().findViewById(R.id.tick32);
        t33=(ImageView)getView().findViewById(R.id.tick33);
        t34=(ImageView)getView().findViewById(R.id.tick34);
        t35=(ImageView)getView().findViewById(R.id.tick35);
        t36=(ImageView)getView().findViewById(R.id.tick36);
        t37=(ImageView)getView().findViewById(R.id.tick37);
        t38=(ImageView)getView().findViewById(R.id.tick38);
        t39=(ImageView)getView().findViewById(R.id.tick39);
        t40=(ImageView)getView().findViewById(R.id.tick40);
        t41=(ImageView)getView().findViewById(R.id.tick41);
        t42=(ImageView)getView().findViewById(R.id.tick42);
        t43=(ImageView)getView().findViewById(R.id.tick43);
        t44=(ImageView)getView().findViewById(R.id.tick44);
        t45=(ImageView)getView().findViewById(R.id.tick45);
        t46=(ImageView)getView().findViewById(R.id.tick46);
        t47=(ImageView)getView().findViewById(R.id.tick47);
        t48=(ImageView)getView().findViewById(R.id.tick48);
        t49=(ImageView)getView().findViewById(R.id.tick49);
        t50=(ImageView)getView().findViewById(R.id.tick50);
        t51=(ImageView)getView().findViewById(R.id.tick51);
        t52=(ImageView)getView().findViewById(R.id.tick52);
        t53=(ImageView)getView().findViewById(R.id.tick53);
        t54=(ImageView)getView().findViewById(R.id.tick54);
        t55=(ImageView)getView().findViewById(R.id.tick55);
        t56=(ImageView)getView().findViewById(R.id.tick56);
        t57=(ImageView)getView().findViewById(R.id.tick57);
        t58=(ImageView)getView().findViewById(R.id.tick58);
        t59=(ImageView)getView().findViewById(R.id.tick59);
        t60=(ImageView)getView().findViewById(R.id.tick60);

        text1=(TextView) getView().findViewById(R.id.text1);
        text2=(TextView) getView().findViewById(R.id.text2);
        text3=(TextView) getView().findViewById(R.id.text3);
        text4=(TextView) getView().findViewById(R.id.text4);
        text5=(TextView) getView().findViewById(R.id.text5);
        text6=(TextView) getView().findViewById(R.id.text6);
        text7=(TextView) getView().findViewById(R.id.text7);
        text8=(TextView) getView().findViewById(R.id.text8);
        text9=(TextView) getView().findViewById(R.id.text9);
        text10=(TextView) getView().findViewById(R.id.text10);

        text11=(TextView) getView().findViewById(R.id.text11);
        text12=(TextView) getView().findViewById(R.id.text12);
        text13=(TextView) getView().findViewById(R.id.text13);
        text14=(TextView) getView().findViewById(R.id.text14);
        text15=(TextView) getView().findViewById(R.id.text15);
        text16=(TextView) getView().findViewById(R.id.text16);
        text17=(TextView) getView().findViewById(R.id.text17);
        text18=(TextView) getView().findViewById(R.id.text18);
        text19=(TextView) getView().findViewById(R.id.text19);
        text20=(TextView) getView().findViewById(R.id.text20);

        text21=(TextView) getView().findViewById(R.id.text21);
        text22=(TextView) getView().findViewById(R.id.text22);
        text23=(TextView) getView().findViewById(R.id.text23);
        text24=(TextView) getView().findViewById(R.id.text24);
        text25=(TextView) getView().findViewById(R.id.text25);
        text26=(TextView) getView().findViewById(R.id.text26);
        text27=(TextView) getView().findViewById(R.id.text27);
        text28=(TextView) getView().findViewById(R.id.text28);
        text29=(TextView) getView().findViewById(R.id.text29);
        text30=(TextView) getView().findViewById(R.id.text30);

        text31=(TextView) getView().findViewById(R.id.text31);
        text32=(TextView) getView().findViewById(R.id.text32);
        text33=(TextView) getView().findViewById(R.id.text33);
        text34=(TextView) getView().findViewById(R.id.text34);
        text35=(TextView) getView().findViewById(R.id.text35);
        text36=(TextView) getView().findViewById(R.id.text36);
        text37=(TextView) getView().findViewById(R.id.text37);
        text38=(TextView) getView().findViewById(R.id.text38);
        text39=(TextView) getView().findViewById(R.id.text39);
        text40=(TextView) getView().findViewById(R.id.text40);

        text31=(TextView) getView().findViewById(R.id.text31);
        text32=(TextView) getView().findViewById(R.id.text32);
        text33=(TextView) getView().findViewById(R.id.text33);
        text34=(TextView) getView().findViewById(R.id.text34);
        text35=(TextView) getView().findViewById(R.id.text35);
        text36=(TextView) getView().findViewById(R.id.text36);
        text37=(TextView) getView().findViewById(R.id.text37);
        text38=(TextView) getView().findViewById(R.id.text38);
        text39=(TextView) getView().findViewById(R.id.text39);
        text40=(TextView) getView().findViewById(R.id.text40);

        text41=(TextView) getView().findViewById(R.id.text41);
        text42=(TextView) getView().findViewById(R.id.text42);
        text43=(TextView) getView().findViewById(R.id.text43);
        text44=(TextView) getView().findViewById(R.id.text44);
        text45=(TextView) getView().findViewById(R.id.text45);
        text46=(TextView) getView().findViewById(R.id.text46);
        text47=(TextView) getView().findViewById(R.id.text47);
        text48=(TextView) getView().findViewById(R.id.text48);
        text49=(TextView) getView().findViewById(R.id.text49);
        text50=(TextView) getView().findViewById(R.id.text50);

        text51=(TextView) getView().findViewById(R.id.text51);
        text52=(TextView) getView().findViewById(R.id.text52);
        text53=(TextView) getView().findViewById(R.id.text53);
        text54=(TextView) getView().findViewById(R.id.text54);
        text55=(TextView) getView().findViewById(R.id.text55);
        text56=(TextView) getView().findViewById(R.id.text56);
        text57=(TextView) getView().findViewById(R.id.text57);
        text58=(TextView) getView().findViewById(R.id.text58);
        text59=(TextView) getView().findViewById(R.id.text59);
        text60=(TextView) getView().findViewById(R.id.text60);


        progress3=(TextView)getView().findViewById(R.id.progress3);
      //  unlock=(TextView)getView().findViewById(R.id.unlock);
        perpack1=(TextView)getView().findViewById(R.id.perpack1);
        perpack2=(TextView)getView().findViewById(R.id.perpack2);
        final Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/burnstown_dam.otf");
        final Typeface typeface2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/OpenSans-Bold.ttf");


        TextView imageViewsArray[]={p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30,p31,p32,p33,p34,p35,p36,p37,p38,p39,p40,
                p41,p42,p43,p44,p45,p46,p47,p48,p49,p50,p51,p52,p53,p54,p55,p56,p57,p58,p59,p60};
        for(int i=0;i<imageViewsArray.length;i++){
            final int finalI=i+1060;
            imageViewsArray[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(getActivity(),Personality.class);
                    intent.putExtra("Key",Integer.toString(finalI));
                    startActivity(intent);
                    getActivity().finish();
                }
            });
        }

        ImageView imageView[]={t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60};
        for(int i=0;i<imageView.length;i++){
            imageView[i].setVisibility(View.INVISIBLE);
        }
        //@@
        demoHelperClass = new DemoHelperClass(getActivity());
        SQLiteDatabase sqLiteDatabase = demoHelperClass.getWritableDatabase();
        List xyz = demoHelperClass.GetQid();
        if(xyz!=null){
            for(int i=0;i<xyz.size();i++){
                int x = (Integer) xyz.get(i);
                if(x>=1060 && x<1120) {
                    int y=x-1060;
                    imageView[y].setVisibility(View.VISIBLE);
                }
            }
        }

        List<Integer> list=new ArrayList();
        for(int i=0;i<imageView.length;i++) {
            if (imageView[i].getVisibility() == View.VISIBLE) {
                int pqr = 1;
                list.add(pqr);
            }
        }
        hardPerProgress.setProgress(list.size());
        hardPerScoreText.setText(list.size() + "/" + 60);

        //starting
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int checkWidth = size.x;
        int checkHeight = size.y;

        //setting typeface for textview and number
        for(int i=0;i<imageViewsArray.length;i++){
            if(i<9)
            {
                imageViewsArray[i].setText("0"+Integer.toString(i+1));
            }else{
                imageViewsArray[i].setText(Integer.toString(i+1));
            }
            imageViewsArray[i].setTypeface(typeface1);
            // imageViewsArray[i].setTextSize(40);

            //LARGE
            if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE) {
                RelativeLayout.LayoutParams params = ( RelativeLayout.LayoutParams) imageViewsArray[i].getLayoutParams();
                params.height = getResources().getDimensionPixelSize(R.dimen.text_view_heightLarge);
                params.width = getResources().getDimensionPixelSize(R.dimen.text_view_widthLarge);
                imageViewsArray[i].setLayoutParams(params);
                imageViewsArray[i].setTextSize(55);

            }
            //LNORMAL
            if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_NORMAL) {
                if (checkWidth < 700 && checkHeight < 1000) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) imageViewsArray[i].getLayoutParams();
                    params.height = getResources().getDimensionPixelSize(R.dimen.text_view_heightNormalLess);
                    params.width = getResources().getDimensionPixelSize(R.dimen.text_view_widthNormalLess);
                    imageViewsArray[i].setLayoutParams(params);
                    imageViewsArray[i].setTextSize(35);
                //    Toast.makeText(getActivity(), "IF", Toast.LENGTH_LONG).show();

                } else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) imageViewsArray[i].getLayoutParams();
                    params.height = getResources().getDimensionPixelSize(R.dimen.text_view_heightNormalDefault);
                    params.width = getResources().getDimensionPixelSize(R.dimen.text_view_widthNormalDefault);
                    imageViewsArray[i].setLayoutParams(params);
                    imageViewsArray[i].setTextSize(43);
                //    Toast.makeText(getActivity(), "else", Toast.LENGTH_LONG).show();
                }

            }
            //XLARGE
            if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_XLARGE) {
                RelativeLayout.LayoutParams params = ( RelativeLayout.LayoutParams) imageViewsArray[i].getLayoutParams();
                params.height = getResources().getDimensionPixelSize(R.dimen.text_view_heightXlarge);
                params.width = getResources().getDimensionPixelSize(R.dimen.text_view_widthXlarge);
                imageViewsArray[i].setLayoutParams(params);
                imageViewsArray[i].setTextSize(75);

            }

            //SMALL
            if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_SMALL) {
                RelativeLayout.LayoutParams params = ( RelativeLayout.LayoutParams) imageViewsArray[i].getLayoutParams();
                params.height = getResources().getDimensionPixelSize(R.dimen.text_view_heightSmall);
                params.width = getResources().getDimensionPixelSize(R.dimen.text_view_widthSmall);
                imageViewsArray[i].setLayoutParams(params);
                imageViewsArray[i].setTextSize(25);

            }
        }

        TextView textView[]={text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,
                text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,
                text21,text22,text23,text24,text25,text26,text27,text28,text29,text30,
                text31,text32,text33,text34,text35,text36,text37,text38,text39,text40,
                text41,text42,text43,text44,text45,text46,text47,text48,text49,text50,
                text51,text52,text53,text54,text55,text56,text57,text58,text59,text60};

        //large
        if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE) {
            for(int i=0;i<textView.length;i++){
                textView[i].setTextSize(15);
            }
        }
        //normal
        if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_NORMAL) {
            if(checkWidth<700 && checkHeight<1000){
                for(int i=0;i<textView.length;i++){
                    textView[i].setTextSize(9);
                }
            }else{
                for(int i=0;i<textView.length;i++){
                    textView[i].setTextSize(11);
                }
            }

        }

        if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_XLARGE) {
            for(int i=0;i<textView.length;i++) {
                textView[i].setTextSize(18);
            }
        }

        if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_SMALL) {
            for(int i=0;i<textView.length;i++) {
                textView[i].setTextSize(9);
            }
        }


        String music="Music";
        String movie_film="Movie/\nFilm";
        String superhero="Superhero";
        String cartoon_manga="Cartoon/\nManga";
        String entertainment="Enter-\ntainment";

        //music
        TextView array1[]={text4,text7,text8,text9,text10,text15,text16,text18,text20,text24,
                text26,text27,text31,text34,text35,text43,text44,text49,text50,text52,text60};
        for(int i=0;i<array1.length;i++){
            array1[i].setText(music);
            array1[i].setTypeface(typeface2);
        }
        //movie_film
        TextView array2[]={text1,text2,text3,text5,text6,text11,text17,text19,text21,text22,
                text23,text25,text25,text29,text30,text32,text33,text36,text38,text39,
                text40,text41,text42,text45,text46,text47,text48,text51,text53,text55,text56,text57,text58,text59};
        for(int i=0;i<array2.length;i++){
            array2[i].setText(movie_film);
            array2[i].setTypeface(typeface2);
        }
        //superhero
        TextView array3[]={text12,text28};
        for(int i=0;i<array3.length;i++){
            array3[i].setText(superhero);
            array3[i].setTypeface(typeface2);
        }
        //catoon_manga
        TextView array4[]={text54};
        for(int i=0;i<array4.length;i++){
            array4[i].setText(cartoon_manga);
            array4[i].setTypeface(typeface2);
        }
        //entertainment
        TextView array5[]={text13,text14,text37};
        for(int i=0;i<array5.length;i++){
            array5[i].setText(entertainment);
            array5[i].setTypeface(typeface2);
        }

        /*new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                while (pStatus <30 ) {
                    pStatus += 1;
                    handler.post(new Runnable() {

                        @Override
                        public void run() {
                            // TODO Auto-generated method stub
                            hardPerProgress.setProgress(pStatus);
                            hardPerScoreText.setText(pStatus + "/" + hardPerProgress.getMax());
                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        // Just to display the progress slowly
                        Thread.sleep(15);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();*/
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/shablagooital.ttf");
        progress3.setTypeface(typeface);
        perpack1.setTypeface(typeface);
        perpack2.setTypeface(typeface);
     //   unlock.setTypeface(typeface);
    }
}