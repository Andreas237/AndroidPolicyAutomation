// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.*;

// Referenced classes of package com.facebook:
//			AccessTokenManager

public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver
{

	public CurrentAccessTokenExpirationBroadcastReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		if("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #13  <String "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #19  <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #25  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            18
			AccessTokenManager.getInstance().currentAccessTokenChanged();
	//    5   12:invokestatic    #31  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    6   15:invokevirtual   #34  <Method void AccessTokenManager.currentAccessTokenChanged()>
	//    7   18:return          
	}
}
