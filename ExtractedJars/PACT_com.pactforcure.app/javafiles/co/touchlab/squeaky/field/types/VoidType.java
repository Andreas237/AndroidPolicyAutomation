// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDataType

public class VoidType extends BaseDataType
{

	VoidType()
	{
		super(((co.touchlab.squeaky.field.SqlType) (null)), new Class[0]);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iconst_0        
	//    3    3:anewarray       Class[]
	//    4    6:invokespecial   #11  <Method void BaseDataType(co.touchlab.squeaky.field.SqlType, Class[])>
	//    5    9:return          
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}
}
