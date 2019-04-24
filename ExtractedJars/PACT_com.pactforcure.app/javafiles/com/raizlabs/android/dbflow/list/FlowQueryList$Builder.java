// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.list;

import android.database.Cursor;
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;
import com.raizlabs.android.dbflow.structure.cache.ModelCache;

// Referenced classes of package com.raizlabs.android.dbflow.list:
//			FlowQueryList, FlowCursorList

public static class FlowQueryList$Builder
{

	public FlowQueryList build()
	{
		return new FlowQueryList(this, ((FlowQueryList._cls1) (null)));
	//    0    0:new             #7   <Class FlowQueryList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #120 <Method void FlowQueryList(FlowQueryList$Builder, FlowQueryList$1)>
	//    5    9:areturn         
	}

	public FlowQueryList$Builder cacheModels(boolean flag)
	{
		cacheModels = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean cacheModels>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FlowQueryList$Builder cacheSize(int i)
	{
		cacheSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int cacheSize>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FlowQueryList$Builder changeInTransaction(boolean flag)
	{
		changeInTransaction = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #96  <Field boolean changeInTransaction>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FlowQueryList$Builder cursor(Cursor cursor1)
	{
		cursor = cursor1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field Cursor cursor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FlowQueryList$Builder error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error error1)
	{
		error = error1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error error>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FlowQueryList$Builder modelCache(ModelCache modelcache)
	{
		modelCache = modelcache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field ModelCache modelCache>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FlowQueryList$Builder modelQueriable(ModelQueriable modelqueriable)
	{
		modelQueriable = modelqueriable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field ModelQueriable modelQueriable>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FlowQueryList$Builder success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success success1)
	{
		success = success1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success success>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public FlowQueryList$Builder transact(boolean flag)
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
	static boolean access$000(FlowQueryList$Builder flowquerylist$builder)
	{
		return flowquerylist$builder.transact;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field boolean transact>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$100(FlowQueryList$Builder flowquerylist$builder)
	{
		return flowquerylist$builder.changeInTransaction;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field boolean changeInTransaction>
	//    2    4:ireturn         
	}

*/


/*
	static com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success access$200(FlowQueryList$Builder flowquerylist$builder)
	{
		return flowquerylist$builder.success;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success success>
	//    2    4:areturn         
	}

*/


/*
	static com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error access$300(FlowQueryList$Builder flowquerylist$builder)
	{
		return flowquerylist$builder.error;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error error>
	//    2    4:areturn         
	}

*/


/*
	static ModelCache access$400(FlowQueryList$Builder flowquerylist$builder)
	{
		return flowquerylist$builder.modelCache;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field ModelCache modelCache>
	//    2    4:areturn         
	}

*/


/*
	static ModelQueriable access$500(FlowQueryList$Builder flowquerylist$builder)
	{
		return flowquerylist$builder.modelQueriable;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ModelQueriable modelQueriable>
	//    2    4:areturn         
	}

*/


/*
	static int access$600(FlowQueryList$Builder flowquerylist$builder)
	{
		return flowquerylist$builder.cacheSize;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int cacheSize>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$700(FlowQueryList$Builder flowquerylist$builder)
	{
		return flowquerylist$builder.cacheModels;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean cacheModels>
	//    2    4:ireturn         
	}

*/


/*
	static Cursor access$800(FlowQueryList$Builder flowquerylist$builder)
	{
		return flowquerylist$builder.cursor;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Cursor cursor>
	//    2    4:areturn         
	}

*/


/*
	static Class access$900(FlowQueryList$Builder flowquerylist$builder)
	{
		return flowquerylist$builder.table;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Class table>
	//    2    4:areturn         
	}

*/

	private FlowQueryList$Builder(FlowCursorList flowcursorlist)
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

	FlowQueryList$Builder(FlowCursorList flowcursorlist, FlowQueryList._cls1 _pcls1)
	{
		this(flowcursorlist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void FlowQueryList$Builder(FlowCursorList)>
	//    3    5:return          
	}

	public FlowQueryList$Builder(ModelQueriable modelqueriable)
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

	public FlowQueryList$Builder(Class class1)
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
