// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.TreeMap;

public final class UrlUtils
{

	private UrlUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static TreeMap getQueryParams(String s, boolean flag)
	{
		TreeMap treemap = new TreeMap();
	//    0    0:new             #16  <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void TreeMap()>
	//    3    7:astore          4
		if(s != null)
	//*   4    9:aload_0         
	//*   5   10:ifnonnull       16
	//*   6   13:aload           4
	//*   7   15:areturn         
		{
			s = ((String) (s.split("&")));
	//    8   16:aload_0         
	//    9   17:ldc1            #19  <String "&">
	//   10   19:invokevirtual   #25  <Method String[] String.split(String)>
	//   11   22:astore_0        
			int j = s.length;
	//   12   23:aload_0         
	//   13   24:arraylength     
	//   14   25:istore_3        
			int i = 0;
	//   15   26:iconst_0        
	//   16   27:istore_2        
			while(i < j) 
	//*  17   28:iload_2         
	//*  18   29:iload_3         
	//*  19   30:icmpge          13
			{
				String as[] = ((String) (s[i])).split("=");
	//   20   33:aload_0         
	//   21   34:iload_2         
	//   22   35:aaload          
	//   23   36:ldc1            #27  <String "=">
	//   24   38:invokevirtual   #25  <Method String[] String.split(String)>
	//   25   41:astore          5
				if(as.length == 2)
	//*  26   43:aload           5
	//*  27   45:arraylength     
	//*  28   46:iconst_2        
	//*  29   47:icmpne          98
				{
					if(flag)
	//*  30   50:iload_1         
	//*  31   51:ifeq            81
						treemap.put(((Object) (urlDecode(as[0]))), ((Object) (urlDecode(as[1]))));
	//   32   54:aload           4
	//   33   56:aload           5
	//   34   58:iconst_0        
	//   35   59:aaload          
	//   36   60:invokestatic    #31  <Method String urlDecode(String)>
	//   37   63:aload           5
	//   38   65:iconst_1        
	//   39   66:aaload          
	//   40   67:invokestatic    #31  <Method String urlDecode(String)>
	//   41   70:invokevirtual   #35  <Method Object TreeMap.put(Object, Object)>
	//   42   73:pop             
					else
	//*  43   74:iload_2         
	//*  44   75:iconst_1        
	//*  45   76:iadd            
	//*  46   77:istore_2        
	//*  47   78:goto            28
						treemap.put(((Object) (as[0])), ((Object) (as[1])));
	//   48   81:aload           4
	//   49   83:aload           5
	//   50   85:iconst_0        
	//   51   86:aaload          
	//   52   87:aload           5
	//   53   89:iconst_1        
	//   54   90:aaload          
	//   55   91:invokevirtual   #35  <Method Object TreeMap.put(Object, Object)>
	//   56   94:pop             
				} else
	//*  57   95:goto            74
				if(!TextUtils.isEmpty(((CharSequence) (as[0]))))
	//*  58   98:aload           5
	//*  59  100:iconst_0        
	//*  60  101:aaload          
	//*  61  102:invokestatic    #41  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  62  105:ifne            74
					if(flag)
	//*  63  108:iload_1         
	//*  64  109:ifeq            130
						treemap.put(((Object) (urlDecode(as[0]))), "");
	//   65  112:aload           4
	//   66  114:aload           5
	//   67  116:iconst_0        
	//   68  117:aaload          
	//   69  118:invokestatic    #31  <Method String urlDecode(String)>
	//   70  121:ldc1            #43  <String "">
	//   71  123:invokevirtual   #35  <Method Object TreeMap.put(Object, Object)>
	//   72  126:pop             
					else
	//*  73  127:goto            74
						treemap.put(((Object) (as[0])), "");
	//   74  130:aload           4
	//   75  132:aload           5
	//   76  134:iconst_0        
	//   77  135:aaload          
	//   78  136:ldc1            #43  <String "">
	//   79  138:invokevirtual   #35  <Method Object TreeMap.put(Object, Object)>
	//   80  141:pop             
				i++;
			}
		}
		return treemap;
	//*  81  142:goto            74
	}

	public static TreeMap getQueryParams(URI uri, boolean flag)
	{
		return getQueryParams(uri.getRawQuery(), flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method String URI.getRawQuery()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #54  <Method TreeMap getQueryParams(String, boolean)>
	//    4    8:areturn         
	}

	public static String percentEncode(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #43  <String "">
	//    3    6:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    4    7:new             #58  <Class StringBuilder>
	//    5   10:dup             
	//    6   11:invokespecial   #59  <Method void StringBuilder()>
	//    7   14:astore          4
		s = urlEncode(s);
	//    8   16:aload_0         
	//    9   17:invokestatic    #62  <Method String urlEncode(String)>
	//   10   20:astore_0        
		int j = s.length();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #66  <Method int String.length()>
	//   13   25:istore_3        
		int i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_2        
		while(i < j) 
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:icmpge          139
		{
			char c = s.charAt(i);
	//   19   33:aload_0         
	//   20   34:iload_2         
	//   21   35:invokevirtual   #70  <Method char String.charAt(int)>
	//   22   38:istore_1        
			if(c == '*')
	//*  23   39:iload_1         
	//*  24   40:bipush          42
	//*  25   42:icmpne          60
				stringbuilder.append("%2A");
	//   26   45:aload           4
	//   27   47:ldc1            #72  <String "%2A">
	//   28   49:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   29   52:pop             
			else
	//*  30   53:iload_2         
	//*  31   54:iconst_1        
	//*  32   55:iadd            
	//*  33   56:istore_2        
	//*  34   57:goto            28
			if(c == '+')
	//*  35   60:iload_1         
	//*  36   61:bipush          43
	//*  37   63:icmpne          77
				stringbuilder.append("%20");
	//   38   66:aload           4
	//   39   68:ldc1            #78  <String "%20">
	//   40   70:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   41   73:pop             
			else
	//*  42   74:goto            53
			if(c == '%' && i + 2 < j && s.charAt(i + 1) == '7' && s.charAt(i + 2) == 'E')
	//*  43   77:iload_1         
	//*  44   78:bipush          37
	//*  45   80:icmpne          129
	//*  46   83:iload_2         
	//*  47   84:iconst_2        
	//*  48   85:iadd            
	//*  49   86:iload_3         
	//*  50   87:icmpge          129
	//*  51   90:aload_0         
	//*  52   91:iload_2         
	//*  53   92:iconst_1        
	//*  54   93:iadd            
	//*  55   94:invokevirtual   #70  <Method char String.charAt(int)>
	//*  56   97:bipush          55
	//*  57   99:icmpne          129
	//*  58  102:aload_0         
	//*  59  103:iload_2         
	//*  60  104:iconst_2        
	//*  61  105:iadd            
	//*  62  106:invokevirtual   #70  <Method char String.charAt(int)>
	//*  63  109:bipush          69
	//*  64  111:icmpne          129
			{
				stringbuilder.append('~');
	//   65  114:aload           4
	//   66  116:bipush          126
	//   67  118:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   68  121:pop             
				i += 2;
	//   69  122:iload_2         
	//   70  123:iconst_2        
	//   71  124:iadd            
	//   72  125:istore_2        
			} else
	//*  73  126:goto            53
			{
				stringbuilder.append(c);
	//   74  129:aload           4
	//   75  131:iload_1         
	//   76  132:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   77  135:pop             
			}
			i++;
		}
	//*  78  136:goto            53
		return stringbuilder.toString();
	//   79  139:aload           4
	//   80  141:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   81  144:areturn         
	}

	public static String urlDecode(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #43  <String "">
	//    3    6:areturn         
		try
		{
			s = URLDecoder.decode(s, "UTF8");
	//    4    7:aload_0         
	//    5    8:ldc1            #7   <String "UTF8">
	//    6   10:invokestatic    #92  <Method String URLDecoder.decode(String, String)>
	//    7   13:astore_0        
		}
	//*   8   14:aload_0         
	//*   9   15:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   16:astore_0        
		{
			throw new RuntimeException(((UnsupportedEncodingException) (s)).getMessage(), ((Throwable) (s)));
	//   11   17:new             #94  <Class RuntimeException>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:invokevirtual   #97  <Method String UnsupportedEncodingException.getMessage()>
	//   15   25:aload_0         
	//   16   26:invokespecial   #100 <Method void RuntimeException(String, Throwable)>
	//   17   29:athrow          
		}
		return s;
	}

	public static String urlEncode(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #43  <String "">
	//    3    6:areturn         
		try
		{
			s = URLEncoder.encode(s, "UTF8");
	//    4    7:aload_0         
	//    5    8:ldc1            #7   <String "UTF8">
	//    6   10:invokestatic    #105 <Method String URLEncoder.encode(String, String)>
	//    7   13:astore_0        
		}
	//*   8   14:aload_0         
	//*   9   15:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   16:astore_0        
		{
			throw new RuntimeException(((UnsupportedEncodingException) (s)).getMessage(), ((Throwable) (s)));
	//   11   17:new             #94  <Class RuntimeException>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:invokevirtual   #97  <Method String UnsupportedEncodingException.getMessage()>
	//   15   25:aload_0         
	//   16   26:invokespecial   #100 <Method void RuntimeException(String, Throwable)>
	//   17   29:athrow          
		}
		return s;
	}

	public static final String UTF8 = "UTF8";
}
