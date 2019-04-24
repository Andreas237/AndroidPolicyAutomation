// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.common.a;

import android.content.Context;
import java.io.Serializable;

// Referenced classes of package com.startapp.common.a:
//			e

static final class e$1
	implements Runnable
{

	public void run()
	{
		e.a(a, ((String) (null)), b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context a>
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field String b>
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field Serializable c>
	//    7   13:invokestatic    #31  <Method void e.a(Context, String, String, Serializable)>
	//    8   16:return          
	}

	final Context a;
	final String b;
	final Serializable c;

	e$1(Context context, String s, Serializable serializable)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Context a>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String b>
		c = serializable;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field Serializable c>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
