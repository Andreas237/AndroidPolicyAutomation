// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import android.database.Cursor;
import com.raizlabs.android.dbflow.config.*;
import com.raizlabs.android.dbflow.sql.language.*;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.queriable.ListModelLoader;
import com.raizlabs.android.dbflow.sql.queriable.SingleModelLoader;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

public abstract class RetrievalAdapter
{

	public RetrievalAdapter(DatabaseDefinition databasedefinition)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		databasedefinition = ((DatabaseDefinition) (FlowManager.getConfig().getConfigForDatabase(databasedefinition.getAssociatedDatabaseClassFile())));
	//    2    4:invokestatic    #25  <Method FlowConfig FlowManager.getConfig()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #31  <Method Class DatabaseDefinition.getAssociatedDatabaseClassFile()>
	//    5   11:invokevirtual   #37  <Method DatabaseConfig FlowConfig.getConfigForDatabase(Class)>
	//    6   14:astore_1        
		if(databasedefinition != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          80
		{
			tableConfig = ((DatabaseConfig) (databasedefinition)).getTableConfigForTable(getModelClass());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #40  <Method Class getModelClass()>
	//   13   25:invokevirtual   #46  <Method TableConfig DatabaseConfig.getTableConfigForTable(Class)>
	//   14   28:putfield        #48  <Field TableConfig tableConfig>
			if(tableConfig != null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #48  <Field TableConfig tableConfig>
	//*  17   35:ifnull          80
			{
				if(tableConfig.singleModelLoader() != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #48  <Field TableConfig tableConfig>
	//*  20   42:invokevirtual   #53  <Method SingleModelLoader TableConfig.singleModelLoader()>
	//*  21   45:ifnull          59
					singleModelLoader = tableConfig.singleModelLoader();
	//   22   48:aload_0         
	//   23   49:aload_0         
	//   24   50:getfield        #48  <Field TableConfig tableConfig>
	//   25   53:invokevirtual   #53  <Method SingleModelLoader TableConfig.singleModelLoader()>
	//   26   56:putfield        #55  <Field SingleModelLoader singleModelLoader>
				if(tableConfig.listModelLoader() != null)
	//*  27   59:aload_0         
	//*  28   60:getfield        #48  <Field TableConfig tableConfig>
	//*  29   63:invokevirtual   #58  <Method ListModelLoader TableConfig.listModelLoader()>
	//*  30   66:ifnull          80
					listModelLoader = tableConfig.listModelLoader();
	//   31   69:aload_0         
	//   32   70:aload_0         
	//   33   71:getfield        #48  <Field TableConfig tableConfig>
	//   34   74:invokevirtual   #58  <Method ListModelLoader TableConfig.listModelLoader()>
	//   35   77:putfield        #60  <Field ListModelLoader listModelLoader>
			}
		}
	//   36   80:return          
	}

	protected ListModelLoader createListModelLoader()
	{
		return new ListModelLoader(getModelClass());
	//    0    0:new             #64  <Class ListModelLoader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #40  <Method Class getModelClass()>
	//    4    8:invokespecial   #67  <Method void ListModelLoader(Class)>
	//    5   11:areturn         
	}

	protected SingleModelLoader createSingleModelLoader()
	{
		return new SingleModelLoader(getModelClass());
	//    0    0:new             #72  <Class SingleModelLoader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #40  <Method Class getModelClass()>
	//    4    8:invokespecial   #73  <Method void SingleModelLoader(Class)>
	//    5   11:areturn         
	}

	public boolean exists(Object obj)
	{
		return exists(obj, FlowManager.getDatabaseForTable(getModelClass()).getWritableDatabase());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #40  <Method Class getModelClass()>
	//    4    6:invokestatic    #80  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    5    9:invokevirtual   #84  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    6   12:invokevirtual   #87  <Method boolean exists(Object, DatabaseWrapper)>
	//    7   15:ireturn         
	}

	public abstract boolean exists(Object obj, DatabaseWrapper databasewrapper);

	public ListModelLoader getListModelLoader()
	{
		if(listModelLoader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field ListModelLoader listModelLoader>
	//*   2    4:ifnonnull       15
			listModelLoader = createListModelLoader();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #91  <Method ListModelLoader createListModelLoader()>
	//    6   12:putfield        #60  <Field ListModelLoader listModelLoader>
		return listModelLoader;
	//    7   15:aload_0         
	//    8   16:getfield        #60  <Field ListModelLoader listModelLoader>
	//    9   19:areturn         
	}

	public abstract Class getModelClass();

	public abstract ConditionGroup getPrimaryConditionClause(Object obj);

	public SingleModelLoader getSingleModelLoader()
	{
		if(singleModelLoader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field SingleModelLoader singleModelLoader>
	//*   2    4:ifnonnull       15
			singleModelLoader = createSingleModelLoader();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #96  <Method SingleModelLoader createSingleModelLoader()>
	//    6   12:putfield        #55  <Field SingleModelLoader singleModelLoader>
		return singleModelLoader;
	//    7   15:aload_0         
	//    8   16:getfield        #55  <Field SingleModelLoader singleModelLoader>
	//    9   19:areturn         
	}

	protected TableConfig getTableConfig()
	{
		return tableConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field TableConfig tableConfig>
	//    2    4:areturn         
	}

	public void load(Object obj)
	{
		load(obj, FlowManager.getDatabaseForTable(getModelClass()).getWritableDatabase());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #40  <Method Class getModelClass()>
	//    4    6:invokestatic    #80  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    5    9:invokevirtual   #84  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    6   12:invokevirtual   #104 <Method void load(Object, DatabaseWrapper)>
	//    7   15:return          
	}

	public void load(Object obj, DatabaseWrapper databasewrapper)
	{
		getSingleModelLoader().load(databasewrapper, SQLite.select(new IProperty[0]).from(getModelClass()).where(new SQLCondition[] {
			getPrimaryConditionClause(obj)
		}).getQuery(), obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method SingleModelLoader getSingleModelLoader()>
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:anewarray       IProperty[]
	//    5    9:invokestatic    #115 <Method Select SQLite.select(IProperty[])>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #40  <Method Class getModelClass()>
	//    8   16:invokevirtual   #121 <Method From Select.from(Class)>
	//    9   19:iconst_1        
	//   10   20:anewarray       SQLCondition[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #125 <Method ConditionGroup getPrimaryConditionClause(Object)>
	//   16   30:aastore         
	//   17   31:invokevirtual   #131 <Method Where From.where(SQLCondition[])>
	//   18   34:invokevirtual   #137 <Method String Where.getQuery()>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #140 <Method Object SingleModelLoader.load(DatabaseWrapper, String, Object)>
	//   21   41:pop             
	//   22   42:return          
	}

	public abstract void loadFromCursor(Cursor cursor, Object obj);

	public void setListModelLoader(ListModelLoader listmodelloader)
	{
		listModelLoader = listmodelloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field ListModelLoader listModelLoader>
	//    3    5:return          
	}

	public void setSingleModelLoader(SingleModelLoader singlemodelloader)
	{
		singleModelLoader = singlemodelloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field SingleModelLoader singleModelLoader>
	//    3    5:return          
	}

	private ListModelLoader listModelLoader;
	private SingleModelLoader singleModelLoader;
	private TableConfig tableConfig;
}
