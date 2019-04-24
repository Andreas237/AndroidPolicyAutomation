// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import co.touchlab.squeaky.misc.SqlExceptionUtil;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDateType

public class DateType extends BaseDateType
{

	private DateType()
	{
		super(SqlType.DATE, new Class[] {
			java/util/Date
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.DATE>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #24  <Class Date>
	//    7   12:aastore         
	//    8   13:invokespecial   #27  <Method void BaseDateType(SqlType, Class[])>
	//    9   16:return          
	}

	protected DateType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void BaseDateType(SqlType, Class[])>
	//    4    6:return          
	}

	public static DateType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field DateType singleTon>
	//    1    3:areturn         
	}

	protected BaseDateType.DateStringFormatConfig getDefaultDateFormatConfig()
	{
		return defaultDateFormatConfig;
	//    0    0:getstatic       #37  <Field BaseDateType$DateStringFormatConfig defaultDateFormatConfig>
	//    1    3:areturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
		return ((Object) (new Timestamp(((Date)obj).getTime())));
	//    0    0:new             #41  <Class Timestamp>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:checkcast       #24  <Class Date>
	//    4    8:invokevirtual   #45  <Method long Date.getTime()>
	//    5   11:invokespecial   #48  <Method void Timestamp(long)>
	//    6   14:areturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException
	{
		fieldtype = ((FieldType) (convertDateStringConfig(fieldtype, getDefaultDateFormatConfig())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #56  <Method BaseDateType$DateStringFormatConfig getDefaultDateFormatConfig()>
	//    3    5:invokestatic    #60  <Method BaseDateType$DateStringFormatConfig convertDateStringConfig(FieldType, BaseDateType$DateStringFormatConfig)>
	//    4    8:astore_1        
		Timestamp timestamp;
		try
		{
			timestamp = new Timestamp(parseDateString(((BaseDateType.DateStringFormatConfig) (fieldtype)), s).getTime());
	//    5    9:new             #41  <Class Timestamp>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokestatic    #64  <Method Date parseDateString(BaseDateType$DateStringFormatConfig, String)>
	//   10   18:invokevirtual   #45  <Method long Date.getTime()>
	//   11   21:invokespecial   #48  <Method void Timestamp(long)>
	//   12   24:astore_3        
		}
	//*  13   25:aload_3         
	//*  14   26:areturn         
		catch(ParseException parseexception)
	//*  15   27:astore_3        
		{
			throw SqlExceptionUtil.create((new StringBuilder()).append("Problems parsing default date string '").append(s).append("' using '").append(((Object) (fieldtype))).append('\'').toString(), ((Throwable) (parseexception)));
	//   16   28:new             #66  <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #67  <Method void StringBuilder()>
	//   19   35:ldc1            #69  <String "Problems parsing default date string '">
	//   20   37:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:aload_2         
	//   22   41:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:ldc1            #75  <String "' using '">
	//   24   46:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   27   53:bipush          39
	//   28   55:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   29   58:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   30   61:aload_3         
	//   31   62:invokestatic    #91  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   32   65:athrow          
		}
		return ((Object) (timestamp));
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		throw new SQLException("Android does not support timestamp.  Use JAVA_DATE_LONG or JAVA_DATE_STRING types");
	//    0    0:new             #52  <Class SQLException>
	//    1    3:dup             
	//    2    4:ldc1            #96  <String "Android does not support timestamp.  Use JAVA_DATE_LONG or JAVA_DATE_STRING types">
	//    3    6:invokespecial   #99  <Method void SQLException(String)>
	//    4    9:athrow          
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
	{
		return ((Object) (new Date(((Timestamp)obj).getTime())));
	//    0    0:new             #24  <Class Date>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:checkcast       #41  <Class Timestamp>
	//    4    8:invokevirtual   #102 <Method long Timestamp.getTime()>
	//    5   11:invokespecial   #103 <Method void Date(long)>
	//    6   14:areturn         
	}

	private static final DateType singleTon = new DateType();

	static 
	{
	//    0    0:new             #2   <Class DateType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void DateType()>
	//    3    7:putstatic       #13  <Field DateType singleTon>
	//*   4   10:return          
	}
}
