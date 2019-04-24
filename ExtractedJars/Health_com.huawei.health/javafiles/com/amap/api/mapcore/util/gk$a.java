// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.TraceListener;
import com.amap.api.trace.TraceLocation;
import java.util.*;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.amap.api.mapcore.util:
//			gk, ev, gl, gj

class gk$a
	implements Runnable
{

	private int a()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(e == null || e.size() == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #39  <Field List e>
	//*   4    6:ifnull          21
	//*   5    9:aload_0         
	//*   6   10:getfield        #39  <Field List e>
	//*   7   13:invokeinterface #57  <Method int List.size()>
	//*   8   18:ifne            23
			return 0;
	//    9   21:iconst_0        
	//   10   22:ireturn         
		ArrayList arraylist = new ArrayList();
	//   11   23:new             #30  <Class ArrayList>
	//   12   26:dup             
	//   13   27:invokespecial   #31  <Method void ArrayList()>
	//   14   30:astore_2        
		Iterator iterator = e.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #39  <Field List e>
	//   17   35:invokeinterface #61  <Method Iterator List.iterator()>
	//   18   40:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   41:aload_3         
	//   20   42:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   21   47:ifeq            111
			TraceLocation tracelocation = (TraceLocation)iterator.next();
	//   22   50:aload_3         
	//   23   51:invokeinterface #71  <Method Object Iterator.next()>
	//   24   56:checkcast       #73  <Class TraceLocation>
	//   25   59:astore          4
			if(tracelocation != null)
	//*  26   61:aload           4
	//*  27   63:ifnonnull       69
	//*  28   66:goto            41
				if((double)tracelocation.getSpeed() < 0.01D)
	//*  29   69:aload           4
	//*  30   71:invokevirtual   #77  <Method float TraceLocation.getSpeed()>
	//*  31   74:f2d             
	//*  32   75:ldc2w           #78  <Double 0.01D>
	//*  33   78:dcmpg           
	//*  34   79:ifge            94
				{
					((List) (arraylist)).add(((Object) (tracelocation)));
	//   35   82:aload_2         
	//   36   83:aload           4
	//   37   85:invokeinterface #83  <Method boolean List.add(Object)>
	//   38   90:pop             
				} else
	//*  39   91:goto            41
				{
					i += a(((List) (arraylist)));
	//   40   94:iload_1         
	//   41   95:aload_0         
	//   42   96:aload_2         
	//   43   97:invokespecial   #86  <Method int a(List)>
	//   44  100:iadd            
	//   45  101:istore_1        
					((List) (arraylist)).clear();
	//   46  102:aload_2         
	//   47  103:invokeinterface #89  <Method void List.clear()>
				}
		} while(true);
	//   48  108:goto            41
		return i;
	//   49  111:iload_1         
	//   50  112:ireturn         
	}

	private int a(List list)
	{
		int i = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #57  <Method int List.size()>
	//    2    6:istore_2        
		if(i <= 1)
	//*   3    7:iload_2         
	//*   4    8:iconst_1        
	//*   5    9:icmpgt          14
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		TraceLocation tracelocation = (TraceLocation)list.get(0);
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:invokeinterface #93  <Method Object List.get(int)>
	//   11   21:checkcast       #73  <Class TraceLocation>
	//   12   24:astore_3        
		list = ((List) ((TraceLocation)list.get(i - 1)));
	//   13   25:aload_1         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:isub            
	//   17   29:invokeinterface #93  <Method Object List.get(int)>
	//   18   34:checkcast       #73  <Class TraceLocation>
	//   19   37:astore_1        
		if(tracelocation == null || list == null)
	//*  20   38:aload_3         
	//*  21   39:ifnull          46
	//*  22   42:aload_1         
	//*  23   43:ifnonnull       48
			return 0;
	//   24   46:iconst_0        
	//   25   47:ireturn         
		if(tracelocation != null && list != null)
	//*  26   48:aload_3         
	//*  27   49:ifnull          71
	//*  28   52:aload_1         
	//*  29   53:ifnull          71
			return (int)((((TraceLocation) (list)).getTime() - tracelocation.getTime()) / 1000L);
	//   30   56:aload_1         
	//   31   57:invokevirtual   #97  <Method long TraceLocation.getTime()>
	//   32   60:aload_3         
	//   33   61:invokevirtual   #97  <Method long TraceLocation.getTime()>
	//   34   64:lsub            
	//   35   65:ldc2w           #98  <Long 1000L>
	//   36   68:ldiv            
	//   37   69:l2i             
	//   38   70:ireturn         
		else
			return 0;
	//   39   71:iconst_0        
	//   40   72:ireturn         
	}

	public void run()
	{
		int k;
		int i;
		int j;
		int l;
		Object obj;
		InterruptedException interruptedexception;
		TraceLocation tracelocation;
		LatLng latlng;
		try
		{
			gk.g(a).a(g);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field gk a>
	//    2    4:invokestatic    #108 <Method gk$c gk.g(gk)>
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field TraceListener g>
	//    5   11:invokevirtual   #113 <Method void gk$c.a(TraceListener)>
		}
	//*   6   14:iconst_0        
	//*   7   15:istore_1        
	//*   8   16:aload_0         
	//*   9   17:invokespecial   #115 <Method int a()>
	//*  10   20:istore_2        
	//*  11   21:aload_0         
	//*  12   22:getfield        #39  <Field List e>
	//*  13   25:ifnull          41
	//*  14   28:aload_0         
	//*  15   29:getfield        #39  <Field List e>
	//*  16   32:invokeinterface #57  <Method int List.size()>
	//*  17   37:iconst_2        
	//*  18   38:icmpge          61
	//*  19   41:invokestatic    #120 <Method gl gl.a()>
	//*  20   44:aload_0         
	//*  21   45:getfield        #25  <Field gk a>
	//*  22   48:invokestatic    #108 <Method gk$c gk.g(gk)>
	//*  23   51:aload_0         
	//*  24   52:getfield        #37  <Field int d>
	//*  25   55:ldc1            #122 <String "\u8F68\u8FF9\u70B9\u592A\u5C11\u6216\u8DDD\u79BB\u592A\u8FD1,\u8F68\u8FF9\u7EA0\u504F\u5931\u8D25">
	//*  26   57:invokevirtual   #125 <Method void gl.a(android.os.Handler, int, String)>
	//*  27   60:return          
	//*  28   61:aload_0         
	//*  29   62:getfield        #39  <Field List e>
	//*  30   65:invokeinterface #61  <Method Iterator List.iterator()>
	//*  31   70:astore          5
	//*  32   72:aload           5
	//*  33   74:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  34   79:ifeq            137
	//*  35   82:aload           5
	//*  36   84:invokeinterface #71  <Method Object Iterator.next()>
	//*  37   89:checkcast       #73  <Class TraceLocation>
	//*  38   92:invokevirtual   #129 <Method TraceLocation TraceLocation.copy()>
	//*  39   95:astore          6
	//*  40   97:aload           6
	//*  41   99:ifnull          496
	//*  42  102:aload           6
	//*  43  104:invokevirtual   #133 <Method double TraceLocation.getLatitude()>
	//*  44  107:dconst_0        
	//*  45  108:dcmpl           
	//*  46  109:ifle            496
	//*  47  112:aload           6
	//*  48  114:invokevirtual   #136 <Method double TraceLocation.getLongitude()>
	//*  49  117:dconst_0        
	//*  50  118:dcmpl           
	//*  51  119:ifle            496
	//*  52  122:aload_0         
	//*  53  123:getfield        #33  <Field List b>
	//*  54  126:aload           6
	//*  55  128:invokeinterface #83  <Method boolean List.add(Object)>
	//*  56  133:pop             
	//*  57  134:goto            496
	//*  58  137:aload_0         
	//*  59  138:getfield        #33  <Field List b>
	//*  60  141:invokeinterface #57  <Method int List.size()>
	//*  61  146:istore          4
	//*  62  148:sipush          500
	//*  63  151:istore_3        
	//*  64  152:iload           4
	//*  65  154:iconst_2        
	//*  66  155:isub            
	//*  67  156:sipush          500
	//*  68  159:idiv            
	//*  69  160:istore          4
	//*  70  162:invokestatic    #120 <Method gl gl.a()>
	//*  71  165:aload_0         
	//*  72  166:getfield        #46  <Field String f>
	//*  73  169:aload_0         
	//*  74  170:getfield        #37  <Field int d>
	//*  75  173:iload           4
	//*  76  175:iload_2         
	//*  77  176:invokevirtual   #139 <Method void gl.a(String, int, int, int)>
	//*  78  179:iload_1         
	//*  79  180:iload           4
	//*  80  182:icmpgt          487
	//*  81  185:iload_3         
	//*  82  186:istore_2        
	//*  83  187:iload_1         
	//*  84  188:iload           4
	//*  85  190:icmpne          203
	//*  86  193:aload_0         
	//*  87  194:getfield        #33  <Field List b>
	//*  88  197:invokeinterface #57  <Method int List.size()>
	//*  89  202:istore_2        
	//*  90  203:new             #30  <Class ArrayList>
	//*  91  206:dup             
	//*  92  207:invokespecial   #31  <Method void ArrayList()>
	//*  93  210:astore          5
	//*  94  212:iconst_0        
	//*  95  213:istore_3        
	//*  96  214:iload_3         
	//*  97  215:iload_2         
	//*  98  216:icmpge          379
	//*  99  219:aload_0         
	//* 100  220:getfield        #33  <Field List b>
	//* 101  223:iconst_0        
	//* 102  224:invokeinterface #142 <Method Object List.remove(int)>
	//* 103  229:checkcast       #73  <Class TraceLocation>
	//* 104  232:astore          6
	//* 105  234:aload           6
	//* 106  236:ifnonnull       242
	//* 107  239:goto            499
	//* 108  242:aload_0         
	//* 109  243:getfield        #35  <Field int c>
	//* 110  246:iconst_1        
	//* 111  247:icmpeq          366
	//* 112  250:aload_0         
	//* 113  251:getfield        #35  <Field int c>
	//* 114  254:iconst_3        
	//* 115  255:icmpne          275
	//* 116  258:aload_0         
	//* 117  259:getfield        #25  <Field gk a>
	//* 118  262:invokestatic    #146 <Method CoordinateConverter gk.h(gk)>
	//* 119  265:getstatic       #152 <Field com.amap.api.maps.CoordinateConverter$CoordType com.amap.api.maps.CoordinateConverter$CoordType.BAIDU>
	//* 120  268:invokevirtual   #158 <Method CoordinateConverter CoordinateConverter.from(com.amap.api.maps.CoordinateConverter$CoordType)>
	//* 121  271:pop             
	//* 122  272:goto            297
	//* 123  275:aload_0         
	//* 124  276:getfield        #35  <Field int c>
	//* 125  279:iconst_2        
	//* 126  280:icmpne          297
	//* 127  283:aload_0         
	//* 128  284:getfield        #25  <Field gk a>
	//* 129  287:invokestatic    #146 <Method CoordinateConverter gk.h(gk)>
	//* 130  290:getstatic       #161 <Field com.amap.api.maps.CoordinateConverter$CoordType com.amap.api.maps.CoordinateConverter$CoordType.GPS>
	//* 131  293:invokevirtual   #158 <Method CoordinateConverter CoordinateConverter.from(com.amap.api.maps.CoordinateConverter$CoordType)>
	//* 132  296:pop             
	//* 133  297:new             #163 <Class LatLng>
	//* 134  300:dup             
	//* 135  301:aload           6
	//* 136  303:invokevirtual   #133 <Method double TraceLocation.getLatitude()>
	//* 137  306:aload           6
	//* 138  308:invokevirtual   #136 <Method double TraceLocation.getLongitude()>
	//* 139  311:invokespecial   #166 <Method void LatLng(double, double)>
	//* 140  314:astore          7
	//* 141  316:aload_0         
	//* 142  317:getfield        #25  <Field gk a>
	//* 143  320:invokestatic    #146 <Method CoordinateConverter gk.h(gk)>
	//* 144  323:aload           7
	//* 145  325:invokevirtual   #170 <Method CoordinateConverter CoordinateConverter.coord(LatLng)>
	//* 146  328:pop             
	//* 147  329:aload_0         
	//* 148  330:getfield        #25  <Field gk a>
	//* 149  333:invokestatic    #146 <Method CoordinateConverter gk.h(gk)>
	//* 150  336:invokevirtual   #174 <Method LatLng CoordinateConverter.convert()>
	//* 151  339:astore          7
	//* 152  341:aload           7
	//* 153  343:ifnull          366
	//* 154  346:aload           6
	//* 155  348:aload           7
	//* 156  350:getfield        #178 <Field double LatLng.latitude>
	//* 157  353:invokevirtual   #182 <Method void TraceLocation.setLatitude(double)>
	//* 158  356:aload           6
	//* 159  358:aload           7
	//* 160  360:getfield        #185 <Field double LatLng.longitude>
	//* 161  363:invokevirtual   #188 <Method void TraceLocation.setLongitude(double)>
	//* 162  366:aload           5
	//* 163  368:aload           6
	//* 164  370:invokeinterface #83  <Method boolean List.add(Object)>
	//* 165  375:pop             
	//* 166  376:goto            499
	//* 167  379:iload_2         
	//* 168  380:istore_3        
	//* 169  381:aload           5
	//* 170  383:invokeinterface #57  <Method int List.size()>
	//* 171  388:iconst_2        
	//* 172  389:icmplt          179
	//* 173  392:aload           5
	//* 174  394:invokeinterface #57  <Method int List.size()>
	//* 175  399:sipush          500
	//* 176  402:icmple          410
	//* 177  405:iload_2         
	//* 178  406:istore_3        
	//* 179  407:goto            179
	//* 180  410:new             #190 <Class gj>
	//* 181  413:dup             
	//* 182  414:aload_0         
	//* 183  415:getfield        #25  <Field gk a>
	//* 184  418:invokestatic    #194 <Method android.content.Context gk.i(gk)>
	//* 185  421:aload_0         
	//* 186  422:getfield        #25  <Field gk a>
	//* 187  425:invokestatic    #108 <Method gk$c gk.g(gk)>
	//* 188  428:aload           5
	//* 189  430:aload_0         
	//* 190  431:getfield        #35  <Field int c>
	//* 191  434:aload_0         
	//* 192  435:getfield        #46  <Field String f>
	//* 193  438:aload_0         
	//* 194  439:getfield        #37  <Field int d>
	//* 195  442:iload_1         
	//* 196  443:invokespecial   #197 <Method void gj(android.content.Context, android.os.Handler, List, int, String, int, int)>
	//* 197  446:astore          5
	//* 198  448:aload_0         
	//* 199  449:getfield        #25  <Field gk a>
	//* 200  452:invokestatic    #201 <Method ExecutorService gk.j(gk)>
	//* 201  455:aload           5
	//* 202  457:invokeinterface #207 <Method void ExecutorService.execute(Runnable)>
	//* 203  462:iload_1         
	//* 204  463:iconst_1        
	//* 205  464:iadd            
	//* 206  465:istore_1        
	//* 207  466:ldc2w           #208 <Long 50L>
	//* 208  469:invokestatic    #215 <Method void Thread.sleep(long)>
	//* 209  472:goto            482
	//* 210  475:astore          5
	//* 211  477:aload           5
	//* 212  479:invokevirtual   #218 <Method void InterruptedException.printStackTrace()>
	//* 213  482:iload_2         
	//* 214  483:istore_3        
	//* 215  484:goto            179
	//* 216  487:return          
		catch(Throwable throwable)
	//* 217  488:astore          5
		{
			throwable.printStackTrace();
	//  218  490:aload           5
	//  219  492:invokevirtual   #219 <Method void Throwable.printStackTrace()>
			return;
	//  220  495:return          
		}
		i = 0;
		j = a();
		if(e == null || e.size() < 2)
		{
			gl.a().a(((android.os.Handler) (gk.g(a))), d, "\u8F68\u8FF9\u70B9\u592A\u5C11\u6216\u8DDD\u79BB\u592A\u8FD1,\u8F68\u8FF9\u7EA0\u504F\u5931\u8D25");
			return;
		}
		obj = ((Object) (e.iterator()));
_L2:
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break MISSING_BLOCK_LABEL_137;
			tracelocation = ((TraceLocation)((Iterator) (obj)).next()).copy();
		} while(tracelocation == null);
		if(tracelocation.getLatitude() <= 0.0D || tracelocation.getLongitude() <= 0.0D) goto _L2; else goto _L1
_L1:
		b.add(((Object) (tracelocation)));
		  goto _L2
		l = b.size();
		k = 500;
		l = (l - 2) / 500;
		gl.a().a(f, d, l, j);
_L4:
		if(i > l)
			break; /* Loop/switch isn't completed */
		j = k;
		if(i != l)
			break MISSING_BLOCK_LABEL_203;
		j = b.size();
		obj = ((Object) (new ArrayList()));
		for(k = 0; k >= j; k++)
			break MISSING_BLOCK_LABEL_379;

	//  221  496:goto            72
	//  222  499:iload_3         
	//  223  500:iconst_1        
	//  224  501:iadd            
	//  225  502:istore_3        
		tracelocation = (TraceLocation)b.remove(0);
		if(tracelocation == null)
			break MISSING_BLOCK_LABEL_499;
		if(c == 1)
			break MISSING_BLOCK_LABEL_366;
		if(c == 3)
		{
			gk.h(a).from(com.amap.api.maps.inateConverter.CoordType.BAIDU);
			break MISSING_BLOCK_LABEL_297;
		}
		if(c == 2)
			gk.h(a).from(com.amap.api.maps.inateConverter.CoordType.GPS);
		latlng = new LatLng(tracelocation.getLatitude(), tracelocation.getLongitude());
		gk.h(a).coord(latlng);
		latlng = gk.h(a).convert();
		if(latlng == null)
			break MISSING_BLOCK_LABEL_366;
		tracelocation.setLatitude(latlng.latitude);
		tracelocation.setLongitude(latlng.longitude);
		((List) (obj)).add(((Object) (tracelocation)));
		break MISSING_BLOCK_LABEL_499;
		k = j;
		if(((List) (obj)).size() < 2)
			continue; /* Loop/switch isn't completed */
		if(((List) (obj)).size() <= 500)
			break MISSING_BLOCK_LABEL_410;
		k = j;
		continue; /* Loop/switch isn't completed */
		obj = ((Object) (new gj(gk.i(a), ((android.os.Handler) (gk.g(a))), ((List) (obj)), c, f, d, i)));
		gk.j(a).execute(((Runnable) (obj)));
		i++;
		Thread.sleep(50L);
		break MISSING_BLOCK_LABEL_482;
		interruptedexception;
		interruptedexception.printStackTrace();
		k = j;
		if(true) goto _L4; else goto _L3
_L3:
	//* 226  503:goto            214
	}

	final gk a;
	private List b;
	private int c;
	private int d;
	private List e;
	private String f;
	private TraceListener g;

	public gk$a(gk gk1, int i, List list, int j, TraceListener tracelistener)
	{
		a = gk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field gk a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #28  <Method void Object()>
		b = ((List) (new ArrayList()));
	//    5    9:aload_0         
	//    6   10:new             #30  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #31  <Method void ArrayList()>
	//    9   17:putfield        #33  <Field List b>
		c = j;
	//   10   20:aload_0         
	//   11   21:iload           4
	//   12   23:putfield        #35  <Field int c>
		d = i;
	//   13   26:aload_0         
	//   14   27:iload_2         
	//   15   28:putfield        #37  <Field int d>
		e = list;
	//   16   31:aload_0         
	//   17   32:aload_3         
	//   18   33:putfield        #39  <Field List e>
		f = ev.a();
	//   19   36:aload_0         
	//   20   37:invokestatic    #44  <Method String ev.a()>
	//   21   40:putfield        #46  <Field String f>
		g = tracelistener;
	//   22   43:aload_0         
	//   23   44:aload           5
	//   24   46:putfield        #48  <Field TraceListener g>
	//   25   49:return          
	}
}
