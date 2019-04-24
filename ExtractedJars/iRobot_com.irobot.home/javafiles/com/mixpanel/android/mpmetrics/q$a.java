// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			q

private static class q$a
	implements Callable
{

	public SharedPreferences a()
	{
		SharedPreferences sharedpreferences = a.getSharedPreferences(b, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context a>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field String b>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #34  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   12:astore_1        
		if(c != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #26  <Field q$b c>
	//*   9   17:ifnull          30
			c.a(sharedpreferences);
	//   10   20:aload_0         
	//   11   21:getfield        #26  <Field q$b c>
	//   12   24:aload_1         
	//   13   25:invokeinterface #39  <Method void q$b.a(SharedPreferences)>
		return sharedpreferences;
	//   14   30:aload_1         
	//   15   31:areturn         
	}

	public Object call()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method SharedPreferences a()>
	//    2    4:areturn         
	}

	private final Context a;
	private final String b;
	private final q$b c;

	public q$a(Context context, String s, q$b q$b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field String b>
		c = q$b1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field q$b c>
	//   11   19:return          
	}
}
