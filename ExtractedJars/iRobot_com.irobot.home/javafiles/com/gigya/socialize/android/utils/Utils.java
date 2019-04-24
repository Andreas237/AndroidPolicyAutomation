// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.utils;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Utils
{

	public Utils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String bytesToString(byte abyte0[])
	{
		byte abyte1[] = new byte[abyte0.length + 1];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:newarray        byte[]
	//    5    6:astore_1        
		abyte1[0] = 1;
	//    6    7:aload_1         
	//    7    8:iconst_0        
	//    8    9:iconst_1        
	//    9   10:bastore         
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 1, abyte0.length);
	//   10   11:aload_0         
	//   11   12:iconst_0        
	//   12   13:aload_1         
	//   13   14:iconst_1        
	//   14   15:aload_0         
	//   15   16:arraylength     
	//   16   17:invokestatic    #17  <Method void System.arraycopy(Object, int, Object, int, int)>
		return (new BigInteger(abyte1)).toString(36);
	//   17   20:new             #19  <Class BigInteger>
	//   18   23:dup             
	//   19   24:aload_1         
	//   20   25:invokespecial   #22  <Method void BigInteger(byte[])>
	//   21   28:bipush          36
	//   22   30:invokevirtual   #26  <Method String BigInteger.toString(int)>
	//   23   33:areturn         
	}

	public static boolean safeEquals(Object obj, Object obj1)
	{
		if(obj != null && obj1 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
			return obj.equals(obj1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #32  <Method boolean Object.equals(Object)>
	//    7   13:ireturn         
		else
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public static byte[] stringToBytes(String s)
	{
		s = ((String) ((new BigInteger(s, 36)).toByteArray()));
	//    0    0:new             #19  <Class BigInteger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:bipush          36
	//    4    7:invokespecial   #39  <Method void BigInteger(String, int)>
	//    5   10:invokevirtual   #43  <Method byte[] BigInteger.toByteArray()>
	//    6   13:astore_0        
		return Arrays.copyOfRange(((byte []) (s)), 1, s.length);
	//    7   14:aload_0         
	//    8   15:iconst_1        
	//    9   16:aload_0         
	//   10   17:arraylength     
	//   11   18:invokestatic    #49  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   12   21:areturn         
	}

	public static byte[] toBytes(char ac[])
	{
		ac = ((char []) (CharBuffer.wrap(ac)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method CharBuffer CharBuffer.wrap(char[])>
	//    2    4:astore_0        
		ByteBuffer bytebuffer = Charset.forName("UTF-8").encode(((CharBuffer) (ac)));
	//    3    5:ldc1            #59  <String "UTF-8">
	//    4    7:invokestatic    #65  <Method Charset Charset.forName(String)>
	//    5   10:aload_0         
	//    6   11:invokevirtual   #69  <Method ByteBuffer Charset.encode(CharBuffer)>
	//    7   14:astore_1        
		byte abyte0[] = Arrays.copyOfRange(bytebuffer.array(), bytebuffer.position(), bytebuffer.limit());
	//    8   15:aload_1         
	//    9   16:invokevirtual   #74  <Method byte[] ByteBuffer.array()>
	//   10   19:aload_1         
	//   11   20:invokevirtual   #78  <Method int ByteBuffer.position()>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #81  <Method int ByteBuffer.limit()>
	//   14   27:invokestatic    #49  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   15   30:astore_2        
		Arrays.fill(((CharBuffer) (ac)).array(), '\0');
	//   16   31:aload_0         
	//   17   32:invokevirtual   #84  <Method char[] CharBuffer.array()>
	//   18   35:iconst_0        
	//   19   36:invokestatic    #88  <Method void Arrays.fill(char[], char)>
		Arrays.fill(bytebuffer.array(), (byte)0);
	//   20   39:aload_1         
	//   21   40:invokevirtual   #74  <Method byte[] ByteBuffer.array()>
	//   22   43:iconst_0        
	//   23   44:invokestatic    #91  <Method void Arrays.fill(byte[], byte)>
		return abyte0;
	//   24   47:aload_2         
	//   25   48:areturn         
	}

	public static char[] toChars(byte abyte0[])
	{
		Object obj = ((Object) (Charset.forName("UTF-8")));
	//    0    0:ldc1            #59  <String "UTF-8">
	//    1    2:invokestatic    #65  <Method Charset Charset.forName(String)>
	//    2    5:astore_1        
		abyte0 = ((byte []) (ByteBuffer.wrap(abyte0)));
	//    3    6:aload_0         
	//    4    7:invokestatic    #96  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    5   10:astore_0        
		obj = ((Object) (((Charset) (obj)).decode(((ByteBuffer) (abyte0)))));
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #100 <Method CharBuffer Charset.decode(ByteBuffer)>
	//    9   16:astore_1        
		char ac[] = Arrays.copyOf(((CharBuffer) (obj)).array(), ((CharBuffer) (obj)).limit());
	//   10   17:aload_1         
	//   11   18:invokevirtual   #84  <Method char[] CharBuffer.array()>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #101 <Method int CharBuffer.limit()>
	//   14   25:invokestatic    #105 <Method char[] Arrays.copyOf(char[], int)>
	//   15   28:astore_2        
		Arrays.fill(((CharBuffer) (obj)).array(), '\0');
	//   16   29:aload_1         
	//   17   30:invokevirtual   #84  <Method char[] CharBuffer.array()>
	//   18   33:iconst_0        
	//   19   34:invokestatic    #88  <Method void Arrays.fill(char[], char)>
		Arrays.fill(((ByteBuffer) (abyte0)).array(), (byte)0);
	//   20   37:aload_0         
	//   21   38:invokevirtual   #74  <Method byte[] ByteBuffer.array()>
	//   22   41:iconst_0        
	//   23   42:invokestatic    #91  <Method void Arrays.fill(byte[], byte)>
		return ac;
	//   24   45:aload_2         
	//   25   46:areturn         
	}
}
