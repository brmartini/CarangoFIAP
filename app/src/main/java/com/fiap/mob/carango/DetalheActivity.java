package com.fiap.mob.carango;

import android.content.Context;
import android.media.Image;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fiap.mob.carango.model.Carro;
import com.squareup.picasso.Picasso;

public class DetalheActivity extends AppCompatActivity {

    private ImageView ivCarroDet;
    private TextView carroDescDet;
    private Context context;
    private CollapsingToolbarLayout collapsing_toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);
        if(getIntent() != null){

            Carro carro = getIntent().getParcelableExtra("carro");
            ivCarroDet = (ImageView) findViewById(R.id.ivCarroDet);
            carroDescDet = (TextView) findViewById(R.id.carroDescDet);
            collapsing_toolbar = (CollapsingToolbarLayout)findViewById(R.id.collapsing_toolbar);

            carroDescDet.setText(carro.getDescricao());
            collapsing_toolbar.setTitle(carro.getNome());
            Picasso.with(context).load(carro.getFoto()).into(ivCarroDet);

            Toast.makeText(this, carro.getNome(),Toast.LENGTH_SHORT).show();

        }
    }
}
