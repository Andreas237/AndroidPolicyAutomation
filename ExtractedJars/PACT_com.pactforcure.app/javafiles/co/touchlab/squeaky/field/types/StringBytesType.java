// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import co.touchlab.squeaky.misc.SqlExceptionUtil;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDataType

public class StringBytesType extends BaseDataType
{

	private StringBytesType()
	{
		super(SqlType.BYTE_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field SqlType SqlType.BYTE_ARRAY>
	//    2    4:invokespecial   #27  <Method void BaseDataType(SqlType)>
	//    3    7:return          
	}

	protected StringBytesType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #30  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	private String getCharsetName(FieldType fieldtype)
	{
		if(fieldtype == null || fieldtype.getFormat() == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #40  <Method String FieldType.getFormat()>
	//*   4    8:ifnonnull       14
			return "Unicode";
	//    5   11:ldc1            #8   <String "Unicode">
	//    6   13:areturn         
		else
			return fieldtype.getFormat();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #40  <Method String FieldType.getFormat()>
	//    9   18:areturn         
	}

	public static StringBytesType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #17  <Field StringBytesType singleTon>
	//    1    3:areturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
		throws SQLException
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #50  <Class String>
	//    2    4:astore_2        
		fieldtype = ((FieldType) (getCharsetName(fieldtype)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #52  <Method String getCharsetName(FieldType)>
	//    6   10:astore_1        
		try
		{
			obj = ((Object) (((String) (obj)).getBytes(((String) (fieldtype)))));
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #56  <Method byte[] String.getBytes(String)>
	//   10   16:astore_2        
		}
	//*  11   17:aload_2         
	//*  12   18:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  13   19:astore_2        
		{
			throw SqlExceptionUtil.create((new StringBuilder()).append("Could not convert string with charset name: ").append(((String) (fieldtype))).toString(), ((Throwable) (obj)));
	//   14   20:new             #58  <Class StringBuilder>
	//   15   23:dup             
	//   16   24:invokespecial   #59  <Method void StringBuilder()>
	//   17   27:ldc1            #61  <String "Could not convert string with charset name: ">
	//   18   29:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   19   32:aload_1         
	//   20   33:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   21   36:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   22   39:aload_2         
	//   23   40:invokestatic    #74  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   24   43:athrow          
		}
		return obj;
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException
	{
		throw new SQLException("String-bytes type cannot have default values");
	//    0    0:new             #46  <Class SQLException>
	//    1    3:dup             
	//    2    4:ldc1            #79  <String "String-bytes type cannot have default values">
	//    3    6:invokespecial   #82  <Method void SQLException(String)>
	//    4    9:athrow          
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (cursor.getBlob(i)));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #90  <Method byte[] Cursor.getBlob(int)>
	//    3    7:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
		throws SQLException
	{
		obj = ((Object) ((byte[])(byte[])obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #94  <Class byte[]>
	//    2    4:checkcast       #94  <Class byte[]>
	//    3    7:astore_2        
		fieldtype = ((FieldType) (getCharsetName(fieldtype)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #52  <Method String getCharsetName(FieldType)>
	//    7   13:astore_1        
		try
		{
			obj = ((Object) (new String(((byte []) (obj)), ((String) (fieldtype)))));
	//    8   14:new             #50  <Class String>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokespecial   #97  <Method void String(byte[], String)>
	//   13   23:astore_2        
		}
	//*  14   24:aload_2         
	//*  15   25:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  16   26:astore_2        
		{
			throw SqlExceptionUtil.create((new StringBuilder()).append("Could not convert string with charset name: ").append(((String) (fieldtype))).toString(), ((Throwable) (obj)));
	//   17   27:new             #58  <Class StringBuilder>
	//   18   30:dup             
	//   19   31:invokespecial   #59  <Method void StringBuilder()>
	//   20   34:ldc1            #61  <String "Could not convert string with charset name: ">
	//   21   36:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:aload_1         
	//   23   40:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   25   46:aload_2         
	//   26   47:invokestatic    #74  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   27   50:athrow          
		}
		return obj;
	}

	private static final String DEFAULT_STRING_BYTES_CHARSET_NAME = "Unicode";
	private static final StringBytesType singleTon = new StringBytesType();

	static 
	{
	//    0    0:new             #2   <Class StringBytesType>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void StringBytesType()>
	//    3    7:putstatic       #17  <Field StringBytesType singleTon>
	//*   4   10:return          
	}
}
