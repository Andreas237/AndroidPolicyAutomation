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

public class BooleanObjectType extends BaseDataType
{

	private BooleanObjectType()
	{
		super(SqlType.BOOLEAN, new Class[] {
			java/lang/Boolean
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.BOOLEAN>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #24  <Class Boolean>
	//    7   12:aastore         
	//    8   13:invokespecial   #27  <Method void BaseDataType(SqlType, Class[])>
	//    9   16:return          
	}

	protected BooleanObjectType(SqlType sqltype)
	{
		super(sqltype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void BaseDataType(SqlType)>
	//    3    5:return          
	}

	protected BooleanObjectType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	public static BooleanObjectType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field BooleanObjectType singleTon>
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
		return ((Object) (Boolean.valueOf(Boolean.parseBoolean(s))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #42  <Method boolean Boolean.parseBoolean(String)>
	//    2    4:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
	//    3    7:areturn         
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		if(cursor.isNull(i) || cursor.getShort(i) == 0)
	//*   0    0:aload_2         
	//*   1    1:iload_3         
	//*   2    2:invokeinterface #56  <Method boolean Cursor.isNull(int)>
	//*   3    7:ifne            20
	//*   4   10:aload_2         
	//*   5   11:iload_3         
	//*   6   12:invokeinterface #60  <Method short Cursor.getShort(int)>
	//*   7   17:ifne            25
			return ((Object) (Boolean.valueOf(false)));
	//    8   20:iconst_0        
	//    9   21:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
	//   10   24:areturn         
		else
			return ((Object) (Boolean.valueOf(true)));
	//   11   25:iconst_1        
	//   12   26:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
	//   13   29:areturn         
	}

	private static final BooleanObjectType singleTon = new BooleanObjectType();

	static 
	{
	//    0    0:new             #2   <Class BooleanObjectType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void BooleanObjectType()>
	//    3    7:putstatic       #13  <Field BooleanObjectType singleTon>
	//*   4   10:return          
	}
}
