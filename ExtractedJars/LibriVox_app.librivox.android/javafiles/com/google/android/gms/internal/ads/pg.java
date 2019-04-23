// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			pf, abo

final class pg
	implements Runnable
{

	pg(pf pf1, boolean flag, JSONObject jsonobject, abo abo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		a = pf1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field pf a>
		b = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field boolean b>
		c = jsonobject;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field JSONObject c>
		d = abo;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field abo d>
	//   14   25:return          
	}

	public final void run()
	{
		a.a(b, c, d);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field pf a>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field boolean b>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field JSONObject c>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field abo d>
	//    8   16:invokevirtual   #34  <Method void pf.a(boolean, JSONObject, abo)>
	//    9   19:return          
	}

	private final pf a;
	private final boolean b;
	private final JSONObject c;
	private final abo d;
}
