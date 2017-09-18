package com.roadpia.carpoold;

import android.content.Context;
import android.telephony.SmsManager;
import android.widget.Toast;
/*
     <uses-permission android:name="android.permission.READ_PHONE_STATE" />
                  <uses-permission android:name="android.permission.SEND_SMS" />
                  <uses-permission android:name="android.permission.RECEIVE_SMS" />
*/
public class Messenger {

        private Context mContext;

        public Messenger(Context mContext) {
                      this.mContext = mContext;
        }

        public void sendMessageTo(String phoneNum, String message) {

                      SmsManager smsManager = SmsManager.getDefault();
                      smsManager.sendTextMessage(phoneNum, null, message, null, null);

                      Toast.makeText(mContext, "Message transmission is completed.",
                                                                                      Toast.LENGTH_SHORT).show();
        }

}