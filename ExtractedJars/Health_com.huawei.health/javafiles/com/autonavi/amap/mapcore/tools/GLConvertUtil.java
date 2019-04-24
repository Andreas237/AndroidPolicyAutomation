// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.tools;

import java.io.ByteArrayOutputStream;

public class GLConvertUtil
{

	public GLConvertUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
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
	//   28   36:invokestatic    #17  <Method double Double.longBitsToDouble(long)>
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

	public static byte[] get1BString(String s)
	{
		try
		{
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #26  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
			s = ((String) (s.getBytes("UTF-8")));
	//    4    8:aload_0         
	//    5    9:ldc1            #29  <String "UTF-8">
	//    6   11:invokevirtual   #34  <Method byte[] String.getBytes(String)>
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
	//   17   25:invokevirtual   #38  <Method void ByteArrayOutputStream.write(byte[])>
			bytearrayoutputstream.write(((byte []) (s)));
	//   18   28:aload_1         
	//   19   29:aload_0         
	//   20   30:invokevirtual   #38  <Method void ByteArrayOutputStream.write(byte[])>
			s = ((String) (bytearrayoutputstream.toByteArray()));
	//   21   33:aload_1         
	//   22   34:invokevirtual   #42  <Method byte[] ByteArrayOutputStream.toByteArray()>
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
	//   28   42:invokevirtual   #45  <Method void Exception.printStackTrace()>
			return new byte[1];
	//   29   45:iconst_1        
	//   30   46:newarray        byte[]
	//   31   48:areturn         
		}
		return ((byte []) (s));
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

	public static int getInt2(byte abyte0[], int i)
	{
		return ((abyte0[i + 0] & 0xff) << 24) + ((abyte0[i + 1] & 0xff) << 16) + ((abyte0[i + 2] & 0xff) << 8) + ((abyte0[i + 3] & 0xff) << 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:iadd            
	//    4    4:baload          
	//    5    5:sipush          255
	//    6    8:iand            
	//    7    9:bipush          24
	//    8   11:ishl            
	//    9   12:aload_0         
	//   10   13:iload_1         
	//   11   14:iconst_1        
	//   12   15:iadd            
	//   13   16:baload          
	//   14   17:sipush          255
	//   15   20:iand            
	//   16   21:bipush          16
	//   17   23:ishl            
	//   18   24:iadd            
	//   19   25:aload_0         
	//   20   26:iload_1         
	//   21   27:iconst_2        
	//   22   28:iadd            
	//   23   29:baload          
	//   24   30:sipush          255
	//   25   33:iand            
	//   26   34:bipush          8
	//   27   36:ishl            
	//   28   37:iadd            
	//   29   38:aload_0         
	//   30   39:iload_1         
	//   31   40:iconst_3        
	//   32   41:iadd            
	//   33   42:baload          
	//   34   43:sipush          255
	//   35   46:iand            
	//   36   47:iconst_0        
	//   37   48:ishl            
	//   38   49:iadd            
	//   39   50:ireturn         
	}

	public static long getLong(byte abyte0[], int i)
	{
		return ((long)(abyte0[i + 7] & 0xff) << 56) + ((long)(abyte0[i + 6] & 0xff) << 48) + ((long)(abyte0[i + 5] & 0xff) << 40) + ((long)(abyte0[i + 4] & 0xff) << 32) + ((long)(abyte0[i + 3] & 0xff) << 24) + ((long)(abyte0[i + 2] & 0xff) << 16) + ((long)(abyte0[i + 1] & 0xff) << 8) + ((long)(abyte0[i + 0] & 0xff) << 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          7
	//    3    4:iadd            
	//    4    5:baload          
	//    5    6:sipush          255
	//    6    9:iand            
	//    7   10:i2l             
	//    8   11:bipush          56
	//    9   13:lshl            
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:bipush          6
	//   13   18:iadd            
	//   14   19:baload          
	//   15   20:sipush          255
	//   16   23:iand            
	//   17   24:i2l             
	//   18   25:bipush          48
	//   19   27:lshl            
	//   20   28:ladd            
	//   21   29:aload_0         
	//   22   30:iload_1         
	//   23   31:iconst_5        
	//   24   32:iadd            
	//   25   33:baload          
	//   26   34:sipush          255
	//   27   37:iand            
	//   28   38:i2l             
	//   29   39:bipush          40
	//   30   41:lshl            
	//   31   42:ladd            
	//   32   43:aload_0         
	//   33   44:iload_1         
	//   34   45:iconst_4        
	//   35   46:iadd            
	//   36   47:baload          
	//   37   48:sipush          255
	//   38   51:iand            
	//   39   52:i2l             
	//   40   53:bipush          32
	//   41   55:lshl            
	//   42   56:ladd            
	//   43   57:aload_0         
	//   44   58:iload_1         
	//   45   59:iconst_3        
	//   46   60:iadd            
	//   47   61:baload          
	//   48   62:sipush          255
	//   49   65:iand            
	//   50   66:i2l             
	//   51   67:bipush          24
	//   52   69:lshl            
	//   53   70:ladd            
	//   54   71:aload_0         
	//   55   72:iload_1         
	//   56   73:iconst_2        
	//   57   74:iadd            
	//   58   75:baload          
	//   59   76:sipush          255
	//   60   79:iand            
	//   61   80:i2l             
	//   62   81:bipush          16
	//   63   83:lshl            
	//   64   84:ladd            
	//   65   85:aload_0         
	//   66   86:iload_1         
	//   67   87:iconst_1        
	//   68   88:iadd            
	//   69   89:baload          
	//   70   90:sipush          255
	//   71   93:iand            
	//   72   94:i2l             
	//   73   95:bipush          8
	//   74   97:lshl            
	//   75   98:ladd            
	//   76   99:aload_0         
	//   77  100:iload_1         
	//   78  101:iconst_0        
	//   79  102:iadd            
	//   80  103:baload          
	//   81  104:sipush          255
	//   82  107:iand            
	//   83  108:i2l             
	//   84  109:iconst_0        
	//   85  110:lshl            
	//   86  111:ladd            
	//   87  112:lreturn         
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

	public static short getShort2(byte abyte0[], int i)
	{
		return (short)(((abyte0[i + 0] & 0xff) << 8) + ((abyte0[i + 1] & 0xff) << 0));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:iadd            
	//    4    4:baload          
	//    5    5:sipush          255
	//    6    8:iand            
	//    7    9:bipush          8
	//    8   11:ishl            
	//    9   12:aload_0         
	//   10   13:iload_1         
	//   11   14:iconst_1        
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
	//    0    0:new             #31  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:ldc1            #29  <String "UTF-8">
	//    6    9:invokespecial   #58  <Method void String(byte[], int, int, String)>
	//    7   12:astore_0        
		}
	//*   8   13:aload_0         
	//*   9   14:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  10   15:astore_0        
		{
			return "";
	//   11   16:ldc1            #60  <String "">
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
	//    8    9:invokestatic    #68  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//    8   13:invokestatic    #68  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (abyte2)), 0, ((Object) (abyte1)), j, k);
	//    9   16:aload           5
	//   10   18:iconst_0        
	//   11   19:aload_2         
	//   12   20:iload_3         
	//   13   21:iload           4
	//   14   23:invokestatic    #68  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   15   26:return          
	}

	public static void writeInt(byte abyte0[], int i, int j)
	{
		System.arraycopy(((Object) (convertInt(j))), 0, ((Object) (abyte0)), i, 4);
	//    0    0:iload_2         
	//    1    1:invokestatic    #75  <Method byte[] convertInt(int)>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_4        
	//    6    8:invokestatic    #68  <Method void System.arraycopy(Object, int, Object, int, int)>
	//    7   11:return          
	}

	public static void writeShort(byte abyte0[], int i, short word0)
	{
		System.arraycopy(((Object) (convertShort(((int) (word0))))), 0, ((Object) (abyte0)), i, 2);
	//    0    0:iload_2         
	//    1    1:invokestatic    #79  <Method byte[] convertShort(int)>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_2        
	//    6    8:invokestatic    #68  <Method void System.arraycopy(Object, int, Object, int, int)>
	//    7   11:return          
	}
}
