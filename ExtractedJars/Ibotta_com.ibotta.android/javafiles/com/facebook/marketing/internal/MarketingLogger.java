// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public final class MarketingLogger
{

	public MarketingLogger(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		appEventsLogger = AppEventsLogger.newLogger(context, s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokestatic    #17  <Method AppEventsLogger AppEventsLogger.newLogger(Context, String)>
	//    6   10:putfield        #19  <Field AppEventsLogger appEventsLogger>
	//    7   13:return          
	}

	public void logCodelessInitialized()
	{
		if(!FacebookSdk.getAutoLogAppEventsEnabled())
	//*   0    0:invokestatic    #27  <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//*   1    3:ifne            7
		{
			return;
	//    2    6:return          
		} else
		{
			Bundle bundle = new Bundle();
	//    3    7:new             #29  <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #30  <Method void Bundle()>
	//    6   14:astore_1        
			bundle.putString("_codeless_action", "sdk_initialized");
	//    7   15:aload_1         
	//    8   16:ldc1            #32  <String "_codeless_action">
	//    9   18:ldc1            #34  <String "sdk_initialized">
	//   10   20:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			appEventsLogger.logSdkEvent("fb_codeless_debug", ((Double) (null)), bundle);
	//   11   23:aload_0         
	//   12   24:getfield        #19  <Field AppEventsLogger appEventsLogger>
	//   13   27:ldc1            #40  <String "fb_codeless_debug">
	//   14   29:aconst_null     
	//   15   30:aload_1         
	//   16   31:invokevirtual   #44  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
			return;
	//   17   34:return          
		}
	}

	public void logGestureTriggered()
	{
		if(!FacebookSdk.getAutoLogAppEventsEnabled())
	//*   0    0:invokestatic    #27  <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//*   1    3:ifne            7
		{
			return;
	//    2    6:return          
		} else
		{
			Bundle bundle = new Bundle();
	//    3    7:new             #29  <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #30  <Method void Bundle()>
	//    6   14:astore_1        
			bundle.putString("_codeless_action", "gesture_triggered");
	//    7   15:aload_1         
	//    8   16:ldc1            #32  <String "_codeless_action">
	//    9   18:ldc1            #47  <String "gesture_triggered">
	//   10   20:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			appEventsLogger.logSdkEvent("fb_codeless_debug", ((Double) (null)), bundle);
	//   11   23:aload_0         
	//   12   24:getfield        #19  <Field AppEventsLogger appEventsLogger>
	//   13   27:ldc1            #40  <String "fb_codeless_debug">
	//   14   29:aconst_null     
	//   15   30:aload_1         
	//   16   31:invokevirtual   #44  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
			return;
	//   17   34:return          
		}
	}

	public void logIndexingCancelled(String s)
	{
		if(!FacebookSdk.getAutoLogAppEventsEnabled())
	//*   0    0:invokestatic    #27  <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//*   1    3:ifne            7
		{
			return;
	//    2    6:return          
		} else
		{
			Bundle bundle = new Bundle();
	//    3    7:new             #29  <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #30  <Method void Bundle()>
	//    6   14:astore_2        
			bundle.putString("_codeless_action", "indexing_cancelled");
	//    7   15:aload_2         
	//    8   16:ldc1            #32  <String "_codeless_action">
	//    9   18:ldc1            #51  <String "indexing_cancelled">
	//   10   20:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			bundle.putString("_activity_name", s);
	//   11   23:aload_2         
	//   12   24:ldc1            #53  <String "_activity_name">
	//   13   26:aload_1         
	//   14   27:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			appEventsLogger.logSdkEvent("fb_codeless_debug", ((Double) (null)), bundle);
	//   15   30:aload_0         
	//   16   31:getfield        #19  <Field AppEventsLogger appEventsLogger>
	//   17   34:ldc1            #40  <String "fb_codeless_debug">
	//   18   36:aconst_null     
	//   19   37:aload_2         
	//   20   38:invokevirtual   #44  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
			return;
	//   21   41:return          
		}
	}

	public void logIndexingComplete(String s)
	{
		if(!FacebookSdk.getAutoLogAppEventsEnabled())
	//*   0    0:invokestatic    #27  <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//*   1    3:ifne            7
		{
			return;
	//    2    6:return          
		} else
		{
			Bundle bundle = new Bundle();
	//    3    7:new             #29  <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #30  <Method void Bundle()>
	//    6   14:astore_2        
			bundle.putString("_codeless_action", "indexing_complete");
	//    7   15:aload_2         
	//    8   16:ldc1            #32  <String "_codeless_action">
	//    9   18:ldc1            #56  <String "indexing_complete">
	//   10   20:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			bundle.putString("_activity_name", s);
	//   11   23:aload_2         
	//   12   24:ldc1            #53  <String "_activity_name">
	//   13   26:aload_1         
	//   14   27:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			appEventsLogger.logSdkEvent("fb_codeless_debug", ((Double) (null)), bundle);
	//   15   30:aload_0         
	//   16   31:getfield        #19  <Field AppEventsLogger appEventsLogger>
	//   17   34:ldc1            #40  <String "fb_codeless_debug">
	//   18   36:aconst_null     
	//   19   37:aload_2         
	//   20   38:invokevirtual   #44  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
			return;
	//   21   41:return          
		}
	}

	public void logIndexingStart(String s)
	{
		if(!FacebookSdk.getAutoLogAppEventsEnabled())
	//*   0    0:invokestatic    #27  <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//*   1    3:ifne            7
		{
			return;
	//    2    6:return          
		} else
		{
			Bundle bundle = new Bundle();
	//    3    7:new             #29  <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #30  <Method void Bundle()>
	//    6   14:astore_2        
			bundle.putString("_codeless_action", "indexing_start");
	//    7   15:aload_2         
	//    8   16:ldc1            #32  <String "_codeless_action">
	//    9   18:ldc1            #59  <String "indexing_start">
	//   10   20:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			bundle.putString("_activity_name", s);
	//   11   23:aload_2         
	//   12   24:ldc1            #53  <String "_activity_name">
	//   13   26:aload_1         
	//   14   27:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			appEventsLogger.logSdkEvent("fb_codeless_debug", ((Double) (null)), bundle);
	//   15   30:aload_0         
	//   16   31:getfield        #19  <Field AppEventsLogger appEventsLogger>
	//   17   34:ldc1            #40  <String "fb_codeless_debug">
	//   18   36:aconst_null     
	//   19   37:aload_2         
	//   20   38:invokevirtual   #44  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
			return;
	//   21   41:return          
		}
	}

	public void logSessionReady()
	{
		if(!FacebookSdk.getAutoLogAppEventsEnabled())
	//*   0    0:invokestatic    #27  <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//*   1    3:ifne            7
		{
			return;
	//    2    6:return          
		} else
		{
			Bundle bundle = new Bundle();
	//    3    7:new             #29  <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #30  <Method void Bundle()>
	//    6   14:astore_1        
			bundle.putString("_codeless_action", "session_ready");
	//    7   15:aload_1         
	//    8   16:ldc1            #32  <String "_codeless_action">
	//    9   18:ldc1            #62  <String "session_ready">
	//   10   20:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			appEventsLogger.logSdkEvent("fb_codeless_debug", ((Double) (null)), bundle);
	//   11   23:aload_0         
	//   12   24:getfield        #19  <Field AppEventsLogger appEventsLogger>
	//   13   27:ldc1            #40  <String "fb_codeless_debug">
	//   14   29:aconst_null     
	//   15   30:aload_1         
	//   16   31:invokevirtual   #44  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
			return;
	//   17   34:return          
		}
	}

	private final AppEventsLogger appEventsLogger;
}
