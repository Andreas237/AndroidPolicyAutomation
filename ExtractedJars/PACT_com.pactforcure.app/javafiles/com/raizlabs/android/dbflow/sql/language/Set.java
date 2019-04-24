// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import android.content.ContentValues;
import com.raizlabs.android.dbflow.sql.*;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.queriable.Queriable;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			BaseQueriable, WhereBase, Transformable, ConditionGroup, 
//			SQLCondition, Where, NameAlias, OrderBy

public class Set extends BaseQueriable
	implements WhereBase, Queriable, Transformable
{

	Set(Query query, Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #20  <Method void BaseQueriable(Class)>
		update = query;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #22  <Field Query update>
		conditionGroup = new ConditionGroup();
	//    6   10:aload_0         
	//    7   11:new             #24  <Class ConditionGroup>
	//    8   14:dup             
	//    9   15:invokespecial   #27  <Method void ConditionGroup()>
	//   10   18:putfield        #29  <Field ConditionGroup conditionGroup>
		conditionGroup.setAllCommaSeparated(true);
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field ConditionGroup conditionGroup>
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #33  <Method ConditionGroup ConditionGroup.setAllCommaSeparated(boolean)>
	//   15   29:pop             
	//   16   30:return          
	}

	public Set conditionValues(ContentValues contentvalues)
	{
		SqlUtils.addContentValues(contentvalues, conditionGroup);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field ConditionGroup conditionGroup>
	//    3    5:invokestatic    #44  <Method void SqlUtils.addContentValues(ContentValues, ConditionGroup)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public transient Set conditions(SQLCondition asqlcondition[])
	{
		conditionGroup.andAll(asqlcondition);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ConditionGroup conditionGroup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #51  <Method ConditionGroup ConditionGroup.andAll(SQLCondition[])>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public long count()
	{
		return where(new SQLCondition[0]).count();
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:invokevirtual   #64  <Method long Where.count()>
	//    5   11:lreturn         
	}

	public long count(DatabaseWrapper databasewrapper)
	{
		return where(new SQLCondition[0]).count(databasewrapper);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #67  <Method long Where.count(DatabaseWrapper)>
	//    6   12:lreturn         
	}

	public long executeUpdateDelete()
	{
		return where(new SQLCondition[0]).executeUpdateDelete();
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:invokevirtual   #70  <Method long Where.executeUpdateDelete()>
	//    5   11:lreturn         
	}

	public long executeUpdateDelete(DatabaseWrapper databasewrapper)
	{
		return where(new SQLCondition[0]).executeUpdateDelete(databasewrapper);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #72  <Method long Where.executeUpdateDelete(DatabaseWrapper)>
	//    6   12:lreturn         
	}

	public String getQuery()
	{
		return (new QueryBuilder(((Object) (update.getQuery())))).append("SET ").append(((Object) (conditionGroup.getQuery()))).appendSpace().getQuery();
	//    0    0:new             #76  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field Query update>
	//    4    8:invokeinterface #80  <Method String Query.getQuery()>
	//    5   13:invokespecial   #83  <Method void QueryBuilder(Object)>
	//    6   16:ldc1            #85  <String "SET ">
	//    7   18:invokevirtual   #89  <Method QueryBuilder QueryBuilder.append(Object)>
	//    8   21:aload_0         
	//    9   22:getfield        #29  <Field ConditionGroup conditionGroup>
	//   10   25:invokevirtual   #90  <Method String ConditionGroup.getQuery()>
	//   11   28:invokevirtual   #89  <Method QueryBuilder QueryBuilder.append(Object)>
	//   12   31:invokevirtual   #94  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   13   34:invokevirtual   #95  <Method String QueryBuilder.getQuery()>
	//   14   37:areturn         
	}

	public Query getQueryBuilderBase()
	{
		return update;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Query update>
	//    2    4:areturn         
	}

	public transient Where groupBy(NameAlias anamealias[])
	{
		return where(new SQLCondition[0]).groupBy(anamealias);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #101 <Method Where Where.groupBy(NameAlias[])>
	//    6   12:areturn         
	}

	public transient Where groupBy(IProperty aiproperty[])
	{
		return where(new SQLCondition[0]).groupBy(aiproperty);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #105 <Method Where Where.groupBy(IProperty[])>
	//    6   12:areturn         
	}

	public transient Where having(SQLCondition asqlcondition[])
	{
		return where(new SQLCondition[0]).having(asqlcondition);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #109 <Method Where Where.having(SQLCondition[])>
	//    6   12:areturn         
	}

	public Where limit(int i)
	{
		return where(new SQLCondition[0]).limit(i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #114 <Method Where Where.limit(int)>
	//    6   12:areturn         
	}

	public Where offset(int i)
	{
		return where(new SQLCondition[0]).offset(i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #118 <Method Where Where.offset(int)>
	//    6   12:areturn         
	}

	public Where orderBy(NameAlias namealias, boolean flag)
	{
		return where(new SQLCondition[0]).orderBy(namealias, flag);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #122 <Method Where Where.orderBy(NameAlias, boolean)>
	//    7   13:areturn         
	}

	public Where orderBy(OrderBy orderby)
	{
		return where(new SQLCondition[0]).orderBy(orderby);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #126 <Method Where Where.orderBy(OrderBy)>
	//    6   12:areturn         
	}

	public Where orderBy(IProperty iproperty, boolean flag)
	{
		return where(new SQLCondition[0]).orderBy(iproperty, flag);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #60  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #130 <Method Where Where.orderBy(IProperty, boolean)>
	//    7   13:areturn         
	}

	public transient Where where(SQLCondition asqlcondition[])
	{
		return new Where(((WhereBase) (this)), asqlcondition);
	//    0    0:new             #62  <Class Where>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #134 <Method void Where(WhereBase, SQLCondition[])>
	//    5    9:areturn         
	}

	private ConditionGroup conditionGroup;
	private Query update;
}
