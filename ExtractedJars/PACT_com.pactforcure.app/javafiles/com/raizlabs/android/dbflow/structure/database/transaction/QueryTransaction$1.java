// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.sql.language.CursorResult;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			QueryTransaction

class QueryTransaction$1
	implements Runnable
{

	public void run()
	{
		queryResultCallback.onQueryResult(QueryTransaction.this, val$cursorResult);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field QueryTransaction this$0>
	//    2    4:getfield        #30  <Field QueryTransaction$QueryResultCallback QueryTransaction.queryResultCallback>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field QueryTransaction this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field CursorResult val$cursorResult>
	//    7   15:invokeinterface #35  <Method void QueryTransaction$QueryResultCallback.onQueryResult(QueryTransaction, CursorResult)>
	//    8   20:return          
	}

	final QueryTransaction this$0;
	final CursorResult val$cursorResult;

	QueryTransaction$1()
	{
		this$0 = final_querytransaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field QueryTransaction this$0>
		val$cursorResult = CursorResult.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CursorResult val$cursorResult>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
