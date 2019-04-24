// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.view.View;
import java.util.List;

// Referenced classes of package com.mixpanel.android.b:
//			o

private static abstract class o$d extends o
{

	protected void c(View view)
	{
		a.a(view, b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field o$h a>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field String b>
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field boolean c>
	//    7   13:invokeinterface #31  <Method void o$h.a(View, String, boolean)>
	//    8   18:return          
	}

	protected String d()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String b>
	//    2    4:areturn         
	}

	private final o$h a;
	private final String b;
	private final boolean c;

	public o$d(List list, String s, o$h o$h1, boolean flag)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void o(List)>
		a = o$h1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #18  <Field o$h a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #20  <Field String b>
		c = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #22  <Field boolean c>
	//   12   21:return          
	}
}
