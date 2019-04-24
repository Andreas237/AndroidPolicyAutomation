// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import android.database.Cursor;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import co.touchlab.squeaky.misc.IOUtils;
import co.touchlab.squeaky.misc.SqlExceptionUtil;
import java.io.*;
import java.sql.SQLException;
import java.util.Arrays;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDataType

public class SerializableType extends BaseDataType
{

	private SerializableType()
	{
		super(SqlType.SERIALIZABLE);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field SqlType SqlType.SERIALIZABLE>
	//    2    4:invokespecial   #23  <Method void BaseDataType(SqlType)>
	//    3    7:return          
	}

	protected SerializableType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	public static SerializableType getSingleton()
	{
		return singleTon;
	//    0    0:getstatic       #13  <Field SerializableType singleTon>
	//    1    3:areturn         
	}

	public boolean isComparable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object javaToSqlArg(FieldType fieldtype, Object obj)
		throws SQLException
	{
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		fieldtype = ((FieldType) (obj1));
	//    2    2:aload_3         
	//    3    3:astore_1        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    4    4:new             #40  <Class ByteArrayOutputStream>
	//    5    7:dup             
	//    6    8:invokespecial   #41  <Method void ByteArrayOutputStream()>
	//    7   11:astore          4
		fieldtype = ((FieldType) (obj1));
	//    8   13:aload_3         
	//    9   14:astore_1        
		obj1 = ((Object) (new ObjectOutputStream(((java.io.OutputStream) (bytearrayoutputstream)))));
	//   10   15:new             #43  <Class ObjectOutputStream>
	//   11   18:dup             
	//   12   19:aload           4
	//   13   21:invokespecial   #46  <Method void ObjectOutputStream(java.io.OutputStream)>
	//   14   24:astore_3        
		((ObjectOutputStream) (obj1)).writeObject(obj);
	//   15   25:aload_3         
	//   16   26:aload_2         
	//   17   27:invokevirtual   #50  <Method void ObjectOutputStream.writeObject(Object)>
		((ObjectOutputStream) (obj1)).close();
	//   18   30:aload_3         
	//   19   31:invokevirtual   #53  <Method void ObjectOutputStream.close()>
		fieldtype = null;
	//   20   34:aconst_null     
	//   21   35:astore_1        
		obj1 = ((Object) (bytearrayoutputstream.toByteArray()));
	//   22   36:aload           4
	//   23   38:invokevirtual   #57  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   24   41:astore_3        
		IOUtils.closeQuietly(((java.io.Closeable) (null)));
	//   25   42:aconst_null     
	//   26   43:invokestatic    #63  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return obj1;
	//   27   46:aload_3         
	//   28   47:areturn         
		fieldtype = null;
	//   29   48:aconst_null     
	//   30   49:astore_1        
		obj1;
	//   31   50:astore_3        
_L4:
		throw SqlExceptionUtil.create((new StringBuilder()).append("Could not write serialized object to byte array: ").append(obj).toString(), ((Throwable) (obj1)));
	//   32   51:new             #65  <Class StringBuilder>
	//   33   54:dup             
	//   34   55:invokespecial   #66  <Method void StringBuilder()>
	//   35   58:ldc1            #68  <String "Could not write serialized object to byte array: ">
	//   36   60:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   37   63:aload_2         
	//   38   64:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   39   67:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   40   70:aload_3         
	//   41   71:invokestatic    #85  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   42   74:athrow          
		obj;
	//   43   75:astore_2        
_L2:
		IOUtils.closeQuietly(((java.io.Closeable) (fieldtype)));
	//   44   76:aload_1         
	//   45   77:invokestatic    #63  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		throw obj;
	//   46   80:aload_2         
	//   47   81:athrow          
		obj;
	//   48   82:astore_2        
		fieldtype = ((FieldType) (obj1));
	//   49   83:aload_3         
	//   50   84:astore_1        
		if(true) goto _L2; else goto _L1
	//   51   85:goto            76
_L1:
		Exception exception;
		exception;
	//   52   88:astore          4
		fieldtype = ((FieldType) (obj1));
	//   53   90:aload_3         
	//   54   91:astore_1        
		obj1 = ((Object) (exception));
	//   55   92:aload           4
	//   56   94:astore_3        
		if(true) goto _L4; else goto _L3
	//   57   95:goto            51
_L3:
	}

	public Object parseDefaultString(FieldType fieldtype, String s)
		throws SQLException
	{
		throw new SQLException("Default values for serializable types are not supported");
	//    0    0:new             #36  <Class SQLException>
	//    1    3:dup             
	//    2    4:ldc1            #90  <String "Default values for serializable types are not supported">
	//    3    6:invokespecial   #93  <Method void SQLException(String)>
	//    4    9:athrow          
	}

	public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
		throws SQLException
	{
		return ((Object) (cursor.getBlob(i)));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #101 <Method byte[] Cursor.getBlob(int)>
	//    3    7:areturn         
	}

	public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
		throws SQLException
	{
		Object obj1;
		byte abyte0[];
		abyte0 = (byte[])(byte[])obj;
	//    0    0:aload_2         
	//    1    1:checkcast       #105 <Class byte[]>
	//    2    4:checkcast       #105 <Class byte[]>
	//    3    7:astore          5
		fieldtype = null;
	//    4    9:aconst_null     
	//    5   10:astore_1        
		obj1 = null;
	//    6   11:aconst_null     
	//    7   12:astore          4
		obj = ((Object) (new ObjectInputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0))))));
	//    8   14:new             #107 <Class ObjectInputStream>
	//    9   17:dup             
	//   10   18:new             #109 <Class ByteArrayInputStream>
	//   11   21:dup             
	//   12   22:aload           5
	//   13   24:invokespecial   #112 <Method void ByteArrayInputStream(byte[])>
	//   14   27:invokespecial   #115 <Method void ObjectInputStream(java.io.InputStream)>
	//   15   30:astore_2        
		fieldtype = ((FieldType) (((ObjectInputStream) (obj)).readObject()));
	//   16   31:aload_2         
	//   17   32:invokevirtual   #119 <Method Object ObjectInputStream.readObject()>
	//   18   35:astore_1        
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   19   36:aload_2         
	//   20   37:invokestatic    #63  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return ((Object) (fieldtype));
	//   21   40:aload_1         
	//   22   41:areturn         
		obj;
	//   23   42:astore_2        
		fieldtype = ((FieldType) (obj1));
	//   24   43:aload           4
	//   25   45:astore_1        
_L4:
		throw SqlExceptionUtil.create((new StringBuilder()).append("Could not read serialized object from byte array: ").append(Arrays.toString(abyte0)).append("(len ").append(abyte0.length).append(")").toString(), ((Throwable) (obj)));
	//   26   46:new             #65  <Class StringBuilder>
	//   27   49:dup             
	//   28   50:invokespecial   #66  <Method void StringBuilder()>
	//   29   53:ldc1            #121 <String "Could not read serialized object from byte array: ">
	//   30   55:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:aload           5
	//   32   60:invokestatic    #126 <Method String Arrays.toString(byte[])>
	//   33   63:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   34   66:ldc1            #128 <String "(len ">
	//   35   68:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:aload           5
	//   37   73:arraylength     
	//   38   74:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   39   77:ldc1            #133 <String ")">
	//   40   79:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   41   82:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   42   85:aload_2         
	//   43   86:invokestatic    #85  <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   44   89:athrow          
		obj;
	//   45   90:astore_2        
_L2:
		IOUtils.closeQuietly(((java.io.Closeable) (fieldtype)));
	//   46   91:aload_1         
	//   47   92:invokestatic    #63  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		throw obj;
	//   48   95:aload_2         
	//   49   96:athrow          
		Object obj2;
		obj2;
	//   50   97:astore          4
		fieldtype = ((FieldType) (obj));
	//   51   99:aload_2         
	//   52  100:astore_1        
		obj = obj2;
	//   53  101:aload           4
	//   54  103:astore_2        
		if(true) goto _L2; else goto _L1
	//   55  104:goto            91
_L1:
		obj2;
	//   56  107:astore          4
		fieldtype = ((FieldType) (obj));
	//   57  109:aload_2         
	//   58  110:astore_1        
		obj = obj2;
	//   59  111:aload           4
	//   60  113:astore_2        
		if(true) goto _L4; else goto _L3
	//   61  114:goto            46
_L3:
	}

	private static final SerializableType singleTon = new SerializableType();

	static 
	{
	//    0    0:new             #2   <Class SerializableType>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void SerializableType()>
	//    3    7:putstatic       #13  <Field SerializableType singleTon>
	//*   4   10:return          
	}
}
