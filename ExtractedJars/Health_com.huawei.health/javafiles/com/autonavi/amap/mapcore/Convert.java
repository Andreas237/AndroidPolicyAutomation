// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import java.io.ByteArrayOutputStream;

// Referenced classes of package com.autonavi.amap.mapcore:
//			ConvertString

public class Convert
{

	public Convert()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static final String bytesToHexString(byte abyte0[])
	{
		StringBuffer stringbuffer = new StringBuffer(abyte0.length);
	//    0    0:new             #13  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:invokespecial   #16  <Method void StringBuffer(int)>
	//    5    9:astore_2        
		for(int i = 0; i < abyte0.length; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:arraylength     
	//*  11   15:icmpge          59
		{
			String s = Integer.toHexString(abyte0[i] & 0xff);
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:baload          
	//   15   21:sipush          255
	//   16   24:iand            
	//   17   25:invokestatic    #22  <Method String Integer.toHexString(int)>
	//   18   28:astore_3        
			if(s.length() < 2)
	//*  19   29:aload_3         
	//*  20   30:invokevirtual   #28  <Method int String.length()>
	//*  21   33:iconst_2        
	//*  22   34:icmpge          43
				stringbuffer.append(0);
	//   23   37:aload_2         
	//   24   38:iconst_0        
	//   25   39:invokevirtual   #32  <Method StringBuffer StringBuffer.append(int)>
	//   26   42:pop             
			stringbuffer.append(s.toUpperCase());
	//   27   43:aload_2         
	//   28   44:aload_3         
	//   29   45:invokevirtual   #36  <Method String String.toUpperCase()>
	//   30   48:invokevirtual   #39  <Method StringBuffer StringBuffer.append(String)>
	//   31   51:pop             
		}

	//   32   52:iload_1         
	//   33   53:iconst_1        
	//   34   54:iadd            
	//   35   55:istore_1        
	//*  36   56:goto            12
		return stringbuffer.toString();
	//   37   59:aload_2         
	//   38   60:invokevirtual   #42  <Method String StringBuffer.toString()>
	//   39   63:areturn         
	}

	public static void convert1bString(byte abyte0[], int i, ConvertString convertstring)
	{
		try
		{
			convertstring.byteLength = ((int) (abyte0[i]));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:baload          
	//    4    4:putfield        #52  <Field int ConvertString.byteLength>
			convertstring.value = new String(abyte0, i + 1, convertstring.byteLength, "UTF-8");
	//    5    7:aload_2         
	//    6    8:new             #24  <Class String>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:iconst_1        
	//   11   15:iadd            
	//   12   16:aload_2         
	//   13   17:getfield        #52  <Field int ConvertString.byteLength>
	//   14   20:ldc1            #54  <String "UTF-8">
	//   15   22:invokespecial   #57  <Method void String(byte[], int, int, String)>
	//   16   25:putfield        #61  <Field String ConvertString.value>
			return;
	//   17   28:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  18   29:astore_0        
		{
			((Exception) (abyte0)).printStackTrace();
	//   19   30:aload_0         
	//   20   31:invokevirtual   #64  <Method void Exception.printStackTrace()>
		}
		convertstring.byteLength = 0;
	//   21   34:aload_2         
	//   22   35:iconst_0        
	//   23   36:putfield        #52  <Field int ConvertString.byteLength>
		convertstring.value = "";
	//   24   39:aload_2         
	//   25   40:ldc1            #66  <String "">
	//   26   42:putfield        #61  <Field String ConvertString.value>
	//   27   45:return          
	}

	public static void convert2bString(byte abyte0[], int i, ConvertString convertstring)
	{
		try
		{
			convertstring.byteLength = ((int) (getShort(abyte0, i)));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokestatic    #71  <Method short getShort(byte[], int)>
	//    4    6:putfield        #52  <Field int ConvertString.byteLength>
			convertstring.value = new String(abyte0, i + 2, convertstring.byteLength, "UTF-8");
	//    5    9:aload_2         
	//    6   10:new             #24  <Class String>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:iconst_2        
	//   11   17:iadd            
	//   12   18:aload_2         
	//   13   19:getfield        #52  <Field int ConvertString.byteLength>
	//   14   22:ldc1            #54  <String "UTF-8">
	//   15   24:invokespecial   #57  <Method void String(byte[], int, int, String)>
	//   16   27:putfield        #61  <Field String ConvertString.value>
			return;
	//   17   30:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  18   31:astore_0        
		{
			((Exception) (abyte0)).printStackTrace();
	//   19   32:aload_0         
	//   20   33:invokevirtual   #64  <Method void Exception.printStackTrace()>
		}
		convertstring.byteLength = 0;
	//   21   36:aload_2         
	//   22   37:iconst_0        
	//   23   38:putfield        #52  <Field int ConvertString.byteLength>
		convertstring.value = "";
	//   24   41:aload_2         
	//   25   42:ldc1            #66  <String "">
	//   26   44:putfield        #61  <Field String ConvertString.value>
	//   27   47:return          
	}

	public static double convertDouble(byte abyte0[], int i)
	{
		long l = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		for(int j = 0; j < 8; j++)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
	//*   4    4:iload_2         
	//*   5    5:bipush          8
	//*   6    7:icmpge          35
			l += (long)(abyte0[j + i] & 0xff) << j * 8;
	//    7   10:lload_3         
	//    8   11:aload_0         
	//    9   12:iload_2         
	//   10   13:iload_1         
	//   11   14:iadd            
	//   12   15:baload          
	//   13   16:sipush          255
	//   14   19:iand            
	//   15   20:i2l             
	//   16   21:iload_2         
	//   17   22:bipush          8
	//   18   24:imul            
	//   19   25:lshl            
	//   20   26:ladd            
	//   21   27:lstore_3        

	//   22   28:iload_2         
	//   23   29:iconst_1        
	//   24   30:iadd            
	//   25   31:istore_2        
	//*  26   32:goto            4
		return Double.longBitsToDouble(l);
	//   27   35:lload_3         
	//   28   36:invokestatic    #79  <Method double Double.longBitsToDouble(long)>
	//   29   39:dreturn         
	}

	public static byte[] convertInt(int i)
	{
		return (new byte[] {
			(byte)(i & 0xff), (byte)(i >> 8 & 0xff), (byte)(i >> 16 & 0xff), (byte)(i >> 24 & 0xff)
		});
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iload_0         
	//    5    6:sipush          255
	//    6    9:iand            
	//    7   10:int2byte        
	//    8   11:bastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:iload_0         
	//   12   15:bipush          8
	//   13   17:ishr            
	//   14   18:sipush          255
	//   15   21:iand            
	//   16   22:int2byte        
	//   17   23:bastore         
	//   18   24:dup             
	//   19   25:iconst_2        
	//   20   26:iload_0         
	//   21   27:bipush          16
	//   22   29:ishr            
	//   23   30:sipush          255
	//   24   33:iand            
	//   25   34:int2byte        
	//   26   35:bastore         
	//   27   36:dup             
	//   28   37:iconst_3        
	//   29   38:iload_0         
	//   30   39:bipush          24
	//   31   41:ishr            
	//   32   42:sipush          255
	//   33   45:iand            
	//   34   46:int2byte        
	//   35   47:bastore         
	//   36   48:areturn         
	}

	public static byte[] convertShort(int i)
	{
		return (new byte[] {
			(byte)(i & 0xff), (byte)(i >> 8 & 0xff)
		});
	//    0    0:iconst_2        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iload_0         
	//    5    6:sipush          255
	//    6    9:iand            
	//    7   10:int2byte        
	//    8   11:bastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:iload_0         
	//   12   15:bipush          8
	//   13   17:ishr            
	//   14   18:sipush          255
	//   15   21:iand            
	//   16   22:int2byte        
	//   17   23:bastore         
	//   18   24:areturn         
	}

	public static byte[] copyString(byte abyte0[], int i, int j)
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
	//    8    9:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte1;
	//    9   12:aload_3         
	//   10   13:areturn         
	}

	public static byte[] covertBytes(byte byte0)
	{
		return (new byte[] {
			byte0
		});
	//    0    0:iconst_1        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iload_0         
	//    5    6:bastore         
	//    6    7:areturn         
	}

	public static byte[] get1BString(String s)
	{
		try
		{
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #96  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
			s = ((String) (s.getBytes("UTF-8")));
	//    4    8:aload_0         
	//    5    9:ldc1            #54  <String "UTF-8">
	//    6   11:invokevirtual   #100 <Method byte[] String.getBytes(String)>
	//    7   14:astore_0        
			bytearrayoutputstream.write(new byte[] {
				(byte)s.length
			});
	//    8   15:aload_1         
	//    9   16:iconst_1        
	//   10   17:newarray        byte[]
	//   11   19:dup             
	//   12   20:iconst_0        
	//   13   21:aload_0         
	//   14   22:arraylength     
	//   15   23:int2byte        
	//   16   24:bastore         
	//   17   25:invokevirtual   #104 <Method void ByteArrayOutputStream.write(byte[])>
			bytearrayoutputstream.write(((byte []) (s)));
	//   18   28:aload_1         
	//   19   29:aload_0         
	//   20   30:invokevirtual   #104 <Method void ByteArrayOutputStream.write(byte[])>
			s = ((String) (bytearrayoutputstream.toByteArray()));
	//   21   33:aload_1         
	//   22   34:invokevirtual   #108 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   23   37:astore_0        
		}
	//*  24   38:aload_0         
	//*  25   39:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  26   40:astore_0        
		{
			((Exception) (s)).printStackTrace();
	//   27   41:aload_0         
	//   28   42:invokevirtual   #64  <Method void Exception.printStackTrace()>
			return new byte[1];
	//   29   45:iconst_1        
	//   30   46:newarray        byte[]
	//   31   48:areturn         
		}
		return ((byte []) (s));
	}

	public static byte[] get2BString(String s)
	{
		try
		{
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #96  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
			s = ((String) (s.getBytes("UTF-8")));
	//    4    8:aload_0         
	//    5    9:ldc1            #54  <String "UTF-8">
	//    6   11:invokevirtual   #100 <Method byte[] String.getBytes(String)>
	//    7   14:astore_0        
			bytearrayoutputstream.write(convertShort(s.length));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:arraylength     
	//   11   18:invokestatic    #111 <Method byte[] convertShort(int)>
	//   12   21:invokevirtual   #104 <Method void ByteArrayOutputStream.write(byte[])>
			bytearrayoutputstream.write(((byte []) (s)));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #104 <Method void ByteArrayOutputStream.write(byte[])>
			s = ((String) (bytearrayoutputstream.toByteArray()));
	//   16   29:aload_1         
	//   17   30:invokevirtual   #108 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   18   33:astore_0        
		}
	//*  19   34:aload_0         
	//*  20   35:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  21   36:astore_0        
		{
			((Exception) (s)).printStackTrace();
	//   22   37:aload_0         
	//   23   38:invokevirtual   #64  <Method void Exception.printStackTrace()>
			return new byte[1];
	//   24   41:iconst_1        
	//   25   42:newarray        byte[]
	//   26   44:areturn         
		}
		return ((byte []) (s));
	}

	public static boolean getBit(byte byte0, int i)
	{
		return (byte0 << 32 - i) >>> 32 - i >>> i - 1 > 0;
	//    0    0:iload_0         
	//    1    1:bipush          32
	//    2    3:iload_1         
	//    3    4:isub            
	//    4    5:ishl            
	//    5    6:bipush          32
	//    6    8:iload_1         
	//    7    9:isub            
	//    8   10:iushr           
	//    9   11:iload_1         
	//   10   12:iconst_1        
	//   11   13:isub            
	//   12   14:iushr           
	//   13   15:ifle            20
	//   14   18:iconst_1        
	//   15   19:ireturn         
	//   16   20:iconst_0        
	//   17   21:ireturn         
	}

	public static byte[] getDouble(double d)
	{
		byte abyte0[] = new byte[8];
	//    0    0:bipush          8
	//    1    2:newarray        byte[]
	//    2    4:astore_3        
		String s = Long.toHexString(Double.doubleToLongBits(d));
	//    3    5:dload_0         
	//    4    6:invokestatic    #119 <Method long Double.doubleToLongBits(double)>
	//    5    9:invokestatic    #124 <Method String Long.toHexString(long)>
	//    6   12:astore          4
		for(int i = 0; i < 8; i++)
	//*   7   14:iconst_0        
	//*   8   15:istore_2        
	//*   9   16:iload_2         
	//*  10   17:bipush          8
	//*  11   19:icmpge          54
			abyte0[7 - i] = (byte)Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
	//   12   22:aload_3         
	//   13   23:bipush          7
	//   14   25:iload_2         
	//   15   26:isub            
	//   16   27:aload           4
	//   17   29:iload_2         
	//   18   30:iconst_2        
	//   19   31:imul            
	//   20   32:iload_2         
	//   21   33:iconst_2        
	//   22   34:imul            
	//   23   35:iconst_2        
	//   24   36:iadd            
	//   25   37:invokevirtual   #128 <Method String String.substring(int, int)>
	//   26   40:bipush          16
	//   27   42:invokestatic    #132 <Method int Integer.parseInt(String, int)>
	//   28   45:int2byte        
	//   29   46:bastore         

	//   30   47:iload_2         
	//   31   48:iconst_1        
	//   32   49:iadd            
	//   33   50:istore_2        
	//*  34   51:goto            16
		return abyte0;
	//   35   54:aload_3         
	//   36   55:areturn         
	}

	public static int getInt(byte abyte0[], int i)
	{
		return ((abyte0[i + 3] & 0xff) << 24) + ((abyte0[i + 2] & 0xff) << 16) + ((abyte0[i + 1] & 0xff) << 8) + ((abyte0[i + 0] & 0xff) << 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:iadd            
	//    4    4:baload          
	//    5    5:sipush          255
	//    6    8:iand            
	//    7    9:bipush          24
	//    8   11:ishl            
	//    9   12:aload_0         
	//   10   13:iload_1         
	//   11   14:iconst_2        
	//   12   15:iadd            
	//   13   16:baload          
	//   14   17:sipush          255
	//   15   20:iand            
	//   16   21:bipush          16
	//   17   23:ishl            
	//   18   24:iadd            
	//   19   25:aload_0         
	//   20   26:iload_1         
	//   21   27:iconst_1        
	//   22   28:iadd            
	//   23   29:baload          
	//   24   30:sipush          255
	//   25   33:iand            
	//   26   34:bipush          8
	//   27   36:ishl            
	//   28   37:iadd            
	//   29   38:aload_0         
	//   30   39:iload_1         
	//   31   40:iconst_0        
	//   32   41:iadd            
	//   33   42:baload          
	//   34   43:sipush          255
	//   35   46:iand            
	//   36   47:iconst_0        
	//   37   48:ishl            
	//   38   49:iadd            
	//   39   50:ireturn         
	}

	public static int getNum(byte byte0, int i, int j)
	{
		return (byte0 << 32 - j - 1) >>> 32 - j - 1 >>> i;
	//    0    0:iload_0         
	//    1    1:bipush          32
	//    2    3:iload_2         
	//    3    4:isub            
	//    4    5:iconst_1        
	//    5    6:isub            
	//    6    7:ishl            
	//    7    8:bipush          32
	//    8   10:iload_2         
	//    9   11:isub            
	//   10   12:iconst_1        
	//   11   13:isub            
	//   12   14:iushr           
	//   13   15:iload_1         
	//   14   16:iushr           
	//   15   17:ireturn         
	}

	public static int getNum(short word0, int i, int j)
	{
		return (word0 << 32 - j) >>> 32 - j >>> i - 1;
	//    0    0:iload_0         
	//    1    1:bipush          32
	//    2    3:iload_2         
	//    3    4:isub            
	//    4    5:ishl            
	//    5    6:bipush          32
	//    6    8:iload_2         
	//    7    9:isub            
	//    8   10:iushr           
	//    9   11:iload_1         
	//   10   12:iconst_1        
	//   11   13:isub            
	//   12   14:iushr           
	//   13   15:ireturn         
	}

	public static short getShort(byte abyte0[], int i)
	{
		return (short)(((abyte0[i + 1] & 0xff) << 8) + ((abyte0[i + 0] & 0xff) << 0));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:baload          
	//    5    5:sipush          255
	//    6    8:iand            
	//    7    9:bipush          8
	//    8   11:ishl            
	//    9   12:aload_0         
	//   10   13:iload_1         
	//   11   14:iconst_0        
	//   12   15:iadd            
	//   13   16:baload          
	//   14   17:sipush          255
	//   15   20:iand            
	//   16   21:iconst_0        
	//   17   22:ishl            
	//   18   23:iadd            
	//   19   24:int2short       
	//   20   25:ireturn         
	}

	public static String getString(byte abyte0[], int i, int j)
	{
		try
		{
			abyte0 = ((byte []) (new String(abyte0, i, j, "UTF-8")));
	//    0    0:new             #24  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:ldc1            #54  <String "UTF-8">
	//    6    9:invokespecial   #57  <Method void String(byte[], int, int, String)>
	//    7   12:astore_0        
		}
	//*   8   13:aload_0         
	//*   9   14:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  10   15:astore_0        
		{
			return "";
	//   11   16:ldc1            #66  <String "">
	//   12   18:areturn         
		}
		return ((String) (abyte0));
	}

	public static byte[] getSubBytes(byte abyte0[], int i, int j)
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
	//    8    9:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte1;
	//    9   12:aload_3         
	//   10   13:areturn         
	}

	public static int getUShort(byte abyte0[], int i)
	{
		return ((abyte0[i + 1] & 0xff) << 8) + ((abyte0[i + 0] & 0xff) << 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:baload          
	//    5    5:sipush          255
	//    6    8:iand            
	//    7    9:bipush          8
	//    8   11:ishl            
	//    9   12:aload_0         
	//   10   13:iload_1         
	//   11   14:iconst_0        
	//   12   15:iadd            
	//   13   16:baload          
	//   14   17:sipush          255
	//   15   20:iand            
	//   16   21:iconst_0        
	//   17   22:ishl            
	//   18   23:iadd            
	//   19   24:ireturn         
	}

	public static void moveArray(byte abyte0[], int i, byte abyte1[], int j, int k)
	{
		byte abyte2[] = new byte[k];
	//    0    0:iload           4
	//    1    2:newarray        byte[]
	//    2    4:astore          5
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte2)), 0, k);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:aload           5
	//    6   10:iconst_0        
	//    7   11:iload           4
	//    8   13:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (abyte2)), 0, ((Object) (abyte1)), j, k);
	//    9   16:aload           5
	//   10   18:iconst_0        
	//   11   19:aload_2         
	//   12   20:iload_3         
	//   13   21:iload           4
	//   14   23:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   15   26:return          
	}

	public static void writeInt(byte abyte0[], int i, int j)
	{
		System.arraycopy(((Object) (convertInt(j))), 0, ((Object) (abyte0)), i, 4);
	//    0    0:iload_2         
	//    1    1:invokestatic    #147 <Method byte[] convertInt(int)>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_4        
	//    6    8:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
	//    7   11:return          
	}

	public static void writeShort(byte abyte0[], int i, short word0)
	{
		System.arraycopy(((Object) (convertShort(((int) (word0))))), 0, ((Object) (abyte0)), i, 2);
	//    0    0:iload_2         
	//    1    1:invokestatic    #111 <Method byte[] convertShort(int)>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_2        
	//    6    8:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
	//    7   11:return          
	}
}
