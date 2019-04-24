// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.Query;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			BaseModelQueriable, Condition

public interface IConditional
	extends Query
{

	public abstract Condition.Between between(BaseModelQueriable basemodelqueriable);

	public abstract Condition.Between between(IConditional iconditional);

	public abstract Condition concatenate(IConditional iconditional);

	public abstract Condition eq(BaseModelQueriable basemodelqueriable);

	public abstract Condition eq(IConditional iconditional);

	public abstract Condition glob(BaseModelQueriable basemodelqueriable);

	public abstract Condition glob(IConditional iconditional);

	public abstract Condition glob(String s);

	public abstract Condition greaterThan(BaseModelQueriable basemodelqueriable);

	public abstract Condition greaterThan(IConditional iconditional);

	public abstract Condition greaterThanOrEq(BaseModelQueriable basemodelqueriable);

	public abstract Condition greaterThanOrEq(IConditional iconditional);

	public transient abstract Condition.In in(BaseModelQueriable basemodelqueriable, BaseModelQueriable abasemodelqueriable[]);

	public transient abstract Condition.In in(IConditional iconditional, IConditional aiconditional[]);

	public abstract Condition is(BaseModelQueriable basemodelqueriable);

	public abstract Condition is(IConditional iconditional);

	public abstract Condition isNot(BaseModelQueriable basemodelqueriable);

	public abstract Condition isNot(IConditional iconditional);

	public abstract Condition isNotNull();

	public abstract Condition isNull();

	public abstract Condition lessThan(BaseModelQueriable basemodelqueriable);

	public abstract Condition lessThan(IConditional iconditional);

	public abstract Condition lessThanOrEq(BaseModelQueriable basemodelqueriable);

	public abstract Condition lessThanOrEq(IConditional iconditional);

	public abstract Condition like(BaseModelQueriable basemodelqueriable);

	public abstract Condition like(IConditional iconditional);

	public abstract Condition like(String s);

	public abstract Condition notEq(BaseModelQueriable basemodelqueriable);

	public abstract Condition notEq(IConditional iconditional);

	public transient abstract Condition.In notIn(BaseModelQueriable basemodelqueriable, BaseModelQueriable abasemodelqueriable[]);

	public transient abstract Condition.In notIn(IConditional iconditional, IConditional aiconditional[]);

	public abstract Condition notLike(String s);
}
