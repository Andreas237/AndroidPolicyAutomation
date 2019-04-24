// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.*;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			IProperty

public abstract class BaseProperty
	implements IProperty, IConditional
{

	protected BaseProperty(Class class1, NameAlias namealias)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		table = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Class table>
		nameAlias = namealias;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field NameAlias nameAlias>
	//    8   14:return          
	}

	public com.raizlabs.android.dbflow.sql.language.Condition.Between between(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().between(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method com.raizlabs.android.dbflow.sql.language.Condition$Between Condition.between(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public com.raizlabs.android.dbflow.sql.language.Condition.Between between(IConditional iconditional)
	{
		return getCondition().between(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method com.raizlabs.android.dbflow.sql.language.Condition$Between Condition.between(IConditional)>
	//    4    8:areturn         
	}

	public Condition concatenate(IConditional iconditional)
	{
		return getCondition().concatenate(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method Condition Condition.concatenate(IConditional)>
	//    4    8:areturn         
	}

	public Condition eq(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().eq(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #47  <Method Condition Condition.eq(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public Condition eq(IConditional iconditional)
	{
		return getCondition().eq(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method Condition Condition.eq(IConditional)>
	//    4    8:areturn         
	}

	protected Condition getCondition()
	{
		return Condition.column(getNameAlias());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method NameAlias getNameAlias()>
	//    2    4:invokestatic    #57  <Method Condition Condition.column(NameAlias)>
	//    3    7:areturn         
	}

	public String getCursorKey()
	{
		return getNameAlias().getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method NameAlias getNameAlias()>
	//    2    4:invokevirtual   #64  <Method String NameAlias.getQuery()>
	//    3    7:areturn         
	}

	public String getDefinition()
	{
		return getNameAlias().getFullQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method NameAlias getNameAlias()>
	//    2    4:invokevirtual   #68  <Method String NameAlias.getFullQuery()>
	//    3    7:areturn         
	}

	protected NameAlias getDistinctAliasName()
	{
		return getNameAlias().newBuilder().distinct().build();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method NameAlias getNameAlias()>
	//    2    4:invokevirtual   #73  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.newBuilder()>
	//    3    7:invokevirtual   #78  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.distinct()>
	//    4   10:invokevirtual   #81  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//    5   13:areturn         
	}

	public NameAlias getNameAlias()
	{
		return nameAlias;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field NameAlias nameAlias>
	//    2    4:areturn         
	}

	public String getQuery()
	{
		return getNameAlias().getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method NameAlias getNameAlias()>
	//    2    4:invokevirtual   #64  <Method String NameAlias.getQuery()>
	//    3    7:areturn         
	}

	public Class getTable()
	{
		return table;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Class table>
	//    2    4:areturn         
	}

	public Condition glob(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().glob(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method Condition Condition.glob(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public Condition glob(IConditional iconditional)
	{
		return getCondition().glob(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #89  <Method Condition Condition.glob(IConditional)>
	//    4    8:areturn         
	}

	public Condition glob(String s)
	{
		return getCondition().glob(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #92  <Method Condition Condition.glob(String)>
	//    4    8:areturn         
	}

	public Condition greaterThan(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().greaterThan(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method Condition Condition.greaterThan(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public Condition greaterThan(IConditional iconditional)
	{
		return getCondition().greaterThan(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #97  <Method Condition Condition.greaterThan(IConditional)>
	//    4    8:areturn         
	}

	public Condition greaterThanOrEq(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().greaterThanOrEq(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #100 <Method Condition Condition.greaterThanOrEq(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public Condition greaterThanOrEq(IConditional iconditional)
	{
		return getCondition().greaterThanOrEq(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #102 <Method Condition Condition.greaterThanOrEq(IConditional)>
	//    4    8:areturn         
	}

	public transient com.raizlabs.android.dbflow.sql.language.Condition.In in(BaseModelQueriable basemodelqueriable, BaseModelQueriable abasemodelqueriable[])
	{
		return getCondition().in(basemodelqueriable, abasemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #106 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.in(BaseModelQueriable, BaseModelQueriable[])>
	//    5    9:areturn         
	}

	public transient com.raizlabs.android.dbflow.sql.language.Condition.In in(IConditional iconditional, IConditional aiconditional[])
	{
		return getCondition().in(iconditional, aiconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #109 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.in(IConditional, IConditional[])>
	//    5    9:areturn         
	}

	public Condition is(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().is(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #112 <Method Condition Condition.is(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public Condition is(IConditional iconditional)
	{
		return getCondition().is(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #114 <Method Condition Condition.is(IConditional)>
	//    4    8:areturn         
	}

	public Condition isNot(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().isNot(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #117 <Method Condition Condition.isNot(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public Condition isNot(IConditional iconditional)
	{
		return getCondition().isNot(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #119 <Method Condition Condition.isNot(IConditional)>
	//    4    8:areturn         
	}

	public Condition isNotNull()
	{
		return getCondition().isNotNull();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:invokevirtual   #122 <Method Condition Condition.isNotNull()>
	//    3    7:areturn         
	}

	public Condition isNull()
	{
		return getCondition().isNull();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:invokevirtual   #125 <Method Condition Condition.isNull()>
	//    3    7:areturn         
	}

	public Condition lessThan(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().lessThan(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #128 <Method Condition Condition.lessThan(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public Condition lessThan(IConditional iconditional)
	{
		return getCondition().lessThan(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method Condition Condition.lessThan(IConditional)>
	//    4    8:areturn         
	}

	public Condition lessThanOrEq(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().lessThanOrEq(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method Condition Condition.lessThanOrEq(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public Condition lessThanOrEq(IConditional iconditional)
	{
		return getCondition().lessThanOrEq(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #135 <Method Condition Condition.lessThanOrEq(IConditional)>
	//    4    8:areturn         
	}

	public Condition like(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().like(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #138 <Method Condition Condition.like(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public Condition like(IConditional iconditional)
	{
		return getCondition().like(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #140 <Method Condition Condition.like(IConditional)>
	//    4    8:areturn         
	}

	public Condition like(String s)
	{
		return getCondition().like(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #142 <Method Condition Condition.like(String)>
	//    4    8:areturn         
	}

	public Condition notEq(BaseModelQueriable basemodelqueriable)
	{
		return getCondition().notEq(basemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #145 <Method Condition Condition.notEq(BaseModelQueriable)>
	//    4    8:areturn         
	}

	public Condition notEq(IConditional iconditional)
	{
		return getCondition().notEq(iconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #147 <Method Condition Condition.notEq(IConditional)>
	//    4    8:areturn         
	}

	public transient com.raizlabs.android.dbflow.sql.language.Condition.In notIn(BaseModelQueriable basemodelqueriable, BaseModelQueriable abasemodelqueriable[])
	{
		return getCondition().notIn(basemodelqueriable, abasemodelqueriable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #150 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.notIn(BaseModelQueriable, BaseModelQueriable[])>
	//    5    9:areturn         
	}

	public transient com.raizlabs.android.dbflow.sql.language.Condition.In notIn(IConditional iconditional, IConditional aiconditional[])
	{
		return getCondition().notIn(iconditional, aiconditional);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #152 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.notIn(IConditional, IConditional[])>
	//    5    9:areturn         
	}

	public Condition notLike(String s)
	{
		return getCondition().notLike(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #155 <Method Condition Condition.notLike(String)>
	//    4    8:areturn         
	}

	public String toString()
	{
		return getNameAlias().toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method NameAlias getNameAlias()>
	//    2    4:invokevirtual   #158 <Method String NameAlias.toString()>
	//    3    7:areturn         
	}

	public IProperty withTable()
	{
		return withTable((new com.raizlabs.android.dbflow.sql.language.NameAlias.Builder(FlowManager.getTableName(table))).build());
	//    0    0:aload_0         
	//    1    1:new             #75  <Class com.raizlabs.android.dbflow.sql.language.NameAlias$Builder>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field Class table>
	//    5    9:invokestatic    #166 <Method String FlowManager.getTableName(Class)>
	//    6   12:invokespecial   #169 <Method void com.raizlabs.android.dbflow.sql.language.NameAlias$Builder(String)>
	//    7   15:invokevirtual   #81  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//    8   18:invokevirtual   #172 <Method IProperty withTable(NameAlias)>
	//    9   21:areturn         
	}

	protected NameAlias nameAlias;
	final Class table;
}
