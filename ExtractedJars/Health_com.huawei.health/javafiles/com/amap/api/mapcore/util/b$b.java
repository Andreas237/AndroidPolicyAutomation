// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.Handler;
import com.autonavi.ae.gmap.listener.AMapWidgetListener;
import com.autonavi.amap.mapcore.MapConfig;

// Referenced classes of package com.amap.api.mapcore.util:
//			b, fq, au, fo, 
//			ag

class b$b
{

	public void a(au au1)
	{
		fo fo1;
		if(a.c == null || !a.c.isIndoorEnable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field b a>
	//*   2    4:getfield        #28  <Field MapConfig b.c>
	//*   3    7:ifnull          23
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field b a>
	//*   6   14:getfield        #28  <Field MapConfig b.c>
	//*   7   17:invokevirtual   #34  <Method boolean MapConfig.isIndoorEnable()>
	//*   8   20:ifne            24
			return;
	//    9   23:return          
		fo1 = com.amap.api.mapcore.util.b.e(a).e();
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field b a>
	//   12   28:invokestatic    #38  <Method fq b.e(b)>
	//   13   31:invokevirtual   #43  <Method fo fq.e()>
	//   14   34:astore_3        
		if(au1 == null)
	//*  15   35:aload_1         
	//*  16   36:ifnonnull       208
		{
			try
			{
				if(com.amap.api.mapcore.util.b.z(a) != null)
	//*  17   39:aload_0         
	//*  18   40:getfield        #17  <Field b a>
	//*  19   43:invokestatic    #47  <Method com.amap.api.maps.AMap$OnIndoorBuildingActiveListener b.z(b)>
	//*  20   46:ifnull          62
					com.amap.api.mapcore.util.b.z(a).OnIndoorBuilding(((com.amap.api.maps.model.IndoorBuildingInfo) (au1)));
	//   21   49:aload_0         
	//   22   50:getfield        #17  <Field b a>
	//   23   53:invokestatic    #47  <Method com.amap.api.maps.AMap$OnIndoorBuildingActiveListener b.z(b)>
	//   24   56:aload_1         
	//   25   57:invokeinterface #53  <Method void com.amap.api.maps.AMap$OnIndoorBuildingActiveListener.OnIndoorBuilding(com.amap.api.maps.model.IndoorBuildingInfo)>
			}
	//*  26   62:goto            72
			catch(Throwable throwable)
	//*  27   65:astore          4
			{
				throwable.printStackTrace();
	//   28   67:aload           4
	//   29   69:invokevirtual   #56  <Method void Throwable.printStackTrace()>
			}
			if(a.d != null)
	//*  30   72:aload_0         
	//*  31   73:getfield        #17  <Field b a>
	//*  32   76:getfield        #60  <Field au b.d>
	//*  33   79:ifnull          93
				a.d.g = null;
	//   34   82:aload_0         
	//   35   83:getfield        #17  <Field b a>
	//   36   86:getfield        #60  <Field au b.d>
	//   37   89:aconst_null     
	//   38   90:putfield        #66  <Field android.graphics.Point au.g>
			if(fo1.d())
	//*  39   93:aload_3         
	//*  40   94:invokevirtual   #70  <Method boolean fo.d()>
	//*  41   97:ifeq            120
				a.i.post(new Runnable(fo1) {

					public void run()
					{
						a.a(false);
					//    0    0:aload_0         
					//    1    1:getfield        #22  <Field fo a>
					//    2    4:iconst_0        
					//    3    5:invokevirtual   #32  <Method void fo.a(boolean)>
					//    4    8:return          
					}

					final fo a;
					final b.b b;

			
			{
				b = b.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field b$b b>
				a = fo1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field fo a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   42  100:aload_0         
	//   43  101:getfield        #17  <Field b a>
	//   44  104:getfield        #74  <Field Handler b.i>
	//   45  107:new             #9   <Class b$b$1>
	//   46  110:dup             
	//   47  111:aload_0         
	//   48  112:aload_3         
	//   49  113:invokespecial   #77  <Method void b$b$1(b$b, fo)>
	//   50  116:invokevirtual   #83  <Method boolean Handler.post(Runnable)>
	//   51  119:pop             
			MapConfig mapconfig = a.c;
	//   52  120:aload_0         
	//   53  121:getfield        #17  <Field b a>
	//   54  124:getfield        #28  <Field MapConfig b.c>
	//   55  127:astore          4
			float f;
			if(a.c.isSetLimitZoomLevel())
	//*  56  129:aload_0         
	//*  57  130:getfield        #17  <Field b a>
	//*  58  133:getfield        #28  <Field MapConfig b.c>
	//*  59  136:invokevirtual   #86  <Method boolean MapConfig.isSetLimitZoomLevel()>
	//*  60  139:ifeq            156
				f = a.c.getMaxZoomLevel();
	//   61  142:aload_0         
	//   62  143:getfield        #17  <Field b a>
	//   63  146:getfield        #28  <Field MapConfig b.c>
	//   64  149:invokevirtual   #90  <Method float MapConfig.getMaxZoomLevel()>
	//   65  152:fstore_2        
			else
	//*  66  153:goto            159
				f = 20F;
	//   67  156:ldc1            #91  <Float 20F>
	//   68  158:fstore_2        
			mapconfig.maxZoomLevel = f;
	//   69  159:aload           4
	//   70  161:fload_2         
	//   71  162:putfield        #95  <Field float MapConfig.maxZoomLevel>
			try
			{
				if(com.amap.api.mapcore.util.b.A(a).isZoomControlsEnabled())
	//*  72  165:aload_0         
	//*  73  166:getfield        #17  <Field b a>
	//*  74  169:invokestatic    #99  <Method ag b.A(b)>
	//*  75  172:invokevirtual   #104 <Method boolean ag.isZoomControlsEnabled()>
	//*  76  175:ifeq            200
					com.amap.api.mapcore.util.b.B(a).invalidateZoomController(a.c.getSZ());
	//   77  178:aload_0         
	//   78  179:getfield        #17  <Field b a>
	//   79  182:invokestatic    #108 <Method AMapWidgetListener b.B(b)>
	//   80  185:aload_0         
	//   81  186:getfield        #17  <Field b a>
	//   82  189:getfield        #28  <Field MapConfig b.c>
	//   83  192:invokevirtual   #111 <Method float MapConfig.getSZ()>
	//   84  195:invokeinterface #117 <Method void AMapWidgetListener.invalidateZoomController(float)>
				return;
	//   85  200:return          
			}
			catch(Throwable throwable1)
	//*  86  201:astore          4
			{
				throwable1.printStackTrace();
	//   87  203:aload           4
	//   88  205:invokevirtual   #56  <Method void Throwable.printStackTrace()>
			}
		}
		if(au1 != null && a.d != null && a.d.poiid.equals(((Object) (au1.poiid))) && fo1.d())
	//*  89  208:aload_1         
	//*  90  209:ifnull          250
	//*  91  212:aload_0         
	//*  92  213:getfield        #17  <Field b a>
	//*  93  216:getfield        #60  <Field au b.d>
	//*  94  219:ifnull          250
	//*  95  222:aload_0         
	//*  96  223:getfield        #17  <Field b a>
	//*  97  226:getfield        #60  <Field au b.d>
	//*  98  229:getfield        #121 <Field String au.poiid>
	//*  99  232:aload_1         
	//* 100  233:getfield        #121 <Field String au.poiid>
	//* 101  236:invokevirtual   #127 <Method boolean String.equals(Object)>
	//* 102  239:ifeq            250
	//* 103  242:aload_3         
	//* 104  243:invokevirtual   #70  <Method boolean fo.d()>
	//* 105  246:ifeq            250
			return;
	//  106  249:return          
		if(au1 != null && (a.d == null || !a.d.poiid.equals(((Object) (au1.poiid))) || a.d.g == null))
	//* 107  250:aload_1         
	//* 108  251:ifnull          335
	//* 109  254:aload_0         
	//* 110  255:getfield        #17  <Field b a>
	//* 111  258:getfield        #60  <Field au b.d>
	//* 112  261:ifnull          297
	//* 113  264:aload_0         
	//* 114  265:getfield        #17  <Field b a>
	//* 115  268:getfield        #60  <Field au b.d>
	//* 116  271:getfield        #121 <Field String au.poiid>
	//* 117  274:aload_1         
	//* 118  275:getfield        #121 <Field String au.poiid>
	//* 119  278:invokevirtual   #127 <Method boolean String.equals(Object)>
	//* 120  281:ifeq            297
	//* 121  284:aload_0         
	//* 122  285:getfield        #17  <Field b a>
	//* 123  288:getfield        #60  <Field au b.d>
	//* 124  291:getfield        #66  <Field android.graphics.Point au.g>
	//* 125  294:ifnonnull       335
		{
			a.d = au1;
	//  126  297:aload_0         
	//  127  298:getfield        #17  <Field b a>
	//  128  301:aload_1         
	//  129  302:putfield        #60  <Field au b.d>
			if(a.c != null)
	//* 130  305:aload_0         
	//* 131  306:getfield        #17  <Field b a>
	//* 132  309:getfield        #28  <Field MapConfig b.c>
	//* 133  312:ifnull          335
				a.d.g = ((android.graphics.Point) (a.c.getMapGeoCenter()));
	//  134  315:aload_0         
	//  135  316:getfield        #17  <Field b a>
	//  136  319:getfield        #60  <Field au b.d>
	//  137  322:aload_0         
	//  138  323:getfield        #17  <Field b a>
	//  139  326:getfield        #28  <Field MapConfig b.c>
	//  140  329:invokevirtual   #131 <Method com.autonavi.amap.mapcore.IPoint MapConfig.getMapGeoCenter()>
	//  141  332:putfield        #66  <Field android.graphics.Point au.g>
		}
		if(com.amap.api.mapcore.util.b.z(a) != null)
	//* 142  335:aload_0         
	//* 143  336:getfield        #17  <Field b a>
	//* 144  339:invokestatic    #47  <Method com.amap.api.maps.AMap$OnIndoorBuildingActiveListener b.z(b)>
	//* 145  342:ifnull          358
			com.amap.api.mapcore.util.b.z(a).OnIndoorBuilding(((com.amap.api.maps.model.IndoorBuildingInfo) (au1)));
	//  146  345:aload_0         
	//  147  346:getfield        #17  <Field b a>
	//  148  349:invokestatic    #47  <Method com.amap.api.maps.AMap$OnIndoorBuildingActiveListener b.z(b)>
	//  149  352:aload_1         
	//  150  353:invokeinterface #53  <Method void com.amap.api.maps.AMap$OnIndoorBuildingActiveListener.OnIndoorBuilding(com.amap.api.maps.model.IndoorBuildingInfo)>
		au1 = ((au) (a.c));
	//  151  358:aload_0         
	//  152  359:getfield        #17  <Field b a>
	//  153  362:getfield        #28  <Field MapConfig b.c>
	//  154  365:astore_1        
		if(!a.c.isSetLimitZoomLevel()) goto _L2; else goto _L1
	//  155  366:aload_0         
	//  156  367:getfield        #17  <Field b a>
	//  157  370:getfield        #28  <Field MapConfig b.c>
	//  158  373:invokevirtual   #86  <Method boolean MapConfig.isSetLimitZoomLevel()>
	//  159  376:ifeq            526
_L1:
		float f1 = a.c.getMaxZoomLevel();
	//  160  379:aload_0         
	//  161  380:getfield        #17  <Field b a>
	//  162  383:getfield        #28  <Field MapConfig b.c>
	//  163  386:invokevirtual   #90  <Method float MapConfig.getMaxZoomLevel()>
	//  164  389:fstore_2        
	//* 165  390:goto            393
_L4:
label0:
		{
			au1.maxZoomLevel = f1;
	//  166  393:aload_1         
	//  167  394:fload_2         
	//  168  395:putfield        #95  <Field float MapConfig.maxZoomLevel>
			if(com.amap.api.mapcore.util.b.A(a).isZoomControlsEnabled())
	//* 169  398:aload_0         
	//* 170  399:getfield        #17  <Field b a>
	//* 171  402:invokestatic    #99  <Method ag b.A(b)>
	//* 172  405:invokevirtual   #104 <Method boolean ag.isZoomControlsEnabled()>
	//* 173  408:ifeq            433
				com.amap.api.mapcore.util.b.B(a).invalidateZoomController(a.c.getSZ());
	//  174  411:aload_0         
	//  175  412:getfield        #17  <Field b a>
	//  176  415:invokestatic    #108 <Method AMapWidgetListener b.B(b)>
	//  177  418:aload_0         
	//  178  419:getfield        #17  <Field b a>
	//  179  422:getfield        #28  <Field MapConfig b.c>
	//  180  425:invokevirtual   #111 <Method float MapConfig.getSZ()>
	//  181  428:invokeinterface #117 <Method void AMapWidgetListener.invalidateZoomController(float)>
			if(com.amap.api.mapcore.util.b.A(a).isIndoorSwitchEnabled())
	//* 182  433:aload_0         
	//* 183  434:getfield        #17  <Field b a>
	//* 184  437:invokestatic    #99  <Method ag b.A(b)>
	//* 185  440:invokevirtual   #134 <Method boolean ag.isIndoorSwitchEnabled()>
	//* 186  443:ifeq            487
			{
				if(!fo1.d())
	//* 187  446:aload_3         
	//* 188  447:invokevirtual   #70  <Method boolean fo.d()>
	//* 189  450:ifne            464
					com.amap.api.mapcore.util.b.A(a).setIndoorSwitchEnabled(true);
	//  190  453:aload_0         
	//  191  454:getfield        #17  <Field b a>
	//  192  457:invokestatic    #99  <Method ag b.A(b)>
	//  193  460:iconst_1        
	//  194  461:invokevirtual   #138 <Method void ag.setIndoorSwitchEnabled(boolean)>
				a.i.post(new Runnable(fo1) {

					public void run()
					{
						try
						{
							a.a(b.a.d.floor_names);
					//    0    0:aload_0         
					//    1    1:getfield        #22  <Field fo a>
					//    2    4:aload_0         
					//    3    5:getfield        #20  <Field b$b b>
					//    4    8:getfield        #32  <Field b b$b.a>
					//    5   11:getfield        #36  <Field au b.d>
					//    6   14:getfield        #42  <Field String[] au.floor_names>
					//    7   17:invokevirtual   #47  <Method void fo.a(String[])>
							a.a(b.a.d.activeFloorName);
					//    8   20:aload_0         
					//    9   21:getfield        #22  <Field fo a>
					//   10   24:aload_0         
					//   11   25:getfield        #20  <Field b$b b>
					//   12   28:getfield        #32  <Field b b$b.a>
					//   13   31:getfield        #36  <Field au b.d>
					//   14   34:getfield        #51  <Field String au.activeFloorName>
					//   15   37:invokevirtual   #54  <Method void fo.a(String)>
							if(!a.d())
					//*  16   40:aload_0         
					//*  17   41:getfield        #22  <Field fo a>
					//*  18   44:invokevirtual   #57  <Method boolean fo.d()>
					//*  19   47:ifne            58
								a.a(true);
					//   20   50:aload_0         
					//   21   51:getfield        #22  <Field fo a>
					//   22   54:iconst_1        
					//   23   55:invokevirtual   #60  <Method void fo.a(boolean)>
							return;
					//   24   58:return          
						}
						catch(Throwable throwable2)
					//*  25   59:astore_1        
						{
							throwable2.printStackTrace();
					//   26   60:aload_1         
					//   27   61:invokevirtual   #63  <Method void Throwable.printStackTrace()>
						}
					//   28   64:return          
					}

					final fo a;
					final b.b b;

			
			{
				b = b.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field b$b b>
				a = fo1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field fo a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//  195  464:aload_0         
	//  196  465:getfield        #17  <Field b a>
	//  197  468:getfield        #74  <Field Handler b.i>
	//  198  471:new             #11  <Class b$b$2>
	//  199  474:dup             
	//  200  475:aload_0         
	//  201  476:aload_3         
	//  202  477:invokespecial   #139 <Method void b$b$2(b$b, fo)>
	//  203  480:invokevirtual   #83  <Method boolean Handler.post(Runnable)>
	//  204  483:pop             
				break label0;
	//  205  484:goto            519
			}
			try
			{
				if(!com.amap.api.mapcore.util.b.A(a).isIndoorSwitchEnabled() && fo1.d())
	//* 206  487:aload_0         
	//* 207  488:getfield        #17  <Field b a>
	//* 208  491:invokestatic    #99  <Method ag b.A(b)>
	//* 209  494:invokevirtual   #134 <Method boolean ag.isIndoorSwitchEnabled()>
	//* 210  497:ifne            519
	//* 211  500:aload_3         
	//* 212  501:invokevirtual   #70  <Method boolean fo.d()>
	//* 213  504:ifeq            519
				{
					com.amap.api.mapcore.util.b.A(a).setIndoorSwitchEnabled(false);
	//  214  507:aload_0         
	//  215  508:getfield        #17  <Field b a>
	//  216  511:invokestatic    #99  <Method ag b.A(b)>
	//  217  514:iconst_0        
	//  218  515:invokevirtual   #138 <Method void ag.setIndoorSwitchEnabled(boolean)>
					return;
	//  219  518:return          
				}
			}
	//* 220  519:return          
			// Misplaced declaration of an exception variable
			catch(au au1)
	//* 221  520:astore_1        
			{
				((Throwable) (au1)).printStackTrace();
	//  222  521:aload_1         
	//  223  522:invokevirtual   #56  <Method void Throwable.printStackTrace()>
				return;
	//  224  525:return          
			}
		}
		return;
_L2:
		f1 = 20F;
	//  225  526:ldc1            #91  <Float 20F>
	//  226  528:fstore_2        
		if(true) goto _L4; else goto _L3
	//  227  529:goto            393
_L3:
	}

	final b a;

	b$b(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
