// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.EventRegistration;
import com.firebase.client.core.Repo;

// Referenced classes of package com.firebase.client:
//			Query

class Query$2
	implements Runnable
{

	public void run()
	{
		repo.removeEventCallback(val$registration);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Query this$0>
	//    2    4:getfield        #30  <Field Repo Query.repo>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field EventRegistration val$registration>
	//    5   11:invokevirtual   #35  <Method void Repo.removeEventCallback(EventRegistration)>
	//    6   14:return          
	}

	final Query this$0;
	final EventRegistration val$registration;

	Query$2()
	{
		this$0 = final_query;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Query this$0>
		val$registration = EventRegistration.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field EventRegistration val$registration>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
