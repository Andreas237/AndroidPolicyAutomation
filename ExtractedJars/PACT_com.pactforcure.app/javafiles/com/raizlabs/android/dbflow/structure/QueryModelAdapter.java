// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			InstanceAdapter, BaseQueryModel

public abstract class QueryModelAdapter extends InstanceAdapter
{

	public QueryModelAdapter(DatabaseDefinition databasedefinition)
	{
		super(databasedefinition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void InstanceAdapter(DatabaseDefinition)>
	//    3    5:return          
	}

	public boolean exists(BaseQueryModel basequerymodel)
	{
		throw new UnsupportedOperationException("QueryModels cannot check for existence");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "QueryModels cannot check for existence">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean exists(BaseQueryModel basequerymodel, DatabaseWrapper databasewrapper)
	{
		throw new UnsupportedOperationException("QueryModels cannot check for existence");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "QueryModels cannot check for existence">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public volatile boolean exists(Object obj)
	{
		return exists((BaseQueryModel)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class BaseQueryModel>
	//    3    5:invokevirtual   #28  <Method boolean exists(BaseQueryModel)>
	//    4    8:ireturn         
	}

	public volatile boolean exists(Object obj, DatabaseWrapper databasewrapper)
	{
		return exists((BaseQueryModel)obj, databasewrapper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class BaseQueryModel>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #31  <Method boolean exists(BaseQueryModel, DatabaseWrapper)>
	//    5    9:ireturn         
	}

	public ConditionGroup getPrimaryConditionClause(BaseQueryModel basequerymodel)
	{
		throw new UnsupportedOperationException("QueryModels cannot check for existence");
	//    0    0:new             #14  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "QueryModels cannot check for existence">
	//    3    6:invokespecial   #19  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public volatile ConditionGroup getPrimaryConditionClause(Object obj)
	{
		return getPrimaryConditionClause((BaseQueryModel)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class BaseQueryModel>
	//    3    5:invokevirtual   #37  <Method ConditionGroup getPrimaryConditionClause(BaseQueryModel)>
	//    4    8:areturn         
	}
}
