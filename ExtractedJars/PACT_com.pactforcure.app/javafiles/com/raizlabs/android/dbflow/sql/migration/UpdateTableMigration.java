// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.migration;

import com.raizlabs.android.dbflow.sql.language.*;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.sql.migration:
//			BaseMigration

public class UpdateTableMigration extends BaseMigration
{

	public UpdateTableMigration(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void BaseMigration()>
		table = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Class table>
	//    5    9:return          
	}

	public BaseQueriable getUpdateStatement()
	{
		return ((BaseQueriable) (SQLite.update(table).set(new SQLCondition[] {
			setConditionGroup
		}).where(new SQLCondition[] {
			whereConditionGroup
		})));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Class table>
	//    2    4:invokestatic    #29  <Method Update SQLite.update(Class)>
	//    3    7:iconst_1        
	//    4    8:anewarray       SQLCondition[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:getfield        #33  <Field ConditionGroup setConditionGroup>
	//    9   17:aastore         
	//   10   18:invokevirtual   #39  <Method Set Update.set(SQLCondition[])>
	//   11   21:iconst_1        
	//   12   22:anewarray       SQLCondition[]
	//   13   25:dup             
	//   14   26:iconst_0        
	//   15   27:aload_0         
	//   16   28:getfield        #41  <Field ConditionGroup whereConditionGroup>
	//   17   31:aastore         
	//   18   32:invokevirtual   #47  <Method com.raizlabs.android.dbflow.sql.language.Where Set.where(SQLCondition[])>
	//   19   35:areturn         
	}

	public final void migrate(DatabaseWrapper databasewrapper)
	{
		getUpdateStatement().execute(databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method BaseQueriable getUpdateStatement()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #57  <Method void BaseQueriable.execute(DatabaseWrapper)>
	//    4    8:return          
	}

	public void onPostMigrate()
	{
		setConditionGroup = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #33  <Field ConditionGroup setConditionGroup>
		whereConditionGroup = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #41  <Field ConditionGroup whereConditionGroup>
	//    6   10:return          
	}

	public transient UpdateTableMigration set(SQLCondition asqlcondition[])
	{
		if(setConditionGroup == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field ConditionGroup setConditionGroup>
	//*   2    4:ifnonnull       14
			setConditionGroup = ConditionGroup.nonGroupingClause();
	//    3    7:aload_0         
	//    4    8:invokestatic    #67  <Method ConditionGroup ConditionGroup.nonGroupingClause()>
	//    5   11:putfield        #33  <Field ConditionGroup setConditionGroup>
		setConditionGroup.andAll(asqlcondition);
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field ConditionGroup setConditionGroup>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #71  <Method ConditionGroup ConditionGroup.andAll(SQLCondition[])>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public transient UpdateTableMigration where(SQLCondition asqlcondition[])
	{
		if(whereConditionGroup == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field ConditionGroup whereConditionGroup>
	//*   2    4:ifnonnull       14
			whereConditionGroup = ConditionGroup.nonGroupingClause();
	//    3    7:aload_0         
	//    4    8:invokestatic    #67  <Method ConditionGroup ConditionGroup.nonGroupingClause()>
	//    5   11:putfield        #41  <Field ConditionGroup whereConditionGroup>
		whereConditionGroup.andAll(asqlcondition);
	//    6   14:aload_0         
	//    7   15:getfield        #41  <Field ConditionGroup whereConditionGroup>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #71  <Method ConditionGroup ConditionGroup.andAll(SQLCondition[])>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	private ConditionGroup setConditionGroup;
	private final Class table;
	private ConditionGroup whereConditionGroup;
}
