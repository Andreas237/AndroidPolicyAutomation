// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.stmt.query;

import co.touchlab.squeaky.stmt.JoinAlias;
import java.sql.SQLException;

public interface Queryable
{

	public abstract Queryable and()
		throws SQLException;

	public abstract Queryable between(JoinAlias joinalias, String s, Object obj, Object obj1)
		throws SQLException;

	public abstract Queryable between(String s, Object obj, Object obj1)
		throws SQLException;

	public abstract Queryable end()
		throws SQLException;

	public abstract Queryable eq(JoinAlias joinalias, String s, Object obj)
		throws SQLException;

	public abstract Queryable eq(String s, Object obj)
		throws SQLException;

	public abstract Queryable ge(JoinAlias joinalias, String s, Object obj)
		throws SQLException;

	public abstract Queryable ge(String s, Object obj)
		throws SQLException;

	public abstract String getWhereStatement(boolean flag)
		throws SQLException;

	public abstract Queryable gt(JoinAlias joinalias, String s, Object obj)
		throws SQLException;

	public abstract Queryable gt(String s, Object obj)
		throws SQLException;

	public abstract Queryable in(JoinAlias joinalias, String s, Iterable iterable)
		throws SQLException;

	public transient abstract Queryable in(JoinAlias joinalias, String s, Object aobj[])
		throws SQLException;

	public abstract Queryable in(String s, Iterable iterable)
		throws SQLException;

	public transient abstract Queryable in(String s, Object aobj[])
		throws SQLException;

	public abstract Queryable isNotNull(JoinAlias joinalias, String s)
		throws SQLException;

	public abstract Queryable isNotNull(String s)
		throws SQLException;

	public abstract Queryable isNull(JoinAlias joinalias, String s)
		throws SQLException;

	public abstract Queryable isNull(String s)
		throws SQLException;

	public abstract Queryable le(JoinAlias joinalias, String s, Object obj)
		throws SQLException;

	public abstract Queryable le(String s, Object obj)
		throws SQLException;

	public abstract Queryable like(JoinAlias joinalias, String s, Object obj)
		throws SQLException;

	public abstract Queryable like(String s, Object obj)
		throws SQLException;

	public abstract Queryable lt(JoinAlias joinalias, String s, Object obj)
		throws SQLException;

	public abstract Queryable lt(String s, Object obj)
		throws SQLException;

	public abstract Queryable ne(JoinAlias joinalias, String s, Object obj)
		throws SQLException;

	public abstract Queryable ne(String s, Object obj)
		throws SQLException;

	public abstract Queryable not()
		throws SQLException;

	public abstract Queryable notIn(JoinAlias joinalias, String s, Iterable iterable)
		throws SQLException;

	public transient abstract Queryable notIn(JoinAlias joinalias, String s, Object aobj[])
		throws SQLException;

	public abstract Queryable notIn(String s, Iterable iterable)
		throws SQLException;

	public transient abstract Queryable notIn(String s, Object aobj[])
		throws SQLException;

	public abstract Queryable or()
		throws SQLException;

	public abstract co.touchlab.squeaky.dao.Dao.QueryModifiers query()
		throws SQLException;

	public abstract Queryable reset();
}
