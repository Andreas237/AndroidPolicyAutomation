// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.location.Location;
import android.os.*;
import android.util.Log;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.*;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			er, ax, ev, gl, 
//			gj

public class gk
	implements com.amap.api.maps.LocationSource.OnLocationChangedListener, LBSTraceBase
{
	class a
		implements Runnable
	{

		private int a()
		{
			int i1 = 0;
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
						i1 += a(((List) (arraylist)));
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
			return i1;
		//   49  111:iload_1         
		//   50  112:ireturn         
		}

		private int a(List list)
		{
			int i1 = list.size();
		//    0    0:aload_1         
		//    1    1:invokeinterface #57  <Method int List.size()>
		//    2    6:istore_2        
			if(i1 <= 1)
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
			list = ((List) ((TraceLocation)list.get(i1 - 1)));
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
			int k1;
			int i1;
			int j1;
			int l1;
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
		//*  26   57:invokevirtual   #125 <Method void gl.a(Handler, int, String)>
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
		//* 184  418:invokestatic    #194 <Method Context gk.i(gk)>
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
		//* 196  443:invokespecial   #197 <Method void gj(Context, Handler, List, int, String, int, int)>
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
			i1 = 0;
			j1 = a();
			if(e == null || e.size() < 2)
			{
				gl.a().a(((Handler) (gk.g(a))), d, "\u8F68\u8FF9\u70B9\u592A\u5C11\u6216\u8DDD\u79BB\u592A\u8FD1,\u8F68\u8FF9\u7EA0\u504F\u5931\u8D25");
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
			l1 = b.size();
			k1 = 500;
			l1 = (l1 - 2) / 500;
			gl.a().a(f, d, l1, j1);
_L4:
			if(i1 > l1)
				break; /* Loop/switch isn't completed */
			j1 = k1;
			if(i1 != l1)
				break MISSING_BLOCK_LABEL_203;
			j1 = b.size();
			obj = ((Object) (new ArrayList()));
			for(k1 = 0; k1 >= j1; k1++)
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
				gk.h(a).from(com.amap.api.maps.CoordinateConverter.CoordType.BAIDU);
				break MISSING_BLOCK_LABEL_297;
			}
			if(c == 2)
				gk.h(a).from(com.amap.api.maps.CoordinateConverter.CoordType.GPS);
			latlng = new LatLng(tracelocation.getLatitude(), tracelocation.getLongitude());
			gk.h(a).coord(latlng);
			latlng = gk.h(a).convert();
			if(latlng == null)
				break MISSING_BLOCK_LABEL_366;
			tracelocation.setLatitude(latlng.latitude);
			tracelocation.setLongitude(latlng.longitude);
			((List) (obj)).add(((Object) (tracelocation)));
			break MISSING_BLOCK_LABEL_499;
			k1 = j1;
			if(((List) (obj)).size() < 2)
				continue; /* Loop/switch isn't completed */
			if(((List) (obj)).size() <= 500)
				break MISSING_BLOCK_LABEL_410;
			k1 = j1;
			continue; /* Loop/switch isn't completed */
			obj = ((Object) (new gj(gk.i(a), ((Handler) (gk.g(a))), ((List) (obj)), c, f, d, i1)));
			gk.j(a).execute(((Runnable) (obj)));
			i1++;
			Thread.sleep(50L);
			break MISSING_BLOCK_LABEL_482;
			interruptedexception;
			interruptedexception.printStackTrace();
			k1 = j1;
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

		public a(int i1, List list, int j1, TraceListener tracelistener)
		{
			a = gk.this;
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
			c = j1;
		//   10   20:aload_0         
		//   11   21:iload           4
		//   12   23:putfield        #35  <Field int c>
			d = i1;
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

	class b
		implements TraceListener
	{

		private void a(int i1, List list)
		{
			List list1 = gk.a(a);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field gk a>
		//    2    4:invokestatic    #31  <Method List gk.a(gk)>
		//    3    7:astore_3        
			list1;
		//    4    8:aload_3         
			JVM INSTR monitorenter ;
		//    5    9:monitorenter    
			gk.a(a).clear();
		//    6   10:aload_0         
		//    7   11:getfield        #17  <Field gk a>
		//    8   14:invokestatic    #31  <Method List gk.a(gk)>
		//    9   17:invokeinterface #36  <Method void List.clear()>
			gk.a(a).addAll(((java.util.Collection) (list)));
		//   10   22:aload_0         
		//   11   23:getfield        #17  <Field gk a>
		//   12   26:invokestatic    #31  <Method List gk.a(gk)>
		//   13   29:aload_2         
		//   14   30:invokeinterface #40  <Method boolean List.addAll(java.util.Collection)>
		//   15   35:pop             
			list1;
		//   16   36:aload_3         
			JVM INSTR monitorexit ;
		//   17   37:monitorexit     
			  goto _L1
		//*  18   38:goto            46
			list;
		//   19   41:astore_2        
		//*  20   42:aload_3         
			throw list;
		//   21   43:monitorexit     
		//   22   44:aload_2         
		//   23   45:athrow          
_L1:
			gk.c(a).clear();
		//   24   46:aload_0         
		//   25   47:getfield        #17  <Field gk a>
		//   26   50:invokestatic    #43  <Method List gk.c(gk)>
		//   27   53:invokeinterface #36  <Method void List.clear()>
			if(i1 == 0)
		//*  28   58:iload_1         
		//*  29   59:ifne            85
			{
				try
				{
					gk.c(a).addAll(((java.util.Collection) (gk.a(a))));
		//   30   62:aload_0         
		//   31   63:getfield        #17  <Field gk a>
		//   32   66:invokestatic    #43  <Method List gk.c(gk)>
		//   33   69:aload_0         
		//   34   70:getfield        #17  <Field gk a>
		//   35   73:invokestatic    #31  <Method List gk.a(gk)>
		//   36   76:invokeinterface #40  <Method boolean List.addAll(java.util.Collection)>
		//   37   81:pop             
				}
		//*  38   82:goto            125
		//*  39   85:aload_0         
		//*  40   86:getfield        #17  <Field gk a>
		//*  41   89:invokestatic    #43  <Method List gk.c(gk)>
		//*  42   92:aload_0         
		//*  43   93:getfield        #17  <Field gk a>
		//*  44   96:invokestatic    #46  <Method List gk.d(gk)>
		//*  45   99:invokeinterface #40  <Method boolean List.addAll(java.util.Collection)>
		//*  46  104:pop             
		//*  47  105:aload_0         
		//*  48  106:getfield        #17  <Field gk a>
		//*  49  109:invokestatic    #43  <Method List gk.c(gk)>
		//*  50  112:aload_0         
		//*  51  113:getfield        #17  <Field gk a>
		//*  52  116:invokestatic    #31  <Method List gk.a(gk)>
		//*  53  119:invokeinterface #40  <Method boolean List.addAll(java.util.Collection)>
		//*  54  124:pop             
		//*  55  125:aload_0         
		//*  56  126:getfield        #17  <Field gk a>
		//*  57  129:invokestatic    #50  <Method TraceStatusListener gk.f(gk)>
		//*  58  132:aload_0         
		//*  59  133:getfield        #17  <Field gk a>
		//*  60  136:invokestatic    #53  <Method List gk.e(gk)>
		//*  61  139:aload_0         
		//*  62  140:getfield        #17  <Field gk a>
		//*  63  143:invokestatic    #43  <Method List gk.c(gk)>
		//*  64  146:ldc1            #55  <String "\u7EA0\u504F\u6210\u529F">
		//*  65  148:invokeinterface #61  <Method void TraceStatusListener.onTraceStatus(List, List, String)>
		//*  66  153:return          
				// Misplaced declaration of an exception variable
				catch(List list)
		//*  67  154:astore_2        
				{
					((Throwable) (list)).printStackTrace();
		//   68  155:aload_2         
		//   69  156:invokevirtual   #64  <Method void Throwable.printStackTrace()>
					return;
		//   70  159:return          
				}
				break MISSING_BLOCK_LABEL_125;
			}
			gk.c(a).addAll(((java.util.Collection) (gk.d(a))));
			gk.c(a).addAll(((java.util.Collection) (gk.a(a))));
			gk.f(a).onTraceStatus(gk.e(a), gk.c(a), "\u7EA0\u504F\u6210\u529F");
			return;
		}

		public void onFinished(int i1, List list, int j1, int k1)
		{
			a(i1, list);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #69  <Method void a(int, List)>
		//    4    6:return          
		}

		public void onRequestFailed(int i1, String s1)
		{
			s1 = ((String) (new ArrayList()));
		//    0    0:new             #74  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #75  <Method void ArrayList()>
		//    3    7:astore_2        
			if(gk.a(a) != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #17  <Field gk a>
		//*   6   12:invokestatic    #31  <Method List gk.a(gk)>
		//*   7   15:ifnull          32
				((List) (s1)).addAll(((java.util.Collection) (gk.a(a))));
		//    8   18:aload_2         
		//    9   19:aload_0         
		//   10   20:getfield        #17  <Field gk a>
		//   11   23:invokestatic    #31  <Method List gk.a(gk)>
		//   12   26:invokeinterface #40  <Method boolean List.addAll(java.util.Collection)>
		//   13   31:pop             
			if(b != null)
		//*  14   32:aload_0         
		//*  15   33:getfield        #22  <Field List b>
		//*  16   36:ifnull          137
			{
				int k1 = b.size();
		//   17   39:aload_0         
		//   18   40:getfield        #22  <Field List b>
		//   19   43:invokeinterface #79  <Method int List.size()>
		//   20   48:istore          4
				if(b.size() > gk.b(a))
		//*  21   50:aload_0         
		//*  22   51:getfield        #22  <Field List b>
		//*  23   54:invokeinterface #79  <Method int List.size()>
		//*  24   59:aload_0         
		//*  25   60:getfield        #17  <Field gk a>
		//*  26   63:invokestatic    #82  <Method int gk.b(gk)>
		//*  27   66:icmple          137
				{
					for(int j1 = k1 - gk.b(a); j1 < k1; j1++)
		//*  28   69:iload           4
		//*  29   71:aload_0         
		//*  30   72:getfield        #17  <Field gk a>
		//*  31   75:invokestatic    #82  <Method int gk.b(gk)>
		//*  32   78:isub            
		//*  33   79:istore_3        
		//*  34   80:iload_3         
		//*  35   81:iload           4
		//*  36   83:icmpge          137
					{
						TraceLocation tracelocation = (TraceLocation)b.get(j1);
		//   37   86:aload_0         
		//   38   87:getfield        #22  <Field List b>
		//   39   90:iload_3         
		//   40   91:invokeinterface #86  <Method Object List.get(int)>
		//   41   96:checkcast       #88  <Class TraceLocation>
		//   42   99:astore          5
						if(tracelocation != null)
		//*  43  101:aload           5
		//*  44  103:ifnull          130
							((List) (s1)).add(((Object) (new LatLng(tracelocation.getLatitude(), tracelocation.getLongitude()))));
		//   45  106:aload_2         
		//   46  107:new             #90  <Class LatLng>
		//   47  110:dup             
		//   48  111:aload           5
		//   49  113:invokevirtual   #94  <Method double TraceLocation.getLatitude()>
		//   50  116:aload           5
		//   51  118:invokevirtual   #97  <Method double TraceLocation.getLongitude()>
		//   52  121:invokespecial   #100 <Method void LatLng(double, double)>
		//   53  124:invokeinterface #104 <Method boolean List.add(Object)>
		//   54  129:pop             
					}

		//   55  130:iload_3         
		//   56  131:iconst_1        
		//   57  132:iadd            
		//   58  133:istore_3        
				}
			}
		//*  59  134:goto            80
			a(i1, ((List) (s1)));
		//   60  137:aload_0         
		//   61  138:iload_1         
		//   62  139:aload_2         
		//   63  140:invokespecial   #69  <Method void a(int, List)>
		//   64  143:return          
		}

		public void onTraceProcessing(int i1, int j1, List list)
		{
		//    0    0:return          
		}

		final gk a;
		private final List b;

		public b(List list)
		{
			a = gk.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field gk a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			b = list;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field List b>
		//    8   14:return          
		}
	}

	static class c extends Handler
	{

		public void a(TraceListener tracelistener)
		{
			a = tracelistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field TraceListener a>
		//    3    5:return          
		}

		public void handleMessage(Message message)
		{
			Object obj = ((Object) (a));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field TraceListener a>
		//    2    4:astore_3        
			if(obj == null)
		//*   3    5:aload_3         
		//*   4    6:ifnonnull       10
				return;
		//    5    9:return          
			obj = ((Object) (message.getData()));
		//    6   10:aload_1         
		//    7   11:invokevirtual   #27  <Method Bundle Message.getData()>
		//    8   14:astore_3        
			if(obj == null)
		//*   9   15:aload_3         
		//*  10   16:ifnonnull       20
				return;
		//   11   19:return          
			int i1 = ((Bundle) (obj)).getInt("lineID");
		//   12   20:aload_3         
		//   13   21:ldc1            #29  <String "lineID">
		//   14   23:invokevirtual   #35  <Method int Bundle.getInt(String)>
		//   15   26:istore_2        
			message.what;
		//   16   27:aload_1         
		//   17   28:getfield        #39  <Field int Message.what>
			JVM INSTR tableswitch 100 102: default 138
		//		               100 56
		//		               101 82
		//		               102 112;
		//   18   31:tableswitch     100 102: default 138
		//		               100 56
		//		               101 82
		//		               102 112
			   goto _L1 _L2 _L3 _L4
_L1:
			break MISSING_BLOCK_LABEL_138;
_L2:
			List list = (List)message.obj;
		//   19   56:aload_1         
		//   20   57:getfield        #43  <Field Object Message.obj>
		//   21   60:checkcast       #45  <Class List>
		//   22   63:astore_3        
			a.onTraceProcessing(i1, message.arg1, list);
		//   23   64:aload_0         
		//   24   65:getfield        #17  <Field TraceListener a>
		//   25   68:iload_2         
		//   26   69:aload_1         
		//   27   70:getfield        #48  <Field int Message.arg1>
		//   28   73:aload_3         
		//   29   74:invokeinterface #54  <Method void TraceListener.onTraceProcessing(int, int, List)>
			break; /* Loop/switch isn't completed */
		//   30   79:goto            131
_L3:
			try
			{
				List list1 = (List)message.obj;
		//   31   82:aload_1         
		//   32   83:getfield        #43  <Field Object Message.obj>
		//   33   86:checkcast       #45  <Class List>
		//   34   89:astore_3        
				a.onFinished(i1, list1, message.arg1, message.arg2);
		//   35   90:aload_0         
		//   36   91:getfield        #17  <Field TraceListener a>
		//   37   94:iload_2         
		//   38   95:aload_3         
		//   39   96:aload_1         
		//   40   97:getfield        #48  <Field int Message.arg1>
		//   41  100:aload_1         
		//   42  101:getfield        #57  <Field int Message.arg2>
		//   43  104:invokeinterface #61  <Method void TraceListener.onFinished(int, List, int, int)>
				break; /* Loop/switch isn't completed */
		//   44  109:goto            131
			}
		//*  45  112:aload_1         
		//*  46  113:getfield        #43  <Field Object Message.obj>
		//*  47  116:checkcast       #63  <Class String>
		//*  48  119:astore_1        
		//*  49  120:aload_0         
		//*  50  121:getfield        #17  <Field TraceListener a>
		//*  51  124:iload_2         
		//*  52  125:aload_1         
		//*  53  126:invokeinterface #67  <Method void TraceListener.onRequestFailed(int, String)>
		//*  54  131:return          
			// Misplaced declaration of an exception variable
			catch(Message message)
		//*  55  132:astore_1        
			{
				((Throwable) (message)).printStackTrace();
		//   56  133:aload_1         
		//   57  134:invokevirtual   #71  <Method void Throwable.printStackTrace()>
			}
			break MISSING_BLOCK_LABEL_137;
_L4:
			message = ((Message) ((String)message.obj));
			a.onRequestFailed(i1, ((String) (message)));
			return;
			return;
		//   58  137:return          
		//   59  138:return          
		}

		private TraceListener a;

		public c(Looper looper)
		{
			super(looper);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void Handler(Looper)>
		//    3    5:return          
		}
	}


	public gk(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		f = 2000L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #65  <Long 2000L>
	//    4    8:putfield        #68  <Field long f>
		g = 5;
	//    5   11:aload_0         
	//    6   12:iconst_5        
	//    7   13:putfield        #70  <Field int g>
		j = ((List) (new ArrayList()));
	//    8   16:aload_0         
	//    9   17:new             #72  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #73  <Method void ArrayList()>
	//   12   24:putfield        #75  <Field List j>
		k = 0;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #77  <Field int k>
		l = 0;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #79  <Field int l>
		m = 0L;
	//   19   37:aload_0         
	//   20   38:lconst_0        
	//   21   39:putfield        #81  <Field long m>
		o = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #83  <Field TraceLocation o>
		p = ((List) (new ArrayList()));
	//   25   47:aload_0         
	//   26   48:new             #72  <Class ArrayList>
	//   27   51:dup             
	//   28   52:invokespecial   #73  <Method void ArrayList()>
	//   29   55:putfield        #85  <Field List p>
		q = ((List) (new ArrayList()));
	//   30   58:aload_0         
	//   31   59:new             #72  <Class ArrayList>
	//   32   62:dup             
	//   33   63:invokespecial   #73  <Method void ArrayList()>
	//   34   66:putfield        #87  <Field List q>
		r = ((List) (new ArrayList()));
	//   35   69:aload_0         
	//   36   70:new             #72  <Class ArrayList>
	//   37   73:dup             
	//   38   74:invokespecial   #73  <Method void ArrayList()>
	//   39   77:putfield        #89  <Field List r>
		a = Runtime.getRuntime().availableProcessors();
	//   40   80:aload_0         
	//   41   81:invokestatic    #95  <Method Runtime Runtime.getRuntime()>
	//   42   84:invokevirtual   #99  <Method int Runtime.availableProcessors()>
	//   43   87:putfield        #101 <Field int a>
		t = ((BlockingQueue) (new LinkedBlockingQueue()));
	//   44   90:aload_0         
	//   45   91:new             #103 <Class LinkedBlockingQueue>
	//   46   94:dup             
	//   47   95:invokespecial   #104 <Method void LinkedBlockingQueue()>
	//   48   98:putfield        #106 <Field BlockingQueue t>
		u = ((BlockingQueue) (new LinkedBlockingQueue()));
	//   49  101:aload_0         
	//   50  102:new             #103 <Class LinkedBlockingQueue>
	//   51  105:dup             
	//   52  106:invokespecial   #104 <Method void LinkedBlockingQueue()>
	//   53  109:putfield        #108 <Field BlockingQueue u>
		b = context.getApplicationContext();
	//   54  112:aload_0         
	//   55  113:aload_1         
	//   56  114:invokevirtual   #114 <Method Context Context.getApplicationContext()>
	//   57  117:putfield        #116 <Field Context b>
		c = new CoordinateConverter(b);
	//   58  120:aload_0         
	//   59  121:new             #118 <Class CoordinateConverter>
	//   60  124:dup             
	//   61  125:aload_0         
	//   62  126:getfield        #116 <Field Context b>
	//   63  129:invokespecial   #120 <Method void CoordinateConverter(Context)>
	//   64  132:putfield        #122 <Field CoordinateConverter c>
		n = new c(Looper.getMainLooper());
	//   65  135:aload_0         
	//   66  136:new             #16  <Class gk$c>
	//   67  139:dup             
	//   68  140:invokestatic    #128 <Method Looper Looper.getMainLooper()>
	//   69  143:invokespecial   #131 <Method void gk$c(Looper)>
	//   70  146:putfield        #133 <Field gk$c n>
		d = ((ExecutorService) (new ThreadPoolExecutor(1, a * 2, 1L, s, t, ((java.util.concurrent.ThreadFactory) (new er("AMapTraceManagerProcess"))), ((java.util.concurrent.RejectedExecutionHandler) (new java.util.concurrent.ThreadPoolExecutor.AbortPolicy())))));
	//   71  149:aload_0         
	//   72  150:new             #135 <Class ThreadPoolExecutor>
	//   73  153:dup             
	//   74  154:iconst_1        
	//   75  155:aload_0         
	//   76  156:getfield        #101 <Field int a>
	//   77  159:iconst_2        
	//   78  160:imul            
	//   79  161:lconst_1        
	//   80  162:getstatic       #59  <Field TimeUnit s>
	//   81  165:aload_0         
	//   82  166:getfield        #106 <Field BlockingQueue t>
	//   83  169:new             #137 <Class er>
	//   84  172:dup             
	//   85  173:ldc1            #139 <String "AMapTraceManagerProcess">
	//   86  175:invokespecial   #142 <Method void er(String)>
	//   87  178:new             #144 <Class java.util.concurrent.ThreadPoolExecutor$AbortPolicy>
	//   88  181:dup             
	//   89  182:invokespecial   #145 <Method void java.util.concurrent.ThreadPoolExecutor$AbortPolicy()>
	//   90  185:invokespecial   #148 <Method void ThreadPoolExecutor(int, int, long, TimeUnit, BlockingQueue, java.util.concurrent.ThreadFactory, java.util.concurrent.RejectedExecutionHandler)>
	//   91  188:putfield        #150 <Field ExecutorService d>
		e = ((ExecutorService) (new ThreadPoolExecutor(1, a * 2, 1L, s, u, ((java.util.concurrent.ThreadFactory) (new er("AMapTraceManagerRequest"))), ((java.util.concurrent.RejectedExecutionHandler) (new java.util.concurrent.ThreadPoolExecutor.AbortPolicy())))));
	//   92  191:aload_0         
	//   93  192:new             #135 <Class ThreadPoolExecutor>
	//   94  195:dup             
	//   95  196:iconst_1        
	//   96  197:aload_0         
	//   97  198:getfield        #101 <Field int a>
	//   98  201:iconst_2        
	//   99  202:imul            
	//  100  203:lconst_1        
	//  101  204:getstatic       #59  <Field TimeUnit s>
	//  102  207:aload_0         
	//  103  208:getfield        #108 <Field BlockingQueue u>
	//  104  211:new             #137 <Class er>
	//  105  214:dup             
	//  106  215:ldc1            #152 <String "AMapTraceManagerRequest">
	//  107  217:invokespecial   #142 <Method void er(String)>
	//  108  220:new             #144 <Class java.util.concurrent.ThreadPoolExecutor$AbortPolicy>
	//  109  223:dup             
	//  110  224:invokespecial   #145 <Method void java.util.concurrent.ThreadPoolExecutor$AbortPolicy()>
	//  111  227:invokespecial   #148 <Method void ThreadPoolExecutor(int, int, long, TimeUnit, BlockingQueue, java.util.concurrent.ThreadFactory, java.util.concurrent.RejectedExecutionHandler)>
	//  112  230:putfield        #154 <Field ExecutorService e>
	//  113  233:return          
	}

	private double a(double d1, double d2, double d3, double d4)
	{
		if(d1 > d3)
	//*   0    0:dload_1         
	//*   1    1:dload           5
	//*   2    3:dcmpl           
	//*   3    4:ifle            15
			d1 -= d3;
	//    4    7:dload_1         
	//    5    8:dload           5
	//    6   10:dsub            
	//    7   11:dstore_1        
		else
	//*   8   12:goto            20
			d1 = d3 - d1;
	//    9   15:dload           5
	//   10   17:dload_1         
	//   11   18:dsub            
	//   12   19:dstore_1        
		if(d2 > d4)
	//*  13   20:dload_3         
	//*  14   21:dload           7
	//*  15   23:dcmpl           
	//*  16   24:ifle            35
			d2 -= d4;
	//   17   27:dload_3         
	//   18   28:dload           7
	//   19   30:dsub            
	//   20   31:dstore_3        
		else
	//*  21   32:goto            40
			d2 = d4 - d2;
	//   22   35:dload           7
	//   23   37:dload_3         
	//   24   38:dsub            
	//   25   39:dstore_3        
		return Math.sqrt(d1 * d1 + d2 * d2);
	//   26   40:dload_1         
	//   27   41:dload_1         
	//   28   42:dmul            
	//   29   43:dload_3         
	//   30   44:dload_3         
	//   31   45:dmul            
	//   32   46:dadd            
	//   33   47:invokestatic    #161 <Method double Math.sqrt(double)>
	//   34   50:dreturn         
	}

	static List a(gk gk1)
	{
		return gk1.r;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field List r>
	//    2    4:areturn         
	}

	private void a()
	{
		int i1 = j.size();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field List j>
	//    2    4:invokeinterface #167 <Method int List.size()>
	//    3    9:istore_1        
		if(i1 < g)
	//*   4   10:iload_1         
	//*   5   11:aload_0         
	//*   6   12:getfield        #70  <Field int g>
	//*   7   15:icmpge          19
			return;
	//    8   18:return          
		if(i1 <= 50)
	//*   9   19:iload_1         
	//*  10   20:bipush          50
	//*  11   22:icmpgt          54
		{
			ArrayList arraylist = new ArrayList(((java.util.Collection) (j)));
	//   12   25:new             #72  <Class ArrayList>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:getfield        #75  <Field List j>
	//   16   33:invokespecial   #170 <Method void ArrayList(java.util.Collection)>
	//   17   36:astore_3        
			queryProcessedTrace(0, ((List) (arraylist)), 1, ((TraceListener) (new b(((List) (arraylist))))));
	//   18   37:aload_0         
	//   19   38:iconst_0        
	//   20   39:aload_3         
	//   21   40:iconst_1        
	//   22   41:new             #13  <Class gk$b>
	//   23   44:dup             
	//   24   45:aload_0         
	//   25   46:aload_3         
	//   26   47:invokespecial   #173 <Method void gk$b(gk, List)>
	//   27   50:invokevirtual   #177 <Method void queryProcessedTrace(int, List, int, TraceListener)>
			return;
	//   28   53:return          
		}
		int j1 = i1 - 50;
	//   29   54:iload_1         
	//   30   55:bipush          50
	//   31   57:isub            
	//   32   58:istore_2        
		if(j1 < 0)
	//*  33   59:iload_2         
	//*  34   60:ifge            64
		{
			return;
	//   35   63:return          
		} else
		{
			a(((List) (new ArrayList(((java.util.Collection) (j.subList(j1 - g, j1)))))));
	//   36   64:aload_0         
	//   37   65:new             #72  <Class ArrayList>
	//   38   68:dup             
	//   39   69:aload_0         
	//   40   70:getfield        #75  <Field List j>
	//   41   73:iload_2         
	//   42   74:aload_0         
	//   43   75:getfield        #70  <Field int g>
	//   44   78:isub            
	//   45   79:iload_2         
	//   46   80:invokeinterface #181 <Method List List.subList(int, int)>
	//   47   85:invokespecial   #170 <Method void ArrayList(java.util.Collection)>
	//   48   88:invokespecial   #184 <Method void a(List)>
			ArrayList arraylist1 = new ArrayList(((java.util.Collection) (j.subList(j1, i1))));
	//   49   91:new             #72  <Class ArrayList>
	//   50   94:dup             
	//   51   95:aload_0         
	//   52   96:getfield        #75  <Field List j>
	//   53   99:iload_2         
	//   54  100:iload_1         
	//   55  101:invokeinterface #181 <Method List List.subList(int, int)>
	//   56  106:invokespecial   #170 <Method void ArrayList(java.util.Collection)>
	//   57  109:astore_3        
			queryProcessedTrace(j1, ((List) (arraylist1)), 1, ((TraceListener) (new b(((List) (arraylist1))))));
	//   58  110:aload_0         
	//   59  111:iload_2         
	//   60  112:aload_3         
	//   61  113:iconst_1        
	//   62  114:new             #13  <Class gk$b>
	//   63  117:dup             
	//   64  118:aload_0         
	//   65  119:aload_3         
	//   66  120:invokespecial   #173 <Method void gk$b(gk, List)>
	//   67  123:invokevirtual   #177 <Method void queryProcessedTrace(int, List, int, TraceListener)>
			return;
	//   68  126:return          
		}
	}

	private void a(List list)
	{
		List list1 = r;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field List r>
	//    2    4:astore          8
		list1;
	//    3    6:aload           8
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(list == null)
			break MISSING_BLOCK_LABEL_27;
	//    5    9:aload_1         
	//    6   10:ifnull          27
		int i1 = list.size();
	//    7   13:aload_1         
	//    8   14:invokeinterface #167 <Method int List.size()>
	//    9   19:istore          6
		if(i1 >= 1)
			break MISSING_BLOCK_LABEL_31;
	//   10   21:iload           6
	//   11   23:iconst_1        
	//   12   24:icmpge          31
		list1;
	//   13   27:aload           8
		JVM INSTR monitorexit ;
	//   14   29:monitorexit     
		return;
	//   15   30:return          
		i1 = r.size();
	//   16   31:aload_0         
	//   17   32:getfield        #89  <Field List r>
	//   18   35:invokeinterface #167 <Method int List.size()>
	//   19   40:istore          6
		if(i1 >= 1)
			break MISSING_BLOCK_LABEL_52;
	//   20   42:iload           6
	//   21   44:iconst_1        
	//   22   45:icmpge          52
		list1;
	//   23   48:aload           8
		JVM INSTR monitorexit ;
	//   24   50:monitorexit     
		return;
	//   25   51:return          
		double d1;
		Object obj;
		d1 = 0.0D;
	//   26   52:dconst_0        
	//   27   53:dstore_2        
		obj = null;
	//   28   54:aconst_null     
	//   29   55:astore          7
		Iterator iterator = list.iterator();
	//   30   57:aload_1         
	//   31   58:invokeinterface #188 <Method Iterator List.iterator()>
	//   32   63:astore          9
		list = ((List) (obj));
	//   33   65:aload           7
	//   34   67:astore_1        
_L6:
		if(iterator.hasNext())
	//*  35   68:aload           9
	//*  36   70:invokeinterface #194 <Method boolean Iterator.hasNext()>
	//*  37   75:ifeq            134
		{
			obj = ((Object) ((TraceLocation)iterator.next()));
	//   38   78:aload           9
	//   39   80:invokeinterface #198 <Method Object Iterator.next()>
	//   40   85:checkcast       #200 <Class TraceLocation>
	//   41   88:astore          7
			break MISSING_BLOCK_LABEL_90;
		}
		  goto _L1
	//*  42   90:aload           7
	//*  43   92:ifnonnull       282
	//*  44   95:goto            68
_L4:
		double d2 = a(((TraceLocation) (list)).getLatitude(), ((TraceLocation) (list)).getLongitude(), ((TraceLocation) (obj)).getLatitude(), ((TraceLocation) (obj)).getLongitude());
	//   45   98:aload_0         
	//   46   99:aload_1         
	//   47  100:invokevirtual   #204 <Method double TraceLocation.getLatitude()>
	//   48  103:aload_1         
	//   49  104:invokevirtual   #207 <Method double TraceLocation.getLongitude()>
	//   50  107:aload           7
	//   51  109:invokevirtual   #204 <Method double TraceLocation.getLatitude()>
	//   52  112:aload           7
	//   53  114:invokevirtual   #207 <Method double TraceLocation.getLongitude()>
	//   54  117:invokespecial   #209 <Method double a(double, double, double, double)>
	//   55  120:dstore          4
		if(d2 > 100D)
	//*  56  122:dload           4
	//*  57  124:ldc2w           #210 <Double 100D>
	//*  58  127:dcmpl           
	//*  59  128:ifle            289
			continue; /* Loop/switch isn't completed */
	//   60  131:goto            68
		break; /* Loop/switch isn't completed */
_L1:
		d2 = 0.0D;
	//   61  134:dconst_0        
	//   62  135:dstore          4
		list = null;
	//   63  137:aconst_null     
	//   64  138:astore_1        
		iterator1 = r.iterator();
	//   65  139:aload_0         
	//   66  140:getfield        #89  <Field List r>
	//   67  143:invokeinterface #188 <Method Iterator List.iterator()>
	//   68  148:astore          9
_L2:
		if(!iterator1.hasNext())
			break MISSING_BLOCK_LABEL_272;
	//   69  150:aload           9
	//   70  152:invokeinterface #194 <Method boolean Iterator.hasNext()>
	//   71  157:ifeq            272
		obj = ((Object) ((LatLng)iterator1.next()));
	//   72  160:aload           9
	//   73  162:invokeinterface #198 <Method Object Iterator.next()>
	//   74  167:checkcast       #213 <Class LatLng>
	//   75  170:astore          7
		if(obj != null)
			break MISSING_BLOCK_LABEL_187;
	//   76  172:aload           7
	//   77  174:ifnonnull       187
		iterator1.remove();
	//   78  177:aload           9
	//   79  179:invokeinterface #216 <Method void Iterator.remove()>
		  goto _L2
	//*  80  184:goto            150
		if(list != null)
			break MISSING_BLOCK_LABEL_213;
	//   81  187:aload_1         
	//   82  188:ifnonnull       213
		p.add(obj);
	//   83  191:aload_0         
	//   84  192:getfield        #85  <Field List p>
	//   85  195:aload           7
	//   86  197:invokeinterface #220 <Method boolean List.add(Object)>
	//   87  202:pop             
		iterator1.remove();
	//   88  203:aload           9
	//   89  205:invokeinterface #216 <Method void Iterator.remove()>
		break MISSING_BLOCK_LABEL_266;
	//   90  210:goto            266
		d2 += a(((LatLng) (list)).latitude, ((LatLng) (list)).longitude, ((LatLng) (obj)).latitude, ((LatLng) (obj)).longitude);
	//   91  213:dload           4
	//   92  215:aload_0         
	//   93  216:aload_1         
	//   94  217:getfield        #224 <Field double LatLng.latitude>
	//   95  220:aload_1         
	//   96  221:getfield        #227 <Field double LatLng.longitude>
	//   97  224:aload           7
	//   98  226:getfield        #224 <Field double LatLng.latitude>
	//   99  229:aload           7
	//  100  231:getfield        #227 <Field double LatLng.longitude>
	//  101  234:invokespecial   #209 <Method double a(double, double, double, double)>
	//  102  237:dadd            
	//  103  238:dstore          4
		if(d2 >= d1)
			break MISSING_BLOCK_LABEL_272;
	//  104  240:dload           4
	//  105  242:dload_2         
	//  106  243:dcmpg           
	//  107  244:ifge            272
		p.add(obj);
	//  108  247:aload_0         
	//  109  248:getfield        #85  <Field List p>
	//  110  251:aload           7
	//  111  253:invokeinterface #220 <Method boolean List.add(Object)>
	//  112  258:pop             
		iterator1.remove();
	//  113  259:aload           9
	//  114  261:invokeinterface #216 <Method void Iterator.remove()>
		list = ((List) (obj));
	//  115  266:aload           7
	//  116  268:astore_1        
		  goto _L2
	//* 117  269:goto            150
		list1;
	//  118  272:aload           8
		JVM INSTR monitorexit ;
	//  119  274:monitorexit     
		return;
	//  120  275:return          
		list;
	//  121  276:astore_1        
	//* 122  277:aload           8
		throw list;
	//  123  279:monitorexit     
	//  124  280:aload_1         
	//  125  281:athrow          
		Iterator iterator1;
		if(obj == null)
			continue; /* Loop/switch isn't completed */
		if(list == null)
	//* 126  282:aload_1         
	//* 127  283:ifnonnull       98
			break MISSING_BLOCK_LABEL_294;
	//  128  286:goto            294
		if(true) goto _L4; else goto _L3
_L3:
		d1 += d2;
	//  129  289:dload_2         
	//  130  290:dload           4
	//  131  292:dadd            
	//  132  293:dstore_2        
		list = ((List) (obj));
	//  133  294:aload           7
	//  134  296:astore_1        
		if(true) goto _L6; else goto _L5
	//  135  297:goto            68
_L5:
	}

	private boolean a(TraceLocation tracelocation, TraceLocation tracelocation1)
	{
		if(tracelocation == null || tracelocation1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		return tracelocation.getLatitude() == tracelocation1.getLatitude() && tracelocation.getLongitude() == tracelocation1.getLongitude();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #204 <Method double TraceLocation.getLatitude()>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #204 <Method double TraceLocation.getLatitude()>
	//   10   18:dcmpl           
	//   11   19:ifne            36
	//   12   22:aload_1         
	//   13   23:invokevirtual   #207 <Method double TraceLocation.getLongitude()>
	//   14   26:aload_2         
	//   15   27:invokevirtual   #207 <Method double TraceLocation.getLongitude()>
	//   16   30:dcmpl           
	//   17   31:ifne            36
	//   18   34:iconst_1        
	//   19   35:ireturn         
	//   20   36:iconst_0        
	//   21   37:ireturn         
	}

	static int b(gk gk1)
	{
		return gk1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int g>
	//    2    4:ireturn         
	}

	private void b()
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #233 <Field ax i>
	//*   2    4:ifnull          19
		{
			i.deactivate();
	//    3    7:aload_0         
	//    4    8:getfield        #233 <Field ax i>
	//    5   11:invokevirtual   #238 <Method void ax.deactivate()>
			i = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #233 <Field ax i>
		}
	//    9   19:return          
	}

	static List c(gk gk1)
	{
		return gk1.q;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field List q>
	//    2    4:areturn         
	}

	private void c()
	{
		t.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field BlockingQueue t>
	//    2    4:invokeinterface #243 <Method void BlockingQueue.clear()>
		u.clear();
	//    3    9:aload_0         
	//    4   10:getfield        #108 <Field BlockingQueue u>
	//    5   13:invokeinterface #243 <Method void BlockingQueue.clear()>
		if(j == null)
			break MISSING_BLOCK_LABEL_76;
	//    6   18:aload_0         
	//    7   19:getfield        #75  <Field List j>
	//    8   22:ifnull          76
		List list = j;
	//    9   25:aload_0         
	//   10   26:getfield        #75  <Field List j>
	//   11   29:astore_1        
		list;
	//   12   30:aload_1         
		JVM INSTR monitorenter ;
	//   13   31:monitorenter    
		if(j != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #75  <Field List j>
	//*  16   36:ifnull          48
			j.clear();
	//   17   39:aload_0         
	//   18   40:getfield        #75  <Field List j>
	//   19   43:invokeinterface #244 <Method void List.clear()>
		l = 0;
	//   20   48:aload_0         
	//   21   49:iconst_0        
	//   22   50:putfield        #79  <Field int l>
		k = 0;
	//   23   53:aload_0         
	//   24   54:iconst_0        
	//   25   55:putfield        #77  <Field int k>
		m = 0L;
	//   26   58:aload_0         
	//   27   59:lconst_0        
	//   28   60:putfield        #81  <Field long m>
		o = null;
	//   29   63:aload_0         
	//   30   64:aconst_null     
	//   31   65:putfield        #83  <Field TraceLocation o>
		list;
	//   32   68:aload_1         
		JVM INSTR monitorexit ;
	//   33   69:monitorexit     
		return;
	//   34   70:return          
		Exception exception;
		exception;
	//   35   71:astore_2        
	//*  36   72:aload_1         
		throw exception;
	//   37   73:monitorexit     
	//   38   74:aload_2         
	//   39   75:athrow          
	//   40   76:return          
	}

	static List d(gk gk1)
	{
		return gk1.p;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List p>
	//    2    4:areturn         
	}

	static List e(gk gk1)
	{
		return gk1.j;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field List j>
	//    2    4:areturn         
	}

	static TraceStatusListener f(gk gk1)
	{
		return gk1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field TraceStatusListener h>
	//    2    4:areturn         
	}

	static c g(gk gk1)
	{
		return gk1.n;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field gk$c n>
	//    2    4:areturn         
	}

	static CoordinateConverter h(gk gk1)
	{
		return gk1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field CoordinateConverter c>
	//    2    4:areturn         
	}

	static Context i(gk gk1)
	{
		return gk1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Context b>
	//    2    4:areturn         
	}

	static ExecutorService j(gk gk1)
	{
		return gk1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field ExecutorService e>
	//    2    4:areturn         
	}

	public void destroy()
	{
		try
		{
			stopTrace();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method void stopTrace()>
			if(d != null && !d.isShutdown())
	//*   2    4:aload_0         
	//*   3    5:getfield        #150 <Field ExecutorService d>
	//*   4    8:ifnull          38
	//*   5   11:aload_0         
	//*   6   12:getfield        #150 <Field ExecutorService d>
	//*   7   15:invokeinterface #262 <Method boolean ExecutorService.isShutdown()>
	//*   8   20:ifne            38
			{
				d.shutdownNow();
	//    9   23:aload_0         
	//   10   24:getfield        #150 <Field ExecutorService d>
	//   11   27:invokeinterface #266 <Method List ExecutorService.shutdownNow()>
	//   12   32:pop             
				d = null;
	//   13   33:aload_0         
	//   14   34:aconst_null     
	//   15   35:putfield        #150 <Field ExecutorService d>
			}
			if(e != null && !e.isShutdown())
	//*  16   38:aload_0         
	//*  17   39:getfield        #154 <Field ExecutorService e>
	//*  18   42:ifnull          72
	//*  19   45:aload_0         
	//*  20   46:getfield        #154 <Field ExecutorService e>
	//*  21   49:invokeinterface #262 <Method boolean ExecutorService.isShutdown()>
	//*  22   54:ifne            72
			{
				e.shutdownNow();
	//   23   57:aload_0         
	//   24   58:getfield        #154 <Field ExecutorService e>
	//   25   61:invokeinterface #266 <Method List ExecutorService.shutdownNow()>
	//   26   66:pop             
				e = null;
	//   27   67:aload_0         
	//   28   68:aconst_null     
	//   29   69:putfield        #154 <Field ExecutorService e>
			}
			j = null;
	//   30   72:aload_0         
	//   31   73:aconst_null     
	//   32   74:putfield        #75  <Field List j>
			h = null;
	//   33   77:aload_0         
	//   34   78:aconst_null     
	//   35   79:putfield        #247 <Field TraceStatusListener h>
		}
	//*  36   82:goto            90
		catch(Throwable throwable)
	//*  37   85:astore_1        
		{
			throwable.printStackTrace();
	//   38   86:aload_1         
	//   39   87:invokevirtual   #269 <Method void Throwable.printStackTrace()>
		}
		b = null;
	//   40   90:aload_0         
	//   41   91:aconst_null     
	//   42   92:putfield        #116 <Field Context b>
		c = null;
	//   43   95:aload_0         
	//   44   96:aconst_null     
	//   45   97:putfield        #122 <Field CoordinateConverter c>
	//   46  100:return          
	}

	public void onLocationChanged(Location location)
	{
		if(h == null)
			break MISSING_BLOCK_LABEL_261;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field TraceStatusListener h>
	//    2    4:ifnull          261
		int i1;
		Object obj;
		long l1 = System.currentTimeMillis();
	//    3    7:invokestatic    #277 <Method long System.currentTimeMillis()>
	//    4   10:lstore_3        
		if(l1 - m >= 30000L && h != null)
	//*   5   11:lload_3         
	//*   6   12:aload_0         
	//*   7   13:getfield        #81  <Field long m>
	//*   8   16:lsub            
	//*   9   17:ldc2w           #278 <Long 30000L>
	//*  10   20:lcmp            
	//*  11   21:iflt            50
	//*  12   24:aload_0         
	//*  13   25:getfield        #247 <Field TraceStatusListener h>
	//*  14   28:ifnull          50
		{
			h.onTraceStatus(((List) (null)), ((List) (null)), "\u5B9A\u4F4D\u8D85\u65F6");
	//   15   31:aload_0         
	//   16   32:getfield        #247 <Field TraceStatusListener h>
	//   17   35:aconst_null     
	//   18   36:aconst_null     
	//   19   37:ldc2            #281 <String "\u5B9A\u4F4D\u8D85\u65F6">
	//   20   40:invokeinterface #287 <Method void TraceStatusListener.onTraceStatus(List, List, String)>
			m = l1;
	//   21   45:aload_0         
	//   22   46:lload_3         
	//   23   47:putfield        #81  <Field long m>
		}
		obj = ((Object) (location.getExtras()));
	//   24   50:aload_1         
	//   25   51:invokevirtual   #293 <Method Bundle Location.getExtras()>
	//   26   54:astore          6
		i1 = ((Bundle) (obj)).getInt("errorCode");
	//   27   56:aload           6
	//   28   58:ldc2            #295 <String "errorCode">
	//   29   61:invokevirtual   #301 <Method int Bundle.getInt(String)>
	//   30   64:istore_2        
		if(i1 != 0)
	//*  31   65:iload_2         
	//*  32   66:ifeq            120
		{
			boolean flag;
			try
			{
				Log.w("LBSTraceClient", (new StringBuilder()).append("Locate failed [errorCode:\"").append(i1).append("\"  errorInfo:").append(((Bundle) (obj)).getString("errorInfo")).append("\"]").toString());
	//   33   69:ldc2            #303 <String "LBSTraceClient">
	//   34   72:new             #305 <Class StringBuilder>
	//   35   75:dup             
	//   36   76:invokespecial   #306 <Method void StringBuilder()>
	//   37   79:ldc2            #308 <String "Locate failed [errorCode:\"">
	//   38   82:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   39   85:iload_2         
	//   40   86:invokevirtual   #315 <Method StringBuilder StringBuilder.append(int)>
	//   41   89:ldc2            #317 <String "\"  errorInfo:">
	//   42   92:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   43   95:aload           6
	//   44   97:ldc2            #319 <String "errorInfo">
	//   45  100:invokevirtual   #323 <Method String Bundle.getString(String)>
	//   46  103:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   47  106:ldc2            #325 <String "\"]">
	//   48  109:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   49  112:invokevirtual   #329 <Method String StringBuilder.toString()>
	//   50  115:invokestatic    #335 <Method int Log.w(String, String)>
	//   51  118:pop             
				return;
	//   52  119:return          
			}
	//*  53  120:aload_0         
	//*  54  121:getfield        #75  <Field List j>
	//*  55  124:astore          6
	//*  56  126:aload           6
	//*  57  128:monitorenter    
	//*  58  129:new             #200 <Class TraceLocation>
	//*  59  132:dup             
	//*  60  133:aload_1         
	//*  61  134:invokevirtual   #336 <Method double Location.getLatitude()>
	//*  62  137:aload_1         
	//*  63  138:invokevirtual   #337 <Method double Location.getLongitude()>
	//*  64  141:aload_1         
	//*  65  142:invokevirtual   #341 <Method float Location.getSpeed()>
	//*  66  145:aload_1         
	//*  67  146:invokevirtual   #344 <Method float Location.getBearing()>
	//*  68  149:aload_1         
	//*  69  150:invokevirtual   #347 <Method long Location.getTime()>
	//*  70  153:invokespecial   #350 <Method void TraceLocation(double, double, float, float, long)>
	//*  71  156:astore_1        
	//*  72  157:aload_0         
	//*  73  158:aload_0         
	//*  74  159:getfield        #83  <Field TraceLocation o>
	//*  75  162:aload_1         
	//*  76  163:invokespecial   #352 <Method boolean a(TraceLocation, TraceLocation)>
	//*  77  166:istore          5
	//*  78  168:iload           5
	//*  79  170:ifeq            177
	//*  80  173:aload           6
	//*  81  175:monitorexit     
	//*  82  176:return          
	//*  83  177:aload_0         
	//*  84  178:getfield        #75  <Field List j>
	//*  85  181:aload_1         
	//*  86  182:invokeinterface #220 <Method boolean List.add(Object)>
	//*  87  187:pop             
	//*  88  188:aload_0         
	//*  89  189:aload_1         
	//*  90  190:putfield        #83  <Field TraceLocation o>
	//*  91  193:aload_0         
	//*  92  194:aload_0         
	//*  93  195:getfield        #77  <Field int k>
	//*  94  198:iconst_1        
	//*  95  199:iadd            
	//*  96  200:putfield        #77  <Field int k>
	//*  97  203:aload_0         
	//*  98  204:getfield        #77  <Field int k>
	//*  99  207:aload_0         
	//* 100  208:getfield        #70  <Field int g>
	//* 101  211:icmpne          243
	//* 102  214:aload_0         
	//* 103  215:aload_0         
	//* 104  216:getfield        #79  <Field int l>
	//* 105  219:aload_0         
	//* 106  220:getfield        #77  <Field int k>
	//* 107  223:iadd            
	//* 108  224:putfield        #79  <Field int l>
	//* 109  227:aload_0         
	//* 110  228:invokespecial   #354 <Method void a()>
	//* 111  231:aload_0         
	//* 112  232:invokestatic    #277 <Method long System.currentTimeMillis()>
	//* 113  235:putfield        #81  <Field long m>
	//* 114  238:aload_0         
	//* 115  239:iconst_0        
	//* 116  240:putfield        #77  <Field int k>
	//* 117  243:aload           6
	//* 118  245:monitorexit     
	//* 119  246:goto            255
	//* 120  249:astore_1        
	//* 121  250:aload           6
	//* 122  252:monitorexit     
	//* 123  253:aload_1         
	//* 124  254:athrow          
	//* 125  255:return          
			// Misplaced declaration of an exception variable
			catch(Location location)
	//* 126  256:astore_1        
			{
				((Throwable) (location)).printStackTrace();
	//  127  257:aload_1         
	//  128  258:invokevirtual   #269 <Method void Throwable.printStackTrace()>
			}
			break MISSING_BLOCK_LABEL_261;
		}
		obj = ((Object) (j));
		obj;
		JVM INSTR monitorenter ;
		location = ((Location) (new TraceLocation(location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getBearing(), location.getTime())));
		flag = a(o, ((TraceLocation) (location)));
		if(!flag)
			break MISSING_BLOCK_LABEL_177;
		obj;
		JVM INSTR monitorexit ;
		return;
		j.add(((Object) (location)));
		o = ((TraceLocation) (location));
		k = k + 1;
		if(k == g)
		{
			l = l + k;
			a();
			m = System.currentTimeMillis();
			k = 0;
		}
		obj;
		JVM INSTR monitorexit ;
		  goto _L1
		location;
		throw location;
_L1:
		return;
	//  129  261:return          
	}

	public void queryProcessedTrace(int i1, List list, int j1, TraceListener tracelistener)
	{
		try
		{
			list = ((List) (new a(i1, list, j1, tracelistener)));
	//    0    0:new             #10  <Class gk$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #357 <Method void gk$a(gk, int, List, int, TraceListener)>
	//    8   13:astore_2        
			d.execute(((Runnable) (list)));
	//    9   14:aload_0         
	//   10   15:getfield        #150 <Field ExecutorService d>
	//   11   18:aload_2         
	//   12   19:invokeinterface #361 <Method void ExecutorService.execute(Runnable)>
			return;
	//   13   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  14   25:astore_2        
		{
			((Throwable) (list)).printStackTrace();
	//   15   26:aload_2         
	//   16   27:invokevirtual   #269 <Method void Throwable.printStackTrace()>
		}
	//   17   30:return          
	}

	public void setLocationInterval(long l1)
	{
		f = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #68  <Field long f>
	//    3    5:return          
	}

	public void setTraceStatusInterval(int i1)
	{
		g = Math.max(i1, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokestatic    #370 <Method int Math.max(int, int)>
	//    4    6:putfield        #70  <Field int g>
	//    5    9:return          
	}

	public void startTrace(TraceStatusListener tracestatuslistener)
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field Context b>
	//*   2    4:ifnonnull       18
		{
			Log.w("LBSTraceClient", "Context need to be initialized");
	//    3    7:ldc2            #303 <String "LBSTraceClient">
	//    4   10:ldc2            #374 <String "Context need to be initialized">
	//    5   13:invokestatic    #335 <Method int Log.w(String, String)>
	//    6   16:pop             
			return;
	//    7   17:return          
		}
		m = System.currentTimeMillis();
	//    8   18:aload_0         
	//    9   19:invokestatic    #277 <Method long System.currentTimeMillis()>
	//   10   22:putfield        #81  <Field long m>
		h = tracestatuslistener;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #247 <Field TraceStatusListener h>
		if(i == null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #233 <Field ax i>
	//*  16   34:ifnonnull       71
		{
			i = new ax(b);
	//   17   37:aload_0         
	//   18   38:new             #235 <Class ax>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:getfield        #116 <Field Context b>
	//   22   46:invokespecial   #375 <Method void ax(Context)>
	//   23   49:putfield        #233 <Field ax i>
			i.a(f);
	//   24   52:aload_0         
	//   25   53:getfield        #233 <Field ax i>
	//   26   56:aload_0         
	//   27   57:getfield        #68  <Field long f>
	//   28   60:invokevirtual   #377 <Method void ax.a(long)>
			i.activate(((com.amap.api.maps.LocationSource.OnLocationChangedListener) (this)));
	//   29   63:aload_0         
	//   30   64:getfield        #233 <Field ax i>
	//   31   67:aload_0         
	//   32   68:invokevirtual   #381 <Method void ax.activate(com.amap.api.maps.LocationSource$OnLocationChangedListener)>
		}
	//   33   71:return          
	}

	public void stopTrace()
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #383 <Method void b()>
		c();
	//    2    4:aload_0         
	//    3    5:invokespecial   #385 <Method void c()>
	//    4    8:return          
	}

	private static final TimeUnit s;
	int a;
	private Context b;
	private CoordinateConverter c;
	private ExecutorService d;
	private ExecutorService e;
	private long f;
	private int g;
	private TraceStatusListener h;
	private ax i;
	private List j;
	private int k;
	private int l;
	private long m;
	private c n;
	private TraceLocation o;
	private List p;
	private List q;
	private List r;
	private BlockingQueue t;
	private BlockingQueue u;

	static 
	{
		s = TimeUnit.SECONDS;
	//    0    0:getstatic       #57  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:putstatic       #59  <Field TimeUnit s>
	//*   2    6:return          
	}
}
