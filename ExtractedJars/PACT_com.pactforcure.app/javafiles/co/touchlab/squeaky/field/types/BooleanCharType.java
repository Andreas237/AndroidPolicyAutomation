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

public class BooleanCharType extends BooleanType
{

	public BooleanCharType()
	{
		super(SqlType.STRING);
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field SqlType SqlType.STRING>
	//    2    4:invokespecial   #27  <Method void BooleanType(SqlType)>
	//    3    7:return          
	}

	public static BooleanCharType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #17  <Field BooleanCharType singleTon>
	//    1    3:areturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
	{
		fieldtype = ((FieldType) ((String)fieldtype.getDataTypeConfigObj()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method Object FieldType.getDataTypeConfigObj()>
	//    2    4:checkcast       #39  <Class String>
	//    3    7:astore_1        
		char c;
		if(((Boolean)obj).booleanValue())
	//*   4    8:aload_2         
	//*   5    9:checkcast       #41  <Class Boolean>
	//*   6   12:invokevirtual   #45  <Method boolean Boolean.booleanValue()>
	//*   7   15:ifeq            29
			c = ((String) (fieldtype)).charAt(0);
	//    8   18:aload_1         
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #49  <Method char String.charAt(int)>
	//   11   23:istore_3        
		else
	//*  12   24:iload_3         
	//*  13   25:invokestatic    #55  <Method Character Character.valueOf(char)>
	//*  14   28:areturn         
			c = ((String) (fieldtype)).charAt(1);
	//   15   29:aload_1         
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #49  <Method char String.charAt(int)>
	//   18   34:istore_3        
		return ((Object) (Character.valueOf(c)));
	//*  19   35:goto            24
	}

	public Object makeConfigObject(FieldType fieldtype)
		throws SQLException
	{
		String s = fieldtype.getFormat();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #63  <Method String FieldType.getFormat()>
	//    2    4:astore_2        
		if(s != null) goto _L2; else goto _L1
	//    3    5:aload_2         
	//    4    6:ifnonnull       14
_L1:
		fieldtype = "10";
	//    5    9:ldc1            #8   <String "10">
	//    6   11:astore_1        
_L4:
		return ((Object) (fieldtype));
	//    7   12:aload_1         
	//    8   13:areturn         
_L2:
		if(s.length() != 2)
			break; /* Loop/switch isn't completed */
	//    9   14:aload_2         
	//   10   15:invokevirtual   #67  <Method int String.length()>
	//   11   18:iconst_2        
	//   12   19:icmpne          37
		fieldtype = ((FieldType) (s));
	//   13   22:aload_2         
	//   14   23:astore_1        
		if(s.charAt(0) != s.charAt(1)) goto _L4; else goto _L3
	//   15   24:aload_2         
	//   16   25:iconst_0        
	//   17   26:invokevirtual   #49  <Method char String.charAt(int)>
	//   18   29:aload_2         
	//   19   30:iconst_1        
	//   20   31:invokevirtual   #49  <Method char String.charAt(int)>
	//   21   34:icmpne          12
_L3:
		throw new SQLException((new StringBuilder()).append("Invalid boolean format must have 2 different characters that represent true/false like \"10\" or \"tf\": ").append(s).toString());
	//   22   37:new             #59  <Class SQLException>
	//   23   40:dup             
	//   24   41:new             #69  <Class StringBuilder>
	//   25   44:dup             
	//   26   45:invokespecial   #70  <Method void StringBuilder()>
	//   27   48:ldc1            #72  <String "Invalid boolean format must have 2 different characters that represent true/false like \"10\" or \"tf\": ">
	//   28   50:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:aload_2         
	//   30   54:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   31   57:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   32   60:invokespecial   #82  <Method void SQLException(String)>
	//   33   63:athrow          
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
	{
		return javaToSqlArg(fieldtype, ((Object) (Boolean.valueOf(Boolean.parseBoolean(s)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #89  <Method boolean Boolean.parseBoolean(String)>
	//    4    6:invokestatic    #92  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokevirtual   #94  <Method Object javaToSqlArg(FieldType, Object)>
	//    6   12:areturn         
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		fieldtype = ((FieldType) (cursor.getString(i)));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #102 <Method String Cursor.getString(int)>
	//    3    7:astore_1        
		if(fieldtype == null || ((String) (fieldtype)).length() == 0)
	//*   4    8:aload_1         
	//*   5    9:ifnull          19
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #67  <Method int String.length()>
	//*   8   16:ifne            24
			return ((Object) (Integer.valueOf(0)));
	//    9   19:iconst_0        
	//   10   20:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   11   23:areturn         
		if(((String) (fieldtype)).length() == 1)
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #67  <Method int String.length()>
	//*  14   28:iconst_1        
	//*  15   29:icmpne          41
			return ((Object) (Character.valueOf(((String) (fieldtype)).charAt(0))));
	//   16   32:aload_1         
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #49  <Method char String.charAt(int)>
	//   19   37:invokestatic    #55  <Method Character Character.valueOf(char)>
	//   20   40:areturn         
		else
			throw new SQLException((new StringBuilder()).append("More than 1 character stored in database column: ").append(i).toString());
	//   21   41:new             #59  <Class SQLException>
	//   22   44:dup             
	//   23   45:new             #69  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #70  <Method void StringBuilder()>
	//   26   52:ldc1            #109 <String "More than 1 character stored in database column: ">
	//   27   54:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:iload_3         
	//   29   58:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   30   61:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   31   64:invokespecial   #82  <Method void SQLException(String)>
	//   32   67:athrow          
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
	{
		fieldtype = ((FieldType) ((String)fieldtype.getDataTypeConfigObj()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method Object FieldType.getDataTypeConfigObj()>
	//    2    4:checkcast       #39  <Class String>
	//    3    7:astore_1        
		if(((Character)obj).charValue() == ((String) (fieldtype)).charAt(0))
	//*   4    8:aload_2         
	//*   5    9:checkcast       #51  <Class Character>
	//*   6   12:invokevirtual   #118 <Method char Character.charValue()>
	//*   7   15:aload_1         
	//*   8   16:iconst_0        
	//*   9   17:invokevirtual   #49  <Method char String.charAt(int)>
	//*  10   20:icmpne          27
			return ((Object) (Boolean.TRUE));
	//   11   23:getstatic       #122 <Field Boolean Boolean.TRUE>
	//   12   26:areturn         
		else
			return ((Object) (Boolean.FALSE));
	//   13   27:getstatic       #125 <Field Boolean Boolean.FALSE>
	//   14   30:areturn         
	}

	private static final String DEFAULT_TRUE_FALSE_FORMAT = "10";
	private static final BooleanCharType singleTon = new BooleanCharType();

	static 
	{
	//    0    0:new             #2   <Class BooleanCharType>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void BooleanCharType()>
	//    3    7:putstatic       #17  <Field BooleanCharType singleTon>
	//*   4   10:return          
	}
}
