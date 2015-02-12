package com.test.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HelloPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException
    {
        boolean validAction = true;
        Log.d("Plugin ejecutando acción:",action);
        if (action.equals("nativeAction"))
        {
            callbackContext.success(args.getString(0));
        }
        else
        {
            validAction = false;
        }
        return validAction;
    }

}
