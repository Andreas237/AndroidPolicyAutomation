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

public class CharacterObjectType extends BaseDataType
{

	private CharacterObjectType()
	{
		super(SqlType.CHAR, new Class[] {
			java/lang/Character
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.CHAR>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #24  <Class Character>
	//    7   12:aastore         
	//    8   13:invokespecial   #27  <Method void BaseDataType(SqlType, Class[])>
	//    9   16:return          
	}

	protected CharacterObjectType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	public static CharacterObjectType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field CharacterObjectType singleTon>
	//    1    3:areturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException
	{
		if(s.length() != 1)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #41  <Method int String.length()>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          49
			throw new SQLException((new StringBuilder()).append("Problems with field ").append(((Object) (fieldtype))).append(", default string to long for Character: '").append(s).append("'").toString());
	//    4    8:new             #35  <Class SQLException>
	//    5   11:dup             
	//    6   12:new             #43  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #44  <Method void StringBuilder()>
	//    9   19:ldc1            #46  <String "Problems with field ">
	//   10   21:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   13   28:ldc1            #55  <String ", default string to long for Character: '">
	//   14   30:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:ldc1            #57  <String "'">
	//   18   39:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   20   45:invokespecial   #64  <Method void SQLException(String)>
	//   21   48:athrow          
		else
			return ((Object) (Character.valueOf(s.charAt(0))));
	//   22   49:aload_2         
	//   23   50:iconst_0        
	//   24   51:invokevirtual   #68  <Method char String.charAt(int)>
	//   25   54:invokestatic    #72  <Method Character Character.valueOf(char)>
	//   26   57:areturn         
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		fieldtype = ((FieldType) (cursor.getString(i)));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #81  <Method String Cursor.getString(int)>
	//    3    7:astore_1        
		if(fieldtype == null || ((String) (fieldtype)).length() == 0)
	//*   4    8:aload_1         
	//*   5    9:ifnull          19
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #41  <Method int String.length()>
	//*   8   16:ifne            24
			return ((Object) (Integer.valueOf(0)));
	//    9   19:iconst_0        
	//   10   20:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   11   23:areturn         
		if(((String) (fieldtype)).length() == 1)
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #41  <Method int String.length()>
	//*  14   28:iconst_1        
	//*  15   29:icmpne          41
			return ((Object) (Character.valueOf(((String) (fieldtype)).charAt(0))));
	//   16   32:aload_1         
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #68  <Method char String.charAt(int)>
	//   19   37:invokestatic    #72  <Method Character Character.valueOf(char)>
	//   20   40:areturn         
		else
			throw new SQLException((new StringBuilder()).append("More than 1 character stored in database column: ").append(i).toString());
	//   21   41:new             #35  <Class SQLException>
	//   22   44:dup             
	//   23   45:new             #43  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #44  <Method void StringBuilder()>
	//   26   52:ldc1            #88  <String "More than 1 character stored in database column: ">
	//   27   54:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:iload_3         
	//   29   58:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   30   61:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   31   64:invokespecial   #64  <Method void SQLException(String)>
	//   32   67:athrow          
	}

	private static final CharacterObjectType singleTon = new CharacterObjectType();

	static 
	{
	//    0    0:new             #2   <Class CharacterObjectType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void CharacterObjectType()>
	//    3    7:putstatic       #13  <Field CharacterObjectType singleTon>
	//*   4   10:return          
	}
}
