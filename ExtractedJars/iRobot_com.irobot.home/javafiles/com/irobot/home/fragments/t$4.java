// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.CarpetBoostMode;

// Referenced classes of package com.irobot.home.fragments:
//			t

class t$4
	implements Runnable
{

	public void run()
	{
		t.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field t b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field CarpetBoostMode a>
	//    4    8:invokestatic    #27  <Method void t.a(t, CarpetBoostMode)>
	//    5   11:return          
	}

	final CarpetBoostMode a;
	final t b;

	t$4(t t1, CarpetBoostMode carpetboostmode)
	{
		b = t1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field t b>
		a = carpetboostmode;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field CarpetBoostMode a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
