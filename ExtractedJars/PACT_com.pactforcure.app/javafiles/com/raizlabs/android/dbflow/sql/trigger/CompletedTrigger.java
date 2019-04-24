// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.trigger;

import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.*;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.sql.trigger:
//			TriggerMethod, Trigger

public class CompletedTrigger
	implements Query
{

	CompletedTrigger(TriggerMethod triggermethod, Query query)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		triggerMethod = triggermethod;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field TriggerMethod triggerMethod>
		triggerLogicQuery = query;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Query triggerLogicQuery>
	//    8   14:return          
	}

	public void disable()
	{
		SqlUtils.dropTrigger(triggerMethod.onTable, triggerMethod.trigger.triggerName);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field TriggerMethod triggerMethod>
	//    2    4:getfield        #31  <Field Class TriggerMethod.onTable>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field TriggerMethod triggerMethod>
	//    5   11:getfield        #35  <Field Trigger TriggerMethod.trigger>
	//    6   14:getfield        #41  <Field String Trigger.triggerName>
	//    7   17:invokestatic    #47  <Method void SqlUtils.dropTrigger(Class, String)>
	//    8   20:return          
	}

	public void enable()
	{
		FlowManager.getDatabaseForTable(triggerMethod.onTable).getWritableDatabase().execSQL(getQuery());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field TriggerMethod triggerMethod>
	//    2    4:getfield        #31  <Field Class TriggerMethod.onTable>
	//    3    7:invokestatic    #54  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4   10:invokevirtual   #60  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #64  <Method String getQuery()>
	//    7   17:invokeinterface #70  <Method void DatabaseWrapper.execSQL(String)>
	//    8   22:return          
	}

	public String getQuery()
	{
		QueryBuilder querybuilder = new QueryBuilder(((Object) (triggerMethod.getQuery())));
	//    0    0:new             #72  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field TriggerMethod triggerMethod>
	//    4    8:invokevirtual   #73  <Method String TriggerMethod.getQuery()>
	//    5   11:invokespecial   #76  <Method void QueryBuilder(Object)>
	//    6   14:astore_1        
		querybuilder.append("\nBEGIN").append("\n").append(((Object) (triggerLogicQuery.getQuery()))).append(";").append("\nEND");
	//    7   15:aload_1         
	//    8   16:ldc1            #78  <String "\nBEGIN">
	//    9   18:invokevirtual   #82  <Method QueryBuilder QueryBuilder.append(Object)>
	//   10   21:ldc1            #84  <String "\n">
	//   11   23:invokevirtual   #82  <Method QueryBuilder QueryBuilder.append(Object)>
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field Query triggerLogicQuery>
	//   14   30:invokeinterface #85  <Method String Query.getQuery()>
	//   15   35:invokevirtual   #82  <Method QueryBuilder QueryBuilder.append(Object)>
	//   16   38:ldc1            #87  <String ";">
	//   17   40:invokevirtual   #82  <Method QueryBuilder QueryBuilder.append(Object)>
	//   18   43:ldc1            #89  <String "\nEND">
	//   19   45:invokevirtual   #82  <Method QueryBuilder QueryBuilder.append(Object)>
	//   20   48:pop             
		return querybuilder.getQuery();
	//   21   49:aload_1         
	//   22   50:invokevirtual   #90  <Method String QueryBuilder.getQuery()>
	//   23   53:areturn         
	}

	private Query triggerLogicQuery;
	private TriggerMethod triggerMethod;
}
