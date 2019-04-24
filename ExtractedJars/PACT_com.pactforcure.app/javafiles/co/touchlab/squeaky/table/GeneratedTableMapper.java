// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.table;

import android.database.Cursor;
import co.touchlab.squeaky.dao.ModelDao;
import co.touchlab.squeaky.db.SQLiteStatement;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.table:
//			TransientCache, TableInfo

public interface GeneratedTableMapper
{

	public abstract void assignId(Object obj, Object obj1);

	public abstract void bindCreateVals(SQLiteStatement sqlitestatement, Object obj)
		throws SQLException;

	public abstract void bindVals(SQLiteStatement sqlitestatement, Object obj)
		throws SQLException;

	public abstract Object createObject(Cursor cursor)
		throws SQLException;

	public abstract Object extractId(Object obj);

	public abstract void fillForeignCollection(Object obj, ModelDao modeldao, String s)
		throws SQLException;

	public abstract void fillRow(Object obj, Cursor cursor, ModelDao modeldao, co.touchlab.squeaky.dao.Dao.ForeignRefresh aforeignrefresh[], TransientCache transientcache)
		throws SQLException;

	public abstract TableInfo getTableConfig()
		throws SQLException;

	public abstract String objectToString(Object obj)
		throws SQLException;

	public abstract boolean objectsEqual(Object obj, Object obj1)
		throws SQLException;
}
