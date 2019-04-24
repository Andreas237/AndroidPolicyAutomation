// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDataType

public abstract class BaseEnumType extends BaseDataType
{

	protected BaseEnumType(SqlType sqltype)
	{
		super(sqltype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void BaseDataType(SqlType)>
	//    3    5:return          
	}

	protected BaseEnumType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	protected static Enum enumVal(FieldType fieldtype, Object obj, Enum enum)
		throws SQLException
	{
		if(enum != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          6
			return enum;
	//    2    4:aload_2         
	//    3    5:areturn         
		else
			throw new SQLException((new StringBuilder()).append("Cannot get enum value of '").append(obj).append("' for field ").append(((Object) (fieldtype))).toString());
	//    4    6:new             #18  <Class SQLException>
	//    5    9:dup             
	//    6   10:new             #20  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void StringBuilder()>
	//    9   17:ldc1            #25  <String "Cannot get enum value of '">
	//   10   19:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #32  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:ldc1            #34  <String "' for field ">
	//   14   28:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #32  <Method StringBuilder StringBuilder.append(Object)>
	//   17   35:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   18   38:invokespecial   #41  <Method void SQLException(String)>
	//   19   41:athrow          
	}
}
