// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

class FacebookSDKJSInterface
{

	public FacebookSDKJSInterface(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Context context>
	//    5    9:return          
	}

	private static Bundle jsonStringToBundle(String s)
	{
		try
		{
			s = ((String) (jsonToBundle(new JSONObject(s))));
	//    0    0:new             #31  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void JSONObject(String)>
	//    4    8:invokestatic    #38  <Method Bundle jsonToBundle(JSONObject)>
	//    5   11:astore_0        
		}
	//*   6   12:aload_0         
	//*   7   13:areturn         
	//*   8   14:new             #40  <Class Bundle>
	//*   9   17:dup             
	//*  10   18:invokespecial   #41  <Method void Bundle()>
	//*  11   21:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return new Bundle();
		}
		return ((Bundle) (s));
	//*  12   22:astore_0        
	//*  13   23:goto            14
	}

	private static Bundle jsonToBundle(JSONObject jsonobject)
		throws JSONException
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #40  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void Bundle()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); bundle.putString(s, jsonobject.getString(s)))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #45  <Method Iterator JSONObject.keys()>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            45
			s = (String)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #55  <Method Object Iterator.next()>
	//   12   28:checkcast       #57  <Class String>
	//   13   31:astore_3        

	//   14   32:aload_1         
	//   15   33:aload_3         
	//   16   34:aload_0         
	//   17   35:aload_3         
	//   18   36:invokevirtual   #61  <Method String JSONObject.getString(String)>
	//   19   39:invokevirtual   #65  <Method void Bundle.putString(String, String)>
	//*  20   42:goto            13
		return bundle;
	//   21   45:aload_1         
	//   22   46:areturn         
	}

	public String getProtocol()
	{
		return "fbmq-0.1";
	//    0    0:ldc1            #11  <String "fbmq-0.1">
	//    1    2:areturn         
	}

	public void sendEvent(String s, String s1, String s2)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       16
		{
			Logger.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Can't bridge an event without a referral Pixel ID. Check your webview Pixel configuration");
	//    2    4:getstatic       #78  <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//    3    7:getstatic       #80  <Field String TAG>
	//    4   10:ldc1            #82  <String "Can't bridge an event without a referral Pixel ID. Check your webview Pixel configuration">
	//    5   12:invokestatic    #88  <Method void Logger.log(LoggingBehavior, String, String)>
			return;
	//    6   15:return          
		} else
		{
			AppEventsLogger appeventslogger = AppEventsLogger.newLogger(context);
	//    7   16:aload_0         
	//    8   17:getfield        #25  <Field Context context>
	//    9   20:invokestatic    #94  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//   10   23:astore          4
			s2 = ((String) (jsonStringToBundle(s2)));
	//   11   25:aload_3         
	//   12   26:invokestatic    #96  <Method Bundle jsonStringToBundle(String)>
	//   13   29:astore_3        
			((Bundle) (s2)).putString("_fb_pixel_referral_id", s);
	//   14   30:aload_3         
	//   15   31:ldc1            #8   <String "_fb_pixel_referral_id">
	//   16   33:aload_1         
	//   17   34:invokevirtual   #65  <Method void Bundle.putString(String, String)>
			appeventslogger.logEvent(s1, ((Bundle) (s2)));
	//   18   37:aload           4
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #100 <Method void AppEventsLogger.logEvent(String, Bundle)>
			return;
	//   22   44:return          
		}
	}

	private static final String PARAMETER_FBSDK_PIXEL_REFERRAL = "_fb_pixel_referral_id";
	private static final String PROTOCOL = "fbmq-0.1";
	public static final String TAG = "FacebookSDKJSInterface";
	private Context context;

	static 
	{
	//    0    0:return          
	}
}
