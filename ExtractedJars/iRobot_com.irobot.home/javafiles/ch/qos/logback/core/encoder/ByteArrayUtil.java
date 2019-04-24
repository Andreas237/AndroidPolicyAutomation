// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.encoder;

import java.io.ByteArrayOutputStream;

public class ByteArrayUtil
{

	public ByteArrayUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static byte[] hexStringToByteArray(String s)
	{
		byte abyte0[] = new byte[s.length() / 2];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method int String.length()>
	//    2    4:iconst_2        
	//    3    5:idiv            
	//    4    6:newarray        byte[]
	//    5    8:astore_3        
		for(int i = 0; i < abyte0.length; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_1        
	//*   8   11:iload_1         
	//*   9   12:aload_3         
	//*  10   13:arraylength     
	//*  11   14:icmpge          49
		{
			int j = i * 2;
	//   12   17:iload_1         
	//   13   18:iconst_2        
	//   14   19:imul            
	//   15   20:istore_2        
			abyte0[i] = (byte)(Integer.parseInt(s.substring(j, j + 2), 16) & 0xff);
	//   16   21:aload_3         
	//   17   22:iload_1         
	//   18   23:aload_0         
	//   19   24:iload_2         
	//   20   25:iload_2         
	//   21   26:iconst_2        
	//   22   27:iadd            
	//   23   28:invokevirtual   #21  <Method String String.substring(int, int)>
	//   24   31:bipush          16
	//   25   33:invokestatic    #27  <Method int Integer.parseInt(String, int)>
	//   26   36:sipush          255
	//   27   39:iand            
	//   28   40:int2byte        
	//   29   41:bastore         
		}

	//   30   42:iload_1         
	//   31   43:iconst_1        
	//   32   44:iadd            
	//   33   45:istore_1        
	//*  34   46:goto            11
		return abyte0;
	//   35   49:aload_3         
	//   36   50:areturn         
	}

	static int readInt(byte abyte0[], int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		for(; j < 4; j++)
	//*   4    4:iload_2         
	//*   5    5:iconst_4        
	//*   6    6:icmpge          36
			k += (abyte0[i + j] & 0xff) << 24 - j * 8;
	//    7    9:iload_3         
	//    8   10:aload_0         
	//    9   11:iload_1         
	//   10   12:iload_2         
	//   11   13:iadd            
	//   12   14:baload          
	//   13   15:sipush          255
	//   14   18:iand            
	//   15   19:bipush          24
	//   16   21:iload_2         
	//   17   22:bipush          8
	//   18   24:imul            
	//   19   25:isub            
	//   20   26:ishl            
	//   21   27:iadd            
	//   22   28:istore_3        

	//   23   29:iload_2         
	//   24   30:iconst_1        
	//   25   31:iadd            
	//   26   32:istore_2        
	//*  27   33:goto            4
		return k;
	//   28   36:iload_3         
	//   29   37:ireturn         
	}

	public static String toHexString(byte abyte0[])
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #33  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuffer()>
	//    3    7:astore_3        
		int j = abyte0.length;
	//    4    8:aload_0         
	//    5    9:arraylength     
	//    6   10:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_1        
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          60
		{
			String s = Integer.toHexString(abyte0[i] & 0xff);
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:baload          
	//   15   21:sipush          255
	//   16   24:iand            
	//   17   25:invokestatic    #37  <Method String Integer.toHexString(int)>
	//   18   28:astore          4
			if(s.length() == 1)
	//*  19   30:aload           4
	//*  20   32:invokevirtual   #17  <Method int String.length()>
	//*  21   35:iconst_1        
	//*  22   36:icmpne          46
				stringbuffer.append('0');
	//   23   39:aload_3         
	//   24   40:bipush          48
	//   25   42:invokevirtual   #41  <Method StringBuffer StringBuffer.append(char)>
	//   26   45:pop             
			stringbuffer.append(s);
	//   27   46:aload_3         
	//   28   47:aload           4
	//   29   49:invokevirtual   #44  <Method StringBuffer StringBuffer.append(String)>
	//   30   52:pop             
		}

	//   31   53:iload_1         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:istore_1        
	//*  35   57:goto            13
		return stringbuffer.toString();
	//   36   60:aload_3         
	//   37   61:invokevirtual   #48  <Method String StringBuffer.toString()>
	//   38   64:areturn         
	}

	static void writeInt(ByteArrayOutputStream bytearrayoutputstream, int i)
	{
		for(int j = 0; j < 4; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:iconst_4        
	//*   4    4:icmpge          28
			bytearrayoutputstream.write(((int) ((byte)(i >>> 24 - j * 8))));
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:bipush          24
	//    8   11:iload_2         
	//    9   12:bipush          8
	//   10   14:imul            
	//   11   15:isub            
	//   12   16:iushr           
	//   13   17:int2byte        
	//   14   18:invokevirtual   #56  <Method void ByteArrayOutputStream.write(int)>

	//   15   21:iload_2         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_2        
	//*  19   25:goto            2
	//   20   28:return          
	}

	static void writeInt(byte abyte0[], int i, int j)
	{
		for(int k = 0; k < 4; k++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:iconst_4        
	//*   4    4:icmpge          29
			abyte0[i + k] = (byte)(j >>> 24 - k * 8);
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:iload_3         
	//    8   10:iadd            
	//    9   11:iload_2         
	//   10   12:bipush          24
	//   11   14:iload_3         
	//   12   15:bipush          8
	//   13   17:imul            
	//   14   18:isub            
	//   15   19:iushr           
	//   16   20:int2byte        
	//   17   21:bastore         

	//   18   22:iload_3         
	//   19   23:iconst_1        
	//   20   24:iadd            
	//   21   25:istore_3        
	//*  22   26:goto            2
	//   23   29:return          
	}
}
