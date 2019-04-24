// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;

// Referenced classes of package com.amap.api.mapcore.util:
//			iy, iv, ik

final class iy$3
	implements Runnable
{

	public final void run()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Context a>
	//*   2    4:ifnull          14
			iv.c(a);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field Context a>
	//    5   11:invokestatic    #29  <Method void iv.c(Context)>
		ik.e(iy.c(b).a());
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field iy b>
	//    8   18:invokestatic    #32  <Method ik iy.c(iy)>
	//    9   21:invokevirtual   #37  <Method String ik.a()>
	//   10   24:invokestatic    #41  <Method void ik.e(String)>
	//   11   27:return          
	}

	private Context a;
	private iy b;

	iy$3(iy iy1, Context context)
	{
		b = iy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field iy b>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Context a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void Object()>
	//    8   14:return          
	}
}
