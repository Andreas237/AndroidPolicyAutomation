// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import co.touchlab.squeaky.misc.SqlExceptionUtil;
import java.sql.SQLException;
import java.util.Date;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDateType

public class DateLongType extends BaseDateType
{

	private DateLongType()
	{
		super(SqlType.LONG);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.LONG>
	//    2    4:invokespecial   #23  <Method void BaseDateType(SqlType)>
	//    3    7:return          
	}

	protected DateLongType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void BaseDateType(SqlType, Class[])>
	//    4    6:return          
	}

	public static DateLongType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field DateLongType singleTon>
	//    1    3:areturn         
	}

	public boolean isEscapedValue()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
		return ((Object) (Long.valueOf(((Date)obj).getTime())));
	//    0    0:aload_2         
	//    1    1:checkcast       #36  <Class Date>
	//    2    4:invokevirtual   #40  <Method long Date.getTime()>
	//    3    7:invokestatic    #46  <Method Long Long.valueOf(long)>
	//    4   10:areturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException
	{
		long l;
		try
		{
			l = Long.parseLong(s);
	//    0    0:aload_2         
	//    1    1:invokestatic    #56  <Method long Long.parseLong(String)>
	//    2    4:lstore_3        
		}
	//*   3    5:lload_3         
	//*   4    6:invokestatic    #46  <Method Long Long.valueOf(long)>
	//*   5    9:areturn         
		catch(NumberFormatException numberformatexception)
	//*   6   10:astore          5
		{
			throw SqlExceptionUtil.create((new StringBuilder()).append("Problems with field ").append(((Object) (fieldtype))).append(" parsing default date-long value: ").append(s).toString(), ((Throwable) (numberformatexception)));
	//    7   12:new             #58  <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #59  <Method void StringBuilder()>
	//   10   19:ldc1            #61  <String "Problems with field ">
	//   11   21:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:ldc1            #70  <String " parsing default date-long value: ">
	//   15   30:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:aload_2         
	//   17   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   19   40:aload           5
	//   20   42:invokestatic    #80  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   21   45:athrow          
		}
		return ((Object) (Long.valueOf(l)));
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (Long.valueOf(cursor.getLong(i))));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #89  <Method long Cursor.getLong(int)>
	//    3    7:invokestatic    #46  <Method Long Long.valueOf(long)>
	//    4   10:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
	{
		return ((Object) (new Date(((Long)obj).longValue())));
	//    0    0:new             #36  <Class Date>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:checkcast       #42  <Class Long>
	//    4    8:invokevirtual   #94  <Method long Long.longValue()>
	//    5   11:invokespecial   #97  <Method void Date(long)>
	//    6   14:areturn         
	}

	private static final DateLongType singleTon = new DateLongType();

	static 
	{
	//    0    0:new             #2   <Class DateLongType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void DateLongType()>
	//    3    7:putstatic       #13  <Field DateLongType singleTon>
	//*   4   10:return          
	}
}
