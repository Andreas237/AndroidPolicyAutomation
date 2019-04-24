// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.Environment;
import android.util.Base64;
import java.io.*;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package o:
//			ej

public final class ei
{

	public static boolean a(String s)
	{
		return !b(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #9   <Method boolean b(String)>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public static File b()
	{
		Exception exception;
		File file;
		try
		{
			file = (File)((Class) (android/os/Environment)).getMethod(new String(ej.c("Z2V0RXh0ZXJuYWxTdG9yYWdlRGlyZWN0b3J5")), new Class[0]).invoke(((Object) (null)), new Object[0]);
	//    0    0:ldc1            #15  <Class Environment>
	//    1    2:new             #17  <Class String>
	//    2    5:dup             
	//    3    6:ldc1            #19  <String "Z2V0RXh0ZXJuYWxTdG9yYWdlRGlyZWN0b3J5">
	//    4    8:invokestatic    #25  <Method byte[] ej.c(String)>
	//    5   11:invokespecial   #29  <Method void String(byte[])>
	//    6   14:iconst_0        
	//    7   15:anewarray       Class[]
	//    8   18:invokevirtual   #35  <Method Method Class.getMethod(String, Class[])>
	//    9   21:aconst_null     
	//   10   22:iconst_0        
	//   11   23:anewarray       Object[]
	//   12   26:invokevirtual   #41  <Method Object Method.invoke(Object, Object[])>
	//   13   29:checkcast       #43  <Class File>
	//   14   32:astore_0        
		}
	//*  15   33:aload_0         
	//*  16   34:areturn         
	//*  17   35:aconst_null     
	//*  18   36:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return null;
		}
		return file;
	//*  19   37:astore_0        
	//*  20   38:goto            35
	}

	public static boolean b(String s)
	{
		int j;
label0:
		{
			if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			{
				j = s.length();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #47  <Method int String.length()>
	//    4    8:istore_2        
				if(j != 0)
					break label0;
	//    5    9:iload_2         
	//    6   10:ifne            15
			}
			return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		}
		for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          42
			if(!Character.isWhitespace(s.charAt(i)))
	//*  14   22:aload_0         
	//*  15   23:iload_1         
	//*  16   24:invokevirtual   #51  <Method char String.charAt(int)>
	//*  17   27:invokestatic    #57  <Method boolean Character.isWhitespace(char)>
	//*  18   30:ifne            35
				return false;
	//   19   33:iconst_0        
	//   20   34:ireturn         

	//   21   35:iload_1         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_1        
	//*  25   39:goto            17
		return true;
	//   26   42:iconst_1        
	//   27   43:ireturn         
	}

	public static boolean c(String s)
	{
		s = ((String) (s.getBytes()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method byte[] String.getBytes()>
	//    2    4:astore_0        
		int j = s.length;
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          44
		{
			byte byte0 = s[i];
	//   11   15:aload_0         
	//   12   16:iload_1         
	//   13   17:baload          
	//   14   18:istore_3        
			if(byte0 >= 0 && byte0 <= 31 || byte0 >= 127)
	//*  15   19:iload_3         
	//*  16   20:iflt            29
	//*  17   23:iload_3         
	//*  18   24:bipush          31
	//*  19   26:icmple          35
	//*  20   29:iload_3         
	//*  21   30:bipush          127
	//*  22   32:icmplt          37
				return false;
	//   23   35:iconst_0        
	//   24   36:ireturn         
		}

	//   25   37:iload_1         
	//   26   38:iconst_1        
	//   27   39:iadd            
	//   28   40:istore_1        
	//*  29   41:goto            10
		return true;
	//   30   44:iconst_1        
	//   31   45:ireturn         
	}

	public static String d(String s)
	{
		int i;
		boolean flag;
		Object obj;
		try
		{
			flag = b(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #9   <Method boolean b(String)>
	//    2    4:istore_2        
		}
	//*   3    5:iload_2         
	//*   4    6:ifeq            11
	//*   5    9:aconst_null     
	//*   6   10:areturn         
	//*   7   11:ldc1            #65  <String "SHA-1">
	//*   8   13:invokestatic    #71  <Method MessageDigest MessageDigest.getInstance(String)>
	//*   9   16:astore_3        
	//*  10   17:aload_3         
	//*  11   18:aload_0         
	//*  12   19:ldc1            #73  <String "UTF-8">
	//*  13   21:invokevirtual   #75  <Method byte[] String.getBytes(String)>
	//*  14   24:invokevirtual   #78  <Method void MessageDigest.update(byte[])>
	//*  15   27:aload_3         
	//*  16   28:invokevirtual   #81  <Method byte[] MessageDigest.digest()>
	//*  17   31:astore_0        
	//*  18   32:new             #83  <Class StringBuilder>
	//*  19   35:dup             
	//*  20   36:invokespecial   #86  <Method void StringBuilder()>
	//*  21   39:astore_3        
	//*  22   40:iconst_0        
	//*  23   41:istore_1        
	//*  24   42:iload_1         
	//*  25   43:aload_0         
	//*  26   44:arraylength     
	//*  27   45:icmpge          78
	//*  28   48:aload_3         
	//*  29   49:ldc1            #88  <String "%02x">
	//*  30   51:iconst_1        
	//*  31   52:anewarray       Object[]
	//*  32   55:dup             
	//*  33   56:iconst_0        
	//*  34   57:aload_0         
	//*  35   58:iload_1         
	//*  36   59:baload          
	//*  37   60:invokestatic    #94  <Method Byte Byte.valueOf(byte)>
	//*  38   63:aastore         
	//*  39   64:invokestatic    #98  <Method String String.format(String, Object[])>
	//*  40   67:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*  41   70:pop             
	//*  42   71:iload_1         
	//*  43   72:iconst_1        
	//*  44   73:iadd            
	//*  45   74:istore_1        
	//*  46   75:goto            42
	//*  47   78:aload_3         
	//*  48   79:invokevirtual   #106 <Method String StringBuilder.toString()>
	//*  49   82:astore_0        
	//*  50   83:aload_0         
	//*  51   84:areturn         
	//*  52   85:aconst_null     
	//*  53   86:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		if(flag)
			return null;
		obj = ((Object) (MessageDigest.getInstance("SHA-1")));
		((MessageDigest) (obj)).update(s.getBytes("UTF-8"));
		s = ((String) (((MessageDigest) (obj)).digest()));
		obj = ((Object) (new StringBuilder()));
		i = 0;
_L2:
		if(i >= s.length)
			break; /* Loop/switch isn't completed */
		((StringBuilder) (obj)).append(String.format("%02x", new Object[] {
			Byte.valueOf(s[i])
		}));
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		s = ((StringBuilder) (obj)).toString();
		return s;
	//*  54   87:astore_0        
	//*  55   88:goto            85
	}

	public static String d(String s, String s1)
	{
		try
		{
			s = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] {
				java/lang/String, java/lang/String
			}).invoke(((Object) (null)), new Object[] {
				s, s1
			});
	//    0    0:ldc1            #109 <String "android.os.SystemProperties">
	//    1    2:invokestatic    #113 <Method Class Class.forName(String)>
	//    2    5:ldc1            #115 <String "get">
	//    3    7:iconst_2        
	//    4    8:anewarray       Class[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:ldc1            #17  <Class String>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:ldc1            #17  <Class String>
	//   12   20:aastore         
	//   13   21:invokevirtual   #35  <Method Method Class.getMethod(String, Class[])>
	//   14   24:aconst_null     
	//   15   25:iconst_2        
	//   16   26:anewarray       Object[]
	//   17   29:dup             
	//   18   30:iconst_0        
	//   19   31:aload_0         
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_1        
	//   23   35:aload_1         
	//   24   36:aastore         
	//   25   37:invokevirtual   #41  <Method Object Method.invoke(Object, Object[])>
	//   26   40:checkcast       #17  <Class String>
	//   27   43:astore_0        
		}
	//*  28   44:aload_0         
	//*  29   45:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   46:astore_0        
		{
			return s1;
	//   31   47:aload_1         
	//   32   48:areturn         
		}
		return s;
	}

	public static String d(Throwable throwable)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #118 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void StringWriter()>
	//    3    7:astore_1        
		throwable.printStackTrace(new PrintWriter(((java.io.Writer) (stringwriter))));
	//    4    8:aload_0         
	//    5    9:new             #121 <Class PrintWriter>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #124 <Method void PrintWriter(java.io.Writer)>
	//    9   17:invokevirtual   #130 <Method void Throwable.printStackTrace(PrintWriter)>
		return ((Object) (stringwriter)).toString();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #131 <Method String Object.toString()>
	//   12   24:areturn         
	}

	public static String d(Map map, String s, String s1)
	{
		if(map == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return s1;
	//    2    4:aload_2         
	//    3    5:areturn         
		map = ((Map) ((String)map.get(((Object) (s)))));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokeinterface #137 <Method Object Map.get(Object)>
	//    7   13:checkcast       #17  <Class String>
	//    8   16:astore_0        
		if(map == null)
	//*   9   17:aload_0         
	//*  10   18:ifnonnull       23
			return s1;
	//   11   21:aload_2         
	//   12   22:areturn         
		else
			return ((String) (map));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public static String e(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #142 <String "">
	//    3    6:areturn         
		else
			return s;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public static boolean e(String s, String s1)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return s1 == null;
	//    2    4:aload_1         
	//    3    5:ifnonnull       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
		else
			return s.equals(((Object) (s1)));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #147 <Method boolean String.equals(Object)>
	//   11   17:ireturn         
	}

	public static String f(String s)
	{
		try
		{
			byte abyte0[] = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(s.length()).array();
	//    0    0:iconst_4        
	//    1    1:invokestatic    #154 <Method ByteBuffer ByteBuffer.allocate(int)>
	//    2    4:getstatic       #160 <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//    3    7:invokevirtual   #164 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #47  <Method int String.length()>
	//    6   14:invokevirtual   #167 <Method ByteBuffer ByteBuffer.putInt(int)>
	//    7   17:invokevirtual   #170 <Method byte[] ByteBuffer.array()>
	//    8   20:astore_1        
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(s.length());
	//    9   21:new             #172 <Class ByteArrayOutputStream>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:invokevirtual   #47  <Method int String.length()>
	//   13   29:invokespecial   #175 <Method void ByteArrayOutputStream(int)>
	//   14   32:astore_2        
			GZIPOutputStream gzipoutputstream = new GZIPOutputStream(((java.io.OutputStream) (bytearrayoutputstream)));
	//   15   33:new             #177 <Class GZIPOutputStream>
	//   16   36:dup             
	//   17   37:aload_2         
	//   18   38:invokespecial   #180 <Method void GZIPOutputStream(java.io.OutputStream)>
	//   19   41:astore_3        
			gzipoutputstream.write(s.getBytes("UTF-8"));
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:ldc1            #73  <String "UTF-8">
	//   23   46:invokevirtual   #75  <Method byte[] String.getBytes(String)>
	//   24   49:invokevirtual   #183 <Method void GZIPOutputStream.write(byte[])>
			gzipoutputstream.close();
	//   25   52:aload_3         
	//   26   53:invokevirtual   #186 <Method void GZIPOutputStream.close()>
			bytearrayoutputstream.close();
	//   27   56:aload_2         
	//   28   57:invokevirtual   #187 <Method void ByteArrayOutputStream.close()>
			s = ((String) (new byte[bytearrayoutputstream.toByteArray().length + 4]));
	//   29   60:aload_2         
	//   30   61:invokevirtual   #190 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   31   64:arraylength     
	//   32   65:iconst_4        
	//   33   66:iadd            
	//   34   67:newarray        byte[]
	//   35   69:astore_0        
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (s)), 0, 4);
	//   36   70:aload_1         
	//   37   71:iconst_0        
	//   38   72:aload_0         
	//   39   73:iconst_0        
	//   40   74:iconst_4        
	//   41   75:invokestatic    #196 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (bytearrayoutputstream.toByteArray())), 0, ((Object) (s)), 4, bytearrayoutputstream.toByteArray().length);
	//   42   78:aload_2         
	//   43   79:invokevirtual   #190 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   44   82:iconst_0        
	//   45   83:aload_0         
	//   46   84:iconst_4        
	//   47   85:aload_2         
	//   48   86:invokevirtual   #190 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   49   89:arraylength     
	//   50   90:invokestatic    #196 <Method void System.arraycopy(Object, int, Object, int, int)>
			s = Base64.encodeToString(((byte []) (s)), 8);
	//   51   93:aload_0         
	//   52   94:bipush          8
	//   53   96:invokestatic    #202 <Method String Base64.encodeToString(byte[], int)>
	//   54   99:astore_0        
		}
	//*  55  100:aload_0         
	//*  56  101:areturn         
	//*  57  102:ldc1            #142 <String "">
	//*  58  104:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return "";
		}
		return s;
	//*  59  105:astore_0        
	//*  60  106:goto            102
	}

	public static String h(String s)
	{
		if(b(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #9   <Method boolean b(String)>
	//*   2    4:ifeq            10
			return "";
	//    3    7:ldc1            #142 <String "">
	//    4    9:areturn         
		ByteArrayOutputStream bytearrayoutputstream;
		GZIPOutputStream gzipoutputstream;
		byte abyte1[];
		s = ((String) (new ByteArrayInputStream(s.getBytes("utf-8"))));
	//    5   10:new             #205 <Class ByteArrayInputStream>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:ldc1            #207 <String "utf-8">
	//    9   17:invokevirtual   #75  <Method byte[] String.getBytes(String)>
	//   10   20:invokespecial   #208 <Method void ByteArrayInputStream(byte[])>
	//   11   23:astore_0        
		bytearrayoutputstream = new ByteArrayOutputStream();
	//   12   24:new             #172 <Class ByteArrayOutputStream>
	//   13   27:dup             
	//   14   28:invokespecial   #209 <Method void ByteArrayOutputStream()>
	//   15   31:astore_2        
		gzipoutputstream = new GZIPOutputStream(((java.io.OutputStream) (bytearrayoutputstream)));
	//   16   32:new             #177 <Class GZIPOutputStream>
	//   17   35:dup             
	//   18   36:aload_2         
	//   19   37:invokespecial   #180 <Method void GZIPOutputStream(java.io.OutputStream)>
	//   20   40:astore_3        
		abyte1 = new byte[1024];
	//   21   41:sipush          1024
	//   22   44:newarray        byte[]
	//   23   46:astore          4
_L1:
		int i = ((ByteArrayInputStream) (s)).read(abyte1, 0, 1024);
	//   24   48:aload_0         
	//   25   49:aload           4
	//   26   51:iconst_0        
	//   27   52:sipush          1024
	//   28   55:invokevirtual   #213 <Method int ByteArrayInputStream.read(byte[], int, int)>
	//   29   58:istore_1        
label0:
		{
			if(i == -1)
				break label0;
	//   30   59:iload_1         
	//   31   60:iconst_m1       
	//   32   61:icmpeq          75
			byte abyte0[];
			try
			{
				gzipoutputstream.write(abyte1, 0, i);
	//   33   64:aload_3         
	//   34   65:aload           4
	//   35   67:iconst_0        
	//   36   68:iload_1         
	//   37   69:invokevirtual   #216 <Method void GZIPOutputStream.write(byte[], int, int)>
			}
	//*  38   72:goto            48
	//*  39   75:aload_3         
	//*  40   76:invokevirtual   #219 <Method void GZIPOutputStream.flush()>
	//*  41   79:aload_3         
	//*  42   80:invokevirtual   #186 <Method void GZIPOutputStream.close()>
	//*  43   83:aload_2         
	//*  44   84:invokevirtual   #190 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  45   87:astore_3        
	//*  46   88:aload_2         
	//*  47   89:invokevirtual   #220 <Method void ByteArrayOutputStream.flush()>
	//*  48   92:aload_2         
	//*  49   93:invokevirtual   #187 <Method void ByteArrayOutputStream.close()>
	//*  50   96:aload_0         
	//*  51   97:invokevirtual   #221 <Method void ByteArrayInputStream.close()>
	//*  52  100:new             #17  <Class String>
	//*  53  103:dup             
	//*  54  104:aload_3         
	//*  55  105:iconst_2        
	//*  56  106:invokestatic    #225 <Method byte[] Base64.encode(byte[], int)>
	//*  57  109:invokespecial   #29  <Method void String(byte[])>
	//*  58  112:astore_0        
	//*  59  113:aload_0         
	//*  60  114:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  61  115:astore_0        
			{
				return "";
	//   62  116:ldc1            #142 <String "">
	//   63  118:areturn         
			}
		}
		  goto _L1
		gzipoutputstream.flush();
		gzipoutputstream.close();
		abyte0 = bytearrayoutputstream.toByteArray();
		bytearrayoutputstream.flush();
		bytearrayoutputstream.close();
		((ByteArrayInputStream) (s)).close();
		s = new String(Base64.encode(abyte0, 2));
		return s;
	}
}
