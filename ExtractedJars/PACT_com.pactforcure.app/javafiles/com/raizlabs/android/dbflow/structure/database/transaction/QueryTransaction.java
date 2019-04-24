// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import android.os.Handler;
import com.raizlabs.android.dbflow.sql.language.CursorResult;
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			ITransaction, Transaction

public class QueryTransaction
	implements ITransaction
{
	public static final class Builder
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

		public Builder queryListResult(QueryResultListCallback queryresultlistcallback)
		{
			queryResultListCallback = queryresultlistcallback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field QueryTransaction$QueryResultListCallback queryResultListCallback>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder queryResult(QueryResultCallback queryresultcallback)
		{
			queryResultCallback = queryresultcallback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field QueryTransaction$QueryResultCallback queryResultCallback>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder querySingleResult(QueryResultSingleCallback queryresultsinglecallback)
		{
			queryResultSingleCallback = queryresultsinglecallback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field QueryTransaction$QueryResultSingleCallback queryResultSingleCallback>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder runResultCallbacksOnSameThread(boolean flag)
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
		QueryResultCallback queryResultCallback;
		QueryResultListCallback queryResultListCallback;
		QueryResultSingleCallback queryResultSingleCallback;
		boolean runResultCallbacksOnSameThread;

		public Builder(ModelQueriable modelqueriable)
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

	public static interface QueryResultCallback
	{

		public abstract void onQueryResult(QueryTransaction querytransaction, CursorResult cursorresult);
	}

	public static interface QueryResultListCallback
	{

		public abstract void onListQueryResult(QueryTransaction querytransaction, List list);
	}

	public static interface QueryResultSingleCallback
	{

		public abstract void onSingleQueryResult(QueryTransaction querytransaction, Object obj);
	}


	QueryTransaction(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		modelQueriable = builder.modelQueriable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #46  <Field ModelQueriable QueryTransaction$Builder.modelQueriable>
	//    5    9:putfield        #47  <Field ModelQueriable modelQueriable>
		queryResultCallback = builder.queryResultCallback;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #49  <Field QueryTransaction$QueryResultCallback QueryTransaction$Builder.queryResultCallback>
	//    9   17:putfield        #50  <Field QueryTransaction$QueryResultCallback queryResultCallback>
		queryResultListCallback = builder.queryResultListCallback;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #52  <Field QueryTransaction$QueryResultListCallback QueryTransaction$Builder.queryResultListCallback>
	//   13   25:putfield        #53  <Field QueryTransaction$QueryResultListCallback queryResultListCallback>
		queryResultSingleCallback = builder.queryResultSingleCallback;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #55  <Field QueryTransaction$QueryResultSingleCallback QueryTransaction$Builder.queryResultSingleCallback>
	//   17   33:putfield        #56  <Field QueryTransaction$QueryResultSingleCallback queryResultSingleCallback>
		runResultCallbacksOnSameThread = builder.runResultCallbacksOnSameThread;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #58  <Field boolean QueryTransaction$Builder.runResultCallbacksOnSameThread>
	//   21   41:putfield        #59  <Field boolean runResultCallbacksOnSameThread>
	//   22   44:return          
	}

	public void execute(final DatabaseWrapper cursorResult)
	{
label0:
		{
			cursorResult = ((DatabaseWrapper) (modelQueriable.queryResults()));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ModelQueriable modelQueriable>
	//    2    4:invokeinterface #70  <Method CursorResult ModelQueriable.queryResults()>
	//    3    9:astore_1        
			if(queryResultCallback != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #50  <Field QueryTransaction$QueryResultCallback queryResultCallback>
	//*   6   14:ifnull          35
				if(runResultCallbacksOnSameThread)
	//*   7   17:aload_0         
	//*   8   18:getfield        #59  <Field boolean runResultCallbacksOnSameThread>
	//*   9   21:ifeq            96
					queryResultCallback.onQueryResult(this, ((CursorResult) (cursorResult)));
	//   10   24:aload_0         
	//   11   25:getfield        #50  <Field QueryTransaction$QueryResultCallback queryResultCallback>
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:invokeinterface #74  <Method void QueryTransaction$QueryResultCallback.onQueryResult(QueryTransaction, CursorResult)>
				else
	//*  15   35:aload_0         
	//*  16   36:getfield        #53  <Field QueryTransaction$QueryResultListCallback queryResultListCallback>
	//*  17   39:ifnull          65
	//*  18   42:aload_1         
	//*  19   43:invokevirtual   #80  <Method List CursorResult.toListClose()>
	//*  20   46:astore_2        
	//*  21   47:aload_0         
	//*  22   48:getfield        #59  <Field boolean runResultCallbacksOnSameThread>
	//*  23   51:ifeq            115
	//*  24   54:aload_0         
	//*  25   55:getfield        #53  <Field QueryTransaction$QueryResultListCallback queryResultListCallback>
	//*  26   58:aload_0         
	//*  27   59:aload_2         
	//*  28   60:invokeinterface #84  <Method void QueryTransaction$QueryResultListCallback.onListQueryResult(QueryTransaction, List)>
	//*  29   65:aload_0         
	//*  30   66:getfield        #56  <Field QueryTransaction$QueryResultSingleCallback queryResultSingleCallback>
	//*  31   69:ifnull          95
	//*  32   72:aload_1         
	//*  33   73:invokevirtual   #88  <Method Object CursorResult.toModelClose()>
	//*  34   76:astore_1        
	//*  35   77:aload_0         
	//*  36   78:getfield        #59  <Field boolean runResultCallbacksOnSameThread>
	//*  37   81:ifeq            134
	//*  38   84:aload_0         
	//*  39   85:getfield        #56  <Field QueryTransaction$QueryResultSingleCallback queryResultSingleCallback>
	//*  40   88:aload_0         
	//*  41   89:aload_1         
	//*  42   90:invokeinterface #92  <Method void QueryTransaction$QueryResultSingleCallback.onSingleQueryResult(QueryTransaction, Object)>
	//*  43   95:return          
					Transaction.getTransactionHandler().post(new Runnable() {

						public void run()
						{
							queryResultCallback.onQueryResult(QueryTransaction.this, cursorResult);
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

			
			{
				this$0 = QueryTransaction.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field QueryTransaction this$0>
				cursorResult = cursorresult;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CursorResult val$cursorResult>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
);
	//   44   96:invokestatic    #98  <Method Handler Transaction.getTransactionHandler()>
	//   45   99:new             #9   <Class QueryTransaction$1>
	//   46  102:dup             
	//   47  103:aload_0         
	//   48  104:aload_1         
	//   49  105:invokespecial   #100 <Method void QueryTransaction$1(QueryTransaction, CursorResult)>
	//   50  108:invokevirtual   #106 <Method boolean Handler.post(Runnable)>
	//   51  111:pop             
			if(queryResultListCallback != null)
			{
				final List resultList = ((CursorResult) (cursorResult)).toListClose();
				if(runResultCallbacksOnSameThread)
					queryResultListCallback.onListQueryResult(this, resultList);
				else
	//*  52  112:goto            35
					Transaction.getTransactionHandler().post(new Runnable() {

						public void run()
						{
							queryResultListCallback.onListQueryResult(QueryTransaction.this, resultList);
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

			
			{
				this$0 = QueryTransaction.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field QueryTransaction this$0>
				resultList = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field List val$resultList>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
);
	//   53  115:invokestatic    #98  <Method Handler Transaction.getTransactionHandler()>
	//   54  118:new             #11  <Class QueryTransaction$2>
	//   55  121:dup             
	//   56  122:aload_0         
	//   57  123:aload_2         
	//   58  124:invokespecial   #108 <Method void QueryTransaction$2(QueryTransaction, List)>
	//   59  127:invokevirtual   #106 <Method boolean Handler.post(Runnable)>
	//   60  130:pop             
			}
			if(queryResultSingleCallback != null)
			{
				cursorResult = ((DatabaseWrapper) (((CursorResult) (cursorResult)).toModelClose()));
				if(!runResultCallbacksOnSameThread)
					break label0;
				queryResultSingleCallback.onSingleQueryResult(this, ((Object) (cursorResult)));
			}
			return;
		}
	//*  61  131:goto            65
		Transaction.getTransactionHandler().post(new Runnable() {

			public void run()
			{
				queryResultSingleCallback.onSingleQueryResult(QueryTransaction.this, result);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field QueryTransaction this$0>
			//    2    4:getfield        #30  <Field QueryTransaction$QueryResultSingleCallback QueryTransaction.queryResultSingleCallback>
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field QueryTransaction this$0>
			//    5   11:aload_0         
			//    6   12:getfield        #21  <Field Object val$result>
			//    7   15:invokeinterface #35  <Method void QueryTransaction$QueryResultSingleCallback.onSingleQueryResult(QueryTransaction, Object)>
			//    8   20:return          
			}

			final QueryTransaction this$0;
			final Object val$result;

			
			{
				this$0 = QueryTransaction.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field QueryTransaction this$0>
				result = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Object val$result>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   62  134:invokestatic    #98  <Method Handler Transaction.getTransactionHandler()>
	//   63  137:new             #13  <Class QueryTransaction$3>
	//   64  140:dup             
	//   65  141:aload_0         
	//   66  142:aload_1         
	//   67  143:invokespecial   #110 <Method void QueryTransaction$3(QueryTransaction, Object)>
	//   68  146:invokevirtual   #106 <Method boolean Handler.post(Runnable)>
	//   69  149:pop             
	//   70  150:return          
	}

	final ModelQueriable modelQueriable;
	final QueryResultCallback queryResultCallback;
	final QueryResultListCallback queryResultListCallback;
	final QueryResultSingleCallback queryResultSingleCallback;
	final boolean runResultCallbacksOnSameThread;
}
