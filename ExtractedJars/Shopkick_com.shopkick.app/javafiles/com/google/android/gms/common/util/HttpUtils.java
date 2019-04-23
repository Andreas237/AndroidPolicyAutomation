// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.*;
import java.util.regex.Pattern;

public class HttpUtils
{

	private HttpUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	private static String decode(String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            10
			s1 = "ISO-8859-1";
	//    3    7:ldc1            #39  <String "ISO-8859-1">
	//    4    9:astore_1        
		try
		{
			s = URLDecoder.decode(s, s1);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokestatic    #43  <Method String URLDecoder.decode(String, String)>
	//    8   15:astore_0        
		}
	//*   9   16:aload_0         
	//*  10   17:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  11   18:astore_0        
		{
			throw new IllegalArgumentException(((Throwable) (s)));
	//   12   19:new             #45  <Class IllegalArgumentException>
	//   13   22:dup             
	//   14   23:aload_0         
	//   15   24:invokespecial   #48  <Method void IllegalArgumentException(Throwable)>
	//   16   27:athrow          
		}
		return s;
	}

	public static Map parse(URI uri, String s)
	{
		Map map = Collections.emptyMap();
	//    0    0:invokestatic    #56  <Method Map Collections.emptyMap()>
	//    1    3:astore_2        
		Object obj = ((Object) (uri.getRawQuery()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #62  <Method String URI.getRawQuery()>
	//    4    8:astore_3        
		uri = ((URI) (map));
	//    5    9:aload_2         
	//    6   10:astore_0        
		if(obj != null)
	//*   7   11:aload_3         
	//*   8   12:ifnull          132
		{
			uri = ((URI) (map));
	//    9   15:aload_2         
	//   10   16:astore_0        
			if(((String) (obj)).length() > 0)
	//*  11   17:aload_3         
	//*  12   18:invokevirtual   #68  <Method int String.length()>
	//*  13   21:ifle            132
			{
				HashMap hashmap = new HashMap();
	//   14   24:new             #70  <Class HashMap>
	//   15   27:dup             
	//   16   28:invokespecial   #71  <Method void HashMap()>
	//   17   31:astore_2        
				obj = ((Object) (new Scanner(((String) (obj)))));
	//   18   32:new             #73  <Class Scanner>
	//   19   35:dup             
	//   20   36:aload_3         
	//   21   37:invokespecial   #76  <Method void Scanner(String)>
	//   22   40:astore_3        
				((Scanner) (obj)).useDelimiter("&");
	//   23   41:aload_3         
	//   24   42:ldc1            #78  <String "&">
	//   25   44:invokevirtual   #82  <Method Scanner Scanner.useDelimiter(String)>
	//   26   47:pop             
				do
				{
					uri = ((URI) (hashmap));
	//   27   48:aload_2         
	//   28   49:astore_0        
					if(!((Scanner) (obj)).hasNext())
						break;
	//   29   50:aload_3         
	//   30   51:invokevirtual   #86  <Method boolean Scanner.hasNext()>
	//   31   54:ifeq            132
					String as[] = ((Scanner) (obj)).next().split("=");
	//   32   57:aload_3         
	//   33   58:invokevirtual   #89  <Method String Scanner.next()>
	//   34   61:ldc1            #91  <String "=">
	//   35   63:invokevirtual   #95  <Method String[] String.split(String)>
	//   36   66:astore          5
					if(as.length != 0 && as.length <= 2)
	//*  37   68:aload           5
	//*  38   70:arraylength     
	//*  39   71:ifeq            122
	//*  40   74:aload           5
	//*  41   76:arraylength     
	//*  42   77:iconst_2        
	//*  43   78:icmpgt          122
					{
						String s1 = decode(as[0], s);
	//   44   81:aload           5
	//   45   83:iconst_0        
	//   46   84:aaload          
	//   47   85:aload_1         
	//   48   86:invokestatic    #96  <Method String decode(String, String)>
	//   49   89:astore          4
						uri = null;
	//   50   91:aconst_null     
	//   51   92:astore_0        
						if(as.length == 2)
	//*  52   93:aload           5
	//*  53   95:arraylength     
	//*  54   96:iconst_2        
	//*  55   97:icmpne          109
							uri = ((URI) (decode(as[1], s)));
	//   56  100:aload           5
	//   57  102:iconst_1        
	//   58  103:aaload          
	//   59  104:aload_1         
	//   60  105:invokestatic    #96  <Method String decode(String, String)>
	//   61  108:astore_0        
						((Map) (hashmap)).put(((Object) (s1)), ((Object) (uri)));
	//   62  109:aload_2         
	//   63  110:aload           4
	//   64  112:aload_0         
	//   65  113:invokeinterface #102 <Method Object Map.put(Object, Object)>
	//   66  118:pop             
					} else
	//*  67  119:goto            48
					{
						throw new IllegalArgumentException("bad parameter");
	//   68  122:new             #45  <Class IllegalArgumentException>
	//   69  125:dup             
	//   70  126:ldc1            #104 <String "bad parameter">
	//   71  128:invokespecial   #105 <Method void IllegalArgumentException(String)>
	//   72  131:athrow          
					}
				} while(true);
			}
		}
		return ((Map) (uri));
	//   73  132:aload_0         
	//   74  133:areturn         
	}

	private static final Pattern zzgz = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
	private static final Pattern zzha = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
	private static final Pattern zzhb = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

	static 
	{
	//    0    0:ldc1            #13  <String "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$">
	//    1    2:invokestatic    #19  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #21  <Field Pattern zzgz>
	//    3    8:ldc1            #23  <String "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$">
	//    4   10:invokestatic    #19  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #25  <Field Pattern zzha>
	//    6   16:ldc1            #27  <String "^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$">
	//    7   18:invokestatic    #19  <Method Pattern Pattern.compile(String)>
	//    8   21:putstatic       #29  <Field Pattern zzhb>
	//*   9   24:return          
	}
}
