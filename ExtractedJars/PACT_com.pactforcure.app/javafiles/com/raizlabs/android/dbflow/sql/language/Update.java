// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.annotation.ConflictAction;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			Set, SQLCondition

public class Update
	implements Query
{

	public Update(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		conflictAction = ConflictAction.NONE;
	//    2    4:aload_0         
	//    3    5:getstatic       #22  <Field ConflictAction ConflictAction.NONE>
	//    4    8:putfield        #24  <Field ConflictAction conflictAction>
		table = class1;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #26  <Field Class table>
	//    8   16:return          
	}

	public Update conflictAction(ConflictAction conflictaction)
	{
		conflictAction = conflictaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field ConflictAction conflictAction>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String getQuery()
	{
		QueryBuilder querybuilder = new QueryBuilder("UPDATE ");
	//    0    0:new             #34  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #36  <String "UPDATE ">
	//    3    6:invokespecial   #39  <Method void QueryBuilder(Object)>
	//    4    9:astore_1        
		if(conflictAction != null && !conflictAction.equals(((Object) (ConflictAction.NONE))))
	//*   5   10:aload_0         
	//*   6   11:getfield        #24  <Field ConflictAction conflictAction>
	//*   7   14:ifnull          47
	//*   8   17:aload_0         
	//*   9   18:getfield        #24  <Field ConflictAction conflictAction>
	//*  10   21:getstatic       #22  <Field ConflictAction ConflictAction.NONE>
	//*  11   24:invokevirtual   #43  <Method boolean ConflictAction.equals(Object)>
	//*  12   27:ifne            47
			querybuilder.append("OR").appendSpaceSeparated(((Object) (conflictAction.name())));
	//   13   30:aload_1         
	//   14   31:ldc1            #45  <String "OR">
	//   15   33:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   16   36:aload_0         
	//   17   37:getfield        #24  <Field ConflictAction conflictAction>
	//   18   40:invokevirtual   #52  <Method String ConflictAction.name()>
	//   19   43:invokevirtual   #55  <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
	//   20   46:pop             
		querybuilder.append(((Object) (FlowManager.getTableName(table)))).appendSpace();
	//   21   47:aload_1         
	//   22   48:aload_0         
	//   23   49:getfield        #26  <Field Class table>
	//   24   52:invokestatic    #61  <Method String FlowManager.getTableName(Class)>
	//   25   55:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   26   58:invokevirtual   #65  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   27   61:pop             
		return querybuilder.getQuery();
	//   28   62:aload_1         
	//   29   63:invokevirtual   #67  <Method String QueryBuilder.getQuery()>
	//   30   66:areturn         
	}

	public Update orAbort()
	{
		return conflictAction(ConflictAction.ABORT);
	//    0    0:aload_0         
	//    1    1:getstatic       #72  <Field ConflictAction ConflictAction.ABORT>
	//    2    4:invokevirtual   #74  <Method Update conflictAction(ConflictAction)>
	//    3    7:areturn         
	}

	public Update orFail()
	{
		return conflictAction(ConflictAction.FAIL);
	//    0    0:aload_0         
	//    1    1:getstatic       #78  <Field ConflictAction ConflictAction.FAIL>
	//    2    4:invokevirtual   #74  <Method Update conflictAction(ConflictAction)>
	//    3    7:areturn         
	}

	public Update orIgnore()
	{
		return conflictAction(ConflictAction.IGNORE);
	//    0    0:aload_0         
	//    1    1:getstatic       #82  <Field ConflictAction ConflictAction.IGNORE>
	//    2    4:invokevirtual   #74  <Method Update conflictAction(ConflictAction)>
	//    3    7:areturn         
	}

	public Update orReplace()
	{
		return conflictAction(ConflictAction.REPLACE);
	//    0    0:aload_0         
	//    1    1:getstatic       #86  <Field ConflictAction ConflictAction.REPLACE>
	//    2    4:invokevirtual   #74  <Method Update conflictAction(ConflictAction)>
	//    3    7:areturn         
	}

	public Update orRollback()
	{
		return conflictAction(ConflictAction.ROLLBACK);
	//    0    0:aload_0         
	//    1    1:getstatic       #90  <Field ConflictAction ConflictAction.ROLLBACK>
	//    2    4:invokevirtual   #74  <Method Update conflictAction(ConflictAction)>
	//    3    7:areturn         
	}

	public transient Set set(SQLCondition asqlcondition[])
	{
		return (new Set(((Query) (this)), table)).conditions(asqlcondition);
	//    0    0:new             #94  <Class Set>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field Class table>
	//    5    9:invokespecial   #97  <Method void Set(Query, Class)>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #100 <Method Set Set.conditions(SQLCondition[])>
	//    8   16:areturn         
	}

	private ConflictAction conflictAction;
	private final Class table;
}
