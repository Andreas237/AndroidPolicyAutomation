// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			QueryTransaction

public static final class QueryTransaction$Builder
{

	public QueryTransaction build()
	{
		return new QueryTransaction(this);
	//    0    0:new             #7   <Class QueryTransaction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void QueryTransaction(QueryTransaction$Builder)>
	//    4    8:areturn         
	}

	public QueryTransaction$Builder queryListResult(ultListCallback ultlistcallback)
	{
		queryResultListCallback = ultlistcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field QueryTransaction$QueryResultListCallback queryResultListCallback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public QueryTransaction$Builder queryResult(ultCallback ultcallback)
	{
		queryResultCallback = ultcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field QueryTransaction$QueryResultCallback queryResultCallback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public QueryTransaction$Builder querySingleResult(ultSingleCallback ultsinglecallback)
	{
		queryResultSingleCallback = ultsinglecallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field QueryTransaction$QueryResultSingleCallback queryResultSingleCallback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public QueryTransaction$Builder runResultCallbacksOnSameThread(boolean flag)
	{
		runResultCallbacksOnSameThread = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean runResultCallbacksOnSameThread>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	final ModelQueriable modelQueriable;
	ultCallback queryResultCallback;
	ultListCallback queryResultListCallback;
	ultSingleCallback queryResultSingleCallback;
	boolean runResultCallbacksOnSameThread;

	public QueryTransaction$Builder(ModelQueriable modelqueriable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		modelQueriable = modelqueriable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field ModelQueriable modelQueriable>
	//    5    9:return          
	}
}
