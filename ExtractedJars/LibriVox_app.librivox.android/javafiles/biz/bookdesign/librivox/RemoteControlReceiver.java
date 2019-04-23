// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.content.*;
import android.support.v4.a.g;

public class RemoteControlReceiver extends BroadcastReceiver
{

	public RemoteControlReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		if("android.intent.action.MEDIA_BUTTON".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #13  <String "android.intent.action.MEDIA_BUTTON">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #19  <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #25  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            21
			g.a(context).a(intent);
	//    5   12:aload_1         
	//    6   13:invokestatic    #31  <Method g g.a(Context)>
	//    7   16:aload_2         
	//    8   17:invokevirtual   #34  <Method boolean g.a(Intent)>
	//    9   20:pop             
	//   10   21:return          
	}
}
