// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;

import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field:
//			FieldConverter, FieldType

public abstract class BaseFieldConverter
	implements FieldConverter
{

	public BaseFieldConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
		throws SQLException
	{
		return obj;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
		throws SQLException
	{
		return obj;
	//    0    0:aload_2         
	//    1    1:areturn         
	}
}
