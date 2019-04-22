// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HttpHeaderParser
{

	static String formatEpochAsRfc1123(long l)
	{
		return newRfc1123Formatter().format(new Date(l));
	//    0    0:invokestatic    #10  <Method SimpleDateFormat newRfc1123Formatter()>
	//    1    3:new             #12  <Class Date>
	//    2    6:dup             
	//    3    7:lload_0         
	//    4    8:invokespecial   #16  <Method void Date(long)>
	//    5   11:invokevirtual   #22  <Method String SimpleDateFormat.format(Date)>
	//    6   14:areturn         
	}

	private static SimpleDateFormat newRfc1123Formatter()
	{
		SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
	//    0    0:new             #18  <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//    3    6:getstatic       #31  <Field Locale Locale.US>
	//    4    9:invokespecial   #34  <Method void SimpleDateFormat(String, Locale)>
	//    5   12:astore_0        
		simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
	//    6   13:aload_0         
	//    7   14:ldc1            #36  <String "GMT">
	//    8   16:invokestatic    #42  <Method TimeZone TimeZone.getTimeZone(String)>
	//    9   19:invokevirtual   #46  <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		return simpledateformat;
	//   10   22:aload_0         
	//   11   23:areturn         
	}

	public static com.android.volley.Cache.Entry parseCacheHeaders(NetworkResponse networkresponse)
	{
		boolean flag;
		int i;
		long l2;
		long l5;
		Map map;
		String s;
		l5 = System.currentTimeMillis();
	//    0    0:invokestatic    #56  <Method long System.currentTimeMillis()>
	//    1    3:lstore          13
		map = networkresponse.headers;
	//    2    5:aload_0         
	//    3    6:getfield        #62  <Field Map NetworkResponse.headers>
	//    4    9:astore          15
		s = (String)map.get("Date");
	//    5   11:aload           15
	//    6   13:ldc1            #64  <String "Date">
	//    7   15:invokeinterface #70  <Method Object Map.get(Object)>
	//    8   20:checkcast       #72  <Class String>
	//    9   23:astore          16
		if(s != null)
	//*  10   25:aload           16
	//*  11   27:ifnull          40
			l2 = parseDateAsEpoch(s);
	//   12   30:aload           16
	//   13   32:invokestatic    #76  <Method long parseDateAsEpoch(String)>
	//   14   35:lstore          7
		else
	//*  15   37:goto            43
			l2 = 0L;
	//   16   40:lconst_0        
	//   17   41:lstore          7
		s = (String)map.get("Cache-Control");
	//   18   43:aload           15
	//   19   45:ldc1            #78  <String "Cache-Control">
	//   20   47:invokeinterface #70  <Method Object Map.get(Object)>
	//   21   52:checkcast       #72  <Class String>
	//   22   55:astore          16
		flag = false;
	//   23   57:iconst_0        
	//   24   58:istore_1        
		i = 0;
	//   25   59:iconst_0        
	//   26   60:istore_2        
		if(s == null) goto _L2; else goto _L1
	//   27   61:aload           16
	//   28   63:ifnull          235
_L1:
		long l;
		long l1;
		String as[];
		as = s.split(",");
	//   29   66:aload           16
	//   30   68:ldc1            #80  <String ",">
	//   31   70:invokevirtual   #84  <Method String[] String.split(String)>
	//   32   73:astore          16
		l1 = 0L;
	//   33   75:lconst_0        
	//   34   76:lstore          5
		flag = false;
	//   35   78:iconst_0        
	//   36   79:istore_1        
		l = 0L;
	//   37   80:lconst_0        
	//   38   81:lstore_3        
_L7:
		if(i >= as.length) goto _L4; else goto _L3
	//   39   82:iload_2         
	//   40   83:aload           16
	//   41   85:arraylength     
	//   42   86:icmpge          230
_L3:
		String s2 = as[i].trim();
	//   43   89:aload           16
	//   44   91:iload_2         
	//   45   92:aaload          
	//   46   93:invokevirtual   #88  <Method String String.trim()>
	//   47   96:astore          17
		if(!s2.equals("no-cache") && !s2.equals("no-store")) goto _L6; else goto _L5
	//   48   98:aload           17
	//   49  100:ldc1            #90  <String "no-cache">
	//   50  102:invokevirtual   #94  <Method boolean String.equals(Object)>
	//   51  105:ifne            228
	//   52  108:aload           17
	//   53  110:ldc1            #96  <String "no-store">
	//   54  112:invokevirtual   #94  <Method boolean String.equals(Object)>
	//   55  115:ifeq            121
	//*  56  118:goto            228
_L6:
		if(!s2.startsWith("max-age="))
			break MISSING_BLOCK_LABEL_149;
	//   57  121:aload           17
	//   58  123:ldc1            #98  <String "max-age=">
	//   59  125:invokevirtual   #102 <Method boolean String.startsWith(String)>
	//   60  128:ifeq            149
		long l3 = Long.parseLong(s2.substring(8));
	//   61  131:aload           17
	//   62  133:bipush          8
	//   63  135:invokevirtual   #106 <Method String String.substring(int)>
	//   64  138:invokestatic    #111 <Method long Long.parseLong(String)>
	//   65  141:lstore          9
		long l4;
		l4 = l;
	//   66  143:lload_3         
	//   67  144:lstore          11
		break MISSING_BLOCK_LABEL_214;
	//   68  146:goto            214
		if(!s2.startsWith("stale-while-revalidate="))
			break MISSING_BLOCK_LABEL_178;
	//   69  149:aload           17
	//   70  151:ldc1            #113 <String "stale-while-revalidate=">
	//   71  153:invokevirtual   #102 <Method boolean String.startsWith(String)>
	//   72  156:ifeq            178
		l4 = Long.parseLong(s2.substring(23));
	//   73  159:aload           17
	//   74  161:bipush          23
	//   75  163:invokevirtual   #106 <Method String String.substring(int)>
	//   76  166:invokestatic    #111 <Method long Long.parseLong(String)>
	//   77  169:lstore          11
		l3 = l1;
	//   78  171:lload           5
	//   79  173:lstore          9
		break MISSING_BLOCK_LABEL_214;
	//   80  175:goto            214
		if(!s2.equals("must-revalidate"))
	//*  81  178:aload           17
	//*  82  180:ldc1            #115 <String "must-revalidate">
	//*  83  182:invokevirtual   #94  <Method boolean String.equals(Object)>
	//*  84  185:ifne            205
		{
			l3 = l1;
	//   85  188:lload           5
	//   86  190:lstore          9
			l4 = l;
	//   87  192:lload_3         
	//   88  193:lstore          11
			if(!s2.equals("proxy-revalidate"))
				break MISSING_BLOCK_LABEL_214;
	//   89  195:aload           17
	//   90  197:ldc1            #117 <String "proxy-revalidate">
	//   91  199:invokevirtual   #94  <Method boolean String.equals(Object)>
	//   92  202:ifeq            214
		}
		flag = true;
	//   93  205:iconst_1        
	//   94  206:istore_1        
		l4 = l;
	//   95  207:lload_3         
	//   96  208:lstore          11
		l3 = l1;
	//   97  210:lload           5
	//   98  212:lstore          9
_L9:
		i++;
	//   99  214:iload_2         
	//  100  215:iconst_1        
	//  101  216:iadd            
	//  102  217:istore_2        
		l1 = l3;
	//  103  218:lload           9
	//  104  220:lstore          5
		l = l4;
	//  105  222:lload           11
	//  106  224:lstore_3        
		  goto _L7
	//* 107  225:goto            82
_L5:
		return null;
	//  108  228:aconst_null     
	//  109  229:areturn         
_L4:
		boolean flag1 = true;
	//  110  230:iconst_1        
	//  111  231:istore_2        
		  goto _L8
	//* 112  232:goto            242
_L2:
		l1 = 0L;
	//  113  235:lconst_0        
	//  114  236:lstore          5
		l = 0L;
	//  115  238:lconst_0        
	//  116  239:lstore_3        
		flag1 = false;
	//  117  240:iconst_0        
	//  118  241:istore_2        
_L8:
		String s1 = (String)map.get("Expires");
	//  119  242:aload           15
	//  120  244:ldc1            #119 <String "Expires">
	//  121  246:invokeinterface #70  <Method Object Map.get(Object)>
	//  122  251:checkcast       #72  <Class String>
	//  123  254:astore          16
		if(s1 != null)
	//* 124  256:aload           16
	//* 125  258:ifnull          271
			l4 = parseDateAsEpoch(s1);
	//  126  261:aload           16
	//  127  263:invokestatic    #76  <Method long parseDateAsEpoch(String)>
	//  128  266:lstore          11
		else
	//* 129  268:goto            274
			l4 = 0L;
	//  130  271:lconst_0        
	//  131  272:lstore          11
		s1 = (String)map.get("Last-Modified");
	//  132  274:aload           15
	//  133  276:ldc1            #121 <String "Last-Modified">
	//  134  278:invokeinterface #70  <Method Object Map.get(Object)>
	//  135  283:checkcast       #72  <Class String>
	//  136  286:astore          16
		if(s1 != null)
	//* 137  288:aload           16
	//* 138  290:ifnull          303
			l3 = parseDateAsEpoch(s1);
	//  139  293:aload           16
	//  140  295:invokestatic    #76  <Method long parseDateAsEpoch(String)>
	//  141  298:lstore          9
		else
	//* 142  300:goto            306
			l3 = 0L;
	//  143  303:lconst_0        
	//  144  304:lstore          9
		s1 = (String)map.get("ETag");
	//  145  306:aload           15
	//  146  308:ldc1            #123 <String "ETag">
	//  147  310:invokeinterface #70  <Method Object Map.get(Object)>
	//  148  315:checkcast       #72  <Class String>
	//  149  318:astore          16
		if(flag1)
	//* 150  320:iload_2         
	//* 151  321:ifeq            362
		{
			l1 = l5 + l1 * 1000L;
	//  152  324:lload           13
	//  153  326:lload           5
	//  154  328:ldc2w           #124 <Long 1000L>
	//  155  331:lmul            
	//  156  332:ladd            
	//  157  333:lstore          5
			if(flag)
	//* 158  335:iload_1         
	//* 159  336:ifeq            345
			{
				l = l1;
	//  160  339:lload           5
	//  161  341:lstore_3        
			} else
	//* 162  342:goto            398
			{
				Long.signum(l);
	//  163  345:lload_3         
	//  164  346:invokestatic    #129 <Method int Long.signum(long)>
	//  165  349:pop             
				l = l * 1000L + l1;
	//  166  350:lload_3         
	//  167  351:ldc2w           #124 <Long 1000L>
	//  168  354:lmul            
	//  169  355:lload           5
	//  170  357:ladd            
	//  171  358:lstore_3        
			}
		} else
	//* 172  359:goto            398
		if(l2 > 0L && l4 >= l2)
	//* 173  362:lload           7
	//* 174  364:lconst_0        
	//* 175  365:lcmp            
	//* 176  366:ifle            392
	//* 177  369:lload           11
	//* 178  371:lload           7
	//* 179  373:lcmp            
	//* 180  374:iflt            392
		{
			l = (l4 - l2) + l5;
	//  181  377:lload           11
	//  182  379:lload           7
	//  183  381:lsub            
	//  184  382:lload           13
	//  185  384:ladd            
	//  186  385:lstore_3        
			l1 = l;
	//  187  386:lload_3         
	//  188  387:lstore          5
		} else
	//* 189  389:goto            398
		{
			l1 = 0L;
	//  190  392:lconst_0        
	//  191  393:lstore          5
			l = l1;
	//  192  395:lload           5
	//  193  397:lstore_3        
		}
		com.android.volley.Cache.Entry entry = new com.android.volley.Cache.Entry();
	//  194  398:new             #131 <Class com.android.volley.Cache$Entry>
	//  195  401:dup             
	//  196  402:invokespecial   #134 <Method void com.android.volley.Cache$Entry()>
	//  197  405:astore          17
		entry.data = networkresponse.data;
	//  198  407:aload           17
	//  199  409:aload_0         
	//  200  410:getfield        #138 <Field byte[] NetworkResponse.data>
	//  201  413:putfield        #139 <Field byte[] com.android.volley.Cache$Entry.data>
		entry.etag = s1;
	//  202  416:aload           17
	//  203  418:aload           16
	//  204  420:putfield        #143 <Field String com.android.volley.Cache$Entry.etag>
		entry.softTtl = l1;
	//  205  423:aload           17
	//  206  425:lload           5
	//  207  427:putfield        #147 <Field long com.android.volley.Cache$Entry.softTtl>
		entry.ttl = l;
	//  208  430:aload           17
	//  209  432:lload_3         
	//  210  433:putfield        #150 <Field long com.android.volley.Cache$Entry.ttl>
		entry.serverDate = l2;
	//  211  436:aload           17
	//  212  438:lload           7
	//  213  440:putfield        #153 <Field long com.android.volley.Cache$Entry.serverDate>
		entry.lastModified = l3;
	//  214  443:aload           17
	//  215  445:lload           9
	//  216  447:putfield        #156 <Field long com.android.volley.Cache$Entry.lastModified>
		entry.responseHeaders = map;
	//  217  450:aload           17
	//  218  452:aload           15
	//  219  454:putfield        #159 <Field Map com.android.volley.Cache$Entry.responseHeaders>
		entry.allResponseHeaders = networkresponse.allHeaders;
	//  220  457:aload           17
	//  221  459:aload_0         
	//  222  460:getfield        #163 <Field List NetworkResponse.allHeaders>
	//  223  463:putfield        #166 <Field List com.android.volley.Cache$Entry.allResponseHeaders>
		return entry;
	//  224  466:aload           17
	//  225  468:areturn         
		Exception exception;
		exception;
	//  226  469:astore          17
		l3 = l1;
	//  227  471:lload           5
	//  228  473:lstore          9
		l4 = l;
	//  229  475:lload_3         
	//  230  476:lstore          11
		  goto _L9
	//* 231  478:goto            214
	}

	public static String parseCharset(Map map, String s)
	{
		map = ((Map) ((String)map.get("Content-Type")));
	//    0    0:aload_0         
	//    1    1:ldc1            #170 <String "Content-Type">
	//    2    3:invokeinterface #70  <Method Object Map.get(Object)>
	//    3    8:checkcast       #72  <Class String>
	//    4   11:astore_0        
		if(map != null)
	//*   5   12:aload_0         
	//*   6   13:ifnull          71
		{
			map = ((Map) (((String) (map)).split(";")));
	//    7   16:aload_0         
	//    8   17:ldc1            #172 <String ";">
	//    9   19:invokevirtual   #84  <Method String[] String.split(String)>
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
	//   20   34:invokevirtual   #88  <Method String String.trim()>
	//   21   37:ldc1            #174 <String "=">
	//   22   39:invokevirtual   #84  <Method String[] String.split(String)>
	//   23   42:astore_3        
				if(as.length == 2 && as[0].equals("charset"))
	//*  24   43:aload_3         
	//*  25   44:arraylength     
	//*  26   45:iconst_2        
	//*  27   46:icmpne          64
	//*  28   49:aload_3         
	//*  29   50:iconst_0        
	//*  30   51:aaload          
	//*  31   52:ldc1            #176 <String "charset">
	//*  32   54:invokevirtual   #94  <Method boolean String.equals(Object)>
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
			l = newRfc1123Formatter().parse(s).getTime();
	//    0    0:invokestatic    #10  <Method SimpleDateFormat newRfc1123Formatter()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #184 <Method Date SimpleDateFormat.parse(String)>
	//    3    7:invokevirtual   #187 <Method long Date.getTime()>
	//    4   10:lstore_1        
		}
	//*   5   11:lload_1         
	//*   6   12:lreturn         
		catch(ParseException parseexception)
	//*   7   13:astore_3        
		{
			VolleyLog.e(((Throwable) (parseexception)), "Unable to parse dateStr: %s, falling back to 0", new Object[] {
				s
			});
	//    8   14:aload_3         
	//    9   15:ldc1            #189 <String "Unable to parse dateStr: %s, falling back to 0">
	//   10   17:iconst_1        
	//   11   18:anewarray       Object[]
	//   12   21:dup             
	//   13   22:iconst_0        
	//   14   23:aload_0         
	//   15   24:aastore         
	//   16   25:invokestatic    #195 <Method void VolleyLog.e(Throwable, String, Object[])>
			return 0L;
	//   17   28:lconst_0        
	//   18   29:lreturn         
		}
		return l;
	}

	static List toAllHeaderList(Map map)
	{
		ArrayList arraylist = new ArrayList(map.size());
	//    0    0:new             #199 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #203 <Method int Map.size()>
	//    4   10:invokespecial   #206 <Method void ArrayList(int)>
	//    5   13:astore_1        
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); ((List) (arraylist)).add(((Object) (new Header((String)entry.getKey(), (String)entry.getValue())))))
	//*   6   14:aload_0         
	//*   7   15:invokeinterface #210 <Method Set Map.entrySet()>
	//*   8   20:invokeinterface #216 <Method Iterator Set.iterator()>
	//*   9   25:astore_0        
	//*  10   26:aload_0         
	//*  11   27:invokeinterface #222 <Method boolean Iterator.hasNext()>
	//*  12   32:ifeq            80
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   13   35:aload_0         
	//   14   36:invokeinterface #226 <Method Object Iterator.next()>
	//   15   41:checkcast       #228 <Class java.util.Map$Entry>
	//   16   44:astore_2        

	//   17   45:aload_1         
	//   18   46:new             #230 <Class Header>
	//   19   49:dup             
	//   20   50:aload_2         
	//   21   51:invokeinterface #233 <Method Object java.util.Map$Entry.getKey()>
	//   22   56:checkcast       #72  <Class String>
	//   23   59:aload_2         
	//   24   60:invokeinterface #236 <Method Object java.util.Map$Entry.getValue()>
	//   25   65:checkcast       #72  <Class String>
	//   26   68:invokespecial   #239 <Method void Header(String, String)>
	//   27   71:invokeinterface #244 <Method boolean List.add(Object)>
	//   28   76:pop             
	//*  29   77:goto            26
		return ((List) (arraylist));
	//   30   80:aload_1         
	//   31   81:areturn         
	}

	static Map toHeaderMap(List list)
	{
		TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
	//    0    0:new             #249 <Class TreeMap>
	//    1    3:dup             
	//    2    4:getstatic       #253 <Field java.util.Comparator String.CASE_INSENSITIVE_ORDER>
	//    3    7:invokespecial   #256 <Method void TreeMap(java.util.Comparator)>
	//    4   10:astore_1        
		Header header;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((Map) (treemap)).put(((Object) (header.getName())), ((Object) (header.getValue()))))
	//*   5   11:aload_0         
	//*   6   12:invokeinterface #257 <Method Iterator List.iterator()>
	//*   7   17:astore_0        
	//*   8   18:aload_0         
	//*   9   19:invokeinterface #222 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            55
			header = (Header)((Iterator) (list)).next();
	//   11   27:aload_0         
	//   12   28:invokeinterface #226 <Method Object Iterator.next()>
	//   13   33:checkcast       #230 <Class Header>
	//   14   36:astore_2        

	//   15   37:aload_1         
	//   16   38:aload_2         
	//   17   39:invokevirtual   #260 <Method String Header.getName()>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #262 <Method String Header.getValue()>
	//   20   46:invokeinterface #266 <Method Object Map.put(Object, Object)>
	//   21   51:pop             
	//*  22   52:goto            18
		return ((Map) (treemap));
	//   23   55:aload_1         
	//   24   56:areturn         
	}
}
