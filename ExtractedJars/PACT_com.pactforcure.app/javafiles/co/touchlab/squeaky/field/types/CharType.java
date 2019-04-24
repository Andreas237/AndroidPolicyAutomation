// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			CharacterObjectType

public class CharType extends CharacterObjectType
{

	private CharType()
	{
		super(SqlType.CHAR, new Class[] {
			Character.TYPE
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.CHAR>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #28  <Field Class Character.TYPE>
	//    7   13:aastore         
	//    8   14:invokespecial   #31  <Method void CharacterObjectType(SqlType, Class[])>
	//    9   17:return          
	}

	protected CharType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void CharacterObjectType(SqlType, Class[])>
	//    4    6:return          
	}

	public static CharType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field CharType singleTon>
	//    1    3:areturn         
	}

	public boolean isPrimitive()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
label0:
		{
			obj = ((Object) ((Character)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #24  <Class Character>
	//    2    4:astore_2        
			if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			{
				fieldtype = ((FieldType) (obj));
	//    5    9:aload_2         
	//    6   10:astore_1        
				if(((Character) (obj)).charValue() != 0)
					break label0;
	//    7   11:aload_2         
	//    8   12:invokevirtual   #43  <Method char Character.charValue()>
	//    9   15:ifne            20
			}
			fieldtype = null;
	//   10   18:aconst_null     
	//   11   19:astore_1        
		}
		return ((Object) (fieldtype));
	//   12   20:aload_1         
	//   13   21:areturn         
	}

	private static final CharType singleTon = new CharType();

	static 
	{
	//    0    0:new             #2   <Class CharType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void CharType()>
	//    3    7:putstatic       #13  <Field CharType singleTon>
	//*   4   10:return          
	}
}
