// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.*;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource

public final class StreamUtil
{

	private StreamUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void CopyBytes(RandomAccessSource randomaccesssource, long l, long l1, OutputStream outputstream)
		throws IOException
	{
		if(l1 > 0L)
	//*   0    0:lload_3         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifgt            7
	//*   4    6:return          
		{
			byte abyte0[] = new byte[8192];
	//    5    7:sipush          8192
	//    6   10:newarray        byte[]
	//    7   12:astore          8
			while(l1 > 0L) 
	//*   8   14:lload_3         
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:ifle            6
			{
				long l2 = randomaccesssource.get(l, abyte0, 0, (int)Math.min(abyte0.length, l1));
	//   12   20:aload_0         
	//   13   21:lload_1         
	//   14   22:aload           8
	//   15   24:iconst_0        
	//   16   25:aload           8
	//   17   27:arraylength     
	//   18   28:i2l             
	//   19   29:lload_3         
	//   20   30:invokestatic    #19  <Method long Math.min(long, long)>
	//   21   33:l2i             
	//   22   34:invokeinterface #25  <Method int RandomAccessSource.get(long, byte[], int, int)>
	//   23   39:i2l             
	//   24   40:lstore          6
				if(l2 <= 0L)
	//*  25   42:lload           6
	//*  26   44:lconst_0        
	//*  27   45:lcmp            
	//*  28   46:ifgt            57
					throw new EOFException();
	//   29   49:new             #27  <Class EOFException>
	//   30   52:dup             
	//   31   53:invokespecial   #28  <Method void EOFException()>
	//   32   56:athrow          
				outputstream.write(abyte0, 0, (int)l2);
	//   33   57:aload           5
	//   34   59:aload           8
	//   35   61:iconst_0        
	//   36   62:lload           6
	//   37   64:l2i             
	//   38   65:invokevirtual   #34  <Method void OutputStream.write(byte[], int, int)>
				l += l2;
	//   39   68:lload_1         
	//   40   69:lload           6
	//   41   71:ladd            
	//   42   72:lstore_1        
				l1 -= l2;
	//   43   73:lload_3         
	//   44   74:lload           6
	//   45   76:lsub            
	//   46   77:lstore_3        
			}
		}
	//*  47   78:goto            14
	}

	public static InputStream getResourceStream(String s)
	{
		return getResourceStream(s, ((ClassLoader) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #40  <Method InputStream getResourceStream(String, ClassLoader)>
	//    3    5:areturn         
	}

	public static InputStream getResourceStream(String s, ClassLoader classloader)
	{
		String s1;
		s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(s.startsWith("/"))
	//*   2    2:aload_0         
	//*   3    3:ldc1            #44  <String "/">
	//*   4    5:invokevirtual   #50  <Method boolean String.startsWith(String)>
	//*   5    8:ifeq            17
			s1 = s.substring(1);
	//    6   11:aload_0         
	//    7   12:iconst_1        
	//    8   13:invokevirtual   #54  <Method String String.substring(int)>
	//    9   16:astore_2        
		s = null;
	//   10   17:aconst_null     
	//   11   18:astore_0        
		if(classloader != null)
	//*  12   19:aload_1         
	//*  13   20:ifnull          37
		{
			classloader = ((ClassLoader) (classloader.getResourceAsStream(s1)));
	//   14   23:aload_1         
	//   15   24:aload_2         
	//   16   25:invokevirtual   #59  <Method InputStream ClassLoader.getResourceAsStream(String)>
	//   17   28:astore_1        
			s = ((String) (classloader));
	//   18   29:aload_1         
	//   19   30:astore_0        
			if(classloader != null)
	//*  20   31:aload_1         
	//*  21   32:ifnull          37
				return ((InputStream) (classloader));
	//   22   35:aload_1         
	//   23   36:areturn         
		}
		ClassLoader classloader1 = Thread.currentThread().getContextClassLoader();
	//   24   37:invokestatic    #65  <Method Thread Thread.currentThread()>
	//   25   40:invokevirtual   #69  <Method ClassLoader Thread.getContextClassLoader()>
	//   26   43:astore_3        
		classloader = ((ClassLoader) (s));
	//   27   44:aload_0         
	//   28   45:astore_1        
		if(classloader1 != null)
	//*  29   46:aload_3         
	//*  30   47:ifnull          56
			try
			{
				classloader = ((ClassLoader) (classloader1.getResourceAsStream(s1)));
	//   31   50:aload_3         
	//   32   51:aload_2         
	//   33   52:invokevirtual   #59  <Method InputStream ClassLoader.getResourceAsStream(String)>
	//   34   55:astore_1        
			}
	//*  35   56:aload_1         
	//*  36   57:astore_0        
	//*  37   58:aload_1         
	//*  38   59:ifnonnull       87
	//*  39   62:ldc1            #2   <Class StreamUtil>
	//*  40   64:new             #71  <Class StringBuilder>
	//*  41   67:dup             
	//*  42   68:invokespecial   #72  <Method void StringBuilder()>
	//*  43   71:ldc1            #44  <String "/">
	//*  44   73:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  45   76:aload_2         
	//*  46   77:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  47   80:invokevirtual   #80  <Method String StringBuilder.toString()>
	//*  48   83:invokevirtual   #83  <Method InputStream Class.getResourceAsStream(String)>
	//*  49   86:astore_0        
	//*  50   87:aload_0         
	//*  51   88:astore_1        
	//*  52   89:aload_0         
	//*  53   90:ifnonnull       98
	//*  54   93:aload_2         
	//*  55   94:invokestatic    #86  <Method InputStream ClassLoader.getSystemResourceAsStream(String)>
	//*  56   97:astore_1        
	//*  57   98:aload_1         
	//*  58   99:areturn         
			// Misplaced declaration of an exception variable
			catch(ClassLoader classloader)
	//*  59  100:astore_1        
			{
				classloader = ((ClassLoader) (s));
	//   60  101:aload_0         
	//   61  102:astore_1        
			}
		s = ((String) (classloader));
		if(classloader == null)
			s = ((String) (((Class) (com/itextpdf/text/io/StreamUtil)).getResourceAsStream((new StringBuilder()).append("/").append(s1).toString())));
		classloader = ((ClassLoader) (s));
		if(s == null)
			classloader = ((ClassLoader) (ClassLoader.getSystemResourceAsStream(s1)));
		return ((InputStream) (classloader));
	//*  62  103:goto            56
	}

	public static byte[] inputStreamToArray(InputStream inputstream)
		throws IOException
	{
		byte abyte0[] = new byte[8192];
	//    0    0:sipush          8192
	//    1    3:newarray        byte[]
	//    2    5:astore_2        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    3    6:new             #90  <Class ByteArrayOutputStream>
	//    4    9:dup             
	//    5   10:invokespecial   #91  <Method void ByteArrayOutputStream()>
	//    6   13:astore_3        
		do
		{
			int i = inputstream.read(abyte0);
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #97  <Method int InputStream.read(byte[])>
	//   10   19:istore_1        
			if(i < 1)
	//*  11   20:iload_1         
	//*  12   21:iconst_1        
	//*  13   22:icmpge          34
			{
				bytearrayoutputstream.close();
	//   14   25:aload_3         
	//   15   26:invokevirtual   #100 <Method void ByteArrayOutputStream.close()>
				return bytearrayoutputstream.toByteArray();
	//   16   29:aload_3         
	//   17   30:invokevirtual   #104 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   18   33:areturn         
			}
			bytearrayoutputstream.write(abyte0, 0, i);
	//   19   34:aload_3         
	//   20   35:aload_2         
	//   21   36:iconst_0        
	//   22   37:iload_1         
	//   23   38:invokevirtual   #105 <Method void ByteArrayOutputStream.write(byte[], int, int)>
		} while(true);
	//   24   41:goto            14
	}
}
