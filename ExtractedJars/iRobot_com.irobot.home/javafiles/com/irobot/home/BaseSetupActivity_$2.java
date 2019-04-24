// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			BaseSetupActivity_

class BaseSetupActivity_$2
	implements Runnable
{

	public void run()
	{
		BaseSetupActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BaseSetupActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field String a>
	//    4    8:invokestatic    #27  <Method void BaseSetupActivity_.a(BaseSetupActivity_, String)>
	//    5   11:return          
	}

	final String a;
	final BaseSetupActivity_ b;

	BaseSetupActivity_$2(BaseSetupActivity_ basesetupactivity_, String s)
	{
		b = basesetupactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field BaseSetupActivity_ b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
