// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.*;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.facebook.internal.Validate;

// Referenced classes of package com.facebook:
//			FacebookSdk, AccessToken

public abstract class AccessTokenTracker
{
	private class CurrentAccessTokenBroadcastReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			if("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(((Object) (intent.getAction()))))
		//*   0    0:ldc1            #24  <String "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED">
		//*   1    2:aload_2         
		//*   2    3:invokevirtual   #30  <Method String Intent.getAction()>
		//*   3    6:invokevirtual   #36  <Method boolean String.equals(Object)>
		//*   4    9:ifeq            50
			{
				Log.d(AccessTokenTracker.TAG, "AccessTokenChanged");
		//    5   12:invokestatic    #39  <Method String AccessTokenTracker.access$100()>
		//    6   15:ldc1            #41  <String "AccessTokenChanged">
		//    7   17:invokestatic    #47  <Method int Log.d(String, String)>
		//    8   20:pop             
				context = ((Context) ((AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN")));
		//    9   21:aload_2         
		//   10   22:ldc1            #49  <String "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN">
		//   11   24:invokevirtual   #53  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
		//   12   27:checkcast       #55  <Class AccessToken>
		//   13   30:astore_1        
				intent = ((Intent) ((AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN")));
		//   14   31:aload_2         
		//   15   32:ldc1            #57  <String "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN">
		//   16   34:invokevirtual   #53  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
		//   17   37:checkcast       #55  <Class AccessToken>
		//   18   40:astore_2        
				onCurrentAccessTokenChanged(((AccessToken) (context)), ((AccessToken) (intent)));
		//   19   41:aload_0         
		//   20   42:getfield        #13  <Field AccessTokenTracker this$0>
		//   21   45:aload_1         
		//   22   46:aload_2         
		//   23   47:invokevirtual   #61  <Method void AccessTokenTracker.onCurrentAccessTokenChanged(AccessToken, AccessToken)>
			}
		//   24   50:return          
		}

		final AccessTokenTracker this$0;

		private CurrentAccessTokenBroadcastReceiver()
		{
			this$0 = AccessTokenTracker.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AccessTokenTracker this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
		//    5    9:return          
		}

	}


	public AccessTokenTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		isTracking = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean isTracking>
		Validate.sdkInitialized();
	//    5    9:invokestatic    #32  <Method void Validate.sdkInitialized()>
	//    6   12:aload_0         
	//    7   13:new             #8   <Class AccessTokenTracker$CurrentAccessTokenBroadcastReceiver>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:invokespecial   #35  <Method void AccessTokenTracker$CurrentAccessTokenBroadcastReceiver(AccessTokenTracker, AccessTokenTracker$1)>
	//   12   22:putfield        #37  <Field BroadcastReceiver receiver>
	//   13   25:aload_0         
	//   14   26:invokestatic    #43  <Method Context FacebookSdk.getApplicationContext()>
	//   15   29:invokestatic    #49  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   16   32:putfield        #51  <Field LocalBroadcastManager broadcastManager>
		startTracking();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #54  <Method void startTracking()>
	//   19   39:return          
	}

	private void addBroadcastReceiver()
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #61  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void IntentFilter()>
	//    3    7:astore_1        
		intentfilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
	//    4    8:aload_1         
	//    5    9:ldc1            #64  <String "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED">
	//    6   11:invokevirtual   #68  <Method void IntentFilter.addAction(String)>
		broadcastManager.registerReceiver(receiver, intentfilter);
	//    7   14:aload_0         
	//    8   15:getfield        #51  <Field LocalBroadcastManager broadcastManager>
	//    9   18:aload_0         
	//   10   19:getfield        #37  <Field BroadcastReceiver receiver>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #72  <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   13   26:return          
	}

	protected abstract void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1);

	public void startTracking()
	{
		if(isTracking)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean isTracking>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			addBroadcastReceiver();
	//    4    8:aload_0         
	//    5    9:invokespecial   #76  <Method void addBroadcastReceiver()>
			isTracking = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #27  <Field boolean isTracking>
			return;
	//    9   17:return          
		}
	}

	private static final String TAG = "AccessTokenTracker";
	private final LocalBroadcastManager broadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext());
	private boolean isTracking;
	private final BroadcastReceiver receiver = new CurrentAccessTokenBroadcastReceiver();

	static 
	{
	//    0    0:return          
	}


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #58  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
