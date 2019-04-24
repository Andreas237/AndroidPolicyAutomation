// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp;

import com.itextpdf.xmp.impl.Base64;
import com.itextpdf.xmp.impl.ISO8601Converter;
import com.itextpdf.xmp.impl.XMPUtilsImpl;
import com.itextpdf.xmp.options.PropertyOptions;

// Referenced classes of package com.itextpdf.xmp:
//			XMPException, XMPMeta, XMPDateTime

public class XMPUtils
{

	private XMPUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void appendProperties(XMPMeta xmpmeta, XMPMeta xmpmeta1, boolean flag, boolean flag1)
		throws XMPException
	{
		appendProperties(xmpmeta, xmpmeta1, flag, flag1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokestatic    #16  <Method void appendProperties(XMPMeta, XMPMeta, boolean, boolean, boolean)>
	//    6    8:return          
	}

	public static void appendProperties(XMPMeta xmpmeta, XMPMeta xmpmeta1, boolean flag, boolean flag1, boolean flag2)
		throws XMPException
	{
		XMPUtilsImpl.appendProperties(xmpmeta, xmpmeta1, flag, flag1, flag2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokestatic    #20  <Method void XMPUtilsImpl.appendProperties(XMPMeta, XMPMeta, boolean, boolean, boolean)>
	//    6    9:return          
	}

	public static String catenateArrayItems(XMPMeta xmpmeta, String s, String s1, String s2, String s3, boolean flag)
		throws XMPException
	{
		return XMPUtilsImpl.catenateArrayItems(xmpmeta, s, s1, s2, s3, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:invokestatic    #24  <Method String XMPUtilsImpl.catenateArrayItems(XMPMeta, String, String, String, String, boolean)>
	//    7   11:areturn         
	}

	public static String convertFromBoolean(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            7
			return "True";
	//    2    4:ldc1            #28  <String "True">
	//    3    6:areturn         
		else
			return "False";
	//    4    7:ldc1            #30  <String "False">
	//    5    9:areturn         
	}

	public static String convertFromDate(XMPDateTime xmpdatetime)
	{
		return ISO8601Converter.render(xmpdatetime);
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method String ISO8601Converter.render(XMPDateTime)>
	//    2    4:areturn         
	}

	public static String convertFromDouble(double d)
	{
		return String.valueOf(d);
	//    0    0:dload_0         
	//    1    1:invokestatic    #44  <Method String String.valueOf(double)>
	//    2    4:areturn         
	}

	public static String convertFromInteger(int i)
	{
		return String.valueOf(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #48  <Method String String.valueOf(int)>
	//    2    4:areturn         
	}

	public static String convertFromLong(long l)
	{
		return String.valueOf(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #52  <Method String String.valueOf(long)>
	//    2    4:areturn         
	}

	public static boolean convertToBoolean(String s)
		throws XMPException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(s == null || s.length() == 0)
	//*   2    2:aload_0         
	//*   3    3:ifnull          13
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #60  <Method int String.length()>
	//*   6   10:ifne            24
			throw new XMPException("Empty convert-string", 5);
	//    7   13:new             #13  <Class XMPException>
	//    8   16:dup             
	//    9   17:ldc1            #62  <String "Empty convert-string">
	//   10   19:iconst_5        
	//   11   20:invokespecial   #65  <Method void XMPException(String, int)>
	//   12   23:athrow          
		s = s.toLowerCase();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #69  <Method String String.toLowerCase()>
	//   15   28:astore_0        
		int i;
		try
		{
			i = Integer.parseInt(s);
	//   16   29:aload_0         
	//   17   30:invokestatic    #75  <Method int Integer.parseInt(String)>
	//   18   33:istore_1        
		}
	//*  19   34:iload_1         
	//*  20   35:ifeq            40
	//*  21   38:iconst_1        
	//*  22   39:ireturn         
	//*  23   40:iconst_0        
	//*  24   41:ireturn         
		catch(NumberFormatException numberformatexception)
	//*  25   42:astore_3        
		{
			if("true".equals(((Object) (s))) || "t".equals(((Object) (s))) || "on".equals(((Object) (s))) || "yes".equals(((Object) (s))))
	//*  26   43:ldc1            #77  <String "true">
	//*  27   45:aload_0         
	//*  28   46:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  29   49:ifne            79
	//*  30   52:ldc1            #83  <String "t">
	//*  31   54:aload_0         
	//*  32   55:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  33   58:ifne            79
	//*  34   61:ldc1            #85  <String "on">
	//*  35   63:aload_0         
	//*  36   64:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  37   67:ifne            79
	//*  38   70:ldc1            #87  <String "yes">
	//*  39   72:aload_0         
	//*  40   73:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  41   76:ifeq            81
				flag = true;
	//   42   79:iconst_1        
	//   43   80:istore_2        
			return flag;
	//   44   81:iload_2         
	//   45   82:ireturn         
		}
		return i != 0;
	}

	public static XMPDateTime convertToDate(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #60  <Method int String.length()>
	//*   4    8:ifne            22
			throw new XMPException("Empty convert-string", 5);
	//    5   11:new             #13  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #62  <String "Empty convert-string">
	//    8   17:iconst_5        
	//    9   18:invokespecial   #65  <Method void XMPException(String, int)>
	//   10   21:athrow          
		else
			return ISO8601Converter.parse(s);
	//   11   22:aload_0         
	//   12   23:invokestatic    #92  <Method XMPDateTime ISO8601Converter.parse(String)>
	//   13   26:areturn         
	}

	public static double convertToDouble(String s)
		throws XMPException
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_11;
	//    0    0:aload_0         
	//    1    1:ifnull          11
		if(s.length() != 0)
			break MISSING_BLOCK_LABEL_34;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method int String.length()>
	//    4    8:ifne            34
		throw new XMPException("Empty convert-string", 5);
	//    5   11:new             #13  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #62  <String "Empty convert-string">
	//    8   17:iconst_5        
	//    9   18:invokespecial   #65  <Method void XMPException(String, int)>
	//   10   21:athrow          
	//*  11   22:astore_0        
	//*  12   23:new             #13  <Class XMPException>
	//*  13   26:dup             
	//*  14   27:ldc1            #96  <String "Invalid double string">
	//*  15   29:iconst_5        
	//*  16   30:invokespecial   #65  <Method void XMPException(String, int)>
	//*  17   33:athrow          
		double d;
		try
		{
			d = Double.parseDouble(s);
	//   18   34:aload_0         
	//   19   35:invokestatic    #101 <Method double Double.parseDouble(String)>
	//   20   38:dstore_1        
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new XMPException("Invalid double string", 5);
		}
		return d;
	//   21   39:dload_1         
	//   22   40:dreturn         
	}

	public static int convertToInteger(String s)
		throws XMPException
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_11;
	//    0    0:aload_0         
	//    1    1:ifnull          11
		if(s.length() != 0)
			break MISSING_BLOCK_LABEL_34;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method int String.length()>
	//    4    8:ifne            34
		throw new XMPException("Empty convert-string", 5);
	//    5   11:new             #13  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #62  <String "Empty convert-string">
	//    8   17:iconst_5        
	//    9   18:invokespecial   #65  <Method void XMPException(String, int)>
	//   10   21:athrow          
	//*  11   22:astore_0        
	//*  12   23:new             #13  <Class XMPException>
	//*  13   26:dup             
	//*  14   27:ldc1            #104 <String "Invalid integer string">
	//*  15   29:iconst_5        
	//*  16   30:invokespecial   #65  <Method void XMPException(String, int)>
	//*  17   33:athrow          
		int i;
		try
		{
			if(s.startsWith("0x"))
	//*  18   34:aload_0         
	//*  19   35:ldc1            #106 <String "0x">
	//*  20   37:invokevirtual   #109 <Method boolean String.startsWith(String)>
	//*  21   40:ifeq            54
				return Integer.parseInt(s.substring(2), 16);
	//   22   43:aload_0         
	//   23   44:iconst_2        
	//   24   45:invokevirtual   #112 <Method String String.substring(int)>
	//   25   48:bipush          16
	//   26   50:invokestatic    #115 <Method int Integer.parseInt(String, int)>
	//   27   53:ireturn         
			i = Integer.parseInt(s);
	//   28   54:aload_0         
	//   29   55:invokestatic    #75  <Method int Integer.parseInt(String)>
	//   30   58:istore_1        
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new XMPException("Invalid integer string", 5);
		}
		return i;
	//   31   59:iload_1         
	//   32   60:ireturn         
	}

	public static long convertToLong(String s)
		throws XMPException
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_11;
	//    0    0:aload_0         
	//    1    1:ifnull          11
		if(s.length() != 0)
			break MISSING_BLOCK_LABEL_34;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method int String.length()>
	//    4    8:ifne            34
		throw new XMPException("Empty convert-string", 5);
	//    5   11:new             #13  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #62  <String "Empty convert-string">
	//    8   17:iconst_5        
	//    9   18:invokespecial   #65  <Method void XMPException(String, int)>
	//   10   21:athrow          
	//*  11   22:astore_0        
	//*  12   23:new             #13  <Class XMPException>
	//*  13   26:dup             
	//*  14   27:ldc1            #119 <String "Invalid long string">
	//*  15   29:iconst_5        
	//*  16   30:invokespecial   #65  <Method void XMPException(String, int)>
	//*  17   33:athrow          
		long l;
		try
		{
			if(s.startsWith("0x"))
	//*  18   34:aload_0         
	//*  19   35:ldc1            #106 <String "0x">
	//*  20   37:invokevirtual   #109 <Method boolean String.startsWith(String)>
	//*  21   40:ifeq            54
				return Long.parseLong(s.substring(2), 16);
	//   22   43:aload_0         
	//   23   44:iconst_2        
	//   24   45:invokevirtual   #112 <Method String String.substring(int)>
	//   25   48:bipush          16
	//   26   50:invokestatic    #125 <Method long Long.parseLong(String, int)>
	//   27   53:lreturn         
			l = Long.parseLong(s);
	//   28   54:aload_0         
	//   29   55:invokestatic    #127 <Method long Long.parseLong(String)>
	//   30   58:lstore_1        
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new XMPException("Invalid long string", 5);
		}
		return l;
	//   31   59:lload_1         
	//   32   60:lreturn         
	}

	public static byte[] decodeBase64(String s)
		throws XMPException
	{
		try
		{
			s = ((String) (Base64.decode(s.getBytes())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method byte[] String.getBytes()>
	//    2    4:invokestatic    #141 <Method byte[] Base64.decode(byte[])>
	//    3    7:astore_0        
		}
	//*   4    8:aload_0         
	//*   5    9:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   10:astore_0        
		{
			throw new XMPException("Invalid base64 string", 5, ((Throwable) (s)));
	//    7   11:new             #13  <Class XMPException>
	//    8   14:dup             
	//    9   15:ldc1            #143 <String "Invalid base64 string">
	//   10   17:iconst_5        
	//   11   18:aload_0         
	//   12   19:invokespecial   #146 <Method void XMPException(String, int, Throwable)>
	//   13   22:athrow          
		}
		return ((byte []) (s));
	}

	public static String encodeBase64(byte abyte0[])
	{
		return new String(Base64.encode(abyte0));
	//    0    0:new             #41  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #151 <Method byte[] Base64.encode(byte[])>
	//    4    8:invokespecial   #154 <Method void String(byte[])>
	//    5   11:areturn         
	}

	public static void removeProperties(XMPMeta xmpmeta, String s, String s1, boolean flag, boolean flag1)
		throws XMPException
	{
		XMPUtilsImpl.removeProperties(xmpmeta, s, s1, flag, flag1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokestatic    #158 <Method void XMPUtilsImpl.removeProperties(XMPMeta, String, String, boolean, boolean)>
	//    6    9:return          
	}

	public static void separateArrayItems(XMPMeta xmpmeta, String s, String s1, String s2, PropertyOptions propertyoptions, boolean flag)
		throws XMPException
	{
		XMPUtilsImpl.separateArrayItems(xmpmeta, s, s1, s2, propertyoptions, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:invokestatic    #162 <Method void XMPUtilsImpl.separateArrayItems(XMPMeta, String, String, String, PropertyOptions, boolean)>
	//    7   11:return          
	}
}
