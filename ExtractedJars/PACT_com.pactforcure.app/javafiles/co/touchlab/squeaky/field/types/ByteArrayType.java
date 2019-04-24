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

public class ByteArrayType extends BaseDataType
{

	private ByteArrayType()
	{
		super(SqlType.BYTE_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.BYTE_ARRAY>
	//    2    4:invokespecial   #23  <Method void BaseDataType(SqlType)>
	//    3    7:return          
	}

	protected ByteArrayType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	public static ByteArrayType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field ByteArrayType singleTon>
	//    1    3:areturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException
	{
		throw new SQLException("byte[] type cannot have default values");
	//    0    0:new             #34  <Class SQLException>
	//    1    3:dup             
	//    2    4:ldc1            #36  <String "byte[] type cannot have default values">
	//    3    6:invokespecial   #39  <Method void SQLException(String)>
	//    4    9:athrow          
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (cursor.getBlob(i)));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #48  <Method byte[] Cursor.getBlob(int)>
	//    3    7:areturn         
	}

	private static final ByteArrayType singleTon = new ByteArrayType();

	static 
	{
	//    0    0:new             #2   <Class ByteArrayType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void ByteArrayType()>
	//    3    7:putstatic       #13  <Field ByteArrayType singleTon>
	//*   4   10:return          
	}
}
