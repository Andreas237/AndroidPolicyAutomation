// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;

import android.database.Cursor;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field:
//			BaseFieldConverter, FieldType, SqlType

protected static class FieldType$BooleanNumberFieldConverter extends BaseFieldConverter
{

	public SqlType getSqlType()
	{
		return SqlType.BOOLEAN;
	//    0    0:getstatic       #20  <Field SqlType SqlType.BOOLEAN>
	//    1    3:areturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
		if(((Boolean)obj).booleanValue())
	//*   0    0:aload_2         
	//*   1    1:checkcast       #24  <Class Boolean>
	//*   2    4:invokevirtual   #28  <Method boolean Boolean.booleanValue()>
	//*   3    7:ifeq            15
			return ((Object) (Byte.valueOf((byte)1)));
	//    4   10:iconst_1        
	//    5   11:invokestatic    #34  <Method Byte Byte.valueOf(byte)>
	//    6   14:areturn         
		else
			return ((Object) (Byte.valueOf((byte)0)));
	//    7   15:iconst_0        
	//    8   16:invokestatic    #34  <Method Byte Byte.valueOf(byte)>
	//    9   19:areturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
	{
		if(Boolean.parseBoolean(s))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #40  <Method boolean Boolean.parseBoolean(String)>
	//*   2    4:ifeq            12
			return ((Object) (Byte.valueOf((byte)1)));
	//    3    7:iconst_1        
	//    4    8:invokestatic    #34  <Method Byte Byte.valueOf(byte)>
	//    5   11:areturn         
		else
			return ((Object) (Byte.valueOf((byte)0)));
	//    6   12:iconst_0        
	//    7   13:invokestatic    #34  <Method Byte Byte.valueOf(byte)>
	//    8   16:areturn         
	}

	public Object resultToJava(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return sqlArgToJava(fieldtype, resultToSqlArg(fieldtype, cursor, i), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:iload_3         
	//    6    6:invokevirtual   #47  <Method Object resultToSqlArg(FieldType, Cursor, int)>
	//    7    9:iload_3         
	//    8   10:invokevirtual   #51  <Method Object sqlArgToJava(FieldType, Object, int)>
	//    9   13:areturn         
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (Byte.valueOf((byte)cursor.getShort(i))));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #58  <Method short Cursor.getShort(int)>
	//    3    7:int2byte        
	//    4    8:invokestatic    #34  <Method Byte Byte.valueOf(byte)>
	//    5   11:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		if(((Byte)obj).byteValue() != 1)
	//*   2    3:aload_2         
	//*   3    4:checkcast       #30  <Class Byte>
	//*   4    7:invokevirtual   #62  <Method byte Byte.byteValue()>
	//*   5   10:iconst_1        
	//*   6   11:icmpne          20
	//*   7   14:iload           4
	//*   8   16:invokestatic    #65  <Method Boolean Boolean.valueOf(boolean)>
	//*   9   19:areturn         
			flag = false;
	//   10   20:iconst_0        
	//   11   21:istore          4
		return ((Object) (Boolean.valueOf(flag)));
	//*  12   23:goto            14
	}

	protected FieldType$BooleanNumberFieldConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BaseFieldConverter()>
	//    2    4:return          
	}
}
