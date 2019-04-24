// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;

// Referenced classes of package o:
//			dhu

static final class dhu$4
	implements Runnable
{

	public void run()
	{
		dhu.d(a);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Context a>
	//    2    4:invokestatic    #24  <Method void dhu.d(Context)>
	//    3    7:return          
	}

	final Context a;

	dhu$4(Context context)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Context a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
