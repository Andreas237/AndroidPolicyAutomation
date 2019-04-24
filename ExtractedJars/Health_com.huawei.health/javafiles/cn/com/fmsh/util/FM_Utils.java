// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// Referenced classes of package cn.com.fmsh.util:
//			FM_Bytes

public class FM_Utils
{

	public FM_Utils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static int String2Int(String s, int i)
	{
		int j;
		try
		{
			j = Integer.parseInt(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #26  <Method int Integer.parseInt(String)>
	//    2    4:istore_2        
		}
	//*   3    5:iload_2         
	//*   4    6:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			return i;
	//    6    8:iload_1         
	//    7    9:ireturn         
		}
		return j;
	}

	public static void exceptionHandle(Exception exception)
	{
		try
		{
			throw exception;
	//    0    0:aload_0         
	//    1    1:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
	//*   2    2:astore_0        
		{
			return;
	//    3    3:return          
		}
	}

	public static String getExceptionInfo(Exception exception)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #32  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		exception.printStackTrace(new PrintStream(((java.io.OutputStream) (bytearrayoutputstream))));
	//    4    8:aload_0         
	//    5    9:new             #35  <Class PrintStream>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #38  <Method void PrintStream(java.io.OutputStream)>
	//    9   17:invokevirtual   #42  <Method void Exception.printStackTrace(PrintStream)>
		return bytearrayoutputstream.toString();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #46  <Method String ByteArrayOutputStream.toString()>
	//   12   24:areturn         
	}

	public static long hexStringToLong(String s)
	{
		int l = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method int String.length()>
	//    2    4:istore          4
		long l1 = 0L;
	//    3    6:lconst_0        
	//    4    7:lstore          5
		s = ((String) (s.toCharArray()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #58  <Method char[] String.toCharArray()>
	//    7   13:astore_0        
		for(int i = 0; i < l; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:goto            80
		{
			int j = Integer.parseInt((new StringBuilder(String.valueOf(s[i]))).toString(), 16);
	//   11   19:new             #60  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:caload          
	//   16   26:invokestatic    #64  <Method String String.valueOf(char)>
	//   17   29:invokespecial   #67  <Method void StringBuilder(String)>
	//   18   32:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   19   35:bipush          16
	//   20   37:invokestatic    #70  <Method int Integer.parseInt(String, int)>
	//   21   40:istore_2        
			for(int k = 0; k < l - i - 1 && j != 0; k++)
	//*  22   41:iconst_0        
	//*  23   42:istore_3        
	//*  24   43:goto            55
				j *= 16;
	//   25   46:iload_2         
	//   26   47:bipush          16
	//   27   49:imul            
	//   28   50:istore_2        

	//   29   51:iload_3         
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore_3        
	//   33   55:iload_3         
	//   34   56:iload           4
	//   35   58:iload_1         
	//   36   59:isub            
	//   37   60:iconst_1        
	//   38   61:isub            
	//   39   62:icmpge          69
	//   40   65:iload_2         
	//   41   66:ifne            46
			l1 += j;
	//   42   69:lload           5
	//   43   71:iload_2         
	//   44   72:i2l             
	//   45   73:ladd            
	//   46   74:lstore          5
		}

	//   47   76:iload_1         
	//   48   77:iconst_1        
	//   49   78:iadd            
	//   50   79:istore_1        
	//   51   80:iload_1         
	//   52   81:iload           4
	//   53   83:icmplt          19
		return l1;
	//   54   86:lload           5
	//   55   88:lreturn         
	}

	public static String intToHexString(int i, int j)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #74  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuffer()>
	//    3    7:astore_2        
		byte abyte0[] = FM_Bytes.intToBytes(i, j);
	//    4    8:iload_0         
	//    5    9:iload_1         
	//    6   10:invokestatic    #81  <Method byte[] FM_Bytes.intToBytes(int, int)>
	//    7   13:astore_3        
		for(i = 0; i < abyte0.length; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_0        
	//*  10   16:goto            60
		{
			j = ((int) (abyte0[i]));
	//   11   19:aload_3         
	//   12   20:iload_0         
	//   13   21:baload          
	//   14   22:istore_1        
			stringbuffer.append(hexString.charAt((j & 0xf0) >> 4));
	//   15   23:aload_2         
	//   16   24:getstatic       #12  <Field String hexString>
	//   17   27:iload_1         
	//   18   28:sipush          240
	//   19   31:iand            
	//   20   32:iconst_4        
	//   21   33:ishr            
	//   22   34:invokevirtual   #85  <Method char String.charAt(int)>
	//   23   37:invokevirtual   #89  <Method StringBuffer StringBuffer.append(char)>
	//   24   40:pop             
			stringbuffer.append(hexString.charAt(j & 0xf));
	//   25   41:aload_2         
	//   26   42:getstatic       #12  <Field String hexString>
	//   27   45:iload_1         
	//   28   46:bipush          15
	//   29   48:iand            
	//   30   49:invokevirtual   #85  <Method char String.charAt(int)>
	//   31   52:invokevirtual   #89  <Method StringBuffer StringBuffer.append(char)>
	//   32   55:pop             
		}

	//   33   56:iload_0         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_0        
	//   37   60:iload_0         
	//   38   61:aload_3         
	//   39   62:arraylength     
	//   40   63:icmplt          19
		return stringbuffer.toString();
	//   41   66:aload_2         
	//   42   67:invokevirtual   #90  <Method String StringBuffer.toString()>
	//   43   70:areturn         
	}

	public static boolean isChinese(char c)
	{
		Character.UnicodeBlock unicodeblock = Character.UnicodeBlock.of(c);
	//    0    0:iload_0         
	//    1    1:invokestatic    #98  <Method Character$UnicodeBlock Character$UnicodeBlock.of(char)>
	//    2    4:astore_1        
		return unicodeblock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeblock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeblock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeblock == Character.UnicodeBlock.GENERAL_PUNCTUATION || unicodeblock == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || unicodeblock == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS;
	//    3    5:aload_1         
	//    4    6:getstatic       #102 <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS>
	//    5    9:if_acmpeq       47
	//    6   12:aload_1         
	//    7   13:getstatic       #105 <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS>
	//    8   16:if_acmpeq       47
	//    9   19:aload_1         
	//   10   20:getstatic       #108 <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A>
	//   11   23:if_acmpeq       47
	//   12   26:aload_1         
	//   13   27:getstatic       #111 <Field Character$UnicodeBlock Character$UnicodeBlock.GENERAL_PUNCTUATION>
	//   14   30:if_acmpeq       47
	//   15   33:aload_1         
	//   16   34:getstatic       #114 <Field Character$UnicodeBlock Character$UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION>
	//   17   37:if_acmpeq       47
	//   18   40:aload_1         
	//   19   41:getstatic       #117 <Field Character$UnicodeBlock Character$UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS>
	//   20   44:if_acmpne       49
	//   21   47:iconst_1        
	//   22   48:ireturn         
	//   23   49:iconst_0        
	//   24   50:ireturn         
	}

	public static boolean isNotEmpty(String s)
	{
		return s != null && !"".equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:ldc1            #121 <String "">
	//    3    6:aload_0         
	//    4    7:invokevirtual   #125 <Method boolean String.equals(Object)>
	//    5   10:ifeq            15
	//    6   13:iconst_0        
	//    7   14:ireturn         
	//    8   15:iconst_1        
	//    9   16:ireturn         
	}

	private static String hexString = "0123456789ABCDEF";

	static 
	{
	//    0    0:ldc1            #10  <String "0123456789ABCDEF">
	//    1    2:putstatic       #12  <Field String hexString>
	//*   2    5:return          
	}
}
