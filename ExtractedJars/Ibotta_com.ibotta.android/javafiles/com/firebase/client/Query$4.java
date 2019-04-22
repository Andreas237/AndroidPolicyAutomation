// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.Repo;

// Referenced classes of package com.firebase.client:
//			Query

class Query$4
	implements Runnable
{

	public void run()
	{
		repo.keepSynced(getSpec(), val$keepSynced);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Query this$0>
	//    2    4:getfield        #30  <Field Repo Query.repo>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field Query this$0>
	//    5   11:invokevirtual   #34  <Method com.firebase.client.core.view.QuerySpec Query.getSpec()>
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field boolean val$keepSynced>
	//    8   18:invokevirtual   #39  <Method void Repo.keepSynced(com.firebase.client.core.view.QuerySpec, boolean)>
	//    9   21:return          
	}

	final Query this$0;
	final boolean val$keepSynced;

	Query$4()
	{
		this$0 = final_query;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Query this$0>
		val$keepSynced = Z.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean val$keepSynced>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
