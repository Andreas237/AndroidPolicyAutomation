// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import android.content.*;
import android.os.SystemClock;
import com.startapp.android.publish.adsCommon.Utils.b;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.common.a.g;

public class BootCompleteListener extends BroadcastReceiver
{

	public BootCompleteListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		try
		{
			g.a(3, "BootCompleteListener - onReceive");
	//    0    0:iconst_3        
	//    1    1:ldc1            #15  <String "BootCompleteListener - onReceive">
	//    2    3:invokestatic    #21  <Method void g.a(int, String)>
			long l = SystemClock.elapsedRealtime() + 60000L;
	//    3    6:invokestatic    #27  <Method long SystemClock.elapsedRealtime()>
	//    4    9:ldc2w           #28  <Long 60000L>
	//    5   12:ladd            
	//    6   13:lstore_3        
			b.a(context);
	//    7   14:aload_1         
	//    8   15:invokestatic    #34  <Method void b.a(Context)>
			b.a(context, Long.valueOf(l));
	//    9   18:aload_1         
	//   10   19:lload_3         
	//   11   20:invokestatic    #40  <Method Long Long.valueOf(long)>
	//   12   23:invokestatic    #43  <Method void b.a(Context, Long)>
			b.a(context, l);
	//   13   26:aload_1         
	//   14   27:lload_3         
	//   15   28:invokestatic    #46  <Method void b.a(Context, long)>
			return;
	//   16   31:return          
		}
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//*  17   32:astore_2        
		{
			f.a(context, d.b, "BootCompleteListener.onReceive - failed to start services", ((Exception) (intent)).getMessage(), "");
	//   18   33:aload_1         
	//   19   34:getstatic       #52  <Field d d.b>
	//   20   37:ldc1            #54  <String "BootCompleteListener.onReceive - failed to start services">
	//   21   39:aload_2         
	//   22   40:invokevirtual   #58  <Method String Exception.getMessage()>
	//   23   43:ldc1            #60  <String "">
	//   24   45:invokestatic    #65  <Method void f.a(Context, d, String, String, String)>
		}
	//   25   48:return          
	}
}
