// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import co.touchlab.squeaky.misc.SqlExceptionUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDataType

public class DateTimeType extends BaseDataType
{

	private DateTimeType()
	{
		super(SqlType.LONG);
	//    0    0:aload_0         
	//    1    1:getstatic       #42  <Field SqlType SqlType.LONG>
	//    2    4:invokespecial   #45  <Method void BaseDataType(SqlType)>
	//    3    7:return          
	}

	protected DateTimeType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #48  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	private Object createInstance(Long long1)
		throws SQLException
	{
		try
		{
			if(millisConstructor == null)
	//*   0    0:getstatic       #29  <Field Constructor millisConstructor>
	//*   1    3:ifnonnull       26
				millisConstructor = getDateTimeClass().getConstructor(new Class[] {
					Long.TYPE
				});
	//    2    6:aload_0         
	//    3    7:invokespecial   #60  <Method Class getDateTimeClass()>
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #67  <Field Class Long.TYPE>
	//    9   19:aastore         
	//   10   20:invokevirtual   #71  <Method Constructor Class.getConstructor(Class[])>
	//   11   23:putstatic       #29  <Field Constructor millisConstructor>
			long1 = ((Long) (millisConstructor.newInstance(new Object[] {
				long1
			})));
	//   12   26:getstatic       #29  <Field Constructor millisConstructor>
	//   13   29:iconst_1        
	//   14   30:anewarray       Object[]
	//   15   33:dup             
	//   16   34:iconst_0        
	//   17   35:aload_1         
	//   18   36:aastore         
	//   19   37:invokevirtual   #79  <Method Object Constructor.newInstance(Object[])>
	//   20   40:astore_1        
		}
	//*  21   41:aload_1         
	//*  22   42:areturn         
		// Misplaced declaration of an exception variable
		catch(Long long1)
	//*  23   43:astore_1        
		{
			throw SqlExceptionUtil.create("Could not use reflection to construct a Joda DateTime", ((Throwable) (long1)));
	//   24   44:ldc1            #81  <String "Could not use reflection to construct a Joda DateTime">
	//   25   46:aload_1         
	//   26   47:invokestatic    #87  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   27   50:athrow          
		}
		return ((Object) (long1));
	}

	private Long extractMillis(Object obj)
		throws SQLException
	{
	//*   0    0:getstatic       #27  <Field Method getMillisMethod>
	//*   1    3:ifnonnull       67
	//*   2    6:aload_0         
	//*   3    7:invokespecial   #60  <Method Class getDateTimeClass()>
	//*   4   10:ldc1            #92  <String "getMillis">
	//*   5   12:iconst_0        
	//*   6   13:anewarray       Class[]
	//*   7   16:invokevirtual   #96  <Method Method Class.getMethod(String, Class[])>
	//*   8   19:putstatic       #27  <Field Method getMillisMethod>
	//*   9   22:goto            67
_L2:
		long1 = (Long)getMillisMethod.invoke(obj, new Object[0]);
	//   10   25:getstatic       #27  <Field Method getMillisMethod>
	//   11   28:aload_1         
	//   12   29:iconst_0        
	//   13   30:anewarray       Object[]
	//   14   33:invokevirtual   #102 <Method Object Method.invoke(Object, Object[])>
	//   15   36:checkcast       #64  <Class Long>
	//   16   39:astore_2        
		return long1;
	//   17   40:aload_2         
	//   18   41:areturn         
		Long long1;
		try
		{
			if(getMillisMethod == null)
				getMillisMethod = getDateTimeClass().getMethod("getMillis", new Class[0]);
		}
		catch(Exception exception)
	//*  19   42:astore_2        
		{
			throw SqlExceptionUtil.create((new StringBuilder()).append("Could not use reflection to get millis from Joda DateTime: ").append(obj).toString(), ((Throwable) (exception)));
	//   20   43:new             #104 <Class StringBuilder>
	//   21   46:dup             
	//   22   47:invokespecial   #105 <Method void StringBuilder()>
	//   23   50:ldc1            #107 <String "Could not use reflection to get millis from Joda DateTime: ">
	//   24   52:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:aload_1         
	//   26   56:invokevirtual   #114 <Method StringBuilder StringBuilder.append(Object)>
	//   27   59:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   28   62:aload_2         
	//   29   63:invokestatic    #87  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   30   66:athrow          
		}
		if(obj == null)
	//*  31   67:aload_1         
	//*  32   68:ifnonnull       25
			return null;
	//   33   71:aconst_null     
	//   34   72:areturn         
		if(true) goto _L2; else goto _L1
_L1:
	}

	private Class getDateTimeClass()
		throws ClassNotFoundException
	{
		if(dateTimeClass == null)
	//*   0    0:getstatic       #25  <Field Class dateTimeClass>
	//*   1    3:ifnonnull       14
			dateTimeClass = Class.forName("org.joda.time.DateTime");
	//    2    6:ldc1            #33  <String "org.joda.time.DateTime">
	//    3    8:invokestatic    #124 <Method Class Class.forName(String)>
	//    4   11:putstatic       #25  <Field Class dateTimeClass>
		return dateTimeClass;
	//    5   14:getstatic       #25  <Field Class dateTimeClass>
	//    6   17:areturn         
	}

	public static DateTimeType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #23  <Field DateTimeType singleTon>
	//    1    3:areturn         
	}

	public String[] getAssociatedClassNames()
	{
		return associatedClassNames;
	//    0    0:getstatic       #35  <Field String[] associatedClassNames>
	//    1    3:areturn         
	}

	public boolean isEscapedValue()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
		throws SQLException
	{
		return ((Object) (extractMillis(obj)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #135 <Method Long extractMillis(Object)>
	//    3    5:areturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException
	{
		long l;
		try
		{
			l = Long.parseLong(s);
	//    0    0:aload_2         
	//    1    1:invokestatic    #143 <Method long Long.parseLong(String)>
	//    2    4:lstore_3        
		}
	//*   3    5:lload_3         
	//*   4    6:invokestatic    #147 <Method Long Long.valueOf(long)>
	//*   5    9:areturn         
		catch(NumberFormatException numberformatexception)
	//*   6   10:astore          5
		{
			throw SqlExceptionUtil.create((new StringBuilder()).append("Problems with field ").append(((Object) (fieldtype))).append(" parsing default DateTime value: ").append(s).toString(), ((Throwable) (numberformatexception)));
	//    7   12:new             #104 <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #105 <Method void StringBuilder()>
	//   10   19:ldc1            #149 <String "Problems with field ">
	//   11   21:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #114 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:ldc1            #151 <String " parsing default DateTime value: ">
	//   15   30:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:aload_2         
	//   17   34:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   19   40:aload           5
	//   20   42:invokestatic    #87  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
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
	//    2    2:invokeinterface #159 <Method long Cursor.getLong(int)>
	//    3    7:invokestatic    #147 <Method Long Long.valueOf(long)>
	//    4   10:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
		throws SQLException
	{
		return createInstance((Long)obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:checkcast       #64  <Class Long>
	//    3    5:invokespecial   #163 <Method Object createInstance(Long)>
	//    4    8:areturn         
	}

	private static final String associatedClassNames[] = {
		"org.joda.time.DateTime"
	};
	private static Class dateTimeClass = null;
	private static Method getMillisMethod = null;
	private static Constructor millisConstructor = null;
	private static final DateTimeType singleTon = new DateTimeType();

	static 
	{
	//    0    0:new             #2   <Class DateTimeType>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void DateTimeType()>
	//    3    7:putstatic       #23  <Field DateTimeType singleTon>
	//    4   10:aconst_null     
	//    5   11:putstatic       #25  <Field Class dateTimeClass>
	//    6   14:aconst_null     
	//    7   15:putstatic       #27  <Field Method getMillisMethod>
	//    8   18:aconst_null     
	//    9   19:putstatic       #29  <Field Constructor millisConstructor>
	//   10   22:iconst_1        
	//   11   23:anewarray       String[]
	//   12   26:dup             
	//   13   27:iconst_0        
	//   14   28:ldc1            #33  <String "org.joda.time.DateTime">
	//   15   30:aastore         
	//   16   31:putstatic       #35  <Field String[] associatedClassNames>
	//*  17   34:return          
	}
}
