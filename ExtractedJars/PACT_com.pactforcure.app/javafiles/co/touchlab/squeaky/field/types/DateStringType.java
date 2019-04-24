// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import co.touchlab.squeaky.misc.SqlExceptionUtil;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDateType

public class DateStringType extends BaseDateType
{

	private DateStringType()
	{
		super(SqlType.STRING);
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field SqlType SqlType.STRING>
	//    2    4:invokespecial   #27  <Method void BaseDateType(SqlType)>
	//    3    7:return          
	}

	protected DateStringType(SqlType sqltype)
	{
		super(sqltype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void BaseDateType(SqlType)>
	//    3    5:return          
	}

	protected DateStringType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #30  <Method void BaseDateType(SqlType, Class[])>
	//    4    6:return          
	}

	public static DateStringType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #17  <Field DateStringType singleTon>
	//    1    3:areturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
		return ((Object) (convertDateStringConfig(fieldtype, defaultDateFormatConfig).getDateFormat().format((Date)obj)));
	//    0    0:aload_1         
	//    1    1:getstatic       #40  <Field BaseDateType$DateStringFormatConfig defaultDateFormatConfig>
	//    2    4:invokestatic    #44  <Method BaseDateType$DateStringFormatConfig convertDateStringConfig(FieldType, BaseDateType$DateStringFormatConfig)>
	//    3    7:invokevirtual   #50  <Method DateFormat BaseDateType$DateStringFormatConfig.getDateFormat()>
	//    4   10:aload_2         
	//    5   11:checkcast       #52  <Class Date>
	//    6   14:invokevirtual   #58  <Method String DateFormat.format(Date)>
	//    7   17:areturn         
	}

	public Object makeConfigObject(FieldType fieldtype)
	{
		fieldtype = ((FieldType) (fieldtype.getFormat()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method String FieldType.getFormat()>
	//    2    4:astore_1        
		if(fieldtype == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return ((Object) (defaultDateFormatConfig));
	//    5    9:getstatic       #40  <Field BaseDateType$DateStringFormatConfig defaultDateFormatConfig>
	//    6   12:areturn         
		else
			return ((Object) (new BaseDateType.DateStringFormatConfig(((String) (fieldtype)))));
	//    7   13:new             #46  <Class BaseDateType$DateStringFormatConfig>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #69  <Method void BaseDateType$DateStringFormatConfig(String)>
	//   11   21:areturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException
	{
		BaseDateType.DateStringFormatConfig datestringformatconfig = convertDateStringConfig(fieldtype, defaultDateFormatConfig);
	//    0    0:aload_1         
	//    1    1:getstatic       #40  <Field BaseDateType$DateStringFormatConfig defaultDateFormatConfig>
	//    2    4:invokestatic    #44  <Method BaseDateType$DateStringFormatConfig convertDateStringConfig(FieldType, BaseDateType$DateStringFormatConfig)>
	//    3    7:astore_3        
		String s1;
		try
		{
			s1 = normalizeDateString(datestringformatconfig, s);
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokestatic    #79  <Method String normalizeDateString(BaseDateType$DateStringFormatConfig, String)>
	//    7   13:astore          4
		}
	//*   8   15:aload           4
	//*   9   17:areturn         
		catch(ParseException parseexception)
	//*  10   18:astore          4
		{
			throw SqlExceptionUtil.create((new StringBuilder()).append("Problems with field ").append(((Object) (fieldtype))).append(" parsing default date-string '").append(s).append("' using '").append(((Object) (datestringformatconfig))).append("'").toString(), ((Throwable) (parseexception)));
	//   11   20:new             #81  <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #82  <Method void StringBuilder()>
	//   14   27:ldc1            #84  <String "Problems with field ">
	//   15   29:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #91  <Method StringBuilder StringBuilder.append(Object)>
	//   18   36:ldc1            #93  <String " parsing default date-string '">
	//   19   38:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:aload_2         
	//   21   42:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:ldc1            #95  <String "' using '">
	//   23   47:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:aload_3         
	//   25   51:invokevirtual   #91  <Method StringBuilder StringBuilder.append(Object)>
	//   26   54:ldc1            #97  <String "'">
	//   27   56:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   28   59:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   29   62:aload           4
	//   30   64:invokestatic    #106 <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   31   67:athrow          
		}
		return ((Object) (s1));
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (cursor.getString(i)));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #115 <Method String Cursor.getString(int)>
	//    3    7:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
		throws SQLException
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #119 <Class String>
	//    2    4:astore_2        
		fieldtype = ((FieldType) (convertDateStringConfig(fieldtype, defaultDateFormatConfig)));
	//    3    5:aload_1         
	//    4    6:getstatic       #40  <Field BaseDateType$DateStringFormatConfig defaultDateFormatConfig>
	//    5    9:invokestatic    #44  <Method BaseDateType$DateStringFormatConfig convertDateStringConfig(FieldType, BaseDateType$DateStringFormatConfig)>
	//    6   12:astore_1        
		Date date;
		try
		{
			date = parseDateString(((BaseDateType.DateStringFormatConfig) (fieldtype)), ((String) (obj)));
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokestatic    #123 <Method Date parseDateString(BaseDateType$DateStringFormatConfig, String)>
	//   10   18:astore          4
		}
	//*  11   20:aload           4
	//*  12   22:areturn         
		catch(ParseException parseexception)
	//*  13   23:astore          4
		{
			throw SqlExceptionUtil.create((new StringBuilder()).append("Problems with column ").append(i).append(" parsing date-string '").append(((String) (obj))).append("' using '").append(((Object) (fieldtype))).append("'").toString(), ((Throwable) (parseexception)));
	//   14   25:new             #81  <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #82  <Method void StringBuilder()>
	//   17   32:ldc1            #125 <String "Problems with column ">
	//   18   34:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:iload_3         
	//   20   38:invokevirtual   #128 <Method StringBuilder StringBuilder.append(int)>
	//   21   41:ldc1            #130 <String " parsing date-string '">
	//   22   43:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:aload_2         
	//   24   47:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:ldc1            #95  <String "' using '">
	//   26   52:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:aload_1         
	//   28   56:invokevirtual   #91  <Method StringBuilder StringBuilder.append(Object)>
	//   29   59:ldc1            #97  <String "'">
	//   30   61:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   32   67:aload           4
	//   33   69:invokestatic    #106 <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   34   72:athrow          
		}
		return ((Object) (date));
	}

	public static int DEFAULT_WIDTH = 50;
	private static final DateStringType singleTon = new DateStringType();

	static 
	{
	//    0    0:bipush          50
	//    1    2:putstatic       #12  <Field int DEFAULT_WIDTH>
	//    2    5:new             #2   <Class DateStringType>
	//    3    8:dup             
	//    4    9:invokespecial   #15  <Method void DateStringType()>
	//    5   12:putstatic       #17  <Field DateStringType singleTon>
	//*   6   15:return          
	}
}
