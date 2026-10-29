package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity - home screen of the CampusLife app.
 *
 * Shows a welcome banner and four service buttons (Facilities, Events, Clubs, Support).
 * Each button:
 *   - pops a short Toast to confirm the click (Part E)
 *   - starts DetailActivity via an explicit Intent, passing the button index
 *     (Part G) so the detail screen knows which content to load.
 */
public class MainActivity extends AppCompatActivity {

    // Unique identifier passed through the Intent to DetailActivity.
    private static final String EXTRA_SELECTION = "selection_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the Facilities image button is tapped. */
    public void onFacilitiesClicked(View view) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
        startDetail(0);
    }

    /** Called when the Events image button is tapped. */
    public void onEventsClicked(View view) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
        startDetail(1);
    }

    /** Called when the Clubs image button is tapped. */
    public void onClubsClicked(View view) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
        startDetail(2);
    }

    /** Called when the Support image button is tapped. */
    public void onSupportClicked(View view) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
        startDetail(3);
    }

    /**
     * Helper: build an explicit Intent to DetailActivity and attach the
     * selected-button index. Kept small so the four onClick handlers stay tidy.
     *
     * @param selection index of the tapped button (0=Facilities,1=Events,2=Clubs,3=Support)
     */
    private void startDetail(int selection) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_SELECTION, selection);
        startActivity(intent);
    }
}
