// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import java.sql.Timestamp;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			DateType

public class TimeStampType extends DateType
{

	private TimeStampType()
	{
		super(SqlType.DATE, new Class[] {
			java/sql/Timestamp
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.DATE>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #24  <Class Timestamp>
	//    7   12:aastore         
	//    8   13:invokespecial   #27  <Method void DateType(SqlType, Class[])>
	//    9   16:return          
	}

	protected TimeStampType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void DateType(SqlType, Class[])>
	//    4    6:return          
	}

	public static TimeStampType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field TimeStampType singleTon>
	//    1    3:areturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
		return obj;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
	{
		return obj;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	private static final TimeStampType singleTon = new TimeStampType();

	static 
	{
	//    0    0:new             #2   <Class TimeStampType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void TimeStampType()>
	//    3    7:putstatic       #13  <Field TimeStampType singleTon>
	//*   4   10:return          
	}
}
