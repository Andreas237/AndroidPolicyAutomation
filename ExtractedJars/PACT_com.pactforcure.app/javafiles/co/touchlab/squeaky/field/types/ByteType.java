// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import co.touchlab.squeaky.field.SqlType;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			ByteObjectType

public class ByteType extends ByteObjectType
{

	private ByteType()
	{
		super(SqlType.BYTE, new Class[] {
			Byte.TYPE
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.BYTE>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #28  <Field Class Byte.TYPE>
	//    7   13:aastore         
	//    8   14:invokespecial   #31  <Method void ByteObjectType(SqlType, Class[])>
	//    9   17:return          
	}

	protected ByteType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void ByteObjectType(SqlType, Class[])>
	//    4    6:return          
	}

	public static ByteType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field ByteType singleTon>
	//    1    3:areturn         
	}

	public boolean isPrimitive()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final ByteType singleTon = new ByteType();

	static 
	{
	//    0    0:new             #2   <Class ByteType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void ByteType()>
	//    3    7:putstatic       #13  <Field ByteType singleTon>
	//*   4   10:return          
	}
}
