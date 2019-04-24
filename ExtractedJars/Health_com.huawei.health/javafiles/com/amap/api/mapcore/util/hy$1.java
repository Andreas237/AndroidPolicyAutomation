// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;

// Referenced classes of package com.amap.api.mapcore.util:
//			hy, hq, id, ib, 
//			ih

static final class hy$1
	implements Runnable
{

	public void run()
	{
		try
		{
			ib.a(new hq(a, ((hp) (id.a()))), a, b);
	//    0    0:new             #28  <Class hq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Context a>
	//    4    8:invokestatic    #33  <Method id id.a()>
	//    5   11:invokespecial   #36  <Method void hq(Context, hp)>
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field Context a>
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field String b>
	//   10   22:invokestatic    #41  <Method void ib.a(hq, Context, String)>
			return;
	//   11   25:return          
		}
		catch(Throwable throwable)
	//*  12   26:astore_1        
		{
			ih.a(throwable, "InstanceFactory", "rollBack");
	//   13   27:aload_1         
	//   14   28:ldc1            #43  <String "InstanceFactory">
	//   15   30:ldc1            #45  <String "rollBack">
	//   16   32:invokestatic    #50  <Method void ih.a(Throwable, String, String)>
		}
	//   17   35:return          
	}

	final Context a;
	final String b;

	hy$1(Context context, String s)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Context a>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field String b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void Object()>
	//    8   14:return          
	}
}
