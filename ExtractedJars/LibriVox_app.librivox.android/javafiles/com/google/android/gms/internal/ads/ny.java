// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ee, bmq, azi

public final class ny
{

	private static long a(String s)
	{
		long l;
		try
		{
			l = a().parse(s).getTime();
	//    0    0:invokestatic    #11  <Method SimpleDateFormat a()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #17  <Method Date SimpleDateFormat.parse(String)>
	//    3    7:invokevirtual   #23  <Method long Date.getTime()>
	//    4   10:lstore_1        
		}
	//*   5   11:lload_1         
	//*   6   12:lreturn         
		catch(ParseException parseexception)
	//*   7   13:astore_3        
		{
			ee.a(((Throwable) (parseexception)), "Unable to parse dateStr: %s, falling back to 0", new Object[] {
				s
			});
	//    8   14:aload_3         
	//    9   15:ldc1            #25  <String "Unable to parse dateStr: %s, falling back to 0">
	//   10   17:iconst_1        
	//   11   18:anewarray       Object[]
	//   12   21:dup             
	//   13   22:iconst_0        
	//   14   23:aload_0         
	//   15   24:aastore         
	//   16   25:invokestatic    #30  <Method void ee.a(Throwable, String, Object[])>
			return 0L;
	//   17   28:lconst_0        
	//   18   29:lreturn         
		}
		return l;
	}

	public static azi a(bmq bmq1)
	{
		boolean flag;
		int i;
		long l2;
		long l5;
		Map map;
		String s;
		l5 = System.currentTimeMillis();
	//    0    0:invokestatic    #39  <Method long System.currentTimeMillis()>
	//    1    3:lstore          13
		map = bmq1.c;
	//    2    5:aload_0         
	//    3    6:getfield        #45  <Field Map bmq.c>
	//    4    9:astore          15
		s = (String)map.get("Date");
	//    5   11:aload           15
	//    6   13:ldc1            #47  <String "Date">
	//    7   15:invokeinterface #53  <Method Object Map.get(Object)>
	//    8   20:checkcast       #55  <Class String>
	//    9   23:astore          16
		if(s != null)
	//*  10   25:aload           16
	//*  11   27:ifnull          40
			l2 = a(s);
	//   12   30:aload           16
	//   13   32:invokestatic    #57  <Method long a(String)>
	//   14   35:lstore          7
		else
	//*  15   37:goto            43
			l2 = 0L;
	//   16   40:lconst_0        
	//   17   41:lstore          7
		s = (String)map.get("Cache-Control");
	//   18   43:aload           15
	//   19   45:ldc1            #59  <String "Cache-Control">
	//   20   47:invokeinterface #53  <Method Object Map.get(Object)>
	//   21   52:checkcast       #55  <Class String>
	//   22   55:astore          16
		flag = false;
	//   23   57:iconst_0        
	//   24   58:istore_1        
		i = 0;
	//   25   59:iconst_0        
	//   26   60:istore_2        
		if(s == null) goto _L2; else goto _L1
	//   27   61:aload           16
	//   28   63:ifnull          236
_L1:
		long l;
		long l1;
		String as[];
		as = s.split(",", 0);
	//   29   66:aload           16
	//   30   68:ldc1            #61  <String ",">
	//   31   70:iconst_0        
	//   32   71:invokevirtual   #65  <Method String[] String.split(String, int)>
	//   33   74:astore          16
		l1 = 0L;
	//   34   76:lconst_0        
	//   35   77:lstore          5
		flag = false;
	//   36   79:iconst_0        
	//   37   80:istore_1        
		l = 0L;
	//   38   81:lconst_0        
	//   39   82:lstore_3        
_L7:
		if(i >= as.length) goto _L4; else goto _L3
	//   40   83:iload_2         
	//   41   84:aload           16
	//   42   86:arraylength     
	//   43   87:icmpge          231
_L3:
		String s2 = as[i].trim();
	//   44   90:aload           16
	//   45   92:iload_2         
	//   46   93:aaload          
	//   47   94:invokevirtual   #69  <Method String String.trim()>
	//   48   97:astore          17
		if(!s2.equals("no-cache") && !s2.equals("no-store")) goto _L6; else goto _L5
	//   49   99:aload           17
	//   50  101:ldc1            #71  <String "no-cache">
	//   51  103:invokevirtual   #75  <Method boolean String.equals(Object)>
	//   52  106:ifne            229
	//   53  109:aload           17
	//   54  111:ldc1            #77  <String "no-store">
	//   55  113:invokevirtual   #75  <Method boolean String.equals(Object)>
	//   56  116:ifeq            122
	//*  57  119:goto            229
_L6:
		if(!s2.startsWith("max-age="))
			break MISSING_BLOCK_LABEL_150;
	//   58  122:aload           17
	//   59  124:ldc1            #79  <String "max-age=">
	//   60  126:invokevirtual   #83  <Method boolean String.startsWith(String)>
	//   61  129:ifeq            150
		long l3 = Long.parseLong(s2.substring(8));
	//   62  132:aload           17
	//   63  134:bipush          8
	//   64  136:invokevirtual   #87  <Method String String.substring(int)>
	//   65  139:invokestatic    #92  <Method long Long.parseLong(String)>
	//   66  142:lstore          9
		long l4;
		l4 = l;
	//   67  144:lload_3         
	//   68  145:lstore          11
		break MISSING_BLOCK_LABEL_215;
	//   69  147:goto            215
		if(!s2.startsWith("stale-while-revalidate="))
			break MISSING_BLOCK_LABEL_179;
	//   70  150:aload           17
	//   71  152:ldc1            #94  <String "stale-while-revalidate=">
	//   72  154:invokevirtual   #83  <Method boolean String.startsWith(String)>
	//   73  157:ifeq            179
		l4 = Long.parseLong(s2.substring(23));
	//   74  160:aload           17
	//   75  162:bipush          23
	//   76  164:invokevirtual   #87  <Method String String.substring(int)>
	//   77  167:invokestatic    #92  <Method long Long.parseLong(String)>
	//   78  170:lstore          11
		l3 = l1;
	//   79  172:lload           5
	//   80  174:lstore          9
		break MISSING_BLOCK_LABEL_215;
	//   81  176:goto            215
		if(!s2.equals("must-revalidate"))
	//*  82  179:aload           17
	//*  83  181:ldc1            #96  <String "must-revalidate">
	//*  84  183:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  85  186:ifne            206
		{
			l3 = l1;
	//   86  189:lload           5
	//   87  191:lstore          9
			l4 = l;
	//   88  193:lload_3         
	//   89  194:lstore          11
			if(!s2.equals("proxy-revalidate"))
				break MISSING_BLOCK_LABEL_215;
	//   90  196:aload           17
	//   91  198:ldc1            #98  <String "proxy-revalidate">
	//   92  200:invokevirtual   #75  <Method boolean String.equals(Object)>
	//   93  203:ifeq            215
		}
		flag = true;
	//   94  206:iconst_1        
	//   95  207:istore_1        
		l4 = l;
	//   96  208:lload_3         
	//   97  209:lstore          11
		l3 = l1;
	//   98  211:lload           5
	//   99  213:lstore          9
_L9:
		i++;
	//  100  215:iload_2         
	//  101  216:iconst_1        
	//  102  217:iadd            
	//  103  218:istore_2        
		l1 = l3;
	//  104  219:lload           9
	//  105  221:lstore          5
		l = l4;
	//  106  223:lload           11
	//  107  225:lstore_3        
		  goto _L7
	//* 108  226:goto            83
_L5:
		return null;
	//  109  229:aconst_null     
	//  110  230:areturn         
_L4:
		boolean flag1 = true;
	//  111  231:iconst_1        
	//  112  232:istore_2        
		  goto _L8
	//* 113  233:goto            243
_L2:
		l1 = 0L;
	//  114  236:lconst_0        
	//  115  237:lstore          5
		l = 0L;
	//  116  239:lconst_0        
	//  117  240:lstore_3        
		flag1 = false;
	//  118  241:iconst_0        
	//  119  242:istore_2        
_L8:
		String s1 = (String)map.get("Expires");
	//  120  243:aload           15
	//  121  245:ldc1            #100 <String "Expires">
	//  122  247:invokeinterface #53  <Method Object Map.get(Object)>
	//  123  252:checkcast       #55  <Class String>
	//  124  255:astore          16
		if(s1 != null)
	//* 125  257:aload           16
	//* 126  259:ifnull          272
			l4 = a(s1);
	//  127  262:aload           16
	//  128  264:invokestatic    #57  <Method long a(String)>
	//  129  267:lstore          11
		else
	//* 130  269:goto            275
			l4 = 0L;
	//  131  272:lconst_0        
	//  132  273:lstore          11
		s1 = (String)map.get("Last-Modified");
	//  133  275:aload           15
	//  134  277:ldc1            #102 <String "Last-Modified">
	//  135  279:invokeinterface #53  <Method Object Map.get(Object)>
	//  136  284:checkcast       #55  <Class String>
	//  137  287:astore          16
		if(s1 != null)
	//* 138  289:aload           16
	//* 139  291:ifnull          304
			l3 = a(s1);
	//  140  294:aload           16
	//  141  296:invokestatic    #57  <Method long a(String)>
	//  142  299:lstore          9
		else
	//* 143  301:goto            307
			l3 = 0L;
	//  144  304:lconst_0        
	//  145  305:lstore          9
		s1 = (String)map.get("ETag");
	//  146  307:aload           15
	//  147  309:ldc1            #104 <String "ETag">
	//  148  311:invokeinterface #53  <Method Object Map.get(Object)>
	//  149  316:checkcast       #55  <Class String>
	//  150  319:astore          16
		if(flag1)
	//* 151  321:iload_2         
	//* 152  322:ifeq            363
		{
			l1 = l5 + l1 * 1000L;
	//  153  325:lload           13
	//  154  327:lload           5
	//  155  329:ldc2w           #105 <Long 1000L>
	//  156  332:lmul            
	//  157  333:ladd            
	//  158  334:lstore          5
			if(flag)
	//* 159  336:iload_1         
	//* 160  337:ifeq            346
			{
				l = l1;
	//  161  340:lload           5
	//  162  342:lstore_3        
			} else
	//* 163  343:goto            399
			{
				Long.signum(l);
	//  164  346:lload_3         
	//  165  347:invokestatic    #110 <Method int Long.signum(long)>
	//  166  350:pop             
				l = l * 1000L + l1;
	//  167  351:lload_3         
	//  168  352:ldc2w           #105 <Long 1000L>
	//  169  355:lmul            
	//  170  356:lload           5
	//  171  358:ladd            
	//  172  359:lstore_3        
			}
		} else
	//* 173  360:goto            399
		if(l2 > 0L && l4 >= l2)
	//* 174  363:lload           7
	//* 175  365:lconst_0        
	//* 176  366:lcmp            
	//* 177  367:ifle            393
	//* 178  370:lload           11
	//* 179  372:lload           7
	//* 180  374:lcmp            
	//* 181  375:iflt            393
		{
			l = (l4 - l2) + l5;
	//  182  378:lload           11
	//  183  380:lload           7
	//  184  382:lsub            
	//  185  383:lload           13
	//  186  385:ladd            
	//  187  386:lstore_3        
			l1 = l;
	//  188  387:lload_3         
	//  189  388:lstore          5
		} else
	//* 190  390:goto            399
		{
			l1 = 0L;
	//  191  393:lconst_0        
	//  192  394:lstore          5
			l = l1;
	//  193  396:lload           5
	//  194  398:lstore_3        
		}
		azi azi1 = new azi();
	//  195  399:new             #112 <Class azi>
	//  196  402:dup             
	//  197  403:invokespecial   #116 <Method void azi()>
	//  198  406:astore          17
		azi1.a = bmq1.b;
	//  199  408:aload           17
	//  200  410:aload_0         
	//  201  411:getfield        #120 <Field byte[] bmq.b>
	//  202  414:putfield        #122 <Field byte[] azi.a>
		azi1.b = s1;
	//  203  417:aload           17
	//  204  419:aload           16
	//  205  421:putfield        #125 <Field String azi.b>
		azi1.f = l1;
	//  206  424:aload           17
	//  207  426:lload           5
	//  208  428:putfield        #129 <Field long azi.f>
		azi1.e = l;
	//  209  431:aload           17
	//  210  433:lload_3         
	//  211  434:putfield        #132 <Field long azi.e>
		azi1.c = l2;
	//  212  437:aload           17
	//  213  439:lload           7
	//  214  441:putfield        #134 <Field long azi.c>
		azi1.d = l3;
	//  215  444:aload           17
	//  216  446:lload           9
	//  217  448:putfield        #137 <Field long azi.d>
		azi1.g = map;
	//  218  451:aload           17
	//  219  453:aload           15
	//  220  455:putfield        #140 <Field Map azi.g>
		azi1.h = bmq1.d;
	//  221  458:aload           17
	//  222  460:aload_0         
	//  223  461:getfield        #143 <Field java.util.List bmq.d>
	//  224  464:putfield        #146 <Field java.util.List azi.h>
		return azi1;
	//  225  467:aload           17
	//  226  469:areturn         
		Exception exception;
		exception;
	//  227  470:astore          17
		l3 = l1;
	//  228  472:lload           5
	//  229  474:lstore          9
		l4 = l;
	//  230  476:lload_3         
	//  231  477:lstore          11
		  goto _L9
	//* 232  479:goto            215
	}

	static String a(long l)
	{
		return a().format(new Date(l));
	//    0    0:invokestatic    #11  <Method SimpleDateFormat a()>
	//    1    3:new             #19  <Class Date>
	//    2    6:dup             
	//    3    7:lload_0         
	//    4    8:invokespecial   #150 <Method void Date(long)>
	//    5   11:invokevirtual   #154 <Method String SimpleDateFormat.format(Date)>
	//    6   14:areturn         
	}

	private static SimpleDateFormat a()
	{
		SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
	//    0    0:new             #13  <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc1            #156 <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//    3    6:getstatic       #162 <Field Locale Locale.US>
	//    4    9:invokespecial   #165 <Method void SimpleDateFormat(String, Locale)>
	//    5   12:astore_0        
		simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
	//    6   13:aload_0         
	//    7   14:ldc1            #167 <String "GMT">
	//    8   16:invokestatic    #173 <Method TimeZone TimeZone.getTimeZone(String)>
	//    9   19:invokevirtual   #177 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		return simpledateformat;
	//   10   22:aload_0         
	//   11   23:areturn         
	}
}
