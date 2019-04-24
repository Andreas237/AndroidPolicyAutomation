// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IndexProperty;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			WhereBase, Transformable, SQLCondition, Where, 
//			NameAlias, OrderBy

public class IndexedBy
	implements WhereBase, Transformable
{

	IndexedBy(IndexProperty indexproperty, WhereBase wherebase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		indexProperty = indexproperty;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field IndexProperty indexProperty>
		whereBase = wherebase;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field WhereBase whereBase>
	//    8   14:return          
	}

	public String getQuery()
	{
		return (new QueryBuilder(((Object) (whereBase.getQuery())))).append("INDEXED BY ").append(((Object) (QueryBuilder.quoteIfNeeded(indexProperty.getIndexName())))).appendSpace().getQuery();
	//    0    0:new             #31  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field WhereBase whereBase>
	//    4    8:invokeinterface #33  <Method String WhereBase.getQuery()>
	//    5   13:invokespecial   #36  <Method void QueryBuilder(Object)>
	//    6   16:ldc1            #38  <String "INDEXED BY ">
	//    7   18:invokevirtual   #42  <Method QueryBuilder QueryBuilder.append(Object)>
	//    8   21:aload_0         
	//    9   22:getfield        #22  <Field IndexProperty indexProperty>
	//   10   25:invokevirtual   #47  <Method String IndexProperty.getIndexName()>
	//   11   28:invokestatic    #51  <Method String QueryBuilder.quoteIfNeeded(String)>
	//   12   31:invokevirtual   #42  <Method QueryBuilder QueryBuilder.append(Object)>
	//   13   34:invokevirtual   #55  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   14   37:invokevirtual   #56  <Method String QueryBuilder.getQuery()>
	//   15   40:areturn         
	}

	public Query getQueryBuilderBase()
	{
		return whereBase.getQueryBuilderBase();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WhereBase whereBase>
	//    2    4:invokeinterface #60  <Method Query WhereBase.getQueryBuilderBase()>
	//    3    9:areturn         
	}

	public Class getTable()
	{
		return whereBase.getTable();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WhereBase whereBase>
	//    2    4:invokeinterface #64  <Method Class WhereBase.getTable()>
	//    3    9:areturn         
	}

	public transient Where groupBy(NameAlias anamealias[])
	{
		return where(new SQLCondition[0]).groupBy(anamealias);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #73  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #77  <Method Where Where.groupBy(NameAlias[])>
	//    6   12:areturn         
	}

	public transient Where groupBy(IProperty aiproperty[])
	{
		return where(new SQLCondition[0]).groupBy(aiproperty);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #73  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method Where Where.groupBy(IProperty[])>
	//    6   12:areturn         
	}

	public transient Where having(SQLCondition asqlcondition[])
	{
		return where(new SQLCondition[0]).having(asqlcondition);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #73  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #85  <Method Where Where.having(SQLCondition[])>
	//    6   12:areturn         
	}

	public Where limit(int i)
	{
		return where(new SQLCondition[0]).limit(i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #73  <Method Where where(SQLCondition[])>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #90  <Method Where Where.limit(int)>
	//    6   12:areturn         
	}

	public Where offset(int i)
	{
		return where(new SQLCondition[0]).offset(i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #73  <Method Where where(SQLCondition[])>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #94  <Method Where Where.offset(int)>
	//    6   12:areturn         
	}

	public Where orderBy(NameAlias namealias, boolean flag)
	{
		return where(new SQLCondition[0]).orderBy(namealias, flag);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #73  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #98  <Method Where Where.orderBy(NameAlias, boolean)>
	//    7   13:areturn         
	}

	public Where orderBy(OrderBy orderby)
	{
		return where(new SQLCondition[0]).orderBy(orderby);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #73  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #102 <Method Where Where.orderBy(OrderBy)>
	//    6   12:areturn         
	}

	public Where orderBy(IProperty iproperty, boolean flag)
	{
		return where(new SQLCondition[0]).orderBy(iproperty, flag);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       SQLCondition[]
	//    3    5:invokevirtual   #73  <Method Where where(SQLCondition[])>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #106 <Method Where Where.orderBy(IProperty, boolean)>
	//    7   13:areturn         
	}

	public transient Where where(SQLCondition asqlcondition[])
	{
		return new Where(((WhereBase) (this)), asqlcondition);
	//    0    0:new             #75  <Class Where>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #110 <Method void Where(WhereBase, SQLCondition[])>
	//    5    9:areturn         
	}

	private final IndexProperty indexProperty;
	private final WhereBase whereBase;
}
