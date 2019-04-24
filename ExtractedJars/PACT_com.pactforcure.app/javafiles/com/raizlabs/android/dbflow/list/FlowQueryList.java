// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.list;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.runtime.FlowContentObserver;
import com.raizlabs.android.dbflow.sql.language.Delete;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;
import com.raizlabs.android.dbflow.structure.InstanceAdapter;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.cache.ModelCache;
import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;
import java.io.Closeable;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.list:
//			IFlowCursorIterator, FlowCursorList, FlowCursorIterator

public class FlowQueryList extends FlowContentObserver
	implements List, Closeable, IFlowCursorIterator
{
	public static class Builder
	{

		public FlowQueryList build()
		{
			return new FlowQueryList(this);
		//    0    0:new             #7   <Class FlowQueryList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #120 <Method void FlowQueryList(FlowQueryList$Builder, FlowQueryList$1)>
		//    5    9:areturn         
		}

		public Builder cacheModels(boolean flag)
		{
			cacheModels = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #36  <Field boolean cacheModels>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder cacheSize(int i)
		{
			cacheSize = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #57  <Field int cacheSize>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder changeInTransaction(boolean flag)
		{
			changeInTransaction = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #96  <Field boolean changeInTransaction>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder cursor(Cursor cursor1)
		{
			cursor = cursor1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #48  <Field Cursor cursor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error error1)
		{
			error = error1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #104 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error error>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder modelCache(ModelCache modelcache)
		{
			modelCache = modelcache;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #67  <Field ModelCache modelCache>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder modelQueriable(ModelQueriable modelqueriable)
		{
			modelQueriable = modelqueriable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #62  <Field ModelQueriable modelQueriable>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success success1)
		{
			success = success1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #100 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success success>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder transact(boolean flag)
		{
			transact = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #93  <Field boolean transact>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean cacheModels;
		private int cacheSize;
		private boolean changeInTransaction;
		private Cursor cursor;
		private com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error error;
		private ModelCache modelCache;
		private ModelQueriable modelQueriable;
		private com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success success;
		private final Class table;
		private boolean transact;


/*
		static boolean access$000(Builder builder)
		{
			return builder.transact;
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field boolean transact>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$100(Builder builder)
		{
			return builder.changeInTransaction;
		//    0    0:aload_0         
		//    1    1:getfield        #96  <Field boolean changeInTransaction>
		//    2    4:ireturn         
		}

*/


/*
		static com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success access$200(Builder builder)
		{
			return builder.success;
		//    0    0:aload_0         
		//    1    1:getfield        #100 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success success>
		//    2    4:areturn         
		}

*/


/*
		static com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error access$300(Builder builder)
		{
			return builder.error;
		//    0    0:aload_0         
		//    1    1:getfield        #104 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error error>
		//    2    4:areturn         
		}

*/


/*
		static ModelCache access$400(Builder builder)
		{
			return builder.modelCache;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field ModelCache modelCache>
		//    2    4:areturn         
		}

*/


/*
		static ModelQueriable access$500(Builder builder)
		{
			return builder.modelQueriable;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field ModelQueriable modelQueriable>
		//    2    4:areturn         
		}

*/


/*
		static int access$600(Builder builder)
		{
			return builder.cacheSize;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field int cacheSize>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$700(Builder builder)
		{
			return builder.cacheModels;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field boolean cacheModels>
		//    2    4:ireturn         
		}

*/


/*
		static Cursor access$800(Builder builder)
		{
			return builder.cursor;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field Cursor cursor>
		//    2    4:areturn         
		}

*/


/*
		static Class access$900(Builder builder)
		{
			return builder.table;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field Class table>
		//    2    4:areturn         
		}

*/

		private Builder(FlowCursorList flowcursorlist)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
			cacheModels = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #36  <Field boolean cacheModels>
			table = flowcursorlist.table();
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #41  <Method Class FlowCursorList.table()>
		//    8   14:putfield        #43  <Field Class table>
			cursor = flowcursorlist.cursor();
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:invokevirtual   #46  <Method Cursor FlowCursorList.cursor()>
		//   12   22:putfield        #48  <Field Cursor cursor>
			cacheModels = flowcursorlist.cachingEnabled();
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:invokevirtual   #52  <Method boolean FlowCursorList.cachingEnabled()>
		//   16   30:putfield        #36  <Field boolean cacheModels>
			cacheSize = flowcursorlist.cacheSize();
		//   17   33:aload_0         
		//   18   34:aload_1         
		//   19   35:invokevirtual   #55  <Method int FlowCursorList.cacheSize()>
		//   20   38:putfield        #57  <Field int cacheSize>
			modelQueriable = flowcursorlist.modelQueriable();
		//   21   41:aload_0         
		//   22   42:aload_1         
		//   23   43:invokevirtual   #60  <Method ModelQueriable FlowCursorList.modelQueriable()>
		//   24   46:putfield        #62  <Field ModelQueriable modelQueriable>
			modelCache = flowcursorlist.modelCache();
		//   25   49:aload_0         
		//   26   50:aload_1         
		//   27   51:invokevirtual   #65  <Method ModelCache FlowCursorList.modelCache()>
		//   28   54:putfield        #67  <Field ModelCache modelCache>
		//   29   57:return          
		}


		public Builder(ModelQueriable modelqueriable)
		{
			this(modelqueriable.getTable());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #80  <Method Class ModelQueriable.getTable()>
		//    3    7:invokespecial   #83  <Method void FlowQueryList$Builder(Class)>
			modelQueriable(modelqueriable);
		//    4   10:aload_0         
		//    5   11:aload_1         
		//    6   12:invokevirtual   #86  <Method FlowQueryList$Builder modelQueriable(ModelQueriable)>
		//    7   15:pop             
		//    8   16:return          
		}

		public Builder(Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
			cacheModels = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #36  <Field boolean cacheModels>
			table = class1;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #43  <Field Class table>
		//    8   14:return          
		}
	}


	private FlowQueryList(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void FlowContentObserver()>
		transact = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #70  <Field boolean transact>
		changeInTransaction = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #72  <Field boolean changeInTransaction>
		pendingRefresh = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #74  <Field boolean pendingRefresh>
		saveModel = new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel() {

			public void processModel(Object obj)
			{
				getModelAdapter().save(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FlowQueryList this$0>
			//    2    4:invokevirtual   #25  <Method ModelAdapter FlowQueryList.getModelAdapter()>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #30  <Method void ModelAdapter.save(Object)>
			//    5   11:return          
			}

			final FlowQueryList this$0;

			
			{
				this$0 = FlowQueryList.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field FlowQueryList this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   11   19:aload_0         
	//   12   20:new             #13  <Class FlowQueryList$1>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #77  <Method void FlowQueryList$1(FlowQueryList)>
	//   16   28:putfield        #79  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel saveModel>
		updateModel = new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel() {

			public void processModel(Object obj)
			{
				getModelAdapter().update(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FlowQueryList this$0>
			//    2    4:invokevirtual   #25  <Method ModelAdapter FlowQueryList.getModelAdapter()>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #30  <Method void ModelAdapter.update(Object)>
			//    5   11:return          
			}

			final FlowQueryList this$0;

			
			{
				this$0 = FlowQueryList.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field FlowQueryList this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   17   31:aload_0         
	//   18   32:new             #15  <Class FlowQueryList$2>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #80  <Method void FlowQueryList$2(FlowQueryList)>
	//   22   40:putfield        #82  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel updateModel>
		deleteModel = new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel() {

			public void processModel(Object obj)
			{
				getModelAdapter().delete(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FlowQueryList this$0>
			//    2    4:invokevirtual   #25  <Method ModelAdapter FlowQueryList.getModelAdapter()>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #30  <Method void ModelAdapter.delete(Object)>
			//    5   11:return          
			}

			final FlowQueryList this$0;

			
			{
				this$0 = FlowQueryList.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field FlowQueryList this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   23   43:aload_0         
	//   24   44:new             #17  <Class FlowQueryList$3>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:invokespecial   #83  <Method void FlowQueryList$3(FlowQueryList)>
	//   28   52:putfield        #85  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel deleteModel>
		internalErrorCallback = new com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error() {

			public void onError(Transaction transaction, Throwable throwable)
			{
				if(errorCallback != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field FlowQueryList this$0>
			//*   2    4:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error FlowQueryList.access$1100(FlowQueryList)>
			//*   3    7:ifnull          24
					errorCallback.onError(transaction, throwable);
			//    4   10:aload_0         
			//    5   11:getfield        #14  <Field FlowQueryList this$0>
			//    6   14:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error FlowQueryList.access$1100(FlowQueryList)>
			//    7   17:aload_1         
			//    8   18:aload_2         
			//    9   19:invokeinterface #26  <Method void com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error.onError(Transaction, Throwable)>
			//   10   24:return          
			}

			final FlowQueryList this$0;

			
			{
				this$0 = FlowQueryList.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field FlowQueryList this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   29   55:aload_0         
	//   30   56:new             #19  <Class FlowQueryList$4>
	//   31   59:dup             
	//   32   60:aload_0         
	//   33   61:invokespecial   #86  <Method void FlowQueryList$4(FlowQueryList)>
	//   34   64:putfield        #88  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error internalErrorCallback>
		internalSuccessCallback = new com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success() ;
	//   35   67:aload_0         
	//   36   68:new             #21  <Class FlowQueryList$5>
	//   37   71:dup             
	//   38   72:aload_0         
	//   39   73:invokespecial   #89  <Method void FlowQueryList$5(FlowQueryList)>
	//   40   76:putfield        #91  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success internalSuccessCallback>
		refreshRunnable = new Runnable() {

			public void run()
			{
				this;
			//    0    0:aload_0         
				JVM INSTR monitorenter ;
			//    1    1:monitorenter    
				pendingRefresh = false;
			//    2    2:aload_0         
			//    3    3:getfield        #14  <Field FlowQueryList this$0>
			//    4    6:iconst_0        
			//    5    7:invokestatic    #23  <Method boolean FlowQueryList.access$1502(FlowQueryList, boolean)>
			//    6   10:pop             
				this;
			//    7   11:aload_0         
				JVM INSTR monitorexit ;
			//    8   12:monitorexit     
				refresh();
			//    9   13:aload_0         
			//   10   14:getfield        #14  <Field FlowQueryList this$0>
			//   11   17:invokevirtual   #26  <Method void FlowQueryList.refresh()>
				return;
			//   12   20:return          
				Exception exception;
				exception;
			//   13   21:astore_1        
				this;
			//   14   22:aload_0         
				JVM INSTR monitorexit ;
			//   15   23:monitorexit     
				throw exception;
			//   16   24:aload_1         
			//   17   25:athrow          
			}

			final FlowQueryList this$0;

			
			{
				this$0 = FlowQueryList.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field FlowQueryList this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   41   79:aload_0         
	//   42   80:new             #23  <Class FlowQueryList$6>
	//   43   83:dup             
	//   44   84:aload_0         
	//   45   85:invokespecial   #92  <Method void FlowQueryList$6(FlowQueryList)>
	//   46   88:putfield        #94  <Field Runnable refreshRunnable>
		transact = builder.transact;
	//   47   91:aload_0         
	//   48   92:aload_1         
	//   49   93:invokestatic    #98  <Method boolean FlowQueryList$Builder.access$000(FlowQueryList$Builder)>
	//   50   96:putfield        #70  <Field boolean transact>
		changeInTransaction = builder.changeInTransaction;
	//   51   99:aload_0         
	//   52  100:aload_1         
	//   53  101:invokestatic    #101 <Method boolean FlowQueryList$Builder.access$100(FlowQueryList$Builder)>
	//   54  104:putfield        #72  <Field boolean changeInTransaction>
		successCallback = builder.success;
	//   55  107:aload_0         
	//   56  108:aload_1         
	//   57  109:invokestatic    #105 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success FlowQueryList$Builder.access$200(FlowQueryList$Builder)>
	//   58  112:putfield        #107 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success successCallback>
		errorCallback = builder.error;
	//   59  115:aload_0         
	//   60  116:aload_1         
	//   61  117:invokestatic    #111 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error FlowQueryList$Builder.access$300(FlowQueryList$Builder)>
	//   62  120:putfield        #113 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error errorCallback>
		internalCursorList = (new Builder(builder.table)).cursor(builder.cursor).cacheModels(builder.cacheModels).cacheSize(builder.cacheSize).modelQueriable(builder.modelQueriable).modelCache(builder.modelCache).build();
	//   63  123:aload_0         
	//   64  124:new             #115 <Class FlowCursorList$Builder>
	//   65  127:dup             
	//   66  128:aload_1         
	//   67  129:invokestatic    #119 <Method Class FlowQueryList$Builder.access$900(FlowQueryList$Builder)>
	//   68  132:invokespecial   #122 <Method void FlowCursorList$Builder(Class)>
	//   69  135:aload_1         
	//   70  136:invokestatic    #126 <Method Cursor FlowQueryList$Builder.access$800(FlowQueryList$Builder)>
	//   71  139:invokevirtual   #130 <Method FlowCursorList$Builder FlowCursorList$Builder.cursor(Cursor)>
	//   72  142:aload_1         
	//   73  143:invokestatic    #133 <Method boolean FlowQueryList$Builder.access$700(FlowQueryList$Builder)>
	//   74  146:invokevirtual   #137 <Method FlowCursorList$Builder FlowCursorList$Builder.cacheModels(boolean)>
	//   75  149:aload_1         
	//   76  150:invokestatic    #141 <Method int FlowQueryList$Builder.access$600(FlowQueryList$Builder)>
	//   77  153:invokevirtual   #145 <Method FlowCursorList$Builder FlowCursorList$Builder.cacheSize(int)>
	//   78  156:aload_1         
	//   79  157:invokestatic    #149 <Method ModelQueriable FlowQueryList$Builder.access$500(FlowQueryList$Builder)>
	//   80  160:invokevirtual   #153 <Method FlowCursorList$Builder FlowCursorList$Builder.modelQueriable(ModelQueriable)>
	//   81  163:aload_1         
	//   82  164:invokestatic    #157 <Method ModelCache FlowQueryList$Builder.access$400(FlowQueryList$Builder)>
	//   83  167:invokevirtual   #161 <Method FlowCursorList$Builder FlowCursorList$Builder.modelCache(ModelCache)>
	//   84  170:invokevirtual   #165 <Method FlowCursorList FlowCursorList$Builder.build()>
	//   85  173:putfield        #167 <Field FlowCursorList internalCursorList>
	//   86  176:return          
	}


	public void add(int i, Object obj)
	{
		add(obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #189 <Method boolean add(Object)>
	//    3    5:pop             
	//    4    6:return          
	}

	public boolean add(Object obj)
	{
		obj = ((Object) (FlowManager.getDatabaseForTable(internalCursorList.table()).beginTransactionAsync(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new Builder(saveModel)).add(obj).build()))).error(internalErrorCallback).success(internalSuccessCallback).build()));
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//    3    7:invokestatic    #202 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4   10:new             #204 <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #79  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel saveModel>
	//    8   18:invokespecial   #207 <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #210 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.add(Object)>
	//   11   25:invokevirtual   #213 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   12   28:invokevirtual   #219 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   13   31:aload_0         
	//   14   32:getfield        #88  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error internalErrorCallback>
	//   15   35:invokevirtual   #225 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   16   38:aload_0         
	//   17   39:getfield        #91  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success internalSuccessCallback>
	//   18   42:invokevirtual   #229 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//   19   45:invokevirtual   #232 <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   20   48:astore_1        
		if(transact)
	//*  21   49:aload_0         
	//*  22   50:getfield        #70  <Field boolean transact>
	//*  23   53:ifeq            62
			((Transaction) (obj)).execute();
	//   24   56:aload_1         
	//   25   57:invokevirtual   #237 <Method void Transaction.execute()>
		else
	//*  26   60:iconst_1        
	//*  27   61:ireturn         
			((Transaction) (obj)).executeSync();
	//   28   62:aload_1         
	//   29   63:invokevirtual   #240 <Method void Transaction.executeSync()>
		return true;
	//*  30   66:goto            60
	}

	public boolean addAll(int i, Collection collection)
	{
		return addAll(collection);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #246 <Method boolean addAll(Collection)>
	//    3    5:ireturn         
	}

	public boolean addAll(Collection collection)
	{
		collection = ((Collection) (FlowManager.getDatabaseForTable(internalCursorList.table()).beginTransactionAsync(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new Builder(saveModel)).addAll(collection).build()))).error(internalErrorCallback).success(internalSuccessCallback).build()));
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//    3    7:invokestatic    #202 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4   10:new             #204 <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #79  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel saveModel>
	//    8   18:invokespecial   #207 <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #250 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.addAll(Collection)>
	//   11   25:invokevirtual   #213 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   12   28:invokevirtual   #219 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   13   31:aload_0         
	//   14   32:getfield        #88  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error internalErrorCallback>
	//   15   35:invokevirtual   #225 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   16   38:aload_0         
	//   17   39:getfield        #91  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success internalSuccessCallback>
	//   18   42:invokevirtual   #229 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//   19   45:invokevirtual   #232 <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   20   48:astore_1        
		if(transact)
	//*  21   49:aload_0         
	//*  22   50:getfield        #70  <Field boolean transact>
	//*  23   53:ifeq            62
			((Transaction) (collection)).execute();
	//   24   56:aload_1         
	//   25   57:invokevirtual   #237 <Method void Transaction.execute()>
		else
	//*  26   60:iconst_1        
	//*  27   61:ireturn         
			((Transaction) (collection)).executeSync();
	//   28   62:aload_1         
	//   29   63:invokevirtual   #240 <Method void Transaction.executeSync()>
		return true;
	//*  30   66:goto            60
	}

	public void addOnCursorRefreshListener(FlowCursorList.OnCursorRefreshListener oncursorrefreshlistener)
	{
		internalCursorList.addOnCursorRefreshListener(oncursorrefreshlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #255 <Method void FlowCursorList.addOnCursorRefreshListener(FlowCursorList$OnCursorRefreshListener)>
	//    4    8:return          
	}

	public boolean changeInTransaction()
	{
		return changeInTransaction;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean changeInTransaction>
	//    2    4:ireturn         
	}

	public void clear()
	{
		Transaction transaction = FlowManager.getDatabaseForTable(internalCursorList.table()).beginTransactionAsync(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new Builder(((ModelQueriable) (SQLite.delete().from(internalCursorList.table()))))).build()))).error(internalErrorCallback).success(internalSuccessCallback).build();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//    3    7:invokestatic    #202 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4   10:new             #260 <Class com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder>
	//    5   13:dup             
	//    6   14:invokestatic    #266 <Method Delete SQLite.delete()>
	//    7   17:aload_0         
	//    8   18:getfield        #167 <Field FlowCursorList internalCursorList>
	//    9   21:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//   10   24:invokevirtual   #272 <Method com.raizlabs.android.dbflow.sql.language.From Delete.from(Class)>
	//   11   27:invokespecial   #275 <Method void com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder(ModelQueriable)>
	//   12   30:invokevirtual   #278 <Method com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction com.raizlabs.android.dbflow.structure.database.transaction.QueryTransaction$Builder.build()>
	//   13   33:invokevirtual   #219 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   14   36:aload_0         
	//   15   37:getfield        #88  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error internalErrorCallback>
	//   16   40:invokevirtual   #225 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   17   43:aload_0         
	//   18   44:getfield        #91  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success internalSuccessCallback>
	//   19   47:invokevirtual   #229 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//   20   50:invokevirtual   #232 <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   21   53:astore_1        
		if(transact)
	//*  22   54:aload_0         
	//*  23   55:getfield        #70  <Field boolean transact>
	//*  24   58:ifeq            66
		{
			transaction.execute();
	//   25   61:aload_1         
	//   26   62:invokevirtual   #237 <Method void Transaction.execute()>
			return;
	//   27   65:return          
		} else
		{
			transaction.executeSync();
	//   28   66:aload_1         
	//   29   67:invokevirtual   #240 <Method void Transaction.executeSync()>
			return;
	//   30   70:return          
		}
	}

	public void close()
		throws IOException
	{
		internalCursorList.close();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #283 <Method void FlowCursorList.close()>
	//    3    7:return          
	}

	public boolean contains(Object obj)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(internalCursorList.table().isAssignableFrom(obj.getClass()))
	//*   2    2:aload_0         
	//*   3    3:getfield        #167 <Field FlowCursorList internalCursorList>
	//*   4    6:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #290 <Method Class Object.getClass()>
	//*   7   13:invokevirtual   #296 <Method boolean Class.isAssignableFrom(Class)>
	//*   8   16:ifeq            31
			flag = internalCursorList.getInstanceAdapter().exists(obj);
	//    9   19:aload_0         
	//   10   20:getfield        #167 <Field FlowCursorList internalCursorList>
	//   11   23:invokevirtual   #300 <Method InstanceAdapter FlowCursorList.getInstanceAdapter()>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #305 <Method boolean InstanceAdapter.exists(Object)>
	//   14   30:istore_2        
		return flag;
	//   15   31:iload_2         
	//   16   32:ireturn         
	}

	public boolean containsAll(Collection collection)
	{
label0:
		{
			boolean flag;
			boolean flag1;
			if(!collection.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #312 <Method boolean Collection.isEmpty()>
	//*   2    6:ifne            52
				flag = true;
	//    3    9:iconst_1        
	//    4   10:istore_2        
			else
	//*   5   11:iload_2         
	//*   6   12:istore_3        
	//*   7   13:iload_2         
	//*   8   14:ifeq            50
	//*   9   17:aload_1         
	//*  10   18:invokeinterface #316 <Method Iterator Collection.iterator()>
	//*  11   23:astore_1        
	//*  12   24:iload_2         
	//*  13   25:istore_3        
	//*  14   26:aload_1         
	//*  15   27:invokeinterface #321 <Method boolean Iterator.hasNext()>
	//*  16   32:ifeq            50
	//*  17   35:aload_0         
	//*  18   36:aload_1         
	//*  19   37:invokeinterface #325 <Method Object Iterator.next()>
	//*  20   42:invokevirtual   #327 <Method boolean contains(Object)>
	//*  21   45:ifne            24
	//*  22   48:iconst_0        
	//*  23   49:istore_3        
	//*  24   50:iload_3         
	//*  25   51:ireturn         
				flag = false;
	//   26   52:iconst_0        
	//   27   53:istore_2        
			flag1 = flag;
			if(!flag)
				break label0;
			collection = ((Collection) (collection.iterator()));
			do
			{
				flag1 = flag;
				if(!((Iterator) (collection)).hasNext())
					break label0;
			} while(contains(((Iterator) (collection)).next()));
			flag1 = false;
		}
		return flag1;
	//*  28   54:goto            11
	}

	public Cursor cursor()
	{
		return internalCursorList.cursor();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #332 <Method Cursor FlowCursorList.cursor()>
	//    3    7:areturn         
	}

	public FlowCursorList cursorList()
	{
		return internalCursorList;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:areturn         
	}

	public void endTransactionAndNotify()
	{
		if(changeInTransaction)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean changeInTransaction>
	//*   2    4:ifeq            16
		{
			changeInTransaction = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #72  <Field boolean changeInTransaction>
			refresh();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #338 <Method void refresh()>
		}
		((FlowContentObserver)this).endTransactionAndNotify();
	//    8   16:aload_0         
	//    9   17:invokespecial   #340 <Method void FlowContentObserver.endTransactionAndNotify()>
	//   10   20:return          
	}

	public com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error error()
	{
		return errorCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error errorCallback>
	//    2    4:areturn         
	}

	public Object get(int i)
	{
		return internalCursorList.getItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #347 <Method Object FlowCursorList.getItem(long)>
	//    5    9:areturn         
	}

	public List getCopy()
	{
		return internalCursorList.getAll();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #353 <Method List FlowCursorList.getAll()>
	//    3    7:areturn         
	}

	public int getCount()
	{
		return internalCursorList.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #358 <Method int FlowCursorList.getCount()>
	//    3    7:ireturn         
	}

	InstanceAdapter getInstanceAdapter()
	{
		return internalCursorList.getInstanceAdapter();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #300 <Method InstanceAdapter FlowCursorList.getInstanceAdapter()>
	//    3    7:areturn         
	}

	public Object getItem(long l)
	{
		return internalCursorList.getItem(l);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #347 <Method Object FlowCursorList.getItem(long)>
	//    4    8:areturn         
	}

	ModelAdapter getModelAdapter()
	{
		return internalCursorList.getModelAdapter();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #364 <Method ModelAdapter FlowCursorList.getModelAdapter()>
	//    3    7:areturn         
	}

	public int indexOf(Object obj)
	{
		throw new UnsupportedOperationException("We cannot determine which index in the table this item exists at efficiently");
	//    0    0:new             #369 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #371 <String "We cannot determine which index in the table this item exists at efficiently">
	//    3    7:invokespecial   #374 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public boolean isEmpty()
	{
		return internalCursorList.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #375 <Method boolean FlowCursorList.isEmpty()>
	//    3    7:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new FlowCursorIterator(((IFlowCursorIterator) (this)))));
	//    0    0:new             #377 <Class FlowCursorIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #380 <Method void FlowCursorIterator(IFlowCursorIterator)>
	//    4    8:areturn         
	}

	public int lastIndexOf(Object obj)
	{
		throw new UnsupportedOperationException("We cannot determine which index in the table this item exists at efficiently");
	//    0    0:new             #369 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #371 <String "We cannot determine which index in the table this item exists at efficiently">
	//    3    7:invokespecial   #374 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public ListIterator listIterator()
	{
		return ((ListIterator) (new FlowCursorIterator(((IFlowCursorIterator) (this)))));
	//    0    0:new             #377 <Class FlowCursorIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #380 <Method void FlowCursorIterator(IFlowCursorIterator)>
	//    4    8:areturn         
	}

	public ListIterator listIterator(int i)
	{
		return ((ListIterator) (new FlowCursorIterator(((IFlowCursorIterator) (this)), i)));
	//    0    0:new             #377 <Class FlowCursorIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #390 <Method void FlowCursorIterator(IFlowCursorIterator, int)>
	//    5    9:areturn         
	}

	public Builder newBuilder()
	{
		return (new Builder(internalCursorList)).success(successCallback).error(errorCallback).changeInTransaction(changeInTransaction).transact(transact);
	//    0    0:new             #25  <Class FlowQueryList$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #167 <Field FlowCursorList internalCursorList>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #396 <Method void FlowQueryList$Builder(FlowCursorList, FlowQueryList$1)>
	//    6   12:aload_0         
	//    7   13:getfield        #107 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success successCallback>
	//    8   16:invokevirtual   #399 <Method FlowQueryList$Builder FlowQueryList$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//    9   19:aload_0         
	//   10   20:getfield        #113 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error errorCallback>
	//   11   23:invokevirtual   #402 <Method FlowQueryList$Builder FlowQueryList$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   12   26:aload_0         
	//   13   27:getfield        #72  <Field boolean changeInTransaction>
	//   14   30:invokevirtual   #405 <Method FlowQueryList$Builder FlowQueryList$Builder.changeInTransaction(boolean)>
	//   15   33:aload_0         
	//   16   34:getfield        #70  <Field boolean transact>
	//   17   37:invokevirtual   #407 <Method FlowQueryList$Builder FlowQueryList$Builder.transact(boolean)>
	//   18   40:areturn         
	}

	public void onChange(boolean flag)
	{
		((FlowContentObserver)this).onChange(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #412 <Method void FlowContentObserver.onChange(boolean)>
		if(!isInTransaction)
	//*   3    5:aload_0         
	//*   4    6:getfield        #179 <Field boolean isInTransaction>
	//*   5    9:ifne            17
		{
			refreshAsync();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #415 <Method void refreshAsync()>
			return;
	//    8   16:return          
		} else
		{
			changeInTransaction = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #72  <Field boolean changeInTransaction>
			return;
	//   12   22:return          
		}
	}

	public void onChange(boolean flag, Uri uri)
	{
		((FlowContentObserver)this).onChange(flag, uri);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #421 <Method void FlowContentObserver.onChange(boolean, Uri)>
		if(!isInTransaction)
	//*   4    6:aload_0         
	//*   5    7:getfield        #179 <Field boolean isInTransaction>
	//*   6   10:ifne            18
		{
			refreshAsync();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #415 <Method void refreshAsync()>
			return;
	//    9   17:return          
		} else
		{
			changeInTransaction = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #72  <Field boolean changeInTransaction>
			return;
	//   13   23:return          
		}
	}

	public void refresh()
	{
		internalCursorList.refresh();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #422 <Method void FlowCursorList.refresh()>
	//    3    7:return          
	}

	public void refreshAsync()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!pendingRefresh)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #74  <Field boolean pendingRefresh>
	//    4    6:ifeq            12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		pendingRefresh = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #74  <Field boolean pendingRefresh>
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		REFRESH_HANDLER.post(refreshRunnable);
	//   13   19:getstatic       #64  <Field Handler REFRESH_HANDLER>
	//   14   22:aload_0         
	//   15   23:getfield        #94  <Field Runnable refreshRunnable>
	//   16   26:invokevirtual   #426 <Method boolean Handler.post(Runnable)>
	//   17   29:pop             
		return;
	//   18   30:return          
		Exception exception;
		exception;
	//   19   31:astore_1        
		this;
	//   20   32:aload_0         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		throw exception;
	//   22   34:aload_1         
	//   23   35:athrow          
	}

	public void registerForContentChanges(Context context)
	{
		((FlowContentObserver)this).registerForContentChanges(context, internalCursorList.table());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #167 <Field FlowCursorList internalCursorList>
	//    4    6:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//    5    9:invokespecial   #431 <Method void FlowContentObserver.registerForContentChanges(Context, Class)>
	//    6   12:return          
	}

	public void registerForContentChanges(Context context, Class class1)
	{
		throw new RuntimeException("This method is not to be used in the FlowQueryList. call registerForContentChanges(Context) instead");
	//    0    0:new             #433 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #435 <String "This method is not to be used in the FlowQueryList. call registerForContentChanges(Context) instead">
	//    3    7:invokespecial   #436 <Method void RuntimeException(String)>
	//    4   10:athrow          
	}

	public Object remove(int i)
	{
		Object obj = internalCursorList.getItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #347 <Method Object FlowCursorList.getItem(long)>
	//    5    9:astore_2        
		Transaction transaction = FlowManager.getDatabaseForTable(internalCursorList.table()).beginTransactionAsync(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new Builder(deleteModel)).add(obj).build()))).error(internalErrorCallback).success(internalSuccessCallback).build();
	//    6   10:aload_0         
	//    7   11:getfield        #167 <Field FlowCursorList internalCursorList>
	//    8   14:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//    9   17:invokestatic    #202 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//   10   20:new             #204 <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #85  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel deleteModel>
	//   14   28:invokespecial   #207 <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//   15   31:aload_2         
	//   16   32:invokevirtual   #210 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.add(Object)>
	//   17   35:invokevirtual   #213 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   18   38:invokevirtual   #219 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   19   41:aload_0         
	//   20   42:getfield        #88  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error internalErrorCallback>
	//   21   45:invokevirtual   #225 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   22   48:aload_0         
	//   23   49:getfield        #91  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success internalSuccessCallback>
	//   24   52:invokevirtual   #229 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//   25   55:invokevirtual   #232 <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   26   58:astore_3        
		if(transact)
	//*  27   59:aload_0         
	//*  28   60:getfield        #70  <Field boolean transact>
	//*  29   63:ifeq            72
		{
			transaction.execute();
	//   30   66:aload_3         
	//   31   67:invokevirtual   #237 <Method void Transaction.execute()>
			return obj;
	//   32   70:aload_2         
	//   33   71:areturn         
		} else
		{
			transaction.executeSync();
	//   34   72:aload_3         
	//   35   73:invokevirtual   #240 <Method void Transaction.executeSync()>
			return obj;
	//   36   76:aload_2         
	//   37   77:areturn         
		}
	}

	public boolean remove(Object obj)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(internalCursorList.table().isAssignableFrom(obj.getClass()))
	//*   2    2:aload_0         
	//*   3    3:getfield        #167 <Field FlowCursorList internalCursorList>
	//*   4    6:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #290 <Method Class Object.getClass()>
	//*   7   13:invokevirtual   #296 <Method boolean Class.isAssignableFrom(Class)>
	//*   8   16:ifeq            81
		{
			obj = ((Object) (FlowManager.getDatabaseForTable(internalCursorList.table()).beginTransactionAsync(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new Builder(deleteModel)).add(obj).build()))).error(internalErrorCallback).success(internalSuccessCallback).build()));
	//    9   19:aload_0         
	//   10   20:getfield        #167 <Field FlowCursorList internalCursorList>
	//   11   23:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//   12   26:invokestatic    #202 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//   13   29:new             #204 <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:getfield        #85  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel deleteModel>
	//   17   37:invokespecial   #207 <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #210 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.add(Object)>
	//   20   44:invokevirtual   #213 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   21   47:invokevirtual   #219 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   22   50:aload_0         
	//   23   51:getfield        #88  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error internalErrorCallback>
	//   24   54:invokevirtual   #225 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   25   57:aload_0         
	//   26   58:getfield        #91  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success internalSuccessCallback>
	//   27   61:invokevirtual   #229 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//   28   64:invokevirtual   #232 <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   29   67:astore_1        
			if(transact)
	//*  30   68:aload_0         
	//*  31   69:getfield        #70  <Field boolean transact>
	//*  32   72:ifeq            83
				((Transaction) (obj)).execute();
	//   33   75:aload_1         
	//   34   76:invokevirtual   #237 <Method void Transaction.execute()>
			else
	//*  35   79:iconst_1        
	//*  36   80:istore_2        
	//*  37   81:iload_2         
	//*  38   82:ireturn         
				((Transaction) (obj)).executeSync();
	//   39   83:aload_1         
	//   40   84:invokevirtual   #240 <Method void Transaction.executeSync()>
			flag = true;
		}
		return flag;
	//*  41   87:goto            79
	}

	public boolean removeAll(Collection collection)
	{
		collection = ((Collection) (FlowManager.getDatabaseForTable(internalCursorList.table()).beginTransactionAsync(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new Builder(deleteModel)).addAll(collection).build()))).error(internalErrorCallback).success(internalSuccessCallback).build()));
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//    3    7:invokestatic    #202 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4   10:new             #204 <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #85  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel deleteModel>
	//    8   18:invokespecial   #207 <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #250 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.addAll(Collection)>
	//   11   25:invokevirtual   #213 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   12   28:invokevirtual   #219 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   13   31:aload_0         
	//   14   32:getfield        #88  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error internalErrorCallback>
	//   15   35:invokevirtual   #225 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   16   38:aload_0         
	//   17   39:getfield        #91  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success internalSuccessCallback>
	//   18   42:invokevirtual   #229 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//   19   45:invokevirtual   #232 <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   20   48:astore_1        
		if(transact)
	//*  21   49:aload_0         
	//*  22   50:getfield        #70  <Field boolean transact>
	//*  23   53:ifeq            62
			((Transaction) (collection)).execute();
	//   24   56:aload_1         
	//   25   57:invokevirtual   #237 <Method void Transaction.execute()>
		else
	//*  26   60:iconst_1        
	//*  27   61:ireturn         
			((Transaction) (collection)).executeSync();
	//   28   62:aload_1         
	//   29   63:invokevirtual   #240 <Method void Transaction.executeSync()>
		return true;
	//*  30   66:goto            60
	}

	public void removeOnCursorRefreshListener(FlowCursorList.OnCursorRefreshListener oncursorrefreshlistener)
	{
		internalCursorList.removeOnCursorRefreshListener(oncursorrefreshlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #442 <Method void FlowCursorList.removeOnCursorRefreshListener(FlowCursorList$OnCursorRefreshListener)>
	//    4    8:return          
	}

	public boolean retainAll(Collection collection)
	{
		List list = internalCursorList.getAll();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #353 <Method List FlowCursorList.getAll()>
	//    3    7:astore_2        
		list.removeAll(collection);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokeinterface #445 <Method boolean List.removeAll(Collection)>
	//    7   15:pop             
		collection = ((Collection) (FlowManager.getDatabaseForTable(internalCursorList.table()).beginTransactionAsync(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new Builder(((Collection) (list)), deleteModel)).build()))).error(internalErrorCallback).success(internalSuccessCallback).build()));
	//    8   16:aload_0         
	//    9   17:getfield        #167 <Field FlowCursorList internalCursorList>
	//   10   20:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//   11   23:invokestatic    #202 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//   12   26:new             #204 <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//   13   29:dup             
	//   14   30:aload_2         
	//   15   31:aload_0         
	//   16   32:getfield        #85  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel deleteModel>
	//   17   35:invokespecial   #448 <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(Collection, com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//   18   38:invokevirtual   #213 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   19   41:invokevirtual   #219 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   20   44:aload_0         
	//   21   45:getfield        #88  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error internalErrorCallback>
	//   22   48:invokevirtual   #225 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   23   51:aload_0         
	//   24   52:getfield        #91  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success internalSuccessCallback>
	//   25   55:invokevirtual   #229 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//   26   58:invokevirtual   #232 <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   27   61:astore_1        
		if(transact)
	//*  28   62:aload_0         
	//*  29   63:getfield        #70  <Field boolean transact>
	//*  30   66:ifeq            75
			((Transaction) (collection)).execute();
	//   31   69:aload_1         
	//   32   70:invokevirtual   #237 <Method void Transaction.execute()>
		else
	//*  33   73:iconst_1        
	//*  34   74:ireturn         
			((Transaction) (collection)).executeSync();
	//   35   75:aload_1         
	//   36   76:invokevirtual   #240 <Method void Transaction.executeSync()>
		return true;
	//*  37   79:goto            73
	}

	public Object set(int i, Object obj)
	{
		return set(obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #453 <Method Object set(Object)>
	//    3    5:areturn         
	}

	public Object set(Object obj)
	{
		Transaction transaction = FlowManager.getDatabaseForTable(internalCursorList.table()).beginTransactionAsync(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new Builder(updateModel)).add(obj).build()))).error(internalErrorCallback).success(internalSuccessCallback).build();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #196 <Method Class FlowCursorList.table()>
	//    3    7:invokestatic    #202 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4   10:new             #204 <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #82  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel updateModel>
	//    8   18:invokespecial   #207 <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #210 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.add(Object)>
	//   11   25:invokevirtual   #213 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   12   28:invokevirtual   #219 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   13   31:aload_0         
	//   14   32:getfield        #88  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error internalErrorCallback>
	//   15   35:invokevirtual   #225 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   16   38:aload_0         
	//   17   39:getfield        #91  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success internalSuccessCallback>
	//   18   42:invokevirtual   #229 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//   19   45:invokevirtual   #232 <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   20   48:astore_2        
		if(transact)
	//*  21   49:aload_0         
	//*  22   50:getfield        #70  <Field boolean transact>
	//*  23   53:ifeq            62
		{
			transaction.execute();
	//   24   56:aload_2         
	//   25   57:invokevirtual   #237 <Method void Transaction.execute()>
			return obj;
	//   26   60:aload_1         
	//   27   61:areturn         
		} else
		{
			transaction.executeSync();
	//   28   62:aload_2         
	//   29   63:invokevirtual   #240 <Method void Transaction.executeSync()>
			return obj;
	//   30   66:aload_1         
	//   31   67:areturn         
		}
	}

	public int size()
	{
		return internalCursorList.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #358 <Method int FlowCursorList.getCount()>
	//    3    7:ireturn         
	}

	public List subList(int i, int j)
	{
		return internalCursorList.getAll().subList(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #353 <Method List FlowCursorList.getAll()>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #460 <Method List List.subList(int, int)>
	//    6   14:areturn         
	}

	public com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success success()
	{
		return successCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success successCallback>
	//    2    4:areturn         
	}

	public Object[] toArray()
	{
		return internalCursorList.getAll().toArray();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #353 <Method List FlowCursorList.getAll()>
	//    3    7:invokeinterface #466 <Method Object[] List.toArray()>
	//    4   12:areturn         
	}

	public Object[] toArray(Object aobj[])
	{
		return internalCursorList.getAll().toArray(aobj);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FlowCursorList internalCursorList>
	//    2    4:invokevirtual   #353 <Method List FlowCursorList.getAll()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #469 <Method Object[] List.toArray(Object[])>
	//    5   13:areturn         
	}

	public boolean transact()
	{
		return transact;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean transact>
	//    2    4:ireturn         
	}

	private static final Handler REFRESH_HANDLER = new Handler(Looper.myLooper());
	private boolean changeInTransaction;
	private final com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel deleteModel;
	private com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error errorCallback;
	private FlowCursorList internalCursorList;
	private final com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error internalErrorCallback;
	private final com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success internalSuccessCallback;
	private boolean pendingRefresh;
	private final Runnable refreshRunnable;
	private final com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel saveModel;
	private com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success successCallback;
	private boolean transact;
	private final com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel updateModel;

	static 
	{
	//    0    0:new             #52  <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #58  <Method Looper Looper.myLooper()>
	//    3    7:invokespecial   #62  <Method void Handler(Looper)>
	//    4   10:putstatic       #64  <Field Handler REFRESH_HANDLER>
	//*   5   13:return          
	}


/*
	static com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error access$1100(FlowQueryList flowquerylist)
	{
		return flowquerylist.errorCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error errorCallback>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1200(FlowQueryList flowquerylist)
	{
		return flowquerylist.isInTransaction;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field boolean isInTransaction>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$1302(FlowQueryList flowquerylist, boolean flag)
	{
		flowquerylist.changeInTransaction = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field boolean changeInTransaction>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success access$1400(FlowQueryList flowquerylist)
	{
		return flowquerylist.successCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success successCallback>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1502(FlowQueryList flowquerylist, boolean flag)
	{
		flowquerylist.pendingRefresh = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field boolean pendingRefresh>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
