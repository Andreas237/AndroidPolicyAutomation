// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			LocalOtaHttpsActivity_

class LocalOtaHttpsActivity_$4
	implements Runnable
{

	public void run()
	{
		LocalOtaHttpsActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field LocalOtaHttpsActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field boolean a>
	//    4    8:invokestatic    #27  <Method void LocalOtaHttpsActivity_.a(LocalOtaHttpsActivity_, boolean)>
	//    5   11:return          
	}

	final boolean a;
	final LocalOtaHttpsActivity_ b;

	LocalOtaHttpsActivity_$4(LocalOtaHttpsActivity_ localotahttpsactivity_, boolean flag)
	{
		b = localotahttpsactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field LocalOtaHttpsActivity_ b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
