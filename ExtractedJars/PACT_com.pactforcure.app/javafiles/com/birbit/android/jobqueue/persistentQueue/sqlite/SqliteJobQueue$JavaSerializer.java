// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;

import com.birbit.android.jobqueue.Job;
import java.io.*;

// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			SqliteJobQueue

public static class SqliteJobQueue$JavaSerializer
	implements SqliteJobQueue.JobSerializer
{

	public Job deserialize(byte abyte0[])
		throws IOException, ClassNotFoundException
	{
		if(abyte0 != null && abyte0.length != 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          9
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:ifne            13
_L1:
		abyte0 = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
_L4:
		return ((Job) (abyte0));
	//    7   11:aload_1         
	//    8   12:areturn         
_L2:
		Job job = null;
	//    9   13:aconst_null     
	//   10   14:astore_3        
		Object obj = ((Object) (new ObjectInputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0))))));
	//   11   15:new             #22  <Class ObjectInputStream>
	//   12   18:dup             
	//   13   19:new             #24  <Class ByteArrayInputStream>
	//   14   22:dup             
	//   15   23:aload_1         
	//   16   24:invokespecial   #27  <Method void ByteArrayInputStream(byte[])>
	//   17   27:invokespecial   #30  <Method void ObjectInputStream(java.io.InputStream)>
	//   18   30:astore_2        
		job = (Job)((ObjectInputStream) (obj)).readObject();
	//   19   31:aload_2         
	//   20   32:invokevirtual   #34  <Method Object ObjectInputStream.readObject()>
	//   21   35:checkcast       #36  <Class Job>
	//   22   38:astore_3        
		abyte0 = ((byte []) (job));
	//   23   39:aload_3         
	//   24   40:astore_1        
		if(obj == null) goto _L4; else goto _L3
	//   25   41:aload_2         
	//   26   42:ifnull          11
_L3:
		((ObjectInputStream) (obj)).close();
	//   27   45:aload_2         
	//   28   46:invokevirtual   #39  <Method void ObjectInputStream.close()>
		return job;
	//   29   49:aload_3         
	//   30   50:areturn         
		obj;
	//   31   51:astore_2        
		abyte0 = ((byte []) (job));
	//   32   52:aload_3         
	//   33   53:astore_1        
_L6:
		if(abyte0 != null)
	//*  34   54:aload_1         
	//*  35   55:ifnull          62
			((ObjectInputStream) (abyte0)).close();
	//   36   58:aload_1         
	//   37   59:invokevirtual   #39  <Method void ObjectInputStream.close()>
		throw obj;
	//   38   62:aload_2         
	//   39   63:athrow          
		Exception exception;
		exception;
	//   40   64:astore_3        
		abyte0 = ((byte []) (obj));
	//   41   65:aload_2         
	//   42   66:astore_1        
		obj = ((Object) (exception));
	//   43   67:aload_3         
	//   44   68:astore_2        
		if(true) goto _L6; else goto _L5
	//   45   69:goto            54
_L5:
	}

	public byte[] serialize(Object obj)
		throws IOException
	{
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       8
_L1:
		obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
_L4:
		return ((byte []) (obj));
	//    4    6:aload_1         
	//    5    7:areturn         
_L2:
		Object obj1 = null;
	//    6    8:aconst_null     
	//    7    9:astore          4
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    8   11:new             #46  <Class ByteArrayOutputStream>
	//    9   14:dup             
	//   10   15:invokespecial   #47  <Method void ByteArrayOutputStream()>
	//   11   18:astore_3        
		byte abyte0[];
		((ObjectOutput) (new ObjectOutputStream(((java.io.OutputStream) (bytearrayoutputstream))))).writeObject(obj);
	//   12   19:new             #49  <Class ObjectOutputStream>
	//   13   22:dup             
	//   14   23:aload_3         
	//   15   24:invokespecial   #52  <Method void ObjectOutputStream(java.io.OutputStream)>
	//   16   27:aload_1         
	//   17   28:invokeinterface #58  <Method void ObjectOutput.writeObject(Object)>
		abyte0 = bytearrayoutputstream.toByteArray();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #62  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   20   37:astore_2        
		obj = ((Object) (abyte0));
	//   21   38:aload_2         
	//   22   39:astore_1        
		if(bytearrayoutputstream == null) goto _L4; else goto _L3
	//   23   40:aload_3         
	//   24   41:ifnull          6
_L3:
		bytearrayoutputstream.close();
	//   25   44:aload_3         
	//   26   45:invokevirtual   #63  <Method void ByteArrayOutputStream.close()>
		return abyte0;
	//   27   48:aload_2         
	//   28   49:areturn         
		Exception exception;
		exception;
	//   29   50:astore_2        
		obj = ((Object) (obj1));
	//   30   51:aload           4
	//   31   53:astore_1        
_L6:
		if(obj != null)
	//*  32   54:aload_1         
	//*  33   55:ifnull          62
			((ByteArrayOutputStream) (obj)).close();
	//   34   58:aload_1         
	//   35   59:invokevirtual   #63  <Method void ByteArrayOutputStream.close()>
		throw exception;
	//   36   62:aload_2         
	//   37   63:athrow          
		exception;
	//   38   64:astore_2        
		obj = ((Object) (bytearrayoutputstream));
	//   39   65:aload_3         
	//   40   66:astore_1        
		if(true) goto _L6; else goto _L5
	//   41   67:goto            54
_L5:
	}

	public SqliteJobQueue$JavaSerializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
