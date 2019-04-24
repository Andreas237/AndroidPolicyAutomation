// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseEnumType

public class EnumStringType extends BaseEnumType
{

	private EnumStringType()
	{
		super(SqlType.STRING, new Class[] {
			java/lang/Enum
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.STRING>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #24  <Class Enum>
	//    7   12:aastore         
	//    8   13:invokespecial   #27  <Method void BaseEnumType(SqlType, Class[])>
	//    9   16:return          
	}

	protected EnumStringType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void BaseEnumType(SqlType, Class[])>
	//    4    6:return          
	}

	public static EnumStringType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field EnumStringType singleTon>
	//    1    3:areturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
		return ((Object) (((Enum)obj).name()));
	//    0    0:aload_2         
	//    1    1:checkcast       #24  <Class Enum>
	//    2    4:invokevirtual   #37  <Method String Enum.name()>
	//    3    7:areturn         
	}

	public Object makeConfigObject(FieldType fieldtype)
		throws SQLException
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #43  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void HashMap()>
	//    3    7:astore          4
		Enum aenum[] = (Enum[])(Enum[])fieldtype.getFieldType().getEnumConstants();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #50  <Method Class FieldType.getFieldType()>
	//    6   13:invokevirtual   #54  <Method Object[] Class.getEnumConstants()>
	//    7   16:checkcast       #56  <Class Enum[]>
	//    8   19:checkcast       #56  <Class Enum[]>
	//    9   22:astore          5
		if(aenum == null)
	//*  10   24:aload           5
	//*  11   26:ifnonnull       65
			throw new SQLException((new StringBuilder()).append("Field ").append(((Object) (fieldtype))).append(" improperly configured as type ").append(((Object) (this))).toString());
	//   12   29:new             #41  <Class SQLException>
	//   13   32:dup             
	//   14   33:new             #58  <Class StringBuilder>
	//   15   36:dup             
	//   16   37:invokespecial   #59  <Method void StringBuilder()>
	//   17   40:ldc1            #61  <String "Field ">
	//   18   42:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   19   45:aload_1         
	//   20   46:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   21   49:ldc1            #70  <String " improperly configured as type ">
	//   22   51:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   23   54:aload_0         
	//   24   55:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   25   58:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   26   61:invokespecial   #76  <Method void SQLException(String)>
	//   27   64:athrow          
		int j = aenum.length;
	//   28   65:aload           5
	//   29   67:arraylength     
	//   30   68:istore_3        
		for(int i = 0; i < j; i++)
	//*  31   69:iconst_0        
	//*  32   70:istore_2        
	//*  33   71:iload_2         
	//*  34   72:iload_3         
	//*  35   73:icmpge          101
		{
			fieldtype = ((FieldType) (aenum[i]));
	//   36   76:aload           5
	//   37   78:iload_2         
	//   38   79:aaload          
	//   39   80:astore_1        
			((Map) (hashmap)).put(((Object) (((Enum) (fieldtype)).name())), ((Object) (fieldtype)));
	//   40   81:aload           4
	//   41   83:aload_1         
	//   42   84:invokevirtual   #37  <Method String Enum.name()>
	//   43   87:aload_1         
	//   44   88:invokeinterface #82  <Method Object Map.put(Object, Object)>
	//   45   93:pop             
		}

	//   46   94:iload_2         
	//   47   95:iconst_1        
	//   48   96:iadd            
	//   49   97:istore_2        
	//*  50   98:goto            71
		return ((Object) (hashmap));
	//   51  101:aload           4
	//   52  103:areturn         
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
	//    2    2:invokeinterface #93  <Method String Cursor.getString(int)>
	//    3    7:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
		throws SQLException
	{
		if(fieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return obj;
	//    2    4:aload_2         
	//    3    5:areturn         
		obj = ((Object) ((String)obj));
	//    4    6:aload_2         
	//    5    7:checkcast       #97  <Class String>
	//    6   10:astore_2        
		Map map = (Map)fieldtype.getDataTypeConfigObj();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #101 <Method Object FieldType.getDataTypeConfigObj()>
	//    9   15:checkcast       #78  <Class Map>
	//   10   18:astore          4
		if(map == null)
	//*  11   20:aload           4
	//*  12   22:ifnonnull       32
			return ((Object) (enumVal(fieldtype, obj, ((Enum) (null)))));
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:aconst_null     
	//   16   28:invokestatic    #105 <Method Enum enumVal(FieldType, Object, Enum)>
	//   17   31:areturn         
		else
			return ((Object) (enumVal(fieldtype, obj, (Enum)map.get(obj))));
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:aload           4
	//   21   36:aload_2         
	//   22   37:invokeinterface #109 <Method Object Map.get(Object)>
	//   23   42:checkcast       #24  <Class Enum>
	//   24   45:invokestatic    #105 <Method Enum enumVal(FieldType, Object, Enum)>
	//   25   48:areturn         
	}

	private static final EnumStringType singleTon = new EnumStringType();

	static 
	{
	//    0    0:new             #2   <Class EnumStringType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void EnumStringType()>
	//    3    7:putstatic       #13  <Field EnumStringType singleTon>
	//*   4   10:return          
	}
}
