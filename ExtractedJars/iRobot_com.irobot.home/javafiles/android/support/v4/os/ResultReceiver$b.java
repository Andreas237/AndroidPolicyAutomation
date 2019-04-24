// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Bundle;

// Referenced classes of package android.support.v4.os:
//			ResultReceiver

class ResultReceiver$b
	implements Runnable
{

	public void run()
	{
		c.a(a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ResultReceiver c>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field int a>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Bundle b>
	//    6   12:invokevirtual   #30  <Method void ResultReceiver.a(int, Bundle)>
	//    7   15:return          
	}

	final int a;
	final Bundle b;
	final ResultReceiver c;

	ResultReceiver$b(ResultReceiver resultreceiver, int i, Bundle bundle)
	{
		c = resultreceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ResultReceiver c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		a = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int a>
		b = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Bundle b>
	//   11   19:return          
	}
}
