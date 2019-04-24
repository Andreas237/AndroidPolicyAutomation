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

public class LongObjectType extends BaseDataType
{

	private LongObjectType()
	{
		super(SqlType.LONG, new Class[] {
			java/lang/Long
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.LONG>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #24  <Class Long>
	//    7   12:aastore         
	//    8   13:invokespecial   #27  <Method void BaseDataType(SqlType, Class[])>
	//    9   16:return          
	}

	protected LongObjectType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	public static LongObjectType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field LongObjectType singleTon>
	//    1    3:areturn         
	}

	public boolean isEscapedValue()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
	{
		return ((Object) (Long.valueOf(Long.parseLong(s))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #39  <Method long Long.parseLong(String)>
	//    2    4:invokestatic    #43  <Method Long Long.valueOf(long)>
	//    3    7:areturn         
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (Long.valueOf(cursor.getLong(i))));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #53  <Method long Cursor.getLong(int)>
	//    3    7:invokestatic    #43  <Method Long Long.valueOf(long)>
	//    4   10:areturn         
	}

	private static final LongObjectType singleTon = new LongObjectType();

	static 
	{
	//    0    0:new             #2   <Class LongObjectType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void LongObjectType()>
	//    3    7:putstatic       #13  <Field LongObjectType singleTon>
	//*   4   10:return          
	}
}
