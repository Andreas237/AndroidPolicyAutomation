// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.*;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;

public class FacebookBroadcastReceiver extends BroadcastReceiver
{

	public FacebookBroadcastReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	protected void onFailedAppCall(String s, String s1, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (intent.getStringExtra("com.facebook.platform.protocol.CALL_ID")));
	//    0    0:aload_2         
	//    1    1:ldc1            #15  <String "com.facebook.platform.protocol.CALL_ID">
	//    2    3:invokevirtual   #21  <Method String Intent.getStringExtra(String)>
	//    3    6:astore_1        
		String s = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
	//    4    7:aload_2         
	//    5    8:ldc1            #23  <String "com.facebook.platform.protocol.PROTOCOL_ACTION">
	//    6   10:invokevirtual   #21  <Method String Intent.getStringExtra(String)>
	//    7   13:astore_3        
		if(context != null && s != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          52
	//*  10   18:aload_3         
	//*  11   19:ifnull          52
		{
			Bundle bundle = intent.getExtras();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #27  <Method Bundle Intent.getExtras()>
	//   14   26:astore          4
			if(NativeProtocol.isErrorResult(intent))
	//*  15   28:aload_2         
	//*  16   29:invokestatic    #33  <Method boolean NativeProtocol.isErrorResult(Intent)>
	//*  17   32:ifeq            44
			{
				onFailedAppCall(((String) (context)), s, bundle);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:aload_3         
	//   21   38:aload           4
	//   22   40:invokevirtual   #35  <Method void onFailedAppCall(String, String, Bundle)>
				return;
	//   23   43:return          
			}
			onSuccessfulAppCall(((String) (context)), s, bundle);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:aload_3         
	//   27   47:aload           4
	//   28   49:invokevirtual   #38  <Method void onSuccessfulAppCall(String, String, Bundle)>
		}
	//   29   52:return          
	}

	protected void onSuccessfulAppCall(String s, String s1, Bundle bundle)
	{
	//    0    0:return          
	}
}
