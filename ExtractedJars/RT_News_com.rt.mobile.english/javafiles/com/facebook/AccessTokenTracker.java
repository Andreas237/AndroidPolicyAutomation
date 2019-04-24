// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.*;
import android.support.v4.content.LocalBroadcastManager;
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
		//*   4    9:ifeq            41
			{
				context = ((Context) ((AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN")));
		//    5   12:aload_2         
		//    6   13:ldc1            #38  <String "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN">
		//    7   15:invokevirtual   #42  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
		//    8   18:checkcast       #44  <Class AccessToken>
		//    9   21:astore_1        
				intent = ((Intent) ((AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN")));
		//   10   22:aload_2         
		//   11   23:ldc1            #46  <String "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN">
		//   12   25:invokevirtual   #42  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
		//   13   28:checkcast       #44  <Class AccessToken>
		//   14   31:astore_2        
				onCurrentAccessTokenChanged(((AccessToken) (context)), ((AccessToken) (intent)));
		//   15   32:aload_0         
		//   16   33:getfield        #13  <Field AccessTokenTracker this$0>
		//   17   36:aload_1         
		//   18   37:aload_2         
		//   19   38:invokevirtual   #50  <Method void AccessTokenTracker.onCurrentAccessTokenChanged(AccessToken, AccessToken)>
			}
		//   20   41:return          
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
	//    1    1:invokespecial   #19  <Method void Object()>
		isTracking = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean isTracking>
		Validate.sdkInitialized();
	//    5    9:invokestatic    #26  <Method void Validate.sdkInitialized()>
	//    6   12:aload_0         
	//    7   13:new             #8   <Class AccessTokenTracker$CurrentAccessTokenBroadcastReceiver>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:invokespecial   #29  <Method void AccessTokenTracker$CurrentAccessTokenBroadcastReceiver(AccessTokenTracker, AccessTokenTracker$1)>
	//   12   22:putfield        #31  <Field BroadcastReceiver receiver>
	//   13   25:aload_0         
	//   14   26:invokestatic    #37  <Method Context FacebookSdk.getApplicationContext()>
	//   15   29:invokestatic    #43  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   16   32:putfield        #45  <Field LocalBroadcastManager broadcastManager>
		startTracking();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #48  <Method void startTracking()>
	//   19   39:return          
	}

	private void addBroadcastReceiver()
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #52  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void IntentFilter()>
	//    3    7:astore_1        
		intentfilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
	//    4    8:aload_1         
	//    5    9:ldc1            #55  <String "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED">
	//    6   11:invokevirtual   #59  <Method void IntentFilter.addAction(String)>
		broadcastManager.registerReceiver(receiver, intentfilter);
	//    7   14:aload_0         
	//    8   15:getfield        #45  <Field LocalBroadcastManager broadcastManager>
	//    9   18:aload_0         
	//   10   19:getfield        #31  <Field BroadcastReceiver receiver>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #63  <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   13   26:return          
	}

	public boolean isTracking()
	{
		return isTracking;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field boolean isTracking>
	//    2    4:ireturn         
	}

	protected abstract void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1);

	public void startTracking()
	{
		if(isTracking)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean isTracking>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			addBroadcastReceiver();
	//    4    8:aload_0         
	//    5    9:invokespecial   #68  <Method void addBroadcastReceiver()>
			isTracking = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #21  <Field boolean isTracking>
			return;
	//    9   17:return          
		}
	}

	public void stopTracking()
	{
		if(!isTracking)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean isTracking>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			broadcastManager.unregisterReceiver(receiver);
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field LocalBroadcastManager broadcastManager>
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field BroadcastReceiver receiver>
	//    8   16:invokevirtual   #73  <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
			isTracking = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #21  <Field boolean isTracking>
			return;
	//   12   24:return          
		}
	}

	private final LocalBroadcastManager broadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext());
	private boolean isTracking;
	private final BroadcastReceiver receiver = new CurrentAccessTokenBroadcastReceiver();
}
