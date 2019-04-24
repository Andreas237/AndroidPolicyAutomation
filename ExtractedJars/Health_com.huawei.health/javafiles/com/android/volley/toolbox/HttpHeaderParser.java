// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class HttpHeaderParser
{

	public HttpHeaderParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static com.android.volley.Cache.Entry parseCacheHeaders(NetworkResponse networkresponse)
	{
		long l9 = System.currentTimeMillis();
	//    0    0:invokestatic    #19  <Method long System.currentTimeMillis()>
	//    1    3:lstore          24
		Map map = networkresponse.headers;
	//    2    5:aload_0         
	//    3    6:getfield        #25  <Field Map NetworkResponse.headers>
	//    4    9:astore          26
		long l2 = 0L;
	//    5   11:lconst_0        
	//    6   12:lstore          10
		long l5 = 0L;
	//    7   14:lconst_0        
	//    8   15:lstore          16
		long l6 = 0L;
	//    9   17:lconst_0        
	//   10   18:lstore          18
		long l7 = 0L;
	//   11   20:lconst_0        
	//   12   21:lstore          20
		long l8 = 0L;
	//   13   23:lconst_0        
	//   14   24:lstore          22
		long l1 = 0L;
	//   15   26:lconst_0        
	//   16   27:lstore          8
		long l = 0L;
	//   17   29:lconst_0        
	//   18   30:lstore          6
		boolean flag1 = false;
	//   19   32:iconst_0        
	//   20   33:istore_3        
		boolean flag2 = false;
	//   21   34:iconst_0        
	//   22   35:istore          4
		boolean flag = false;
	//   23   37:iconst_0        
	//   24   38:istore_1        
		String s = (String)map.get("Date");
	//   25   39:aload           26
	//   26   41:ldc1            #27  <String "Date">
	//   27   43:invokeinterface #33  <Method Object Map.get(Object)>
	//   28   48:checkcast       #35  <Class String>
	//   29   51:astore          27
		if(s != null)
	//*  30   53:aload           27
	//*  31   55:ifnull          65
			l2 = parseDateAsEpoch(s);
	//   32   58:aload           27
	//   33   60:invokestatic    #39  <Method long parseDateAsEpoch(String)>
	//   34   63:lstore          10
		s = (String)map.get("Cache-Control");
	//   35   65:aload           26
	//   36   67:ldc1            #41  <String "Cache-Control">
	//   37   69:invokeinterface #33  <Method Object Map.get(Object)>
	//   38   74:checkcast       #35  <Class String>
	//   39   77:astore          27
		long l4 = l1;
	//   40   79:lload           8
	//   41   81:lstore          14
		long l3 = l;
	//   42   83:lload           6
	//   43   85:lstore          12
		if(s != null)
	//*  44   87:aload           27
	//*  45   89:ifnull          295
		{
			boolean flag3 = true;
	//   46   92:iconst_1        
	//   47   93:istore          5
			String as[] = s.split(",");
	//   48   95:aload           27
	//   49   97:ldc1            #43  <String ",">
	//   50   99:invokevirtual   #47  <Method String[] String.split(String)>
	//   51  102:astore          27
			int i = 0;
	//   52  104:iconst_0        
	//   53  105:istore_2        
label0:
			do
			{
label1:
				{
					l4 = l1;
	//   54  106:lload           8
	//   55  108:lstore          14
					l3 = l;
	//   56  110:lload           6
	//   57  112:lstore          12
					flag1 = flag3;
	//   58  114:iload           5
	//   59  116:istore_3        
					flag2 = flag;
	//   60  117:iload_1         
	//   61  118:istore          4
					if(i >= as.length)
						break label0;
	//   62  120:iload_2         
	//   63  121:aload           27
	//   64  123:arraylength     
	//   65  124:icmpge          295
					Object obj = ((Object) (as[i].trim()));
	//   66  127:aload           27
	//   67  129:iload_2         
	//   68  130:aaload          
	//   69  131:invokevirtual   #51  <Method String String.trim()>
	//   70  134:astore          28
					if(((String) (obj)).equals("no-cache") || ((String) (obj)).equals("no-store"))
	//*  71  136:aload           28
	//*  72  138:ldc1            #53  <String "no-cache">
	//*  73  140:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  74  143:ifne            156
	//*  75  146:aload           28
	//*  76  148:ldc1            #59  <String "no-store">
	//*  77  150:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  78  153:ifeq            158
						return null;
	//   79  156:aconst_null     
	//   80  157:areturn         
					if(((String) (obj)).startsWith("max-age="))
	//*  81  158:aload           28
	//*  82  160:ldc1            #61  <String "max-age=">
	//*  83  162:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  84  165:ifeq            200
					{
						try
						{
							l3 = Long.parseLong(((String) (obj)).substring(8));
	//   85  168:aload           28
	//   86  170:bipush          8
	//   87  172:invokevirtual   #69  <Method String String.substring(int)>
	//   88  175:invokestatic    #74  <Method long Long.parseLong(String)>
	//   89  178:lstore          12
						}
	//*  90  180:lload           6
	//*  91  182:lstore          14
	//*  92  184:goto            280
						// Misplaced declaration of an exception variable
						catch(Object obj)
	//*  93  187:astore          28
						{
							l3 = l1;
	//   94  189:lload           8
	//   95  191:lstore          12
							l4 = l;
	//   96  193:lload           6
	//   97  195:lstore          14
							break label1;
	//   98  197:goto            280
						}
						l4 = l;
						break label1;
					}
					if(((String) (obj)).startsWith("stale-while-revalidate="))
	//*  99  200:aload           28
	//* 100  202:ldc1            #76  <String "stale-while-revalidate=">
	//* 101  204:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//* 102  207:ifeq            242
					{
						try
						{
							l4 = Long.parseLong(((String) (obj)).substring(23));
	//  103  210:aload           28
	//  104  212:bipush          23
	//  105  214:invokevirtual   #69  <Method String String.substring(int)>
	//  106  217:invokestatic    #74  <Method long Long.parseLong(String)>
	//  107  220:lstore          14
						}
	//* 108  222:lload           8
	//* 109  224:lstore          12
	//* 110  226:goto            280
						// Misplaced declaration of an exception variable
						catch(Object obj)
	//* 111  229:astore          28
						{
							l3 = l1;
	//  112  231:lload           8
	//  113  233:lstore          12
							l4 = l;
	//  114  235:lload           6
	//  115  237:lstore          14
							break label1;
	//  116  239:goto            280
						}
						l3 = l1;
						break label1;
					}
					if(!((String) (obj)).equals("must-revalidate"))
	//* 117  242:aload           28
	//* 118  244:ldc1            #78  <String "must-revalidate">
	//* 119  246:invokevirtual   #57  <Method boolean String.equals(Object)>
	//* 120  249:ifne            270
					{
						l3 = l1;
	//  121  252:lload           8
	//  122  254:lstore          12
						l4 = l;
	//  123  256:lload           6
	//  124  258:lstore          14
						if(!((String) (obj)).equals("proxy-revalidate"))
							break label1;
	//  125  260:aload           28
	//  126  262:ldc1            #80  <String "proxy-revalidate">
	//  127  264:invokevirtual   #57  <Method boolean String.equals(Object)>
	//  128  267:ifeq            280
					}
					flag = true;
	//  129  270:iconst_1        
	//  130  271:istore_1        
					l4 = l;
	//  131  272:lload           6
	//  132  274:lstore          14
					l3 = l1;
	//  133  276:lload           8
	//  134  278:lstore          12
				}
				i++;
	//  135  280:iload_2         
	//  136  281:iconst_1        
	//  137  282:iadd            
	//  138  283:istore_2        
				l1 = l3;
	//  139  284:lload           12
	//  140  286:lstore          8
				l = l4;
	//  141  288:lload           14
	//  142  290:lstore          6
			} while(true);
	//  143  292:goto            106
		}
		as = ((String []) ((String)map.get("Expires")));
	//  144  295:aload           26
	//  145  297:ldc1            #82  <String "Expires">
	//  146  299:invokeinterface #33  <Method Object Map.get(Object)>
	//  147  304:checkcast       #35  <Class String>
	//  148  307:astore          27
		if(as != null)
	//* 149  309:aload           27
	//* 150  311:ifnull          321
			l6 = parseDateAsEpoch(((String) (as)));
	//  151  314:aload           27
	//  152  316:invokestatic    #39  <Method long parseDateAsEpoch(String)>
	//  153  319:lstore          18
		as = ((String []) ((String)map.get("Last-Modified")));
	//  154  321:aload           26
	//  155  323:ldc1            #84  <String "Last-Modified">
	//  156  325:invokeinterface #33  <Method Object Map.get(Object)>
	//  157  330:checkcast       #35  <Class String>
	//  158  333:astore          27
		if(as != null)
	//* 159  335:aload           27
	//* 160  337:ifnull          347
			l5 = parseDateAsEpoch(((String) (as)));
	//  161  340:aload           27
	//  162  342:invokestatic    #39  <Method long parseDateAsEpoch(String)>
	//  163  345:lstore          16
		as = ((String []) ((String)map.get("ETag")));
	//  164  347:aload           26
	//  165  349:ldc1            #86  <String "ETag">
	//  166  351:invokeinterface #33  <Method Object Map.get(Object)>
	//  167  356:checkcast       #35  <Class String>
	//  168  359:astore          27
		if(flag1)
	//* 169  361:iload_3         
	//* 170  362:ifeq            402
		{
			l = l9 + 1000L * l4;
	//  171  365:lload           24
	//  172  367:ldc2w           #87  <Long 1000L>
	//  173  370:lload           14
	//  174  372:lmul            
	//  175  373:ladd            
	//  176  374:lstore          6
			if(flag2)
	//* 177  376:iload           4
	//* 178  378:ifeq            388
				l1 = l;
	//  179  381:lload           6
	//  180  383:lstore          8
			else
	//* 181  385:goto            399
				l1 = l + 1000L * l3;
	//  182  388:lload           6
	//  183  390:ldc2w           #87  <Long 1000L>
	//  184  393:lload           12
	//  185  395:lmul            
	//  186  396:ladd            
	//  187  397:lstore          8
		} else
	//* 188  399:goto            447
		{
			l = l7;
	//  189  402:lload           20
	//  190  404:lstore          6
			l1 = l8;
	//  191  406:lload           22
	//  192  408:lstore          8
			if(l2 > 0L)
	//* 193  410:lload           10
	//* 194  412:lconst_0        
	//* 195  413:lcmp            
	//* 196  414:ifle            447
			{
				l = l7;
	//  197  417:lload           20
	//  198  419:lstore          6
				l1 = l8;
	//  199  421:lload           22
	//  200  423:lstore          8
				if(l6 >= l2)
	//* 201  425:lload           18
	//* 202  427:lload           10
	//* 203  429:lcmp            
	//* 204  430:iflt            447
				{
					l = l9 + (l6 - l2);
	//  205  433:lload           24
	//  206  435:lload           18
	//  207  437:lload           10
	//  208  439:lsub            
	//  209  440:ladd            
	//  210  441:lstore          6
					l1 = l;
	//  211  443:lload           6
	//  212  445:lstore          8
				}
			}
		}
		com.android.volley.Cache.Entry entry = new com.android.volley.Cache.Entry();
	//  213  447:new             #90  <Class com.android.volley.Cache$Entry>
	//  214  450:dup             
	//  215  451:invokespecial   #91  <Method void com.android.volley.Cache$Entry()>
	//  216  454:astore          28
		entry.data = networkresponse.data;
	//  217  456:aload           28
	//  218  458:aload_0         
	//  219  459:getfield        #95  <Field byte[] NetworkResponse.data>
	//  220  462:putfield        #96  <Field byte[] com.android.volley.Cache$Entry.data>
		entry.etag = ((String) (as));
	//  221  465:aload           28
	//  222  467:aload           27
	//  223  469:putfield        #100 <Field String com.android.volley.Cache$Entry.etag>
		entry.softTtl = l;
	//  224  472:aload           28
	//  225  474:lload           6
	//  226  476:putfield        #104 <Field long com.android.volley.Cache$Entry.softTtl>
		entry.ttl = l1;
	//  227  479:aload           28
	//  228  481:lload           8
	//  229  483:putfield        #107 <Field long com.android.volley.Cache$Entry.ttl>
		entry.serverDate = l2;
	//  230  486:aload           28
	//  231  488:lload           10
	//  232  490:putfield        #110 <Field long com.android.volley.Cache$Entry.serverDate>
		entry.lastModified = l5;
	//  233  493:aload           28
	//  234  495:lload           16
	//  235  497:putfield        #113 <Field long com.android.volley.Cache$Entry.lastModified>
		entry.responseHeaders = map;
	//  236  500:aload           28
	//  237  502:aload           26
	//  238  504:putfield        #116 <Field Map com.android.volley.Cache$Entry.responseHeaders>
		return entry;
	//  239  507:aload           28
	//  240  509:areturn         
	}

	public static String parseCharset(Map map)
	{
		return parseCharset(map, "ISO-8859-1");
	//    0    0:aload_0         
	//    1    1:ldc1            #120 <String "ISO-8859-1">
	//    2    3:invokestatic    #123 <Method String parseCharset(Map, String)>
	//    3    6:areturn         
	}

	public static String parseCharset(Map map, String s)
	{
		map = ((Map) ((String)map.get("Content-Type")));
	//    0    0:aload_0         
	//    1    1:ldc1            #127 <String "Content-Type">
	//    2    3:invokeinterface #33  <Method Object Map.get(Object)>
	//    3    8:checkcast       #35  <Class String>
	//    4   11:astore_0        
		if(map != null)
	//*   5   12:aload_0         
	//*   6   13:ifnull          71
		{
			map = ((Map) (((String) (map)).split(";")));
	//    7   16:aload_0         
	//    8   17:ldc1            #129 <String ";">
	//    9   19:invokevirtual   #47  <Method String[] String.split(String)>
	//   10   22:astore_0        
			for(int i = 1; i < map.length; i++)
	//*  11   23:iconst_1        
	//*  12   24:istore_2        
	//*  13   25:iload_2         
	//*  14   26:aload_0         
	//*  15   27:arraylength     
	//*  16   28:icmpge          71
			{
				String as[] = ((String) (map[i])).trim().split("=");
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:aaload          
	//   20   34:invokevirtual   #51  <Method String String.trim()>
	//   21   37:ldc1            #131 <String "=">
	//   22   39:invokevirtual   #47  <Method String[] String.split(String)>
	//   23   42:astore_3        
				if(as.length == 2 && as[0].equals("charset"))
	//*  24   43:aload_3         
	//*  25   44:arraylength     
	//*  26   45:iconst_2        
	//*  27   46:icmpne          64
	//*  28   49:aload_3         
	//*  29   50:iconst_0        
	//*  30   51:aaload          
	//*  31   52:ldc1            #133 <String "charset">
	//*  32   54:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  33   57:ifeq            64
					return as[1];
	//   34   60:aload_3         
	//   35   61:iconst_1        
	//   36   62:aaload          
	//   37   63:areturn         
			}

	//   38   64:iload_2         
	//   39   65:iconst_1        
	//   40   66:iadd            
	//   41   67:istore_2        
		}
	//*  42   68:goto            25
		return s;
	//   43   71:aload_1         
	//   44   72:areturn         
	}

	public static long parseDateAsEpoch(String s)
	{
		long l;
		try
		{
			l = DateUtils.parseDate(s).getTime();
	//    0    0:aload_0         
	//    1    1:invokestatic    #142 <Method Date DateUtils.parseDate(String)>
	//    2    4:invokevirtual   #147 <Method long Date.getTime()>
	//    3    7:lstore_1        
		}
	//*   4    8:lload_1         
	//*   5    9:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   10:astore_0        
		{
			return 0L;
	//    7   11:lconst_0        
	//    8   12:lreturn         
		}
		return l;
	}
}
