// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import co.touchlab.squeaky.field.SqlType;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			StringType

public class LongStringType extends StringType
{

	private LongStringType()
	{
		super(SqlType.LONG_STRING);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.LONG_STRING>
	//    2    4:invokespecial   #23  <Method void StringType(SqlType)>
	//    3    7:return          
	}

	protected LongStringType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void StringType(SqlType, Class[])>
	//    4    6:return          
	}

	public static LongStringType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field LongStringType singleTon>
	//    1    3:areturn         
	}

	private static final LongStringType singleTon = new LongStringType();

	static 
	{
	//    0    0:new             #2   <Class LongStringType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void LongStringType()>
	//    3    7:putstatic       #13  <Field LongStringType singleTon>
	//*   4   10:return          
	}
}
