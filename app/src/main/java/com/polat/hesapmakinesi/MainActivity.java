package com.polat.hesapmakinesi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.polat.hesapmakinesi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setContentView(R.layout.activity_main);


        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        // int sayi1= 10;
        /*
       Button  btnHesapla=  findViewById(R.id.btnHesapla);
        EditText txtSayi1=  findViewById(R.id.txtSayi1);
        EditText txtSayi2=  findViewById(R.id.txtSayi2);
        TextView txtSonuc=  findViewById(R.id.txtSonuc);
        */



      binding.btnHesapla.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              int sayi1= Integer.parseInt( binding.txtSayi1.getText().toString());
              int sayi2= Integer.parseInt( binding.txtSayi2.getText().toString());
                int toplam = sayi1 + sayi2;


                String mesaj = String.format("Sonuç = %d dir", toplam);
              binding. txtSonuc.setText(mesaj);


              Toast.makeText(MainActivity.this, mesaj, Toast.LENGTH_LONG).show();
              //Toast.makeText(MainActivity.this,"Mesaj" ,Toast.LENGTH_LONG).show();
          }
      });
    }
}