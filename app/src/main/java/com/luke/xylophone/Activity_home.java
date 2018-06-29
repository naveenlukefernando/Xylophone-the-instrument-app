package com.luke.xylophone;

import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static android.media.AudioManager.STREAM_MUSIC;

public class Activity_home extends AppCompatActivity {

   private SoundPool msoundPool;

    private int msoundC;
    private int msoundD;
    private int msoundE;
    private int msoundF;
    private int msoundG;
    private int msoundA;
    private int msoundB;
    private int msoundCL;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


       msoundPool = new SoundPool(7,STREAM_MUSIC,0);

        msoundC = msoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        msoundD = msoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        msoundE = msoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        msoundF = msoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        msoundG = msoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        msoundA = msoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        msoundB = msoundPool.load(getApplicationContext(),R.raw.note7_b,1);
        msoundCL = msoundPool.load(getApplicationContext(),R.raw.note1_cl,1);


        }


        public void playC(View view) {
        Log.d("dice","clicked C");
        msoundPool.play(msoundC,1.0f,1.0f,0,0,1);
    }

    public void playD(View view) {
        Log.d("dice","clicked D");
        msoundPool.play(msoundD,1.0f,1.0f,0,0,1);
    }

    public void playE(View view) {
        Log.d("dice","clicked E");
        msoundPool.play(msoundE,1.0f,1.0f,0,0,1);
    }

    public void playF(View view) {
        Log.d("dice","clicked F");
        msoundPool.play(msoundF,1.0f,1.0f,0,0,1);
    }

    public void playG(View view) {
        Log.d("dice","clicked G");
        msoundPool.play(msoundG,1.0f,1.0f,0,0,1);
    }

    public void playA(View view) {

        Log.d("dice","clicked A");
        msoundPool.play(msoundA,1.0f,1.0f,0,0,1);
    }

    public void playB(View view) {
        Log.d("dice","clicked B");
        msoundPool.play(msoundB,1.0f,1.0f,0,0,1);
    }

    public void playCL(View view) {
        Log.d("dice","clicked CL");
        msoundPool.play(msoundCL,1.0f,1.0f,0,0,1);
    }

}
