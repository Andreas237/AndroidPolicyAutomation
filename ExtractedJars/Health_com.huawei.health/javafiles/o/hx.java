// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.Activity;

final class hx
	implements Runnable
{

	hx(Activity activity)
	{
		e = activity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Activity e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		e.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field Activity e>
	//    2    4:invokevirtual   #22  <Method void Activity.finish()>
	//    3    7:return          
	}

	final Activity e;
}
