// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import java.sql.SQLException;
import java.util.List;

// Referenced classes of package co.touchlab.squeaky.dao:
//			Dao

public static interface Dao$QueryModifiers
{

	public abstract Dao$QueryModifiers foreignRefreshMap(Dao$ForeignRefresh adao$foreignrefresh[]);

	public abstract Dao$QueryModifiers limit(Integer integer);

	public abstract List list()
		throws SQLException;

	public abstract Dao$QueryModifiers offset(Integer integer);

	public abstract Dao$QueryModifiers orderBy(String s);
}
