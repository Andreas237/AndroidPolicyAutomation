// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;


// Referenced classes of package com.irobot.home.fragments:
//			CheckRemoteConnectionFragment

class CheckRemoteConnectionFragment$1
	implements Runnable
{

	public void run()
	{
		CheckRemoteConnectionFragment.a(a, true);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CheckRemoteConnectionFragment a>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #23  <Method boolean CheckRemoteConnectionFragment.a(CheckRemoteConnectionFragment, boolean)>
	//    4    8:pop             
		CheckRemoteConnectionFragment.a(a);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field CheckRemoteConnectionFragment a>
	//    7   13:invokestatic    #25  <Method void CheckRemoteConnectionFragment.a(CheckRemoteConnectionFragment)>
	//    8   16:return          
	}

	final CheckRemoteConnectionFragment a;

	CheckRemoteConnectionFragment$1(CheckRemoteConnectionFragment checkremoteconnectionfragment)
	{
		a = checkremoteconnectionfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CheckRemoteConnectionFragment a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
