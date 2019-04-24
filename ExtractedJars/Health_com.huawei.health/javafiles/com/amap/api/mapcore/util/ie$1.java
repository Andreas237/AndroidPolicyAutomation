// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;

// Referenced classes of package com.amap.api.mapcore.util:
//			ie, ih

class ie$1
	implements Runnable
{

	public void run()
	{
		try
		{
			d.a(a, b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ie d>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Context a>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field String b>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field String c>
	//    8   16:invokevirtual   #36  <Method void ie.a(Context, String, String)>
			return;
	//    9   19:return          
		}
		catch(Throwable throwable)
	//*  10   20:astore_1        
		{
			ih.a(throwable, "dLoader", "run()");
	//   11   21:aload_1         
	//   12   22:ldc1            #38  <String "dLoader">
	//   13   24:ldc1            #40  <String "run()">
	//   14   26:invokestatic    #45  <Method void ih.a(Throwable, String, String)>
		}
	//   15   29:return          
	}

	final Context a;
	final String b;
	final String c;
	final ie d;

	ie$1(ie ie1, Context context, String s, String s1)
	{
		d = ie1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ie d>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Context a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String b>
		c = s1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field String c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
