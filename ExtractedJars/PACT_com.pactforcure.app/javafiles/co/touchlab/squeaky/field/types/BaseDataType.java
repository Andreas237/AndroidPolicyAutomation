// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.*;
import java.sql.SQLException;

public abstract class BaseDataType extends BaseFieldConverter
	implements DataPersister
{

	public BaseDataType(SqlType sqltype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BaseFieldConverter()>
		sqlType = sqltype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field SqlType sqlType>
		classes = NO_CLASSES;
	//    5    9:aload_0         
	//    6   10:getstatic       #18  <Field Class[] NO_CLASSES>
	//    7   13:putfield        #27  <Field Class[] classes>
	//    8   16:return          
	}

	public BaseDataType(SqlType sqltype, Class aclass[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BaseFieldConverter()>
		sqlType = sqltype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field SqlType sqlType>
		classes = aclass;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field Class[] classes>
	//    8   14:return          
	}

	public String[] getAssociatedClassNames()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class[] getAssociatedClasses()
	{
		return classes;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Class[] classes>
	//    2    4:areturn         
	}

	public SqlType getSqlType()
	{
		return sqlType;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SqlType sqlType>
	//    2    4:areturn         
	}

	public boolean isComparable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isEscapedDefaultValue()
	{
		return isEscapedValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method boolean isEscapedValue()>
	//    2    4:ireturn         
	}

	public boolean isEscapedValue()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isPrimitive()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object makeConfigObject(FieldType fieldtype)
		throws SQLException
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException;

	public Object resultToJava(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return sqlArgToJava(fieldtype, resultToSqlArg(fieldtype, cursor, i), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:iload_3         
	//    6    6:invokevirtual   #56  <Method Object resultToSqlArg(FieldType, Cursor, int)>
	//    7    9:iload_3         
	//    8   10:invokevirtual   #60  <Method Object sqlArgToJava(FieldType, Object, int)>
	//    9   13:areturn         
	}

	public abstract Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException;

	private static final Class NO_CLASSES[] = new Class[0];
	private final Class classes[];
	private final SqlType sqlType;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Class[]
	//    2    4:putstatic       #18  <Field Class[] NO_CLASSES>
	//*   3    7:return          
	}
}
