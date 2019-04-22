// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.apollographql.apollo:
//			ApolloClient

class ApolloClient$Builder$1
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		return new Thread(runnable, "Apollo Dispatcher");
	//    0    0:new             #29  <Class Thread>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #31  <String "Apollo Dispatcher">
	//    4    7:invokespecial   #34  <Method void Thread(Runnable, String)>
	//    5   10:areturn         
	}

	final ApolloClient.Builder this$0;

	ApolloClient$Builder$1()
	{
		this$0 = ApolloClient.Builder.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ApolloClient$Builder this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
