// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.*;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.h.o;

public class SDcardRemovedReceiver extends BroadcastReceiver
{

	public SDcardRemovedReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		if(intent.getAction().equals("android.intent.action.MEDIA_BAD_REMOVAL") || intent.getAction().equals("android.intent.action.MEDIA_REMOVED"))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #22  <Method String Intent.getAction()>
	//*   2    4:ldc1            #24  <String "android.intent.action.MEDIA_BAD_REMOVAL">
	//*   3    6:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*   4    9:ifne            24
	//*   5   12:aload_2         
	//*   6   13:invokevirtual   #22  <Method String Intent.getAction()>
	//*   7   16:ldc1            #32  <String "android.intent.action.MEDIA_REMOVED">
	//*   8   18:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*   9   21:ifeq            35
		{
			com.baidu.android.pushservice.e.a.c(a, "sdcard removed");
	//   10   24:getstatic       #34  <Field String a>
	//   11   27:ldc1            #36  <String "sdcard removed">
	//   12   29:invokestatic    #42  <Method void a.c(String, String)>
			o.a();
	//   13   32:invokestatic    #46  <Method void o.a()>
		}
	//   14   35:return          
	}

	private static String a = "SDRev";

	static 
	{
	//    0    0:return          
	}
}
