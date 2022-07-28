
package com.jnidemo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class NativeKeyModule extends ReactContextBaseJavaModule {

    static {
        System.loadLibrary("get_key_jni"); //this loads the library when the class is loaded
    }

    public NativeKeyModule(ReactApplicationContext reactContext) {
        super(reactContext); //required by React Native
    }

    @Override
    public String getName() {
        return "NativeKey"; //HelloWorld is how this module will be referred to from React Native
    }

    @ReactMethod
    public void getKey(Promise promise) { //this method will be called from JS by React Native
        try {
            String hello = getNativeKey();
            promise.resolve(hello);
        } catch (Exception e) {
            promise.reject("ERR", e);
        }
    }

    public native String getNativeKey();
}