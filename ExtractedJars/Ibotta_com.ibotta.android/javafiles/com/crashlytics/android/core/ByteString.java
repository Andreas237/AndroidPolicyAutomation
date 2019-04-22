// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.*;

final class ByteString
{

	private ByteString(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		hash = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #23  <Field int hash>
		bytes = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #25  <Field byte[] bytes>
	//    8   14:return          
	}

	public static ByteString copyFrom(byte abyte0[], int i, int j)
	{
		byte abyte1[] = new byte[j];
	//    0    0:iload_2         
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte1)), 0, j);
	//    3    4:aload_0         
	//    4    5:iload_1         
	//    5    6:aload_3         
	//    6    7:iconst_0        
	//    7    8:iload_2         
	//    8    9:invokestatic    #33  <Method void System.arraycopy(Object, int, Object, int, int)>
		return new ByteString(abyte1);
	//    9   12:new             #2   <Class ByteString>
	//   10   15:dup             
	//   11   16:aload_3         
	//   12   17:invokespecial   #16  <Method void ByteString(byte[])>
	//   13   20:areturn         
	}

	public static ByteString copyFromUtf8(String s)
	{
		try
		{
			s = ((String) (new ByteString(s.getBytes("UTF-8"))));
	//    0    0:new             #2   <Class ByteString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #39  <String "UTF-8">
	//    4    7:invokevirtual   #45  <Method byte[] String.getBytes(String)>
	//    5   10:invokespecial   #16  <Method void ByteString(byte[])>
	//    6   13:astore_0        
		}
	//*   7   14:aload_0         
	//*   8   15:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   16:astore_0        
		{
			throw new RuntimeException("UTF-8 not supported.", ((Throwable) (s)));
	//   10   17:new             #47  <Class RuntimeException>
	//   11   20:dup             
	//   12   21:ldc1            #49  <String "UTF-8 not supported.">
	//   13   23:aload_0         
	//   14   24:invokespecial   #52  <Method void RuntimeException(String, Throwable)>
	//   15   27:athrow          
		}
		return ((ByteString) (s));
	}

	public void copyTo(byte abyte0[], int i, int j, int k)
	{
		System.arraycopy(((Object) (bytes)), i, ((Object) (abyte0)), j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field byte[] bytes>
	//    2    4:iload_2         
	//    3    5:aload_1         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokestatic    #33  <Method void System.arraycopy(Object, int, Object, int, int)>
	//    7   12:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof ByteString))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ByteString>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		ByteString bytestring = (ByteString)obj;
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ByteString>
	//   12   20:astore          4
		obj = ((Object) (bytes));
	//   13   22:aload_0         
	//   14   23:getfield        #25  <Field byte[] bytes>
	//   15   26:astore_1        
		int j = obj.length;
	//   16   27:aload_1         
	//   17   28:arraylength     
	//   18   29:istore_3        
		byte abyte0[] = bytestring.bytes;
	//   19   30:aload           4
	//   20   32:getfield        #25  <Field byte[] bytes>
	//   21   35:astore          4
		if(j != abyte0.length)
	//*  22   37:iload_3         
	//*  23   38:aload           4
	//*  24   40:arraylength     
	//*  25   41:icmpeq          46
			return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
		for(int i = 0; i < j; i++)
	//*  28   46:iconst_0        
	//*  29   47:istore_2        
	//*  30   48:iload_2         
	//*  31   49:iload_3         
	//*  32   50:icmpge          72
			if(obj[i] != abyte0[i])
	//*  33   53:aload_1         
	//*  34   54:iload_2         
	//*  35   55:baload          
	//*  36   56:aload           4
	//*  37   58:iload_2         
	//*  38   59:baload          
	//*  39   60:icmpeq          65
				return false;
	//   40   63:iconst_0        
	//   41   64:ireturn         

	//   42   65:iload_2         
	//   43   66:iconst_1        
	//   44   67:iadd            
	//   45   68:istore_2        
	//*  46   69:goto            48
		return true;
	//   47   72:iconst_1        
	//   48   73:ireturn         
	}

	public int hashCode()
	{
		int j = hash;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int hash>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            61
		{
			byte abyte0[] = bytes;
	//    7   11:aload_0         
	//    8   12:getfield        #25  <Field byte[] bytes>
	//    9   15:astore          4
			int l = abyte0.length;
	//   10   17:aload           4
	//   11   19:arraylength     
	//   12   20:istore_3        
			int k = 0;
	//   13   21:iconst_0        
	//   14   22:istore_2        
			i = l;
	//   15   23:iload_3         
	//   16   24:istore_1        
			for(; k < l; k++)
	//*  17   25:iload_2         
	//*  18   26:iload_3         
	//*  19   27:icmpge          47
				i = i * 31 + abyte0[k];
	//   20   30:iload_1         
	//   21   31:bipush          31
	//   22   33:imul            
	//   23   34:aload           4
	//   24   36:iload_2         
	//   25   37:baload          
	//   26   38:iadd            
	//   27   39:istore_1        

	//   28   40:iload_2         
	//   29   41:iconst_1        
	//   30   42:iadd            
	//   31   43:istore_2        
	//*  32   44:goto            25
			if(i == 0)
	//*  33   47:iload_1         
	//*  34   48:ifne            56
				i = 1;
	//   35   51:iconst_1        
	//   36   52:istore_1        
	//*  37   53:goto            56
			hash = i;
	//   38   56:aload_0         
	//   39   57:iload_1         
	//   40   58:putfield        #23  <Field int hash>
		}
		return i;
	//   41   61:iload_1         
	//   42   62:ireturn         
	}

	public InputStream newInput()
	{
		return ((InputStream) (new ByteArrayInputStream(bytes)));
	//    0    0:new             #62  <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field byte[] bytes>
	//    4    8:invokespecial   #63  <Method void ByteArrayInputStream(byte[])>
	//    5   11:areturn         
	}

	public int size()
	{
		return bytes.length;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field byte[] bytes>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public static final ByteString EMPTY = new ByteString(new byte[0]);
	private final byte bytes[];
	private volatile int hash;

	static 
	{
	//    0    0:new             #2   <Class ByteString>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:newarray        byte[]
	//    4    7:invokespecial   #16  <Method void ByteString(byte[])>
	//    5   10:putstatic       #18  <Field ByteString EMPTY>
	//*   6   13:return          
	}
}
