package com.androidexample.gcm;

public interface Config {
	// AIzaSyB3f-n4l3F0MdksjSv5QJvrKxMQfk5aefU
	// 723303977688
	
	static final String YOUR_SERVER_URL =  "http://gcm.softwhisper.es/register.php";
    static final String GOOGLE_SENDER_ID = "723303977688";  // Place here your Google project id

    /**
     * Tag used on log messages.
     */
    static final String TAG = "GCM Android Example";

    static final String DISPLAY_MESSAGE_ACTION =
            "com.androidexample.gcm.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";
		
	
}
