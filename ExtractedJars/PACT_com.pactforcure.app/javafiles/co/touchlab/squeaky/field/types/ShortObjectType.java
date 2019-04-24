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

public class ShortObjectType extends BaseDataType
{

	private ShortObjectType()
	{
		super(SqlType.SHORT, new Class[] {
			java/lang/Short
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.SHORT>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #24  <Class Short>
	//    7   12:aastore         
	//    8   13:invokespecial   #27  <Method void BaseDataType(SqlType, Class[])>
	//    9   16:return          
	}

	protected ShortObjectType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	public static ShortObjectType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field ShortObjectType singleTon>
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
		return ((Object) (Short.valueOf(Short.parseShort(s))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #39  <Method short Short.parseShort(String)>
	//    2    4:invokestatic    #43  <Method Short Short.valueOf(short)>
	//    3    7:areturn         
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (Short.valueOf(cursor.getShort(i))));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #53  <Method short Cursor.getShort(int)>
	//    3    7:invokestatic    #43  <Method Short Short.valueOf(short)>
	//    4   10:areturn         
	}

	private static final ShortObjectType singleTon = new ShortObjectType();

	static 
	{
	//    0    0:new             #2   <Class ShortObjectType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void ShortObjectType()>
	//    3    7:putstatic       #13  <Field ShortObjectType singleTon>
	//*   4   10:return          
	}
}
