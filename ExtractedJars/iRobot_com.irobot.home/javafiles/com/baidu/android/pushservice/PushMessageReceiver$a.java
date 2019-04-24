// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.baidu.android.pushservice:
//			PushMessageReceiver

private static class PushMessageReceiver$a extends Handler
{

	protected final WeakReference d;

	public PushMessageReceiver$a(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Handler()>
		d = new WeakReference(((Object) (context)));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #20  <Method void WeakReference(Object)>
	//    7   13:putfield        #22  <Field WeakReference d>
	//    8   16:return          
	}
}
