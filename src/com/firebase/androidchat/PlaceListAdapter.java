package com.firebase.androidchat;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.firebase.client.Query;

/**
 * User: greg
 * Date: 6/21/13
 * Time: 2:39 PM
 */

/**
 * This class is an example of how to use FirebaseListAdapter. It uses the <code>Chat</code> class to encapsulate the
 * data for each individual chat message
 */
public class PlaceListAdapter extends FirebaseListAdapter<Place> {

    // The username for this client. We use this to indicate which messages originated from this user
    private String username;

    public PlaceListAdapter(Query ref, Activity activity, int layout, String username) {
        super(ref, Place.class, layout, activity);
        this.username = username;
    }

    /**
     * Bind an instance of the <code>Chat</code> class to our view. This method is called by <code>FirebaseListAdapter</code>
     * when there is a data change, and we are given an instance of a View that corresponds to the layout that we passed
     * to the constructor, as well as a single <code>Chat</code> instance that represents the current data to bind.
     * @param view A view instance corresponding to the layout we passed to the constructor.
     * @param chat An instance representing the current state of a chat message
     */
    @Override
    protected void populateView(View view, Place place) {
        // Map a Chat object to an entry in our listview
      String name = place.getName();
      TextView nameText = (TextView)view.findViewById(R.id.name);
      nameText.setText(name + ": ");
        // If the message was sent by this user, color it differently
       // if (name.equals(username)) {
       //     nameText.setTextColor(Color.RED);
       // } else {
        //    nameText.setTextColor(Color.BLUE);
      //  }
	  ((TextView)view.findViewById(R.id.name)).setText(place.getName());
       ((TextView)view.findViewById(R.id.description)).setText(place.getDescription());
    }
}
