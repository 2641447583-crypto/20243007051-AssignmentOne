package com.example.assignmentone;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity - home screen of the CampusLife app.
 * Shows a welcome banner and four service buttons (Facilities, Events, Clubs, Support).
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the Facilities image button is tapped. */
    public void onFacilitiesClicked(View view) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
    }

    /** Called when the Events image button is tapped. */
    public void onEventsClicked(View view) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
    }

    /** Called when the Clubs image button is tapped. */
    public void onClubsClicked(View view) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
    }

    /** Called when the Support image button is tapped. */
    public void onSupportClicked(View view) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
    }
}
