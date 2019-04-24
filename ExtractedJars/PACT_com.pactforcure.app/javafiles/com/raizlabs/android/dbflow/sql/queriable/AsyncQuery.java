// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.queriable;

import com.raizlabs.android.dbflow.sql.BaseAsyncObject;

// Referenced classes of package com.raizlabs.android.dbflow.sql.queriable:
//			ModelQueriable

public class AsyncQuery extends BaseAsyncObject
{

	public AsyncQuery(ModelQueriable modelqueriable)
	{
		super(modelqueriable.getTable());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #26  <Method Class ModelQueriable.getTable()>
	//    3    7:invokespecial   #29  <Method void BaseAsyncObject(Class)>
		modelQueriable = modelqueriable;
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:putfield        #31  <Field ModelQueriable modelQueriable>
	//    7   15:return          
	}

	public void execute()
	{
		executeTransaction(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction.Builder(modelQueriable)).queryResult(queryResultCallback).queryListResult(queryResultListCallback).querySingleResult(queryResultSingleCallback).build())));
	//    0    0:aload_0         
	//    1    1:new             #39  <Class com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field ModelQueriable modelQueriable>
	//    5    9:invokespecial   #41  <Method void com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder(ModelQueriable)>
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$QueryResultCallback queryResultCallback>
	//    8   16:invokevirtual   #47  <Method com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder.queryResult(com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$QueryResultCallback)>
	//    9   19:aload_0         
	//   10   20:getfield        #49  <Field com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$QueryResultListCallback queryResultListCallback>
	//   11   23:invokevirtual   #53  <Method com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder.queryListResult(com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$QueryResultListCallback)>
	//   12   26:aload_0         
	//   13   27:getfield        #55  <Field com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$QueryResultSingleCallback queryResultSingleCallback>
	//   14   30:invokevirtual   #59  <Method com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder.querySingleResult(com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$QueryResultSingleCallback)>
	//   15   33:invokevirtual   #63  <Method com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder.build()>
	//   16   36:invokevirtual   #67  <Method void executeTransaction(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   17   39:return          
	}

	public Class getTable()
	{
		return modelQueriable.getTable();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ModelQueriable modelQueriable>
	//    2    4:invokeinterface #26  <Method Class ModelQueriable.getTable()>
	//    3    9:areturn         
	}

	public AsyncQuery queryListResultCallback(com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction.QueryResultListCallback queryresultlistcallback)
	{
		queryResultListCallback = queryresultlistcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$QueryResultListCallback queryResultListCallback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AsyncQuery queryResultCallback(com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction.QueryResultCallback queryresultcallback)
	{
		queryResultCallback = queryresultcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$QueryResultCallback queryResultCallback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AsyncQuery querySingleResultCallback(com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction.QueryResultSingleCallback queryresultsinglecallback)
	{
		queryResultSingleCallback = queryresultsinglecallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$QueryResultSingleCallback queryResultSingleCallback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private final ModelQueriable modelQueriable;
	private com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction.QueryResultCallback queryResultCallback;
	private com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction.QueryResultListCallback queryResultListCallback;
	private com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction.QueryResultSingleCallback queryResultSingleCallback;
}
