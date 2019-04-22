// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


// Referenced classes of package com.firebase.client.core:
//			RepoManager, Repo

static final class RepoManager$1
	implements Runnable
{

	public void run()
	{
		val$repo.interrupt();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Repo val$repo>
	//    2    4:invokevirtual   #25  <Method void Repo.interrupt()>
	//    3    7:return          
	}

	final Repo val$repo;

	RepoManager$1(Repo repo1)
	{
		val$repo = repo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Repo val$repo>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
