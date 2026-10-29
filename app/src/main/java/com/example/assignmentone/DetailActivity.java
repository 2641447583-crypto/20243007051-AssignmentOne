package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * DetailActivity - shows information about one of the four student-service areas.
 *
 * Reads the selection index passed by MainActivity through the Intent, then pulls
 * the matching title / content / image name out of the string-arrays defined in
 * res/values/arrays.xml (Part H).
 *
 * Per the specification, no 'if' statements or 'switch' cases are used: the
 * selection index is used directly as an array subscript.
 */
public class DetailActivity extends AppCompatActivity {

    // Must match the extra key used in MainActivity.
    private static final String EXTRA_SELECTION = "selection_id";

    /** Short header labels shown in the green title bar, ordered to match arrays.xml. */
    private static final String[] HEADER_TITLES = {"Facilities", "Events", "Clubs", "Support"};

    /**
     * Called when the activity is first created.
     * Reads the selection index from the Intent and binds the matching data to the views.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // 1. Pull the chosen-button index out of the incoming Intent.
        int selection = getIntent().getIntExtra(EXTRA_SELECTION, 0);

        // 2. Load the three arrays from res/values/arrays.xml.
        String[] titles   = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] images   = getResources().getStringArray(R.array.string_array_images);

        // 3. Grab the matching row for this selection directly by subscript.
        String bodyTitle   = titles[selection];
        String bodyContent = contents[selection];
        String imageName   = images[selection].trim();

        // 4. Resolve the image name (e.g. "img_btn_facilities") into a drawable resource id.
        String packageName = getPackageName();
        int imageResId = getResources().getIdentifier(imageName, "drawable", packageName);

        // 5. Bind everything to the views.
        ImageView  iconView   = findViewById(R.id.detailIcon);
        TextView   headerView = findViewById(R.id.detailHeaderTitle);
        TextView   titleView  = findViewById(R.id.detailBodyTitle);
        TextView   bodyView   = findViewById(R.id.detailBodyContent);

        headerView.setText(HEADER_TITLES[selection]);
        titleView.setText(bodyTitle);
        bodyView.setText(bodyContent);
        iconView.setImageResource(imageResId);
    }
}
