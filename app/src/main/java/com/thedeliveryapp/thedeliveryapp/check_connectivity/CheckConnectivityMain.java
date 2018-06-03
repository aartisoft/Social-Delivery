package com.thedeliveryapp.thedeliveryapp.check_connectivity;

import android.app.Application;

public class CheckConnectivityMain extends Application {
    private static CheckConnectivityMain mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static synchronized CheckConnectivityMain getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}
