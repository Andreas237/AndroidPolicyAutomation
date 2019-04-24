// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.irobot.home.util:
//			q

static final class q$2
	implements android.content.ogInterface.OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		q.d(a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context a>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field String b>
	//    4    8:invokestatic    #29  <Method void q.d(Context, String)>
	//    5   11:return          
	}

	final Context a;
	final String b;

	q$2(Context context, String s)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Context a>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
