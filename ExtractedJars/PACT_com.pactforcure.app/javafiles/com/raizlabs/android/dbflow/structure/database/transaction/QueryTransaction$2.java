// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			QueryTransaction

class QueryTransaction$2
	implements Runnable
{

	public void run()
	{
		queryResultListCallback.onListQueryResult(QueryTransaction.this, val$resultList);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field QueryTransaction this$0>
	//    2    4:getfield        #30  <Field QueryTransaction$QueryResultListCallback QueryTransaction.queryResultListCallback>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field QueryTransaction this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field List val$resultList>
	//    7   15:invokeinterface #35  <Method void QueryTransaction$QueryResultListCallback.onListQueryResult(QueryTransaction, List)>
	//    8   20:return          
	}

	final QueryTransaction this$0;
	final List val$resultList;

	QueryTransaction$2()
	{
		this$0 = final_querytransaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field QueryTransaction this$0>
		val$resultList = List.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field List val$resultList>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
