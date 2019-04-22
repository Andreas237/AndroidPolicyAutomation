// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.*;
import android.util.Log;

// Referenced classes of package com.facebook:
//			AccessTokenTracker, AccessToken

private class AccessTokenTracker$CurrentAccessTokenBroadcastReceiver extends BroadcastReceiver
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
			Log.d(AccessTokenTracker.access$100(), "AccessTokenChanged");
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

	private AccessTokenTracker$CurrentAccessTokenBroadcastReceiver()
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

	AccessTokenTracker$CurrentAccessTokenBroadcastReceiver(AccessTokenTracker._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void AccessTokenTracker$CurrentAccessTokenBroadcastReceiver(AccessTokenTracker)>
	//    3    5:return          
	}
}
