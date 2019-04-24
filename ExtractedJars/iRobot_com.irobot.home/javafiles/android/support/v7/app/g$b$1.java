// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.*;

// Referenced classes of package android.support.v7.app:
//			g

class g$b$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field g$b a>
	//    2    4:invokevirtual   #25  <Method void g$b.b()>
	//    3    7:return          
	}

	final g.b a;

	g$b$1(g.b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field g$b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
