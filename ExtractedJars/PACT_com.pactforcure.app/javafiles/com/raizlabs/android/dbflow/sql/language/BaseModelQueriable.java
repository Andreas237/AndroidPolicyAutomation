// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.config.FlowLog;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.list.FlowCursorList;
import com.raizlabs.android.dbflow.list.FlowQueryList;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.queriable.*;
import com.raizlabs.android.dbflow.structure.*;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			BaseQueriable, CursorResult

public abstract class BaseModelQueriable extends BaseQueriable
	implements ModelQueriable, Query
{

	protected BaseModelQueriable(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void BaseQueriable(Class)>
	//    3    5:return          
	}

	private InstanceAdapter getRetrievalAdapter()
	{
		if(retrievalAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field InstanceAdapter retrievalAdapter>
	//*   2    4:ifnonnull       18
			retrievalAdapter = FlowManager.getInstanceAdapter(getTable());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #27  <Method Class getTable()>
	//    6   12:invokestatic    #33  <Method InstanceAdapter FlowManager.getInstanceAdapter(Class)>
	//    7   15:putfield        #23  <Field InstanceAdapter retrievalAdapter>
		return retrievalAdapter;
	//    8   18:aload_0         
	//    9   19:getfield        #23  <Field InstanceAdapter retrievalAdapter>
	//   10   22:areturn         
	}

	public AsyncQuery async()
	{
		return new AsyncQuery(((ModelQueriable) (this)));
	//    0    0:new             #38  <Class AsyncQuery>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #41  <Method void AsyncQuery(ModelQueriable)>
	//    4    8:areturn         
	}

	public FlowCursorList cursorList()
	{
		return (new com.raizlabs.android.dbflow.list.FlowCursorList.Builder(getTable())).modelQueriable(((ModelQueriable) (this))).build();
	//    0    0:new             #46  <Class com.raizlabs.android.dbflow.list.FlowCursorList$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #27  <Method Class getTable()>
	//    4    8:invokespecial   #47  <Method void com.raizlabs.android.dbflow.list.FlowCursorList$Builder(Class)>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #51  <Method com.raizlabs.android.dbflow.list.FlowCursorList$Builder com.raizlabs.android.dbflow.list.FlowCursorList$Builder.modelQueriable(ModelQueriable)>
	//    7   15:invokevirtual   #54  <Method FlowCursorList com.raizlabs.android.dbflow.list.FlowCursorList$Builder.build()>
	//    8   18:areturn         
	}

	public long executeUpdateDelete()
	{
		return executeUpdateDelete(FlowManager.getWritableDatabaseForTable(getTable()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #27  <Method Class getTable()>
	//    3    5:invokestatic    #61  <Method DatabaseWrapper FlowManager.getWritableDatabaseForTable(Class)>
	//    4    8:invokevirtual   #64  <Method long executeUpdateDelete(DatabaseWrapper)>
	//    5   11:lreturn         
	}

	public long executeUpdateDelete(DatabaseWrapper databasewrapper)
	{
		return databasewrapper.compileStatement(getQuery()).executeUpdateDelete();
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #68  <Method String getQuery()>
	//    3    5:invokeinterface #74  <Method DatabaseStatement DatabaseWrapper.compileStatement(String)>
	//    4   10:invokeinterface #78  <Method long DatabaseStatement.executeUpdateDelete()>
	//    5   15:lreturn         
	}

	public FlowQueryList flowQueryList()
	{
		return (new com.raizlabs.android.dbflow.list.FlowQueryList.Builder(getTable())).modelQueriable(((ModelQueriable) (this))).build();
	//    0    0:new             #82  <Class com.raizlabs.android.dbflow.list.FlowQueryList$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #27  <Method Class getTable()>
	//    4    8:invokespecial   #83  <Method void com.raizlabs.android.dbflow.list.FlowQueryList$Builder(Class)>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #86  <Method com.raizlabs.android.dbflow.list.FlowQueryList$Builder com.raizlabs.android.dbflow.list.FlowQueryList$Builder.modelQueriable(ModelQueriable)>
	//    7   15:invokevirtual   #88  <Method FlowQueryList com.raizlabs.android.dbflow.list.FlowQueryList$Builder.build()>
	//    8   18:areturn         
	}

	public List queryCustomList(Class class1)
	{
		String s = getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method String getQuery()>
	//    2    4:astore_2        
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.V, (new StringBuilder()).append("Executing query: ").append(s).toString());
	//    3    5:getstatic       #97  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.V>
	//    4    8:new             #99  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #102 <Method void StringBuilder()>
	//    7   15:ldc1            #104 <String "Executing query: ">
	//    8   17:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_2         
	//   10   21:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   12   27:invokestatic    #117 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		return (List)FlowManager.getQueryModelAdapter(class1).getListModelLoader().load(s);
	//   13   30:aload_1         
	//   14   31:invokestatic    #121 <Method QueryModelAdapter FlowManager.getQueryModelAdapter(Class)>
	//   15   34:invokevirtual   #127 <Method ListModelLoader QueryModelAdapter.getListModelLoader()>
	//   16   37:aload_2         
	//   17   38:invokevirtual   #133 <Method Object ListModelLoader.load(String)>
	//   18   41:checkcast       #135 <Class List>
	//   19   44:areturn         
	}

	public BaseQueryModel queryCustomSingle(Class class1)
	{
		String s = getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method String getQuery()>
	//    2    4:astore_2        
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.V, (new StringBuilder()).append("Executing query: ").append(s).toString());
	//    3    5:getstatic       #97  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.V>
	//    4    8:new             #99  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #102 <Method void StringBuilder()>
	//    7   15:ldc1            #104 <String "Executing query: ">
	//    8   17:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_2         
	//   10   21:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   12   27:invokestatic    #117 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		return (BaseQueryModel)FlowManager.getQueryModelAdapter(class1).getSingleModelLoader().load(s);
	//   13   30:aload_1         
	//   14   31:invokestatic    #121 <Method QueryModelAdapter FlowManager.getQueryModelAdapter(Class)>
	//   15   34:invokevirtual   #142 <Method SingleModelLoader QueryModelAdapter.getSingleModelLoader()>
	//   16   37:aload_2         
	//   17   38:invokevirtual   #145 <Method Object SingleModelLoader.load(String)>
	//   18   41:checkcast       #147 <Class BaseQueryModel>
	//   19   44:areturn         
	}

	public List queryList()
	{
		String s = getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method String getQuery()>
	//    2    4:astore_1        
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.V, (new StringBuilder()).append("Executing query: ").append(s).toString());
	//    3    5:getstatic       #97  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.V>
	//    4    8:new             #99  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #102 <Method void StringBuilder()>
	//    7   15:ldc1            #104 <String "Executing query: ">
	//    8   17:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   12   27:invokestatic    #117 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		return (List)getRetrievalAdapter().getListModelLoader().load(s);
	//   13   30:aload_0         
	//   14   31:invokespecial   #152 <Method InstanceAdapter getRetrievalAdapter()>
	//   15   34:invokevirtual   #155 <Method ListModelLoader InstanceAdapter.getListModelLoader()>
	//   16   37:aload_1         
	//   17   38:invokevirtual   #133 <Method Object ListModelLoader.load(String)>
	//   18   41:checkcast       #135 <Class List>
	//   19   44:areturn         
	}

	public List queryList(DatabaseWrapper databasewrapper)
	{
		Object obj = ((Object) (getQuery()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method String getQuery()>
	//    2    4:astore_2        
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.V, (new StringBuilder()).append("Executing query: ").append(((String) (obj))).toString());
	//    3    5:getstatic       #97  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.V>
	//    4    8:new             #99  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #102 <Method void StringBuilder()>
	//    7   15:ldc1            #104 <String "Executing query: ">
	//    8   17:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_2         
	//   10   21:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   12   27:invokestatic    #117 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		obj = ((Object) ((List)getRetrievalAdapter().getListModelLoader().load(databasewrapper, ((String) (obj)))));
	//   13   30:aload_0         
	//   14   31:invokespecial   #152 <Method InstanceAdapter getRetrievalAdapter()>
	//   15   34:invokevirtual   #155 <Method ListModelLoader InstanceAdapter.getListModelLoader()>
	//   16   37:aload_1         
	//   17   38:aload_2         
	//   18   39:invokevirtual   #161 <Method Object ListModelLoader.load(DatabaseWrapper, String)>
	//   19   42:checkcast       #135 <Class List>
	//   20   45:astore_2        
		databasewrapper = ((DatabaseWrapper) (obj));
	//   21   46:aload_2         
	//   22   47:astore_1        
		if(obj == null)
	//*  23   48:aload_2         
	//*  24   49:ifnonnull       60
			databasewrapper = ((DatabaseWrapper) (new ArrayList()));
	//   25   52:new             #163 <Class ArrayList>
	//   26   55:dup             
	//   27   56:invokespecial   #164 <Method void ArrayList()>
	//   28   59:astore_1        
		return ((List) (databasewrapper));
	//   29   60:aload_1         
	//   30   61:areturn         
	}

	public CursorResult queryResults()
	{
		return new CursorResult(getRetrievalAdapter().getModelClass(), query());
	//    0    0:new             #170 <Class CursorResult>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #152 <Method InstanceAdapter getRetrievalAdapter()>
	//    4    8:invokevirtual   #173 <Method Class InstanceAdapter.getModelClass()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #177 <Method android.database.Cursor query()>
	//    7   15:invokespecial   #180 <Method void CursorResult(Class, android.database.Cursor)>
	//    8   18:areturn         
	}

	public Object querySingle()
	{
		String s = getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method String getQuery()>
	//    2    4:astore_1        
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.V, (new StringBuilder()).append("Executing query: ").append(s).toString());
	//    3    5:getstatic       #97  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.V>
	//    4    8:new             #99  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #102 <Method void StringBuilder()>
	//    7   15:ldc1            #104 <String "Executing query: ">
	//    8   17:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   12   27:invokestatic    #117 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		return getRetrievalAdapter().getSingleModelLoader().load(s);
	//   13   30:aload_0         
	//   14   31:invokespecial   #152 <Method InstanceAdapter getRetrievalAdapter()>
	//   15   34:invokevirtual   #184 <Method SingleModelLoader InstanceAdapter.getSingleModelLoader()>
	//   16   37:aload_1         
	//   17   38:invokevirtual   #145 <Method Object SingleModelLoader.load(String)>
	//   18   41:areturn         
	}

	public Object querySingle(DatabaseWrapper databasewrapper)
	{
		String s = getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method String getQuery()>
	//    2    4:astore_2        
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.V, (new StringBuilder()).append("Executing query: ").append(s).toString());
	//    3    5:getstatic       #97  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.V>
	//    4    8:new             #99  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #102 <Method void StringBuilder()>
	//    7   15:ldc1            #104 <String "Executing query: ">
	//    8   17:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_2         
	//   10   21:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   12   27:invokestatic    #117 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		return getRetrievalAdapter().getSingleModelLoader().load(databasewrapper, s);
	//   13   30:aload_0         
	//   14   31:invokespecial   #152 <Method InstanceAdapter getRetrievalAdapter()>
	//   15   34:invokevirtual   #184 <Method SingleModelLoader InstanceAdapter.getSingleModelLoader()>
	//   16   37:aload_1         
	//   17   38:aload_2         
	//   18   39:invokevirtual   #187 <Method Object SingleModelLoader.load(DatabaseWrapper, String)>
	//   19   42:areturn         
	}

	private InstanceAdapter retrievalAdapter;
}
