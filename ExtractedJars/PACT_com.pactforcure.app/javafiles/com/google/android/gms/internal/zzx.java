// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

// Referenced classes of package com.google.android.gms.internal:
//			zzi

public class zzx
{

	public static String zza(Map map)
	{
		return zza(map, "ISO-8859-1");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "ISO-8859-1">
	//    2    3:invokestatic    #11  <Method String zza(Map, String)>
	//    3    6:areturn         
	}

	public static String zza(Map map, String s)
	{
		String s1;
		s1 = (String)map.get("Content-Type");
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <String "Content-Type">
	//    2    3:invokeinterface #22  <Method Object Map.get(Object)>
	//    3    8:checkcast       #24  <Class String>
	//    4   11:astore_3        
		map = ((Map) (s));
	//    5   12:aload_1         
	//    6   13:astore_0        
		if(s1 == null) goto _L2; else goto _L1
	//    7   14:aload_3         
	//    8   15:ifnull          68
_L1:
		int i;
		String as[];
		as = s1.split(";");
	//    9   18:aload_3         
	//   10   19:ldc1            #26  <String ";">
	//   11   21:invokevirtual   #30  <Method String[] String.split(String)>
	//   12   24:astore_3        
		i = 1;
	//   13   25:iconst_1        
	//   14   26:istore_2        
_L7:
		map = ((Map) (s));
	//   15   27:aload_1         
	//   16   28:astore_0        
		if(i >= as.length) goto _L2; else goto _L3
	//   17   29:iload_2         
	//   18   30:aload_3         
	//   19   31:arraylength     
	//   20   32:icmpge          68
_L3:
		map = ((Map) (as[i].trim().split("=")));
	//   21   35:aload_3         
	//   22   36:iload_2         
	//   23   37:aaload          
	//   24   38:invokevirtual   #34  <Method String String.trim()>
	//   25   41:ldc1            #36  <String "=">
	//   26   43:invokevirtual   #30  <Method String[] String.split(String)>
	//   27   46:astore_0        
		if(map.length != 2 || !((String) (map[0])).equals("charset")) goto _L5; else goto _L4
	//   28   47:aload_0         
	//   29   48:arraylength     
	//   30   49:iconst_2        
	//   31   50:icmpne          70
	//   32   53:aload_0         
	//   33   54:iconst_0        
	//   34   55:aaload          
	//   35   56:ldc1            #38  <String "charset">
	//   36   58:invokevirtual   #42  <Method boolean String.equals(Object)>
	//   37   61:ifeq            70
_L4:
		map = ((Map) (map[1]));
	//   38   64:aload_0         
	//   39   65:iconst_1        
	//   40   66:aaload          
	//   41   67:astore_0        
_L2:
		return ((String) (map));
	//   42   68:aload_0         
	//   43   69:areturn         
_L5:
		i++;
	//   44   70:iload_2         
	//   45   71:iconst_1        
	//   46   72:iadd            
	//   47   73:istore_2        
		if(true) goto _L7; else goto _L6
	//   48   74:goto            27
_L6:
	}

	public static zzb.zza zzb(zzi zzi1)
	{
		boolean flag;
		int i;
		long l;
		long l1;
		long l2;
		long l5;
		Map map;
		String as[];
		l5 = System.currentTimeMillis();
	//    0    0:invokestatic    #53  <Method long System.currentTimeMillis()>
	//    1    3:lstore          13
		map = zzi1.zzy;
	//    2    5:aload_0         
	//    3    6:getfield        #59  <Field Map zzi.zzy>
	//    4    9:astore          15
		l2 = 0L;
	//    5   11:lconst_0        
	//    6   12:lstore          7
		l1 = 0L;
	//    7   14:lconst_0        
	//    8   15:lstore          5
		l = 0L;
	//    9   17:lconst_0        
	//   10   18:lstore_3        
		String s = (String)map.get("Date");
	//   11   19:aload           15
	//   12   21:ldc1            #61  <String "Date">
	//   13   23:invokeinterface #22  <Method Object Map.get(Object)>
	//   14   28:checkcast       #24  <Class String>
	//   15   31:astore          16
		if(s != null)
	//*  16   33:aload           16
	//*  17   35:ifnull          45
			l2 = zzg(s);
	//   18   38:aload           16
	//   19   40:invokestatic    #65  <Method long zzg(String)>
	//   20   43:lstore          7
		s = (String)map.get("Cache-Control");
	//   21   45:aload           15
	//   22   47:ldc1            #67  <String "Cache-Control">
	//   23   49:invokeinterface #22  <Method Object Map.get(Object)>
	//   24   54:checkcast       #24  <Class String>
	//   25   57:astore          16
		if(s == null)
			break MISSING_BLOCK_LABEL_465;
	//   26   59:aload           16
	//   27   61:ifnull          465
		as = s.split(",");
	//   28   64:aload           16
	//   29   66:ldc1            #69  <String ",">
	//   30   68:invokevirtual   #30  <Method String[] String.split(String)>
	//   31   71:astore          16
		i = 0;
	//   32   73:iconst_0        
	//   33   74:istore_2        
		flag = false;
	//   34   75:iconst_0        
	//   35   76:istore_1        
		l = 0L;
	//   36   77:lconst_0        
	//   37   78:lstore_3        
		l1 = 0L;
	//   38   79:lconst_0        
	//   39   80:lstore          5
_L5:
		if(i >= as.length) goto _L2; else goto _L1
	//   40   82:iload_2         
	//   41   83:aload           16
	//   42   85:arraylength     
	//   43   86:icmpge          227
_L1:
		String s2;
		s2 = as[i].trim();
	//   44   89:aload           16
	//   45   91:iload_2         
	//   46   92:aaload          
	//   47   93:invokevirtual   #34  <Method String String.trim()>
	//   48   96:astore          17
		if(s2.equals("no-cache") || s2.equals("no-store"))
	//*  49   98:aload           17
	//*  50  100:ldc1            #71  <String "no-cache">
	//*  51  102:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  52  105:ifne            118
	//*  53  108:aload           17
	//*  54  110:ldc1            #73  <String "no-store">
	//*  55  112:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  56  115:ifeq            120
			return null;
	//   57  118:aconst_null     
	//   58  119:areturn         
		if(!s2.startsWith("max-age=")) goto _L4; else goto _L3
	//   59  120:aload           17
	//   60  122:ldc1            #75  <String "max-age=">
	//   61  124:invokevirtual   #79  <Method boolean String.startsWith(String)>
	//   62  127:ifeq            159
_L3:
		long l4 = Long.parseLong(s2.substring(8));
	//   63  130:aload           17
	//   64  132:bipush          8
	//   65  134:invokevirtual   #83  <Method String String.substring(int)>
	//   66  137:invokestatic    #88  <Method long Long.parseLong(String)>
	//   67  140:lstore          11
		long l3 = l;
	//   68  142:lload_3         
	//   69  143:lstore          9
_L6:
		i++;
	//   70  145:iload_2         
	//   71  146:iconst_1        
	//   72  147:iadd            
	//   73  148:istore_2        
		l = l3;
	//   74  149:lload           9
	//   75  151:lstore_3        
		l1 = l4;
	//   76  152:lload           11
	//   77  154:lstore          5
		  goto _L5
	//*  78  156:goto            82
_L4:
		if(!s2.startsWith("stale-while-revalidate="))
			break MISSING_BLOCK_LABEL_188;
	//   79  159:aload           17
	//   80  161:ldc1            #90  <String "stale-while-revalidate=">
	//   81  163:invokevirtual   #79  <Method boolean String.startsWith(String)>
	//   82  166:ifeq            188
		l3 = Long.parseLong(s2.substring(23));
	//   83  169:aload           17
	//   84  171:bipush          23
	//   85  173:invokevirtual   #83  <Method String String.substring(int)>
	//   86  176:invokestatic    #88  <Method long Long.parseLong(String)>
	//   87  179:lstore          9
		l4 = l1;
	//   88  181:lload           5
	//   89  183:lstore          11
		  goto _L6
	//*  90  185:goto            145
		if(s2.equals("must-revalidate")) goto _L8; else goto _L7
	//   91  188:aload           17
	//   92  190:ldc1            #92  <String "must-revalidate">
	//   93  192:invokevirtual   #42  <Method boolean String.equals(Object)>
	//   94  195:ifne            215
_L7:
		l3 = l;
	//   95  198:lload_3         
	//   96  199:lstore          9
		l4 = l1;
	//   97  201:lload           5
	//   98  203:lstore          11
		if(!s2.equals("proxy-revalidate")) goto _L6; else goto _L8
	//   99  205:aload           17
	//  100  207:ldc1            #94  <String "proxy-revalidate">
	//  101  209:invokevirtual   #42  <Method boolean String.equals(Object)>
	//  102  212:ifeq            145
_L8:
		flag = true;
	//  103  215:iconst_1        
	//  104  216:istore_1        
		l3 = l;
	//  105  217:lload_3         
	//  106  218:lstore          9
		l4 = l1;
	//  107  220:lload           5
	//  108  222:lstore          11
		  goto _L6
	//* 109  224:goto            145
_L2:
		boolean flag1 = true;
	//  110  227:iconst_1        
	//  111  228:istore_2        
_L9:
		String s1 = (String)map.get("Expires");
	//  112  229:aload           15
	//  113  231:ldc1            #96  <String "Expires">
	//  114  233:invokeinterface #22  <Method Object Map.get(Object)>
	//  115  238:checkcast       #24  <Class String>
	//  116  241:astore          16
		Exception exception;
		if(s1 != null)
	//* 117  243:aload           16
	//* 118  245:ifnull          459
			l4 = zzg(s1);
	//  119  248:aload           16
	//  120  250:invokestatic    #65  <Method long zzg(String)>
	//  121  253:lstore          11
		else
	//* 122  255:aload           15
	//* 123  257:ldc1            #98  <String "Last-Modified">
	//* 124  259:invokeinterface #22  <Method Object Map.get(Object)>
	//* 125  264:checkcast       #24  <Class String>
	//* 126  267:astore          16
	//* 127  269:aload           16
	//* 128  271:ifnull          453
	//* 129  274:aload           16
	//* 130  276:invokestatic    #65  <Method long zzg(String)>
	//* 131  279:lstore          9
	//* 132  281:aload           15
	//* 133  283:ldc1            #100 <String "ETag">
	//* 134  285:invokeinterface #22  <Method Object Map.get(Object)>
	//* 135  290:checkcast       #24  <Class String>
	//* 136  293:astore          16
	//* 137  295:iload_2         
	//* 138  296:ifeq            391
	//* 139  299:lload           13
	//* 140  301:ldc2w           #101 <Long 1000L>
	//* 141  304:lload           5
	//* 142  306:lmul            
	//* 143  307:ladd            
	//* 144  308:lstore          5
	//* 145  310:iload_1         
	//* 146  311:ifeq            379
	//* 147  314:lload           5
	//* 148  316:lstore_3        
	//* 149  317:new             #104 <Class zzb$zza>
	//* 150  320:dup             
	//* 151  321:invokespecial   #108 <Method void zzb$zza()>
	//* 152  324:astore          17
	//* 153  326:aload           17
	//* 154  328:aload_0         
	//* 155  329:getfield        #112 <Field byte[] zzi.data>
	//* 156  332:putfield        #113 <Field byte[] zzb$zza.data>
	//* 157  335:aload           17
	//* 158  337:aload           16
	//* 159  339:putfield        #116 <Field String zzb$zza.zza>
	//* 160  342:aload           17
	//* 161  344:lload           5
	//* 162  346:putfield        #120 <Field long zzb$zza.zze>
	//* 163  349:aload           17
	//* 164  351:lload_3         
	//* 165  352:putfield        #123 <Field long zzb$zza.zzd>
	//* 166  355:aload           17
	//* 167  357:lload           7
	//* 168  359:putfield        #125 <Field long zzb$zza.zzb>
	//* 169  362:aload           17
	//* 170  364:lload           9
	//* 171  366:putfield        #128 <Field long zzb$zza.zzc>
	//* 172  369:aload           17
	//* 173  371:aload           15
	//* 174  373:putfield        #131 <Field Map zzb$zza.zzf>
	//* 175  376:aload           17
	//* 176  378:areturn         
	//* 177  379:ldc2w           #101 <Long 1000L>
	//* 178  382:lload_3         
	//* 179  383:lmul            
	//* 180  384:lload           5
	//* 181  386:ladd            
	//* 182  387:lstore_3        
	//* 183  388:goto            317
	//* 184  391:lload           7
	//* 185  393:lconst_0        
	//* 186  394:lcmp            
	//* 187  395:ifle            445
	//* 188  398:lload           11
	//* 189  400:lload           7
	//* 190  402:lcmp            
	//* 191  403:iflt            445
	//* 192  406:lload           11
	//* 193  408:lload           7
	//* 194  410:lsub            
	//* 195  411:lload           13
	//* 196  413:ladd            
	//* 197  414:lstore_3        
	//* 198  415:lload_3         
	//* 199  416:lstore          5
	//* 200  418:goto            317
	//* 201  421:astore          17
	//* 202  423:lload_3         
	//* 203  424:lstore          9
	//* 204  426:lload           5
	//* 205  428:lstore          11
	//* 206  430:goto            145
	//* 207  433:astore          17
	//* 208  435:lload_3         
	//* 209  436:lstore          9
	//* 210  438:lload           5
	//* 211  440:lstore          11
	//* 212  442:goto            145
	//* 213  445:lconst_0        
	//* 214  446:lstore_3        
	//* 215  447:lconst_0        
	//* 216  448:lstore          5
	//* 217  450:goto            317
	//* 218  453:lconst_0        
	//* 219  454:lstore          9
	//* 220  456:goto            281
			l4 = 0L;
	//  221  459:lconst_0        
	//  222  460:lstore          11
		s1 = (String)map.get("Last-Modified");
		if(s1 != null)
			l3 = zzg(s1);
		else
			l3 = 0L;
		s1 = (String)map.get("ETag");
		if(flag1)
		{
			l1 = l5 + 1000L * l1;
			zzb.zza zza1;
			if(flag)
				l = l1;
			else
				l = 1000L * l + l1;
		} else
		if(l2 > 0L && l4 >= l2)
		{
			l = (l4 - l2) + l5;
			l1 = l;
		} else
		{
			l = 0L;
			l1 = 0L;
		}
		zza1 = new zzb.zza();
		zza1.data = zzi1.data;
		zza1.zza = s1;
		zza1.zze = l1;
		zza1.zzd = l;
		zza1.zzb = l2;
		zza1.zzc = l3;
		zza1.zzf = map;
		return zza1;
		exception;
		l3 = l;
		l4 = l1;
		  goto _L6
		exception;
		l3 = l;
		l4 = l1;
		  goto _L6
	//* 223  462:goto            255
		flag = false;
	//  224  465:iconst_0        
	//  225  466:istore_1        
		flag1 = false;
	//  226  467:iconst_0        
	//  227  468:istore_2        
		  goto _L9
	//* 228  469:goto            229
	}

	public static long zzg(String s)
	{
		long l;
		try
		{
			l = DateUtils.parseDate(s).getTime();
	//    0    0:aload_0         
	//    1    1:invokestatic    #139 <Method Date DateUtils.parseDate(String)>
	//    2    4:invokevirtual   #144 <Method long Date.getTime()>
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
