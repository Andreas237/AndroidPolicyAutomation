// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


// Referenced classes of package com.firebase.client.core:
//			Repo

class Repo$1
	implements Runnable
{

	public void run()
	{
		Repo.access$000(Repo.this);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Repo this$0>
	//    2    4:invokestatic    #24  <Method void Repo.access$000(Repo)>
	//    3    7:return          
	}

	final Repo this$0;

	Repo$1()
	{
		this$0 = Repo.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Repo this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
