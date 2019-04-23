// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.*;
import com.facebook.internal.Utility;

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
	//*   4    9:ifeq            49
		{
			Utility.logd(AccessTokenTracker.access$100(), "AccessTokenChanged");
	//    5   12:invokestatic    #39  <Method String AccessTokenTracker.access$100()>
	//    6   15:ldc1            #41  <String "AccessTokenChanged">
	//    7   17:invokestatic    #47  <Method void Utility.logd(String, String)>
			context = ((Context) ((AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN")));
	//    8   20:aload_2         
	//    9   21:ldc1            #49  <String "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN">
	//   10   23:invokevirtual   #53  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   11   26:checkcast       #55  <Class AccessToken>
	//   12   29:astore_1        
			intent = ((Intent) ((AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN")));
	//   13   30:aload_2         
	//   14   31:ldc1            #57  <String "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN">
	//   15   33:invokevirtual   #53  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   16   36:checkcast       #55  <Class AccessToken>
	//   17   39:astore_2        
			onCurrentAccessTokenChanged(((AccessToken) (context)), ((AccessToken) (intent)));
	//   18   40:aload_0         
	//   19   41:getfield        #13  <Field AccessTokenTracker this$0>
	//   20   44:aload_1         
	//   21   45:aload_2         
	//   22   46:invokevirtual   #61  <Method void AccessTokenTracker.onCurrentAccessTokenChanged(AccessToken, AccessToken)>
		}
	//   23   49:return          
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
