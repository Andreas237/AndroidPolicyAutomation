// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;

import android.database.Cursor;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field:
//			SqlType, FieldType

public interface FieldConverter
{

	public abstract SqlType getSqlType();

	public abstract Object javaToSqlArg(FieldType fieldtype, Object obj)
		throws SQLException;

	public abstract Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException;

	public abstract Object resultToJava(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException;

	public abstract Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException;

	public abstract Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
		throws SQLException;
}
