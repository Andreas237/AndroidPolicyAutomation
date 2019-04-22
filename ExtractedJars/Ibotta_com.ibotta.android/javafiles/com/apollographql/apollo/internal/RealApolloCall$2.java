// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.internal.Action;

// Referenced classes of package com.apollographql.apollo.internal:
//			RealApolloCall

class RealApolloCall$2
	implements Action
{

	public void apply(com.apollographql.apollo.ck ck)
	{
		ck.onStatusEvent(com.apollographql.apollo.Event.SCHEDULED);
	//    0    0:aload_1         
	//    1    1:getstatic       #31  <Field com.apollographql.apollo.ApolloCall$StatusEvent com.apollographql.apollo.ApolloCall$StatusEvent.SCHEDULED>
	//    2    4:invokevirtual   #37  <Method void com.apollographql.apollo.ApolloCall$Callback.onStatusEvent(com.apollographql.apollo.ApolloCall$StatusEvent)>
	//    3    7:return          
	}

	public volatile void apply(Object obj)
	{
		apply((com.apollographql.apollo.ck)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class com.apollographql.apollo.ApolloCall$Callback>
	//    3    5:invokevirtual   #43  <Method void apply(com.apollographql.apollo.ApolloCall$Callback)>
	//    4    8:return          
	}

	final RealApolloCall this$0;

	RealApolloCall$2()
	{
		this$0 = RealApolloCall.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RealApolloCall this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
