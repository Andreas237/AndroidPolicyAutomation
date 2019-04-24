// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import co.touchlab.squeaky.misc.SqlExceptionUtil;
import java.math.BigDecimal;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDataType

public class BigDecimalStringType extends BaseDataType
{

	private BigDecimalStringType()
	{
		super(SqlType.STRING, new Class[] {
			java/math/BigDecimal
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field SqlType SqlType.STRING>
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #28  <Class BigDecimal>
	//    7   12:aastore         
	//    8   13:invokespecial   #31  <Method void BaseDataType(SqlType, Class[])>
	//    9   16:return          
	}

	protected BigDecimalStringType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	public static BigDecimalStringType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #17  <Field BigDecimalStringType singleTon>
	//    1    3:areturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
		return ((Object) (((BigDecimal)obj).toString()));
	//    0    0:aload_2         
	//    1    1:checkcast       #28  <Class BigDecimal>
	//    2    4:invokevirtual   #41  <Method String BigDecimal.toString()>
	//    3    7:areturn         
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException
	{
		String s1;
		try
		{
			s1 = (new BigDecimal(s)).toString();
	//    0    0:new             #28  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #50  <Method void BigDecimal(String)>
	//    4    8:invokevirtual   #41  <Method String BigDecimal.toString()>
	//    5   11:astore_3        
		}
	//*   6   12:aload_3         
	//*   7   13:areturn         
		catch(IllegalArgumentException illegalargumentexception)
	//*   8   14:astore_3        
		{
			throw SqlExceptionUtil.create((new StringBuilder()).append("Problems with field ").append(((Object) (fieldtype))).append(" parsing default BigDecimal string '").append(s).append("'").toString(), ((Throwable) (illegalargumentexception)));
	//    9   15:new             #52  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #53  <Method void StringBuilder()>
	//   12   22:ldc1            #55  <String "Problems with field ">
	//   13   24:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:aload_1         
	//   15   28:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:ldc1            #64  <String " parsing default BigDecimal string '">
	//   17   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:ldc1            #66  <String "'">
	//   21   42:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   23   48:aload_3         
	//   24   49:invokestatic    #73  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   25   52:athrow          
		}
		return ((Object) (s1));
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (cursor.getString(i)));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #82  <Method String Cursor.getString(int)>
	//    3    7:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
		throws SQLException
	{
		try
		{
			fieldtype = ((FieldType) (new BigDecimal((String)obj)));
	//    0    0:new             #28  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:checkcast       #86  <Class String>
	//    4    8:invokespecial   #50  <Method void BigDecimal(String)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(FieldType fieldtype)
	//*   8   14:astore_1        
		{
			throw SqlExceptionUtil.create((new StringBuilder()).append("Problems with column ").append(i).append(" parsing BigDecimal string '").append(obj).append("'").toString(), ((Throwable) (fieldtype)));
	//    9   15:new             #52  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #53  <Method void StringBuilder()>
	//   12   22:ldc1            #88  <String "Problems with column ">
	//   13   24:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:iload_3         
	//   15   28:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   16   31:ldc1            #93  <String " parsing BigDecimal string '">
	//   17   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   20   40:ldc1            #66  <String "'">
	//   21   42:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   23   48:aload_1         
	//   24   49:invokestatic    #73  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   25   52:athrow          
		}
		return ((Object) (fieldtype));
	}

	public static int DEFAULT_WIDTH = 255;
	private static final BigDecimalStringType singleTon = new BigDecimalStringType();

	static 
	{
	//    0    0:sipush          255
	//    1    3:putstatic       #12  <Field int DEFAULT_WIDTH>
	//    2    6:new             #2   <Class BigDecimalStringType>
	//    3    9:dup             
	//    4   10:invokespecial   #15  <Method void BigDecimalStringType()>
	//    5   13:putstatic       #17  <Field BigDecimalStringType singleTon>
	//*   6   16:return          
	}
}
