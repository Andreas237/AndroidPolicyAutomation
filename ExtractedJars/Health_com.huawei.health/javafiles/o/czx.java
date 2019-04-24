// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

// Referenced classes of package o:
//			dho

public class czx
{

	public czx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static String a(int i)
	{
		String s = d(i >> 8 & 0xff);
	//    0    0:iload_0         
	//    1    1:bipush          8
	//    2    3:ishr            
	//    3    4:sipush          255
	//    4    7:iand            
	//    5    8:invokestatic    #17  <Method String d(int)>
	//    6   11:astore_1        
		return (new StringBuilder()).append(s).append(d(i & 0xff)).toString();
	//    7   12:new             #19  <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #20  <Method void StringBuilder()>
	//   10   19:aload_1         
	//   11   20:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:iload_0         
	//   13   24:sipush          255
	//   14   27:iand            
	//   15   28:invokestatic    #17  <Method String d(int)>
	//   16   31:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   18   37:areturn         
	}

	public static String a(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       21
		{
			dho.d("stringToHex:", new Object[] {
				"string is null"
			});
	//    2    4:ldc1            #33  <String "stringToHex:">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #35  <String "string is null">
	//    8   14:aastore         
	//    9   15:invokestatic    #40  <Method void dho.d(String, Object[])>
			return "";
	//   10   18:ldc1            #42  <String "">
	//   11   20:areturn         
		}
		char ac[] = "0123456789ABCDEF".toCharArray();
	//   12   21:ldc1            #44  <String "0123456789ABCDEF">
	//   13   23:invokevirtual   #50  <Method char[] String.toCharArray()>
	//   14   26:astore_3        
		StringBuilder stringbuilder = new StringBuilder("");
	//   15   27:new             #19  <Class StringBuilder>
	//   16   30:dup             
	//   17   31:ldc1            #42  <String "">
	//   18   33:invokespecial   #53  <Method void StringBuilder(String)>
	//   19   36:astore          4
		byte abyte0[] = new byte[0];
	//   20   38:iconst_0        
	//   21   39:newarray        byte[]
	//   22   41:astore_2        
		try
		{
			s = ((String) (s.getBytes("utf-8")));
	//   23   42:aload_0         
	//   24   43:ldc1            #55  <String "utf-8">
	//   25   45:invokevirtual   #59  <Method byte[] String.getBytes(String)>
	//   26   48:astore_0        
		}
	//*  27   49:goto            55
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  28   52:astore_0        
		{
			s = ((String) (abyte0));
	//   29   53:aload_2         
	//   30   54:astore_0        
		}
		for(int i = 0; i < s.length; i++)
	//*  31   55:iconst_0        
	//*  32   56:istore_1        
	//*  33   57:iload_1         
	//*  34   58:aload_0         
	//*  35   59:arraylength     
	//*  36   60:icmpge          101
		{
			stringbuilder.append(ac[(s[i] & 0xf0) >> 4]);
	//   37   63:aload           4
	//   38   65:aload_3         
	//   39   66:aload_0         
	//   40   67:iload_1         
	//   41   68:baload          
	//   42   69:sipush          240
	//   43   72:iand            
	//   44   73:iconst_4        
	//   45   74:ishr            
	//   46   75:caload          
	//   47   76:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   48   79:pop             
			stringbuilder.append(ac[s[i] & 0xf]);
	//   49   80:aload           4
	//   50   82:aload_3         
	//   51   83:aload_0         
	//   52   84:iload_1         
	//   53   85:baload          
	//   54   86:bipush          15
	//   55   88:iand            
	//   56   89:caload          
	//   57   90:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   58   93:pop             
		}

	//   59   94:iload_1         
	//   60   95:iconst_1        
	//   61   96:iadd            
	//   62   97:istore_1        
	//*  63   98:goto            57
		return stringbuilder.toString().trim();
	//   64  101:aload           4
	//   65  103:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   66  106:invokevirtual   #65  <Method String String.trim()>
	//   67  109:areturn         
	}

	public static byte[] a(double d1)
	{
		byte abyte0[] = new byte[8];
	//    0    0:bipush          8
	//    1    2:newarray        byte[]
	//    2    4:astore          6
		long l = Double.doubleToLongBits(d1);
	//    3    6:dload_0         
	//    4    7:invokestatic    #72  <Method long Double.doubleToLongBits(double)>
	//    5   10:lstore          4
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		do
		{
			int j = abyte0.length;
	//    8   14:aload           6
	//    9   16:arraylength     
	//   10   17:istore_3        
			if(i < 8)
	//*  11   18:iload_2         
	//*  12   19:bipush          8
	//*  13   21:icmpge          50
			{
				abyte0[i] = Long.valueOf(l).byteValue();
	//   14   24:aload           6
	//   15   26:iload_2         
	//   16   27:lload           4
	//   17   29:invokestatic    #78  <Method Long Long.valueOf(long)>
	//   18   32:invokevirtual   #82  <Method byte Long.byteValue()>
	//   19   35:bastore         
				l >>= 8;
	//   20   36:lload           4
	//   21   38:bipush          8
	//   22   40:lshr            
	//   23   41:lstore          4
				i++;
	//   24   43:iload_2         
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_2        
			} else
	//*  28   47:goto            14
			{
				return abyte0;
	//   29   50:aload           6
	//   30   52:areturn         
			}
		} while(true);
	}

	public static int b(int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(i >= 100)
	//*   2    2:iload_0         
	//*   3    3:bipush          100
	//*   4    5:icmpge          11
	//*   5    8:goto            21
		{
			j = i / 100;
	//    6   11:iload_0         
	//    7   12:bipush          100
	//    8   14:idiv            
	//    9   15:istore_1        
			i %= 100;
	//   10   16:iload_0         
	//   11   17:bipush          100
	//   12   19:irem            
	//   13   20:istore_0        
		}
		return Integer.parseInt((new StringBuilder()).append(d(j)).append(d(i)).toString(), 16);
	//   14   21:new             #19  <Class StringBuilder>
	//   15   24:dup             
	//   16   25:invokespecial   #20  <Method void StringBuilder()>
	//   17   28:iload_1         
	//   18   29:invokestatic    #17  <Method String d(int)>
	//   19   32:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   20   35:iload_0         
	//   21   36:invokestatic    #17  <Method String d(int)>
	//   22   39:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   23   42:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   24   45:bipush          16
	//   25   47:invokestatic    #90  <Method int Integer.parseInt(String, int)>
	//   26   50:ireturn         
	}

	public static String b(float f1)
	{
		return b(Float.floatToIntBits(f1));
	//    0    0:fload_0         
	//    1    1:invokestatic    #97  <Method int Float.floatToIntBits(float)>
	//    2    4:i2l             
	//    3    5:invokestatic    #100 <Method String b(long)>
	//    4    8:areturn         
	}

	public static String b(long l)
	{
		String s = d((int)(l >> 24 & 255L));
	//    0    0:lload_0         
	//    1    1:bipush          24
	//    2    3:lshr            
	//    3    4:ldc2w           #101 <Long 255L>
	//    4    7:land            
	//    5    8:l2i             
	//    6    9:invokestatic    #17  <Method String d(int)>
	//    7   12:astore_2        
		s = (new StringBuilder()).append(s).append(d((int)(l >> 16 & 255L))).toString();
	//    8   13:new             #19  <Class StringBuilder>
	//    9   16:dup             
	//   10   17:invokespecial   #20  <Method void StringBuilder()>
	//   11   20:aload_2         
	//   12   21:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:lload_0         
	//   14   25:bipush          16
	//   15   27:lshr            
	//   16   28:ldc2w           #101 <Long 255L>
	//   17   31:land            
	//   18   32:l2i             
	//   19   33:invokestatic    #17  <Method String d(int)>
	//   20   36:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   22   42:astore_2        
		s = (new StringBuilder()).append(s).append(d((int)(l >> 8 & 255L))).toString();
	//   23   43:new             #19  <Class StringBuilder>
	//   24   46:dup             
	//   25   47:invokespecial   #20  <Method void StringBuilder()>
	//   26   50:aload_2         
	//   27   51:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   28   54:lload_0         
	//   29   55:bipush          8
	//   30   57:lshr            
	//   31   58:ldc2w           #101 <Long 255L>
	//   32   61:land            
	//   33   62:l2i             
	//   34   63:invokestatic    #17  <Method String d(int)>
	//   35   66:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   36   69:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   37   72:astore_2        
		return (new StringBuilder()).append(s).append(d((int)(l & 255L))).toString();
	//   38   73:new             #19  <Class StringBuilder>
	//   39   76:dup             
	//   40   77:invokespecial   #20  <Method void StringBuilder()>
	//   41   80:aload_2         
	//   42   81:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   43   84:lload_0         
	//   44   85:ldc2w           #101 <Long 255L>
	//   45   88:land            
	//   46   89:l2i             
	//   47   90:invokestatic    #17  <Method String d(int)>
	//   48   93:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   49   96:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   50   99:areturn         
	}

	public static byte[] b(String s)
	{
		if(s.length() < 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #106 <Method int String.length()>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		byte abyte0[] = new byte[s.length() / 2];
	//    6   10:aload_0         
	//    7   11:invokevirtual   #106 <Method int String.length()>
	//    8   14:iconst_2        
	//    9   15:idiv            
	//   10   16:newarray        byte[]
	//   11   18:astore_2        
		for(int i = 0; i < s.length() / 2; i++)
	//*  12   19:iconst_0        
	//*  13   20:istore_1        
	//*  14   21:iload_1         
	//*  15   22:aload_0         
	//*  16   23:invokevirtual   #106 <Method int String.length()>
	//*  17   26:iconst_2        
	//*  18   27:idiv            
	//*  19   28:icmpge          82
			abyte0[i] = (byte)(Integer.parseInt(s.substring(i * 2, i * 2 + 1), 16) * 16 + Integer.parseInt(s.substring(i * 2 + 1, i * 2 + 2), 16));
	//   20   31:aload_2         
	//   21   32:iload_1         
	//   22   33:aload_0         
	//   23   34:iload_1         
	//   24   35:iconst_2        
	//   25   36:imul            
	//   26   37:iload_1         
	//   27   38:iconst_2        
	//   28   39:imul            
	//   29   40:iconst_1        
	//   30   41:iadd            
	//   31   42:invokevirtual   #110 <Method String String.substring(int, int)>
	//   32   45:bipush          16
	//   33   47:invokestatic    #90  <Method int Integer.parseInt(String, int)>
	//   34   50:bipush          16
	//   35   52:imul            
	//   36   53:aload_0         
	//   37   54:iload_1         
	//   38   55:iconst_2        
	//   39   56:imul            
	//   40   57:iconst_1        
	//   41   58:iadd            
	//   42   59:iload_1         
	//   43   60:iconst_2        
	//   44   61:imul            
	//   45   62:iconst_2        
	//   46   63:iadd            
	//   47   64:invokevirtual   #110 <Method String String.substring(int, int)>
	//   48   67:bipush          16
	//   49   69:invokestatic    #90  <Method int Integer.parseInt(String, int)>
	//   50   72:iadd            
	//   51   73:int2byte        
	//   52   74:bastore         

	//   53   75:iload_1         
	//   54   76:iconst_1        
	//   55   77:iadd            
	//   56   78:istore_1        
	//*  57   79:goto            21
		return abyte0;
	//   58   82:aload_2         
	//   59   83:areturn         
	}

	public static String c(double d1)
	{
		return e(a(d1));
	//    0    0:dload_0         
	//    1    1:invokestatic    #114 <Method byte[] a(double)>
	//    2    4:invokestatic    #118 <Method String e(byte[])>
	//    3    7:areturn         
	}

	public static String c(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #19  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #20  <Method void StringBuilder()>
	//    7   13:astore_3        
		for(int i = 0; i < s.length(); i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #106 <Method int String.length()>
	//*  13   21:icmpge          85
		{
			char c1 = s.charAt(i);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:invokevirtual   #122 <Method char String.charAt(int)>
	//   17   29:istore_2        
			String s1 = d(((int) (c1)));
	//   18   30:iload_2         
	//   19   31:invokestatic    #17  <Method String d(int)>
	//   20   34:astore          4
			if(c1 > '\377')
	//*  21   36:iload_2         
	//*  22   37:sipush          255
	//*  23   40:icmple          53
				stringbuilder.append(s1);
	//   24   43:aload_3         
	//   25   44:aload           4
	//   26   46:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			else
	//*  28   50:goto            78
				stringbuilder.append((new StringBuilder()).append("00").append(s1).toString());
	//   29   53:aload_3         
	//   30   54:new             #19  <Class StringBuilder>
	//   31   57:dup             
	//   32   58:invokespecial   #20  <Method void StringBuilder()>
	//   33   61:ldc1            #124 <String "00">
	//   34   63:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:aload           4
	//   36   68:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   38   74:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:pop             
		}

	//   40   78:iload_1         
	//   41   79:iconst_1        
	//   42   80:iadd            
	//   43   81:istore_1        
	//*  44   82:goto            16
		return stringbuilder.toString();
	//   45   85:aload_3         
	//   46   86:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   47   89:areturn         
	}

	public static String d(int i)
	{
		String s;
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            69
		{
			if(16 <= i)
	//*   2    4:bipush          16
	//*   3    6:iload_0         
	//*   4    7:icmpgt          46
			{
				String s1 = Integer.toHexString(i);
	//    5   10:iload_0         
	//    6   11:invokestatic    #127 <Method String Integer.toHexString(int)>
	//    7   14:astore_2        
				s = s1;
	//    8   15:aload_2         
	//    9   16:astore_1        
				if(s1.length() % 2 != 0)
	//*  10   17:aload_2         
	//*  11   18:invokevirtual   #106 <Method int String.length()>
	//*  12   21:iconst_2        
	//*  13   22:irem            
	//*  14   23:ifeq            89
					return (new StringBuilder()).append("0").append(s1).toString();
	//   15   26:new             #19  <Class StringBuilder>
	//   16   29:dup             
	//   17   30:invokespecial   #20  <Method void StringBuilder()>
	//   18   33:ldc1            #129 <String "0">
	//   19   35:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:aload_2         
	//   21   39:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   23   45:areturn         
			} else
			{
				return (new StringBuilder()).append("0").append(Integer.toHexString(i)).toString();
	//   24   46:new             #19  <Class StringBuilder>
	//   25   49:dup             
	//   26   50:invokespecial   #20  <Method void StringBuilder()>
	//   27   53:ldc1            #129 <String "0">
	//   28   55:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:iload_0         
	//   30   59:invokestatic    #127 <Method String Integer.toHexString(int)>
	//   31   62:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   33   68:areturn         
			}
		} else
		{
			s = Integer.toHexString(i);
	//   34   69:iload_0         
	//   35   70:invokestatic    #127 <Method String Integer.toHexString(int)>
	//   36   73:astore_1        
			s = s.substring(s.length() - 2, s.length());
	//   37   74:aload_1         
	//   38   75:aload_1         
	//   39   76:invokevirtual   #106 <Method int String.length()>
	//   40   79:iconst_2        
	//   41   80:isub            
	//   42   81:aload_1         
	//   43   82:invokevirtual   #106 <Method int String.length()>
	//   44   85:invokevirtual   #110 <Method String String.substring(int, int)>
	//   45   88:astore_1        
		}
		return s;
	//   46   89:aload_1         
	//   47   90:areturn         
	}

	public static String d(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		char ac[] = s.toCharArray();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #50  <Method char[] String.toCharArray()>
	//    6   10:astore_2        
		s = ((String) (new byte[s.length() / 2]));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #106 <Method int String.length()>
	//    9   15:iconst_2        
	//   10   16:idiv            
	//   11   17:newarray        byte[]
	//   12   19:astore_0        
		for(int i = 0; i < s.length; i++)
	//*  13   20:iconst_0        
	//*  14   21:istore_1        
	//*  15   22:iload_1         
	//*  16   23:aload_0         
	//*  17   24:arraylength     
	//*  18   25:icmpge          69
			s[i] = (byte)("0123456789ABCDEF".indexOf(((int) (ac[i * 2]))) * 16 + "0123456789ABCDEF".indexOf(((int) (ac[i * 2 + 1]))) & 0xff);
	//   19   28:aload_0         
	//   20   29:iload_1         
	//   21   30:ldc1            #44  <String "0123456789ABCDEF">
	//   22   32:aload_2         
	//   23   33:iload_1         
	//   24   34:iconst_2        
	//   25   35:imul            
	//   26   36:caload          
	//   27   37:invokevirtual   #132 <Method int String.indexOf(int)>
	//   28   40:bipush          16
	//   29   42:imul            
	//   30   43:ldc1            #44  <String "0123456789ABCDEF">
	//   31   45:aload_2         
	//   32   46:iload_1         
	//   33   47:iconst_2        
	//   34   48:imul            
	//   35   49:iconst_1        
	//   36   50:iadd            
	//   37   51:caload          
	//   38   52:invokevirtual   #132 <Method int String.indexOf(int)>
	//   39   55:iadd            
	//   40   56:sipush          255
	//   41   59:iand            
	//   42   60:int2byte        
	//   43   61:bastore         

	//   44   62:iload_1         
	//   45   63:iconst_1        
	//   46   64:iadd            
	//   47   65:istore_1        
	//*  48   66:goto            22
		try
		{
			s = new String(((byte []) (s)), "utf-8");
	//   49   69:new             #46  <Class String>
	//   50   72:dup             
	//   51   73:aload_0         
	//   52   74:ldc1            #55  <String "utf-8">
	//   53   76:invokespecial   #135 <Method void String(byte[], String)>
	//   54   79:astore_0        
		}
	//*  55   80:aload_0         
	//*  56   81:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  57   82:astore_0        
		{
			return null;
	//   58   83:aconst_null     
	//   59   84:areturn         
		}
		return s;
	}

	public static String e(int i)
	{
		if(i > 127)
	//*   0    0:iload_0         
	//*   1    1:bipush          127
	//*   2    3:icmple          97
		{
			int j = i & 0x7f;
	//    3    6:iload_0         
	//    4    7:bipush          127
	//    5    9:iand            
	//    6   10:istore_1        
			int k = i >> 7;
	//    7   11:iload_0         
	//    8   12:bipush          7
	//    9   14:ishr            
	//   10   15:istore_2        
			if(k > 127)
	//*  11   16:iload_2         
	//*  12   17:bipush          127
	//*  13   19:icmple          65
				return (new StringBuilder()).append(d((k >> 7) + 128)).append(d(k & 0xff)).append(d(j)).toString();
	//   14   22:new             #19  <Class StringBuilder>
	//   15   25:dup             
	//   16   26:invokespecial   #20  <Method void StringBuilder()>
	//   17   29:iload_2         
	//   18   30:bipush          7
	//   19   32:ishr            
	//   20   33:sipush          128
	//   21   36:iadd            
	//   22   37:invokestatic    #17  <Method String d(int)>
	//   23   40:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:iload_2         
	//   25   44:sipush          255
	//   26   47:iand            
	//   27   48:invokestatic    #17  <Method String d(int)>
	//   28   51:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:iload_1         
	//   30   55:invokestatic    #17  <Method String d(int)>
	//   31   58:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   32   61:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   33   64:areturn         
			else
				return (new StringBuilder()).append(d((i >> 7) + 128)).append(d(j)).toString();
	//   34   65:new             #19  <Class StringBuilder>
	//   35   68:dup             
	//   36   69:invokespecial   #20  <Method void StringBuilder()>
	//   37   72:iload_0         
	//   38   73:bipush          7
	//   39   75:ishr            
	//   40   76:sipush          128
	//   41   79:iadd            
	//   42   80:invokestatic    #17  <Method String d(int)>
	//   43   83:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   44   86:iload_1         
	//   45   87:invokestatic    #17  <Method String d(int)>
	//   46   90:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   47   93:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   48   96:areturn         
		} else
		{
			return d(i);
	//   49   97:iload_0         
	//   50   98:invokestatic    #17  <Method String d(int)>
	//   51  101:areturn         
		}
	}

	public static String e(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		StringBuilder stringbuilder = new StringBuilder("");
	//    4    6:new             #19  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:ldc1            #42  <String "">
	//    7   12:invokespecial   #53  <Method void StringBuilder(String)>
	//    8   15:astore_2        
		for(int i = 0; i < abyte0.length; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore_1        
	//*  11   18:iload_1         
	//*  12   19:aload_0         
	//*  13   20:arraylength     
	//*  14   21:icmpge          70
		{
			String s = Integer.toHexString(abyte0[i] & 0xff);
	//   15   24:aload_0         
	//   16   25:iload_1         
	//   17   26:baload          
	//   18   27:sipush          255
	//   19   30:iand            
	//   20   31:invokestatic    #127 <Method String Integer.toHexString(int)>
	//   21   34:astore_3        
			if(s.length() == 1)
	//*  22   35:aload_3         
	//*  23   36:invokevirtual   #106 <Method int String.length()>
	//*  24   39:iconst_1        
	//*  25   40:icmpne          57
				stringbuilder.append("0").append(s);
	//   26   43:aload_2         
	//   27   44:ldc1            #129 <String "0">
	//   28   46:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   29   49:aload_3         
	//   30   50:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   31   53:pop             
			else
	//*  32   54:goto            63
				stringbuilder.append(s);
	//   33   57:aload_2         
	//   34   58:aload_3         
	//   35   59:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   36   62:pop             
		}

	//   37   63:iload_1         
	//   38   64:iconst_1        
	//   39   65:iadd            
	//   40   66:istore_1        
	//*  41   67:goto            18
		return stringbuilder.toString().toUpperCase(Locale.US).trim();
	//   42   70:aload_2         
	//   43   71:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   44   74:getstatic       #141 <Field Locale Locale.US>
	//   45   77:invokevirtual   #145 <Method String String.toUpperCase(Locale)>
	//   46   80:invokevirtual   #65  <Method String String.trim()>
	//   47   83:areturn         
	}

	public static byte[] e(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		s = s.replace(" ", "");
	//    4    6:aload_0         
	//    5    7:ldc1            #147 <String " ">
	//    6    9:ldc1            #42  <String "">
	//    7   11:invokevirtual   #151 <Method String String.replace(CharSequence, CharSequence)>
	//    8   14:astore_0        
		int j = s.length() / 2;
	//    9   15:aload_0         
	//   10   16:invokevirtual   #106 <Method int String.length()>
	//   11   19:iconst_2        
	//   12   20:idiv            
	//   13   21:istore_2        
		byte abyte0[] = new byte[j];
	//   14   22:iload_2         
	//   15   23:newarray        byte[]
	//   16   25:astore          4
		for(int i = 0; i < j; i++)
	//*  17   27:iconst_0        
	//*  18   28:istore_1        
	//*  19   29:iload_1         
	//*  20   30:iload_2         
	//*  21   31:icmpge          97
		{
			int k = i * 2 + 1;
	//   22   34:iload_1         
	//   23   35:iconst_2        
	//   24   36:imul            
	//   25   37:iconst_1        
	//   26   38:iadd            
	//   27   39:istore_3        
			String s1 = s.substring(i * 2, k);
	//   28   40:aload_0         
	//   29   41:iload_1         
	//   30   42:iconst_2        
	//   31   43:imul            
	//   32   44:iload_3         
	//   33   45:invokevirtual   #110 <Method String String.substring(int, int)>
	//   34   48:astore          5
			String s2 = s.substring(k, k + 1);
	//   35   50:aload_0         
	//   36   51:iload_3         
	//   37   52:iload_3         
	//   38   53:iconst_1        
	//   39   54:iadd            
	//   40   55:invokevirtual   #110 <Method String String.substring(int, int)>
	//   41   58:astore          6
			abyte0[i] = (byte)Integer.parseInt((new StringBuilder()).append(s1).append(s2).toString(), 16);
	//   42   60:aload           4
	//   43   62:iload_1         
	//   44   63:new             #19  <Class StringBuilder>
	//   45   66:dup             
	//   46   67:invokespecial   #20  <Method void StringBuilder()>
	//   47   70:aload           5
	//   48   72:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   49   75:aload           6
	//   50   77:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   51   80:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   52   83:bipush          16
	//   53   85:invokestatic    #90  <Method int Integer.parseInt(String, int)>
	//   54   88:int2byte        
	//   55   89:bastore         
		}

	//   56   90:iload_1         
	//   57   91:iconst_1        
	//   58   92:iadd            
	//   59   93:istore_1        
	//*  60   94:goto            29
		return abyte0;
	//   61   97:aload           4
	//   62   99:areturn         
	}

	public static float f(String s)
	{
		return Float.intBitsToFloat(Integer.parseInt(s, 16));
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokestatic    #90  <Method int Integer.parseInt(String, int)>
	//    3    6:invokestatic    #157 <Method float Float.intBitsToFloat(int)>
	//    4    9:freturn         
	}
}
