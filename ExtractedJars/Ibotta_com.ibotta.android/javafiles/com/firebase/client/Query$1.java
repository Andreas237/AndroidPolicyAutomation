// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;


// Referenced classes of package com.firebase.client:
//			ValueEventListener, Query, FirebaseError, DataSnapshot

class Query$1
	implements ValueEventListener
{

	public void onCancelled(FirebaseError firebaseerror)
	{
		val$listener.onCancelled(firebaseerror);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ValueEventListener val$listener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #29  <Method void ValueEventListener.onCancelled(FirebaseError)>
	//    4   10:return          
	}

	public void onDataChange(DataSnapshot datasnapshot)
	{
		removeEventListener(((ValueEventListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Query this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #34  <Method void Query.removeEventListener(ValueEventListener)>
		val$listener.onDataChange(datasnapshot);
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field ValueEventListener val$listener>
	//    6   12:aload_1         
	//    7   13:invokeinterface #36  <Method void ValueEventListener.onDataChange(DataSnapshot)>
	//    8   18:return          
	}

	final Query this$0;
	final ValueEventListener val$listener;

	Query$1()
	{
		this$0 = final_query;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Query this$0>
		val$listener = ValueEventListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ValueEventListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
