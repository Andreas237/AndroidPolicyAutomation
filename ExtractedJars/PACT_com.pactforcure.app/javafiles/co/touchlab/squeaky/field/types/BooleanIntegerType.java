// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BooleanType

public class BooleanIntegerType extends BooleanType
{

	public BooleanIntegerType()
	{
		super(SqlType.INTEGER);
	//    0    0:aload_0         
	//    1    1:getstatic       #33  <Field SqlType SqlType.INTEGER>
	//    2    4:invokespecial   #36  <Method void BooleanType(SqlType)>
	//    3    7:return          
	}

	public static BooleanIntegerType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #26  <Field BooleanIntegerType singleTon>
	//    1    3:areturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
		if(((Boolean)obj).booleanValue())
	//*   0    0:aload_2         
	//*   1    1:checkcast       #42  <Class Boolean>
	//*   2    4:invokevirtual   #46  <Method boolean Boolean.booleanValue()>
	//*   3    7:ifeq            14
			return ((Object) (TRUE_VALUE));
	//    4   10:getstatic       #19  <Field Integer TRUE_VALUE>
	//    5   13:areturn         
		else
			return ((Object) (FALSE_VALUE));
	//    6   14:getstatic       #21  <Field Integer FALSE_VALUE>
	//    7   17:areturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
	{
		return javaToSqlArg(fieldtype, ((Object) (Boolean.valueOf(Boolean.parseBoolean(s)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #52  <Method boolean Boolean.parseBoolean(String)>
	//    4    6:invokestatic    #55  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokevirtual   #57  <Method Object javaToSqlArg(FieldType, Object)>
	//    6   12:areturn         
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (Integer.valueOf(cursor.getInt(i))));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #67  <Method int Cursor.getInt(int)>
	//    3    7:invokestatic    #17  <Method Integer Integer.valueOf(int)>
	//    4   10:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
	{
		if(((Integer)obj).intValue() == 0)
	//*   0    0:aload_2         
	//*   1    1:checkcast       #13  <Class Integer>
	//*   2    4:invokevirtual   #74  <Method int Integer.intValue()>
	//*   3    7:ifne            14
			return ((Object) (Boolean.FALSE));
	//    4   10:getstatic       #78  <Field Boolean Boolean.FALSE>
	//    5   13:areturn         
		else
			return ((Object) (Boolean.TRUE));
	//    6   14:getstatic       #81  <Field Boolean Boolean.TRUE>
	//    7   17:areturn         
	}

	private static final Integer FALSE_VALUE = Integer.valueOf(0);
	private static final Integer TRUE_VALUE = Integer.valueOf(1);
	private static final BooleanIntegerType singleTon = new BooleanIntegerType();

	static 
	{
	//    0    0:iconst_1        
	//    1    1:invokestatic    #17  <Method Integer Integer.valueOf(int)>
	//    2    4:putstatic       #19  <Field Integer TRUE_VALUE>
	//    3    7:iconst_0        
	//    4    8:invokestatic    #17  <Method Integer Integer.valueOf(int)>
	//    5   11:putstatic       #21  <Field Integer FALSE_VALUE>
	//    6   14:new             #2   <Class BooleanIntegerType>
	//    7   17:dup             
	//    8   18:invokespecial   #24  <Method void BooleanIntegerType()>
	//    9   21:putstatic       #26  <Field BooleanIntegerType singleTon>
	//*  10   24:return          
	}
}
