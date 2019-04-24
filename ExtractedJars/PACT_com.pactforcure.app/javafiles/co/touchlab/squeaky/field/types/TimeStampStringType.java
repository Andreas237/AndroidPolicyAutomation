// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			DateStringType

public class TimeStampStringType extends DateStringType
{

	private TimeStampStringType()
	{
		super(SqlType.STRING);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.STRING>
	//    2    4:invokespecial   #23  <Method void DateStringType(SqlType)>
	//    3    7:return          
	}

	protected TimeStampStringType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void DateStringType(SqlType, Class[])>
	//    4    6:return          
	}

	public static TimeStampStringType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field TimeStampStringType singleTon>
	//    1    3:areturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
		return super.javaToSqlArg(fieldtype, ((Object) (new Date(((Timestamp)obj).getTime()))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #34  <Class Date>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:checkcast       #36  <Class Timestamp>
	//    6   10:invokevirtual   #40  <Method long Timestamp.getTime()>
	//    7   13:invokespecial   #43  <Method void Date(long)>
	//    8   16:invokespecial   #45  <Method Object DateStringType.javaToSqlArg(FieldType, Object)>
	//    9   19:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
		throws SQLException
	{
		return ((Object) (new Timestamp(((Date)super.sqlArgToJava(fieldtype, obj, i)).getTime())));
	//    0    0:new             #36  <Class Timestamp>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #51  <Method Object DateStringType.sqlArgToJava(FieldType, Object, int)>
	//    7   11:checkcast       #34  <Class Date>
	//    8   14:invokevirtual   #52  <Method long Date.getTime()>
	//    9   17:invokespecial   #53  <Method void Timestamp(long)>
	//   10   20:areturn         
	}

	private static final TimeStampStringType singleTon = new TimeStampStringType();

	static 
	{
	//    0    0:new             #2   <Class TimeStampStringType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void TimeStampStringType()>
	//    3    7:putstatic       #13  <Field TimeStampStringType singleTon>
	//*   4   10:return          
	}
}
