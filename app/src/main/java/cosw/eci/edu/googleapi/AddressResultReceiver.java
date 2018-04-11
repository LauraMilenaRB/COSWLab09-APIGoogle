package cosw.eci.edu.googleapi;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;


/**
 * Created by Laura RB on 9/04/2018.
 */

public class AddressResultReceiver extends ResultReceiver {
    private AddressResultListener addressResultListener;

    public AddressResultReceiver( Handler handler ){
        super( handler );
    }

    public void setAddressResultListener( AddressResultListener addressResultListener ) {
        this.addressResultListener = addressResultListener;
    }

    @Override
    protected void onReceiveResult( int resultCode, Bundle resultData )
    {
        // Display the address string
        // or an error message sent from the intent service.
        String addressOutput = resultData.getString( FetchAddressIntentService.RESULT_DATA_KEY );

        if ( resultCode == FetchAddressIntentService.SUCCESS_RESULT && addressResultListener != null )
        {
            addressResultListener.onAddressFound( addressOutput );
        }

    }
}
