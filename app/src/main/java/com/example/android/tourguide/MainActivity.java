package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button call;
    Button web;
    Button mail;
    Button address;
    CardView book;
    CardView locations;
    CardView food;
    CardView people;
    CardView tours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById (R.id.collapse_toolbar);
        collapsingToolbarLayout.setTitle("Bloody London Tour");
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.expandedappbar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.collapsedappbar);

        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context,R.color.colorPrimary) );

        book = (CardView) findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bookIntent = new Intent(Intent.ACTION_VIEW);
                bookIntent.setData(Uri.parse("http://amzn.to/2quM3LO"));

                if (bookIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(bookIntent);
                }
            }
        });

        locations = (CardView) findViewById(R.id.locations);
        locations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 // Create a new intent to open the {@link Main2Activity}
                Intent featuresIntent = new Intent(MainActivity.this, Main2Activity.class);
                // Start the new activity
                startActivity(featuresIntent);

            }
        });

        food = (CardView) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Main2Activity}
                Intent featuresIntent = new Intent(MainActivity.this, Main2Activity.class);
                // Start the new activity
                startActivity(featuresIntent);

            }
        });

        people = (CardView) findViewById(R.id.people);
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Main2Activity}
                Intent featuresIntent = new Intent(MainActivity.this, Main2Activity.class);
                // Start the new activity
                startActivity(featuresIntent);

            }
        });

        tours = (CardView) findViewById(R.id.tours);
        tours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Main2Activity}
                Intent featuresIntent = new Intent(MainActivity.this, Main2Activity.class);
                // Start the new activity
                startActivity(featuresIntent);

            }
        });

        address = (Button) findViewById(R.id.address);
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addressIntent = new Intent(Intent.ACTION_VIEW);
                addressIntent.setData(Uri.parse("geo:0,0?q=Barbican Station, Londra, Regno Unito"));
                if (addressIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(addressIntent);
                }
            }
        });

        mail = (Button) findViewById(R.id.mail);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mailIntent = new Intent(Intent.ACTION_SEND);
                mailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"decmchugh@yahoo.com"});
                mailIntent.putExtra(Intent.EXTRA_SUBJECT, "");
                mailIntent.putExtra(Intent.EXTRA_TEXT, "");
                mailIntent.setType("message/rfc822");
                if (mailIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mailIntent);
                }
            }
        });


        web = (Button) findViewById(R.id.weburl);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse("http://www.shockinglondon.com/"));

                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });

        call = (Button) findViewById(R.id.phonenumber);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+447905746733"));
                startActivity(callIntent);
            }
        });

    }
}
