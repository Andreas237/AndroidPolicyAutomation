// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.Query;
import java.util.Collection;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			IConditional, Condition

public interface ITypeConditional
	extends Query, IConditional
{

	public abstract Condition.Between between(Object obj);

	public abstract Condition concatenate(Object obj);

	public abstract Condition eq(Object obj);

	public abstract Condition greaterThan(Object obj);

	public abstract Condition greaterThanOrEq(Object obj);

	public transient abstract Condition.In in(Object obj, Object aobj[]);

	public abstract Condition.In in(Collection collection);

	public abstract Condition is(Object obj);

	public abstract Condition isNot(Object obj);

	public abstract Condition lessThan(Object obj);

	public abstract Condition lessThanOrEq(Object obj);

	public abstract Condition notEq(Object obj);

	public transient abstract Condition.In notIn(Object obj, Object aobj[]);

	public abstract Condition.In notIn(Collection collection);
}
