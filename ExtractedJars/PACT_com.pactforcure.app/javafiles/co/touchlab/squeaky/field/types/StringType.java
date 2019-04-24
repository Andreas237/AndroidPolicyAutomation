// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDataType

public class StringType extends BaseDataType
{

	private StringType()
	{
		super(SqlType.STRING, new Class[] {
			java/lang/String
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.STRING>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #24  <Class String>
	//    7   12:aastore         
	//    8   13:invokespecial   #27  <Method void BaseDataType(SqlType, Class[])>
	//    9   16:return          
	}

	protected StringType(SqlType sqltype)
	{
		super(sqltype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void BaseDataType(SqlType)>
	//    3    5:return          
	}

	protected StringType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	public static StringType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field StringType singleTon>
	//    1    3:areturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
	{
		return ((Object) (s));
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (cursor.getString(i)));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #46  <Method String Cursor.getString(int)>
	//    3    7:areturn         
	}

	private static final StringType singleTon = new StringType();

	static 
	{
	//    0    0:new             #2   <Class StringType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void StringType()>
	//    3    7:putstatic       #13  <Field StringType singleTon>
	//*   4   10:return          
	}
}
