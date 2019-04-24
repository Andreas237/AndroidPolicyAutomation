// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.stmt.query;

import co.touchlab.squeaky.dao.SqueakyContext;
import java.sql.SQLException;
import java.util.List;

public interface Clause
{

	public abstract void appendSql(SqueakyContext squeakycontext, StringBuilder stringbuilder, boolean flag)
		throws SQLException;

	public abstract void appendValue(SqueakyContext squeakycontext, List list)
		throws SQLException;
}
