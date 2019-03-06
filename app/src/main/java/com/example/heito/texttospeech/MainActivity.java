package com.example.heito.texttospeech;

import android.content.pm.ActivityInfo;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Deixar aplicação na posição Vertical
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                Locale pt = new Locale("PT", "BR");
                tts.setLanguage(pt);
            }
        });

    }


    public void PrimeiraFrase(View view) {
        tts.speak("SE VOCÊ NASCEU POBRE NÃO É PROBLEMA SEU...", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void SegundaFrase(View view) {
        tts.speak("MAS, SE VOCÊ MORRE POBRE, A CULPA É SUA.", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void AutorFrase(View view) {
        tts.speak("AUTOR BILL GATES", TextToSpeech.QUEUE_FLUSH, null);
    }
}
