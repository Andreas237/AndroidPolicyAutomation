// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.pdf.ByteBuffer;
import com.itextpdf.text.pdf.PRTokeniser;
import com.itextpdf.text.pdf.PdfEncodings;
import java.io.*;
import java.net.*;
import java.util.*;

public class Utilities
{

	public Utilities()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Object[][] addToArray(Object aobj[][], Object aobj1[])
	{
		if(aobj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       13
		{
			return (new Object[][] {
				aobj1
			});
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[][]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:areturn         
		} else
		{
			Object aobj2[][] = new Object[aobj.length + 1][];
	//    9   13:aload_0         
	//   10   14:arraylength     
	//   11   15:iconst_1        
	//   12   16:iadd            
	//   13   17:anewarray       Object[][]
	//   14   20:astore_2        
			System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), 0, aobj.length);
	//   15   21:aload_0         
	//   16   22:iconst_0        
	//   17   23:aload_2         
	//   18   24:iconst_0        
	//   19   25:aload_0         
	//   20   26:arraylength     
	//   21   27:invokestatic    #19  <Method void System.arraycopy(Object, int, Object, int, int)>
			aobj2[aobj.length] = aobj1;
	//   22   30:aload_2         
	//   23   31:aload_0         
	//   24   32:arraylength     
	//   25   33:aload_1         
	//   26   34:aastore         
			return aobj2;
	//   27   35:aload_2         
	//   28   36:areturn         
		}
	}

	public static boolean checkTrueOrFalse(Properties properties, String s)
	{
		return "true".equalsIgnoreCase(properties.getProperty(s));
	//    0    0:ldc1            #23  <String "true">
	//    1    2:aload_0         
	//    2    3:aload_1         
	//    3    4:invokevirtual   #29  <Method String Properties.getProperty(String)>
	//    4    7:invokevirtual   #35  <Method boolean String.equalsIgnoreCase(String)>
	//    5   10:ireturn         
	}

	public static String convertFromUtf32(int i)
	{
		if(i < 0x10000)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #38  <Int 0x10000>
	//*   2    3:icmpge          12
		{
			return Character.toString((char)i);
	//    3    6:iload_0         
	//    4    7:int2char        
	//    5    8:invokestatic    #44  <Method String Character.toString(char)>
	//    6   11:areturn         
		} else
		{
			i -= 0x10000;
	//    7   12:iload_0         
	//    8   13:ldc1            #38  <Int 0x10000>
	//    9   15:isub            
	//   10   16:istore_0        
			return new String(new char[] {
				(char)(i / 1024 + 55296), (char)(i % 1024 + 56320)
			});
	//   11   17:new             #31  <Class String>
	//   12   20:dup             
	//   13   21:iconst_2        
	//   14   22:newarray        char[]
	//   15   24:dup             
	//   16   25:iconst_0        
	//   17   26:iload_0         
	//   18   27:sipush          1024
	//   19   30:idiv            
	//   20   31:ldc1            #45  <Int 55296>
	//   21   33:iadd            
	//   22   34:int2char        
	//   23   35:castore         
	//   24   36:dup             
	//   25   37:iconst_1        
	//   26   38:iload_0         
	//   27   39:sipush          1024
	//   28   42:irem            
	//   29   43:ldc1            #46  <Int 56320>
	//   30   45:iadd            
	//   31   46:int2char        
	//   32   47:castore         
	//   33   48:invokespecial   #49  <Method void String(char[])>
	//   34   51:areturn         
		}
	}

	public static String convertToHex(byte abyte0[])
	{
		ByteBuffer bytebuffer = new ByteBuffer();
	//    0    0:new             #53  <Class ByteBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void ByteBuffer()>
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
	//*  11   15:icmpge          33
			bytebuffer.appendHex(abyte0[i]);
	//   12   18:aload_3         
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:baload          
	//   16   22:invokevirtual   #58  <Method ByteBuffer ByteBuffer.appendHex(byte)>
	//   17   25:pop             

	//   18   26:iload_1         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_1        
	//*  22   30:goto            13
		return PdfEncodings.convertToString(bytebuffer.toByteArray(), ((String) (null))).toUpperCase();
	//   23   33:aload_3         
	//   24   34:invokevirtual   #62  <Method byte[] ByteBuffer.toByteArray()>
	//   25   37:aconst_null     
	//   26   38:invokestatic    #68  <Method String PdfEncodings.convertToString(byte[], String)>
	//   27   41:invokevirtual   #72  <Method String String.toUpperCase()>
	//   28   44:areturn         
	}

	public static int convertToUtf32(char c, char c1)
	{
		return (((c - 55296) * 1024 + c1) - 56320) + 0x10000;
	//    0    0:iload_0         
	//    1    1:ldc1            #45  <Int 55296>
	//    2    3:isub            
	//    3    4:sipush          1024
	//    4    7:imul            
	//    5    8:iload_1         
	//    6    9:iadd            
	//    7   10:ldc1            #46  <Int 56320>
	//    8   12:isub            
	//    9   13:ldc1            #38  <Int 0x10000>
	//   10   15:iadd            
	//   11   16:ireturn         
	}

	public static int convertToUtf32(String s, int i)
	{
		return (((s.charAt(i) - 55296) * 1024 + s.charAt(i + 1)) - 56320) + 0x10000;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #79  <Method char String.charAt(int)>
	//    3    5:ldc1            #45  <Int 55296>
	//    4    7:isub            
	//    5    8:sipush          1024
	//    6   11:imul            
	//    7   12:aload_0         
	//    8   13:iload_1         
	//    9   14:iconst_1        
	//   10   15:iadd            
	//   11   16:invokevirtual   #79  <Method char String.charAt(int)>
	//   12   19:iadd            
	//   13   20:ldc1            #46  <Int 56320>
	//   14   22:isub            
	//   15   23:ldc1            #38  <Int 0x10000>
	//   16   25:iadd            
	//   17   26:ireturn         
	}

	public static int convertToUtf32(char ac[], int i)
	{
		return (((ac[i] - 55296) * 1024 + ac[i + 1]) - 56320) + 0x10000;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:caload          
	//    3    3:ldc1            #45  <Int 55296>
	//    4    5:isub            
	//    5    6:sipush          1024
	//    6    9:imul            
	//    7   10:aload_0         
	//    8   11:iload_1         
	//    9   12:iconst_1        
	//   10   13:iadd            
	//   11   14:caload          
	//   12   15:iadd            
	//   13   16:ldc1            #46  <Int 56320>
	//   14   18:isub            
	//   15   19:ldc1            #38  <Int 0x10000>
	//   16   21:iadd            
	//   17   22:ireturn         
	}

	public static char[] copyOfRange(char ac[], int i, int j)
	{
		int k = j - i;
	//    0    0:iload_2         
	//    1    1:iload_1         
	//    2    2:isub            
	//    3    3:istore_3        
		if(k < 0)
	//*   4    4:iload_3         
	//*   5    5:ifge            39
		{
			throw new IllegalArgumentException((new StringBuilder()).append(i).append(" > ").append(j).toString());
	//    6    8:new             #84  <Class IllegalArgumentException>
	//    7   11:dup             
	//    8   12:new             #86  <Class StringBuilder>
	//    9   15:dup             
	//   10   16:invokespecial   #87  <Method void StringBuilder()>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   13   23:ldc1            #93  <String " > ">
	//   14   25:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:iload_2         
	//   16   29:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   19   38:athrow          
		} else
		{
			char ac1[] = new char[k];
	//   20   39:iload_3         
	//   21   40:newarray        char[]
	//   22   42:astore          4
			System.arraycopy(((Object) (ac)), i, ((Object) (ac1)), 0, Math.min(ac.length - i, k));
	//   23   44:aload_0         
	//   24   45:iload_1         
	//   25   46:aload           4
	//   26   48:iconst_0        
	//   27   49:aload_0         
	//   28   50:arraylength     
	//   29   51:iload_1         
	//   30   52:isub            
	//   31   53:iload_3         
	//   32   54:invokestatic    #107 <Method int Math.min(int, int)>
	//   33   57:invokestatic    #19  <Method void System.arraycopy(Object, int, Object, int, int)>
			return ac1;
	//   34   60:aload           4
	//   35   62:areturn         
		}
	}

	public static Set getKeySet(Hashtable hashtable)
	{
		if(hashtable == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return Collections.emptySet();
	//    2    4:invokestatic    #116 <Method Set Collections.emptySet()>
	//    3    7:areturn         
		else
			return hashtable.keySet();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #121 <Method Set Hashtable.keySet()>
	//    6   12:areturn         
	}

	public static final float inchesToMillimeters(float f)
	{
		return 25.4F * f;
	//    0    0:ldc1            #127 <Float 25.4F>
	//    1    2:fload_0         
	//    2    3:fmul            
	//    3    4:freturn         
	}

	public static final float inchesToPoints(float f)
	{
		return 72F * f;
	//    0    0:ldc1            #129 <Float 72F>
	//    1    2:fload_0         
	//    2    3:fmul            
	//    3    4:freturn         
	}

	public static boolean isSurrogateHigh(char c)
	{
		return c >= '\uD800' && c <= '\uDBFF';
	//    0    0:iload_0         
	//    1    1:ldc1            #45  <Int 55296>
	//    2    3:icmplt          14
	//    3    6:iload_0         
	//    4    7:ldc1            #132 <Int 56319>
	//    5    9:icmpgt          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public static boolean isSurrogateLow(char c)
	{
		return c >= '\uDC00' && c <= '\uDFFF';
	//    0    0:iload_0         
	//    1    1:ldc1            #46  <Int 56320>
	//    2    3:icmplt          14
	//    3    6:iload_0         
	//    4    7:ldc1            #134 <Int 57343>
	//    5    9:icmpgt          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public static boolean isSurrogatePair(String s, int i)
	{
		while(i < 0 || i > s.length() - 2 || !isSurrogateHigh(s.charAt(i)) || !isSurrogateLow(s.charAt(i + 1))) 
	//*   0    0:iload_1         
	//*   1    1:iflt            14
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #140 <Method int String.length()>
	//*   5    9:iconst_2        
	//*   6   10:isub            
	//*   7   11:icmple          16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokevirtual   #79  <Method char String.charAt(int)>
	//   13   21:invokestatic    #142 <Method boolean isSurrogateHigh(char)>
	//   14   24:ifeq            14
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:invokevirtual   #79  <Method char String.charAt(int)>
	//   20   34:invokestatic    #144 <Method boolean isSurrogateLow(char)>
	//   21   37:ifeq            14
		return true;
	//   22   40:iconst_1        
	//   23   41:ireturn         
	}

	public static boolean isSurrogatePair(char ac[], int i)
	{
		while(i < 0 || i > ac.length - 2 || !isSurrogateHigh(ac[i]) || !isSurrogateLow(ac[i + 1])) 
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:arraylength     
	//*   5    7:iconst_2        
	//*   6    8:isub            
	//*   7    9:icmple          14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:caload          
	//   13   17:invokestatic    #142 <Method boolean isSurrogateHigh(char)>
	//   14   20:ifeq            12
	//   15   23:aload_0         
	//   16   24:iload_1         
	//   17   25:iconst_1        
	//   18   26:iadd            
	//   19   27:caload          
	//   20   28:invokestatic    #144 <Method boolean isSurrogateLow(char)>
	//   21   31:ifeq            12
		return true;
	//   22   34:iconst_1        
	//   23   35:ireturn         
	}

	public static final float millimetersToInches(float f)
	{
		return f / 25.4F;
	//    0    0:fload_0         
	//    1    1:ldc1            #127 <Float 25.4F>
	//    2    3:fdiv            
	//    3    4:freturn         
	}

	public static final float millimetersToPoints(float f)
	{
		return inchesToPoints(millimetersToInches(f));
	//    0    0:fload_0         
	//    1    1:invokestatic    #149 <Method float millimetersToInches(float)>
	//    2    4:invokestatic    #151 <Method float inchesToPoints(float)>
	//    3    7:freturn         
	}

	public static final float pointsToInches(float f)
	{
		return f / 72F;
	//    0    0:fload_0         
	//    1    1:ldc1            #129 <Float 72F>
	//    2    3:fdiv            
	//    3    4:freturn         
	}

	public static final float pointsToMillimeters(float f)
	{
		return inchesToMillimeters(pointsToInches(f));
	//    0    0:fload_0         
	//    1    1:invokestatic    #155 <Method float pointsToInches(float)>
	//    2    4:invokestatic    #157 <Method float inchesToMillimeters(float)>
	//    3    7:freturn         
	}

	public static String readFileToString(File file)
		throws IOException
	{
		byte abyte0[] = new byte[(int)file.length()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #166 <Method long File.length()>
	//    2    4:l2i             
	//    3    5:newarray        byte[]
	//    4    7:astore_1        
		(new FileInputStream(file)).read(abyte0);
	//    5    8:new             #168 <Class FileInputStream>
	//    6   11:dup             
	//    7   12:aload_0         
	//    8   13:invokespecial   #171 <Method void FileInputStream(File)>
	//    9   16:aload_1         
	//   10   17:invokevirtual   #175 <Method int FileInputStream.read(byte[])>
	//   11   20:pop             
		return new String(abyte0);
	//   12   21:new             #31  <Class String>
	//   13   24:dup             
	//   14   25:aload_1         
	//   15   26:invokespecial   #178 <Method void String(byte[])>
	//   16   29:areturn         
	}

	public static String readFileToString(String s)
		throws IOException
	{
		return readFileToString(new File(s));
	//    0    0:new             #163 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #180 <Method void File(String)>
	//    4    8:invokestatic    #182 <Method String readFileToString(File)>
	//    5   11:areturn         
	}

	public static void skip(InputStream inputstream, int i)
		throws IOException
	{
		do
		{
			long l;
label0:
			{
				if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            17
				{
					l = inputstream.skip(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:i2l             
	//    5    7:invokevirtual   #189 <Method long InputStream.skip(long)>
	//    6   10:lstore_2        
					if(l > 0L)
						break label0;
	//    7   11:lload_2         
	//    8   12:lconst_0        
	//    9   13:lcmp            
	//   10   14:ifgt            18
				}
				return;
	//   11   17:return          
			}
			i = (int)((long)i - l);
	//   12   18:iload_1         
	//   13   19:i2l             
	//   14   20:lload_2         
	//   15   21:lsub            
	//   16   22:l2i             
	//   17   23:istore_1        
		} while(true);
	//   18   24:goto            0
	}

	public static URL toURL(String s)
		throws MalformedURLException
	{
		URL url;
		try
		{
			url = new URL(s);
	//    0    0:new             #197 <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #198 <Method void URL(String)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		catch(Exception exception)
	//*   7   11:astore_1        
		{
			return (new File(s)).toURI().toURL();
	//    8   12:new             #163 <Class File>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #180 <Method void File(String)>
	//   12   20:invokevirtual   #202 <Method URI File.toURI()>
	//   13   23:invokevirtual   #207 <Method URL URI.toURL()>
	//   14   26:areturn         
		}
		return url;
	}

	public static String unEscapeURL(String s)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #210 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #211 <Method void StringBuffer()>
	//    3    7:astore          5
		s = ((String) (s.toCharArray()));
	//    4    9:aload_0         
	//    5   10:invokevirtual   #215 <Method char[] String.toCharArray()>
	//    6   13:astore_0        
		int i = 0;
	//    7   14:iconst_0        
	//    8   15:istore_2        
		while(i < s.length) 
	//*   9   16:iload_2         
	//*  10   17:aload_0         
	//*  11   18:arraylength     
	//*  12   19:icmpge          123
		{
			char c = s[i];
	//   13   22:aload_0         
	//   14   23:iload_2         
	//   15   24:caload          
	//   16   25:istore_1        
			if(c == '%')
	//*  17   26:iload_1         
	//*  18   27:bipush          37
	//*  19   29:icmpne          113
			{
				if(i + 2 >= s.length)
	//*  20   32:iload_2         
	//*  21   33:iconst_2        
	//*  22   34:iadd            
	//*  23   35:aload_0         
	//*  24   36:arraylength     
	//*  25   37:icmplt          54
				{
					stringbuffer.append(c);
	//   26   40:aload           5
	//   27   42:iload_1         
	//   28   43:invokevirtual   #218 <Method StringBuffer StringBuffer.append(char)>
	//   29   46:pop             
				} else
	//*  30   47:iload_2         
	//*  31   48:iconst_1        
	//*  32   49:iadd            
	//*  33   50:istore_2        
	//*  34   51:goto            16
				{
					int j = PRTokeniser.getHex(((int) (s[i + 1])));
	//   35   54:aload_0         
	//   36   55:iload_2         
	//   37   56:iconst_1        
	//   38   57:iadd            
	//   39   58:caload          
	//   40   59:invokestatic    #224 <Method int PRTokeniser.getHex(int)>
	//   41   62:istore_3        
					int k = PRTokeniser.getHex(((int) (s[i + 2])));
	//   42   63:aload_0         
	//   43   64:iload_2         
	//   44   65:iconst_2        
	//   45   66:iadd            
	//   46   67:caload          
	//   47   68:invokestatic    #224 <Method int PRTokeniser.getHex(int)>
	//   48   71:istore          4
					if(j < 0 || k < 0)
	//*  49   73:iload_3         
	//*  50   74:iflt            82
	//*  51   77:iload           4
	//*  52   79:ifge            92
					{
						stringbuffer.append(c);
	//   53   82:aload           5
	//   54   84:iload_1         
	//   55   85:invokevirtual   #218 <Method StringBuffer StringBuffer.append(char)>
	//   56   88:pop             
					} else
	//*  57   89:goto            47
					{
						stringbuffer.append((char)(j * 16 + k));
	//   58   92:aload           5
	//   59   94:iload_3         
	//   60   95:bipush          16
	//   61   97:imul            
	//   62   98:iload           4
	//   63  100:iadd            
	//   64  101:int2char        
	//   65  102:invokevirtual   #218 <Method StringBuffer StringBuffer.append(char)>
	//   66  105:pop             
						i += 2;
	//   67  106:iload_2         
	//   68  107:iconst_2        
	//   69  108:iadd            
	//   70  109:istore_2        
					}
				}
			} else
	//*  71  110:goto            47
			{
				stringbuffer.append(c);
	//   72  113:aload           5
	//   73  115:iload_1         
	//   74  116:invokevirtual   #218 <Method StringBuffer StringBuffer.append(char)>
	//   75  119:pop             
			}
			i++;
		}
	//*  76  120:goto            47
		return stringbuffer.toString();
	//   77  123:aload           5
	//   78  125:invokevirtual   #225 <Method String StringBuffer.toString()>
	//   79  128:areturn         
	}
}
