// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.model.LatLng;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.interfaces.IOverlay;

// Referenced classes of package com.amap.api.mapcore.util:
//			cx, hm, s

public class cs
	implements cx
{

	public cs(s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		h = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #41  <Float 10F>
	//    4    7:putfield        #43  <Field float h>
		i = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #44  <Int 0xff000000>
	//    7   13:putfield        #46  <Field int i>
		j = 0.0F;
	//    8   16:aload_0         
	//    9   17:fconst_0        
	//   10   18:putfield        #48  <Field float j>
		k = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #50  <Field boolean k>
		o = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #52  <Field int o>
		p = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #54  <Field boolean p>
		q = 0.0D;
	//   20   36:aload_0         
	//   21   37:dconst_0        
	//   22   38:putfield        #56  <Field double q>
		r = 0.0D;
	//   23   41:aload_0         
	//   24   42:dconst_0        
	//   25   43:putfield        #58  <Field double r>
		s = 0.0D;
	//   26   46:aload_0         
	//   27   47:dconst_0        
	//   28   48:putfield        #60  <Field double s>
		m = s1;
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:putfield        #62  <Field s m>
		try
		{
			l = getId();
	//   32   56:aload_0         
	//   33   57:aload_0         
	//   34   58:invokevirtual   #66  <Method String getId()>
	//   35   61:putfield        #68  <Field String l>
			return;
	//   36   64:return          
		}
		// Misplaced declaration of an exception variable
		catch(s s1)
	//*  37   65:astore_1        
		{
			hm.c(((Throwable) (s1)), "ArcDelegateImp", "create");
	//   38   66:aload_1         
	//   39   67:ldc1            #70  <String "ArcDelegateImp">
	//   40   69:ldc1            #72  <String "create">
	//   41   71:invokestatic    #77  <Method void hm.c(Throwable, String, String)>
		}
		((RemoteException) (s1)).printStackTrace();
	//   42   74:aload_1         
	//   43   75:invokevirtual   #80  <Method void RemoteException.printStackTrace()>
	//   44   78:return          
	}

	private double a(double d1, double d2, double d3, double d4)
	{
		d2 = (d2 - d4) / q;
	//    0    0:dload_3         
	//    1    1:dload           7
	//    2    3:dsub            
	//    3    4:aload_0         
	//    4    5:getfield        #56  <Field double q>
	//    5    8:ddiv            
	//    6    9:dstore_3        
		if(Math.abs(d2) > 1.0D)
	//*   7   10:dload_3         
	//*   8   11:invokestatic    #88  <Method double Math.abs(double)>
	//*   9   14:dconst_1        
	//*  10   15:dcmpl           
	//*  11   16:ifle            27
			d2 = Math.signum(d2);
	//   12   19:dload_3         
	//   13   20:invokestatic    #91  <Method double Math.signum(double)>
	//   14   23:dstore_3        
	//*  15   24:goto            27
		d4 = Math.asin(d2);
	//   16   27:dload_3         
	//   17   28:invokestatic    #94  <Method double Math.asin(double)>
	//   18   31:dstore          7
		if(d4 >= 0.0D)
	//*  19   33:dload           7
	//*  20   35:dconst_0        
	//*  21   36:dcmpl           
	//*  22   37:iflt            60
		{
			d2 = d4;
	//   23   40:dload           7
	//   24   42:dstore_3        
			if(d3 < d1)
	//*  25   43:dload           5
	//*  26   45:dload_1         
	//*  27   46:dcmpg           
	//*  28   47:ifge            81
				return 3.1415926535897931D - Math.abs(d4);
	//   29   50:ldc2w           #95  <Double 3.1415926535897931D>
	//   30   53:dload           7
	//   31   55:invokestatic    #88  <Method double Math.abs(double)>
	//   32   58:dsub            
	//   33   59:dreturn         
		} else
		{
			if(d3 < d1)
	//*  34   60:dload           5
	//*  35   62:dload_1         
	//*  36   63:dcmpg           
	//*  37   64:ifge            74
				return 3.1415926535897931D - d4;
	//   38   67:ldc2w           #95  <Double 3.1415926535897931D>
	//   39   70:dload           7
	//   40   72:dsub            
	//   41   73:dreturn         
			d2 = d4 + 6.2831853071795862D;
	//   42   74:dload           7
	//   43   76:ldc2w           #97  <Double 6.2831853071795862D>
	//   44   79:dadd            
	//   45   80:dstore_3        
		}
		return d2;
	//   46   81:dload_3         
	//   47   82:dreturn         
	}

	private FPoint a(GLMapState glmapstate, double d1, double d2, double d3)
	{
		double d4 = Math.cos(d1);
	//    0    0:dload_2         
	//    1    1:invokestatic    #102 <Method double Math.cos(double)>
	//    2    4:dstore          8
		double d5 = q;
	//    3    6:aload_0         
	//    4    7:getfield        #56  <Field double q>
	//    5   10:dstore          10
		d1 = -Math.sin(d1);
	//    6   12:dload_2         
	//    7   13:invokestatic    #105 <Method double Math.sin(double)>
	//    8   16:dneg            
	//    9   17:dstore_2        
		double d6 = q;
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field double q>
	//   12   22:dstore          12
		int i1 = (int)(d2 + d4 * d5);
	//   13   24:dload           4
	//   14   26:dload           8
	//   15   28:dload           10
	//   16   30:dmul            
	//   17   31:dadd            
	//   18   32:d2i             
	//   19   33:istore          14
		int j1 = (int)(d3 + d1 * d6);
	//   20   35:dload           6
	//   21   37:dload_2         
	//   22   38:dload           12
	//   23   40:dmul            
	//   24   41:dadd            
	//   25   42:d2i             
	//   26   43:istore          15
		glmapstate = ((GLMapState) (FPoint.obtain()));
	//   27   45:invokestatic    #111 <Method FPoint FPoint.obtain()>
	//   28   48:astore_1        
		MapConfig mapconfig = m.getMapConfig();
	//   29   49:aload_0         
	//   30   50:getfield        #62  <Field s m>
	//   31   53:invokeinterface #117 <Method MapConfig s.getMapConfig()>
	//   32   58:astore          16
		if(mapconfig != null)
	//*  33   60:aload           16
	//*  34   62:ifnull          91
		{
			glmapstate.x = i1 - mapconfig.getSX();
	//   35   65:aload_1         
	//   36   66:iload           14
	//   37   68:aload           16
	//   38   70:invokevirtual   #123 <Method int MapConfig.getSX()>
	//   39   73:isub            
	//   40   74:i2f             
	//   41   75:putfield        #126 <Field float FPoint.x>
			glmapstate.y = j1 - mapconfig.getSY();
	//   42   78:aload_1         
	//   43   79:iload           15
	//   44   81:aload           16
	//   45   83:invokevirtual   #129 <Method int MapConfig.getSY()>
	//   46   86:isub            
	//   47   87:i2f             
	//   48   88:putfield        #132 <Field float FPoint.y>
		}
		return ((FPoint) (glmapstate));
	//   49   91:aload_1         
	//   50   92:areturn         
	}

	private boolean d()
	{
		return Math.abs((e.latitude - f.latitude) * (f.longitude - g.longitude) * Math.pow(10D, 6D) - (e.longitude - f.longitude) * (f.latitude - g.latitude) * Math.pow(10D, 6D)) >= 9.9999999999999995E-07D;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field LatLng e>
	//    2    4:getfield        #140 <Field double LatLng.latitude>
	//    3    7:aload_0         
	//    4    8:getfield        #142 <Field LatLng f>
	//    5   11:getfield        #140 <Field double LatLng.latitude>
	//    6   14:dsub            
	//    7   15:aload_0         
	//    8   16:getfield        #142 <Field LatLng f>
	//    9   19:getfield        #145 <Field double LatLng.longitude>
	//   10   22:aload_0         
	//   11   23:getfield        #147 <Field LatLng g>
	//   12   26:getfield        #145 <Field double LatLng.longitude>
	//   13   29:dsub            
	//   14   30:dmul            
	//   15   31:ldc2w           #148 <Double 10D>
	//   16   34:ldc2w           #150 <Double 6D>
	//   17   37:invokestatic    #155 <Method double Math.pow(double, double)>
	//   18   40:dmul            
	//   19   41:aload_0         
	//   20   42:getfield        #135 <Field LatLng e>
	//   21   45:getfield        #145 <Field double LatLng.longitude>
	//   22   48:aload_0         
	//   23   49:getfield        #142 <Field LatLng f>
	//   24   52:getfield        #145 <Field double LatLng.longitude>
	//   25   55:dsub            
	//   26   56:aload_0         
	//   27   57:getfield        #142 <Field LatLng f>
	//   28   60:getfield        #140 <Field double LatLng.latitude>
	//   29   63:aload_0         
	//   30   64:getfield        #147 <Field LatLng g>
	//   31   67:getfield        #140 <Field double LatLng.latitude>
	//   32   70:dsub            
	//   33   71:dmul            
	//   34   72:ldc2w           #148 <Double 10D>
	//   35   75:ldc2w           #150 <Double 6D>
	//   36   78:invokestatic    #155 <Method double Math.pow(double, double)>
	//   37   81:dmul            
	//   38   82:dsub            
	//   39   83:invokestatic    #88  <Method double Math.abs(double)>
	//   40   86:ldc2w           #156 <Double 9.9999999999999995E-07D>
	//   41   89:dcmpg           
	//   42   90:ifge            95
	//   43   93:iconst_0        
	//   44   94:ireturn         
	//   45   95:iconst_1        
	//   46   96:ireturn         
	}

	private DPoint e()
	{
		IPoint ipoint = IPoint.obtain();
	//    0    0:invokestatic    #163 <Method IPoint IPoint.obtain()>
	//    1    3:astore          17
		m.a(e.latitude, e.longitude, ipoint);
	//    2    5:aload_0         
	//    3    6:getfield        #62  <Field s m>
	//    4    9:aload_0         
	//    5   10:getfield        #135 <Field LatLng e>
	//    6   13:getfield        #140 <Field double LatLng.latitude>
	//    7   16:aload_0         
	//    8   17:getfield        #135 <Field LatLng e>
	//    9   20:getfield        #145 <Field double LatLng.longitude>
	//   10   23:aload           17
	//   11   25:invokeinterface #166 <Method void s.a(double, double, IPoint)>
		IPoint ipoint1 = IPoint.obtain();
	//   12   30:invokestatic    #163 <Method IPoint IPoint.obtain()>
	//   13   33:astore          18
		m.a(f.latitude, f.longitude, ipoint1);
	//   14   35:aload_0         
	//   15   36:getfield        #62  <Field s m>
	//   16   39:aload_0         
	//   17   40:getfield        #142 <Field LatLng f>
	//   18   43:getfield        #140 <Field double LatLng.latitude>
	//   19   46:aload_0         
	//   20   47:getfield        #142 <Field LatLng f>
	//   21   50:getfield        #145 <Field double LatLng.longitude>
	//   22   53:aload           18
	//   23   55:invokeinterface #166 <Method void s.a(double, double, IPoint)>
		IPoint ipoint2 = IPoint.obtain();
	//   24   60:invokestatic    #163 <Method IPoint IPoint.obtain()>
	//   25   63:astore          19
		m.a(g.latitude, g.longitude, ipoint2);
	//   26   65:aload_0         
	//   27   66:getfield        #62  <Field s m>
	//   28   69:aload_0         
	//   29   70:getfield        #147 <Field LatLng g>
	//   30   73:getfield        #140 <Field double LatLng.latitude>
	//   31   76:aload_0         
	//   32   77:getfield        #147 <Field LatLng g>
	//   33   80:getfield        #145 <Field double LatLng.longitude>
	//   34   83:aload           19
	//   35   85:invokeinterface #166 <Method void s.a(double, double, IPoint)>
		double d5 = ipoint.x;
	//   36   90:aload           17
	//   37   92:getfield        #168 <Field int IPoint.x>
	//   38   95:i2d             
	//   39   96:dstore          9
		double d6 = ipoint.y;
	//   40   98:aload           17
	//   41  100:getfield        #170 <Field int IPoint.y>
	//   42  103:i2d             
	//   43  104:dstore          11
		double d7 = ipoint1.x;
	//   44  106:aload           18
	//   45  108:getfield        #168 <Field int IPoint.x>
	//   46  111:i2d             
	//   47  112:dstore          13
		double d8 = ipoint1.y;
	//   48  114:aload           18
	//   49  116:getfield        #170 <Field int IPoint.y>
	//   50  119:i2d             
	//   51  120:dstore          15
		double d1 = ipoint2.x;
	//   52  122:aload           19
	//   53  124:getfield        #168 <Field int IPoint.x>
	//   54  127:i2d             
	//   55  128:dstore_1        
		double d2 = ipoint2.y;
	//   56  129:aload           19
	//   57  131:getfield        #170 <Field int IPoint.y>
	//   58  134:i2d             
	//   59  135:dstore_3        
		double d3 = ((d2 - d6) * (((d8 * d8 - d6 * d6) + d7 * d7) - d5 * d5) + (d8 - d6) * (((d6 * d6 - d2 * d2) + d5 * d5) - d1 * d1)) / ((d7 - d5) * 2D * (d2 - d6) - (d1 - d5) * 2D * (d8 - d6));
	//   60  136:dload_3         
	//   61  137:dload           11
	//   62  139:dsub            
	//   63  140:dload           15
	//   64  142:dload           15
	//   65  144:dmul            
	//   66  145:dload           11
	//   67  147:dload           11
	//   68  149:dmul            
	//   69  150:dsub            
	//   70  151:dload           13
	//   71  153:dload           13
	//   72  155:dmul            
	//   73  156:dadd            
	//   74  157:dload           9
	//   75  159:dload           9
	//   76  161:dmul            
	//   77  162:dsub            
	//   78  163:dmul            
	//   79  164:dload           15
	//   80  166:dload           11
	//   81  168:dsub            
	//   82  169:dload           11
	//   83  171:dload           11
	//   84  173:dmul            
	//   85  174:dload_3         
	//   86  175:dload_3         
	//   87  176:dmul            
	//   88  177:dsub            
	//   89  178:dload           9
	//   90  180:dload           9
	//   91  182:dmul            
	//   92  183:dadd            
	//   93  184:dload_1         
	//   94  185:dload_1         
	//   95  186:dmul            
	//   96  187:dsub            
	//   97  188:dmul            
	//   98  189:dadd            
	//   99  190:dload           13
	//  100  192:dload           9
	//  101  194:dsub            
	//  102  195:ldc2w           #171 <Double 2D>
	//  103  198:dmul            
	//  104  199:dload_3         
	//  105  200:dload           11
	//  106  202:dsub            
	//  107  203:dmul            
	//  108  204:dload_1         
	//  109  205:dload           9
	//  110  207:dsub            
	//  111  208:ldc2w           #171 <Double 2D>
	//  112  211:dmul            
	//  113  212:dload           15
	//  114  214:dload           11
	//  115  216:dsub            
	//  116  217:dmul            
	//  117  218:dsub            
	//  118  219:ddiv            
	//  119  220:dstore          5
		double d4 = ((d1 - d5) * (((d7 * d7 - d5 * d5) + d8 * d8) - d6 * d6) + (d7 - d5) * (((d5 * d5 - d1 * d1) + d6 * d6) - d2 * d2)) / ((d8 - d6) * 2D * (d1 - d5) - (d2 - d6) * 2D * (d7 - d5));
	//  120  222:dload_1         
	//  121  223:dload           9
	//  122  225:dsub            
	//  123  226:dload           13
	//  124  228:dload           13
	//  125  230:dmul            
	//  126  231:dload           9
	//  127  233:dload           9
	//  128  235:dmul            
	//  129  236:dsub            
	//  130  237:dload           15
	//  131  239:dload           15
	//  132  241:dmul            
	//  133  242:dadd            
	//  134  243:dload           11
	//  135  245:dload           11
	//  136  247:dmul            
	//  137  248:dsub            
	//  138  249:dmul            
	//  139  250:dload           13
	//  140  252:dload           9
	//  141  254:dsub            
	//  142  255:dload           9
	//  143  257:dload           9
	//  144  259:dmul            
	//  145  260:dload_1         
	//  146  261:dload_1         
	//  147  262:dmul            
	//  148  263:dsub            
	//  149  264:dload           11
	//  150  266:dload           11
	//  151  268:dmul            
	//  152  269:dadd            
	//  153  270:dload_3         
	//  154  271:dload_3         
	//  155  272:dmul            
	//  156  273:dsub            
	//  157  274:dmul            
	//  158  275:dadd            
	//  159  276:dload           15
	//  160  278:dload           11
	//  161  280:dsub            
	//  162  281:ldc2w           #171 <Double 2D>
	//  163  284:dmul            
	//  164  285:dload_1         
	//  165  286:dload           9
	//  166  288:dsub            
	//  167  289:dmul            
	//  168  290:dload_3         
	//  169  291:dload           11
	//  170  293:dsub            
	//  171  294:ldc2w           #171 <Double 2D>
	//  172  297:dmul            
	//  173  298:dload           13
	//  174  300:dload           9
	//  175  302:dsub            
	//  176  303:dmul            
	//  177  304:dsub            
	//  178  305:ddiv            
	//  179  306:dstore          7
		q = Math.sqrt((d5 - d3) * (d5 - d3) + (d6 - d4) * (d6 - d4));
	//  180  308:aload_0         
	//  181  309:dload           9
	//  182  311:dload           5
	//  183  313:dsub            
	//  184  314:dload           9
	//  185  316:dload           5
	//  186  318:dsub            
	//  187  319:dmul            
	//  188  320:dload           11
	//  189  322:dload           7
	//  190  324:dsub            
	//  191  325:dload           11
	//  192  327:dload           7
	//  193  329:dsub            
	//  194  330:dmul            
	//  195  331:dadd            
	//  196  332:invokestatic    #175 <Method double Math.sqrt(double)>
	//  197  335:putfield        #56  <Field double q>
		r = a(d3, d4, d5, d6);
	//  198  338:aload_0         
	//  199  339:aload_0         
	//  200  340:dload           5
	//  201  342:dload           7
	//  202  344:dload           9
	//  203  346:dload           11
	//  204  348:invokespecial   #177 <Method double a(double, double, double, double)>
	//  205  351:putfield        #58  <Field double r>
		d5 = a(d3, d4, d7, d8);
	//  206  354:aload_0         
	//  207  355:dload           5
	//  208  357:dload           7
	//  209  359:dload           13
	//  210  361:dload           15
	//  211  363:invokespecial   #177 <Method double a(double, double, double, double)>
	//  212  366:dstore          9
		s = a(d3, d4, d1, d2);
	//  213  368:aload_0         
	//  214  369:aload_0         
	//  215  370:dload           5
	//  216  372:dload           7
	//  217  374:dload_1         
	//  218  375:dload_3         
	//  219  376:invokespecial   #177 <Method double a(double, double, double, double)>
	//  220  379:putfield        #60  <Field double s>
		if(r < s)
	//* 221  382:aload_0         
	//* 222  383:getfield        #58  <Field double r>
	//* 223  386:aload_0         
	//* 224  387:getfield        #60  <Field double s>
	//* 225  390:dcmpg           
	//* 226  391:ifge            429
		{
			if(d5 <= r || d5 >= s)
	//* 227  394:dload           9
	//* 228  396:aload_0         
	//* 229  397:getfield        #58  <Field double r>
	//* 230  400:dcmpl           
	//* 231  401:ifle            414
	//* 232  404:dload           9
	//* 233  406:aload_0         
	//* 234  407:getfield        #60  <Field double s>
	//* 235  410:dcmpg           
	//* 236  411:iflt            461
				s = s - 6.2831853071795862D;
	//  237  414:aload_0         
	//  238  415:aload_0         
	//  239  416:getfield        #60  <Field double s>
	//  240  419:ldc2w           #97  <Double 6.2831853071795862D>
	//  241  422:dsub            
	//  242  423:putfield        #60  <Field double s>
		} else
	//* 243  426:goto            461
		if(d5 <= s || d5 >= r)
	//* 244  429:dload           9
	//* 245  431:aload_0         
	//* 246  432:getfield        #60  <Field double s>
	//* 247  435:dcmpl           
	//* 248  436:ifle            449
	//* 249  439:dload           9
	//* 250  441:aload_0         
	//* 251  442:getfield        #58  <Field double r>
	//* 252  445:dcmpg           
	//* 253  446:iflt            461
			s = s + 6.2831853071795862D;
	//  254  449:aload_0         
	//  255  450:aload_0         
	//  256  451:getfield        #60  <Field double s>
	//  257  454:ldc2w           #97  <Double 6.2831853071795862D>
	//  258  457:dadd            
	//  259  458:putfield        #60  <Field double s>
		ipoint.recycle();
	//  260  461:aload           17
	//  261  463:invokevirtual   #180 <Method void IPoint.recycle()>
		ipoint1.recycle();
	//  262  466:aload           18
	//  263  468:invokevirtual   #180 <Method void IPoint.recycle()>
		ipoint2.recycle();
	//  264  471:aload           19
	//  265  473:invokevirtual   #180 <Method void IPoint.recycle()>
		return DPoint.obtain(d3, d4);
	//  266  476:dload           5
	//  267  478:dload           7
	//  268  480:invokestatic    #185 <Method DPoint DPoint.obtain(double, double)>
	//  269  483:areturn         
	}

	public void a(LatLng latlng)
	{
		e = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #135 <Field LatLng e>
	//    3    5:return          
	}

	public void a(MapConfig mapconfig)
		throws RemoteException
	{
		if(e == null || f == null || g == null || !k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field LatLng e>
	//*   2    4:ifnull          28
	//*   3    7:aload_0         
	//*   4    8:getfield        #142 <Field LatLng f>
	//*   5   11:ifnull          28
	//*   6   14:aload_0         
	//*   7   15:getfield        #147 <Field LatLng g>
	//*   8   18:ifnull          28
	//*   9   21:aload_0         
	//*  10   22:getfield        #50  <Field boolean k>
	//*  11   25:ifne            29
			return;
	//   12   28:return          
		b();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #189 <Method boolean b()>
	//   15   33:pop             
		if(n != null && o > 0)
	//*  16   34:aload_0         
	//*  17   35:getfield        #191 <Field float[] n>
	//*  18   38:ifnull          133
	//*  19   41:aload_0         
	//*  20   42:getfield        #52  <Field int o>
	//*  21   45:ifle            133
		{
			float f1 = m.c().getMapLenWithWin((int)h);
	//   22   48:aload_0         
	//   23   49:getfield        #62  <Field s m>
	//   24   52:invokeinterface #194 <Method GLMapState s.c()>
	//   25   57:aload_0         
	//   26   58:getfield        #43  <Field float h>
	//   27   61:f2i             
	//   28   62:invokevirtual   #200 <Method float GLMapState.getMapLenWithWin(int)>
	//   29   65:fstore_2        
			m.c().getMapLenWithWin(1);
	//   30   66:aload_0         
	//   31   67:getfield        #62  <Field s m>
	//   32   70:invokeinterface #194 <Method GLMapState s.c()>
	//   33   75:iconst_1        
	//   34   76:invokevirtual   #200 <Method float GLMapState.getMapLenWithWin(int)>
	//   35   79:pop             
			AMapNativeRenderer.nativeDrawLineByTextureID(n, n.length, f1, m.d(), b, c, d, a, 0.0F, false, true, false, m.x(), 3, 0);
	//   36   80:aload_0         
	//   37   81:getfield        #191 <Field float[] n>
	//   38   84:aload_0         
	//   39   85:getfield        #191 <Field float[] n>
	//   40   88:arraylength     
	//   41   89:fload_2         
	//   42   90:aload_0         
	//   43   91:getfield        #62  <Field s m>
	//   44   94:invokeinterface #202 <Method int s.d()>
	//   45   99:aload_0         
	//   46  100:getfield        #204 <Field float b>
	//   47  103:aload_0         
	//   48  104:getfield        #206 <Field float c>
	//   49  107:aload_0         
	//   50  108:getfield        #208 <Field float d>
	//   51  111:aload_0         
	//   52  112:getfield        #210 <Field float a>
	//   53  115:fconst_0        
	//   54  116:iconst_0        
	//   55  117:iconst_1        
	//   56  118:iconst_0        
	//   57  119:aload_0         
	//   58  120:getfield        #62  <Field s m>
	//   59  123:invokeinterface #213 <Method float[] s.x()>
	//   60  128:iconst_3        
	//   61  129:iconst_0        
	//   62  130:invokestatic    #219 <Method void AMapNativeRenderer.nativeDrawLineByTextureID(float[], int, float, int, float, float, float, float, float, boolean, boolean, boolean, float[], int, int)>
		}
		p = true;
	//   63  133:aload_0         
	//   64  134:iconst_1        
	//   65  135:putfield        #54  <Field boolean p>
	//   66  138:return          
	}

	public boolean a()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void b(LatLng latlng)
	{
		f = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field LatLng f>
	//    3    5:return          
	}

	public boolean b()
		throws RemoteException
	{
		if(e == null || f == null || g == null || !k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field LatLng e>
	//*   2    4:ifnull          28
	//*   3    7:aload_0         
	//*   4    8:getfield        #142 <Field LatLng f>
	//*   5   11:ifnull          28
	//*   6   14:aload_0         
	//*   7   15:getfield        #147 <Field LatLng g>
	//*   8   18:ifnull          28
	//*   9   21:aload_0         
	//*  10   22:getfield        #50  <Field boolean k>
	//*  11   25:ifne            30
			return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
		Object obj;
		Object obj1;
		p = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #54  <Field boolean p>
		obj = ((Object) (m.c()));
	//   17   35:aload_0         
	//   18   36:getfield        #62  <Field s m>
	//   19   39:invokeinterface #194 <Method GLMapState s.c()>
	//   20   44:astore          5
		if(d())
			break MISSING_BLOCK_LABEL_247;
	//   21   46:aload_0         
	//   22   47:invokespecial   #224 <Method boolean d()>
	//   23   50:ifne            247
		obj = ((Object) (new FPoint[3]));
	//   24   53:iconst_3        
	//   25   54:anewarray       FPoint[]
	//   26   57:astore          5
		int i1 = obj.length;
	//   27   59:aload           5
	//   28   61:arraylength     
	//   29   62:istore_3        
		n = new float[9];
	//   30   63:aload_0         
	//   31   64:bipush          9
	//   32   66:newarray        float[]
	//   33   68:putfield        #191 <Field float[] n>
		obj1 = ((Object) (FPoint.obtain()));
	//   34   71:invokestatic    #111 <Method FPoint FPoint.obtain()>
	//   35   74:astore          6
		m.a(e.latitude, e.longitude, ((FPoint) (obj1)));
	//   36   76:aload_0         
	//   37   77:getfield        #62  <Field s m>
	//   38   80:aload_0         
	//   39   81:getfield        #135 <Field LatLng e>
	//   40   84:getfield        #140 <Field double LatLng.latitude>
	//   41   87:aload_0         
	//   42   88:getfield        #135 <Field LatLng e>
	//   43   91:getfield        #145 <Field double LatLng.longitude>
	//   44   94:aload           6
	//   45   96:invokeinterface #227 <Method void s.a(double, double, FPoint)>
		obj[0] = ((/*<invalid signature>*/java.lang.Object) (obj1));
	//   46  101:aload           5
	//   47  103:iconst_0        
	//   48  104:aload           6
	//   49  106:aastore         
		double d1;
		int j1;
		int k1;
		FPoint afpoint[];
		FPoint fpoint;
		try
		{
			obj1 = ((Object) (FPoint.obtain()));
	//   50  107:invokestatic    #111 <Method FPoint FPoint.obtain()>
	//   51  110:astore          6
			m.a(f.latitude, f.longitude, ((FPoint) (obj1)));
	//   52  112:aload_0         
	//   53  113:getfield        #62  <Field s m>
	//   54  116:aload_0         
	//   55  117:getfield        #142 <Field LatLng f>
	//   56  120:getfield        #140 <Field double LatLng.latitude>
	//   57  123:aload_0         
	//   58  124:getfield        #142 <Field LatLng f>
	//   59  127:getfield        #145 <Field double LatLng.longitude>
	//   60  130:aload           6
	//   61  132:invokeinterface #227 <Method void s.a(double, double, FPoint)>
		}
	//*  62  137:aload           5
	//*  63  139:iconst_1        
	//*  64  140:aload           6
	//*  65  142:aastore         
	//*  66  143:invokestatic    #111 <Method FPoint FPoint.obtain()>
	//*  67  146:astore          6
	//*  68  148:aload_0         
	//*  69  149:getfield        #62  <Field s m>
	//*  70  152:aload_0         
	//*  71  153:getfield        #147 <Field LatLng g>
	//*  72  156:getfield        #140 <Field double LatLng.latitude>
	//*  73  159:aload_0         
	//*  74  160:getfield        #147 <Field LatLng g>
	//*  75  163:getfield        #145 <Field double LatLng.longitude>
	//*  76  166:aload           6
	//*  77  168:invokeinterface #227 <Method void s.a(double, double, FPoint)>
	//*  78  173:aload           5
	//*  79  175:iconst_2        
	//*  80  176:aload           6
	//*  81  178:aastore         
	//*  82  179:iconst_0        
	//*  83  180:istore_3        
	//*  84  181:iload_3         
	//*  85  182:iconst_3        
	//*  86  183:icmpge          236
	//*  87  186:aload_0         
	//*  88  187:getfield        #191 <Field float[] n>
	//*  89  190:iload_3         
	//*  90  191:iconst_3        
	//*  91  192:imul            
	//*  92  193:aload           5
	//*  93  195:iload_3         
	//*  94  196:aaload          
	//*  95  197:getfield        #126 <Field float FPoint.x>
	//*  96  200:fastore         
	//*  97  201:aload_0         
	//*  98  202:getfield        #191 <Field float[] n>
	//*  99  205:iload_3         
	//* 100  206:iconst_3        
	//* 101  207:imul            
	//* 102  208:iconst_1        
	//* 103  209:iadd            
	//* 104  210:aload           5
	//* 105  212:iload_3         
	//* 106  213:aaload          
	//* 107  214:getfield        #132 <Field float FPoint.y>
	//* 108  217:fastore         
	//* 109  218:aload_0         
	//* 110  219:getfield        #191 <Field float[] n>
	//* 111  222:iload_3         
	//* 112  223:iconst_3        
	//* 113  224:imul            
	//* 114  225:iconst_2        
	//* 115  226:iadd            
	//* 116  227:fconst_0        
	//* 117  228:fastore         
	//* 118  229:iload_3         
	//* 119  230:iconst_1        
	//* 120  231:iadd            
	//* 121  232:istore_3        
	//* 122  233:goto            181
	//* 123  236:aload           5
	//* 124  238:arraylength     
	//* 125  239:istore_3        
	//* 126  240:aload_0         
	//* 127  241:iconst_3        
	//* 128  242:putfield        #52  <Field int o>
	//* 129  245:iconst_1        
	//* 130  246:ireturn         
	//* 131  247:aload_0         
	//* 132  248:invokespecial   #229 <Method DPoint e()>
	//* 133  251:astore          6
	//* 134  253:aload_0         
	//* 135  254:getfield        #60  <Field double s>
	//* 136  257:aload_0         
	//* 137  258:getfield        #58  <Field double r>
	//* 138  261:dsub            
	//* 139  262:invokestatic    #88  <Method double Math.abs(double)>
	//* 140  265:ldc2w           #230 <Double 180D>
	//* 141  268:dmul            
	//* 142  269:ldc2w           #95  <Double 3.1415926535897931D>
	//* 143  272:ddiv            
	//* 144  273:d2i             
	//* 145  274:istore          4
	//* 146  276:aload_0         
	//* 147  277:getfield        #60  <Field double s>
	//* 148  280:aload_0         
	//* 149  281:getfield        #58  <Field double r>
	//* 150  284:dsub            
	//* 151  285:iload           4
	//* 152  287:i2d             
	//* 153  288:ddiv            
	//* 154  289:dstore_1        
	//* 155  290:iload           4
	//* 156  292:iconst_1        
	//* 157  293:iadd            
	//* 158  294:anewarray       FPoint[]
	//* 159  297:astore          7
	//* 160  299:aload_0         
	//* 161  300:aload           7
	//* 162  302:arraylength     
	//* 163  303:iconst_3        
	//* 164  304:imul            
	//* 165  305:newarray        float[]
	//* 166  307:putfield        #191 <Field float[] n>
	//* 167  310:iconst_0        
	//* 168  311:istore_3        
	//* 169  312:iload_3         
	//* 170  313:iload           4
	//* 171  315:icmpgt          471
	//* 172  318:iload_3         
	//* 173  319:iload           4
	//* 174  321:icmpne          363
	//* 175  324:invokestatic    #111 <Method FPoint FPoint.obtain()>
	//* 176  327:astore          8
	//* 177  329:aload_0         
	//* 178  330:getfield        #62  <Field s m>
	//* 179  333:aload_0         
	//* 180  334:getfield        #147 <Field LatLng g>
	//* 181  337:getfield        #140 <Field double LatLng.latitude>
	//* 182  340:aload_0         
	//* 183  341:getfield        #147 <Field LatLng g>
	//* 184  344:getfield        #145 <Field double LatLng.longitude>
	//* 185  347:aload           8
	//* 186  349:invokeinterface #227 <Method void s.a(double, double, FPoint)>
	//* 187  354:aload           7
	//* 188  356:iload_3         
	//* 189  357:aload           8
	//* 190  359:aastore         
	//* 191  360:goto            392
	//* 192  363:aload           7
	//* 193  365:iload_3         
	//* 194  366:aload_0         
	//* 195  367:aload           5
	//* 196  369:aload_0         
	//* 197  370:getfield        #58  <Field double r>
	//* 198  373:iload_3         
	//* 199  374:i2d             
	//* 200  375:dload_1         
	//* 201  376:dmul            
	//* 202  377:dadd            
	//* 203  378:aload           6
	//* 204  380:getfield        #233 <Field double DPoint.x>
	//* 205  383:aload           6
	//* 206  385:getfield        #235 <Field double DPoint.y>
	//* 207  388:invokespecial   #237 <Method FPoint a(GLMapState, double, double, double)>
	//* 208  391:aastore         
	//* 209  392:aload           7
	//* 210  394:iload_3         
	//* 211  395:aload_0         
	//* 212  396:aload           5
	//* 213  398:aload_0         
	//* 214  399:getfield        #58  <Field double r>
	//* 215  402:iload_3         
	//* 216  403:i2d             
	//* 217  404:dload_1         
	//* 218  405:dmul            
	//* 219  406:dadd            
	//* 220  407:aload           6
	//* 221  409:getfield        #233 <Field double DPoint.x>
	//* 222  412:aload           6
	//* 223  414:getfield        #235 <Field double DPoint.y>
	//* 224  417:invokespecial   #237 <Method FPoint a(GLMapState, double, double, double)>
	//* 225  420:aastore         
	//* 226  421:aload_0         
	//* 227  422:getfield        #191 <Field float[] n>
	//* 228  425:iload_3         
	//* 229  426:iconst_3        
	//* 230  427:imul            
	//* 231  428:aload           7
	//* 232  430:iload_3         
	//* 233  431:aaload          
	//* 234  432:getfield        #126 <Field float FPoint.x>
	//* 235  435:fastore         
	//* 236  436:aload_0         
	//* 237  437:getfield        #191 <Field float[] n>
	//* 238  440:iload_3         
	//* 239  441:iconst_3        
	//* 240  442:imul            
	//* 241  443:iconst_1        
	//* 242  444:iadd            
	//* 243  445:aload           7
	//* 244  447:iload_3         
	//* 245  448:aaload          
	//* 246  449:getfield        #132 <Field float FPoint.y>
	//* 247  452:fastore         
	//* 248  453:aload_0         
	//* 249  454:getfield        #191 <Field float[] n>
	//* 250  457:iload_3         
	//* 251  458:iconst_3        
	//* 252  459:imul            
	//* 253  460:iconst_2        
	//* 254  461:iadd            
	//* 255  462:fconst_0        
	//* 256  463:fastore         
	//* 257  464:iload_3         
	//* 258  465:iconst_1        
	//* 259  466:iadd            
	//* 260  467:istore_3        
	//* 261  468:goto            312
	//* 262  471:aload           6
	//* 263  473:invokevirtual   #238 <Method void DPoint.recycle()>
	//* 264  476:aload_0         
	//* 265  477:aload           7
	//* 266  479:arraylength     
	//* 267  480:putfield        #52  <Field int o>
	//* 268  483:iconst_1        
	//* 269  484:ireturn         
		catch(Throwable throwable)
	//* 270  485:astore          5
		{
			hm.c(throwable, "ArcDelegateImp", "calMapFPoint");
	//  271  487:aload           5
	//  272  489:ldc1            #70  <String "ArcDelegateImp">
	//  273  491:ldc1            #240 <String "calMapFPoint">
	//  274  493:invokestatic    #77  <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//  275  496:aload           5
	//  276  498:invokevirtual   #241 <Method void Throwable.printStackTrace()>
			return false;
	//  277  501:iconst_0        
	//  278  502:ireturn         
		}
		obj[1] = ((/*<invalid signature>*/java.lang.Object) (obj1));
		obj1 = ((Object) (FPoint.obtain()));
		m.a(g.latitude, g.longitude, ((FPoint) (obj1)));
		obj[2] = ((/*<invalid signature>*/java.lang.Object) (obj1));
		j1 = 0;
_L2:
		if(j1 >= 3)
			break; /* Loop/switch isn't completed */
		n[j1 * 3] = ((FPoint) (obj[j1])).x;
		n[j1 * 3 + 1] = ((FPoint) (obj[j1])).y;
		n[j1 * 3 + 2] = 0.0F;
		j1++;
		if(true) goto _L2; else goto _L1
_L1:
		j1 = obj.length;
		o = 3;
		return true;
		obj1 = ((Object) (e()));
		k1 = (int)((Math.abs(s - r) * 180D) / 3.1415926535897931D);
		d1 = (s - r) / (double)k1;
		afpoint = new FPoint[k1 + 1];
		n = new float[afpoint.length * 3];
		j1 = 0;
_L4:
		if(j1 > k1)
			break; /* Loop/switch isn't completed */
		if(j1 != k1)
			break MISSING_BLOCK_LABEL_363;
		fpoint = FPoint.obtain();
		m.a(g.latitude, g.longitude, fpoint);
		afpoint[j1] = fpoint;
		break MISSING_BLOCK_LABEL_392;
		afpoint[j1] = a(((GLMapState) (obj)), r + (double)j1 * d1, ((DPoint) (obj1)).x, ((DPoint) (obj1)).y);
		afpoint[j1] = a(((GLMapState) (obj)), r + (double)j1 * d1, ((DPoint) (obj1)).x, ((DPoint) (obj1)).y);
		n[j1 * 3] = afpoint[j1].x;
		n[j1 * 3 + 1] = afpoint[j1].y;
		n[j1 * 3 + 2] = 0.0F;
		j1++;
		if(true) goto _L4; else goto _L3
_L3:
		((DPoint) (obj1)).recycle();
		o = afpoint.length;
		return true;
	}

	public void c(LatLng latlng)
	{
		g = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field LatLng g>
	//    3    5:return          
	}

	public boolean c()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean p>
	//    2    4:ireturn         
	}

	public void destroy()
	{
		try
		{
			e = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #135 <Field LatLng e>
			f = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #142 <Field LatLng f>
			g = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #147 <Field LatLng g>
			return;
	//    9   15:return          
		}
		catch(Throwable throwable)
	//*  10   16:astore_1        
		{
			hm.c(throwable, "ArcDelegateImp", "destroy");
	//   11   17:aload_1         
	//   12   18:ldc1            #70  <String "ArcDelegateImp">
	//   13   20:ldc1            #243 <String "destroy">
	//   14   22:invokestatic    #77  <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #241 <Method void Throwable.printStackTrace()>
			Log.d("destroy erro", "ArcDelegateImp destroy");
	//   17   29:ldc1            #245 <String "destroy erro">
	//   18   31:ldc1            #247 <String "ArcDelegateImp destroy">
	//   19   33:invokestatic    #252 <Method int Log.d(String, String)>
	//   20   36:pop             
			return;
	//   21   37:return          
		}
	}

	public boolean equalsRemote(IOverlay ioverlay)
		throws RemoteException
	{
		return ((Object)this).equals(((Object) (ioverlay))) || ioverlay.getId().equals(((Object) (getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #258 <Method boolean Object.equals(Object)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:invokeinterface #261 <Method String IOverlay.getId()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #66  <Method String getId()>
	//    8   18:invokevirtual   #264 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public String getId()
		throws RemoteException
	{
		if(l == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field String l>
	//*   2    4:ifnonnull       23
			l = m.d("Arc");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #62  <Field s m>
	//    6   12:ldc2            #266 <String "Arc">
	//    7   15:invokeinterface #269 <Method String s.d(String)>
	//    8   20:putfield        #68  <Field String l>
		return l;
	//    9   23:aload_0         
	//   10   24:getfield        #68  <Field String l>
	//   11   27:areturn         
	}

	public int getStrokeColor()
		throws RemoteException
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int i>
	//    2    4:ireturn         
	}

	public float getStrokeWidth()
		throws RemoteException
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field float h>
	//    2    4:freturn         
	}

	public float getZIndex()
		throws RemoteException
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field float j>
	//    2    4:freturn         
	}

	public int hashCodeRemote()
		throws RemoteException
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isAboveMaskLayer()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isVisible()
		throws RemoteException
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean k>
	//    2    4:ireturn         
	}

	public void remove()
		throws RemoteException
	{
		m.a(getId());
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field s m>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #66  <Method String getId()>
	//    4    8:invokeinterface #280 <Method boolean s.a(String)>
	//    5   13:pop             
		m.setRunLowFrame(false);
	//    6   14:aload_0         
	//    7   15:getfield        #62  <Field s m>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #284 <Method void s.setRunLowFrame(boolean)>
	//   10   24:return          
	}

	public void setAboveMaskLayer(boolean flag)
	{
	//    0    0:return          
	}

	public void setStrokeColor(int i1)
		throws RemoteException
	{
		i = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field int i>
		a = (float)Color.alpha(i1) / 255F;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokestatic    #293 <Method int Color.alpha(int)>
	//    6   10:i2f             
	//    7   11:ldc2            #294 <Float 255F>
	//    8   14:fdiv            
	//    9   15:putfield        #210 <Field float a>
		b = (float)Color.red(i1) / 255F;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokestatic    #297 <Method int Color.red(int)>
	//   13   23:i2f             
	//   14   24:ldc2            #294 <Float 255F>
	//   15   27:fdiv            
	//   16   28:putfield        #204 <Field float b>
		c = (float)Color.green(i1) / 255F;
	//   17   31:aload_0         
	//   18   32:iload_1         
	//   19   33:invokestatic    #300 <Method int Color.green(int)>
	//   20   36:i2f             
	//   21   37:ldc2            #294 <Float 255F>
	//   22   40:fdiv            
	//   23   41:putfield        #206 <Field float c>
		d = (float)Color.blue(i1) / 255F;
	//   24   44:aload_0         
	//   25   45:iload_1         
	//   26   46:invokestatic    #303 <Method int Color.blue(int)>
	//   27   49:i2f             
	//   28   50:ldc2            #294 <Float 255F>
	//   29   53:fdiv            
	//   30   54:putfield        #208 <Field float d>
		m.setRunLowFrame(false);
	//   31   57:aload_0         
	//   32   58:getfield        #62  <Field s m>
	//   33   61:iconst_0        
	//   34   62:invokeinterface #284 <Method void s.setRunLowFrame(boolean)>
	//   35   67:return          
	}

	public void setStrokeWidth(float f1)
		throws RemoteException
	{
		h = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #43  <Field float h>
		m.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field s m>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #284 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setVisible(boolean flag)
		throws RemoteException
	{
		k = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean k>
		m.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field s m>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #284 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setZIndex(float f1)
		throws RemoteException
	{
		j = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #48  <Field float j>
		m.f();
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field s m>
	//    5    9:invokeinterface #309 <Method void s.f()>
		m.setRunLowFrame(false);
	//    6   14:aload_0         
	//    7   15:getfield        #62  <Field s m>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #284 <Method void s.setRunLowFrame(boolean)>
	//   10   24:return          
	}

	float a;
	float b;
	float c;
	float d;
	private LatLng e;
	private LatLng f;
	private LatLng g;
	private float h;
	private int i;
	private float j;
	private boolean k;
	private String l;
	private s m;
	private float n[];
	private int o;
	private boolean p;
	private double q;
	private double r;
	private double s;
}
