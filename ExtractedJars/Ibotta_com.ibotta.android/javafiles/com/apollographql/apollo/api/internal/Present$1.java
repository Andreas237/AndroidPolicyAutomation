// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.internal;


// Referenced classes of package com.apollographql.apollo.api.internal:
//			Function, Present, Action

class Present$1
	implements Function
{

	public Object apply(Object obj)
	{
		val$action.apply(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Action val$action>
	//    2    4:aload_1         
	//    3    5:invokeinterface #33  <Method void Action.apply(Object)>
		return obj;
	//    4   10:aload_1         
	//    5   11:areturn         
	}

	final Present this$0;
	final Action val$action;

	Present$1()
	{
		this$0 = final_present;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Present this$0>
		val$action = Action.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Action val$action>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
