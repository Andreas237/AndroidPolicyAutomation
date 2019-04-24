// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.*;
import android.text.TextUtils;
import android.util.*;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.amap.api.maps.*;
import com.amap.api.maps.model.*;
import com.autonavi.ae.gmap.*;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.ae.gmap.glinterface.MapLabelItem;
import com.autonavi.ae.gmap.gloverlay.*;
import com.autonavi.ae.gmap.listener.AMapWidgetListener;
import com.autonavi.ae.gmap.style.StyleItem;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.animation.GLAlphaAnimation;
import com.autonavi.amap.mapcore.interfaces.IAMapListener;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import com.autonavi.amap.mapcore.message.AbstractGestureMapMessage;
import com.autonavi.amap.mapcore.tools.GLConvertUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.amap.api.mapcore.util:
//			s, f, hm, eo, 
//			go, l, ee, o, 
//			t, ag, fq, fo, 
//			q, af, y, n, 
//			ad, g, do, aw, 
//			z, j, ax, bb, 
//			ds, r, du, dw, 
//			ab, fd, fm, h, 
//			k, ew, dg, dj, 
//			al, aa, dk, eb, 
//			ea, fb, eu, au, 
//			fp, fs, u, v, 
//			dr, gp, fn

public class com.amap.api.mapcore.util.b
	implements dw.a, s, IAMapListener
{
	static abstract class a
		implements Runnable
	{

		public void run()
		{
			b = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #23  <Field boolean b>
		//    3    5:return          
		}

		boolean b;
		boolean c;
		int d;
		int e;
		int f;
		int g;

		private a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			b = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #23  <Field boolean b>
			c = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #25  <Field boolean c>
		//    8   14:return          
		}

	}

	class b
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
						com.amap.api.mapcore.util.b.z(a).OnIndoorBuilding(((IndoorBuildingInfo) (au1)));
		//   21   49:aload_0         
		//   22   50:getfield        #17  <Field b a>
		//   23   53:invokestatic    #47  <Method com.amap.api.maps.AMap$OnIndoorBuildingActiveListener b.z(b)>
		//   24   56:aload_1         
		//   25   57:invokeinterface #53  <Method void com.amap.api.maps.AMap$OnIndoorBuildingActiveListener.OnIndoorBuilding(IndoorBuildingInfo)>
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
		//   38   90:putfield        #66  <Field Point au.g>
				if(fo1.d())
		//*  39   93:aload_3         
		//*  40   94:invokevirtual   #70  <Method boolean fo.d()>
		//*  41   97:ifeq            120
					a.i.post(new Runnable(this, fo1) {

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
						final b b;

			
			{
				b = b1;
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
				float f1;
				if(a.c.isSetLimitZoomLevel())
		//*  56  129:aload_0         
		//*  57  130:getfield        #17  <Field b a>
		//*  58  133:getfield        #28  <Field MapConfig b.c>
		//*  59  136:invokevirtual   #86  <Method boolean MapConfig.isSetLimitZoomLevel()>
		//*  60  139:ifeq            156
					f1 = a.c.getMaxZoomLevel();
		//   61  142:aload_0         
		//   62  143:getfield        #17  <Field b a>
		//   63  146:getfield        #28  <Field MapConfig b.c>
		//   64  149:invokevirtual   #90  <Method float MapConfig.getMaxZoomLevel()>
		//   65  152:fstore_2        
				else
		//*  66  153:goto            159
					f1 = 20F;
		//   67  156:ldc1            #91  <Float 20F>
		//   68  158:fstore_2        
				mapconfig.maxZoomLevel = f1;
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
		//* 124  291:getfield        #66  <Field Point au.g>
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
					a.d.g = ((Point) (a.c.getMapGeoCenter()));
		//  134  315:aload_0         
		//  135  316:getfield        #17  <Field b a>
		//  136  319:getfield        #60  <Field au b.d>
		//  137  322:aload_0         
		//  138  323:getfield        #17  <Field b a>
		//  139  326:getfield        #28  <Field MapConfig b.c>
		//  140  329:invokevirtual   #131 <Method IPoint MapConfig.getMapGeoCenter()>
		//  141  332:putfield        #66  <Field Point au.g>
			}
			if(com.amap.api.mapcore.util.b.z(a) != null)
		//* 142  335:aload_0         
		//* 143  336:getfield        #17  <Field b a>
		//* 144  339:invokestatic    #47  <Method com.amap.api.maps.AMap$OnIndoorBuildingActiveListener b.z(b)>
		//* 145  342:ifnull          358
				com.amap.api.mapcore.util.b.z(a).OnIndoorBuilding(((IndoorBuildingInfo) (au1)));
		//  146  345:aload_0         
		//  147  346:getfield        #17  <Field b a>
		//  148  349:invokestatic    #47  <Method com.amap.api.maps.AMap$OnIndoorBuildingActiveListener b.z(b)>
		//  149  352:aload_1         
		//  150  353:invokeinterface #53  <Method void com.amap.api.maps.AMap$OnIndoorBuildingActiveListener.OnIndoorBuilding(IndoorBuildingInfo)>
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
			float f2 = a.c.getMaxZoomLevel();
		//  160  379:aload_0         
		//  161  380:getfield        #17  <Field b a>
		//  162  383:getfield        #28  <Field MapConfig b.c>
		//  163  386:invokevirtual   #90  <Method float MapConfig.getMaxZoomLevel()>
		//  164  389:fstore_2        
		//* 165  390:goto            393
_L4:
label0:
			{
				au1.maxZoomLevel = f2;
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
					a.i.post(new Runnable(this, fo1) {

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
							catch(Throwable throwable)
						//*  25   59:astore_1        
							{
								throwable.printStackTrace();
						//   26   60:aload_1         
						//   27   61:invokevirtual   #63  <Method void Throwable.printStackTrace()>
							}
						//   28   64:return          
						}

						final fo a;
						final b b;

			
			{
				b = b1;
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
			f2 = 20F;
		//  225  526:ldc1            #91  <Float 20F>
		//  226  528:fstore_2        
			if(true) goto _L4; else goto _L3
		//  227  529:goto            393
_L3:
		}

		final com.amap.api.mapcore.util.b a;

		b()
		{
			a = com.amap.api.mapcore.util.b.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field b a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}

	class c
		implements fo.a
	{

		public void a(int i1)
		{
			if(a.d != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field b a>
		//*   2    4:getfield        #29  <Field au b.d>
		//*   3    7:ifnull          74
			{
				a.d.activeFloorIndex = a.d.floor_indexs[i1];
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field b a>
		//    6   14:getfield        #29  <Field au b.d>
		//    7   17:aload_0         
		//    8   18:getfield        #15  <Field b a>
		//    9   21:getfield        #29  <Field au b.d>
		//   10   24:getfield        #35  <Field int[] au.floor_indexs>
		//   11   27:iload_1         
		//   12   28:iaload          
		//   13   29:putfield        #39  <Field int au.activeFloorIndex>
				a.d.activeFloorName = a.d.floor_names[i1];
		//   14   32:aload_0         
		//   15   33:getfield        #15  <Field b a>
		//   16   36:getfield        #29  <Field au b.d>
		//   17   39:aload_0         
		//   18   40:getfield        #15  <Field b a>
		//   19   43:getfield        #29  <Field au b.d>
		//   20   46:getfield        #43  <Field String[] au.floor_names>
		//   21   49:iload_1         
		//   22   50:aaload          
		//   23   51:putfield        #47  <Field String au.activeFloorName>
				try
				{
					a.setIndoorBuildingInfo(((IndoorBuildingInfo) (a.d)));
		//   24   54:aload_0         
		//   25   55:getfield        #15  <Field b a>
		//   26   58:aload_0         
		//   27   59:getfield        #15  <Field b a>
		//   28   62:getfield        #29  <Field au b.d>
		//   29   65:invokevirtual   #51  <Method void b.setIndoorBuildingInfo(IndoorBuildingInfo)>
					return;
		//   30   68:return          
				}
				catch(RemoteException remoteexception)
		//*  31   69:astore_2        
				{
					remoteexception.printStackTrace();
		//   32   70:aload_2         
		//   33   71:invokevirtual   #54  <Method void RemoteException.printStackTrace()>
				}
			}
		//   34   74:return          
		}

		final com.amap.api.mapcore.util.b a;

		private c()
		{
			a = com.amap.api.mapcore.util.b.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field b a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	class d
		implements Runnable
	{

		public boolean equals(Object obj)
		{
			return obj instanceof d;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class b$d>
		//    2    4:ireturn         
		}

		public void run()
		{
			boolean flag;
			boolean flag1;
			boolean flag2;
			boolean flag3;
			boolean flag4;
			flag3 = true;
		//    0    0:iconst_1        
		//    1    1:istore          4
			flag4 = true;
		//    2    3:iconst_1        
		//    3    4:istore          5
			flag2 = true;
		//    4    6:iconst_1        
		//    5    7:istore_3        
			flag = flag3;
		//    6    8:iload           4
		//    7   10:istore_1        
			flag1 = flag4;
		//    8   11:iload           5
		//    9   13:istore_2        
			Context context = b.getApplicationContext();
		//   10   14:aload_0         
		//   11   15:getfield        #24  <Field Context b>
		//   12   18:invokevirtual   #38  <Method Context Context.getApplicationContext()>
		//   13   21:astore          6
			flag = flag3;
		//   14   23:iload           4
		//   15   25:istore_1        
			flag1 = flag4;
		//   16   26:iload           5
		//   17   28:istore_2        
			Object obj1 = ((Object) (fd.c(context)));
		//   18   29:aload           6
		//   19   31:invokestatic    #43  <Method String fd.c(Context)>
		//   20   34:astore          8
			flag = flag3;
		//   21   36:iload           4
		//   22   38:istore_1        
			flag1 = flag4;
		//   23   39:iload           5
		//   24   41:istore_2        
			String s1 = fd.a(context);
		//   25   42:aload           6
		//   26   44:invokestatic    #45  <Method String fd.a(Context)>
		//   27   47:astore          7
			flag = flag3;
		//   28   49:iload           4
		//   29   51:istore_1        
			flag1 = flag4;
		//   30   52:iload           5
		//   31   54:istore_2        
			obj1 = ((Object) (new File(((String) (obj1)))));
		//   32   55:new             #47  <Class File>
		//   33   58:dup             
		//   34   59:aload           8
		//   35   61:invokespecial   #50  <Method void File(String)>
		//   36   64:astore          8
			flag = flag3;
		//   37   66:iload           4
		//   38   68:istore_1        
			flag1 = flag4;
		//   39   69:iload           5
		//   40   71:istore_2        
			if(!((File) (obj1)).exists()) goto _L2; else goto _L1
		//   41   72:aload           8
		//   42   74:invokevirtual   #54  <Method boolean File.exists()>
		//   43   77:ifeq            103
_L1:
			if(false) goto _L4; else goto _L3
		//   44   80:iconst_1        
		//   45   81:ifeq            305
_L3:
			flag = flag3;
		//   46   84:iload           4
		//   47   86:istore_1        
			flag1 = flag4;
		//   48   87:iload           5
		//   49   89:istore_2        
			if(!FileUtil.deleteFile(((File) (obj1)))) goto _L4; else goto _L5
		//   50   90:aload           8
		//   51   92:invokestatic    #60  <Method boolean FileUtil.deleteFile(File)>
		//   52   95:ifeq            305
_L5:
			flag = true;
		//   53   98:iconst_1        
		//   54   99:istore_1        
			  goto _L6
		//*  55  100:goto            307
_L2:
			if(!flag2) goto _L8; else goto _L7
		//   56  103:iload_3         
		//   57  104:ifeq            312
_L7:
			flag = flag2;
		//   58  107:iload_3         
		//   59  108:istore_1        
			flag1 = flag2;
		//   60  109:iload_3         
		//   61  110:istore_2        
			if(!FileUtil.deleteFile(new File(s1))) goto _L8; else goto _L9
		//   62  111:new             #47  <Class File>
		//   63  114:dup             
		//   64  115:aload           7
		//   65  117:invokespecial   #50  <Method void File(String)>
		//   66  120:invokestatic    #60  <Method boolean FileUtil.deleteFile(File)>
		//   67  123:ifeq            312
_L9:
			flag1 = true;
		//   68  126:iconst_1        
		//   69  127:istore_2        
		//*  70  128:goto            131
_L10:
			if(!flag1)
				break MISSING_BLOCK_LABEL_317;
		//   71  131:iload_2         
		//   72  132:ifeq            317
			flag = flag1;
		//   73  135:iload_2         
		//   74  136:istore_1        
			if(!fd.e(context))
				break MISSING_BLOCK_LABEL_317;
		//   75  137:aload           6
		//   76  139:invokestatic    #64  <Method boolean fd.e(Context)>
		//   77  142:ifeq            317
			flag2 = true;
		//   78  145:iconst_1        
		//   79  146:istore_3        
		//*  80  147:goto            150
_L11:
			flag = flag2;
		//   81  150:iload_3         
		//   82  151:istore_1        
			flag1 = flag2;
		//   83  152:iload_3         
		//   84  153:istore_2        
			if(com.amap.api.mapcore.util.b.i(a) == null)
				break MISSING_BLOCK_LABEL_178;
		//   85  154:aload_0         
		//   86  155:getfield        #19  <Field b a>
		//   87  158:invokestatic    #68  <Method af b.i(b)>
		//   88  161:ifnull          178
			flag = flag2;
		//   89  164:iload_3         
		//   90  165:istore_1        
			flag1 = flag2;
		//   91  166:iload_3         
		//   92  167:istore_2        
			com.amap.api.mapcore.util.b.i(a).h();
		//   93  168:aload_0         
		//   94  169:getfield        #19  <Field b a>
		//   95  172:invokestatic    #68  <Method af b.i(b)>
		//   96  175:invokevirtual   #73  <Method void af.h()>
			try
			{
				if(a.f != null && c != null)
		//*  97  178:aload_0         
		//*  98  179:getfield        #19  <Field b a>
		//*  99  182:getfield        #77  <Field GLMapEngine b.f>
		//* 100  185:ifnull          205
		//* 101  188:aload_0         
		//* 102  189:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
		//* 103  192:ifnull          205
					c.onRemoveCacheFinish(flag2);
		//  104  195:aload_0         
		//  105  196:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
		//  106  199:iload_3         
		//  107  200:invokeinterface #83  <Method void com.amap.api.maps.AMap$OnCacheRemoveListener.onRemoveCacheFinish(boolean)>
				return;
		//  108  205:return          
			}
			catch(Throwable throwable)
		//* 109  206:astore          6
			{
				throwable.printStackTrace();
		//  110  208:aload           6
		//  111  210:invokevirtual   #86  <Method void Throwable.printStackTrace()>
			}
			return;
		//  112  213:return          
			Object obj;
			obj;
		//  113  214:astore          6
			flag1 = flag;
		//  114  216:iload_1         
		//  115  217:istore_2        
			hm.c(((Throwable) (obj)), "AMapDelegateImp", "RemoveCacheRunnable");
		//  116  218:aload           6
		//  117  220:ldc1            #88  <String "AMapDelegateImp">
		//  118  222:ldc1            #90  <String "RemoveCacheRunnable">
		//  119  224:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
			try
			{
				if(a.f != null && c != null)
		//* 120  227:aload_0         
		//* 121  228:getfield        #19  <Field b a>
		//* 122  231:getfield        #77  <Field GLMapEngine b.f>
		//* 123  234:ifnull          254
		//* 124  237:aload_0         
		//* 125  238:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
		//* 126  241:ifnull          254
					c.onRemoveCacheFinish(false);
		//  127  244:aload_0         
		//  128  245:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
		//  129  248:iconst_0        
		//  130  249:invokeinterface #83  <Method void com.amap.api.maps.AMap$OnCacheRemoveListener.onRemoveCacheFinish(boolean)>
				return;
		//  131  254:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 132  255:astore          6
			{
				((Throwable) (obj)).printStackTrace();
		//  133  257:aload           6
		//  134  259:invokevirtual   #86  <Method void Throwable.printStackTrace()>
			}
			return;
		//  135  262:return          
			obj;
		//  136  263:astore          6
			try
			{
				if(a.f != null && c != null)
		//* 137  265:aload_0         
		//* 138  266:getfield        #19  <Field b a>
		//* 139  269:getfield        #77  <Field GLMapEngine b.f>
		//* 140  272:ifnull          292
		//* 141  275:aload_0         
		//* 142  276:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
		//* 143  279:ifnull          292
					c.onRemoveCacheFinish(flag1);
		//  144  282:aload_0         
		//  145  283:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
		//  146  286:iload_2         
		//  147  287:invokeinterface #83  <Method void com.amap.api.maps.AMap$OnCacheRemoveListener.onRemoveCacheFinish(boolean)>
			}
		//* 148  292:goto            302
			catch(Throwable throwable1)
		//* 149  295:astore          7
			{
				throwable1.printStackTrace();
		//  150  297:aload           7
		//  151  299:invokevirtual   #86  <Method void Throwable.printStackTrace()>
			}
			throw obj;
		//  152  302:aload           6
		//  153  304:athrow          
_L4:
			flag = false;
		//  154  305:iconst_0        
		//  155  306:istore_1        
_L6:
			flag2 = flag;
		//  156  307:iload_1         
		//  157  308:istore_3        
			  goto _L2
		//* 158  309:goto            103
_L8:
			flag1 = false;
		//  159  312:iconst_0        
		//  160  313:istore_2        
			  goto _L10
		//* 161  314:goto            131
			flag2 = false;
		//  162  317:iconst_0        
		//  163  318:istore_3        
			  goto _L11
		//* 164  319:goto            150
		}

		final com.amap.api.mapcore.util.b a;
		private Context b;
		private com.amap.api.maps.AMap.OnCacheRemoveListener c;

		public d(Context context, com.amap.api.maps.AMap.OnCacheRemoveListener oncacheremovelistener)
		{
			a = com.amap.api.mapcore.util.b.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field b a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			b = context;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Context b>
			c = oncacheremovelistener;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
		//   11   19:return          
		}
	}


	public com.amap.api.mapcore.util.b(t t1, Context context, AttributeSet attributeset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #299 <Method void Object()>
		G = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #301 <Field com.amap.api.maps.AMap$onMapPrintScreenListener G>
		H = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #303 <Field com.amap.api.maps.AMap$OnMapScreenShotListener H>
		K = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #305 <Field do K>
		a = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #307 <Field boolean a>
		O = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #309 <Field boolean O>
		T = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #311 <Field boolean T>
		V = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #313 <Field boolean V>
		Y = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #315 <Field boolean Y>
		c = new MapConfig(true);
	//   26   44:aload_0         
	//   27   45:new             #317 <Class MapConfig>
	//   28   48:dup             
	//   29   49:iconst_1        
	//   30   50:invokespecial   #320 <Method void MapConfig(boolean)>
	//   31   53:putfield        #322 <Field MapConfig c>
		Z = false;
	//   32   56:aload_0         
	//   33   57:iconst_0        
	//   34   58:putfield        #324 <Field boolean Z>
		aa = false;
	//   35   61:aload_0         
	//   36   62:iconst_0        
	//   37   63:putfield        #326 <Field boolean aa>
		ad = false;
	//   38   66:aload_0         
	//   39   67:iconst_0        
	//   40   68:putfield        #328 <Field boolean ad>
		ae = null;
	//   41   71:aload_0         
	//   42   72:aconst_null     
	//   43   73:putfield        #330 <Field Marker ae>
		af = null;
	//   44   76:aload_0         
	//   45   77:aconst_null     
	//   46   78:putfield        #332 <Field k af>
		ag = false;
	//   47   81:aload_0         
	//   48   82:iconst_0        
	//   49   83:putfield        #334 <Field boolean ag>
		ah = false;
	//   50   86:aload_0         
	//   51   87:iconst_0        
	//   52   88:putfield        #336 <Field boolean ah>
		ai = false;
	//   53   91:aload_0         
	//   54   92:iconst_0        
	//   55   93:putfield        #338 <Field boolean ai>
		aj = false;
	//   56   96:aload_0         
	//   57   97:iconst_0        
	//   58   98:putfield        #340 <Field boolean aj>
		ak = false;
	//   59  101:aload_0         
	//   60  102:iconst_0        
	//   61  103:putfield        #342 <Field boolean ak>
		al = true;
	//   62  106:aload_0         
	//   63  107:iconst_1        
	//   64  108:putfield        #344 <Field boolean al>
		am = new Rect();
	//   65  111:aload_0         
	//   66  112:new             #346 <Class Rect>
	//   67  115:dup             
	//   68  116:invokespecial   #347 <Method void Rect()>
	//   69  119:putfield        #349 <Field Rect am>
		an = 1;
	//   70  122:aload_0         
	//   71  123:iconst_1        
	//   72  124:putfield        #351 <Field int an>
		ao = null;
	//   73  127:aload_0         
	//   74  128:aconst_null     
	//   75  129:putfield        #353 <Field MyTrafficStyle ao>
		ar = false;
	//   76  132:aload_0         
	//   77  133:iconst_0        
	//   78  134:putfield        #355 <Field boolean ar>
		as = false;
	//   79  137:aload_0         
	//   80  138:iconst_0        
	//   81  139:putfield        #357 <Field boolean as>
		at = false;
	//   82  142:aload_0         
	//   83  143:iconst_0        
	//   84  144:putfield        #359 <Field boolean at>
		au = 0;
	//   85  147:aload_0         
	//   86  148:iconst_0        
	//   87  149:putfield        #361 <Field int au>
		ax = -1;
	//   88  152:aload_0         
	//   89  153:iconst_m1       
	//   90  154:putfield        #363 <Field int ax>
		ay = -1;
	//   91  157:aload_0         
	//   92  158:iconst_m1       
	//   93  159:putfield        #365 <Field int ay>
		az = ((List) (new ArrayList()));
	//   94  162:aload_0         
	//   95  163:new             #367 <Class ArrayList>
	//   96  166:dup             
	//   97  167:invokespecial   #368 <Method void ArrayList()>
	//   98  170:putfield        #370 <Field List az>
		aF = false;
	//   99  173:aload_0         
	//  100  174:iconst_0        
	//  101  175:putfield        #372 <Field boolean aF>
		aG = 0.0F;
	//  102  178:aload_0         
	//  103  179:fconst_0        
	//  104  180:putfield        #374 <Field float aG>
		aH = 1.0F;
	//  105  183:aload_0         
	//  106  184:fconst_1        
	//  107  185:putfield        #376 <Field float aH>
		aI = 1.0F;
	//  108  188:aload_0         
	//  109  189:fconst_1        
	//  110  190:putfield        #378 <Field float aI>
		aJ = false;
	//  111  193:aload_0         
	//  112  194:iconst_0        
	//  113  195:putfield        #380 <Field boolean aJ>
		aK = true;
	//  114  198:aload_0         
	//  115  199:iconst_1        
	//  116  200:putfield        #382 <Field boolean aK>
		aL = false;
	//  117  203:aload_0         
	//  118  204:iconst_0        
	//  119  205:putfield        #384 <Field boolean aL>
		aM = false;
	//  120  208:aload_0         
	//  121  209:iconst_0        
	//  122  210:putfield        #386 <Field boolean aM>
		aN = 0;
	//  123  213:aload_0         
	//  124  214:iconst_0        
	//  125  215:putfield        #388 <Field int aN>
		aO = false;
	//  126  218:aload_0         
	//  127  219:iconst_0        
	//  128  220:putfield        #390 <Field boolean aO>
		aP = false;
	//  129  223:aload_0         
	//  130  224:iconst_0        
	//  131  225:putfield        #392 <Field boolean aP>
		aQ = false;
	//  132  228:aload_0         
	//  133  229:iconst_0        
	//  134  230:putfield        #394 <Field boolean aQ>
		aR = false;
	//  135  233:aload_0         
	//  136  234:iconst_0        
	//  137  235:putfield        #396 <Field boolean aR>
		aS = ((Lock) (new ReentrantLock()));
	//  138  238:aload_0         
	//  139  239:new             #398 <Class ReentrantLock>
	//  140  242:dup             
	//  141  243:invokespecial   #399 <Method void ReentrantLock()>
	//  142  246:putfield        #401 <Field Lock aS>
		aT = 0;
	//  143  249:aload_0         
	//  144  250:iconst_0        
	//  145  251:putfield        #403 <Field int aT>
	//  146  254:aload_0         
	//  147  255:new             #12  <Class b$1>
	//  148  258:dup             
	//  149  259:aload_0         
	//  150  260:invokestatic    #409 <Method Looper Looper.getMainLooper()>
	//  151  263:invokespecial   #412 <Method void b$1(b, Looper)>
	//  152  266:putfield        #414 <Field Handler i>
		ba = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #22  <Method void b$a.run()>
				try
				{
					a.setTrafficEnabled(c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field boolean c>
			//    6   12:invokevirtual   #30  <Method void b.setTrafficEnabled(boolean)>
					return;
			//    7   15:return          
				}
				catch(Throwable throwable)
			//*   8   16:astore_1        
				{
					throwable.printStackTrace();
			//    9   17:aload_1         
			//   10   18:invokevirtual   #33  <Method void Throwable.printStackTrace()>
				}
			//   11   21:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  153  269:aload_0         
	//  154  270:new             #16  <Class b$11>
	//  155  273:dup             
	//  156  274:aload_0         
	//  157  275:invokespecial   #417 <Method void b$11(b)>
	//  158  278:putfield        #419 <Field b$a ba>
		bb = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #20  <Method void b$a.run()>
				a.a(g, c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field int g>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field boolean c>
			//    8   16:invokevirtual   #31  <Method void b.a(int, boolean)>
			//    9   19:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  159  281:aload_0         
	//  160  282:new             #38  <Class b$21>
	//  161  285:dup             
	//  162  286:aload_0         
	//  163  287:invokespecial   #420 <Method void b$21(b)>
	//  164  290:putfield        #422 <Field b$a bb>
		bc = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #22  <Method void b$a.run()>
				try
				{
					a.setCenterToPixel(com.amap.api.mapcore.util.b.o(a), com.amap.api.mapcore.util.b.p(a));
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #12  <Field b a>
			//    6   12:invokestatic    #26  <Method int b.o(b)>
			//    7   15:aload_0         
			//    8   16:getfield        #12  <Field b a>
			//    9   19:invokestatic    #29  <Method int b.p(b)>
			//   10   22:invokevirtual   #33  <Method void b.setCenterToPixel(int, int)>
					return;
			//   11   25:return          
				}
				catch(Throwable throwable)
			//*  12   26:astore_1        
				{
					throwable.printStackTrace();
			//   13   27:aload_1         
			//   14   28:invokevirtual   #36  <Method void Throwable.printStackTrace()>
				}
			//   15   31:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  165  293:aload_0         
	//  166  294:new             #62  <Class b$32>
	//  167  297:dup             
	//  168  298:aload_0         
	//  169  299:invokespecial   #423 <Method void b$32(b)>
	//  170  302:putfield        #425 <Field b$a bc>
		bd = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #20  <Method void b$a.run()>
				a.b(g, d, e, f);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field int g>
			//    6   12:aload_0         
			//    7   13:getfield        #27  <Field int d>
			//    8   16:aload_0         
			//    9   17:getfield        #30  <Field int e>
			//   10   20:aload_0         
			//   11   21:getfield        #33  <Field int f>
			//   12   24:invokevirtual   #37  <Method void b.b(int, int, int, int)>
			//   13   27:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  171  305:aload_0         
	//  172  306:new             #78  <Class b$39>
	//  173  309:dup             
	//  174  310:aload_0         
	//  175  311:invokespecial   #426 <Method void b$39(b)>
	//  176  314:putfield        #428 <Field b$a bd>
		be = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #20  <Method void b$a.run()>
				a.setMapCustomEnable(c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field boolean c>
			//    6   12:invokevirtual   #28  <Method void b.setMapCustomEnable(boolean)>
			//    7   15:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  177  317:aload_0         
	//  178  318:new             #82  <Class b$40>
	//  179  321:dup             
	//  180  322:aload_0         
	//  181  323:invokespecial   #429 <Method void b$40(b)>
	//  182  326:putfield        #431 <Field b$a be>
		bf = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #20  <Method void b$a.run()>
				a.b(g, c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field int g>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field boolean c>
			//    8   16:invokevirtual   #32  <Method void b.b(int, boolean)>
			//    9   19:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  183  329:aload_0         
	//  184  330:new             #84  <Class b$41>
	//  185  333:dup             
	//  186  334:aload_0         
	//  187  335:invokespecial   #432 <Method void b$41(b)>
	//  188  338:putfield        #434 <Field b$a bf>
		bg = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #20  <Method void b$a.run()>
				a.c(g, c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field int g>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field boolean c>
			//    8   16:invokevirtual   #31  <Method void b.c(int, boolean)>
			//    9   19:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  189  341:aload_0         
	//  190  342:new             #86  <Class b$42>
	//  191  345:dup             
	//  192  346:aload_0         
	//  193  347:invokespecial   #435 <Method void b$42(b)>
	//  194  350:putfield        #437 <Field b$a bg>
		bh = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #22  <Method void b$a.run()>
				try
				{
					a.setMapTextEnable(c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field boolean c>
			//    6   12:invokevirtual   #30  <Method void b.setMapTextEnable(boolean)>
					return;
			//    7   15:return          
				}
				catch(Throwable throwable)
			//*   8   16:astore_1        
				{
					throwable.printStackTrace();
			//    9   17:aload_1         
			//   10   18:invokevirtual   #33  <Method void Throwable.printStackTrace()>
				}
			//   11   21:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  195  353:aload_0         
	//  196  354:new             #88  <Class b$43>
	//  197  357:dup             
	//  198  358:aload_0         
	//  199  359:invokespecial   #438 <Method void b$43(b)>
	//  200  362:putfield        #440 <Field b$a bh>
		bi = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #20  <Method void b$a.run()>
				a.e(g, c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field int g>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field boolean c>
			//    8   16:invokevirtual   #32  <Method void b.e(int, boolean)>
			//    9   19:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  201  365:aload_0         
	//  202  366:new             #34  <Class b$2>
	//  203  369:dup             
	//  204  370:aload_0         
	//  205  371:invokespecial   #441 <Method void b$2(b)>
	//  206  374:putfield        #443 <Field b$a bi>
		bj = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #20  <Method void b$a.run()>
				a.f(g, c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field int g>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field boolean c>
			//    8   16:invokevirtual   #32  <Method void b.f(int, boolean)>
			//    9   19:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  207  377:aload_0         
	//  208  378:new             #56  <Class b$3>
	//  209  381:dup             
	//  210  382:aload_0         
	//  211  383:invokespecial   #444 <Method void b$3(b)>
	//  212  386:putfield        #446 <Field b$a bj>
		bk = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #20  <Method void b$a.run()>
				a.d(g, c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field int g>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field boolean c>
			//    8   16:invokevirtual   #32  <Method void b.d(int, boolean)>
			//    9   19:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  213  389:aload_0         
	//  214  390:new             #80  <Class b$4>
	//  215  393:dup             
	//  216  394:aload_0         
	//  217  395:invokespecial   #447 <Method void b$4(b)>
	//  218  398:putfield        #449 <Field b$a bk>
		bl = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #22  <Method void b$a.run()>
				try
				{
					a.setIndoorEnabled(c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field boolean c>
			//    6   12:invokevirtual   #30  <Method void b.setIndoorEnabled(boolean)>
					return;
			//    7   15:return          
				}
				catch(Throwable throwable)
			//*   8   16:astore_1        
				{
					throwable.printStackTrace();
			//    9   17:aload_1         
			//   10   18:invokevirtual   #33  <Method void Throwable.printStackTrace()>
				}
			//   11   21:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  219  401:aload_0         
	//  220  402:new             #90  <Class b$5>
	//  221  405:dup             
	//  222  406:aload_0         
	//  223  407:invokespecial   #450 <Method void b$5(b)>
	//  224  410:putfield        #452 <Field b$a bl>
		bm = new Runnable() {

			public void run()
			{
				if(com.amap.api.mapcore.util.b.e(a) != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field b a>
			//*   2    4:invokestatic    #23  <Method fq b.e(b)>
			//*   3    7:ifnull          29
				{
					fs fs1 = com.amap.api.mapcore.util.b.e(a).h();
			//    4   10:aload_0         
			//    5   11:getfield        #14  <Field b a>
			//    6   14:invokestatic    #23  <Method fq b.e(b)>
			//    7   17:invokevirtual   #29  <Method fs fq.h()>
			//    8   20:astore_1        
					if(fs1 != null)
			//*   9   21:aload_1         
			//*  10   22:ifnull          29
						fs1.d();
			//   11   25:aload_1         
			//   12   26:invokevirtual   #34  <Method void fs.d()>
				}
			//   13   29:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//  225  413:aload_0         
	//  226  414:new             #92  <Class b$6>
	//  227  417:dup             
	//  228  418:aload_0         
	//  229  419:invokespecial   #453 <Method void b$6(b)>
	//  230  422:putfield        #455 <Field Runnable bm>
		bn = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #20  <Method void b$a.run()>
				a.g(g, c);
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field int g>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field boolean c>
			//    8   16:invokevirtual   #31  <Method void b.g(int, boolean)>
			//    9   19:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  231  425:aload_0         
	//  232  426:new             #94  <Class b$7>
	//  233  429:dup             
	//  234  430:aload_0         
	//  235  431:invokespecial   #456 <Method void b$7(b)>
	//  236  434:putfield        #458 <Field b$a bn>
		bo = ((a) (new a() {

			public void run()
			{
				super.run();
			//    0    0:aload_0         
			//    1    1:invokespecial   #22  <Method void b$a.run()>
				try
				{
					a.setMyTrafficStyle(com.amap.api.mapcore.util.b.q(a));
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field b a>
			//    4    8:aload_0         
			//    5    9:getfield        #12  <Field b a>
			//    6   12:invokestatic    #26  <Method MyTrafficStyle b.q(b)>
			//    7   15:invokevirtual   #30  <Method void b.setMyTrafficStyle(MyTrafficStyle)>
					return;
			//    8   18:return          
				}
				catch(Throwable throwable)
			//*   9   19:astore_1        
				{
					throwable.printStackTrace();
			//   10   20:aload_1         
			//   11   21:invokevirtual   #33  <Method void Throwable.printStackTrace()>
				}
			//   12   24:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #15  <Method void b$a(b$1)>
			//    6   10:return          
			}
		}
));
	//  237  437:aload_0         
	//  238  438:new             #96  <Class b$8>
	//  239  441:dup             
	//  240  442:aload_0         
	//  241  443:invokespecial   #459 <Method void b$8(b)>
	//  242  446:putfield        #461 <Field b$a bo>
		bp = new EAMapPlatformGestureInfo();
	//  243  449:aload_0         
	//  244  450:new             #463 <Class EAMapPlatformGestureInfo>
	//  245  453:dup             
	//  246  454:invokespecial   #464 <Method void EAMapPlatformGestureInfo()>
	//  247  457:putfield        #466 <Field EAMapPlatformGestureInfo bp>
		j = new Point();
	//  248  460:aload_0         
	//  249  461:new             #468 <Class Point>
	//  250  464:dup             
	//  251  465:invokespecial   #469 <Method void Point()>
	//  252  468:putfield        #471 <Field Point j>
		k = new Rect();
	//  253  471:aload_0         
	//  254  472:new             #346 <Class Rect>
	//  255  475:dup             
	//  256  476:invokespecial   #347 <Method void Rect()>
	//  257  479:putfield        #473 <Field Rect k>
		bq = 0L;
	//  258  482:aload_0         
	//  259  483:lconst_0        
	//  260  484:putfield        #475 <Field long bq>
		l = null;
	//  261  487:aload_0         
	//  262  488:aconst_null     
	//  263  489:putfield        #477 <Field String l>
		br = null;
	//  264  492:aload_0         
	//  265  493:aconst_null     
	//  266  494:putfield        #479 <Field au br>
		m = new float[16];
	//  267  497:aload_0         
	//  268  498:bipush          16
	//  269  500:newarray        float[]
	//  270  502:putfield        #481 <Field float[] m>
		n = new float[16];
	//  271  505:aload_0         
	//  272  506:bipush          16
	//  273  508:newarray        float[]
	//  274  510:putfield        #483 <Field float[] n>
		o = new float[16];
	//  275  513:aload_0         
	//  276  514:bipush          16
	//  277  516:newarray        float[]
	//  278  518:putfield        #485 <Field float[] o>
		bs = null;
	//  279  521:aload_0         
	//  280  522:aconst_null     
	//  281  523:putfield        #487 <Field IPoint[] bs>
		p = new float[12];
	//  282  526:aload_0         
	//  283  527:bipush          12
	//  284  529:newarray        float[]
	//  285  531:putfield        #489 <Field float[] p>
		q = "precision highp float;\nattribute vec3 aVertex;//\u9876\u70B9\u6570\u7EC4,\u4E09\u7EF4\u5750\u6807\nuniform mat4 aMVPMatrix;//mvp\u77E9\u9635\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}";
	//  286  534:aload_0         
	//  287  535:ldc2            #491 <String "precision highp float;\nattribute vec3 aVertex;//\u9876\u70B9\u6570\u7EC4,\u4E09\u7EF4\u5750\u6807\nuniform mat4 aMVPMatrix;//mvp\u77E9\u9635\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}">
	//  288  538:putfield        #493 <Field String q>
		r = "//\u6709\u989C\u8272 \u6CA1\u6709\u7EB9\u7406\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(1.0,0,0,1.0);\n}";
	//  289  541:aload_0         
	//  290  542:ldc2            #495 <String "//\u6709\u989C\u8272 \u6CA1\u6709\u7EB9\u7406\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(1.0,0,0,1.0);\n}">
	//  291  545:putfield        #497 <Field String r>
		s = -1;
	//  292  548:aload_0         
	//  293  549:iconst_m1       
	//  294  550:putfield        #499 <Field int s>
		e = context;
	//  295  553:aload_0         
	//  296  554:aload_2         
	//  297  555:putfield        #501 <Field Context e>
		aC = new f(context, this, t1);
	//  298  558:aload_0         
	//  299  559:new             #503 <Class f>
	//  300  562:dup             
	//  301  563:aload_2         
	//  302  564:aload_0         
	//  303  565:aload_1         
	//  304  566:invokespecial   #506 <Method void f(Context, b, t)>
	//  305  569:putfield        #508 <Field f aC>
		hm.a(e);
	//  306  572:aload_0         
	//  307  573:getfield        #501 <Field Context e>
	//  308  576:invokestatic    #513 <Method void hm.a(Context)>
		eo.a().a(e);
	//  309  579:invokestatic    #518 <Method eo eo.a()>
	//  310  582:aload_0         
	//  311  583:getfield        #501 <Field Context e>
	//  312  586:invokevirtual   #519 <Method void eo.a(Context)>
		l.b = go.c(context);
	//  313  589:aload_2         
	//  314  590:invokestatic    #524 <Method String go.c(Context)>
	//  315  593:putstatic       #528 <Field String l.b>
		ee.a(e);
	//  316  596:aload_0         
	//  317  597:getfield        #501 <Field Context e>
	//  318  600:invokestatic    #531 <Method void ee.a(Context)>
		aE = new o(((s) (this)));
	//  319  603:aload_0         
	//  320  604:new             #533 <Class o>
	//  321  607:dup             
	//  322  608:aload_0         
	//  323  609:invokespecial   #536 <Method void o(s)>
	//  324  612:putfield        #538 <Field o aE>
		f = new GLMapEngine(e, ((s) (this)));
	//  325  615:aload_0         
	//  326  616:new             #540 <Class GLMapEngine>
	//  327  619:dup             
	//  328  620:aload_0         
	//  329  621:getfield        #501 <Field Context e>
	//  330  624:aload_0         
	//  331  625:invokespecial   #543 <Method void GLMapEngine(Context, s)>
	//  332  628:putfield        #545 <Field GLMapEngine f>
		aD = new GLMapRender(((com.autonavi.amap.mapcore.interfaces.IAMap) (this)));
	//  333  631:aload_0         
	//  334  632:new             #547 <Class GLMapRender>
	//  335  635:dup             
	//  336  636:aload_0         
	//  337  637:invokespecial   #550 <Method void GLMapRender(com.autonavi.amap.mapcore.interfaces.IAMap)>
	//  338  640:putfield        #552 <Field GLMapRender aD>
		P = t1;
	//  339  643:aload_0         
	//  340  644:aload_1         
	//  341  645:putfield        #554 <Field t P>
		t1.setRenderer(((android.opengl.GLSurfaceView.Renderer) (aD)));
	//  342  648:aload_1         
	//  343  649:aload_0         
	//  344  650:getfield        #552 <Field GLMapRender aD>
	//  345  653:invokeinterface #560 <Method void t.setRenderer(android.opengl.GLSurfaceView$Renderer)>
	//  346  658:aload_0         
	//  347  659:new             #562 <Class ag>
	//  348  662:dup             
	//  349  663:aload_0         
	//  350  664:invokespecial   #563 <Method void ag(s)>
	//  351  667:putfield        #565 <Field ag N>
		Q = new fq(e, ((s) (this)));
	//  352  670:aload_0         
	//  353  671:new             #567 <Class fq>
	//  354  674:dup             
	//  355  675:aload_0         
	//  356  676:getfield        #501 <Field Context e>
	//  357  679:aload_0         
	//  358  680:invokespecial   #568 <Method void fq(Context, s)>
	//  359  683:putfield        #570 <Field fq Q>
		Q.e().a(((fo.a) (new c())));
	//  360  686:aload_0         
	//  361  687:getfield        #570 <Field fq Q>
	//  362  690:invokevirtual   #573 <Method fo fq.e()>
	//  363  693:new             #110 <Class b$c>
	//  364  696:dup             
	//  365  697:aload_0         
	//  366  698:aconst_null     
	//  367  699:invokespecial   #576 <Method void b$c(b, b$1)>
	//  368  702:invokevirtual   #581 <Method void fo.a(fo$a)>
		aW = new b();
	//  369  705:aload_0         
	//  370  706:new             #103 <Class b$b>
	//  371  709:dup             
	//  372  710:aload_0         
	//  373  711:invokespecial   #582 <Method void b$b(b)>
	//  374  714:putfield        #584 <Field b$b aW>
	//  375  717:aload_0         
	//  376  718:new             #586 <Class q>
	//  377  721:dup             
	//  378  722:aload_0         
	//  379  723:invokespecial   #587 <Method void q(s)>
	//  380  726:putfield        #589 <Field q S>
		R = new af(e, ((s) (this)));
	//  381  729:aload_0         
	//  382  730:new             #591 <Class af>
	//  383  733:dup             
	//  384  734:aload_0         
	//  385  735:getfield        #501 <Field Context e>
	//  386  738:aload_0         
	//  387  739:invokespecial   #592 <Method void af(Context, s)>
	//  388  742:putfield        #594 <Field af R>
		b = new y(e, ((s) (this)));
	//  389  745:aload_0         
	//  390  746:new             #596 <Class y>
	//  391  749:dup             
	//  392  750:aload_0         
	//  393  751:getfield        #501 <Field Context e>
	//  394  754:aload_0         
	//  395  755:invokespecial   #597 <Method void y(Context, s)>
	//  396  758:putfield        #599 <Field y b>
		W = new n(e, ((s) (this)));
	//  397  761:aload_0         
	//  398  762:new             #601 <Class n>
	//  399  765:dup             
	//  400  766:aload_0         
	//  401  767:getfield        #501 <Field Context e>
	//  402  770:aload_0         
	//  403  771:invokespecial   #602 <Method void n(Context, s)>
	//  404  774:putfield        #604 <Field n W>
		P.setRenderMode(0);
	//  405  777:aload_0         
	//  406  778:getfield        #554 <Field t P>
	//  407  781:iconst_0        
	//  408  782:invokeinterface #608 <Method void t.setRenderMode(int)>
		aJ = false;
	//  409  787:aload_0         
	//  410  788:iconst_0        
	//  411  789:putfield        #380 <Field boolean aJ>
		aD.setRenderFps(15F);
	//  412  792:aload_0         
	//  413  793:getfield        #552 <Field GLMapRender aD>
	//  414  796:ldc2            #609 <Float 15F>
	//  415  799:invokevirtual   #613 <Method void GLMapRender.setRenderFps(float)>
		f.setMapListener(((IAMapListener) (this)));
	//  416  802:aload_0         
	//  417  803:getfield        #545 <Field GLMapEngine f>
	//  418  806:aload_0         
	//  419  807:invokevirtual   #617 <Method void GLMapEngine.setMapListener(IAMapListener)>
		M = ((u) (new ad(((s) (this)))));
	//  420  810:aload_0         
	//  421  811:new             #619 <Class ad>
	//  422  814:dup             
	//  423  815:aload_0         
	//  424  816:invokespecial   #620 <Method void ad(s)>
	//  425  819:putfield        #622 <Field u M>
		F = new g(((s) (this)));
	//  426  822:aload_0         
	//  427  823:new             #624 <Class g>
	//  428  826:dup             
	//  429  827:aload_0         
	//  430  828:invokespecial   #625 <Method void g(s)>
	//  431  831:putfield        #627 <Field g F>
		K = new do(((s) (this)), context);
	//  432  834:aload_0         
	//  433  835:new             #629 <Class do>
	//  434  838:dup             
	//  435  839:aload_0         
	//  436  840:aload_2         
	//  437  841:invokespecial   #632 <Method void do(s, Context)>
	//  438  844:putfield        #305 <Field do K>
		J = new aw(e);
	//  439  847:aload_0         
	//  440  848:new             #634 <Class aw>
	//  441  851:dup             
	//  442  852:aload_0         
	//  443  853:getfield        #501 <Field Context e>
	//  444  856:invokespecial   #636 <Method void aw(Context)>
	//  445  859:putfield        #638 <Field aw J>
		J.a(((av) (Q)));
	//  446  862:aload_0         
	//  447  863:getfield        #638 <Field aw J>
	//  448  866:aload_0         
	//  449  867:getfield        #570 <Field fq Q>
	//  450  870:invokevirtual   #641 <Method void aw.a(av)>
		J.b(((av) (K)));
	//  451  873:aload_0         
	//  452  874:getfield        #638 <Field aw J>
	//  453  877:aload_0         
	//  454  878:getfield        #305 <Field do K>
	//  455  881:invokevirtual   #643 <Method void aw.b(av)>
	//  456  884:aload_0         
	//  457  885:new             #645 <Class z>
	//  458  888:dup             
	//  459  889:invokespecial   #646 <Method void z()>
	//  460  892:putfield        #648 <Field z aw>
		ap = ((Thread) (new j(e, ((s) (this)))));
	//  461  895:aload_0         
	//  462  896:new             #650 <Class j>
	//  463  899:dup             
	//  464  900:aload_0         
	//  465  901:getfield        #501 <Field Context e>
	//  466  904:aload_0         
	//  467  905:invokespecial   #651 <Method void j(Context, s)>
	//  468  908:putfield        #653 <Field Thread ap>
		ac = ((LocationSource) (new ax(e)));
	//  469  911:aload_0         
	//  470  912:new             #655 <Class ax>
	//  471  915:dup             
	//  472  916:aload_0         
	//  473  917:getfield        #501 <Field Context e>
	//  474  920:invokespecial   #656 <Method void ax(Context)>
	//  475  923:putfield        #658 <Field LocationSource ac>
		aZ = new bb(((s) (this)));
	//  476  926:aload_0         
	//  477  927:new             #660 <Class bb>
	//  478  930:dup             
	//  479  931:aload_0         
	//  480  932:invokespecial   #661 <Method void bb(s)>
	//  481  935:putfield        #663 <Field bb aZ>
		aX = new ds();
	//  482  938:aload_0         
	//  483  939:new             #665 <Class ds>
	//  484  942:dup             
	//  485  943:invokespecial   #666 <Method void ds()>
	//  486  946:putfield        #668 <Field ds aX>
		aY = new r();
	//  487  949:aload_0         
	//  488  950:new             #670 <Class r>
	//  489  953:dup             
	//  490  954:invokespecial   #671 <Method void r()>
	//  491  957:putfield        #673 <Field r aY>
		aA = new du(e, ((s) (this)));
	//  492  960:aload_0         
	//  493  961:new             #675 <Class du>
	//  494  964:dup             
	//  495  965:aload_0         
	//  496  966:getfield        #501 <Field Context e>
	//  497  969:aload_0         
	//  498  970:invokespecial   #676 <Method void du(Context, s)>
	//  499  973:putfield        #678 <Field du aA>
		aB = new dw(e);
	//  500  976:aload_0         
	//  501  977:new             #680 <Class dw>
	//  502  980:dup             
	//  503  981:aload_0         
	//  504  982:getfield        #501 <Field Context e>
	//  505  985:invokespecial   #681 <Method void dw(Context)>
	//  506  988:putfield        #683 <Field dw aB>
		aB.a(((dw.a) (this)));
	//  507  991:aload_0         
	//  508  992:getfield        #683 <Field dw aB>
	//  509  995:aload_0         
	//  510  996:invokevirtual   #686 <Method void dw.a(dw$a)>
	//  511  999:return          
	}

	static ag A(com.amap.api.mapcore.util.b b1)
	{
		return b1.N;
	//    0    0:aload_0         
	//    1    1:getfield        #565 <Field ag N>
	//    2    4:areturn         
	}

	private void A()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list = az;
	//    2    2:aload_0         
	//    3    3:getfield        #370 <Field List az>
	//    4    6:astore_3        
		list;
	//    5    7:aload_3         
		JVM INSTR monitorenter ;
	//    6    8:monitorenter    
		int j1 = az.size();
	//    7    9:aload_0         
	//    8   10:getfield        #370 <Field List az>
	//    9   13:invokeinterface #694 <Method int List.size()>
	//   10   18:istore_2        
		int i1 = 0;
	//   11   19:iconst_0        
	//   12   20:istore_1        
_L2:
		if(i1 >= j1)
			break; /* Loop/switch isn't completed */
	//   13   21:iload_1         
	//   14   22:iload_2         
	//   15   23:icmpge          52
		((ab)az.get(i1)).e().recycle();
	//   16   26:aload_0         
	//   17   27:getfield        #370 <Field List az>
	//   18   30:iload_1         
	//   19   31:invokeinterface #698 <Method Object List.get(int)>
	//   20   36:checkcast       #700 <Class ab>
	//   21   39:invokevirtual   #703 <Method BitmapDescriptor ab.e()>
	//   22   42:invokevirtual   #708 <Method void BitmapDescriptor.recycle()>
		i1++;
	//   23   45:iload_1         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_1        
		if(true) goto _L2; else goto _L1
	//   27   49:goto            21
_L1:
		az.clear();
	//   28   52:aload_0         
	//   29   53:getfield        #370 <Field List az>
	//   30   56:invokeinterface #711 <Method void List.clear()>
		list;
	//   31   61:aload_3         
		JVM INSTR monitorexit ;
	//   32   62:monitorexit     
		  goto _L3
	//*  33   63:goto            73
		Exception exception1;
		exception1;
	//   34   66:astore          4
	//*  35   68:aload_3         
		throw exception1;
	//   36   69:monitorexit     
	//   37   70:aload           4
	//   38   72:athrow          
	//*  39   73:aload_0         
_L3:
		return;
	//   40   74:monitorexit     
	//   41   75:return          
		Exception exception;
		exception;
	//   42   76:astore_3        
	//*  43   77:aload_0         
		throw exception;
	//   44   78:monitorexit     
	//   45   79:aload_3         
	//   46   80:athrow          
	}

	static AMapWidgetListener B(com.amap.api.mapcore.util.b b1)
	{
		return b1.X;
	//    0    0:aload_0         
	//    1    1:getfield        #714 <Field AMapWidgetListener X>
	//    2    4:areturn         
	}

	private void B()
	{
		float f1;
		GLMapState glmapstate;
		try
		{
			c.setMapRect(fd.a(((s) (this)), true));
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #721 <Method FPoint[] fd.a(s, boolean)>
	//    5    9:invokevirtual   #725 <Method void MapConfig.setMapRect(FPoint[])>
			glmapstate = f.getMapState(1);
	//    6   12:aload_0         
	//    7   13:getfield        #545 <Field GLMapEngine f>
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #729 <Method GLMapState GLMapEngine.getMapState(int)>
	//   10   20:astore_2        
		}
	//*  11   21:aload_2         
	//*  12   22:ifnull          83
	//*  13   25:aload_2         
	//*  14   26:aload_0         
	//*  15   27:getfield        #473 <Field Rect k>
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #732 <Method int getMapWidth()>
	//*  18   34:aload_0         
	//*  19   35:invokevirtual   #735 <Method int getMapHeight()>
	//*  20   38:invokevirtual   #741 <Method void GLMapState.getPixel20Bound(Rect, int, int)>
	//*  21   41:aload_0         
	//*  22   42:getfield        #322 <Field MapConfig c>
	//*  23   45:invokevirtual   #745 <Method Rectangle MapConfig.getGeoRectangle()>
	//*  24   48:aload_0         
	//*  25   49:getfield        #473 <Field Rect k>
	//*  26   52:aload_0         
	//*  27   53:getfield        #322 <Field MapConfig c>
	//*  28   56:invokevirtual   #748 <Method int MapConfig.getSX()>
	//*  29   59:aload_0         
	//*  30   60:getfield        #322 <Field MapConfig c>
	//*  31   63:invokevirtual   #751 <Method int MapConfig.getSY()>
	//*  32   66:invokevirtual   #756 <Method void Rectangle.updateRect(Rect, int, int)>
	//*  33   69:aload_2         
	//*  34   70:iconst_1        
	//*  35   71:invokevirtual   #760 <Method float GLMapState.getGLUnitWithWin(int)>
	//*  36   74:fstore_1        
	//*  37   75:aload_0         
	//*  38   76:getfield        #322 <Field MapConfig c>
	//*  39   79:fload_1         
	//*  40   80:invokevirtual   #763 <Method void MapConfig.setMapPerPixelUnitLength(float)>
	//*  41   83:return          
		catch(Throwable throwable)
	//*  42   84:astore_2        
		{
			throwable.printStackTrace();
	//   43   85:aload_2         
	//   44   86:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			return;
	//   45   89:return          
		}
		if(glmapstate == null)
			break MISSING_BLOCK_LABEL_83;
		glmapstate.getPixel20Bound(k, getMapWidth(), getMapHeight());
		c.getGeoRectangle().updateRect(k, c.getSX(), c.getSY());
		f1 = glmapstate.getGLUnitWithWin(1);
		c.setMapPerPixelUnitLength(f1);
	}

	private void C()
	{
		if(bq < 2L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #475 <Field long bq>
	//*   2    4:ldc2w           #767 <Long 2L>
	//*   3    7:lcmp            
	//*   4    8:ifge            22
		{
			bq = bq + 1L;
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #475 <Field long bq>
	//    8   16:lconst_1        
	//    9   17:ladd            
	//   10   18:putfield        #475 <Field long bq>
			return;
	//   11   21:return          
		}
		fm fm1 = Q.d();
	//   12   22:aload_0         
	//   13   23:getfield        #570 <Field fq Q>
	//   14   26:invokevirtual   #771 <Method fm fq.d()>
	//   15   29:astore_1        
		if(fm1 != null && fm1.getVisibility() != 8)
	//*  16   30:aload_1         
	//*  17   31:ifnull          87
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #776 <Method int fm.getVisibility()>
	//*  20   38:bipush          8
	//*  21   40:icmpeq          87
		{
			if(!aa)
	//*  22   43:aload_0         
	//*  23   44:getfield        #326 <Field boolean aa>
	//*  24   47:ifne            70
			{
				i.sendEmptyMessage(16);
	//   25   50:aload_0         
	//   26   51:getfield        #414 <Field Handler i>
	//   27   54:bipush          16
	//   28   56:invokevirtual   #782 <Method boolean Handler.sendEmptyMessage(int)>
	//   29   59:pop             
				aa = true;
	//   30   60:aload_0         
	//   31   61:iconst_1        
	//   32   62:putfield        #326 <Field boolean aa>
				g(true);
	//   33   65:aload_0         
	//   34   66:iconst_1        
	//   35   67:invokevirtual   #784 <Method void g(boolean)>
			}
			i.post(new Runnable(fm1) {

				public void run()
				{
					if(com.amap.api.mapcore.util.b.r(b))
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field b b>
				//*   2    4:invokestatic    #31  <Method boolean b.r(b)>
				//*   3    7:ifeq            11
						return;
				//    4   10:return          
					try
					{
						if(b.d != null)
				//*   5   11:aload_0         
				//*   6   12:getfield        #19  <Field b b>
				//*   7   15:getfield        #35  <Field au b.d>
				//*   8   18:ifnull          35
							b.setIndoorBuildingInfo(((IndoorBuildingInfo) (b.d)));
				//    9   21:aload_0         
				//   10   22:getfield        #19  <Field b b>
				//   11   25:aload_0         
				//   12   26:getfield        #19  <Field b b>
				//   13   29:getfield        #35  <Field au b.d>
				//   14   32:invokevirtual   #39  <Method void b.setIndoorBuildingInfo(IndoorBuildingInfo)>
					}
				//*  15   35:goto            43
					catch(Throwable throwable)
				//*  16   38:astore_1        
					{
						throwable.printStackTrace();
				//   17   39:aload_1         
				//   18   40:invokevirtual   #42  <Method void Throwable.printStackTrace()>
					}
					a.a(false);
				//   19   43:aload_0         
				//   20   44:getfield        #21  <Field fm a>
				//   21   47:iconst_0        
				//   22   48:invokevirtual   #47  <Method void fm.a(boolean)>
				//   23   51:return          
				}

				final fm a;
				final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field b b>
				a = fm1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field fm a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   36   70:aload_0         
	//   37   71:getfield        #414 <Field Handler i>
	//   38   74:new             #26  <Class b$16>
	//   39   77:dup             
	//   40   78:aload_0         
	//   41   79:aload_1         
	//   42   80:invokespecial   #787 <Method void b$16(b, fm)>
	//   43   83:invokevirtual   #791 <Method boolean Handler.post(Runnable)>
	//   44   86:pop             
		}
	//   45   87:return          
	}

	private void D()
	{
		if(!ar)
	//*   0    0:aload_0         
	//*   1    1:getfield        #355 <Field boolean ar>
	//*   2    4:ifne            35
			try
			{
				ap.setName("AuthThread");
	//    3    7:aload_0         
	//    4    8:getfield        #653 <Field Thread ap>
	//    5   11:ldc2            #793 <String "AuthThread">
	//    6   14:invokevirtual   #799 <Method void Thread.setName(String)>
				ap.start();
	//    7   17:aload_0         
	//    8   18:getfield        #653 <Field Thread ap>
	//    9   21:invokevirtual   #802 <Method void Thread.start()>
				ar = true;
	//   10   24:aload_0         
	//   11   25:iconst_1        
	//   12   26:putfield        #355 <Field boolean ar>
				return;
	//   13   29:return          
			}
			catch(Throwable throwable)
	//*  14   30:astore_1        
			{
				throwable.printStackTrace();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			}
	//   17   35:return          
	}

	private void E()
	{
		if(!as)
	//*   0    0:aload_0         
	//*   1    1:getfield        #357 <Field boolean as>
	//*   2    4:ifne            58
			try
			{
				if(aq == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #804 <Field Thread aq>
	//*   5   11:ifnonnull       30
					aq = ((Thread) (new h(e, ((s) (this)))));
	//    6   14:aload_0         
	//    7   15:new             #806 <Class h>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #501 <Field Context e>
	//   11   23:aload_0         
	//   12   24:invokespecial   #807 <Method void h(Context, s)>
	//   13   27:putfield        #804 <Field Thread aq>
				aq.setName("AuthProThread");
	//   14   30:aload_0         
	//   15   31:getfield        #804 <Field Thread aq>
	//   16   34:ldc2            #809 <String "AuthProThread">
	//   17   37:invokevirtual   #799 <Method void Thread.setName(String)>
				aq.start();
	//   18   40:aload_0         
	//   19   41:getfield        #804 <Field Thread aq>
	//   20   44:invokevirtual   #802 <Method void Thread.start()>
				as = true;
	//   21   47:aload_0         
	//   22   48:iconst_1        
	//   23   49:putfield        #357 <Field boolean as>
				return;
	//   24   52:return          
			}
			catch(Throwable throwable)
	//*  25   53:astore_1        
			{
				throwable.printStackTrace();
	//   26   54:aload_1         
	//   27   55:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			}
	//   28   58:return          
	}

	private void F()
	{
		try
		{
			LatLngBounds latlngbounds = c.getLimitLatLngBounds();
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:invokevirtual   #813 <Method LatLngBounds MapConfig.getLimitLatLngBounds()>
	//    3    7:astore_1        
			if(f != null && a(latlngbounds))
	//*   4    8:aload_0         
	//*   5    9:getfield        #545 <Field GLMapEngine f>
	//*   6   12:ifnull          110
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokespecial   #816 <Method boolean a(LatLngBounds)>
	//*  10   20:ifeq            110
			{
				GLMapState glmapstate = new GLMapState(1, f.getNativeInstance());
	//   11   23:new             #737 <Class GLMapState>
	//   12   26:dup             
	//   13   27:iconst_1        
	//   14   28:aload_0         
	//   15   29:getfield        #545 <Field GLMapEngine f>
	//   16   32:invokevirtual   #820 <Method long GLMapEngine.getNativeInstance()>
	//   17   35:invokespecial   #823 <Method void GLMapState(int, long)>
	//   18   38:astore_2        
				IPoint ipoint = IPoint.obtain();
	//   19   39:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//   20   42:astore_3        
				GLMapState.lonlat2Geo(latlngbounds.northeast.longitude, latlngbounds.northeast.latitude, ipoint);
	//   21   43:aload_1         
	//   22   44:getfield        #835 <Field LatLng LatLngBounds.northeast>
	//   23   47:getfield        #840 <Field double LatLng.longitude>
	//   24   50:aload_1         
	//   25   51:getfield        #835 <Field LatLng LatLngBounds.northeast>
	//   26   54:getfield        #843 <Field double LatLng.latitude>
	//   27   57:aload_3         
	//   28   58:invokestatic    #847 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
				IPoint ipoint1 = IPoint.obtain();
	//   29   61:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//   30   64:astore          4
				GLMapState.lonlat2Geo(latlngbounds.southwest.longitude, latlngbounds.southwest.latitude, ipoint1);
	//   31   66:aload_1         
	//   32   67:getfield        #850 <Field LatLng LatLngBounds.southwest>
	//   33   70:getfield        #840 <Field double LatLng.longitude>
	//   34   73:aload_1         
	//   35   74:getfield        #850 <Field LatLng LatLngBounds.southwest>
	//   36   77:getfield        #843 <Field double LatLng.latitude>
	//   37   80:aload           4
	//   38   82:invokestatic    #847 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
				c.setLimitIPoints(new IPoint[] {
					ipoint, ipoint1
				});
	//   39   85:aload_0         
	//   40   86:getfield        #322 <Field MapConfig c>
	//   41   89:iconst_2        
	//   42   90:anewarray       IPoint[]
	//   43   93:dup             
	//   44   94:iconst_0        
	//   45   95:aload_3         
	//   46   96:aastore         
	//   47   97:dup             
	//   48   98:iconst_1        
	//   49   99:aload           4
	//   50  101:aastore         
	//   51  102:invokevirtual   #854 <Method void MapConfig.setLimitIPoints(IPoint[])>
				glmapstate.recycle();
	//   52  105:aload_2         
	//   53  106:invokevirtual   #855 <Method void GLMapState.recycle()>
				return;
	//   54  109:return          
			}
		}
	//*  55  110:goto            118
		catch(Throwable throwable)
	//*  56  113:astore_1        
		{
			throwable.printStackTrace();
	//   57  114:aload_1         
	//   58  115:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
		c.setLimitIPoints(((IPoint []) (null)));
	//   59  118:aload_0         
	//   60  119:getfield        #322 <Field MapConfig c>
	//   61  122:aconst_null     
	//   62  123:invokevirtual   #854 <Method void MapConfig.setLimitIPoints(IPoint[])>
	//   63  126:return          
	}

	private void G()
	{
		E = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #857 <Field com.amap.api.maps.AMap$OnMyLocationChangeListener E>
		t = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #859 <Field com.amap.api.maps.AMap$OnMarkerClickListener t>
		u = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #861 <Field com.amap.api.maps.AMap$OnPolylineClickListener u>
		v = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #863 <Field com.amap.api.maps.AMap$OnMarkerDragListener v>
		w = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #865 <Field com.amap.api.maps.AMap$OnMapLoadedListener w>
		x = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #867 <Field com.amap.api.maps.AMap$OnCameraChangeListener x>
		y = null;
	//   18   30:aload_0         
	//   19   31:aconst_null     
	//   20   32:putfield        #869 <Field com.amap.api.maps.AMap$OnMapClickListener y>
		z = null;
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:putfield        #871 <Field com.amap.api.maps.AMap$OnMapTouchListener z>
		A = null;
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:putfield        #873 <Field com.amap.api.maps.AMap$OnPOIClickListener A>
		B = null;
	//   27   45:aload_0         
	//   28   46:aconst_null     
	//   29   47:putfield        #875 <Field com.amap.api.maps.AMap$OnMapLongClickListener B>
		C = null;
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:putfield        #877 <Field com.amap.api.maps.AMap$OnInfoWindowClickListener C>
		D = null;
	//   33   55:aload_0         
	//   34   56:aconst_null     
	//   35   57:putfield        #879 <Field com.amap.api.maps.AMap$OnIndoorBuildingActiveListener D>
		F = null;
	//   36   60:aload_0         
	//   37   61:aconst_null     
	//   38   62:putfield        #627 <Field g F>
		G = null;
	//   39   65:aload_0         
	//   40   66:aconst_null     
	//   41   67:putfield        #301 <Field com.amap.api.maps.AMap$onMapPrintScreenListener G>
		H = null;
	//   42   70:aload_0         
	//   43   71:aconst_null     
	//   44   72:putfield        #303 <Field com.amap.api.maps.AMap$OnMapScreenShotListener H>
	//   45   75:return          
	}

	static int a(com.amap.api.mapcore.util.b b1, int i1)
	{
		b1.aN = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #388 <Field int aN>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static ds a(com.amap.api.mapcore.util.b b1, ds ds1)
	{
		b1.aX = ds1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #668 <Field ds aX>
		return ds1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static com.amap.api.maps.AMap.OnMapScreenShotListener a(com.amap.api.mapcore.util.b b1, com.amap.api.maps.AMap.OnMapScreenShotListener onmapscreenshotlistener)
	{
		b1.H = onmapscreenshotlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #303 <Field com.amap.api.maps.AMap$OnMapScreenShotListener H>
		return onmapscreenshotlistener;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static com.amap.api.maps.AMap.onMapPrintScreenListener a(com.amap.api.mapcore.util.b b1, com.amap.api.maps.AMap.onMapPrintScreenListener onmapprintscreenlistener)
	{
		b1.G = onmapprintscreenlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #301 <Field com.amap.api.maps.AMap$onMapPrintScreenListener G>
		return onmapprintscreenlistener;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Poi a(com.amap.api.mapcore.util.b b1, int i1, int j1, int k1)
	{
		return b1.b(i1, j1, k1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #887 <Method Poi b(int, int, int)>
	//    5    7:areturn         
	}

	private void a(int i1, GL10 gl10)
	{
		if(ay != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #365 <Field int ay>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          27
		{
			aD.setRenderFps(ay);
	//    4    8:aload_0         
	//    5    9:getfield        #552 <Field GLMapRender aD>
	//    6   12:aload_0         
	//    7   13:getfield        #365 <Field int ay>
	//    8   16:i2f             
	//    9   17:invokevirtual   #613 <Method void GLMapRender.setRenderFps(float)>
			resetRenderTime();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #891 <Method void resetRenderTime()>
		} else
	//*  12   24:goto            121
		if(f.isInMapAction(i1) || aL)
	//*  13   27:aload_0         
	//*  14   28:getfield        #545 <Field GLMapEngine f>
	//*  15   31:iload_1         
	//*  16   32:invokevirtual   #894 <Method boolean GLMapEngine.isInMapAction(int)>
	//*  17   35:ifne            45
	//*  18   38:aload_0         
	//*  19   39:getfield        #384 <Field boolean aL>
	//*  20   42:ifeq            58
			aD.setRenderFps(40F);
	//   21   45:aload_0         
	//   22   46:getfield        #552 <Field GLMapRender aD>
	//   23   49:ldc2            #895 <Float 40F>
	//   24   52:invokevirtual   #613 <Method void GLMapRender.setRenderFps(float)>
		else
	//*  25   55:goto            121
		if(f.isInMapAnimation(i1))
	//*  26   58:aload_0         
	//*  27   59:getfield        #545 <Field GLMapEngine f>
	//*  28   62:iload_1         
	//*  29   63:invokevirtual   #898 <Method boolean GLMapEngine.isInMapAnimation(int)>
	//*  30   66:ifeq            91
		{
			aD.setRenderFps(30F);
	//   31   69:aload_0         
	//   32   70:getfield        #552 <Field GLMapRender aD>
	//   33   73:ldc2            #899 <Float 30F>
	//   34   76:invokevirtual   #613 <Method void GLMapRender.setRenderFps(float)>
			aD.resetTickCount(15);
	//   35   79:aload_0         
	//   36   80:getfield        #552 <Field GLMapRender aD>
	//   37   83:bipush          15
	//   38   85:invokevirtual   #902 <Method void GLMapRender.resetTickCount(int)>
		} else
	//*  39   88:goto            121
		if(aJ)
	//*  40   91:aload_0         
	//*  41   92:getfield        #380 <Field boolean aJ>
	//*  42   95:ifeq            111
			aD.setRenderFps(10F);
	//   43   98:aload_0         
	//   44   99:getfield        #552 <Field GLMapRender aD>
	//   45  102:ldc2            #903 <Float 10F>
	//   46  105:invokevirtual   #613 <Method void GLMapRender.setRenderFps(float)>
		else
	//*  47  108:goto            121
			aD.setRenderFps(15F);
	//   48  111:aload_0         
	//   49  112:getfield        #552 <Field GLMapRender aD>
	//   50  115:ldc2            #609 <Float 15F>
	//   51  118:invokevirtual   #613 <Method void GLMapRender.setRenderFps(float)>
		if(c.isWorldMapEnable() != MapsInitializer.isLoadWorldGridMap())
	//*  52  121:aload_0         
	//*  53  122:getfield        #322 <Field MapConfig c>
	//*  54  125:invokevirtual   #907 <Method boolean MapConfig.isWorldMapEnable()>
	//*  55  128:invokestatic    #912 <Method boolean MapsInitializer.isLoadWorldGridMap()>
	//*  56  131:icmpeq          149
		{
			g(true);
	//   57  134:aload_0         
	//   58  135:iconst_1        
	//   59  136:invokevirtual   #784 <Method void g(boolean)>
			c.setWorldMapEnable(MapsInitializer.isLoadWorldGridMap());
	//   60  139:aload_0         
	//   61  140:getfield        #322 <Field MapConfig c>
	//   62  143:invokestatic    #912 <Method boolean MapsInitializer.isLoadWorldGridMap()>
	//   63  146:invokevirtual   #915 <Method void MapConfig.setWorldMapEnable(boolean)>
		}
	//   64  149:return          
	}

	private void a(MotionEvent motionevent)
		throws RemoteException
	{
		if(ad && ae != null && af != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #328 <Field boolean ad>
	//*   2    4:ifeq            145
	//*   3    7:aload_0         
	//*   4    8:getfield        #330 <Field Marker ae>
	//*   5   11:ifnull          145
	//*   6   14:aload_0         
	//*   7   15:getfield        #332 <Field k af>
	//*   8   18:ifnull          145
		{
			int i1 = (int)motionevent.getX();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #924 <Method float MotionEvent.getX()>
	//   11   25:f2i             
	//   12   26:istore_2        
			int j1 = (int)(motionevent.getY() - 60F);
	//   13   27:aload_1         
	//   14   28:invokevirtual   #927 <Method float MotionEvent.getY()>
	//   15   31:ldc2            #928 <Float 60F>
	//   16   34:fsub            
	//   17   35:f2i             
	//   18   36:istore_3        
			LatLng latlng = af.b();
	//   19   37:aload_0         
	//   20   38:getfield        #332 <Field k af>
	//   21   41:invokevirtual   #933 <Method LatLng k.b()>
	//   22   44:astore          4
			if(latlng != null)
	//*  23   46:aload           4
	//*  24   48:ifnull          145
			{
				LatLng latlng1 = af.getPosition();
	//   25   51:aload_0         
	//   26   52:getfield        #332 <Field k af>
	//   27   55:invokevirtual   #936 <Method LatLng k.getPosition()>
	//   28   58:astore          5
				motionevent = ((MotionEvent) (DPoint.obtain()));
	//   29   60:invokestatic    #941 <Method DPoint DPoint.obtain()>
	//   30   63:astore_1        
				b(i1, j1, ((DPoint) (motionevent)));
	//   31   64:aload_0         
	//   32   65:iload_2         
	//   33   66:iload_3         
	//   34   67:aload_1         
	//   35   68:invokevirtual   #944 <Method void b(int, int, DPoint)>
				latlng = new LatLng((latlng1.latitude + ((DPoint) (motionevent)).y) - latlng.latitude, (latlng1.longitude + ((DPoint) (motionevent)).x) - latlng.longitude);
	//   36   71:new             #837 <Class LatLng>
	//   37   74:dup             
	//   38   75:aload           5
	//   39   77:getfield        #843 <Field double LatLng.latitude>
	//   40   80:aload_1         
	//   41   81:getfield        #946 <Field double DPoint.y>
	//   42   84:dadd            
	//   43   85:aload           4
	//   44   87:getfield        #843 <Field double LatLng.latitude>
	//   45   90:dsub            
	//   46   91:aload           5
	//   47   93:getfield        #840 <Field double LatLng.longitude>
	//   48   96:aload_1         
	//   49   97:getfield        #948 <Field double DPoint.x>
	//   50  100:dadd            
	//   51  101:aload           4
	//   52  103:getfield        #840 <Field double LatLng.longitude>
	//   53  106:dsub            
	//   54  107:invokespecial   #951 <Method void LatLng(double, double)>
	//   55  110:astore          4
				((DPoint) (motionevent)).recycle();
	//   56  112:aload_1         
	//   57  113:invokevirtual   #952 <Method void DPoint.recycle()>
				ae.setPosition(latlng);
	//   58  116:aload_0         
	//   59  117:getfield        #330 <Field Marker ae>
	//   60  120:aload           4
	//   61  122:invokevirtual   #958 <Method void Marker.setPosition(LatLng)>
				if(v != null)
	//*  62  125:aload_0         
	//*  63  126:getfield        #863 <Field com.amap.api.maps.AMap$OnMarkerDragListener v>
	//*  64  129:ifnull          145
					v.onMarkerDrag(ae);
	//   65  132:aload_0         
	//   66  133:getfield        #863 <Field com.amap.api.maps.AMap$OnMarkerDragListener v>
	//   67  136:aload_0         
	//   68  137:getfield        #330 <Field Marker ae>
	//   69  140:invokeinterface #964 <Method void com.amap.api.maps.AMap$OnMarkerDragListener.onMarkerDrag(Marker)>
			}
		}
	//   70  145:return          
	}

	static void a(com.amap.api.mapcore.util.b b1, int i1, int j1, boolean flag)
	{
		b1.b(i1, j1, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #969 <Method void b(int, int, boolean)>
	//    5    7:return          
	}

	static void a(com.amap.api.mapcore.util.b b1, MotionEvent motionevent)
	{
		b1.c(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #972 <Method void c(MotionEvent)>
	//    3    5:return          
	}

	static void a(com.amap.api.mapcore.util.b b1, CameraPosition cameraposition)
	{
		b1.a(cameraposition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #976 <Method void a(CameraPosition)>
	//    3    5:return          
	}

	private void a(CameraPosition cameraposition)
	{
		if(c.getMapLanguage().equals("en"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:invokevirtual   #980 <Method String MapConfig.getMapLanguage()>
	//*   3    7:ldc2            #982 <String "en">
	//*   4   10:invokevirtual   #988 <Method boolean String.equals(Object)>
	//*   5   13:ifeq            45
		{
			boolean flag = b(cameraposition);
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokespecial   #991 <Method boolean b(CameraPosition)>
	//    9   21:istore_2        
			if(flag != al)
	//*  10   22:iload_2         
	//*  11   23:aload_0         
	//*  12   24:getfield        #344 <Field boolean al>
	//*  13   27:icmpeq          44
			{
				al = flag;
	//   14   30:aload_0         
	//   15   31:iload_2         
	//   16   32:putfield        #344 <Field boolean al>
				d(1, al);
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:aload_0         
	//   20   38:getfield        #344 <Field boolean al>
	//   21   41:invokevirtual   #994 <Method void d(int, boolean)>
			}
			return;
	//   22   44:return          
		}
		if(!al)
	//*  23   45:aload_0         
	//*  24   46:getfield        #344 <Field boolean al>
	//*  25   49:ifne            66
		{
			al = true;
	//   26   52:aload_0         
	//   27   53:iconst_1        
	//   28   54:putfield        #344 <Field boolean al>
			d(1, al);
	//   29   57:aload_0         
	//   30   58:iconst_1        
	//   31   59:aload_0         
	//   32   60:getfield        #344 <Field boolean al>
	//   33   63:invokevirtual   #994 <Method void d(int, boolean)>
		}
	//   34   66:return          
	}

	private void a(GL10 gl10)
	{
		if(ak)
	//*   0    0:aload_0         
	//*   1    1:getfield        #342 <Field boolean ak>
	//*   2    4:ifeq            64
		{
			int i1;
			if(f.canStopMapRender(1))
	//*   3    7:aload_0         
	//*   4    8:getfield        #545 <Field GLMapEngine f>
	//*   5   11:iconst_1        
	//*   6   12:invokevirtual   #998 <Method boolean GLMapEngine.canStopMapRender(int)>
	//*   7   15:ifeq            23
				i1 = 1;
	//    8   18:iconst_1        
	//    9   19:istore_2        
			else
	//*  10   20:goto            25
				i1 = 0;
	//   11   23:iconst_0        
	//   12   24:istore_2        
			gl10 = ((GL10) (fd.a(0, 0, getMapWidth(), getMapHeight())));
	//   13   25:iconst_0        
	//   14   26:iconst_0        
	//   15   27:aload_0         
	//   16   28:invokevirtual   #732 <Method int getMapWidth()>
	//   17   31:aload_0         
	//   18   32:invokevirtual   #735 <Method int getMapHeight()>
	//   19   35:invokestatic    #1001 <Method Bitmap fd.a(int, int, int, int)>
	//   20   38:astore_1        
			gl10 = ((GL10) (i.obtainMessage(15, ((Object) (gl10)))));
	//   21   39:aload_0         
	//   22   40:getfield        #414 <Field Handler i>
	//   23   43:bipush          15
	//   24   45:aload_1         
	//   25   46:invokevirtual   #1005 <Method Message Handler.obtainMessage(int, Object)>
	//   26   49:astore_1        
			gl10.arg1 = i1;
	//   27   50:aload_1         
	//   28   51:iload_2         
	//   29   52:putfield        #1010 <Field int Message.arg1>
			((Message) (gl10)).sendToTarget();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #1013 <Method void Message.sendToTarget()>
			ak = false;
	//   32   59:aload_0         
	//   33   60:iconst_0        
	//   34   61:putfield        #342 <Field boolean ak>
		}
	//   35   64:return          
	}

	static boolean a(com.amap.api.mapcore.util.b b1)
	{
		return b1.V;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field boolean V>
	//    2    4:ireturn         
	}

	static boolean a(com.amap.api.mapcore.util.b b1, boolean flag)
	{
		b1.aM = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #386 <Field boolean aM>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private boolean a(LatLngBounds latlngbounds)
	{
		return latlngbounds != null && latlngbounds.northeast != null && latlngbounds.southwest != null;
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:getfield        #835 <Field LatLng LatLngBounds.northeast>
	//    4    8:ifnull          20
	//    5   11:aload_1         
	//    6   12:getfield        #850 <Field LatLng LatLngBounds.southwest>
	//    7   15:ifnull          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	static int b(com.amap.api.mapcore.util.b b1, int i1)
	{
		b1.ax = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #363 <Field int ax>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static com.amap.api.maps.AMap.OnCameraChangeListener b(com.amap.api.mapcore.util.b b1)
	{
		return b1.x;
	//    0    0:aload_0         
	//    1    1:getfield        #867 <Field com.amap.api.maps.AMap$OnCameraChangeListener x>
	//    2    4:areturn         
	}

	private Poi b(int i1, int j1, int k1)
	{
		if(!aO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		DPoint dpoint = null;
	//    5    9:aconst_null     
	//    6   10:astore          5
		Object obj;
		ArrayList arraylist;
		try
		{
			arraylist = a(1, i1, j1, k1);
	//    7   12:aload_0         
	//    8   13:iconst_1        
	//    9   14:iload_1         
	//   10   15:iload_2         
	//   11   16:iload_3         
	//   12   17:invokevirtual   #1019 <Method ArrayList a(int, int, int, int)>
	//   13   20:astore          6
		}
	//*  14   22:aload           5
	//*  15   24:astore          4
	//*  16   26:aload           6
	//*  17   28:ifnull          54
	//*  18   31:aload           5
	//*  19   33:astore          4
	//*  20   35:aload           6
	//*  21   37:invokevirtual   #1020 <Method int ArrayList.size()>
	//*  22   40:ifle            54
	//*  23   43:aload           6
	//*  24   45:iconst_0        
	//*  25   46:invokevirtual   #1021 <Method Object ArrayList.get(int)>
	//*  26   49:checkcast       #1023 <Class MapLabelItem>
	//*  27   52:astore          4
	//*  28   54:aload           4
	//*  29   56:ifnull          123
	//*  30   59:aload           4
	//*  31   61:getfield        #1026 <Field int MapLabelItem.pixel20X>
	//*  32   64:i2l             
	//*  33   65:aload           4
	//*  34   67:getfield        #1029 <Field int MapLabelItem.pixel20Y>
	//*  35   70:i2l             
	//*  36   71:bipush          20
	//*  37   73:invokestatic    #1035 <Method DPoint VirtualEarthProjection.pixelsToLatLong(long, long, int)>
	//*  38   76:astore          5
	//*  39   78:new             #1037 <Class Poi>
	//*  40   81:dup             
	//*  41   82:aload           4
	//*  42   84:getfield        #1040 <Field String MapLabelItem.name>
	//*  43   87:new             #837 <Class LatLng>
	//*  44   90:dup             
	//*  45   91:aload           5
	//*  46   93:getfield        #946 <Field double DPoint.y>
	//*  47   96:aload           5
	//*  48   98:getfield        #948 <Field double DPoint.x>
	//*  49  101:iconst_0        
	//*  50  102:invokespecial   #1043 <Method void LatLng(double, double, boolean)>
	//*  51  105:aload           4
	//*  52  107:getfield        #1046 <Field String MapLabelItem.poiid>
	//*  53  110:invokespecial   #1049 <Method void Poi(String, LatLng, String)>
	//*  54  113:astore          4
	//*  55  115:aload           5
	//*  56  117:invokevirtual   #952 <Method void DPoint.recycle()>
	//*  57  120:aload           4
	//*  58  122:areturn         
	//*  59  123:aconst_null     
	//*  60  124:areturn         
		catch(Throwable throwable)
	//*  61  125:astore          4
		{
			return null;
	//   62  127:aconst_null     
	//   63  128:areturn         
		}
		obj = ((Object) (dpoint));
		if(arraylist == null)
			break MISSING_BLOCK_LABEL_54;
		obj = ((Object) (dpoint));
		if(arraylist.size() > 0)
			obj = ((Object) ((MapLabelItem)arraylist.get(0)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_123;
		dpoint = VirtualEarthProjection.pixelsToLatLong(((MapLabelItem) (obj)).pixel20X, ((MapLabelItem) (obj)).pixel20Y, 20);
		obj = ((Object) (new Poi(((MapLabelItem) (obj)).name, new LatLng(dpoint.y, dpoint.x, false), ((MapLabelItem) (obj)).poiid)));
		dpoint.recycle();
		return ((Poi) (obj));
		return null;
	}

	private void b(int i1, int j1, boolean flag)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field GLMapEngine f>
	//*   2    4:ifnull          17
			f.setSrvViewStateBoolValue(i1, j1, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #545 <Field GLMapEngine f>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #1052 <Method void GLMapEngine.setSrvViewStateBoolValue(int, int, boolean)>
	//    9   17:return          
	}

	private void b(MotionEvent motionevent)
	{
		queueEvent(new Runnable(motionevent) {

			public void run()
			{
				Message message;
				Poi poi;
				message = Message.obtain();
			//    0    0:invokestatic    #33  <Method Message Message.obtain()>
			//    1    3:astore_1        
				poi = com.amap.api.mapcore.util.b.a(b, (int)a.getX(), (int)a.getY(), 25);
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field b b>
			//    4    8:aload_0         
			//    5    9:getfield        #20  <Field MotionEvent a>
			//    6   12:invokevirtual   #39  <Method float MotionEvent.getX()>
			//    7   15:f2i             
			//    8   16:aload_0         
			//    9   17:getfield        #20  <Field MotionEvent a>
			//   10   20:invokevirtual   #42  <Method float MotionEvent.getY()>
			//   11   23:f2i             
			//   12   24:bipush          25
			//   13   26:invokestatic    #45  <Method Poi b.a(b, int, int, int)>
			//   14   29:astore_2        
				if(com.amap.api.mapcore.util.b.k(b) == null)
					break MISSING_BLOCK_LABEL_84;
			//   15   30:aload_0         
			//   16   31:getfield        #18  <Field b b>
			//   17   34:invokestatic    #49  <Method com.amap.api.maps.AMap$OnPOIClickListener b.k(b)>
			//   18   37:ifnull          84
				if(poi != null)
			//*  19   40:aload_2         
			//*  20   41:ifnull          70
				{
					try
					{
						message.what = 20;
			//   21   44:aload_1         
			//   22   45:bipush          20
			//   23   47:putfield        #53  <Field int Message.what>
						message.obj = ((Object) (poi));
			//   24   50:aload_1         
			//   25   51:aload_2         
			//   26   52:putfield        #57  <Field Object Message.obj>
						b.i.sendMessage(message);
			//   27   55:aload_0         
			//   28   56:getfield        #18  <Field b b>
			//   29   59:getfield        #61  <Field Handler b.i>
			//   30   62:aload_1         
			//   31   63:invokevirtual   #67  <Method boolean Handler.sendMessage(Message)>
			//   32   66:pop             
					}
			//*  33   67:goto            95
			//*  34   70:aload_0         
			//*  35   71:getfield        #18  <Field b b>
			//*  36   74:aload_0         
			//*  37   75:getfield        #20  <Field MotionEvent a>
			//*  38   78:invokestatic    #69  <Method void b.a(b, MotionEvent)>
			//*  39   81:goto            95
			//*  40   84:aload_0         
			//*  41   85:getfield        #18  <Field b b>
			//*  42   88:aload_0         
			//*  43   89:getfield        #20  <Field MotionEvent a>
			//*  44   92:invokestatic    #69  <Method void b.a(b, MotionEvent)>
			//*  45   95:return          
					catch(Throwable throwable)
			//*  46   96:astore_1        
					{
						throwable.printStackTrace();
			//   47   97:aload_1         
			//   48   98:invokevirtual   #72  <Method void Throwable.printStackTrace()>
						return;
			//   49  101:return          
					}
					break MISSING_BLOCK_LABEL_95;
				}
				com.amap.api.mapcore.util.b.a(b, a);
				break MISSING_BLOCK_LABEL_95;
				com.amap.api.mapcore.util.b.a(b, a);
			}

			final MotionEvent a;
			final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field b b>
				a = motionevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field MotionEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #22  <Class b$14>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #1054 <Method void b$14(b, MotionEvent)>
	//    6   10:invokevirtual   #1058 <Method void queueEvent(Runnable)>
	//    7   13:return          
	}

	static boolean b(com.amap.api.mapcore.util.b b1, boolean flag)
	{
		b1.aj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #340 <Field boolean aj>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private boolean b(CameraPosition cameraposition)
	{
		if(cameraposition.zoom < 7F)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1063 <Field float CameraPosition.zoom>
	//*   2    4:ldc2            #1064 <Float 7F>
	//*   3    7:fcmpg           
	//*   4    8:ifge            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		if(!cameraposition.isAbroad)
	//*   9   15:aload_1         
	//*  10   16:getfield        #1067 <Field boolean CameraPosition.isAbroad>
	//*  11   19:ifne            63
		{
			if(c != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #322 <Field MapConfig c>
	//*  14   26:ifnull          65
			{
				try
				{
					flag = ew.a(c.getGeoRectangle().getClipRect());
	//   15   29:aload_0         
	//   16   30:getfield        #322 <Field MapConfig c>
	//   17   33:invokevirtual   #745 <Method Rectangle MapConfig.getGeoRectangle()>
	//   18   36:invokevirtual   #1071 <Method IPoint[] Rectangle.getClipRect()>
	//   19   39:invokestatic    #1076 <Method boolean ew.a(IPoint[])>
	//   20   42:istore_2        
				}
	//*  21   43:iload_2         
	//*  22   44:ifne            52
	//*  23   47:iconst_1        
	//*  24   48:istore_2        
	//*  25   49:goto            54
	//*  26   52:iconst_0        
	//*  27   53:istore_2        
	//*  28   54:iload_2         
	//*  29   55:ireturn         
				// Misplaced declaration of an exception variable
				catch(CameraPosition cameraposition)
	//*  30   56:astore_1        
				{
					((Throwable) (cameraposition)).printStackTrace();
	//   31   57:aload_1         
	//   32   58:invokevirtual   #766 <Method void Throwable.printStackTrace()>
					return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
				}
				if(!flag)
					flag = true;
				else
					flag = false;
				return flag;
			}
		} else
		{
			flag = true;
	//   35   63:iconst_1        
	//   36   64:istore_2        
		}
		return flag;
	//   37   65:iload_2         
	//   38   66:ireturn         
	}

	static com.amap.api.maps.AMap.OnMapLoadedListener c(com.amap.api.mapcore.util.b b1)
	{
		return b1.w;
	//    0    0:aload_0         
	//    1    1:getfield        #865 <Field com.amap.api.maps.AMap$OnMapLoadedListener w>
	//    2    4:areturn         
	}

	private void c(MotionEvent motionevent)
	{
		i.post(new Runnable(motionevent) {

			public void run()
			{
				Message message = Message.obtain();
			//    0    0:invokestatic    #32  <Method Message Message.obtain()>
			//    1    3:astore_1        
				message.what = 19;
			//    2    4:aload_1         
			//    3    5:bipush          19
			//    4    7:putfield        #36  <Field int Message.what>
				message.arg1 = (int)a.getX();
			//    5   10:aload_1         
			//    6   11:aload_0         
			//    7   12:getfield        #21  <Field MotionEvent a>
			//    8   15:invokevirtual   #42  <Method float MotionEvent.getX()>
			//    9   18:f2i             
			//   10   19:putfield        #45  <Field int Message.arg1>
				message.arg2 = (int)a.getY();
			//   11   22:aload_1         
			//   12   23:aload_0         
			//   13   24:getfield        #21  <Field MotionEvent a>
			//   14   27:invokevirtual   #48  <Method float MotionEvent.getY()>
			//   15   30:f2i             
			//   16   31:putfield        #51  <Field int Message.arg2>
				b.i.sendMessage(message);
			//   17   34:aload_0         
			//   18   35:getfield        #19  <Field b b>
			//   19   38:getfield        #55  <Field Handler b.i>
			//   20   41:aload_1         
			//   21   42:invokevirtual   #61  <Method boolean Handler.sendMessage(Message)>
			//   22   45:pop             
			//   23   46:return          
			}

			final MotionEvent a;
			final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field b b>
				a = motionevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field MotionEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #414 <Field Handler i>
	//    2    4:new             #24  <Class b$15>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #1078 <Method void b$15(b, MotionEvent)>
	//    7   13:invokevirtual   #791 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	private void c(AbstractCameraUpdateMessage abstractcameraupdatemessage)
	{
		abstractcameraupdatemessage.isUseAnchor = Z;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #324 <Field boolean Z>
	//    3    5:putfield        #1084 <Field boolean AbstractCameraUpdateMessage.isUseAnchor>
		if(Z)
	//*   4    8:aload_0         
	//*   5    9:getfield        #324 <Field boolean Z>
	//*   6   12:ifeq            37
		{
			abstractcameraupdatemessage.anchorX = c.getAnchorX();
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #322 <Field MapConfig c>
	//   10   20:invokevirtual   #1087 <Method int MapConfig.getAnchorX()>
	//   11   23:putfield        #1090 <Field int AbstractCameraUpdateMessage.anchorX>
			abstractcameraupdatemessage.anchorY = c.getAnchorY();
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #322 <Field MapConfig c>
	//   15   31:invokevirtual   #1093 <Method int MapConfig.getAnchorY()>
	//   16   34:putfield        #1096 <Field int AbstractCameraUpdateMessage.anchorY>
		}
		if(abstractcameraupdatemessage.width == 0)
	//*  17   37:aload_1         
	//*  18   38:getfield        #1099 <Field int AbstractCameraUpdateMessage.width>
	//*  19   41:ifne            52
			abstractcameraupdatemessage.width = getMapWidth();
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:invokevirtual   #732 <Method int getMapWidth()>
	//   23   49:putfield        #1099 <Field int AbstractCameraUpdateMessage.width>
		if(abstractcameraupdatemessage.height == 0)
	//*  24   52:aload_1         
	//*  25   53:getfield        #1102 <Field int AbstractCameraUpdateMessage.height>
	//*  26   56:ifne            67
			abstractcameraupdatemessage.height = getMapHeight();
	//   27   59:aload_1         
	//   28   60:aload_0         
	//   29   61:invokevirtual   #735 <Method int getMapHeight()>
	//   30   64:putfield        #1102 <Field int AbstractCameraUpdateMessage.height>
		abstractcameraupdatemessage.mapConfig = c;
	//   31   67:aload_1         
	//   32   68:aload_0         
	//   33   69:getfield        #322 <Field MapConfig c>
	//   34   72:putfield        #1105 <Field MapConfig AbstractCameraUpdateMessage.mapConfig>
	//   35   75:return          
	}

	private boolean c(int i1, int j1)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field GLMapEngine f>
	//*   2    4:ifnull          17
			return f.getSrvViewStateBoolValue(i1, j1);
	//    3    7:aload_0         
	//    4    8:getfield        #545 <Field GLMapEngine f>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #1109 <Method boolean GLMapEngine.getSrvViewStateBoolValue(int, int)>
	//    8   16:ireturn         
		else
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	static boolean c(com.amap.api.mapcore.util.b b1, boolean flag)
	{
		b1.at = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #359 <Field boolean at>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static com.amap.api.maps.AMap.OnMapTouchListener d(com.amap.api.mapcore.util.b b1)
	{
		return b1.z;
	//    0    0:aload_0         
	//    1    1:getfield        #871 <Field com.amap.api.maps.AMap$OnMapTouchListener z>
	//    2    4:areturn         
	}

	private boolean d(MotionEvent motionevent)
	{
		if(u != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #861 <Field com.amap.api.maps.AMap$OnPolylineClickListener u>
	//*   2    4:ifnull          85
		{
			DPoint dpoint = DPoint.obtain();
	//    3    7:invokestatic    #941 <Method DPoint DPoint.obtain()>
	//    4   10:astore_2        
			b((int)motionevent.getX(), (int)motionevent.getY(), dpoint);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #924 <Method float MotionEvent.getX()>
	//    8   16:f2i             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #927 <Method float MotionEvent.getY()>
	//   11   21:f2i             
	//   12   22:aload_2         
	//   13   23:invokevirtual   #944 <Method void b(int, int, DPoint)>
			motionevent = ((MotionEvent) (new LatLng(dpoint.y, dpoint.x)));
	//   14   26:new             #837 <Class LatLng>
	//   15   29:dup             
	//   16   30:aload_2         
	//   17   31:getfield        #946 <Field double DPoint.y>
	//   18   34:aload_2         
	//   19   35:getfield        #948 <Field double DPoint.x>
	//   20   38:invokespecial   #951 <Method void LatLng(double, double)>
	//   21   41:astore_1        
			dpoint.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #952 <Method void DPoint.recycle()>
			if(motionevent != null)
	//*  24   46:aload_1         
	//*  25   47:ifnull          85
			{
				motionevent = ((MotionEvent) (S.a(((LatLng) (motionevent)))));
	//   26   50:aload_0         
	//   27   51:getfield        #589 <Field q S>
	//   28   54:aload_1         
	//   29   55:invokevirtual   #1114 <Method dd q.a(LatLng)>
	//   30   58:astore_1        
				if(motionevent != null)
	//*  31   59:aload_1         
	//*  32   60:ifnull          85
				{
					u.onPolylineClick(new Polyline(((com.autonavi.amap.mapcore.interfaces.IPolyline) ((dg)motionevent))));
	//   33   63:aload_0         
	//   34   64:getfield        #861 <Field com.amap.api.maps.AMap$OnPolylineClickListener u>
	//   35   67:new             #1116 <Class Polyline>
	//   36   70:dup             
	//   37   71:aload_1         
	//   38   72:checkcast       #1118 <Class dg>
	//   39   75:invokespecial   #1121 <Method void Polyline(com.autonavi.amap.mapcore.interfaces.IPolyline)>
	//   40   78:invokeinterface #1127 <Method void com.amap.api.maps.AMap$OnPolylineClickListener.onPolylineClick(Polyline)>
					return false;
	//   41   83:iconst_0        
	//   42   84:ireturn         
				}
			}
		}
		return false;
	//   43   85:iconst_0        
	//   44   86:ireturn         
	}

	static fq e(com.amap.api.mapcore.util.b b1)
	{
		return b1.Q;
	//    0    0:aload_0         
	//    1    1:getfield        #570 <Field fq Q>
	//    2    4:areturn         
	}

	private boolean e(MotionEvent motionevent)
		throws RemoteException
	{
		if(!b.b(motionevent))
			break MISSING_BLOCK_LABEL_157;
	//    0    0:aload_0         
	//    1    1:getfield        #599 <Field y b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1130 <Method boolean y.b(MotionEvent)>
	//    4    8:ifeq            157
		motionevent = ((MotionEvent) (b.e()));
	//    5   11:aload_0         
	//    6   12:getfield        #599 <Field y b>
	//    7   15:invokevirtual   #1133 <Method k y.e()>
	//    8   18:astore_1        
		if(motionevent == null)
	//*   9   19:aload_1         
	//*  10   20:ifnonnull       25
			return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		boolean flag;
		Marker marker = new Marker(((com.autonavi.amap.mapcore.interfaces.IMarker) ((dj)motionevent)));
	//   13   25:new             #954 <Class Marker>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:checkcast       #1135 <Class dj>
	//   17   33:invokespecial   #1138 <Method void Marker(com.autonavi.amap.mapcore.interfaces.IMarker)>
	//   18   36:astore          4
		b.a(((db) ((dj)motionevent)));
	//   19   38:aload_0         
	//   20   39:getfield        #599 <Field y b>
	//   21   42:aload_1         
	//   22   43:checkcast       #1135 <Class dj>
	//   23   46:invokevirtual   #1141 <Method void y.a(db)>
		if(t == null)
			break MISSING_BLOCK_LABEL_86;
	//   24   49:aload_0         
	//   25   50:getfield        #859 <Field com.amap.api.maps.AMap$OnMarkerClickListener t>
	//   26   53:ifnull          86
		flag = t.onMarkerClick(marker);
	//   27   56:aload_0         
	//   28   57:getfield        #859 <Field com.amap.api.maps.AMap$OnMarkerClickListener t>
	//   29   60:aload           4
	//   30   62:invokeinterface #1147 <Method boolean com.amap.api.maps.AMap$OnMarkerClickListener.onMarkerClick(Marker)>
	//   31   67:istore_3        
		if(flag)
			break MISSING_BLOCK_LABEL_84;
	//   32   68:iload_3         
	//   33   69:ifne            84
		int i1 = b.h();
	//   34   72:aload_0         
	//   35   73:getfield        #599 <Field y b>
	//   36   76:invokevirtual   #1149 <Method int y.h()>
	//   37   79:istore_2        
		if(i1 > 0)
			break MISSING_BLOCK_LABEL_88;
	//   38   80:iload_2         
	//   39   81:ifgt            88
		return true;
	//   40   84:iconst_1        
	//   41   85:ireturn         
		flag = true;
	//   42   86:iconst_1        
	//   43   87:istore_3        
		a(((k) ((dj)motionevent)));
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:checkcast       #1135 <Class dj>
	//   47   93:invokevirtual   #1152 <Method void a(k)>
		if(((k) (motionevent)).g())
			break MISSING_BLOCK_LABEL_140;
	//   48   96:aload_1         
	//   49   97:invokevirtual   #1154 <Method boolean k.g()>
	//   50  100:ifne            140
		motionevent = ((MotionEvent) (((k) (motionevent)).b()));
	//   51  103:aload_1         
	//   52  104:invokevirtual   #933 <Method LatLng k.b()>
	//   53  107:astore_1        
		if(motionevent == null)
			break MISSING_BLOCK_LABEL_140;
	//   54  108:aload_1         
	//   55  109:ifnull          140
		IPoint ipoint = IPoint.obtain();
	//   56  112:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//   57  115:astore          4
		a(((LatLng) (motionevent)).latitude, ((LatLng) (motionevent)).longitude, ipoint);
	//   58  117:aload_0         
	//   59  118:aload_1         
	//   60  119:getfield        #843 <Field double LatLng.latitude>
	//   61  122:aload_1         
	//   62  123:getfield        #840 <Field double LatLng.longitude>
	//   63  126:aload           4
	//   64  128:invokevirtual   #1156 <Method void a(double, double, IPoint)>
		a(com.amap.api.mapcore.util.al.a(((Point) (ipoint))));
	//   65  131:aload_0         
	//   66  132:aload           4
	//   67  134:invokestatic    #1161 <Method AbstractCameraUpdateMessage al.a(Point)>
	//   68  137:invokevirtual   #1163 <Method void a(AbstractCameraUpdateMessage)>
		return flag;
	//   69  140:iload_3         
	//   70  141:ireturn         
		motionevent;
	//   71  142:astore_1        
		hm.c(((Throwable) (motionevent)), "AMapDelegateImp", "onMarkerTap");
	//   72  143:aload_1         
	//   73  144:ldc2            #1165 <String "AMapDelegateImp">
	//   74  147:ldc2            #1167 <String "onMarkerTap">
	//   75  150:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
		((Throwable) (motionevent)).printStackTrace();
	//   76  153:aload_1         
	//   77  154:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		return false;
	//   78  157:iconst_0        
	//   79  158:ireturn         
	}

	static com.amap.api.maps.AMap.onMapPrintScreenListener f(com.amap.api.mapcore.util.b b1)
	{
		return b1.G;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field com.amap.api.maps.AMap$onMapPrintScreenListener G>
	//    2    4:areturn         
	}

	private boolean f(MotionEvent motionevent)
	{
		if(aZ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #663 <Field bb aZ>
	//*   2    4:ifnull          48
		{
			IPoint ipoint = IPoint.obtain();
	//    3    7:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//    4   10:astore_3        
			if(f != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #545 <Field GLMapEngine f>
	//*   7   15:ifnull          33
				a((int)motionevent.getX(), (int)motionevent.getY(), ipoint);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #924 <Method float MotionEvent.getX()>
	//   11   23:f2i             
	//   12   24:aload_1         
	//   13   25:invokevirtual   #927 <Method float MotionEvent.getY()>
	//   14   28:f2i             
	//   15   29:aload_3         
	//   16   30:invokevirtual   #1174 <Method void a(int, int, IPoint)>
			boolean flag = aZ.a(ipoint);
	//   17   33:aload_0         
	//   18   34:getfield        #663 <Field bb aZ>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #1177 <Method boolean bb.a(IPoint)>
	//   21   41:istore_2        
			ipoint.recycle();
	//   22   42:aload_3         
	//   23   43:invokevirtual   #1178 <Method void IPoint.recycle()>
			return flag;
	//   24   46:iload_2         
	//   25   47:ireturn         
		} else
		{
			return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		}
	}

	static com.amap.api.maps.AMap.OnMapScreenShotListener g(com.amap.api.mapcore.util.b b1)
	{
		return b1.H;
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field com.amap.api.maps.AMap$OnMapScreenShotListener H>
	//    2    4:areturn         
	}

	private boolean g(MotionEvent motionevent)
		throws RemoteException
	{
		if(J != null && J.a(motionevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #638 <Field aw J>
	//*   2    4:ifnull          66
	//*   3    7:aload_0         
	//*   4    8:getfield        #638 <Field aw J>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #1181 <Method boolean aw.a(MotionEvent)>
	//*   7   15:ifeq            66
		{
			if(C != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #877 <Field com.amap.api.maps.AMap$OnInfoWindowClickListener C>
	//*  10   22:ifnull          64
			{
				motionevent = ((MotionEvent) (b.e()));
	//   11   25:aload_0         
	//   12   26:getfield        #599 <Field y b>
	//   13   29:invokevirtual   #1133 <Method k y.e()>
	//   14   32:astore_1        
				if(!((k) (motionevent)).isVisible())
	//*  15   33:aload_1         
	//*  16   34:invokevirtual   #1184 <Method boolean k.isVisible()>
	//*  17   37:ifne            42
					return true;
	//   18   40:iconst_1        
	//   19   41:ireturn         
				motionevent = ((MotionEvent) (new Marker(((com.autonavi.amap.mapcore.interfaces.IMarker) ((dj)motionevent)))));
	//   20   42:new             #954 <Class Marker>
	//   21   45:dup             
	//   22   46:aload_1         
	//   23   47:checkcast       #1135 <Class dj>
	//   24   50:invokespecial   #1138 <Method void Marker(com.autonavi.amap.mapcore.interfaces.IMarker)>
	//   25   53:astore_1        
				C.onInfoWindowClick(((Marker) (motionevent)));
	//   26   54:aload_0         
	//   27   55:getfield        #877 <Field com.amap.api.maps.AMap$OnInfoWindowClickListener C>
	//   28   58:aload_1         
	//   29   59:invokeinterface #1189 <Method void com.amap.api.maps.AMap$OnInfoWindowClickListener.onInfoWindowClick(Marker)>
			}
			return true;
	//   30   64:iconst_1        
	//   31   65:ireturn         
		} else
		{
			return false;
	//   32   66:iconst_0        
	//   33   67:ireturn         
		}
	}

	private void h(int i1, boolean flag)
	{
		GLMapEngine glmapengine = f;
	//    0    0:aload_0         
	//    1    1:getfield        #545 <Field GLMapEngine f>
	//    2    4:astore          4
		int j1;
		if(flag)
	//*   3    6:iload_2         
	//*   4    7:ifeq            15
			j1 = 1;
	//    5   10:iconst_1        
	//    6   11:istore_3        
		else
	//*   7   12:goto            17
			j1 = 0;
	//    8   15:iconst_0        
	//    9   16:istore_3        
		glmapengine.setParamater(i1, 2012, j1, 0, 0, 0);
	//   10   17:aload           4
	//   11   19:iload_1         
	//   12   20:sipush          2012
	//   13   23:iload_3         
	//   14   24:iconst_0        
	//   15   25:iconst_0        
	//   16   26:iconst_0        
	//   17   27:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
	//   18   30:return          
	}

	static boolean h(com.amap.api.mapcore.util.b b1)
	{
		return b1.aM;
	//    0    0:aload_0         
	//    1    1:getfield        #386 <Field boolean aM>
	//    2    4:ireturn         
	}

	static af i(com.amap.api.mapcore.util.b b1)
	{
		return b1.R;
	//    0    0:aload_0         
	//    1    1:getfield        #594 <Field af R>
	//    2    4:areturn         
	}

	static boolean j(com.amap.api.mapcore.util.b b1)
	{
		return b1.aj;
	//    0    0:aload_0         
	//    1    1:getfield        #340 <Field boolean aj>
	//    2    4:ireturn         
	}

	static com.amap.api.maps.AMap.OnPOIClickListener k(com.amap.api.mapcore.util.b b1)
	{
		return b1.A;
	//    0    0:aload_0         
	//    1    1:getfield        #873 <Field com.amap.api.maps.AMap$OnPOIClickListener A>
	//    2    4:areturn         
	}

	static com.amap.api.maps.AMap.OnMapClickListener l(com.amap.api.mapcore.util.b b1)
	{
		return b1.y;
	//    0    0:aload_0         
	//    1    1:getfield        #869 <Field com.amap.api.maps.AMap$OnMapClickListener y>
	//    2    4:areturn         
	}

	static aw m(com.amap.api.mapcore.util.b b1)
	{
		return b1.J;
	//    0    0:aload_0         
	//    1    1:getfield        #638 <Field aw J>
	//    2    4:areturn         
	}

	static boolean n(com.amap.api.mapcore.util.b b1)
	{
		return b1.aa;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field boolean aa>
	//    2    4:ireturn         
	}

	static int o(com.amap.api.mapcore.util.b b1)
	{
		return b1.aU;
	//    0    0:aload_0         
	//    1    1:getfield        #1200 <Field int aU>
	//    2    4:ireturn         
	}

	static int p(com.amap.api.mapcore.util.b b1)
	{
		return b1.aV;
	//    0    0:aload_0         
	//    1    1:getfield        #1202 <Field int aV>
	//    2    4:ireturn         
	}

	static MyTrafficStyle q(com.amap.api.mapcore.util.b b1)
	{
		return b1.ao;
	//    0    0:aload_0         
	//    1    1:getfield        #353 <Field MyTrafficStyle ao>
	//    2    4:areturn         
	}

	static boolean r(com.amap.api.mapcore.util.b b1)
	{
		return b1.Y;
	//    0    0:aload_0         
	//    1    1:getfield        #315 <Field boolean Y>
	//    2    4:ireturn         
	}

	static boolean s(com.amap.api.mapcore.util.b b1)
	{
		return b1.aO;
	//    0    0:aload_0         
	//    1    1:getfield        #390 <Field boolean aO>
	//    2    4:ireturn         
	}

	static GLMapRender t(com.amap.api.mapcore.util.b b1)
	{
		return b1.aD;
	//    0    0:aload_0         
	//    1    1:getfield        #552 <Field GLMapRender aD>
	//    2    4:areturn         
	}

	static b u(com.amap.api.mapcore.util.b b1)
	{
		return b1.aW;
	//    0    0:aload_0         
	//    1    1:getfield        #584 <Field b$b aW>
	//    2    4:areturn         
	}

	static au v(com.amap.api.mapcore.util.b b1)
	{
		return b1.br;
	//    0    0:aload_0         
	//    1    1:getfield        #479 <Field au br>
	//    2    4:areturn         
	}

	private void v(int i1)
	{
		if(!aO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		aE.a();
	//    4    8:aload_0         
	//    5    9:getfield        #538 <Field o aE>
	//    6   12:invokevirtual   #1208 <Method void o.a()>
		aF = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #372 <Field boolean aF>
		aL = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #384 <Field boolean aL>
		try
		{
			stopAnimation();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #1211 <Method void stopAnimation()>
		}
	//*  15   29:goto            33
		catch(RemoteException remoteexception) { }
	//   16   32:astore_2        
		queueEvent(new Runnable(i1) {

			public void run()
			{
				try
				{
					b.f.clearAllMessages(a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field b b>
			//    2    4:getfield        #32  <Field GLMapEngine b.f>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field int a>
			//    5   11:invokevirtual   #37  <Method void GLMapEngine.clearAllMessages(int)>
					b.f.setParamater(a, 4001, 1, 0, 0, 0);
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field b b>
			//    8   18:getfield        #32  <Field GLMapEngine b.f>
			//    9   21:aload_0         
			//   10   22:getfield        #21  <Field int a>
			//   11   25:sipush          4001
			//   12   28:iconst_1        
			//   13   29:iconst_0        
			//   14   30:iconst_0        
			//   15   31:iconst_0        
			//   16   32:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
					return;
			//   17   35:return          
				}
				catch(Throwable throwable)
			//*  18   36:astore_1        
				{
					throwable.printStackTrace();
			//   19   37:aload_1         
			//   20   38:invokevirtual   #44  <Method void Throwable.printStackTrace()>
				}
			//   21   41:return          
			}

			final int a;
			final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field b b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   17   33:aload_0         
	//   18   34:new             #14  <Class b$10>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:invokespecial   #1214 <Method void b$10(b, int)>
	//   23   43:invokevirtual   #1058 <Method void queueEvent(Runnable)>
	//   24   46:return          
	}

	static r w(com.amap.api.mapcore.util.b b1)
	{
		return b1.aY;
	//    0    0:aload_0         
	//    1    1:getfield        #673 <Field r aY>
	//    2    4:areturn         
	}

	private void w(int i1)
	{
		aF = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #372 <Field boolean aF>
		aL = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #384 <Field boolean aL>
		if(ah)
	//*   6   10:aload_0         
	//*   7   11:getfield        #336 <Field boolean ah>
	//*   8   14:ifeq            22
			ah = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #336 <Field boolean ah>
		if(ag)
	//*  12   22:aload_0         
	//*  13   23:getfield        #334 <Field boolean ag>
	//*  14   26:ifeq            34
			ag = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #334 <Field boolean ag>
		if(ai)
	//*  18   34:aload_0         
	//*  19   35:getfield        #338 <Field boolean ai>
	//*  20   38:ifeq            46
			ai = false;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #338 <Field boolean ai>
		ad = false;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #328 <Field boolean ad>
		if(v != null && ae != null)
	//*  27   51:aload_0         
	//*  28   52:getfield        #863 <Field com.amap.api.maps.AMap$OnMarkerDragListener v>
	//*  29   55:ifnull          101
	//*  30   58:aload_0         
	//*  31   59:getfield        #330 <Field Marker ae>
	//*  32   62:ifnull          101
		{
			try
			{
				v.onMarkerDragEnd(ae);
	//   33   65:aload_0         
	//   34   66:getfield        #863 <Field com.amap.api.maps.AMap$OnMarkerDragListener v>
	//   35   69:aload_0         
	//   36   70:getfield        #330 <Field Marker ae>
	//   37   73:invokeinterface #1218 <Method void com.amap.api.maps.AMap$OnMarkerDragListener.onMarkerDragEnd(Marker)>
			}
	//*  38   78:goto            96
			catch(Throwable throwable)
	//*  39   81:astore_2        
			{
				hm.c(throwable, "AMapDelegateImp", "OnMarkerDragListener.onMarkerDragEnd");
	//   40   82:aload_2         
	//   41   83:ldc2            #1165 <String "AMapDelegateImp">
	//   42   86:ldc2            #1220 <String "OnMarkerDragListener.onMarkerDragEnd">
	//   43   89:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
				throwable.printStackTrace();
	//   44   92:aload_2         
	//   45   93:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			}
			ae = null;
	//   46   96:aload_0         
	//   47   97:aconst_null     
	//   48   98:putfield        #330 <Field Marker ae>
		}
		queueEvent(new Runnable(i1) {

			public void run()
			{
				try
				{
					b.f.setParamater(a, 4001, 0, 0, 0, 0);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field b b>
			//    2    4:getfield        #32  <Field GLMapEngine b.f>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field int a>
			//    5   11:sipush          4001
			//    6   14:iconst_0        
			//    7   15:iconst_0        
			//    8   16:iconst_0        
			//    9   17:iconst_0        
			//   10   18:invokevirtual   #38  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
					return;
			//   11   21:return          
				}
				catch(Throwable throwable1)
			//*  12   22:astore_1        
				{
					throwable1.printStackTrace();
			//   13   23:aload_1         
			//   14   24:invokevirtual   #41  <Method void Throwable.printStackTrace()>
				}
			//   15   27:return          
			}

			final int a;
			final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field b b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   49  101:aload_0         
	//   50  102:new             #18  <Class b$12>
	//   51  105:dup             
	//   52  106:aload_0         
	//   53  107:iload_1         
	//   54  108:invokespecial   #1221 <Method void b$12(b, int)>
	//   55  111:invokevirtual   #1058 <Method void queueEvent(Runnable)>
		P.postDelayed(new Runnable() {

			public void run()
			{
				com.amap.api.mapcore.util.b.a(a, 1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field b a>
			//    2    4:iconst_1        
			//    3    5:invokestatic    #25  <Method int b.a(b, int)>
			//    4    8:pop             
			//    5    9:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, 300L);
	//   56  114:aload_0         
	//   57  115:getfield        #554 <Field t P>
	//   58  118:new             #20  <Class b$13>
	//   59  121:dup             
	//   60  122:aload_0         
	//   61  123:invokespecial   #1222 <Method void b$13(b)>
	//   62  126:ldc2w           #1223 <Long 300L>
	//   63  129:invokeinterface #1228 <Method boolean t.postDelayed(Runnable, long)>
	//   64  134:pop             
	//   65  135:return          
	}

	static ds x(com.amap.api.mapcore.util.b b1)
	{
		return b1.aX;
	//    0    0:aload_0         
	//    1    1:getfield        #668 <Field ds aX>
	//    2    4:areturn         
	}

	private void x(int i1)
	{
	//    0    0:return          
	}

	static n y(com.amap.api.mapcore.util.b b1)
	{
		return b1.W;
	//    0    0:aload_0         
	//    1    1:getfield        #604 <Field n W>
	//    2    4:areturn         
	}

	private void y(int i1)
	{
		if(aO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            30
			f.setParamater(i1, 2056, 1000, 500, 200, 800);
	//    3    7:aload_0         
	//    4    8:getfield        #545 <Field GLMapEngine f>
	//    5   11:iload_1         
	//    6   12:sipush          2056
	//    7   15:sipush          1000
	//    8   18:sipush          500
	//    9   21:sipush          200
	//   10   24:sipush          800
	//   11   27:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
	//   12   30:return          
	}

	static com.amap.api.maps.AMap.OnIndoorBuildingActiveListener z(com.amap.api.mapcore.util.b b1)
	{
		return b1.D;
	//    0    0:aload_0         
	//    1    1:getfield        #879 <Field com.amap.api.maps.AMap$OnIndoorBuildingActiveListener D>
	//    2    4:areturn         
	}

	private LatLng z()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          52
		{
			DPoint dpoint = VirtualEarthProjection.pixelsToLatLong(c.getSX(), c.getSY(), 20);
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:invokevirtual   #748 <Method int MapConfig.getSX()>
	//    6   14:i2l             
	//    7   15:aload_0         
	//    8   16:getfield        #322 <Field MapConfig c>
	//    9   19:invokevirtual   #751 <Method int MapConfig.getSY()>
	//   10   22:i2l             
	//   11   23:bipush          20
	//   12   25:invokestatic    #1035 <Method DPoint VirtualEarthProjection.pixelsToLatLong(long, long, int)>
	//   13   28:astore_1        
			LatLng latlng = new LatLng(dpoint.y, dpoint.x, false);
	//   14   29:new             #837 <Class LatLng>
	//   15   32:dup             
	//   16   33:aload_1         
	//   17   34:getfield        #946 <Field double DPoint.y>
	//   18   37:aload_1         
	//   19   38:getfield        #948 <Field double DPoint.x>
	//   20   41:iconst_0        
	//   21   42:invokespecial   #1043 <Method void LatLng(double, double, boolean)>
	//   22   45:astore_2        
			dpoint.recycle();
	//   23   46:aload_1         
	//   24   47:invokevirtual   #952 <Method void DPoint.recycle()>
			return latlng;
	//   25   50:aload_2         
	//   26   51:areturn         
		} else
		{
			return null;
	//   27   52:aconst_null     
	//   28   53:areturn         
		}
	}

	public float a(int i1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          15
			return c.getSZ();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//    6   14:freturn         
		else
			return 0.0F;
	//    7   15:fconst_0        
	//    8   16:freturn         
	}

	public int a(int i1, Rect rect, int j1, int k1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		int l1 = ((int) (flag));
	//    2    3:iload           7
	//    3    5:istore          6
		if(f != null)
	//*   4    7:aload_0         
	//*   5    8:getfield        #545 <Field GLMapEngine f>
	//*   6   11:ifnull          340
		{
			l1 = ((int) (flag));
	//    7   14:iload           7
	//    8   16:istore          6
			if(i1 >= 0)
	//*   9   18:iload_1         
	//*  10   19:iflt            340
			{
				l1 = ((int) (flag));
	//   11   22:iload           7
	//   12   24:istore          6
				if(rect != null)
	//*  13   26:aload_2         
	//*  14   27:ifnull          340
				{
					l1 = f.getEngineIDWithType(i1);
	//   15   30:aload_0         
	//   16   31:getfield        #545 <Field GLMapEngine f>
	//   17   34:iload_1         
	//   18   35:invokevirtual   #1239 <Method int GLMapEngine.getEngineIDWithType(int)>
	//   19   38:istore          6
					if(!f.isEngineCreated(l1))
	//*  20   40:aload_0         
	//*  21   41:getfield        #545 <Field GLMapEngine f>
	//*  22   44:iload           6
	//*  23   46:invokevirtual   #1242 <Method boolean GLMapEngine.isEngineCreated(int)>
	//*  24   49:ifne            315
					{
						i1 = e.getResources().getDisplayMetrics().densityDpi;
	//   25   52:aload_0         
	//   26   53:getfield        #501 <Field Context e>
	//   27   56:invokevirtual   #1248 <Method Resources Context.getResources()>
	//   28   59:invokevirtual   #1254 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   29   62:getfield        #1259 <Field int DisplayMetrics.densityDpi>
	//   30   65:istore_1        
						float f1 = e.getResources().getDisplayMetrics().density;
	//   31   66:aload_0         
	//   32   67:getfield        #501 <Field Context e>
	//   33   70:invokevirtual   #1248 <Method Resources Context.getResources()>
	//   34   73:invokevirtual   #1254 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   35   76:getfield        #1262 <Field float DisplayMetrics.density>
	//   36   79:fstore          5
						aH = GLMapState.calMapZoomScalefactor(j1, k1, i1);
	//   37   81:aload_0         
	//   38   82:iload_3         
	//   39   83:iload           4
	//   40   85:iload_1         
	//   41   86:invokestatic    #1266 <Method float GLMapState.calMapZoomScalefactor(int, int, int)>
	//   42   89:putfield        #376 <Field float aH>
						com.autonavi.ae.gmap.GLMapEngine.MapViewInitParam mapviewinitparam = new com.autonavi.ae.gmap.GLMapEngine.MapViewInitParam();
	//   43   92:new             #1268 <Class com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam>
	//   44   95:dup             
	//   45   96:invokespecial   #1269 <Method void com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam()>
	//   46   99:astore          8
						mapviewinitparam.engineId = l1;
	//   47  101:aload           8
	//   48  103:iload           6
	//   49  105:putfield        #1272 <Field int com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam.engineId>
						mapviewinitparam.x = rect.left;
	//   50  108:aload           8
	//   51  110:aload_2         
	//   52  111:getfield        #1275 <Field int Rect.left>
	//   53  114:putfield        #1277 <Field int com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam.x>
						mapviewinitparam.y = rect.top;
	//   54  117:aload           8
	//   55  119:aload_2         
	//   56  120:getfield        #1280 <Field int Rect.top>
	//   57  123:putfield        #1282 <Field int com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam.y>
						mapviewinitparam.width = rect.width();
	//   58  126:aload           8
	//   59  128:aload_2         
	//   60  129:invokevirtual   #1284 <Method int Rect.width()>
	//   61  132:putfield        #1285 <Field int com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam.width>
						mapviewinitparam.height = rect.height();
	//   62  135:aload           8
	//   63  137:aload_2         
	//   64  138:invokevirtual   #1287 <Method int Rect.height()>
	//   65  141:putfield        #1288 <Field int com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam.height>
						mapviewinitparam.screenWidth = j1;
	//   66  144:aload           8
	//   67  146:iload_3         
	//   68  147:putfield        #1291 <Field int com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam.screenWidth>
						mapviewinitparam.screenHeight = k1;
	//   69  150:aload           8
	//   70  152:iload           4
	//   71  154:putfield        #1294 <Field int com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam.screenHeight>
						mapviewinitparam.screenScale = f1;
	//   72  157:aload           8
	//   73  159:fload           5
	//   74  161:putfield        #1297 <Field float com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam.screenScale>
						mapviewinitparam.textScale = aI * f1;
	//   75  164:aload           8
	//   76  166:aload_0         
	//   77  167:getfield        #378 <Field float aI>
	//   78  170:fload           5
	//   79  172:fmul            
	//   80  173:putfield        #1300 <Field float com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam.textScale>
						mapviewinitparam.mapZoomScale = aH;
	//   81  176:aload           8
	//   82  178:aload_0         
	//   83  179:getfield        #376 <Field float aH>
	//   84  182:putfield        #1303 <Field float com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam.mapZoomScale>
						f.createAMapEngineWithFrame(mapviewinitparam);
	//   85  185:aload_0         
	//   86  186:getfield        #545 <Field GLMapEngine f>
	//   87  189:aload           8
	//   88  191:invokevirtual   #1307 <Method void GLMapEngine.createAMapEngineWithFrame(com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam)>
						rect = ((Rect) (f.getMapState(l1)));
	//   89  194:aload_0         
	//   90  195:getfield        #545 <Field GLMapEngine f>
	//   91  198:iload           6
	//   92  200:invokevirtual   #729 <Method GLMapState GLMapEngine.getMapState(int)>
	//   93  203:astore_2        
						((GLMapState) (rect)).setMapZoomer(c.getSZ());
	//   94  204:aload_2         
	//   95  205:aload_0         
	//   96  206:getfield        #322 <Field MapConfig c>
	//   97  209:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//   98  212:invokevirtual   #1310 <Method void GLMapState.setMapZoomer(float)>
						((GLMapState) (rect)).setCameraDegree(c.getSC());
	//   99  215:aload_2         
	//  100  216:aload_0         
	//  101  217:getfield        #322 <Field MapConfig c>
	//  102  220:invokevirtual   #1313 <Method float MapConfig.getSC()>
	//  103  223:invokevirtual   #1316 <Method void GLMapState.setCameraDegree(float)>
						((GLMapState) (rect)).setMapAngle(c.getSR());
	//  104  226:aload_2         
	//  105  227:aload_0         
	//  106  228:getfield        #322 <Field MapConfig c>
	//  107  231:invokevirtual   #1319 <Method float MapConfig.getSR()>
	//  108  234:invokevirtual   #1322 <Method void GLMapState.setMapAngle(float)>
						((GLMapState) (rect)).setMapGeoCenter(c.getSX(), c.getSY());
	//  109  237:aload_2         
	//  110  238:aload_0         
	//  111  239:getfield        #322 <Field MapConfig c>
	//  112  242:invokevirtual   #748 <Method int MapConfig.getSX()>
	//  113  245:aload_0         
	//  114  246:getfield        #322 <Field MapConfig c>
	//  115  249:invokevirtual   #751 <Method int MapConfig.getSY()>
	//  116  252:invokevirtual   #1326 <Method void GLMapState.setMapGeoCenter(int, int)>
						f.setMapState(l1, ((GLMapState) (rect)));
	//  117  255:aload_0         
	//  118  256:getfield        #545 <Field GLMapEngine f>
	//  119  259:iload           6
	//  120  261:aload_2         
	//  121  262:invokevirtual   #1330 <Method void GLMapEngine.setMapState(int, GLMapState)>
						rect = ((Rect) (new GLOverlayBundle(l1, ((s) (this)))));
	//  122  265:new             #1332 <Class GLOverlayBundle>
	//  123  268:dup             
	//  124  269:iload           6
	//  125  271:aload_0         
	//  126  272:invokespecial   #1335 <Method void GLOverlayBundle(int, s)>
	//  127  275:astore_2        
						f.setOvelayBundle(l1, ((GLOverlayBundle) (rect)));
	//  128  276:aload_0         
	//  129  277:getfield        #545 <Field GLMapEngine f>
	//  130  280:iload           6
	//  131  282:aload_2         
	//  132  283:invokevirtual   #1339 <Method void GLMapEngine.setOvelayBundle(int, GLOverlayBundle)>
						if(l1 == 2)
	//* 133  286:iload           6
	//* 134  288:iconst_2        
	//* 135  289:icmpne          306
						{
							a(l1, -1, false);
	//  136  292:aload_0         
	//  137  293:iload           6
	//  138  295:iconst_m1       
	//  139  296:iconst_0        
	//  140  297:invokevirtual   #1341 <Method void a(int, int, boolean)>
							x(l1);
	//  141  300:aload_0         
	//  142  301:iload           6
	//  143  303:invokespecial   #1343 <Method void x(int)>
						}
						y(l1);
	//  144  306:aload_0         
	//  145  307:iload           6
	//  146  309:invokespecial   #1345 <Method void y(int)>
						return l1;
	//  147  312:iload           6
	//  148  314:ireturn         
					}
					a(l1, rect.left, rect.top, rect.width(), rect.height(), j1, k1);
	//  149  315:aload_0         
	//  150  316:iload           6
	//  151  318:aload_2         
	//  152  319:getfield        #1275 <Field int Rect.left>
	//  153  322:aload_2         
	//  154  323:getfield        #1280 <Field int Rect.top>
	//  155  326:aload_2         
	//  156  327:invokevirtual   #1284 <Method int Rect.width()>
	//  157  330:aload_2         
	//  158  331:invokevirtual   #1287 <Method int Rect.height()>
	//  159  334:iload_3         
	//  160  335:iload           4
	//  161  337:invokevirtual   #1348 <Method void a(int, int, int, int, int, int, int)>
				}
			}
		}
		return l1;
	//  162  340:iload           6
	//  163  342:ireturn         
	}

	public int a(EAMapPlatformGestureInfo eamapplatformgestureinfo)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field GLMapEngine f>
	//*   2    4:ifnull          16
			return f.getEngineIDWithGestureInfo(eamapplatformgestureinfo);
	//    3    7:aload_0         
	//    4    8:getfield        #545 <Field GLMapEngine f>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #1352 <Method int GLMapEngine.getEngineIDWithGestureInfo(EAMapPlatformGestureInfo)>
	//    7   15:ireturn         
		else
			return 1;
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	public int a(IMarkerAction imarkeraction, Rect rect)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ab a(BitmapDescriptor bitmapdescriptor)
	{
		if(bitmapdescriptor == null || bitmapdescriptor.getBitmap() == null || bitmapdescriptor.getBitmap().isRecycled())
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #1358 <Method Bitmap BitmapDescriptor.getBitmap()>
	//*   4    8:ifnull          21
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #1358 <Method Bitmap BitmapDescriptor.getBitmap()>
	//*   7   15:invokevirtual   #1363 <Method boolean Bitmap.isRecycled()>
	//*   8   18:ifeq            23
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
		List list = az;
	//   11   23:aload_0         
	//   12   24:getfield        #370 <Field List az>
	//   13   27:astore          4
		list;
	//   14   29:aload           4
		JVM INSTR monitorenter ;
	//   15   31:monitorenter    
		int i1 = 0;
	//   16   32:iconst_0        
	//   17   33:istore_2        
_L2:
		boolean flag;
		ab ab1;
		if(i1 >= az.size())
			break; /* Loop/switch isn't completed */
	//   18   34:iload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #370 <Field List az>
	//   21   39:invokeinterface #694 <Method int List.size()>
	//   22   44:icmpge          89
		ab1 = (ab)az.get(i1);
	//   23   47:aload_0         
	//   24   48:getfield        #370 <Field List az>
	//   25   51:iload_2         
	//   26   52:invokeinterface #698 <Method Object List.get(int)>
	//   27   57:checkcast       #700 <Class ab>
	//   28   60:astore          5
		flag = ab1.e().equals(((Object) (bitmapdescriptor)));
	//   29   62:aload           5
	//   30   64:invokevirtual   #703 <Method BitmapDescriptor ab.e()>
	//   31   67:aload_1         
	//   32   68:invokevirtual   #1364 <Method boolean BitmapDescriptor.equals(Object)>
	//   33   71:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_82;
	//   34   72:iload_3         
	//   35   73:ifeq            82
		list;
	//   36   76:aload           4
		JVM INSTR monitorexit ;
	//   37   78:monitorexit     
		return ab1;
	//   38   79:aload           5
	//   39   81:areturn         
		i1++;
	//   40   82:iload_2         
	//   41   83:iconst_1        
	//   42   84:iadd            
	//   43   85:istore_2        
		if(true) goto _L2; else goto _L1
	//   44   86:goto            34
_L1:
		break MISSING_BLOCK_LABEL_101;
	//*  45   89:aload           4
	//*  46   91:monitorexit     
	//*  47   92:goto            101
		bitmapdescriptor;
	//   48   95:astore_1        
	//*  49   96:aload           4
		throw bitmapdescriptor;
	//   50   98:monitorexit     
	//   51   99:aload_1         
	//   52  100:athrow          
		return null;
	//   53  101:aconst_null     
	//   54  102:areturn         
	}

	public LatLngBounds a(LatLng latlng, float f1, float f2, float f3)
	{
		int i1 = getMapWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #732 <Method int getMapWidth()>
	//    2    4:istore          5
		int j1 = getMapHeight();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #735 <Method int getMapHeight()>
	//    5   10:istore          6
		if(i1 <= 0 || j1 <= 0 || V)
	//*   6   12:iload           5
	//*   7   14:ifle            29
	//*   8   17:iload           6
	//*   9   19:ifle            29
	//*  10   22:aload_0         
	//*  11   23:getfield        #313 <Field boolean V>
	//*  12   26:ifeq            31
			return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
		f1 = fd.a(c, f1);
	//   15   31:aload_0         
	//   16   32:getfield        #322 <Field MapConfig c>
	//   17   35:fload_2         
	//   18   36:invokestatic    #1368 <Method float fd.a(MapConfig, float)>
	//   19   39:fstore_2        
		GLMapState glmapstate = new GLMapState(1, f.getNativeInstance());
	//   20   40:new             #737 <Class GLMapState>
	//   21   43:dup             
	//   22   44:iconst_1        
	//   23   45:aload_0         
	//   24   46:getfield        #545 <Field GLMapEngine f>
	//   25   49:invokevirtual   #820 <Method long GLMapEngine.getNativeInstance()>
	//   26   52:invokespecial   #823 <Method void GLMapState(int, long)>
	//   27   55:astore          7
		if(latlng != null)
	//*  28   57:aload_1         
	//*  29   58:ifnull          125
		{
			IPoint ipoint = IPoint.obtain();
	//   30   61:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//   31   64:astore          8
			a(latlng.latitude, latlng.longitude, ipoint);
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:getfield        #843 <Field double LatLng.latitude>
	//   35   71:aload_1         
	//   36   72:getfield        #840 <Field double LatLng.longitude>
	//   37   75:aload           8
	//   38   77:invokevirtual   #1156 <Method void a(double, double, IPoint)>
			glmapstate.setCameraDegree(60F);
	//   39   80:aload           7
	//   40   82:ldc2            #928 <Float 60F>
	//   41   85:invokevirtual   #1316 <Method void GLMapState.setCameraDegree(float)>
			glmapstate.setMapAngle(0.0F);
	//   42   88:aload           7
	//   43   90:fconst_0        
	//   44   91:invokevirtual   #1322 <Method void GLMapState.setMapAngle(float)>
			glmapstate.setMapGeoCenter(ipoint.x, ipoint.y);
	//   45   94:aload           7
	//   46   96:aload           8
	//   47   98:getfield        #1369 <Field int IPoint.x>
	//   48  101:aload           8
	//   49  103:getfield        #1370 <Field int IPoint.y>
	//   50  106:invokevirtual   #1326 <Method void GLMapState.setMapGeoCenter(int, int)>
			glmapstate.setMapZoomer(f1);
	//   51  109:aload           7
	//   52  111:fload_2         
	//   53  112:invokevirtual   #1310 <Method void GLMapState.setMapZoomer(float)>
			glmapstate.recalculate();
	//   54  115:aload           7
	//   55  117:invokevirtual   #1373 <Method void GLMapState.recalculate()>
			ipoint.recycle();
	//   56  120:aload           8
	//   57  122:invokevirtual   #1178 <Method void IPoint.recycle()>
		}
		latlng = ((LatLng) (DPoint.obtain()));
	//   58  125:invokestatic    #941 <Method DPoint DPoint.obtain()>
	//   59  128:astore_1        
		a(glmapstate, 0, 0, ((DPoint) (latlng)));
	//   60  129:aload_0         
	//   61  130:aload           7
	//   62  132:iconst_0        
	//   63  133:iconst_0        
	//   64  134:aload_1         
	//   65  135:invokevirtual   #1376 <Method void a(GLMapState, int, int, DPoint)>
		LatLng latlng1 = new LatLng(((DPoint) (latlng)).y, ((DPoint) (latlng)).x, false);
	//   66  138:new             #837 <Class LatLng>
	//   67  141:dup             
	//   68  142:aload_1         
	//   69  143:getfield        #946 <Field double DPoint.y>
	//   70  146:aload_1         
	//   71  147:getfield        #948 <Field double DPoint.x>
	//   72  150:iconst_0        
	//   73  151:invokespecial   #1043 <Method void LatLng(double, double, boolean)>
	//   74  154:astore          8
		a(glmapstate, i1, j1, ((DPoint) (latlng)));
	//   75  156:aload_0         
	//   76  157:aload           7
	//   77  159:iload           5
	//   78  161:iload           6
	//   79  163:aload_1         
	//   80  164:invokevirtual   #1376 <Method void a(GLMapState, int, int, DPoint)>
		LatLng latlng2 = new LatLng(((DPoint) (latlng)).y, ((DPoint) (latlng)).x, false);
	//   81  167:new             #837 <Class LatLng>
	//   82  170:dup             
	//   83  171:aload_1         
	//   84  172:getfield        #946 <Field double DPoint.y>
	//   85  175:aload_1         
	//   86  176:getfield        #948 <Field double DPoint.x>
	//   87  179:iconst_0        
	//   88  180:invokespecial   #1043 <Method void LatLng(double, double, boolean)>
	//   89  183:astore          9
		((DPoint) (latlng)).recycle();
	//   90  185:aload_1         
	//   91  186:invokevirtual   #952 <Method void DPoint.recycle()>
		glmapstate.recycle();
	//   92  189:aload           7
	//   93  191:invokevirtual   #855 <Method void GLMapState.recycle()>
		return LatLngBounds.builder().include(latlng2).include(latlng1).build();
	//   94  194:invokestatic    #1380 <Method com.amap.api.maps.model.LatLngBounds$Builder LatLngBounds.builder()>
	//   95  197:aload           9
	//   96  199:invokevirtual   #1386 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   97  202:aload           8
	//   98  204:invokevirtual   #1386 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   99  207:invokevirtual   #1389 <Method LatLngBounds com.amap.api.maps.model.LatLngBounds$Builder.build()>
	//  100  210:areturn         
	}

	public GLMapEngine a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #545 <Field GLMapEngine f>
	//    2    4:areturn         
	}

	public ArrayList a(int i1, int j1, int k1, int l1)
	{
		if(!aO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		ArrayList arraylist = new ArrayList();
	//    5    9:new             #367 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #368 <Method void ArrayList()>
	//    8   16:astore          7
		byte abyte0[] = f.getLabelBuffer(i1, j1, k1, l1);
	//    9   18:aload_0         
	//   10   19:getfield        #545 <Field GLMapEngine f>
	//   11   22:iload_1         
	//   12   23:iload_2         
	//   13   24:iload_3         
	//   14   25:iload           4
	//   15   27:invokevirtual   #1394 <Method byte[] GLMapEngine.getLabelBuffer(int, int, int, int)>
	//   16   30:astore          8
		if(abyte0 == null)
	//*  17   32:aload           8
	//*  18   34:ifnonnull       39
			return null;
	//   19   37:aconst_null     
	//   20   38:areturn         
		j1 = GLConvertUtil.getInt(abyte0, 0);
	//   21   39:aload           8
	//   22   41:iconst_0        
	//   23   42:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//   24   45:istore_2        
		i1 = 0 + 4;
	//   25   46:iconst_0        
	//   26   47:iconst_4        
	//   27   48:iadd            
	//   28   49:istore_1        
		if(j1 >= 1)
	//*  29   50:iload_2         
	//*  30   51:iconst_1        
	//*  31   52:icmplt          60
			j1 = 1;
	//   32   55:iconst_1        
	//   33   56:istore_2        
		else
	//*  34   57:goto            62
			j1 = 0;
	//   35   60:iconst_0        
	//   36   61:istore_2        
		for(k1 = 0; k1 < j1; k1++)
	//*  37   62:iconst_0        
	//*  38   63:istore_3        
	//*  39   64:iload_3         
	//*  40   65:iload_2         
	//*  41   66:icmpge          400
		{
			MapLabelItem maplabelitem = new MapLabelItem();
	//   42   69:new             #1023 <Class MapLabelItem>
	//   43   72:dup             
	//   44   73:invokespecial   #1401 <Method void MapLabelItem()>
	//   45   76:astore          9
			l1 = GLConvertUtil.getInt(abyte0, i1);
	//   46   78:aload           8
	//   47   80:iload_1         
	//   48   81:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//   49   84:istore          4
			int i2 = i1 + 4;
	//   50   86:iload_1         
	//   51   87:iconst_4        
	//   52   88:iadd            
	//   53   89:istore          5
			i1 = GLConvertUtil.getInt(abyte0, i2);
	//   54   91:aload           8
	//   55   93:iload           5
	//   56   95:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//   57   98:istore_1        
			i2 += 4;
	//   58   99:iload           5
	//   59  101:iconst_4        
	//   60  102:iadd            
	//   61  103:istore          5
			maplabelitem.x = l1;
	//   62  105:aload           9
	//   63  107:iload           4
	//   64  109:putfield        #1402 <Field int MapLabelItem.x>
			maplabelitem.y = P.getHeight() - i1;
	//   65  112:aload           9
	//   66  114:aload_0         
	//   67  115:getfield        #554 <Field t P>
	//   68  118:invokeinterface #1405 <Method int t.getHeight()>
	//   69  123:iload_1         
	//   70  124:isub            
	//   71  125:putfield        #1406 <Field int MapLabelItem.y>
			maplabelitem.pixel20X = GLConvertUtil.getInt(abyte0, i2);
	//   72  128:aload           9
	//   73  130:aload           8
	//   74  132:iload           5
	//   75  134:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//   76  137:putfield        #1026 <Field int MapLabelItem.pixel20X>
			i1 = i2 + 4;
	//   77  140:iload           5
	//   78  142:iconst_4        
	//   79  143:iadd            
	//   80  144:istore_1        
			maplabelitem.pixel20Y = GLConvertUtil.getInt(abyte0, i1);
	//   81  145:aload           9
	//   82  147:aload           8
	//   83  149:iload_1         
	//   84  150:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//   85  153:putfield        #1029 <Field int MapLabelItem.pixel20Y>
			i1 += 4;
	//   86  156:iload_1         
	//   87  157:iconst_4        
	//   88  158:iadd            
	//   89  159:istore_1        
			maplabelitem.pixel20Z = GLConvertUtil.getInt(abyte0, i1);
	//   90  160:aload           9
	//   91  162:aload           8
	//   92  164:iload_1         
	//   93  165:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//   94  168:putfield        #1409 <Field int MapLabelItem.pixel20Z>
			i1 += 4;
	//   95  171:iload_1         
	//   96  172:iconst_4        
	//   97  173:iadd            
	//   98  174:istore_1        
			maplabelitem.type = GLConvertUtil.getInt(abyte0, i1);
	//   99  175:aload           9
	//  100  177:aload           8
	//  101  179:iload_1         
	//  102  180:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//  103  183:putfield        #1412 <Field int MapLabelItem.type>
			i1 += 4;
	//  104  186:iload_1         
	//  105  187:iconst_4        
	//  106  188:iadd            
	//  107  189:istore_1        
			maplabelitem.mSublayerId = GLConvertUtil.getInt(abyte0, i1);
	//  108  190:aload           9
	//  109  192:aload           8
	//  110  194:iload_1         
	//  111  195:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//  112  198:putfield        #1415 <Field int MapLabelItem.mSublayerId>
			i1 += 4;
	//  113  201:iload_1         
	//  114  202:iconst_4        
	//  115  203:iadd            
	//  116  204:istore_1        
			boolean flag;
			if(abyte0[i1] != 0)
	//* 117  205:aload           8
	//* 118  207:iload_1         
	//* 119  208:baload          
	//* 120  209:ifeq            218
				flag = true;
	//  121  212:iconst_1        
	//  122  213:istore          6
			else
	//* 123  215:goto            221
				flag = false;
	//  124  218:iconst_0        
	//  125  219:istore          6
			maplabelitem.mIsFouces = flag;
	//  126  221:aload           9
	//  127  223:iload           6
	//  128  225:putfield        #1418 <Field boolean MapLabelItem.mIsFouces>
			l1 = i1 + 1;
	//  129  228:iload_1         
	//  130  229:iconst_1        
	//  131  230:iadd            
	//  132  231:istore          4
			if(abyte0[l1] == 0)
	//* 133  233:aload           8
	//* 134  235:iload           4
	//* 135  237:baload          
	//* 136  238:ifne            250
			{
				maplabelitem.poiid = null;
	//  137  241:aload           9
	//  138  243:aconst_null     
	//  139  244:putfield        #1046 <Field String MapLabelItem.poiid>
			} else
	//* 140  247:goto            311
			{
				StringBuffer stringbuffer = new StringBuffer();
	//  141  250:new             #1420 <Class StringBuffer>
	//  142  253:dup             
	//  143  254:invokespecial   #1421 <Method void StringBuffer()>
	//  144  257:astore          10
				for(i1 = 0; i1 < 20 && abyte0[i1 + l1] != 0; i1++)
	//* 145  259:iconst_0        
	//* 146  260:istore_1        
	//* 147  261:iload_1         
	//* 148  262:bipush          20
	//* 149  264:icmpge          301
	//* 150  267:aload           8
	//* 151  269:iload_1         
	//* 152  270:iload           4
	//* 153  272:iadd            
	//* 154  273:baload          
	//* 155  274:ifne            280
	//* 156  277:goto            301
					stringbuffer.append((char)abyte0[i1 + l1]);
	//  157  280:aload           10
	//  158  282:aload           8
	//  159  284:iload_1         
	//  160  285:iload           4
	//  161  287:iadd            
	//  162  288:baload          
	//  163  289:int2char        
	//  164  290:invokevirtual   #1425 <Method StringBuffer StringBuffer.append(char)>
	//  165  293:pop             

	//  166  294:iload_1         
	//  167  295:iconst_1        
	//  168  296:iadd            
	//  169  297:istore_1        
	//* 170  298:goto            261
				maplabelitem.poiid = stringbuffer.toString();
	//  171  301:aload           9
	//  172  303:aload           10
	//  173  305:invokevirtual   #1428 <Method String StringBuffer.toString()>
	//  174  308:putfield        #1046 <Field String MapLabelItem.poiid>
			}
			l1 += 20;
	//  175  311:iload           4
	//  176  313:bipush          20
	//  177  315:iadd            
	//  178  316:istore          4
			i1 = l1 + 1;
	//  179  318:iload           4
	//  180  320:iconst_1        
	//  181  321:iadd            
	//  182  322:istore_1        
			i2 = ((int) (abyte0[l1]));
	//  183  323:aload           8
	//  184  325:iload           4
	//  185  327:baload          
	//  186  328:istore          5
			StringBuffer stringbuffer1 = new StringBuffer();
	//  187  330:new             #1420 <Class StringBuffer>
	//  188  333:dup             
	//  189  334:invokespecial   #1421 <Method void StringBuffer()>
	//  190  337:astore          10
			for(l1 = 0; l1 < i2; l1++)
	//* 191  339:iconst_0        
	//* 192  340:istore          4
	//* 193  342:iload           4
	//* 194  344:iload           5
	//* 195  346:icmpge          375
			{
				stringbuffer1.append((char)GLConvertUtil.getShort(abyte0, i1));
	//  196  349:aload           10
	//  197  351:aload           8
	//  198  353:iload_1         
	//  199  354:invokestatic    #1432 <Method short GLConvertUtil.getShort(byte[], int)>
	//  200  357:int2char        
	//  201  358:invokevirtual   #1425 <Method StringBuffer StringBuffer.append(char)>
	//  202  361:pop             
				i1 += 2;
	//  203  362:iload_1         
	//  204  363:iconst_2        
	//  205  364:iadd            
	//  206  365:istore_1        
			}

	//  207  366:iload           4
	//  208  368:iconst_1        
	//  209  369:iadd            
	//  210  370:istore          4
	//* 211  372:goto            342
			maplabelitem.name = stringbuffer1.toString();
	//  212  375:aload           9
	//  213  377:aload           10
	//  214  379:invokevirtual   #1428 <Method String StringBuffer.toString()>
	//  215  382:putfield        #1040 <Field String MapLabelItem.name>
			arraylist.add(((Object) (maplabelitem)));
	//  216  385:aload           7
	//  217  387:aload           9
	//  218  389:invokevirtual   #1435 <Method boolean ArrayList.add(Object)>
	//  219  392:pop             
		}

	//  220  393:iload_3         
	//  221  394:iconst_1        
	//  222  395:iadd            
	//  223  396:istore_3        
	//* 224  397:goto            64
		return arraylist;
	//  225  400:aload           7
	//  226  402:areturn         
	}

	public void a(double d1, double d2, FPoint fpoint)
	{
		IPoint ipoint = IPoint.obtain();
	//    0    0:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//    1    3:astore          6
		a(d1, d2, ipoint);
	//    2    5:aload_0         
	//    3    6:dload_1         
	//    4    7:dload_3         
	//    5    8:aload           6
	//    6   10:invokevirtual   #1156 <Method void a(double, double, IPoint)>
		a(ipoint.x, ipoint.y, fpoint);
	//    7   13:aload_0         
	//    8   14:aload           6
	//    9   16:getfield        #1369 <Field int IPoint.x>
	//   10   19:aload           6
	//   11   21:getfield        #1370 <Field int IPoint.y>
	//   12   24:aload           5
	//   13   26:invokevirtual   #1441 <Method void a(int, int, FPoint)>
		ipoint.recycle();
	//   14   29:aload           6
	//   15   31:invokevirtual   #1178 <Method void IPoint.recycle()>
	//   16   34:return          
	}

	public void a(double d1, double d2, IPoint ipoint)
	{
		Point point = VirtualEarthProjection.latLongToPixels(d1, d2, 20);
	//    0    0:dload_1         
	//    1    1:dload_3         
	//    2    2:bipush          20
	//    3    4:invokestatic    #1445 <Method Point VirtualEarthProjection.latLongToPixels(double, double, int)>
	//    4    7:astore          6
		ipoint.x = point.x;
	//    5    9:aload           5
	//    6   11:aload           6
	//    7   13:getfield        #1446 <Field int Point.x>
	//    8   16:putfield        #1369 <Field int IPoint.x>
		ipoint.y = point.y;
	//    9   19:aload           5
	//   10   21:aload           6
	//   11   23:getfield        #1447 <Field int Point.y>
	//   12   26:putfield        #1370 <Field int IPoint.y>
	//   13   29:return          
	}

	public void a(float f1, float f2, IPoint ipoint)
	{
		ipoint.x = (int)((float)c.getSX() + f1);
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #322 <Field MapConfig c>
	//    3    5:invokevirtual   #748 <Method int MapConfig.getSX()>
	//    4    8:i2f             
	//    5    9:fload_1         
	//    6   10:fadd            
	//    7   11:f2i             
	//    8   12:putfield        #1369 <Field int IPoint.x>
		ipoint.y = (int)((float)c.getSY() + f2);
	//    9   15:aload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #322 <Field MapConfig c>
	//   12   20:invokevirtual   #751 <Method int MapConfig.getSY()>
	//   13   23:i2f             
	//   14   24:fload_2         
	//   15   25:fadd            
	//   16   26:f2i             
	//   17   27:putfield        #1370 <Field int IPoint.y>
	//   18   30:return          
	}

	public void a(int i1, float f1)
	{
		if(Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #570 <Field fq Q>
	//*   2    4:ifnull          16
			Q.a(i1, f1);
	//    3    7:aload_0         
	//    4    8:getfield        #570 <Field fq Q>
	//    5   11:iload_1         
	//    6   12:fload_2         
	//    7   13:invokevirtual   #1451 <Method void fq.a(int, float)>
	//    8   16:return          
	}

	public void a(int i1, int j1)
	{
		if(aT != 0 && j1 == 5)
	//*   0    0:aload_0         
	//*   1    1:getfield        #403 <Field int aT>
	//*   2    4:ifeq            13
	//*   3    7:iload_2         
	//*   4    8:iconst_5        
	//*   5    9:icmpne          13
		{
			return;
	//    6   12:return          
		} else
		{
			aT = j1;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:putfield        #403 <Field int aT>
			return;
	//   10   18:return          
		}
	}

	public void a(int i1, int j1, int k1, int l1, int i2, int j2, int k2)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field GLMapEngine f>
	//*   2    4:ifnull          25
			f.setServiceViewRect(i1, j1, k1, l1, i2, j2, k2);
	//    3    7:aload_0         
	//    4    8:getfield        #545 <Field GLMapEngine f>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:iload           5
	//   10   18:iload           6
	//   11   20:iload           7
	//   12   22:invokevirtual   #1454 <Method void GLMapEngine.setServiceViewRect(int, int, int, int, int, int, int)>
	//   13   25:return          
	}

	public void a(int i1, int j1, int k1, int l1, boolean flag, boolean flag1, StyleItem astyleitem[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(aP && aO && a)
	//*   2    2:aload_0         
	//*   3    3:getfield        #392 <Field boolean aP>
	//*   4    6:ifeq            49
	//*   5    9:aload_0         
	//*   6   10:getfield        #390 <Field boolean aO>
	//*   7   13:ifeq            49
	//*   8   16:aload_0         
	//*   9   17:getfield        #307 <Field boolean a>
	//*  10   20:ifeq            49
		{
			queueEvent(new Runnable(i1, j1, k1, l1, flag, flag1, astyleitem) {

				public void run()
				{
					try
					{
						h.f.setMapModeAndStyle(a, b, c, d, e, f, g);
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field b h>
				//    2    4:getfield        #50  <Field GLMapEngine b.f>
				//    3    7:aload_0         
				//    4    8:getfield        #28  <Field int a>
				//    5   11:aload_0         
				//    6   12:getfield        #30  <Field int b>
				//    7   15:aload_0         
				//    8   16:getfield        #32  <Field int c>
				//    9   19:aload_0         
				//   10   20:getfield        #34  <Field int d>
				//   11   23:aload_0         
				//   12   24:getfield        #36  <Field boolean e>
				//   13   27:aload_0         
				//   14   28:getfield        #38  <Field boolean f>
				//   15   31:aload_0         
				//   16   32:getfield        #40  <Field StyleItem[] g>
				//   17   35:invokevirtual   #56  <Method boolean GLMapEngine.setMapModeAndStyle(int, int, int, int, boolean, boolean, StyleItem[])>
				//   18   38:pop             
						h.f.setParamater(a, 2053, b, c, d, 0);
				//   19   39:aload_0         
				//   20   40:getfield        #26  <Field b h>
				//   21   43:getfield        #50  <Field GLMapEngine b.f>
				//   22   46:aload_0         
				//   23   47:getfield        #28  <Field int a>
				//   24   50:sipush          2053
				//   25   53:aload_0         
				//   26   54:getfield        #30  <Field int b>
				//   27   57:aload_0         
				//   28   58:getfield        #32  <Field int c>
				//   29   61:aload_0         
				//   30   62:getfield        #34  <Field int d>
				//   31   65:iconst_0        
				//   32   66:invokevirtual   #60  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
						return;
				//   33   69:return          
					}
					catch(Throwable throwable)
				//*  34   70:astore_1        
					{
						throwable.printStackTrace();
				//   35   71:aload_1         
				//   36   72:invokevirtual   #63  <Method void Throwable.printStackTrace()>
					}
				//   37   75:return          
				}

				final int a;
				final int b;
				final int c;
				final int d;
				final boolean e;
				final boolean f;
				final StyleItem g[];
				final com.amap.api.mapcore.util.b h;

			
			{
				h = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field b h>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #28  <Field int a>
				b = j1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #30  <Field int b>
				c = k1;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field int c>
				d = l1;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #34  <Field int d>
				e = flag;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #36  <Field boolean e>
				f = flag1;
			//   18   33:aload_0         
			//   19   34:iload           7
			//   20   36:putfield        #38  <Field boolean f>
				g = astyleitem;
			//   21   39:aload_0         
			//   22   40:aload           8
			//   23   42:putfield        #40  <Field StyleItem[] g>
				super();
			//   24   45:aload_0         
			//   25   46:invokespecial   #43  <Method void Object()>
			//   26   49:return          
			}
			}
);
	//   11   23:aload_0         
	//   12   24:new             #30  <Class b$18>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:iload           4
	//   19   34:iload           5
	//   20   36:iload           6
	//   21   38:aload           7
	//   22   40:invokespecial   #1458 <Method void b$18(b, int, int, int, int, boolean, boolean, StyleItem[])>
	//   23   43:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			break MISSING_BLOCK_LABEL_90;
	//   24   46:goto            90
		}
		bd.g = i1;
	//   25   49:aload_0         
	//   26   50:getfield        #428 <Field b$a bd>
	//   27   53:iload_1         
	//   28   54:putfield        #1460 <Field int b$a.g>
		bd.d = j1;
	//   29   57:aload_0         
	//   30   58:getfield        #428 <Field b$a bd>
	//   31   61:iload_2         
	//   32   62:putfield        #1462 <Field int b$a.d>
		bd.e = k1;
	//   33   65:aload_0         
	//   34   66:getfield        #428 <Field b$a bd>
	//   35   69:iload_3         
	//   36   70:putfield        #1464 <Field int b$a.e>
		bd.f = l1;
	//   37   73:aload_0         
	//   38   74:getfield        #428 <Field b$a bd>
	//   39   77:iload           4
	//   40   79:putfield        #1466 <Field int b$a.f>
		bd.b = true;
	//   41   82:aload_0         
	//   42   83:getfield        #428 <Field b$a bd>
	//   43   86:iconst_1        
	//   44   87:putfield        #1468 <Field boolean b$a.b>
		this;
	//   45   90:aload_0         
		JVM INSTR monitorexit ;
	//   46   91:monitorexit     
		return;
	//   47   92:return          
		astyleitem;
	//   48   93:astore          7
	//*  49   95:aload_0         
		throw astyleitem;
	//   50   96:monitorexit     
	//   51   97:aload           7
	//   52   99:athrow          
	}

	public void a(int i1, int j1, PointF pointf)
	{
		if(aO && !Y && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            75
	//*   3    7:aload_0         
	//*   4    8:getfield        #315 <Field boolean Y>
	//*   5   11:ifne            75
	//*   6   14:aload_0         
	//*   7   15:getfield        #545 <Field GLMapEngine f>
	//*   8   18:ifnull          75
		{
			IPoint ipoint = IPoint.obtain();
	//    9   21:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//   10   24:astore          4
			a(i1, j1, ipoint);
	//   11   26:aload_0         
	//   12   27:iload_1         
	//   13   28:iload_2         
	//   14   29:aload           4
	//   15   31:invokevirtual   #1174 <Method void a(int, int, IPoint)>
			pointf.x = ipoint.x - c.getSX();
	//   16   34:aload_3         
	//   17   35:aload           4
	//   18   37:getfield        #1369 <Field int IPoint.x>
	//   19   40:aload_0         
	//   20   41:getfield        #322 <Field MapConfig c>
	//   21   44:invokevirtual   #748 <Method int MapConfig.getSX()>
	//   22   47:isub            
	//   23   48:i2f             
	//   24   49:putfield        #1473 <Field float PointF.x>
			pointf.y = ipoint.y - c.getSY();
	//   25   52:aload_3         
	//   26   53:aload           4
	//   27   55:getfield        #1370 <Field int IPoint.y>
	//   28   58:aload_0         
	//   29   59:getfield        #322 <Field MapConfig c>
	//   30   62:invokevirtual   #751 <Method int MapConfig.getSY()>
	//   31   65:isub            
	//   32   66:i2f             
	//   33   67:putfield        #1475 <Field float PointF.y>
			ipoint.recycle();
	//   34   70:aload           4
	//   35   72:invokevirtual   #1178 <Method void IPoint.recycle()>
		}
	//   36   75:return          
	}

	public void a(int i1, int j1, DPoint dpoint)
	{
		DPoint dpoint1 = VirtualEarthProjection.pixelsToLatLong(i1, j1, 20);
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:iload_2         
	//    3    3:i2l             
	//    4    4:bipush          20
	//    5    6:invokestatic    #1035 <Method DPoint VirtualEarthProjection.pixelsToLatLong(long, long, int)>
	//    6    9:astore          4
		dpoint.x = dpoint1.x;
	//    7   11:aload_3         
	//    8   12:aload           4
	//    9   14:getfield        #948 <Field double DPoint.x>
	//   10   17:putfield        #948 <Field double DPoint.x>
		dpoint.y = dpoint1.y;
	//   11   20:aload_3         
	//   12   21:aload           4
	//   13   23:getfield        #946 <Field double DPoint.y>
	//   14   26:putfield        #946 <Field double DPoint.y>
		dpoint1.recycle();
	//   15   29:aload           4
	//   16   31:invokevirtual   #952 <Method void DPoint.recycle()>
	//   17   34:return          
	}

	public void a(int i1, int j1, FPoint fpoint)
	{
		fpoint.x = i1 - c.getSX();
	//    0    0:aload_3         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #322 <Field MapConfig c>
	//    4    6:invokevirtual   #748 <Method int MapConfig.getSX()>
	//    5    9:isub            
	//    6   10:i2f             
	//    7   11:putfield        #1478 <Field float FPoint.x>
		fpoint.y = j1 - c.getSY();
	//    8   14:aload_3         
	//    9   15:iload_2         
	//   10   16:aload_0         
	//   11   17:getfield        #322 <Field MapConfig c>
	//   12   20:invokevirtual   #751 <Method int MapConfig.getSY()>
	//   13   23:isub            
	//   14   24:i2f             
	//   15   25:putfield        #1479 <Field float FPoint.y>
	//   16   28:return          
	}

	public void a(int i1, int j1, IPoint ipoint)
	{
		if(aO && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            37
	//*   3    7:aload_0         
	//*   4    8:getfield        #545 <Field GLMapEngine f>
	//*   5   11:ifnull          37
		{
			GLMapState glmapstate = f.getMapState(1);
	//    6   14:aload_0         
	//    7   15:getfield        #545 <Field GLMapEngine f>
	//    8   18:iconst_1        
	//    9   19:invokevirtual   #729 <Method GLMapState GLMapEngine.getMapState(int)>
	//   10   22:astore          4
			if(glmapstate != null)
	//*  11   24:aload           4
	//*  12   26:ifnull          37
				glmapstate.screenToP20Point(i1, j1, ((Point) (ipoint)));
	//   13   29:aload           4
	//   14   31:iload_1         
	//   15   32:iload_2         
	//   16   33:aload_3         
	//   17   34:invokevirtual   #1483 <Method void GLMapState.screenToP20Point(int, int, Point)>
		}
	//   18   37:return          
	}

	public void a(int i1, int j1, boolean flag)
	{
		queueEvent(new Runnable(i1, j1, flag) {

			public void run()
			{
				if(d.f != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field b d>
			//*   2    4:getfield        #36  <Field GLMapEngine b.f>
			//*   3    7:ifnull          56
				{
					GLMapEngine glmapengine = d.f;
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field b d>
			//    6   14:getfield        #36  <Field GLMapEngine b.f>
			//    7   17:astore          4
					int l1 = a;
			//    8   19:aload_0         
			//    9   20:getfield        #23  <Field int a>
			//   10   23:istore_2        
					int i2 = b;
			//   11   24:aload_0         
			//   12   25:getfield        #25  <Field int b>
			//   13   28:istore_3        
					int k1;
					if(c)
			//*  14   29:aload_0         
			//*  15   30:getfield        #27  <Field boolean c>
			//*  16   33:ifeq            41
						k1 = 1;
			//   17   36:iconst_1        
			//   18   37:istore_1        
					else
			//*  19   38:goto            43
						k1 = 0;
			//   20   41:iconst_0        
			//   21   42:istore_1        
					glmapengine.setParamater(l1, 2702, i2, k1, 0, 0);
			//   22   43:aload           4
			//   23   45:iload_2         
			//   24   46:sipush          2702
			//   25   49:iload_3         
			//   26   50:iload_1         
			//   27   51:iconst_0        
			//   28   52:iconst_0        
			//   29   53:invokevirtual   #42  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				}
			//   30   56:return          
			}

			final int a;
			final int b;
			final boolean c;
			final com.amap.api.mapcore.util.b d;

			
			{
				d = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field b d>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int a>
				b = j1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int b>
				c = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #27  <Field boolean c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #50  <Class b$27>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokespecial   #1485 <Method void b$27(b, int, int, boolean)>
	//    8   12:invokevirtual   #1058 <Method void queueEvent(Runnable)>
	//    9   15:return          
	}

	public void a(int i1, MotionEvent motionevent)
	{
		LatLng latlng;
		LatLng latlng1;
		ag = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #334 <Field boolean ag>
		m(i1);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #1488 <Method void m(int)>
		af = b.a(motionevent);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #599 <Field y b>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #1491 <Method k y.a(MotionEvent)>
	//   11   19:putfield        #332 <Field k af>
		if(af == null || !af.isDraggable())
			break MISSING_BLOCK_LABEL_253;
	//   12   22:aload_0         
	//   13   23:getfield        #332 <Field k af>
	//   14   26:ifnull          253
	//   15   29:aload_0         
	//   16   30:getfield        #332 <Field k af>
	//   17   33:invokevirtual   #1494 <Method boolean k.isDraggable()>
	//   18   36:ifeq            253
		ae = new Marker(((com.autonavi.amap.mapcore.interfaces.IMarker) ((dj)af)));
	//   19   39:aload_0         
	//   20   40:new             #954 <Class Marker>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:getfield        #332 <Field k af>
	//   24   48:checkcast       #1135 <Class dj>
	//   25   51:invokespecial   #1138 <Method void Marker(com.autonavi.amap.mapcore.interfaces.IMarker)>
	//   26   54:putfield        #330 <Field Marker ae>
		latlng = ae.getPosition();
	//   27   57:aload_0         
	//   28   58:getfield        #330 <Field Marker ae>
	//   29   61:invokevirtual   #1495 <Method LatLng Marker.getPosition()>
	//   30   64:astore          4
		latlng1 = af.b();
	//   31   66:aload_0         
	//   32   67:getfield        #332 <Field k af>
	//   33   70:invokevirtual   #933 <Method LatLng k.b()>
	//   34   73:astore          5
		if(latlng == null || latlng1 == null)
			break MISSING_BLOCK_LABEL_312;
	//   35   75:aload           4
	//   36   77:ifnull          338
	//   37   80:aload           5
	//   38   82:ifnull          338
		DPoint dpoint;
		Throwable throwable;
		try
		{
			motionevent = ((MotionEvent) (IPoint.obtain()));
	//   39   85:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//   40   88:astore_2        
			b(latlng1.latitude, latlng1.longitude, ((IPoint) (motionevent)));
	//   41   89:aload_0         
	//   42   90:aload           5
	//   43   92:getfield        #843 <Field double LatLng.latitude>
	//   44   95:aload           5
	//   45   97:getfield        #840 <Field double LatLng.longitude>
	//   46  100:aload_2         
	//   47  101:invokevirtual   #1497 <Method void b(double, double, IPoint)>
			motionevent.y = ((IPoint) (motionevent)).y - 60;
	//   48  104:aload_2         
	//   49  105:aload_2         
	//   50  106:getfield        #1370 <Field int IPoint.y>
	//   51  109:bipush          60
	//   52  111:isub            
	//   53  112:putfield        #1370 <Field int IPoint.y>
			dpoint = DPoint.obtain();
	//   54  115:invokestatic    #941 <Method DPoint DPoint.obtain()>
	//   55  118:astore_3        
			b(((IPoint) (motionevent)).x, ((IPoint) (motionevent)).y, dpoint);
	//   56  119:aload_0         
	//   57  120:aload_2         
	//   58  121:getfield        #1369 <Field int IPoint.x>
	//   59  124:aload_2         
	//   60  125:getfield        #1370 <Field int IPoint.y>
	//   61  128:aload_3         
	//   62  129:invokevirtual   #944 <Method void b(int, int, DPoint)>
			latlng = new LatLng((latlng.latitude + dpoint.y) - latlng1.latitude, (latlng.longitude + dpoint.x) - latlng1.longitude);
	//   63  132:new             #837 <Class LatLng>
	//   64  135:dup             
	//   65  136:aload           4
	//   66  138:getfield        #843 <Field double LatLng.latitude>
	//   67  141:aload_3         
	//   68  142:getfield        #946 <Field double DPoint.y>
	//   69  145:dadd            
	//   70  146:aload           5
	//   71  148:getfield        #843 <Field double LatLng.latitude>
	//   72  151:dsub            
	//   73  152:aload           4
	//   74  154:getfield        #840 <Field double LatLng.longitude>
	//   75  157:aload_3         
	//   76  158:getfield        #948 <Field double DPoint.x>
	//   77  161:dadd            
	//   78  162:aload           5
	//   79  164:getfield        #840 <Field double LatLng.longitude>
	//   80  167:dsub            
	//   81  168:invokespecial   #951 <Method void LatLng(double, double)>
	//   82  171:astore          4
			ae.setPosition(latlng);
	//   83  173:aload_0         
	//   84  174:getfield        #330 <Field Marker ae>
	//   85  177:aload           4
	//   86  179:invokevirtual   #958 <Method void Marker.setPosition(LatLng)>
			b.a(((db) ((dj)af)));
	//   87  182:aload_0         
	//   88  183:getfield        #599 <Field y b>
	//   89  186:aload_0         
	//   90  187:getfield        #332 <Field k af>
	//   91  190:checkcast       #1135 <Class dj>
	//   92  193:invokevirtual   #1141 <Method void y.a(db)>
		}
	//*  93  196:aload_0         
	//*  94  197:getfield        #863 <Field com.amap.api.maps.AMap$OnMarkerDragListener v>
	//*  95  200:ifnull          216
	//*  96  203:aload_0         
	//*  97  204:getfield        #863 <Field com.amap.api.maps.AMap$OnMarkerDragListener v>
	//*  98  207:aload_0         
	//*  99  208:getfield        #330 <Field Marker ae>
	//* 100  211:invokeinterface #1500 <Method void com.amap.api.maps.AMap$OnMarkerDragListener.onMarkerDragStart(Marker)>
	//* 101  216:goto            237
	//* 102  219:astore          4
	//* 103  221:aload           4
	//* 104  223:ldc2            #1165 <String "AMapDelegateImp">
	//* 105  226:ldc2            #1501 <String "onMarkerDragStart">
	//* 106  229:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
	//* 107  232:aload           4
	//* 108  234:invokevirtual   #766 <Method void Throwable.printStackTrace()>
	//* 109  237:aload_0         
	//* 110  238:iconst_1        
	//* 111  239:putfield        #328 <Field boolean ad>
	//* 112  242:aload_2         
	//* 113  243:invokevirtual   #1178 <Method void IPoint.recycle()>
	//* 114  246:aload_3         
	//* 115  247:invokevirtual   #952 <Method void DPoint.recycle()>
	//* 116  250:goto            338
	//* 117  253:aload_0         
	//* 118  254:getfield        #875 <Field com.amap.api.maps.AMap$OnMapLongClickListener B>
	//* 119  257:ifnull          312
	//* 120  260:invokestatic    #941 <Method DPoint DPoint.obtain()>
	//* 121  263:astore_3        
	//* 122  264:aload_0         
	//* 123  265:aload_2         
	//* 124  266:invokevirtual   #924 <Method float MotionEvent.getX()>
	//* 125  269:f2i             
	//* 126  270:aload_2         
	//* 127  271:invokevirtual   #927 <Method float MotionEvent.getY()>
	//* 128  274:f2i             
	//* 129  275:aload_3         
	//* 130  276:invokevirtual   #944 <Method void b(int, int, DPoint)>
	//* 131  279:aload_0         
	//* 132  280:getfield        #875 <Field com.amap.api.maps.AMap$OnMapLongClickListener B>
	//* 133  283:new             #837 <Class LatLng>
	//* 134  286:dup             
	//* 135  287:aload_3         
	//* 136  288:getfield        #946 <Field double DPoint.y>
	//* 137  291:aload_3         
	//* 138  292:getfield        #948 <Field double DPoint.x>
	//* 139  295:invokespecial   #951 <Method void LatLng(double, double)>
	//* 140  298:invokeinterface #1506 <Method void com.amap.api.maps.AMap$OnMapLongClickListener.onMapLongClick(LatLng)>
	//* 141  303:aload_0         
	//* 142  304:iconst_1        
	//* 143  305:putfield        #336 <Field boolean ah>
	//* 144  308:aload_3         
	//* 145  309:invokevirtual   #952 <Method void DPoint.recycle()>
	//* 146  312:aload_0         
	//* 147  313:getfield        #552 <Field GLMapRender aD>
	//* 148  316:bipush          30
	//* 149  318:invokevirtual   #902 <Method void GLMapRender.resetTickCount(int)>
	//* 150  321:return          
		// Misplaced declaration of an exception variable
		catch(MotionEvent motionevent)
	//* 151  322:astore_2        
		{
			hm.c(((Throwable) (motionevent)), "AMapDelegateImp", "onLongPress");
	//  152  323:aload_2         
	//  153  324:ldc2            #1165 <String "AMapDelegateImp">
	//  154  327:ldc2            #1508 <String "onLongPress">
	//  155  330:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
			((Throwable) (motionevent)).printStackTrace();
	//  156  333:aload_2         
	//  157  334:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			return;
	//  158  337:return          
		}
		if(v != null)
			v.onMarkerDragStart(ae);
		break MISSING_BLOCK_LABEL_237;
		throwable;
		hm.c(throwable, "AMapDelegateImp", "onMarkerDragStart");
		throwable.printStackTrace();
		ad = true;
		((IPoint) (motionevent)).recycle();
		dpoint.recycle();
		break MISSING_BLOCK_LABEL_312;
		if(B != null)
		{
			dpoint = DPoint.obtain();
			b((int)motionevent.getX(), (int)motionevent.getY(), dpoint);
			B.onMapLongClick(new LatLng(dpoint.y, dpoint.x));
			ah = true;
			dpoint.recycle();
		}
		aD.resetTickCount(30);
		return;
	//* 159  338:goto            312
	}

	public void a(int i1, IPoint ipoint)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          29
		{
			ipoint.x = c.getSX();
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:getfield        #322 <Field MapConfig c>
	//    6   12:invokevirtual   #748 <Method int MapConfig.getSX()>
	//    7   15:putfield        #1369 <Field int IPoint.x>
			ipoint.y = c.getSY();
	//    8   18:aload_2         
	//    9   19:aload_0         
	//   10   20:getfield        #322 <Field MapConfig c>
	//   11   23:invokevirtual   #751 <Method int MapConfig.getSY()>
	//   12   26:putfield        #1370 <Field int IPoint.y>
		}
	//   13   29:return          
	}

	public void a(int i1, AbstractGestureMapMessage abstractgesturemapmessage)
	{
		if(aO && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            76
	//*   3    7:aload_0         
	//*   4    8:getfield        #545 <Field GLMapEngine f>
	//*   5   11:ifnull          76
			try
			{
				abstractgesturemapmessage.isUseAnchor = Z;
	//    6   14:aload_2         
	//    7   15:aload_0         
	//    8   16:getfield        #324 <Field boolean Z>
	//    9   19:putfield        #1513 <Field boolean AbstractGestureMapMessage.isUseAnchor>
				abstractgesturemapmessage.anchorX = c.getAnchorX();
	//   10   22:aload_2         
	//   11   23:aload_0         
	//   12   24:getfield        #322 <Field MapConfig c>
	//   13   27:invokevirtual   #1087 <Method int MapConfig.getAnchorX()>
	//   14   30:putfield        #1514 <Field int AbstractGestureMapMessage.anchorX>
				abstractgesturemapmessage.anchorY = c.getAnchorY();
	//   15   33:aload_2         
	//   16   34:aload_0         
	//   17   35:getfield        #322 <Field MapConfig c>
	//   18   38:invokevirtual   #1093 <Method int MapConfig.getAnchorY()>
	//   19   41:putfield        #1515 <Field int AbstractGestureMapMessage.anchorY>
				f.addGestureMessage(i1, abstractgesturemapmessage, N.isGestureScaleByMapCenter(), c.getAnchorX(), c.getAnchorY());
	//   20   44:aload_0         
	//   21   45:getfield        #545 <Field GLMapEngine f>
	//   22   48:iload_1         
	//   23   49:aload_2         
	//   24   50:aload_0         
	//   25   51:getfield        #565 <Field ag N>
	//   26   54:invokevirtual   #1518 <Method boolean ag.isGestureScaleByMapCenter()>
	//   27   57:aload_0         
	//   28   58:getfield        #322 <Field MapConfig c>
	//   29   61:invokevirtual   #1087 <Method int MapConfig.getAnchorX()>
	//   30   64:aload_0         
	//   31   65:getfield        #322 <Field MapConfig c>
	//   32   68:invokevirtual   #1093 <Method int MapConfig.getAnchorY()>
	//   33   71:invokevirtual   #1522 <Method void GLMapEngine.addGestureMessage(int, AbstractGestureMapMessage, boolean, int, int)>
				return;
	//   34   74:return          
			}
			// Misplaced declaration of an exception variable
			catch(AbstractGestureMapMessage abstractgesturemapmessage) { }
	//   35   75:astore_2        
	//   36   76:return          
	}

	public void a(int i1, GL10 gl10, int j1, int k1)
	{
		aR = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #396 <Field boolean aR>
		if(!aO)
	//*   3    5:aload_0         
	//*   4    6:getfield        #390 <Field boolean aO>
	//*   5    9:ifne            19
			a(i1, gl10, ((EGLConfig) (null)));
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:aconst_null     
	//   10   16:invokevirtual   #1526 <Method void a(int, GL10, EGLConfig)>
		g = j1;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #1527 <Field int g>
		h = k1;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #1529 <Field int h>
		at = true;
	//   17   30:aload_0         
	//   18   31:iconst_1        
	//   19   32:putfield        #359 <Field boolean at>
		am = new Rect(0, 0, j1, k1);
	//   20   35:aload_0         
	//   21   36:new             #346 <Class Rect>
	//   22   39:dup             
	//   23   40:iconst_0        
	//   24   41:iconst_0        
	//   25   42:iload_3         
	//   26   43:iload           4
	//   27   45:invokespecial   #1532 <Method void Rect(int, int, int, int)>
	//   28   48:putfield        #349 <Field Rect am>
		U = a(i1, new Rect(0, 0, g, h), g, h);
	//   29   51:aload_0         
	//   30   52:aload_0         
	//   31   53:iload_1         
	//   32   54:new             #346 <Class Rect>
	//   33   57:dup             
	//   34   58:iconst_0        
	//   35   59:iconst_0        
	//   36   60:aload_0         
	//   37   61:getfield        #1527 <Field int g>
	//   38   64:aload_0         
	//   39   65:getfield        #1529 <Field int h>
	//   40   68:invokespecial   #1532 <Method void Rect(int, int, int, int)>
	//   41   71:aload_0         
	//   42   72:getfield        #1527 <Field int g>
	//   43   75:aload_0         
	//   44   76:getfield        #1529 <Field int h>
	//   45   79:invokevirtual   #1534 <Method int a(int, Rect, int, int)>
	//   46   82:putfield        #1536 <Field int U>
		if(!aP)
	//*  47   85:aload_0         
	//*  48   86:getfield        #392 <Field boolean aP>
	//*  49   89:ifne            403
		{
			if(c != null)
	//*  50   92:aload_0         
	//*  51   93:getfield        #322 <Field MapConfig c>
	//*  52   96:ifnull          127
			{
				c.setMapZoomScale(aH);
	//   53   99:aload_0         
	//   54  100:getfield        #322 <Field MapConfig c>
	//   55  103:aload_0         
	//   56  104:getfield        #376 <Field float aH>
	//   57  107:invokevirtual   #1539 <Method void MapConfig.setMapZoomScale(float)>
				c.setMapWidth(j1);
	//   58  110:aload_0         
	//   59  111:getfield        #322 <Field MapConfig c>
	//   60  114:iload_3         
	//   61  115:invokevirtual   #1542 <Method void MapConfig.setMapWidth(int)>
				c.setMapHeight(k1);
	//   62  118:aload_0         
	//   63  119:getfield        #322 <Field MapConfig c>
	//   64  122:iload           4
	//   65  124:invokevirtual   #1545 <Method void MapConfig.setMapHeight(int)>
			}
			f.setParamater(U, 1001, 1, 0, 0, 0);
	//   66  127:aload_0         
	//   67  128:getfield        #545 <Field GLMapEngine f>
	//   68  131:aload_0         
	//   69  132:getfield        #1536 <Field int U>
	//   70  135:sipush          1001
	//   71  138:iconst_1        
	//   72  139:iconst_0        
	//   73  140:iconst_0        
	//   74  141:iconst_0        
	//   75  142:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			if(aJ)
	//*  76  145:aload_0         
	//*  77  146:getfield        #380 <Field boolean aJ>
	//*  78  149:ifeq            174
				f.setParamater(U, 1900, 1, 15, 0, 0);
	//   79  152:aload_0         
	//   80  153:getfield        #545 <Field GLMapEngine f>
	//   81  156:aload_0         
	//   82  157:getfield        #1536 <Field int U>
	//   83  160:sipush          1900
	//   84  163:iconst_1        
	//   85  164:bipush          15
	//   86  166:iconst_0        
	//   87  167:iconst_0        
	//   88  168:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			else
	//*  89  171:goto            192
				f.setParamater(U, 1900, 0, 0, 0, 0);
	//   90  174:aload_0         
	//   91  175:getfield        #545 <Field GLMapEngine f>
	//   92  178:aload_0         
	//   93  179:getfield        #1536 <Field int U>
	//   94  182:sipush          1900
	//   95  185:iconst_0        
	//   96  186:iconst_0        
	//   97  187:iconst_0        
	//   98  188:iconst_0        
	//   99  189:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			if(c(U, 19))
	//* 100  192:aload_0         
	//* 101  193:aload_0         
	//* 102  194:getfield        #1536 <Field int U>
	//* 103  197:bipush          19
	//* 104  199:invokespecial   #1547 <Method boolean c(int, int)>
	//* 105  202:ifeq            244
			{
				f.setParamater(U, 1021, 1, 0, 0, 0);
	//  106  205:aload_0         
	//  107  206:getfield        #545 <Field GLMapEngine f>
	//  108  209:aload_0         
	//  109  210:getfield        #1536 <Field int U>
	//  110  213:sipush          1021
	//  111  216:iconst_1        
	//  112  217:iconst_0        
	//  113  218:iconst_0        
	//  114  219:iconst_0        
	//  115  220:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				f.setParamater(U, 1022, 1, 0, 0, 0);
	//  116  223:aload_0         
	//  117  224:getfield        #545 <Field GLMapEngine f>
	//  118  227:aload_0         
	//  119  228:getfield        #1536 <Field int U>
	//  120  231:sipush          1022
	//  121  234:iconst_1        
	//  122  235:iconst_0        
	//  123  236:iconst_0        
	//  124  237:iconst_0        
	//  125  238:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			} else
	//* 126  241:goto            280
			{
				f.setParamater(U, 1021, 0, 0, 0, 0);
	//  127  244:aload_0         
	//  128  245:getfield        #545 <Field GLMapEngine f>
	//  129  248:aload_0         
	//  130  249:getfield        #1536 <Field int U>
	//  131  252:sipush          1021
	//  132  255:iconst_0        
	//  133  256:iconst_0        
	//  134  257:iconst_0        
	//  135  258:iconst_0        
	//  136  259:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				f.setParamater(U, 1022, 0, 0, 0, 0);
	//  137  262:aload_0         
	//  138  263:getfield        #545 <Field GLMapEngine f>
	//  139  266:aload_0         
	//  140  267:getfield        #1536 <Field int U>
	//  141  270:sipush          1022
	//  142  273:iconst_0        
	//  143  274:iconst_0        
	//  144  275:iconst_0        
	//  145  276:iconst_0        
	//  146  277:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			}
			f.setParamater(U, 1023, 1, 0, 0, 0);
	//  147  280:aload_0         
	//  148  281:getfield        #545 <Field GLMapEngine f>
	//  149  284:aload_0         
	//  150  285:getfield        #1536 <Field int U>
	//  151  288:sipush          1023
	//  152  291:iconst_1        
	//  153  292:iconst_0        
	//  154  293:iconst_0        
	//  155  294:iconst_0        
	//  156  295:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			f.setParamater(1, 1026, 0, 0, 0, 0);
	//  157  298:aload_0         
	//  158  299:getfield        #545 <Field GLMapEngine f>
	//  159  302:iconst_1        
	//  160  303:sipush          1026
	//  161  306:iconst_0        
	//  162  307:iconst_0        
	//  163  308:iconst_0        
	//  164  309:iconst_0        
	//  165  310:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			if(c(U, 17))
	//* 166  313:aload_0         
	//* 167  314:aload_0         
	//* 168  315:getfield        #1536 <Field int U>
	//* 169  318:bipush          17
	//* 170  320:invokespecial   #1547 <Method boolean c(int, int)>
	//* 171  323:ifeq            346
				f.setParamater(U, 17, 1, 0, 0, 0);
	//  172  326:aload_0         
	//  173  327:getfield        #545 <Field GLMapEngine f>
	//  174  330:aload_0         
	//  175  331:getfield        #1536 <Field int U>
	//  176  334:bipush          17
	//  177  336:iconst_1        
	//  178  337:iconst_0        
	//  179  338:iconst_0        
	//  180  339:iconst_0        
	//  181  340:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			else
	//* 182  343:goto            363
				f.setParamater(U, 17, 0, 0, 0, 0);
	//  183  346:aload_0         
	//  184  347:getfield        #545 <Field GLMapEngine f>
	//  185  350:aload_0         
	//  186  351:getfield        #1536 <Field int U>
	//  187  354:bipush          17
	//  188  356:iconst_0        
	//  189  357:iconst_0        
	//  190  358:iconst_0        
	//  191  359:iconst_0        
	//  192  360:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			f.setParamater(U, 1029, 17, 0, 0, 0);
	//  193  363:aload_0         
	//  194  364:getfield        #545 <Field GLMapEngine f>
	//  195  367:aload_0         
	//  196  368:getfield        #1536 <Field int U>
	//  197  371:sipush          1029
	//  198  374:bipush          17
	//  199  376:iconst_0        
	//  200  377:iconst_0        
	//  201  378:iconst_0        
	//  202  379:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			h(U, false);
	//  203  382:aload_0         
	//  204  383:aload_0         
	//  205  384:getfield        #1536 <Field int U>
	//  206  387:iconst_0        
	//  207  388:invokespecial   #1549 <Method void h(int, boolean)>
			f.setSimple3DEnable(U, false);
	//  208  391:aload_0         
	//  209  392:getfield        #545 <Field GLMapEngine f>
	//  210  395:aload_0         
	//  211  396:getfield        #1536 <Field int U>
	//  212  399:iconst_0        
	//  213  400:invokevirtual   #1552 <Method void GLMapEngine.setSimple3DEnable(int, boolean)>
		}
		if(aC != null)
	//* 214  403:aload_0         
	//* 215  404:getfield        #508 <Field f aC>
	//* 216  407:ifnull          427
			aC.a(new aa(153));
	//  217  410:aload_0         
	//  218  411:getfield        #508 <Field f aC>
	//  219  414:new             #1554 <Class aa>
	//  220  417:dup             
	//  221  418:sipush          153
	//  222  421:invokespecial   #1556 <Method void aa(int)>
	//  223  424:invokevirtual   #1559 <Method void f.a(aa)>
		this;
	//  224  427:aload_0         
		JVM INSTR monitorenter ;
	//  225  428:monitorenter    
		aP = true;
	//  226  429:aload_0         
	//  227  430:iconst_1        
	//  228  431:putfield        #392 <Field boolean aP>
		this;
	//  229  434:aload_0         
		JVM INSTR monitorexit ;
	//  230  435:monitorexit     
		  goto _L1
	//* 231  436:goto            444
		gl10;
	//  232  439:astore_2        
	//* 233  440:aload_0         
		throw gl10;
	//  234  441:monitorexit     
	//  235  442:aload_2         
	//  236  443:athrow          
_L1:
		if(!Z)
	//* 237  444:aload_0         
	//* 238  445:getfield        #324 <Field boolean Z>
	//* 239  448:ifne            475
		{
			c.setAnchorX(j1 >> 1);
	//  240  451:aload_0         
	//  241  452:getfield        #322 <Field MapConfig c>
	//  242  455:iload_3         
	//  243  456:iconst_1        
	//  244  457:ishr            
	//  245  458:invokevirtual   #1562 <Method void MapConfig.setAnchorX(int)>
			c.setAnchorY(k1 >> 1);
	//  246  461:aload_0         
	//  247  462:getfield        #322 <Field MapConfig c>
	//  248  465:iload           4
	//  249  467:iconst_1        
	//  250  468:ishr            
	//  251  469:invokevirtual   #1565 <Method void MapConfig.setAnchorY(int)>
		} else
	//* 252  472:goto            518
		{
			c.setAnchorX(Math.max(1, Math.min(aU, j1 - 1)));
	//  253  475:aload_0         
	//  254  476:getfield        #322 <Field MapConfig c>
	//  255  479:iconst_1        
	//  256  480:aload_0         
	//  257  481:getfield        #1200 <Field int aU>
	//  258  484:iload_3         
	//  259  485:iconst_1        
	//  260  486:isub            
	//  261  487:invokestatic    #1571 <Method int Math.min(int, int)>
	//  262  490:invokestatic    #1574 <Method int Math.max(int, int)>
	//  263  493:invokevirtual   #1562 <Method void MapConfig.setAnchorX(int)>
			c.setAnchorY(Math.max(1, Math.min(aV, k1 - 1)));
	//  264  496:aload_0         
	//  265  497:getfield        #322 <Field MapConfig c>
	//  266  500:iconst_1        
	//  267  501:aload_0         
	//  268  502:getfield        #1202 <Field int aV>
	//  269  505:iload           4
	//  270  507:iconst_1        
	//  271  508:isub            
	//  272  509:invokestatic    #1571 <Method int Math.min(int, int)>
	//  273  512:invokestatic    #1574 <Method int Math.max(int, int)>
	//  274  515:invokevirtual   #1565 <Method void MapConfig.setAnchorY(int)>
		}
		f.setParamater(U, 1100, c.getAnchorX(), c.getAnchorY(), 0, 0);
	//  275  518:aload_0         
	//  276  519:getfield        #545 <Field GLMapEngine f>
	//  277  522:aload_0         
	//  278  523:getfield        #1536 <Field int U>
	//  279  526:sipush          1100
	//  280  529:aload_0         
	//  281  530:getfield        #322 <Field MapConfig c>
	//  282  533:invokevirtual   #1087 <Method int MapConfig.getAnchorX()>
	//  283  536:aload_0         
	//  284  537:getfield        #322 <Field MapConfig c>
	//  285  540:invokevirtual   #1093 <Method int MapConfig.getAnchorY()>
	//  286  543:iconst_0        
	//  287  544:iconst_0        
	//  288  545:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
		a = true;
	//  289  548:aload_0         
	//  290  549:iconst_1        
	//  291  550:putfield        #307 <Field boolean a>
		if(bk.b)
	//* 292  553:aload_0         
	//* 293  554:getfield        #449 <Field b$a bk>
	//* 294  557:getfield        #1468 <Field boolean b$a.b>
	//* 295  560:ifeq            570
			bk.run();
	//  296  563:aload_0         
	//  297  564:getfield        #449 <Field b$a bk>
	//  298  567:invokevirtual   #1577 <Method void b$a.run()>
		if(bf.b)
	//* 299  570:aload_0         
	//* 300  571:getfield        #434 <Field b$a bf>
	//* 301  574:getfield        #1468 <Field boolean b$a.b>
	//* 302  577:ifeq            587
			bf.run();
	//  303  580:aload_0         
	//  304  581:getfield        #434 <Field b$a bf>
	//  305  584:invokevirtual   #1577 <Method void b$a.run()>
		if(bd.b)
	//* 306  587:aload_0         
	//* 307  588:getfield        #428 <Field b$a bd>
	//* 308  591:getfield        #1468 <Field boolean b$a.b>
	//* 309  594:ifeq            604
			bd.run();
	//  310  597:aload_0         
	//  311  598:getfield        #428 <Field b$a bd>
	//  312  601:invokevirtual   #1577 <Method void b$a.run()>
		if(bb.b)
	//* 313  604:aload_0         
	//* 314  605:getfield        #422 <Field b$a bb>
	//* 315  608:getfield        #1468 <Field boolean b$a.b>
	//* 316  611:ifeq            621
			bb.run();
	//  317  614:aload_0         
	//  318  615:getfield        #422 <Field b$a bb>
	//  319  618:invokevirtual   #1577 <Method void b$a.run()>
		if(be.b)
	//* 320  621:aload_0         
	//* 321  622:getfield        #431 <Field b$a be>
	//* 322  625:getfield        #1468 <Field boolean b$a.b>
	//* 323  628:ifeq            638
			be.run();
	//  324  631:aload_0         
	//  325  632:getfield        #431 <Field b$a be>
	//  326  635:invokevirtual   #1577 <Method void b$a.run()>
		if(ba.b)
	//* 327  638:aload_0         
	//* 328  639:getfield        #419 <Field b$a ba>
	//* 329  642:getfield        #1468 <Field boolean b$a.b>
	//* 330  645:ifeq            655
			ba.run();
	//  331  648:aload_0         
	//  332  649:getfield        #419 <Field b$a ba>
	//  333  652:invokevirtual   #1577 <Method void b$a.run()>
		if(bg.b)
	//* 334  655:aload_0         
	//* 335  656:getfield        #437 <Field b$a bg>
	//* 336  659:getfield        #1468 <Field boolean b$a.b>
	//* 337  662:ifeq            672
			bg.run();
	//  338  665:aload_0         
	//  339  666:getfield        #437 <Field b$a bg>
	//  340  669:invokevirtual   #1577 <Method void b$a.run()>
		if(bi.b)
	//* 341  672:aload_0         
	//* 342  673:getfield        #443 <Field b$a bi>
	//* 343  676:getfield        #1468 <Field boolean b$a.b>
	//* 344  679:ifeq            689
			bi.run();
	//  345  682:aload_0         
	//  346  683:getfield        #443 <Field b$a bi>
	//  347  686:invokevirtual   #1577 <Method void b$a.run()>
		if(bj.b)
	//* 348  689:aload_0         
	//* 349  690:getfield        #446 <Field b$a bj>
	//* 350  693:getfield        #1468 <Field boolean b$a.b>
	//* 351  696:ifeq            706
			bj.run();
	//  352  699:aload_0         
	//  353  700:getfield        #446 <Field b$a bj>
	//  354  703:invokevirtual   #1577 <Method void b$a.run()>
		if(bn.b)
	//* 355  706:aload_0         
	//* 356  707:getfield        #458 <Field b$a bn>
	//* 357  710:getfield        #1468 <Field boolean b$a.b>
	//* 358  713:ifeq            723
			bn.run();
	//  359  716:aload_0         
	//  360  717:getfield        #458 <Field b$a bn>
	//  361  720:invokevirtual   #1577 <Method void b$a.run()>
		if(bh.b)
	//* 362  723:aload_0         
	//* 363  724:getfield        #440 <Field b$a bh>
	//* 364  727:getfield        #1468 <Field boolean b$a.b>
	//* 365  730:ifeq            740
			bh.run();
	//  366  733:aload_0         
	//  367  734:getfield        #440 <Field b$a bh>
	//  368  737:invokevirtual   #1577 <Method void b$a.run()>
		if(bl.b)
	//* 369  740:aload_0         
	//* 370  741:getfield        #452 <Field b$a bl>
	//* 371  744:getfield        #1468 <Field boolean b$a.b>
	//* 372  747:ifeq            757
			bl.run();
	//  373  750:aload_0         
	//  374  751:getfield        #452 <Field b$a bl>
	//  375  754:invokevirtual   #1577 <Method void b$a.run()>
		if(bc.b)
	//* 376  757:aload_0         
	//* 377  758:getfield        #425 <Field b$a bc>
	//* 378  761:getfield        #1468 <Field boolean b$a.b>
	//* 379  764:ifeq            774
			bc.run();
	//  380  767:aload_0         
	//  381  768:getfield        #425 <Field b$a bc>
	//  382  771:invokevirtual   #1577 <Method void b$a.run()>
		if(bo.b)
	//* 383  774:aload_0         
	//* 384  775:getfield        #461 <Field b$a bo>
	//* 385  778:getfield        #1468 <Field boolean b$a.b>
	//* 386  781:ifeq            791
			bo.run();
	//  387  784:aload_0         
	//  388  785:getfield        #461 <Field b$a bo>
	//  389  788:invokevirtual   #1577 <Method void b$a.run()>
		if(av != null)
	//* 390  791:aload_0         
	//* 391  792:getfield        #1579 <Field CustomRenderer av>
	//* 392  795:ifnull          811
			av.onSurfaceChanged(gl10, j1, k1);
	//  393  798:aload_0         
	//  394  799:getfield        #1579 <Field CustomRenderer av>
	//  395  802:aload_2         
	//  396  803:iload_3         
	//  397  804:iload           4
	//  398  806:invokeinterface #1585 <Method void CustomRenderer.onSurfaceChanged(GL10, int, int)>
		if(i != null)
	//* 399  811:aload_0         
	//* 400  812:getfield        #414 <Field Handler i>
	//* 401  815:ifnull          830
			i.post(bm);
	//  402  818:aload_0         
	//  403  819:getfield        #414 <Field Handler i>
	//  404  822:aload_0         
	//  405  823:getfield        #455 <Field Runnable bm>
	//  406  826:invokevirtual   #791 <Method boolean Handler.post(Runnable)>
	//  407  829:pop             
		return;
	//  408  830:return          
	}

	public void a(int i1, GL10 gl10, EGLConfig eglconfig)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(an == 3)
	//*   2    2:aload_0         
	//*   3    3:getfield        #351 <Field int an>
	//*   4    6:iconst_3        
	//*   5    7:icmpne          26
		{
			Q.d().a(fm.b);
	//    6   10:aload_0         
	//    7   11:getfield        #570 <Field fq Q>
	//    8   14:invokevirtual   #771 <Method fm fq.d()>
	//    9   17:getstatic       #1587 <Field int fm.b>
	//   10   20:invokevirtual   #1589 <Method void fm.a(int)>
			break MISSING_BLOCK_LABEL_39;
	//   11   23:goto            39
		}
		Q.d().a(fm.a);
	//   12   26:aload_0         
	//   13   27:getfield        #570 <Field fq Q>
	//   14   30:invokevirtual   #771 <Method fm fq.d()>
	//   15   33:getstatic       #1591 <Field int fm.a>
	//   16   36:invokevirtual   #1589 <Method void fm.a(int)>
		aP = false;
	//   17   39:aload_0         
	//   18   40:iconst_0        
	//   19   41:putfield        #392 <Field boolean aP>
		g = P.getWidth();
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #554 <Field t P>
	//   23   49:invokeinterface #1594 <Method int t.getWidth()>
	//   24   54:putfield        #1527 <Field int g>
		h = P.getHeight();
	//   25   57:aload_0         
	//   26   58:aload_0         
	//   27   59:getfield        #554 <Field t P>
	//   28   62:invokeinterface #1405 <Method int t.getHeight()>
	//   29   67:putfield        #1529 <Field int h>
		aR = false;
	//   30   70:aload_0         
	//   31   71:iconst_0        
	//   32   72:putfield        #396 <Field boolean aR>
		AeUtil.loadLib(e);
	//   33   75:aload_0         
	//   34   76:getfield        #501 <Field Context e>
	//   35   79:invokestatic    #1599 <Method void AeUtil.loadLib(Context)>
		com.autonavi.ae.gmap.GLMapEngine.InitParam initparam = AeUtil.initResource(e);
	//   36   82:aload_0         
	//   37   83:getfield        #501 <Field Context e>
	//   38   86:invokestatic    #1603 <Method com.autonavi.ae.gmap.GLMapEngine$InitParam AeUtil.initResource(Context)>
	//   39   89:astore          4
		f.createAMapInstance(initparam);
	//   40   91:aload_0         
	//   41   92:getfield        #545 <Field GLMapEngine f>
	//   42   95:aload           4
	//   43   97:invokevirtual   #1607 <Method void GLMapEngine.createAMapInstance(com.autonavi.ae.gmap.GLMapEngine$InitParam)>
		x(i1);
	//   44  100:aload_0         
	//   45  101:iload_1         
	//   46  102:invokespecial   #1343 <Method void x(int)>
		aO = true;
	//   47  105:aload_0         
	//   48  106:iconst_1        
	//   49  107:putfield        #390 <Field boolean aO>
		l = gl10.glGetString(7937);
	//   50  110:aload_0         
	//   51  111:aload_2         
	//   52  112:sipush          7937
	//   53  115:invokeinterface #1613 <Method String GL10.glGetString(int)>
	//   54  120:putfield        #477 <Field String l>
		break MISSING_BLOCK_LABEL_139;
	//   55  123:goto            139
		Throwable throwable;
		throwable;
	//   56  126:astore          4
		hm.c(throwable, "AMapDElegateImp", "createSurface");
	//   57  128:aload           4
	//   58  130:ldc2            #1615 <String "AMapDElegateImp">
	//   59  133:ldc2            #1617 <String "createSurface">
	//   60  136:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
		GLMapState glmapstate = f.getMapState(1);
	//   61  139:aload_0         
	//   62  140:getfield        #545 <Field GLMapEngine f>
	//   63  143:iconst_1        
	//   64  144:invokevirtual   #729 <Method GLMapState GLMapEngine.getMapState(int)>
	//   65  147:astore          4
		if(glmapstate == null)
			break MISSING_BLOCK_LABEL_219;
	//   66  149:aload           4
	//   67  151:ifnull          219
		if(glmapstate.getNativeInstance() != 0L)
	//*  68  154:aload           4
	//*  69  156:invokevirtual   #1618 <Method long GLMapState.getNativeInstance()>
	//*  70  159:lconst_0        
	//*  71  160:lcmp            
	//*  72  161:ifeq            219
		{
			glmapstate.setMapGeoCenter(c.getSX(), c.getSY());
	//   73  164:aload           4
	//   74  166:aload_0         
	//   75  167:getfield        #322 <Field MapConfig c>
	//   76  170:invokevirtual   #748 <Method int MapConfig.getSX()>
	//   77  173:aload_0         
	//   78  174:getfield        #322 <Field MapConfig c>
	//   79  177:invokevirtual   #751 <Method int MapConfig.getSY()>
	//   80  180:invokevirtual   #1326 <Method void GLMapState.setMapGeoCenter(int, int)>
			glmapstate.setMapAngle(c.getSR());
	//   81  183:aload           4
	//   82  185:aload_0         
	//   83  186:getfield        #322 <Field MapConfig c>
	//   84  189:invokevirtual   #1319 <Method float MapConfig.getSR()>
	//   85  192:invokevirtual   #1322 <Method void GLMapState.setMapAngle(float)>
			glmapstate.setMapZoomer(c.getSZ());
	//   86  195:aload           4
	//   87  197:aload_0         
	//   88  198:getfield        #322 <Field MapConfig c>
	//   89  201:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//   90  204:invokevirtual   #1310 <Method void GLMapState.setMapZoomer(float)>
			glmapstate.setCameraDegree(c.getSC());
	//   91  207:aload           4
	//   92  209:aload_0         
	//   93  210:getfield        #322 <Field MapConfig c>
	//   94  213:invokevirtual   #1313 <Method float MapConfig.getSC()>
	//   95  216:invokevirtual   #1316 <Method void GLMapState.setCameraDegree(float)>
		}
		aY.a(e);
	//   96  219:aload_0         
	//   97  220:getfield        #673 <Field r aY>
	//   98  223:aload_0         
	//   99  224:getfield        #501 <Field Context e>
	//  100  227:invokevirtual   #1619 <Method void r.a(Context)>
		D();
	//  101  230:aload_0         
	//  102  231:invokespecial   #1621 <Method void D()>
		if(av != null)
	//* 103  234:aload_0         
	//* 104  235:getfield        #1579 <Field CustomRenderer av>
	//* 105  238:ifnull          252
			av.onSurfaceCreated(gl10, eglconfig);
	//  106  241:aload_0         
	//  107  242:getfield        #1579 <Field CustomRenderer av>
	//  108  245:aload_2         
	//  109  246:aload_3         
	//  110  247:invokeinterface #1625 <Method void CustomRenderer.onSurfaceCreated(GL10, EGLConfig)>
		v();
	//  111  252:aload_0         
	//  112  253:invokevirtual   #1627 <Method void v()>
		this;
	//  113  256:aload_0         
		JVM INSTR monitorexit ;
	//  114  257:monitorexit     
		return;
	//  115  258:return          
		gl10;
	//  116  259:astore_2        
	//* 117  260:aload_0         
		throw gl10;
	//  118  261:monitorexit     
	//  119  262:aload_2         
	//  120  263:athrow          
	}

	public void a(int i1, boolean flag)
	{
		if(c(i1, 2) == flag)
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:iconst_2        
	//*   3    3:invokespecial   #1547 <Method boolean c(int, int)>
	//*   4    6:iload_2         
	//*   5    7:icmpne          11
			return;
	//    6   10:return          
		if(aO && aP && a)
	//*   7   11:aload_0         
	//*   8   12:getfield        #390 <Field boolean aO>
	//*   9   15:ifeq            47
	//*  10   18:aload_0         
	//*  11   19:getfield        #392 <Field boolean aP>
	//*  12   22:ifeq            47
	//*  13   25:aload_0         
	//*  14   26:getfield        #307 <Field boolean a>
	//*  15   29:ifeq            47
		{
			queueEvent(new Runnable(i1, flag) {

				public void run()
				{
					com.amap.api.mapcore.util.b.a(c, a, 2, b);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field b c>
				//    2    4:aload_0         
				//    3    5:getfield        #22  <Field int a>
				//    4    8:iconst_2        
				//    5    9:aload_0         
				//    6   10:getfield        #24  <Field boolean b>
				//    7   13:invokestatic    #34  <Method void b.a(b, int, int, boolean)>
					int j1;
					if(b)
				//*   8   16:aload_0         
				//*   9   17:getfield        #24  <Field boolean b>
				//*  10   20:ifeq            63
						j1 = 0;
				//   11   23:iconst_0        
				//   12   24:istore_1        
					else
				//*  13   25:goto            28
				//*  14   28:aload_0         
				//*  15   29:getfield        #20  <Field b c>
				//*  16   32:getfield        #38  <Field GLMapEngine b.f>
				//*  17   35:aload_0         
				//*  18   36:getfield        #22  <Field int a>
				//*  19   39:sipush          2033
				//*  20   42:iload_1         
				//*  21   43:iconst_0        
				//*  22   44:iconst_0        
				//*  23   45:iconst_0        
				//*  24   46:invokevirtual   #44  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				//*  25   49:aload_0         
				//*  26   50:getfield        #20  <Field b c>
				//*  27   53:invokevirtual   #47  <Method void b.q()>
				//*  28   56:return          
				//*  29   57:astore_2        
				//*  30   58:aload_2         
				//*  31   59:invokevirtual   #50  <Method void Throwable.printStackTrace()>
				//*  32   62:return          
						j1 = 1;
				//   33   63:iconst_1        
				//   34   64:istore_1        
					try
					{
						c.f.setParamater(a, 2033, j1, 0, 0, 0);
						c.q();
						return;
					}
					catch(Throwable throwable)
					{
						throwable.printStackTrace();
					}
					return;
				//*  35   65:goto            28
				}

				final int a;
				final boolean b;
				final com.amap.api.mapcore.util.b c;

			
			{
				c = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field b c>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int a>
				b = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field boolean b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   16   32:aload_0         
	//   17   33:new             #98  <Class b$9>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:iload_2         
	//   22   40:invokespecial   #1630 <Method void b$9(b, int, boolean)>
	//   23   43:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   24   46:return          
		} else
		{
			bb.c = flag;
	//   25   47:aload_0         
	//   26   48:getfield        #422 <Field b$a bb>
	//   27   51:iload_2         
	//   28   52:putfield        #1632 <Field boolean b$a.c>
			bb.b = true;
	//   29   55:aload_0         
	//   30   56:getfield        #422 <Field b$a bb>
	//   31   59:iconst_1        
	//   32   60:putfield        #1468 <Field boolean b$a.b>
			bb.g = i1;
	//   33   63:aload_0         
	//   34   64:getfield        #422 <Field b$a bb>
	//   35   67:iload_1         
	//   36   68:putfield        #1460 <Field int b$a.g>
			return;
	//   37   71:return          
		}
	}

	public void a(Location location)
		throws RemoteException
	{
		if(location == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(!T || ac == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #311 <Field boolean T>
	//*   5    9:ifeq            19
	//*   6   12:aload_0         
	//*   7   13:getfield        #658 <Field LocationSource ac>
	//*   8   16:ifnonnull       39
		{
			if(ab != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #1635 <Field dk ab>
	//*  11   23:ifnull          33
				ab.b();
	//   12   26:aload_0         
	//   13   27:getfield        #1635 <Field dk ab>
	//   14   30:invokevirtual   #1639 <Method void dk.b()>
			ab = null;
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:putfield        #1635 <Field dk ab>
			return;
	//   18   38:return          
		}
		try
		{
			if(ab == null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #1635 <Field dk ab>
	//*  21   43:ifnonnull       62
				ab = new dk(((s) (this)), e);
	//   22   46:aload_0         
	//   23   47:new             #1637 <Class dk>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #501 <Field Context e>
	//   28   56:invokespecial   #1640 <Method void dk(s, Context)>
	//   29   59:putfield        #1635 <Field dk ab>
			if(location.getLongitude() != 0.0D && location.getLatitude() != 0.0D)
	//*  30   62:aload_1         
	//*  31   63:invokevirtual   #1646 <Method double Location.getLongitude()>
	//*  32   66:dconst_0        
	//*  33   67:dcmpl           
	//*  34   68:ifeq            88
	//*  35   71:aload_1         
	//*  36   72:invokevirtual   #1649 <Method double Location.getLatitude()>
	//*  37   75:dconst_0        
	//*  38   76:dcmpl           
	//*  39   77:ifeq            88
				ab.a(location);
	//   40   80:aload_0         
	//   41   81:getfield        #1635 <Field dk ab>
	//   42   84:aload_1         
	//   43   85:invokevirtual   #1651 <Method void dk.a(Location)>
			if(E != null)
	//*  44   88:aload_0         
	//*  45   89:getfield        #857 <Field com.amap.api.maps.AMap$OnMyLocationChangeListener E>
	//*  46   92:ifnull          105
				E.onMyLocationChange(location);
	//   47   95:aload_0         
	//   48   96:getfield        #857 <Field com.amap.api.maps.AMap$OnMyLocationChangeListener E>
	//   49   99:aload_1         
	//   50  100:invokeinterface #1656 <Method void com.amap.api.maps.AMap$OnMyLocationChangeListener.onMyLocationChange(Location)>
			resetRenderTime();
	//   51  105:aload_0         
	//   52  106:invokevirtual   #891 <Method void resetRenderTime()>
			return;
	//   53  109:return          
		}
		// Misplaced declaration of an exception variable
		catch(Location location)
	//*  54  110:astore_1        
		{
			hm.c(((Throwable) (location)), "AMapDelegateImp", "showMyLocationOverlay");
	//   55  111:aload_1         
	//   56  112:ldc2            #1165 <String "AMapDelegateImp">
	//   57  115:ldc2            #1658 <String "showMyLocationOverlay">
	//   58  118:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
		}
		((Throwable) (location)).printStackTrace();
	//   59  121:aload_1         
	//   60  122:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		return;
	//   61  125:return          
	}

	public void a(ab ab1)
	{
		if(ab1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(ab1.f() == 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #1661 <Method int ab.f()>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		List list = az;
	//    7   13:aload_0         
	//    8   14:getfield        #370 <Field List az>
	//    9   17:astore_2        
		list;
	//   10   18:aload_2         
		JVM INSTR monitorenter ;
	//   11   19:monitorenter    
		az.add(((Object) (ab1)));
	//   12   20:aload_0         
	//   13   21:getfield        #370 <Field List az>
	//   14   24:aload_1         
	//   15   25:invokeinterface #1662 <Method boolean List.add(Object)>
	//   16   30:pop             
		list;
	//   17   31:aload_2         
		JVM INSTR monitorexit ;
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		ab1;
	//   20   34:astore_1        
	//*  21   35:aload_2         
		throw ab1;
	//   22   36:monitorexit     
	//   23   37:aload_1         
	//   24   38:athrow          
	}

	public void a(k k1)
		throws RemoteException
	{
		if(k1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(J != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #638 <Field aw J>
	//*   5    9:ifnull          26
			try
			{
				J.a(k1);
	//    6   12:aload_0         
	//    7   13:getfield        #638 <Field aw J>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #1663 <Method void aw.a(k)>
				return;
	//   10   20:return          
			}
			// Misplaced declaration of an exception variable
			catch(k k1)
	//*  11   21:astore_1        
			{
				((RemoteException) (k1)).printStackTrace();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #1664 <Method void RemoteException.printStackTrace()>
			}
	//   14   26:return          
	}

	protected void a(GLMapState glmapstate, int i1, int j1, DPoint dpoint)
	{
		if(aO && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            71
	//*   3    7:aload_0         
	//*   4    8:getfield        #545 <Field GLMapEngine f>
	//*   5   11:ifnull          71
		{
			Point point = new Point();
	//    6   14:new             #468 <Class Point>
	//    7   17:dup             
	//    8   18:invokespecial   #469 <Method void Point()>
	//    9   21:astore          5
			glmapstate.screenToP20Point(i1, j1, point);
	//   10   23:aload_1         
	//   11   24:iload_2         
	//   12   25:iload_3         
	//   13   26:aload           5
	//   14   28:invokevirtual   #1483 <Method void GLMapState.screenToP20Point(int, int, Point)>
			glmapstate = ((GLMapState) (VirtualEarthProjection.pixelsToLatLong(point.x, point.y, 20)));
	//   15   31:aload           5
	//   16   33:getfield        #1446 <Field int Point.x>
	//   17   36:i2l             
	//   18   37:aload           5
	//   19   39:getfield        #1447 <Field int Point.y>
	//   20   42:i2l             
	//   21   43:bipush          20
	//   22   45:invokestatic    #1035 <Method DPoint VirtualEarthProjection.pixelsToLatLong(long, long, int)>
	//   23   48:astore_1        
			dpoint.x = ((DPoint) (glmapstate)).x;
	//   24   49:aload           4
	//   25   51:aload_1         
	//   26   52:getfield        #948 <Field double DPoint.x>
	//   27   55:putfield        #948 <Field double DPoint.x>
			dpoint.y = ((DPoint) (glmapstate)).y;
	//   28   58:aload           4
	//   29   60:aload_1         
	//   30   61:getfield        #946 <Field double DPoint.y>
	//   31   64:putfield        #946 <Field double DPoint.y>
			((DPoint) (glmapstate)).recycle();
	//   32   67:aload_1         
	//   33   68:invokevirtual   #952 <Method void DPoint.recycle()>
		}
	//   34   71:return          
	}

	public void a(AMapWidgetListener amapwidgetlistener)
	{
		X = amapwidgetlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #714 <Field AMapWidgetListener X>
	//    3    5:return          
	}

	public void a(AbstractCameraUpdateMessage abstractcameraupdatemessage)
		throws RemoteException
	{
		if(f == null || V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field GLMapEngine f>
	//*   2    4:ifnull          14
	//*   3    7:aload_0         
	//*   4    8:getfield        #313 <Field boolean V>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		AbstractCameraUpdateMessage abstractcameraupdatemessage1 = abstractcameraupdatemessage;
	//    7   15:aload_1         
	//    8   16:astore_2        
		if(Y)
	//*   9   17:aload_0         
	//*  10   18:getfield        #315 <Field boolean Y>
	//*  11   21:ifeq            144
		{
			abstractcameraupdatemessage1 = abstractcameraupdatemessage;
	//   12   24:aload_1         
	//   13   25:astore_2        
			if(f.getStateMessageCount() > 0)
	//*  14   26:aload_0         
	//*  15   27:getfield        #545 <Field GLMapEngine f>
	//*  16   30:invokevirtual   #1668 <Method int GLMapEngine.getStateMessageCount()>
	//*  17   33:ifle            144
			{
				abstractcameraupdatemessage1 = com.amap.api.mapcore.util.al.c();
	//   18   36:invokestatic    #1671 <Method AbstractCameraUpdateMessage al.c()>
	//   19   39:astore_2        
				abstractcameraupdatemessage1.nowType = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.changeGeoCenterZoomTiltBearing;
	//   20   40:aload_2         
	//   21   41:getstatic       #1677 <Field com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type.changeGeoCenterZoomTiltBearing>
	//   22   44:putfield        #1680 <Field com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type AbstractCameraUpdateMessage.nowType>
				abstractcameraupdatemessage1.geoPoint = new Point(c.getSX(), c.getSY());
	//   23   47:aload_2         
	//   24   48:new             #468 <Class Point>
	//   25   51:dup             
	//   26   52:aload_0         
	//   27   53:getfield        #322 <Field MapConfig c>
	//   28   56:invokevirtual   #748 <Method int MapConfig.getSX()>
	//   29   59:aload_0         
	//   30   60:getfield        #322 <Field MapConfig c>
	//   31   63:invokevirtual   #751 <Method int MapConfig.getSY()>
	//   32   66:invokespecial   #1682 <Method void Point(int, int)>
	//   33   69:putfield        #1685 <Field Point AbstractCameraUpdateMessage.geoPoint>
				abstractcameraupdatemessage1.zoom = c.getSZ();
	//   34   72:aload_2         
	//   35   73:aload_0         
	//   36   74:getfield        #322 <Field MapConfig c>
	//   37   77:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//   38   80:putfield        #1686 <Field float AbstractCameraUpdateMessage.zoom>
				abstractcameraupdatemessage1.bearing = c.getSR();
	//   39   83:aload_2         
	//   40   84:aload_0         
	//   41   85:getfield        #322 <Field MapConfig c>
	//   42   88:invokevirtual   #1319 <Method float MapConfig.getSR()>
	//   43   91:putfield        #1689 <Field float AbstractCameraUpdateMessage.bearing>
				abstractcameraupdatemessage1.tilt = c.getSC();
	//   44   94:aload_2         
	//   45   95:aload_0         
	//   46   96:getfield        #322 <Field MapConfig c>
	//   47   99:invokevirtual   #1313 <Method float MapConfig.getSC()>
	//   48  102:putfield        #1692 <Field float AbstractCameraUpdateMessage.tilt>
				f.addMessage(abstractcameraupdatemessage, false);
	//   49  105:aload_0         
	//   50  106:getfield        #545 <Field GLMapEngine f>
	//   51  109:aload_1         
	//   52  110:iconst_0        
	//   53  111:invokevirtual   #1696 <Method void GLMapEngine.addMessage(AbstractCameraUpdateMessage, boolean)>
				do
				{
					if(f.getStateMessageCount() <= 0)
						break;
	//   54  114:aload_0         
	//   55  115:getfield        #545 <Field GLMapEngine f>
	//   56  118:invokevirtual   #1668 <Method int GLMapEngine.getStateMessageCount()>
	//   57  121:ifle            144
					abstractcameraupdatemessage = f.getStateMessage();
	//   58  124:aload_0         
	//   59  125:getfield        #545 <Field GLMapEngine f>
	//   60  128:invokevirtual   #1699 <Method AbstractCameraUpdateMessage GLMapEngine.getStateMessage()>
	//   61  131:astore_1        
					if(abstractcameraupdatemessage != null)
	//*  62  132:aload_1         
	//*  63  133:ifnull          141
						abstractcameraupdatemessage.mergeCameraUpdateDelegate(abstractcameraupdatemessage1);
	//   64  136:aload_1         
	//   65  137:aload_2         
	//   66  138:invokevirtual   #1702 <Method void AbstractCameraUpdateMessage.mergeCameraUpdateDelegate(AbstractCameraUpdateMessage)>
				} while(true);
	//   67  141:goto            114
			}
		}
		resetRenderTime();
	//   68  144:aload_0         
	//   69  145:invokevirtual   #891 <Method void resetRenderTime()>
		f.clearAnimations(1, false);
	//   70  148:aload_0         
	//   71  149:getfield        #545 <Field GLMapEngine f>
	//   72  152:iconst_1        
	//   73  153:iconst_0        
	//   74  154:invokevirtual   #1705 <Method void GLMapEngine.clearAnimations(int, boolean)>
		abstractcameraupdatemessage1.isChangeFinished = true;
	//   75  157:aload_2         
	//   76  158:iconst_1        
	//   77  159:putfield        #1708 <Field boolean AbstractCameraUpdateMessage.isChangeFinished>
		c(abstractcameraupdatemessage1);
	//   78  162:aload_0         
	//   79  163:aload_2         
	//   80  164:invokespecial   #1710 <Method void c(AbstractCameraUpdateMessage)>
		f.addMessage(abstractcameraupdatemessage1, false);
	//   81  167:aload_0         
	//   82  168:getfield        #545 <Field GLMapEngine f>
	//   83  171:aload_2         
	//   84  172:iconst_0        
	//   85  173:invokevirtual   #1696 <Method void GLMapEngine.addMessage(AbstractCameraUpdateMessage, boolean)>
	//   86  176:return          
	}

	public void a(AbstractCameraUpdateMessage abstractcameraupdatemessage, long l1, com.amap.api.maps.AMap.CancelableCallback cancelablecallback)
	{
		if(abstractcameraupdatemessage == null || V || f == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_0         
	//*   3    5:getfield        #313 <Field boolean V>
	//*   4    8:ifne            18
	//*   5   11:aload_0         
	//*   6   12:getfield        #545 <Field GLMapEngine f>
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		abstractcameraupdatemessage.mCallback = cancelablecallback;
	//    9   19:aload_1         
	//   10   20:aload           4
	//   11   22:putfield        #1715 <Field com.amap.api.maps.AMap$CancelableCallback AbstractCameraUpdateMessage.mCallback>
		abstractcameraupdatemessage.mDuration = l1;
	//   12   25:aload_1         
	//   13   26:lload_2         
	//   14   27:putfield        #1718 <Field long AbstractCameraUpdateMessage.mDuration>
		if(Y || getMapHeight() == 0 || getMapWidth() == 0)
	//*  15   30:aload_0         
	//*  16   31:getfield        #315 <Field boolean Y>
	//*  17   34:ifne            51
	//*  18   37:aload_0         
	//*  19   38:invokevirtual   #735 <Method int getMapHeight()>
	//*  20   41:ifeq            51
	//*  21   44:aload_0         
	//*  22   45:invokevirtual   #732 <Method int getMapWidth()>
	//*  23   48:ifne            79
		{
			try
			{
				a(abstractcameraupdatemessage);
	//   24   51:aload_0         
	//   25   52:aload_1         
	//   26   53:invokevirtual   #1163 <Method void a(AbstractCameraUpdateMessage)>
				if(abstractcameraupdatemessage.mCallback != null)
	//*  27   56:aload_1         
	//*  28   57:getfield        #1715 <Field com.amap.api.maps.AMap$CancelableCallback AbstractCameraUpdateMessage.mCallback>
	//*  29   60:ifnull          72
					abstractcameraupdatemessage.mCallback.onFinish();
	//   30   63:aload_1         
	//   31   64:getfield        #1715 <Field com.amap.api.maps.AMap$CancelableCallback AbstractCameraUpdateMessage.mCallback>
	//   32   67:invokeinterface #1723 <Method void com.amap.api.maps.AMap$CancelableCallback.onFinish()>
				return;
	//   33   72:return          
			}
			// Misplaced declaration of an exception variable
			catch(AbstractCameraUpdateMessage abstractcameraupdatemessage)
	//*  34   73:astore_1        
			{
				((Throwable) (abstractcameraupdatemessage)).printStackTrace();
	//   35   74:aload_1         
	//   36   75:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			}
			return;
	//   37   78:return          
		}
		try
		{
			f.interruptAnimation();
	//   38   79:aload_0         
	//   39   80:getfield        #545 <Field GLMapEngine f>
	//   40   83:invokevirtual   #1726 <Method void GLMapEngine.interruptAnimation()>
			resetRenderTime();
	//   41   86:aload_0         
	//   42   87:invokevirtual   #891 <Method void resetRenderTime()>
			c(abstractcameraupdatemessage);
	//   43   90:aload_0         
	//   44   91:aload_1         
	//   45   92:invokespecial   #1710 <Method void c(AbstractCameraUpdateMessage)>
			f.addMessage(abstractcameraupdatemessage, true);
	//   46   95:aload_0         
	//   47   96:getfield        #545 <Field GLMapEngine f>
	//   48   99:aload_1         
	//   49  100:iconst_1        
	//   50  101:invokevirtual   #1696 <Method void GLMapEngine.addMessage(AbstractCameraUpdateMessage, boolean)>
			return;
	//   51  104:return          
		}
		// Misplaced declaration of an exception variable
		catch(AbstractCameraUpdateMessage abstractcameraupdatemessage)
	//*  52  105:astore_1        
		{
			((Throwable) (abstractcameraupdatemessage)).printStackTrace();
	//   53  106:aload_1         
	//   54  107:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
	//   55  110:return          
	}

	public void a(Runnable runnable)
	{
		if(P != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #554 <Field t P>
	//*   2    4:ifnull          18
			P.post(runnable);
	//    3    7:aload_0         
	//    4    8:getfield        #554 <Field t P>
	//    5   11:aload_1         
	//    6   12:invokeinterface #1727 <Method boolean t.post(Runnable)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void a(String s1, eb eb1)
	{
		setCustomTextureResourcePath(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1731 <Method void setCustomTextureResourcePath(String)>
		if(c.isCustomStyleEnable() && eb1 != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #322 <Field MapConfig c>
	//*   5    9:invokevirtual   #1734 <Method boolean MapConfig.isCustomStyleEnable()>
	//*   6   12:ifeq            28
	//*   7   15:aload_2         
	//*   8   16:ifnull          28
			a(eb1.c(), false);
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #1739 <Method StyleItem[] eb.c()>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #1742 <Method void a(StyleItem[], boolean)>
	//   14   28:return          
	}

	public void a(boolean flag)
	{
		if(!V && Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifne            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #570 <Field fq Q>
	//*   5   11:ifnull          22
			Q.b(flag);
	//    6   14:aload_0         
	//    7   15:getfield        #570 <Field fq Q>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #1744 <Method void fq.b(boolean)>
	//   10   22:return          
	}

	protected void a(boolean flag, CameraPosition cameraposition)
	{
		if(c == null || c.getChangedCounter() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #322 <Field MapConfig c>
	//*   5   11:invokevirtual   #1748 <Method int MapConfig.getChangedCounter()>
	//*   6   14:ifne            18
			return;
	//    7   17:return          
		Object obj;
		c.resetChangedCounter();
	//    8   18:aload_0         
	//    9   19:getfield        #322 <Field MapConfig c>
	//   10   22:invokevirtual   #1751 <Method void MapConfig.resetChangedCounter()>
		if(I != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #1753 <Field AMapGestureListener I>
	//*  13   29:ifnull          41
			I.onMapStable();
	//   14   32:aload_0         
	//   15   33:getfield        #1753 <Field AMapGestureListener I>
	//   16   36:invokeinterface #1758 <Method void AMapGestureListener.onMapStable()>
		obj = ((Object) (x));
	//   17   41:aload_0         
	//   18   42:getfield        #867 <Field com.amap.api.maps.AMap$OnCameraChangeListener x>
	//   19   45:astore_3        
		if(obj == null)
	//*  20   46:aload_3         
	//*  21   47:ifnonnull       51
			return;
	//   22   50:return          
		flag = P.isEnabled();
	//   23   51:aload_0         
	//   24   52:getfield        #554 <Field t P>
	//   25   55:invokeinterface #1761 <Method boolean t.isEnabled()>
	//   26   60:istore_1        
		if(!flag)
	//*  27   61:iload_1         
	//*  28   62:ifne            66
			return;
	//   29   65:return          
		obj = ((Object) (cameraposition));
	//   30   66:aload_2         
	//   31   67:astore_3        
		if(cameraposition != null)
			break MISSING_BLOCK_LABEL_97;
	//   32   68:aload_2         
	//   33   69:ifnonnull       97
		try
		{
			obj = ((Object) (getCameraPosition()));
	//   34   72:aload_0         
	//   35   73:invokevirtual   #1765 <Method CameraPosition getCameraPosition()>
	//   36   76:astore_3        
			break MISSING_BLOCK_LABEL_97;
	//   37   77:goto            97
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   38   80:astore_3        
		hm.c(((Throwable) (obj)), "AMapDelegateImp", "cameraChangeFinish");
	//   39   81:aload_3         
	//   40   82:ldc2            #1165 <String "AMapDelegateImp">
	//   41   85:ldc2            #1767 <String "cameraChangeFinish">
	//   42   88:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
		((Throwable) (obj)).printStackTrace();
	//   43   91:aload_3         
	//   44   92:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		obj = ((Object) (cameraposition));
	//   45   95:aload_2         
	//   46   96:astore_3        
		try
		{
			x.onCameraChangeFinish(((CameraPosition) (obj)));
	//   47   97:aload_0         
	//   48   98:getfield        #867 <Field com.amap.api.maps.AMap$OnCameraChangeListener x>
	//   49  101:aload_3         
	//   50  102:invokeinterface #1772 <Method void com.amap.api.maps.AMap$OnCameraChangeListener.onCameraChangeFinish(CameraPosition)>
			return;
	//   51  107:return          
		}
		// Misplaced declaration of an exception variable
		catch(CameraPosition cameraposition)
	//*  52  108:astore_2        
		{
			((Throwable) (cameraposition)).printStackTrace();
	//   53  109:aload_2         
	//   54  110:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
		return;
	//   55  113:return          
	}

	public void a(boolean flag, boolean flag1)
	{
		boolean flag2;
		if(!aO || V)
			break MISSING_BLOCK_LABEL_150;
	//    0    0:aload_0         
	//    1    1:getfield        #390 <Field boolean aO>
	//    2    4:ifeq            150
	//    3    7:aload_0         
	//    4    8:getfield        #313 <Field boolean V>
	//    5   11:ifne            150
		flag2 = false;
	//    6   14:iconst_0        
	//    7   15:istore_3        
		if(flag1)
	//*   8   16:iload_2         
	//*   9   17:ifeq            22
			flag2 = flag1;
	//   10   20:iload_2         
	//   11   21:istore_3        
		if(TextUtils.isEmpty(((CharSequence) (c.getCustomStylePath()))) && TextUtils.isEmpty(((CharSequence) (c.getCustomStyleID()))))
	//*  12   22:aload_0         
	//*  13   23:getfield        #322 <Field MapConfig c>
	//*  14   26:invokevirtual   #1776 <Method String MapConfig.getCustomStylePath()>
	//*  15   29:invokestatic    #1782 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   32:ifeq            49
	//*  17   35:aload_0         
	//*  18   36:getfield        #322 <Field MapConfig c>
	//*  19   39:invokevirtual   #1785 <Method String MapConfig.getCustomStyleID()>
	//*  20   42:invokestatic    #1782 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   45:ifeq            49
			return;
	//   22   48:return          
		if(!flag)
			break MISSING_BLOCK_LABEL_104;
	//   23   49:iload_1         
	//   24   50:ifeq            104
		if(c.isProFunctionAuthEnable() && !TextUtils.isEmpty(((CharSequence) (c.getCustomStyleID()))) && aA != null)
	//*  25   53:aload_0         
	//*  26   54:getfield        #322 <Field MapConfig c>
	//*  27   57:invokevirtual   #1788 <Method boolean MapConfig.isProFunctionAuthEnable()>
	//*  28   60:ifeq            104
	//*  29   63:aload_0         
	//*  30   64:getfield        #322 <Field MapConfig c>
	//*  31   67:invokevirtual   #1785 <Method String MapConfig.getCustomStyleID()>
	//*  32   70:invokestatic    #1782 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  33   73:ifne            104
	//*  34   76:aload_0         
	//*  35   77:getfield        #678 <Field du aA>
	//*  36   80:ifnull          104
		{
			aA.a(c.getCustomStyleID());
	//   37   83:aload_0         
	//   38   84:getfield        #678 <Field du aA>
	//   39   87:aload_0         
	//   40   88:getfield        #322 <Field MapConfig c>
	//   41   91:invokevirtual   #1785 <Method String MapConfig.getCustomStyleID()>
	//   42   94:invokevirtual   #1790 <Method void du.a(String)>
			aA.b();
	//   43   97:aload_0         
	//   44   98:getfield        #678 <Field du aA>
	//   45  101:invokevirtual   #1791 <Method void du.b()>
		}
		if(flag1)
			break MISSING_BLOCK_LABEL_127;
	//   46  104:iload_2         
	//   47  105:ifne            127
		if(!O && !(c.isCustomStyleEnable() ^ flag))
			break MISSING_BLOCK_LABEL_134;
	//   48  108:aload_0         
	//   49  109:getfield        #309 <Field boolean O>
	//   50  112:ifne            127
	//   51  115:aload_0         
	//   52  116:getfield        #322 <Field MapConfig c>
	//   53  119:invokevirtual   #1734 <Method boolean MapConfig.isCustomStyleEnable()>
	//   54  122:iload_1         
	//   55  123:ixor            
	//   56  124:ifeq            134
		a(flag, ((byte []) (null)), flag2);
	//   57  127:aload_0         
	//   58  128:iload_1         
	//   59  129:aconst_null     
	//   60  130:iload_3         
	//   61  131:invokevirtual   #1794 <Method void a(boolean, byte[], boolean)>
		O = false;
	//   62  134:aload_0         
	//   63  135:iconst_0        
	//   64  136:putfield        #309 <Field boolean O>
		break MISSING_BLOCK_LABEL_149;
	//   65  139:goto            149
		Throwable throwable;
		throwable;
	//   66  142:astore          4
		throwable.printStackTrace();
	//   67  144:aload           4
	//   68  146:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		return;
	//   69  149:return          
		be.b = true;
	//   70  150:aload_0         
	//   71  151:getfield        #431 <Field b$a be>
	//   72  154:iconst_1        
	//   73  155:putfield        #1468 <Field boolean b$a.b>
		be.c = flag;
	//   74  158:aload_0         
	//   75  159:getfield        #431 <Field b$a be>
	//   76  162:iload_1         
	//   77  163:putfield        #1632 <Field boolean b$a.c>
		return;
	//   78  166:return          
	}

	public void a(boolean flag, byte abyte0[])
	{
		a(flag, abyte0, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #1794 <Method void a(boolean, byte[], boolean)>
	//    5    7:return          
	}

	public void a(boolean flag, byte abyte0[], boolean flag1)
	{
		c.setCustomStyleEnable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1798 <Method void MapConfig.setCustomStyleEnable(boolean)>
		if(c.isHideLogoEnable())
	//*   4    8:aload_0         
	//*   5    9:getfield        #322 <Field MapConfig c>
	//*   6   12:invokevirtual   #1801 <Method boolean MapConfig.isHideLogoEnable()>
	//*   7   15:ifeq            44
		{
			ag ag1 = N;
	//    8   18:aload_0         
	//    9   19:getfield        #565 <Field ag N>
	//   10   22:astore          5
			boolean flag2;
			if(!flag)
	//*  11   24:iload_1         
	//*  12   25:ifne            34
				flag2 = true;
	//   13   28:iconst_1        
	//   14   29:istore          4
			else
	//*  15   31:goto            37
				flag2 = false;
	//   16   34:iconst_0        
	//   17   35:istore          4
			ag1.setLogoEnable(flag2);
	//   18   37:aload           5
	//   19   39:iload           4
	//   20   41:invokevirtual   #1804 <Method void ag.setLogoEnable(boolean)>
		}
		if(flag)
	//*  21   44:iload_1         
	//*  22   45:ifeq            295
		{
			g(1, true);
	//   23   48:aload_0         
	//   24   49:iconst_1        
	//   25   50:iconst_1        
	//   26   51:invokevirtual   #1806 <Method void g(int, boolean)>
			ea ea1 = new ea(e);
	//   27   54:new             #1808 <Class ea>
	//   28   57:dup             
	//   29   58:aload_0         
	//   30   59:getfield        #501 <Field Context e>
	//   31   62:invokespecial   #1809 <Method void ea(Context)>
	//   32   65:astore          8
			boolean flag3 = false;
	//   33   67:iconst_0        
	//   34   68:istore          4
			flag = flag3;
	//   35   70:iload           4
	//   36   72:istore_1        
			if(c.isProFunctionAuthEnable())
	//*  37   73:aload_0         
	//*  38   74:getfield        #322 <Field MapConfig c>
	//*  39   77:invokevirtual   #1788 <Method boolean MapConfig.isProFunctionAuthEnable()>
	//*  40   80:ifeq            101
			{
				flag = flag3;
	//   41   83:iload           4
	//   42   85:istore_1        
				if(!TextUtils.isEmpty(((CharSequence) (c.getCustomTextureResourcePath()))))
	//*  43   86:aload_0         
	//*  44   87:getfield        #322 <Field MapConfig c>
	//*  45   90:invokevirtual   #1812 <Method String MapConfig.getCustomTextureResourcePath()>
	//*  46   93:invokestatic    #1782 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  47   96:ifne            101
					flag = true;
	//   48   99:iconst_1        
	//   49  100:istore_1        
			}
			Object obj = null;
	//   50  101:aconst_null     
	//   51  102:astore          6
			Object obj1 = null;
	//   52  104:aconst_null     
	//   53  105:astore          7
			StyleItem astyleitem[] = ((StyleItem []) (obj1));
	//   54  107:aload           7
	//   55  109:astore          5
			if(abyte0 != null)
	//*  56  111:aload_2         
	//*  57  112:ifnull          167
			{
				abyte0 = ((byte []) (ea1.a(abyte0, flag)));
	//   58  115:aload           8
	//   59  117:aload_2         
	//   60  118:iload_1         
	//   61  119:invokevirtual   #1815 <Method eb ea.a(byte[], boolean)>
	//   62  122:astore_2        
				obj = ((Object) (abyte0));
	//   63  123:aload_2         
	//   64  124:astore          6
				astyleitem = ((StyleItem []) (obj1));
	//   65  126:aload           7
	//   66  128:astore          5
				if(abyte0 != null)
	//*  67  130:aload_2         
	//*  68  131:ifnull          167
				{
					StyleItem astyleitem1[] = ((eb) (abyte0)).c();
	//   69  134:aload_2         
	//   70  135:invokevirtual   #1739 <Method StyleItem[] eb.c()>
	//   71  138:astore          7
					obj = ((Object) (abyte0));
	//   72  140:aload_2         
	//   73  141:astore          6
					astyleitem = astyleitem1;
	//   74  143:aload           7
	//   75  145:astore          5
					if(astyleitem1 != null)
	//*  76  147:aload           7
	//*  77  149:ifnull          167
					{
						c.setUseProFunction(true);
	//   78  152:aload_0         
	//   79  153:getfield        #322 <Field MapConfig c>
	//   80  156:iconst_1        
	//   81  157:invokevirtual   #1818 <Method void MapConfig.setUseProFunction(boolean)>
						astyleitem = astyleitem1;
	//   82  160:aload           7
	//   83  162:astore          5
						obj = ((Object) (abyte0));
	//   84  164:aload_2         
	//   85  165:astore          6
					}
				}
			}
			abyte0 = ((byte []) (astyleitem));
	//   86  167:aload           5
	//   87  169:astore_2        
			if(astyleitem == null)
	//*  88  170:aload           5
	//*  89  172:ifnonnull       212
			{
				eb eb1 = ea1.a(c.getCustomStylePath(), flag);
	//   90  175:aload           8
	//   91  177:aload_0         
	//   92  178:getfield        #322 <Field MapConfig c>
	//   93  181:invokevirtual   #1776 <Method String MapConfig.getCustomStylePath()>
	//   94  184:iload_1         
	//   95  185:invokevirtual   #1821 <Method eb ea.a(String, boolean)>
	//   96  188:astore          7
				obj = ((Object) (eb1));
	//   97  190:aload           7
	//   98  192:astore          6
				abyte0 = ((byte []) (astyleitem));
	//   99  194:aload           5
	//  100  196:astore_2        
				if(eb1 != null)
	//* 101  197:aload           7
	//* 102  199:ifnull          212
				{
					abyte0 = ((byte []) (eb1.c()));
	//  103  202:aload           7
	//  104  204:invokevirtual   #1739 <Method StyleItem[] eb.c()>
	//  105  207:astore_2        
					obj = ((Object) (eb1));
	//  106  208:aload           7
	//  107  210:astore          6
				}
			}
			if(ea1.a() != 0)
	//* 108  212:aload           8
	//* 109  214:invokevirtual   #1823 <Method int ea.a()>
	//* 110  217:ifeq            232
				c.setCustomBackgroundColor(ea1.a());
	//  111  220:aload_0         
	//  112  221:getfield        #322 <Field MapConfig c>
	//  113  224:aload           8
	//  114  226:invokevirtual   #1823 <Method int ea.a()>
	//  115  229:invokevirtual   #1826 <Method void MapConfig.setCustomBackgroundColor(int)>
			if(obj != null && ((eb) (obj)).d() != null)
	//* 116  232:aload           6
	//* 117  234:ifnull          288
	//* 118  237:aload           6
	//* 119  239:invokevirtual   #1829 <Method Object eb.d()>
	//* 120  242:ifnull          288
			{
				if(aB != null)
	//* 121  245:aload_0         
	//* 122  246:getfield        #683 <Field dw aB>
	//* 123  249:ifnull          294
				{
					abyte0 = ((byte []) ((String)((eb) (obj)).d()));
	//  124  252:aload           6
	//  125  254:invokevirtual   #1829 <Method Object eb.d()>
	//  126  257:checkcast       #984 <Class String>
	//  127  260:astore_2        
					aB.a(((String) (abyte0)));
	//  128  261:aload_0         
	//  129  262:getfield        #683 <Field dw aB>
	//  130  265:aload_2         
	//  131  266:invokevirtual   #1830 <Method void dw.a(String)>
					aB.a(((eb) (obj)));
	//  132  269:aload_0         
	//  133  270:getfield        #683 <Field dw aB>
	//  134  273:aload           6
	//  135  275:invokevirtual   #1833 <Method void dw.a(eb)>
					aB.b();
	//  136  278:aload_0         
	//  137  279:getfield        #683 <Field dw aB>
	//  138  282:invokevirtual   #1834 <Method void dw.b()>
				}
			} else
	//* 139  285:goto            294
			{
				a(((StyleItem []) (abyte0)), flag1);
	//  140  288:aload_0         
	//  141  289:aload_2         
	//  142  290:iload_3         
	//  143  291:invokevirtual   #1742 <Method void a(StyleItem[], boolean)>
			}
			return;
	//  144  294:return          
		} else
		{
			g(1, false);
	//  145  295:aload_0         
	//  146  296:iconst_1        
	//  147  297:iconst_0        
	//  148  298:invokevirtual   #1806 <Method void g(int, boolean)>
			a(1, c.getMapStyleMode(), c.getMapStyleTime(), c.getMapStyleState(), true, false, ((StyleItem []) (null)));
	//  149  301:aload_0         
	//  150  302:iconst_1        
	//  151  303:aload_0         
	//  152  304:getfield        #322 <Field MapConfig c>
	//  153  307:invokevirtual   #1837 <Method int MapConfig.getMapStyleMode()>
	//  154  310:aload_0         
	//  155  311:getfield        #322 <Field MapConfig c>
	//  156  314:invokevirtual   #1840 <Method int MapConfig.getMapStyleTime()>
	//  157  317:aload_0         
	//  158  318:getfield        #322 <Field MapConfig c>
	//  159  321:invokevirtual   #1843 <Method int MapConfig.getMapStyleState()>
	//  160  324:iconst_1        
	//  161  325:iconst_0        
	//  162  326:aconst_null     
	//  163  327:invokevirtual   #1845 <Method void a(int, int, int, int, boolean, boolean, StyleItem[])>
			return;
	//  164  330:return          
		}
	}

	protected void a(StyleItem astyleitem[], boolean flag)
	{
		boolean flag1;
		if(flag || astyleitem != null && astyleitem.length > 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            13
	//*   2    4:aload_1         
	//*   3    5:ifnull          18
	//*   4    8:aload_1         
	//*   5    9:arraylength     
	//*   6   10:ifle            18
			flag1 = true;
	//    7   13:iconst_1        
	//    8   14:istore_3        
		else
	//*   9   15:goto            20
			flag1 = false;
	//   10   18:iconst_0        
	//   11   19:istore_3        
		if(flag1)
	//*  12   20:iload_3         
	//*  13   21:ifeq            44
		{
			a(1, 0, 0, 0, true, true, astyleitem);
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:iconst_0        
	//   17   27:iconst_0        
	//   18   28:iconst_0        
	//   19   29:iconst_1        
	//   20   30:iconst_1        
	//   21   31:aload_1         
	//   22   32:invokevirtual   #1845 <Method void a(int, int, int, int, boolean, boolean, StyleItem[])>
			fb.a(e, true);
	//   23   35:aload_0         
	//   24   36:getfield        #501 <Field Context e>
	//   25   39:iconst_1        
	//   26   40:invokestatic    #1850 <Method void fb.a(Context, boolean)>
			return;
	//   27   43:return          
		} else
		{
			fb.a(e, false);
	//   28   44:aload_0         
	//   29   45:getfield        #501 <Field Context e>
	//   30   48:iconst_0        
	//   31   49:invokestatic    #1850 <Method void fb.a(Context, boolean)>
			return;
	//   32   52:return          
		}
	}

	public boolean a(int i1, int j1, int k1)
	{
		if(!aO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if((float)(int)b(i1) >= c.getMaxZoomLevel())
			break MISSING_BLOCK_LABEL_123;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #1853 <Method float b(int)>
	//    8   14:f2i             
	//    9   15:i2f             
	//   10   16:aload_0         
	//   11   17:getfield        #322 <Field MapConfig c>
	//   12   20:invokevirtual   #1856 <Method float MapConfig.getMaxZoomLevel()>
	//   13   23:fcmpg           
	//   14   24:ifge            123
		AbstractCameraUpdateMessage abstractcameraupdatemessage;
		if(Z)
	//*  15   27:aload_0         
	//*  16   28:getfield        #324 <Field boolean Z>
	//*  17   31:ifeq            44
		{
			abstractcameraupdatemessage = com.amap.api.mapcore.util.al.a(1.0F, ((Point) (null)));
	//   18   34:fconst_1        
	//   19   35:aconst_null     
	//   20   36:invokestatic    #1859 <Method AbstractCameraUpdateMessage al.a(float, Point)>
	//   21   39:astore          4
			break MISSING_BLOCK_LABEL_90;
	//   22   41:goto            90
		}
		if(!N.isZoomInByScreenCenter())
	//*  23   44:aload_0         
	//*  24   45:getfield        #565 <Field ag N>
	//*  25   48:invokevirtual   #1862 <Method boolean ag.isZoomInByScreenCenter()>
	//*  26   51:ifne            83
		{
			j.x = j1;
	//   27   54:aload_0         
	//   28   55:getfield        #471 <Field Point j>
	//   29   58:iload_2         
	//   30   59:putfield        #1446 <Field int Point.x>
			j.y = k1;
	//   31   62:aload_0         
	//   32   63:getfield        #471 <Field Point j>
	//   33   66:iload_3         
	//   34   67:putfield        #1447 <Field int Point.y>
			abstractcameraupdatemessage = com.amap.api.mapcore.util.al.a(1.0F, j);
	//   35   70:fconst_1        
	//   36   71:aload_0         
	//   37   72:getfield        #471 <Field Point j>
	//   38   75:invokestatic    #1859 <Method AbstractCameraUpdateMessage al.a(float, Point)>
	//   39   78:astore          4
			break MISSING_BLOCK_LABEL_90;
	//   40   80:goto            90
		}
		abstractcameraupdatemessage = com.amap.api.mapcore.util.al.a(1.0F, ((Point) (null)));
	//   41   83:fconst_1        
	//   42   84:aconst_null     
	//   43   85:invokestatic    #1859 <Method AbstractCameraUpdateMessage al.a(float, Point)>
	//   44   88:astore          4
		b(abstractcameraupdatemessage);
	//   45   90:aload_0         
	//   46   91:aload           4
	//   47   93:invokevirtual   #1864 <Method void b(AbstractCameraUpdateMessage)>
		break MISSING_BLOCK_LABEL_117;
	//   48   96:goto            117
		Throwable throwable;
		throwable;
	//   49   99:astore          4
		hm.c(throwable, "AMapDelegateImp", "onDoubleTap");
	//   50  101:aload           4
	//   51  103:ldc2            #1165 <String "AMapDelegateImp">
	//   52  106:ldc2            #1866 <String "onDoubleTap">
	//   53  109:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
		throwable.printStackTrace();
	//   54  112:aload           4
	//   55  114:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		resetRenderTime();
	//   56  117:aload_0         
	//   57  118:invokevirtual   #891 <Method void resetRenderTime()>
		return true;
	//   58  121:iconst_1        
	//   59  122:ireturn         
		return false;
	//   60  123:iconst_0        
	//   61  124:ireturn         
	}

	public boolean a(String s1)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		return S.d(s1);
	//    2    4:aload_0         
	//    3    5:getfield        #589 <Field q S>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1869 <Method boolean q.d(String)>
	//    6   12:ireturn         
	}

	public Arc addArc(ArcOptions arcoptions)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		arcoptions = ((ArcOptions) (S.a(arcoptions)));
	//    2    4:aload_0         
	//    3    5:getfield        #589 <Field q S>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1874 <Method cx q.a(ArcOptions)>
	//    6   12:astore_1        
		if(arcoptions != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          26
			return new Arc(((com.autonavi.amap.mapcore.interfaces.IArc) (arcoptions)));
	//    9   17:new             #1876 <Class Arc>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #1879 <Method void Arc(com.autonavi.amap.mapcore.interfaces.IArc)>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public BuildingOverlay addBuildingOverlay()
	{
		Object obj = ((Object) (S.a()));
	//    0    0:aload_0         
	//    1    1:getfield        #589 <Field q S>
	//    2    4:invokevirtual   #1884 <Method cy q.a()>
	//    3    7:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_31;
	//    4    8:aload_1         
	//    5    9:ifnull          23
		obj = ((Object) (new BuildingOverlay(((cy) (obj)))));
	//    6   12:new             #1886 <Class BuildingOverlay>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #1889 <Method void BuildingOverlay(cy)>
	//   10   20:astore_1        
		return ((BuildingOverlay) (obj));
	//   11   21:aload_1         
	//   12   22:areturn         
	//*  13   23:goto            31
		RemoteException remoteexception;
		remoteexception;
	//   14   26:astore_1        
		remoteexception.printStackTrace();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #1664 <Method void RemoteException.printStackTrace()>
		return null;
	//   17   31:aconst_null     
	//   18   32:areturn         
	}

	public Circle addCircle(CircleOptions circleoptions)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		circleoptions = ((CircleOptions) (S.a(circleoptions)));
	//    2    4:aload_0         
	//    3    5:getfield        #589 <Field q S>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1894 <Method cz q.a(CircleOptions)>
	//    6   12:astore_1        
		if(circleoptions != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          26
			return new Circle(((com.autonavi.amap.mapcore.interfaces.ICircle) (circleoptions)));
	//    9   17:new             #1896 <Class Circle>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #1899 <Method void Circle(com.autonavi.amap.mapcore.interfaces.ICircle)>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public CrossOverlay addCrossVector(CrossOverlayOptions crossoverlayoptions)
	{
		if(crossoverlayoptions == null || crossoverlayoptions.getRes() == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #1906 <Method Bitmap CrossOverlayOptions.getRes()>
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		CrossVectorOverlay crossvectoroverlay = new CrossVectorOverlay(1, w(), ((s) (this)));
	//    7   13:new             #1908 <Class CrossVectorOverlay>
	//    8   16:dup             
	//    9   17:iconst_1        
	//   10   18:aload_0         
	//   11   19:invokevirtual   #1911 <Method Context w()>
	//   12   22:aload_0         
	//   13   23:invokespecial   #1914 <Method void CrossVectorOverlay(int, Context, s)>
	//   14   26:astore_2        
		if(crossoverlayoptions != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          39
			crossvectoroverlay.setAttribute(crossoverlayoptions.getAttribute());
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #1918 <Method com.autonavi.ae.gmap.gloverlay.GLCrossVector$AVectorCrossAttr CrossOverlayOptions.getAttribute()>
	//   20   36:invokevirtual   #1922 <Method void CrossVectorOverlay.setAttribute(com.autonavi.ae.gmap.gloverlay.GLCrossVector$AVectorCrossAttr)>
		if(f != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #545 <Field GLMapEngine f>
	//*  23   43:ifnull          66
		{
			f.getOverlayBundle(1).addOverlay(((BaseMapOverlay) (crossvectoroverlay)));
	//   24   46:aload_0         
	//   25   47:getfield        #545 <Field GLMapEngine f>
	//   26   50:iconst_1        
	//   27   51:invokevirtual   #1926 <Method GLOverlayBundle GLMapEngine.getOverlayBundle(int)>
	//   28   54:aload_2         
	//   29   55:invokevirtual   #1930 <Method void GLOverlayBundle.addOverlay(BaseMapOverlay)>
			crossvectoroverlay.resumeMarker(crossoverlayoptions.getRes());
	//   30   58:aload_2         
	//   31   59:aload_1         
	//   32   60:invokevirtual   #1906 <Method Bitmap CrossOverlayOptions.getRes()>
	//   33   63:invokevirtual   #1934 <Method void CrossVectorOverlay.resumeMarker(Bitmap)>
		}
		return new CrossOverlay(crossoverlayoptions, crossvectoroverlay);
	//   34   66:new             #1936 <Class CrossOverlay>
	//   35   69:dup             
	//   36   70:aload_1         
	//   37   71:aload_2         
	//   38   72:invokespecial   #1939 <Method void CrossOverlay(CrossOverlayOptions, CrossVectorOverlay)>
	//   39   75:areturn         
	}

	public GL3DModel addGLModel(GL3DModelOptions gl3dmodeloptions)
	{
		return W.a(gl3dmodeloptions);
	//    0    0:aload_0         
	//    1    1:getfield        #604 <Field n W>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1943 <Method GL3DModel n.a(GL3DModelOptions)>
	//    4    8:areturn         
	}

	public GroundOverlay addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		groundoverlayoptions = ((GroundOverlayOptions) (S.a(groundoverlayoptions)));
	//    2    4:aload_0         
	//    3    5:getfield        #589 <Field q S>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1948 <Method da q.a(GroundOverlayOptions)>
	//    6   12:astore_1        
		if(groundoverlayoptions != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          26
			return new GroundOverlay(((com.autonavi.amap.mapcore.interfaces.IGroundOverlay) (groundoverlayoptions)));
	//    9   17:new             #1950 <Class GroundOverlay>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #1953 <Method void GroundOverlay(com.autonavi.amap.mapcore.interfaces.IGroundOverlay)>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public Marker addMarker(MarkerOptions markeroptions)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		return b.a(markeroptions);
	//    2    4:aload_0         
	//    3    5:getfield        #599 <Field y b>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1957 <Method Marker y.a(MarkerOptions)>
	//    6   12:areturn         
	}

	public ArrayList addMarkers(ArrayList arraylist, boolean flag)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		return b.a(arraylist, flag);
	//    2    4:aload_0         
	//    3    5:getfield        #599 <Field y b>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #1961 <Method ArrayList y.a(ArrayList, boolean)>
	//    7   13:areturn         
	}

	public MultiPointOverlay addMultiPointOverlay(MultiPointOverlayOptions multipointoverlayoptions)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		multipointoverlayoptions = ((MultiPointOverlayOptions) (aZ.a(multipointoverlayoptions)));
	//    2    4:aload_0         
	//    3    5:getfield        #663 <Field bb aZ>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1967 <Method com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay bb.a(MultiPointOverlayOptions)>
	//    6   12:astore_1        
		if(multipointoverlayoptions != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          26
			return new MultiPointOverlay(((com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay) (multipointoverlayoptions)));
	//    9   17:new             #1969 <Class MultiPointOverlay>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #1972 <Method void MultiPointOverlay(com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay)>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public RouteOverlay addNaviRouteOverlay()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public NavigateArrow addNavigateArrow(NavigateArrowOptions navigatearrowoptions)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		navigatearrowoptions = ((NavigateArrowOptions) (S.a(navigatearrowoptions)));
	//    2    4:aload_0         
	//    3    5:getfield        #589 <Field q S>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1979 <Method dc q.a(NavigateArrowOptions)>
	//    6   12:astore_1        
		if(navigatearrowoptions != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          26
			return new NavigateArrow(((com.autonavi.amap.mapcore.interfaces.INavigateArrow) (navigatearrowoptions)));
	//    9   17:new             #1981 <Class NavigateArrow>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #1984 <Method void NavigateArrow(com.autonavi.amap.mapcore.interfaces.INavigateArrow)>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public void addOverlayTexture(int i1, GLTextureProperty gltextureproperty)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field GLMapEngine f>
	//*   2    4:ifnull          65
		{
			GLOverlayBundle gloverlaybundle = f.getOverlayBundle(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #545 <Field GLMapEngine f>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #1926 <Method GLOverlayBundle GLMapEngine.getOverlayBundle(int)>
	//    7   15:astore_3        
			if(gloverlaybundle == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       21
				return;
	//   10   20:return          
			f.addOverlayTexture(i1, gltextureproperty);
	//   11   21:aload_0         
	//   12   22:getfield        #545 <Field GLMapEngine f>
	//   13   25:iload_1         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #1988 <Method void GLMapEngine.addOverlayTexture(int, GLTextureProperty)>
			gloverlaybundle.addOverlayTextureItem(gltextureproperty.mId, gltextureproperty.mAnchor, gltextureproperty.mXRatio, gltextureproperty.mYRatio, gltextureproperty.mBitmap.getWidth(), gltextureproperty.mBitmap.getHeight());
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:getfield        #1993 <Field int GLTextureProperty.mId>
	//   19   35:aload_2         
	//   20   36:getfield        #1996 <Field int GLTextureProperty.mAnchor>
	//   21   39:aload_2         
	//   22   40:getfield        #1999 <Field float GLTextureProperty.mXRatio>
	//   23   43:aload_2         
	//   24   44:getfield        #2002 <Field float GLTextureProperty.mYRatio>
	//   25   47:aload_2         
	//   26   48:getfield        #2006 <Field Bitmap GLTextureProperty.mBitmap>
	//   27   51:invokevirtual   #2007 <Method int Bitmap.getWidth()>
	//   28   54:aload_2         
	//   29   55:getfield        #2006 <Field Bitmap GLTextureProperty.mBitmap>
	//   30   58:invokevirtual   #2008 <Method int Bitmap.getHeight()>
	//   31   61:invokevirtual   #2012 <Method boolean GLOverlayBundle.addOverlayTextureItem(int, int, float, float, int, int)>
	//   32   64:pop             
		}
	//   33   65:return          
	}

	public Polygon addPolygon(PolygonOptions polygonoptions)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		polygonoptions = ((PolygonOptions) (S.a(polygonoptions)));
	//    2    4:aload_0         
	//    3    5:getfield        #589 <Field q S>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #2017 <Method df q.a(PolygonOptions)>
	//    6   12:astore_1        
		if(polygonoptions != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          26
			return new Polygon(((com.autonavi.amap.mapcore.interfaces.IPolygon) (polygonoptions)));
	//    9   17:new             #2019 <Class Polygon>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #2022 <Method void Polygon(com.autonavi.amap.mapcore.interfaces.IPolygon)>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public Polyline addPolyline(PolylineOptions polylineoptions)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		polylineoptions = ((PolylineOptions) (S.a(polylineoptions)));
	//    2    4:aload_0         
	//    3    5:getfield        #589 <Field q S>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #2027 <Method dg q.a(PolylineOptions)>
	//    6   12:astore_1        
		if(polylineoptions != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          26
			return new Polyline(((com.autonavi.amap.mapcore.interfaces.IPolyline) (polylineoptions)));
	//    9   17:new             #1116 <Class Polyline>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #1121 <Method void Polyline(com.autonavi.amap.mapcore.interfaces.IPolyline)>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public Text addText(TextOptions textoptions)
		throws RemoteException
	{
		resetRenderTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method void resetRenderTime()>
		return b.a(textoptions);
	//    2    4:aload_0         
	//    3    5:getfield        #599 <Field y b>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #2031 <Method Text y.a(TextOptions)>
	//    6   12:areturn         
	}

	public TileOverlay addTileOverlay(TileOverlayOptions tileoverlayoptions)
		throws RemoteException
	{
		return R.a(tileoverlayoptions);
	//    0    0:aload_0         
	//    1    1:getfield        #594 <Field af R>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2035 <Method TileOverlay af.a(TileOverlayOptions)>
	//    4    8:areturn         
	}

	public void afterAnimation()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #2038 <Method void j()>
	//    2    4:return          
	}

	public void afterDrawFrame(int i1, GLMapState glmapstate)
	{
		float f1 = glmapstate.getMapZoomer();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #2042 <Method float GLMapState.getMapZoomer()>
	//    2    4:fstore_3        
		if(f != null && (f.isInMapAction(i1) || f.isInMapAnimation(i1)))
	//*   3    5:aload_0         
	//*   4    6:getfield        #545 <Field GLMapEngine f>
	//*   5    9:ifnull          39
	//*   6   12:aload_0         
	//*   7   13:getfield        #545 <Field GLMapEngine f>
	//*   8   16:iload_1         
	//*   9   17:invokevirtual   #894 <Method boolean GLMapEngine.isInMapAction(int)>
	//*  10   20:ifne            34
	//*  11   23:aload_0         
	//*  12   24:getfield        #545 <Field GLMapEngine f>
	//*  13   27:iload_1         
	//*  14   28:invokevirtual   #898 <Method boolean GLMapEngine.isInMapAnimation(int)>
	//*  15   31:ifeq            39
			i1 = 1;
	//   16   34:iconst_1        
	//   17   35:istore_1        
		else
	//*  18   36:goto            41
			i1 = 0;
	//   19   39:iconst_0        
	//   20   40:istore_1        
		if(i1 == 0)
	//*  21   41:iload_1         
	//*  22   42:ifeq            48
	//*  23   45:goto            128
		{
			if(aJ)
	//*  24   48:aload_0         
	//*  25   49:getfield        #380 <Field boolean aJ>
	//*  26   52:ifeq            68
				aD.setRenderFps(10F);
	//   27   55:aload_0         
	//   28   56:getfield        #552 <Field GLMapRender aD>
	//   29   59:ldc2            #903 <Float 10F>
	//   30   62:invokevirtual   #613 <Method void GLMapRender.setRenderFps(float)>
			else
	//*  31   65:goto            101
			if(ay != -1)
	//*  32   68:aload_0         
	//*  33   69:getfield        #365 <Field int ay>
	//*  34   72:iconst_m1       
	//*  35   73:icmpeq          91
				aD.setRenderFps(ay);
	//   36   76:aload_0         
	//   37   77:getfield        #552 <Field GLMapRender aD>
	//   38   80:aload_0         
	//   39   81:getfield        #365 <Field int ay>
	//   40   84:i2f             
	//   41   85:invokevirtual   #613 <Method void GLMapRender.setRenderFps(float)>
			else
	//*  42   88:goto            101
				aD.setRenderFps(15F);
	//   43   91:aload_0         
	//   44   92:getfield        #552 <Field GLMapRender aD>
	//   45   95:ldc2            #609 <Float 15F>
	//   46   98:invokevirtual   #613 <Method void GLMapRender.setRenderFps(float)>
			if(aN == 1)
	//*  47  101:aload_0         
	//*  48  102:getfield        #388 <Field int aN>
	//*  49  105:iconst_1        
	//*  50  106:icmpne          114
				aN = 0;
	//   51  109:aload_0         
	//   52  110:iconst_0        
	//   53  111:putfield        #388 <Field int aN>
			if(aG != f1)
	//*  54  114:aload_0         
	//*  55  115:getfield        #374 <Field float aG>
	//*  56  118:fload_3         
	//*  57  119:fcmpl           
	//*  58  120:ifeq            128
				aG = f1;
	//   59  123:aload_0         
	//   60  124:fload_3         
	//   61  125:putfield        #374 <Field float aG>
		}
		if(!aR)
	//*  62  128:aload_0         
	//*  63  129:getfield        #396 <Field boolean aR>
	//*  64  132:ifne            140
			aR = true;
	//   65  135:aload_0         
	//   66  136:iconst_1        
	//   67  137:putfield        #396 <Field boolean aR>
	//   68  140:return          
	}

	public void afterDrawLabel(int i1, GLMapState glmapstate)
	{
		p();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #2045 <Method void p()>
		if(f != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #545 <Field GLMapEngine f>
	//*   4    8:ifnull          18
			f.pushRendererState();
	//    5   11:aload_0         
	//    6   12:getfield        #545 <Field GLMapEngine f>
	//    7   15:invokevirtual   #2048 <Method void GLMapEngine.pushRendererState()>
		R.b();
	//    8   18:aload_0         
	//    9   19:getfield        #594 <Field af R>
	//   10   22:invokevirtual   #2049 <Method void af.b()>
		S.a(false, au);
	//   11   25:aload_0         
	//   12   26:getfield        #589 <Field q S>
	//   13   29:iconst_0        
	//   14   30:aload_0         
	//   15   31:getfield        #361 <Field int au>
	//   16   34:invokevirtual   #2052 <Method void q.a(boolean, int)>
		if(aZ != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #663 <Field bb aZ>
	//*  19   41:ifnull          63
			aZ.a(c, getViewMatrix(), getProjectionMatrix());
	//   20   44:aload_0         
	//   21   45:getfield        #663 <Field bb aZ>
	//   22   48:aload_0         
	//   23   49:getfield        #322 <Field MapConfig c>
	//   24   52:aload_0         
	//   25   53:invokevirtual   #2056 <Method float[] getViewMatrix()>
	//   26   56:aload_0         
	//   27   57:invokevirtual   #2059 <Method float[] getProjectionMatrix()>
	//   28   60:invokevirtual   #2062 <Method void bb.a(MapConfig, float[], float[])>
		if(b != null)
	//*  29   63:aload_0         
	//*  30   64:getfield        #599 <Field y b>
	//*  31   67:ifnull          77
			b.b();
	//   32   70:aload_0         
	//   33   71:getfield        #599 <Field y b>
	//   34   74:invokevirtual   #2063 <Method void y.b()>
		if(W != null)
	//*  35   77:aload_0         
	//*  36   78:getfield        #604 <Field n W>
	//*  37   81:ifnull          91
			W.a();
	//   38   84:aload_0         
	//   39   85:getfield        #604 <Field n W>
	//   40   88:invokevirtual   #2064 <Method void n.a()>
		if(K != null)
	//*  41   91:aload_0         
	//*  42   92:getfield        #305 <Field do K>
	//*  43   95:ifnull          113
			K.b(getMapWidth(), getMapHeight());
	//   44   98:aload_0         
	//   45   99:getfield        #305 <Field do K>
	//   46  102:aload_0         
	//   47  103:invokevirtual   #732 <Method int getMapWidth()>
	//   48  106:aload_0         
	//   49  107:invokevirtual   #735 <Method int getMapHeight()>
	//   50  110:invokevirtual   #2066 <Method void do.b(int, int)>
		if(f != null)
	//*  51  113:aload_0         
	//*  52  114:getfield        #545 <Field GLMapEngine f>
	//*  53  117:ifnull          127
			f.popRendererState();
	//   54  120:aload_0         
	//   55  121:getfield        #545 <Field GLMapEngine f>
	//   56  124:invokevirtual   #2069 <Method void GLMapEngine.popRendererState()>
	//   57  127:return          
	}

	public void animateCamera(CameraUpdate cameraupdate)
		throws RemoteException
	{
		if(cameraupdate == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			b(cameraupdate.getCameraUpdateFactoryDelegate());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #2076 <Method AbstractCameraUpdateMessage CameraUpdate.getCameraUpdateFactoryDelegate()>
	//    6   10:invokevirtual   #1864 <Method void b(AbstractCameraUpdateMessage)>
			return;
	//    7   13:return          
		}
	}

	public void animateCameraWithCallback(CameraUpdate cameraupdate, com.amap.api.maps.AMap.CancelableCallback cancelablecallback)
		throws RemoteException
	{
		if(cameraupdate == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			animateCameraWithDurationAndCallback(cameraupdate, 250L, cancelablecallback);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc2w           #2079 <Long 250L>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #2084 <Method void animateCameraWithDurationAndCallback(CameraUpdate, long, com.amap.api.maps.AMap$CancelableCallback)>
			return;
	//    8   14:return          
		}
	}

	public void animateCameraWithDurationAndCallback(CameraUpdate cameraupdate, long l1, com.amap.api.maps.AMap.CancelableCallback cancelablecallback)
	{
		if(cameraupdate == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			a(cameraupdate.getCameraUpdateFactoryDelegate(), l1, cancelablecallback);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #2076 <Method AbstractCameraUpdateMessage CameraUpdate.getCameraUpdateFactoryDelegate()>
	//    6   10:lload_2         
	//    7   11:aload           4
	//    8   13:invokevirtual   #2086 <Method void a(AbstractCameraUpdateMessage, long, com.amap.api.maps.AMap$CancelableCallback)>
			return;
	//    9   16:return          
		}
	}

	public float b(int i1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          15
			return getMapConfig().getSZ();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #2090 <Method MapConfig getMapConfig()>
	//    5   11:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//    6   14:freturn         
		else
			return 0.0F;
	//    7   15:fconst_0        
	//    8   16:freturn         
	}

	public void b()
	{
		if(R != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #594 <Field af R>
	//*   2    4:ifnull          14
			R.h();
	//    3    7:aload_0         
	//    4    8:getfield        #594 <Field af R>
	//    5   11:invokevirtual   #2092 <Method void af.h()>
	//    6   14:return          
	}

	public void b(double d1, double d2, IPoint ipoint)
	{
		if(aO && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            146
	//*   3    7:aload_0         
	//*   4    8:getfield        #545 <Field GLMapEngine f>
	//*   5   11:ifnull          146
			try
			{
				Point point = VirtualEarthProjection.latLongToPixels(d1, d2, 20);
	//    6   14:dload_1         
	//    7   15:dload_3         
	//    8   16:bipush          20
	//    9   18:invokestatic    #1445 <Method Point VirtualEarthProjection.latLongToPixels(double, double, int)>
	//   10   21:astore          6
				FPoint fpoint = FPoint.obtain();
	//   11   23:invokestatic    #2095 <Method FPoint FPoint.obtain()>
	//   12   26:astore          7
				b(point.x, point.y, fpoint);
	//   13   28:aload_0         
	//   14   29:aload           6
	//   15   31:getfield        #1446 <Field int Point.x>
	//   16   34:aload           6
	//   17   36:getfield        #1447 <Field int Point.y>
	//   18   39:aload           7
	//   19   41:invokevirtual   #2097 <Method void b(int, int, FPoint)>
				if(fpoint.x == -10000F && fpoint.y == -10000F)
	//*  20   44:aload           7
	//*  21   46:getfield        #1478 <Field float FPoint.x>
	//*  22   49:ldc2            #2098 <Float -10000F>
	//*  23   52:fcmpl           
	//*  24   53:ifne            111
	//*  25   56:aload           7
	//*  26   58:getfield        #1479 <Field float FPoint.y>
	//*  27   61:ldc2            #2098 <Float -10000F>
	//*  28   64:fcmpl           
	//*  29   65:ifne            111
				{
					GLMapState glmapstate = f.getNewMapState(1);
	//   30   68:aload_0         
	//   31   69:getfield        #545 <Field GLMapEngine f>
	//   32   72:iconst_1        
	//   33   73:invokevirtual   #2101 <Method GLMapState GLMapEngine.getNewMapState(int)>
	//   34   76:astore          8
					glmapstate.setCameraDegree(0.0F);
	//   35   78:aload           8
	//   36   80:fconst_0        
	//   37   81:invokevirtual   #1316 <Method void GLMapState.setCameraDegree(float)>
					glmapstate.recalculate();
	//   38   84:aload           8
	//   39   86:invokevirtual   #1373 <Method void GLMapState.recalculate()>
					glmapstate.p20ToScreenPoint(point.x, point.y, fpoint);
	//   40   89:aload           8
	//   41   91:aload           6
	//   42   93:getfield        #1446 <Field int Point.x>
	//   43   96:aload           6
	//   44   98:getfield        #1447 <Field int Point.y>
	//   45  101:aload           7
	//   46  103:invokevirtual   #2104 <Method void GLMapState.p20ToScreenPoint(int, int, FPoint)>
					glmapstate.recycle();
	//   47  106:aload           8
	//   48  108:invokevirtual   #855 <Method void GLMapState.recycle()>
				}
				ipoint.x = (int)fpoint.x;
	//   49  111:aload           5
	//   50  113:aload           7
	//   51  115:getfield        #1478 <Field float FPoint.x>
	//   52  118:f2i             
	//   53  119:putfield        #1369 <Field int IPoint.x>
				ipoint.y = (int)fpoint.y;
	//   54  122:aload           5
	//   55  124:aload           7
	//   56  126:getfield        #1479 <Field float FPoint.y>
	//   57  129:f2i             
	//   58  130:putfield        #1370 <Field int IPoint.y>
				fpoint.recycle();
	//   59  133:aload           7
	//   60  135:invokevirtual   #2105 <Method void FPoint.recycle()>
				return;
	//   61  138:return          
			}
			// Misplaced declaration of an exception variable
			catch(IPoint ipoint)
	//*  62  139:astore          5
			{
				((Throwable) (ipoint)).printStackTrace();
	//   63  141:aload           5
	//   64  143:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			}
	//   65  146:return          
	}

	public void b(int i1, int j1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          33
		{
			g = i1;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #1527 <Field int g>
			h = j1;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:putfield        #1529 <Field int h>
			c.setMapWidth(i1);
	//    9   17:aload_0         
	//   10   18:getfield        #322 <Field MapConfig c>
	//   11   21:iload_1         
	//   12   22:invokevirtual   #1542 <Method void MapConfig.setMapWidth(int)>
			c.setMapHeight(j1);
	//   13   25:aload_0         
	//   14   26:getfield        #322 <Field MapConfig c>
	//   15   29:iload_2         
	//   16   30:invokevirtual   #1545 <Method void MapConfig.setMapHeight(int)>
		}
	//   17   33:return          
	}

	public void b(int i1, int j1, int k1, int l1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		a(i1, j1, k1, l1, false, false, ((StyleItem []) (null)));
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:iload_2         
	//    5    5:iload_3         
	//    6    6:iload           4
	//    7    8:iconst_0        
	//    8    9:iconst_0        
	//    9   10:aconst_null     
	//   10   11:invokevirtual   #1845 <Method void a(int, int, int, int, boolean, boolean, StyleItem[])>
		this;
	//   11   14:aload_0         
		JVM INSTR monitorexit ;
	//   12   15:monitorexit     
		return;
	//   13   16:return          
		Exception exception;
		exception;
	//   14   17:astore          5
	//*  15   19:aload_0         
		throw exception;
	//   16   20:monitorexit     
	//   17   21:aload           5
	//   18   23:athrow          
	}

	public void b(int i1, int j1, DPoint dpoint)
	{
		if(aO && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            90
	//*   3    7:aload_0         
	//*   4    8:getfield        #545 <Field GLMapEngine f>
	//*   5   11:ifnull          90
		{
			Object obj = ((Object) (f.getMapState(1)));
	//    6   14:aload_0         
	//    7   15:getfield        #545 <Field GLMapEngine f>
	//    8   18:iconst_1        
	//    9   19:invokevirtual   #729 <Method GLMapState GLMapEngine.getMapState(int)>
	//   10   22:astore          5
			if(obj != null)
	//*  11   24:aload           5
	//*  12   26:ifnull          90
			{
				IPoint ipoint = IPoint.obtain();
	//   13   29:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//   14   32:astore          4
				((GLMapState) (obj)).screenToP20Point(i1, j1, ((Point) (ipoint)));
	//   15   34:aload           5
	//   16   36:iload_1         
	//   17   37:iload_2         
	//   18   38:aload           4
	//   19   40:invokevirtual   #1483 <Method void GLMapState.screenToP20Point(int, int, Point)>
				obj = ((Object) (VirtualEarthProjection.pixelsToLatLong(ipoint.x, ipoint.y, 20)));
	//   20   43:aload           4
	//   21   45:getfield        #1369 <Field int IPoint.x>
	//   22   48:i2l             
	//   23   49:aload           4
	//   24   51:getfield        #1370 <Field int IPoint.y>
	//   25   54:i2l             
	//   26   55:bipush          20
	//   27   57:invokestatic    #1035 <Method DPoint VirtualEarthProjection.pixelsToLatLong(long, long, int)>
	//   28   60:astore          5
				dpoint.x = ((DPoint) (obj)).x;
	//   29   62:aload_3         
	//   30   63:aload           5
	//   31   65:getfield        #948 <Field double DPoint.x>
	//   32   68:putfield        #948 <Field double DPoint.x>
				dpoint.y = ((DPoint) (obj)).y;
	//   33   71:aload_3         
	//   34   72:aload           5
	//   35   74:getfield        #946 <Field double DPoint.y>
	//   36   77:putfield        #946 <Field double DPoint.y>
				ipoint.recycle();
	//   37   80:aload           4
	//   38   82:invokevirtual   #1178 <Method void IPoint.recycle()>
				((DPoint) (obj)).recycle();
	//   39   85:aload           5
	//   40   87:invokevirtual   #952 <Method void DPoint.recycle()>
			}
		}
	//   41   90:return          
	}

	public void b(int i1, int j1, FPoint fpoint)
	{
		if(aO && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            37
	//*   3    7:aload_0         
	//*   4    8:getfield        #545 <Field GLMapEngine f>
	//*   5   11:ifnull          37
		{
			GLMapState glmapstate = f.getMapState(1);
	//    6   14:aload_0         
	//    7   15:getfield        #545 <Field GLMapEngine f>
	//    8   18:iconst_1        
	//    9   19:invokevirtual   #729 <Method GLMapState GLMapEngine.getMapState(int)>
	//   10   22:astore          4
			if(glmapstate != null)
	//*  11   24:aload           4
	//*  12   26:ifnull          37
				glmapstate.p20ToScreenPoint(i1, j1, fpoint);
	//   13   29:aload           4
	//   14   31:iload_1         
	//   15   32:iload_2         
	//   16   33:aload_3         
	//   17   34:invokevirtual   #2104 <Method void GLMapState.p20ToScreenPoint(int, int, FPoint)>
		}
	//   18   37:return          
	}

	public void b(int i1, boolean flag)
	{
		b(i1, 19, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          19
	//    3    4:iload_2         
	//    4    5:invokespecial   #969 <Method void b(int, int, boolean)>
		if(aO && aP)
	//*   5    8:aload_0         
	//*   6    9:getfield        #390 <Field boolean aO>
	//*   7   12:ifeq            41
	//*   8   15:aload_0         
	//*   9   16:getfield        #392 <Field boolean aP>
	//*  10   19:ifeq            41
		{
			resetRenderTime();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #891 <Method void resetRenderTime()>
			queueEvent(new Runnable(flag, i1) {

				public void run()
				{
					try
					{
						if(a)
				//*   0    0:aload_0         
				//*   1    1:getfield        #22  <Field boolean a>
				//*   2    4:ifeq            52
						{
							c.f.setParamater(b, 1021, 1, 0, 0, 0);
				//    3    7:aload_0         
				//    4    8:getfield        #20  <Field b c>
				//    5   11:getfield        #35  <Field GLMapEngine b.f>
				//    6   14:aload_0         
				//    7   15:getfield        #24  <Field int b>
				//    8   18:sipush          1021
				//    9   21:iconst_1        
				//   10   22:iconst_0        
				//   11   23:iconst_0        
				//   12   24:iconst_0        
				//   13   25:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
							c.f.setParamater(b, 1022, 1, 0, 0, 0);
				//   14   28:aload_0         
				//   15   29:getfield        #20  <Field b c>
				//   16   32:getfield        #35  <Field GLMapEngine b.f>
				//   17   35:aload_0         
				//   18   36:getfield        #24  <Field int b>
				//   19   39:sipush          1022
				//   20   42:iconst_1        
				//   21   43:iconst_0        
				//   22   44:iconst_0        
				//   23   45:iconst_0        
				//   24   46:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
							break MISSING_BLOCK_LABEL_94;
				//   25   49:goto            94
						}
					}
				//*  26   52:aload_0         
				//*  27   53:getfield        #20  <Field b c>
				//*  28   56:getfield        #35  <Field GLMapEngine b.f>
				//*  29   59:aload_0         
				//*  30   60:getfield        #24  <Field int b>
				//*  31   63:sipush          1021
				//*  32   66:iconst_0        
				//*  33   67:iconst_0        
				//*  34   68:iconst_0        
				//*  35   69:iconst_0        
				//*  36   70:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				//*  37   73:aload_0         
				//*  38   74:getfield        #20  <Field b c>
				//*  39   77:getfield        #35  <Field GLMapEngine b.f>
				//*  40   80:aload_0         
				//*  41   81:getfield        #24  <Field int b>
				//*  42   84:sipush          1022
				//*  43   87:iconst_0        
				//*  44   88:iconst_0        
				//*  45   89:iconst_0        
				//*  46   90:iconst_0        
				//*  47   91:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				//*  48   94:return          
					catch(Throwable throwable)
				//*  49   95:astore_1        
					{
						throwable.printStackTrace();
				//   50   96:aload_1         
				//   51   97:invokevirtual   #44  <Method void Throwable.printStackTrace()>
						return;
				//   52  100:return          
					}
					c.f.setParamater(b, 1021, 0, 0, 0, 0);
					c.f.setParamater(b, 1022, 0, 0, 0, 0);
				}

				final boolean a;
				final int b;
				final com.amap.api.mapcore.util.b c;

			
			{
				c = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field b c>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field boolean a>
				b = i1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   13   26:aload_0         
	//   14   27:new             #36  <Class b$20>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:iload_2         
	//   18   33:iload_1         
	//   19   34:invokespecial   #2108 <Method void b$20(b, boolean, int)>
	//   20   37:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   21   40:return          
		} else
		{
			bf.c = flag;
	//   22   41:aload_0         
	//   23   42:getfield        #434 <Field b$a bf>
	//   24   45:iload_2         
	//   25   46:putfield        #1632 <Field boolean b$a.c>
			bf.b = true;
	//   26   49:aload_0         
	//   27   50:getfield        #434 <Field b$a bf>
	//   28   53:iconst_1        
	//   29   54:putfield        #1468 <Field boolean b$a.b>
			bf.g = i1;
	//   30   57:aload_0         
	//   31   58:getfield        #434 <Field b$a bf>
	//   32   61:iload_1         
	//   33   62:putfield        #1460 <Field int b$a.g>
			return;
	//   34   65:return          
		}
	}

	public void b(AbstractCameraUpdateMessage abstractcameraupdatemessage)
		throws RemoteException
	{
		a(abstractcameraupdatemessage, 250L, ((com.amap.api.maps.AMap.CancelableCallback) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #2079 <Long 250L>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #2086 <Method void a(AbstractCameraUpdateMessage, long, com.amap.api.maps.AMap$CancelableCallback)>
	//    5    9:return          
	}

	public void b(boolean flag)
	{
		if(!V && Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifne            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #570 <Field fq Q>
	//*   5   11:ifnull          22
			Q.a(flag);
	//    6   14:aload_0         
	//    7   15:getfield        #570 <Field fq Q>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #2110 <Method void fq.a(boolean)>
	//   10   22:return          
	}

	public boolean b(int i1, MotionEvent motionevent)
	{
		if(!aO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifne            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			a(i1, (int)motionevent.getX(), (int)motionevent.getY());
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #924 <Method float MotionEvent.getX()>
	//    9   15:f2i             
	//   10   16:aload_2         
	//   11   17:invokevirtual   #927 <Method float MotionEvent.getY()>
	//   12   20:f2i             
	//   13   21:invokevirtual   #2113 <Method boolean a(int, int, int)>
	//   14   24:pop             
			return false;
	//   15   25:iconst_0        
	//   16   26:ireturn         
		}
	}

	public boolean b(String s1)
	{
		try
		{
			W.a(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #604 <Field n W>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2114 <Method void n.a(String)>
		}
	//*   4    8:goto            26
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*   5   11:astore_1        
		{
			hm.c(((Throwable) (s1)), "AMapDelegateImp", "removeGLModel");
	//    6   12:aload_1         
	//    7   13:ldc2            #1165 <String "AMapDelegateImp">
	//    8   16:ldc2            #2116 <String "removeGLModel">
	//    9   19:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
			((Throwable) (s1)).printStackTrace();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
		return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public void beforeDrawLabel(int i1, GLMapState glmapstate)
	{
		p();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #2045 <Method void p()>
		if(f != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #545 <Field GLMapEngine f>
	//*   4    8:ifnull          18
			f.pushRendererState();
	//    5   11:aload_0         
	//    6   12:getfield        #545 <Field GLMapEngine f>
	//    7   15:invokevirtual   #2048 <Method void GLMapEngine.pushRendererState()>
		S.a(true, au);
	//    8   18:aload_0         
	//    9   19:getfield        #589 <Field q S>
	//   10   22:iconst_1        
	//   11   23:aload_0         
	//   12   24:getfield        #361 <Field int au>
	//   13   27:invokevirtual   #2052 <Method void q.a(boolean, int)>
		if(f != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #545 <Field GLMapEngine f>
	//*  16   34:ifnull          44
			f.popRendererState();
	//   17   37:aload_0         
	//   18   38:getfield        #545 <Field GLMapEngine f>
	//   19   41:invokevirtual   #2069 <Method void GLMapEngine.popRendererState()>
	//   20   44:return          
	}

	public GLMapState c()
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field GLMapEngine f>
	//*   2    4:ifnull          16
			return f.getMapState(1);
	//    3    7:aload_0         
	//    4    8:getfield        #545 <Field GLMapEngine f>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #729 <Method GLMapState GLMapEngine.getMapState(int)>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public void c(int i1)
	{
		if(!aO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if((float)(int)b(i1) > c.getMinZoomLevel())
	//*   4    8:aload_0         
	//*   5    9:iload_1         
	//*   6   10:invokevirtual   #1853 <Method float b(int)>
	//*   7   13:f2i             
	//*   8   14:i2f             
	//*   9   15:aload_0         
	//*  10   16:getfield        #322 <Field MapConfig c>
	//*  11   19:invokevirtual   #2121 <Method float MapConfig.getMinZoomLevel()>
	//*  12   22:fcmpl           
	//*  13   23:ifle            55
		{
			try
			{
				b(com.amap.api.mapcore.util.al.b());
	//   14   26:aload_0         
	//   15   27:invokestatic    #2123 <Method AbstractCameraUpdateMessage al.b()>
	//   16   30:invokevirtual   #1864 <Method void b(AbstractCameraUpdateMessage)>
			}
	//*  17   33:goto            51
			catch(Throwable throwable)
	//*  18   36:astore_2        
			{
				hm.c(throwable, "AMapDelegateImp", "onDoubleTap");
	//   19   37:aload_2         
	//   20   38:ldc2            #1165 <String "AMapDelegateImp">
	//   21   41:ldc2            #1866 <String "onDoubleTap">
	//   22   44:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
				throwable.printStackTrace();
	//   23   47:aload_2         
	//   24   48:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			}
			resetRenderTime();
	//   25   51:aload_0         
	//   26   52:invokevirtual   #891 <Method void resetRenderTime()>
		}
	//   27   55:return          
	}

	public void c(int i1, boolean flag)
	{
		if(aO && aP)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            33
	//*   3    7:aload_0         
	//*   4    8:getfield        #392 <Field boolean aP>
	//*   5   11:ifeq            33
		{
			resetRenderTime();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #891 <Method void resetRenderTime()>
			queueEvent(new Runnable(i1, flag) {

				public void run()
				{
					try
					{
						c.f.setBuildingEnable(a, b);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field b c>
				//    2    4:getfield        #35  <Field GLMapEngine b.f>
				//    3    7:aload_0         
				//    4    8:getfield        #22  <Field int a>
				//    5   11:aload_0         
				//    6   12:getfield        #24  <Field boolean b>
				//    7   15:invokevirtual   #40  <Method void GLMapEngine.setBuildingEnable(int, boolean)>
						return;
				//    8   18:return          
					}
					catch(Throwable throwable)
				//*   9   19:astore_1        
					{
						throwable.printStackTrace();
				//   10   20:aload_1         
				//   11   21:invokevirtual   #43  <Method void Throwable.printStackTrace()>
					}
				//   12   24:return          
				}

				final int a;
				final boolean b;
				final com.amap.api.mapcore.util.b c;

			
			{
				c = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field b c>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int a>
				b = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field boolean b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    8   18:aload_0         
	//    9   19:new             #40  <Class b$22>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:iload_2         
	//   14   26:invokespecial   #2124 <Method void b$22(b, int, boolean)>
	//   15   29:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   16   32:return          
		} else
		{
			bg.c = flag;
	//   17   33:aload_0         
	//   18   34:getfield        #437 <Field b$a bg>
	//   19   37:iload_2         
	//   20   38:putfield        #1632 <Field boolean b$a.c>
			bg.b = true;
	//   21   41:aload_0         
	//   22   42:getfield        #437 <Field b$a bg>
	//   23   45:iconst_1        
	//   24   46:putfield        #1468 <Field boolean b$a.b>
			bg.g = i1;
	//   25   49:aload_0         
	//   26   50:getfield        #437 <Field b$a bg>
	//   27   53:iload_1         
	//   28   54:putfield        #1460 <Field int b$a.g>
			return;
	//   29   57:return          
		}
	}

	public void c(String s1)
	{
		List list = az;
	//    0    0:aload_0         
	//    1    1:getfield        #370 <Field List az>
	//    2    4:astore          6
		list;
	//    3    6:aload           6
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int k1 = az.size();
	//    5    9:aload_0         
	//    6   10:getfield        #370 <Field List az>
	//    7   13:invokeinterface #694 <Method int List.size()>
	//    8   18:istore          5
		int i1;
		byte byte0;
		byte0 = -1;
	//    9   20:iconst_m1       
	//   10   21:istore          4
		i1 = 0;
	//   11   23:iconst_0        
	//   12   24:istore_2        
_L2:
		int j1;
		j1 = ((int) (byte0));
	//   13   25:iload           4
	//   14   27:istore_3        
		if(i1 >= k1)
			break MISSING_BLOCK_LABEL_62;
	//   15   28:iload_2         
	//   16   29:iload           5
	//   17   31:icmpge          62
		if(!((ab)az.get(i1)).j().equals(((Object) (s1))))
			break MISSING_BLOCK_LABEL_87;
	//   18   34:aload_0         
	//   19   35:getfield        #370 <Field List az>
	//   20   38:iload_2         
	//   21   39:invokeinterface #698 <Method Object List.get(int)>
	//   22   44:checkcast       #700 <Class ab>
	//   23   47:invokevirtual   #2126 <Method String ab.j()>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #988 <Method boolean String.equals(Object)>
	//   26   54:ifeq            87
		j1 = i1;
	//   27   57:iload_2         
	//   28   58:istore_3        
	//*  29   59:goto            62
		if(j1 < 0)
			break MISSING_BLOCK_LABEL_77;
	//   30   62:iload_3         
	//   31   63:iflt            77
		az.remove(j1);
	//   32   66:aload_0         
	//   33   67:getfield        #370 <Field List az>
	//   34   70:iload_3         
	//   35   71:invokeinterface #2129 <Method Object List.remove(int)>
	//   36   76:pop             
		list;
	//   37   77:aload           6
		JVM INSTR monitorexit ;
	//   38   79:monitorexit     
		return;
	//   39   80:return          
		s1;
	//   40   81:astore_1        
	//*  41   82:aload           6
		throw s1;
	//   42   84:monitorexit     
	//   43   85:aload_1         
	//   44   86:athrow          
		i1++;
	//   45   87:iload_2         
	//   46   88:iconst_1        
	//   47   89:iadd            
	//   48   90:istore_2        
		if(true) goto _L2; else goto _L1
	//   49   91:goto            25
_L1:
	}

	public void c(boolean flag)
	{
		if(!V && Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifne            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #570 <Field fq Q>
	//*   5   11:ifnull          22
			Q.c(flag);
	//    6   14:aload_0         
	//    7   15:getfield        #570 <Field fq Q>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #2131 <Method void fq.c(boolean)>
	//   10   22:return          
	}

	public boolean c(int i1, MotionEvent motionevent)
	{
		if(!aO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = g(motionevent);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #2133 <Method boolean g(MotionEvent)>
	//    8   14:istore_3        
		}
	//*   9   15:iload_3         
	//*  10   16:ifeq            21
	//*  11   19:iconst_1        
	//*  12   20:ireturn         
	//*  13   21:aload_0         
	//*  14   22:aload_2         
	//*  15   23:invokespecial   #2135 <Method boolean e(MotionEvent)>
	//*  16   26:istore_3        
	//*  17   27:iload_3         
	//*  18   28:ifeq            33
	//*  19   31:iconst_1        
	//*  20   32:ireturn         
	//*  21   33:aload_0         
	//*  22   34:aload_2         
	//*  23   35:invokespecial   #2137 <Method boolean f(MotionEvent)>
	//*  24   38:istore_3        
	//*  25   39:iload_3         
	//*  26   40:ifeq            45
	//*  27   43:iconst_1        
	//*  28   44:ireturn         
	//*  29   45:aload_0         
	//*  30   46:aload_2         
	//*  31   47:invokespecial   #2139 <Method boolean d(MotionEvent)>
	//*  32   50:istore_3        
	//*  33   51:iload_3         
	//*  34   52:ifeq            57
	//*  35   55:iconst_1        
	//*  36   56:ireturn         
	//*  37   57:aload_0         
	//*  38   58:aload_2         
	//*  39   59:invokespecial   #2141 <Method void b(MotionEvent)>
	//*  40   62:goto            82
		// Misplaced declaration of an exception variable
		catch(MotionEvent motionevent)
	//*  41   65:astore_2        
		{
			hm.c(((Throwable) (motionevent)), "AMapDelegateImp", "onSingleTapUp");
	//   42   66:aload_2         
	//   43   67:ldc2            #1165 <String "AMapDelegateImp">
	//   44   70:ldc2            #2143 <String "onSingleTapUp">
	//   45   73:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
			((Throwable) (motionevent)).printStackTrace();
	//   46   76:aload_2         
	//   47   77:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			return true;
	//   48   80:iconst_1        
	//   49   81:ireturn         
		}
		if(flag)
			return true;
		flag = e(motionevent);
		if(flag)
			return true;
		flag = f(motionevent);
		if(flag)
			return true;
		flag = d(motionevent);
		if(flag)
			return true;
		b(motionevent);
		return true;
	//   50   82:iconst_1        
	//   51   83:ireturn         
	}

	public Pair calculateZoomToSpanLevel(int i1, int j1, int k1, int l1, LatLng latlng, LatLng latlng1)
	{
		if(latlng != null && latlng1 != null && i1 == j1 && j1 == k1 && k1 == l1 && latlng.latitude == latlng1.latitude && latlng.longitude == latlng1.longitude)
	//*   0    0:aload           5
	//*   1    2:ifnull          71
	//*   2    5:aload           6
	//*   3    7:ifnull          71
	//*   4   10:iload_1         
	//*   5   11:iload_2         
	//*   6   12:icmpne          71
	//*   7   15:iload_2         
	//*   8   16:iload_3         
	//*   9   17:icmpne          71
	//*  10   20:iload_3         
	//*  11   21:iload           4
	//*  12   23:icmpne          71
	//*  13   26:aload           5
	//*  14   28:getfield        #843 <Field double LatLng.latitude>
	//*  15   31:aload           6
	//*  16   33:getfield        #843 <Field double LatLng.latitude>
	//*  17   36:dcmpl           
	//*  18   37:ifne            71
	//*  19   40:aload           5
	//*  20   42:getfield        #840 <Field double LatLng.longitude>
	//*  21   45:aload           6
	//*  22   47:getfield        #840 <Field double LatLng.longitude>
	//*  23   50:dcmpl           
	//*  24   51:ifne            71
			return new Pair(((Object) (Float.valueOf(getMaxZoomLevel()))), ((Object) (latlng)));
	//   25   54:new             #2147 <Class Pair>
	//   26   57:dup             
	//   27   58:aload_0         
	//   28   59:invokevirtual   #2148 <Method float getMaxZoomLevel()>
	//   29   62:invokestatic    #2154 <Method Float Float.valueOf(float)>
	//   30   65:aload           5
	//   31   67:invokespecial   #2157 <Method void Pair(Object, Object)>
	//   32   70:areturn         
		MapConfig mapconfig = getMapConfig();
	//   33   71:aload_0         
	//   34   72:invokevirtual   #2090 <Method MapConfig getMapConfig()>
	//   35   75:astore          7
		if(latlng != null && latlng1 != null && aO && !V)
	//*  36   77:aload           5
	//*  37   79:ifnull          251
	//*  38   82:aload           6
	//*  39   84:ifnull          251
	//*  40   87:aload_0         
	//*  41   88:getfield        #390 <Field boolean aO>
	//*  42   91:ifeq            251
	//*  43   94:aload_0         
	//*  44   95:getfield        #313 <Field boolean V>
	//*  45   98:ifne            251
		{
			com.amap.api.maps.model.LatLngBounds.Builder builder = new com.amap.api.maps.model.LatLngBounds.Builder();
	//   46  101:new             #1382 <Class com.amap.api.maps.model.LatLngBounds$Builder>
	//   47  104:dup             
	//   48  105:invokespecial   #2158 <Method void com.amap.api.maps.model.LatLngBounds$Builder()>
	//   49  108:astore          8
			builder.include(latlng);
	//   50  110:aload           8
	//   51  112:aload           5
	//   52  114:invokevirtual   #1386 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   53  117:pop             
			builder.include(latlng1);
	//   54  118:aload           8
	//   55  120:aload           6
	//   56  122:invokevirtual   #1386 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   57  125:pop             
			latlng = ((LatLng) (new GLMapState(1, f.getNativeInstance())));
	//   58  126:new             #737 <Class GLMapState>
	//   59  129:dup             
	//   60  130:iconst_1        
	//   61  131:aload_0         
	//   62  132:getfield        #545 <Field GLMapEngine f>
	//   63  135:invokevirtual   #820 <Method long GLMapEngine.getNativeInstance()>
	//   64  138:invokespecial   #823 <Method void GLMapState(int, long)>
	//   65  141:astore          5
			latlng1 = ((LatLng) (fd.a(mapconfig, i1, j1, k1, l1, builder.build(), getMapWidth(), getMapHeight())));
	//   66  143:aload           7
	//   67  145:iload_1         
	//   68  146:iload_2         
	//   69  147:iload_3         
	//   70  148:iload           4
	//   71  150:aload           8
	//   72  152:invokevirtual   #1389 <Method LatLngBounds com.amap.api.maps.model.LatLngBounds$Builder.build()>
	//   73  155:aload_0         
	//   74  156:invokevirtual   #732 <Method int getMapWidth()>
	//   75  159:aload_0         
	//   76  160:invokevirtual   #735 <Method int getMapHeight()>
	//   77  163:invokestatic    #2161 <Method Pair fd.a(MapConfig, int, int, int, int, LatLngBounds, int, int)>
	//   78  166:astore          6
			((GLMapState) (latlng)).recycle();
	//   79  168:aload           5
	//   80  170:invokevirtual   #855 <Method void GLMapState.recycle()>
			if(latlng1 != null)
	//*  81  173:aload           6
	//*  82  175:ifnull          249
			{
				latlng = ((LatLng) (DPoint.obtain()));
	//   83  178:invokestatic    #941 <Method DPoint DPoint.obtain()>
	//   84  181:astore          5
				GLMapState.geo2LonLat(((IPoint)((Pair) (latlng1)).second).x, ((IPoint)((Pair) (latlng1)).second).y, ((DPoint) (latlng)));
	//   85  183:aload           6
	//   86  185:getfield        #2165 <Field Object Pair.second>
	//   87  188:checkcast       #825 <Class IPoint>
	//   88  191:getfield        #1369 <Field int IPoint.x>
	//   89  194:aload           6
	//   90  196:getfield        #2165 <Field Object Pair.second>
	//   91  199:checkcast       #825 <Class IPoint>
	//   92  202:getfield        #1370 <Field int IPoint.y>
	//   93  205:aload           5
	//   94  207:invokestatic    #2168 <Method void GLMapState.geo2LonLat(int, int, DPoint)>
				latlng1 = ((LatLng) (new Pair(((Pair) (latlng1)).first, ((Object) (new LatLng(((DPoint) (latlng)).y, ((DPoint) (latlng)).x))))));
	//   95  210:new             #2147 <Class Pair>
	//   96  213:dup             
	//   97  214:aload           6
	//   98  216:getfield        #2171 <Field Object Pair.first>
	//   99  219:new             #837 <Class LatLng>
	//  100  222:dup             
	//  101  223:aload           5
	//  102  225:getfield        #946 <Field double DPoint.y>
	//  103  228:aload           5
	//  104  230:getfield        #948 <Field double DPoint.x>
	//  105  233:invokespecial   #951 <Method void LatLng(double, double)>
	//  106  236:invokespecial   #2157 <Method void Pair(Object, Object)>
	//  107  239:astore          6
				((DPoint) (latlng)).recycle();
	//  108  241:aload           5
	//  109  243:invokevirtual   #952 <Method void DPoint.recycle()>
				return ((Pair) (latlng1));
	//  110  246:aload           6
	//  111  248:areturn         
			} else
			{
				return null;
	//  112  249:aconst_null     
	//  113  250:areturn         
			}
		} else
		{
			latlng = ((LatLng) (DPoint.obtain()));
	//  114  251:invokestatic    #941 <Method DPoint DPoint.obtain()>
	//  115  254:astore          5
			GLMapState.geo2LonLat(mapconfig.getSX(), mapconfig.getSY(), ((DPoint) (latlng)));
	//  116  256:aload           7
	//  117  258:invokevirtual   #748 <Method int MapConfig.getSX()>
	//  118  261:aload           7
	//  119  263:invokevirtual   #751 <Method int MapConfig.getSY()>
	//  120  266:aload           5
	//  121  268:invokestatic    #2168 <Method void GLMapState.geo2LonLat(int, int, DPoint)>
			latlng1 = ((LatLng) (new Pair(((Object) (Float.valueOf(mapconfig.getSZ()))), ((Object) (new LatLng(((DPoint) (latlng)).y, ((DPoint) (latlng)).x))))));
	//  122  271:new             #2147 <Class Pair>
	//  123  274:dup             
	//  124  275:aload           7
	//  125  277:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//  126  280:invokestatic    #2154 <Method Float Float.valueOf(float)>
	//  127  283:new             #837 <Class LatLng>
	//  128  286:dup             
	//  129  287:aload           5
	//  130  289:getfield        #946 <Field double DPoint.y>
	//  131  292:aload           5
	//  132  294:getfield        #948 <Field double DPoint.x>
	//  133  297:invokespecial   #951 <Method void LatLng(double, double)>
	//  134  300:invokespecial   #2157 <Method void Pair(Object, Object)>
	//  135  303:astore          6
			((DPoint) (latlng)).recycle();
	//  136  305:aload           5
	//  137  307:invokevirtual   #952 <Method void DPoint.recycle()>
			return ((Pair) (latlng1));
	//  138  310:aload           6
	//  139  312:areturn         
		}
	}

	public boolean canStopMapRender()
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field GLMapEngine f>
	//*   2    4:ifnull          16
			f.canStopMapRender(1);
	//    3    7:aload_0         
	//    4    8:getfield        #545 <Field GLMapEngine f>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #998 <Method boolean GLMapEngine.canStopMapRender(int)>
	//    7   15:pop             
		return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	public void changeSurface(GL10 gl10, int i1, int j1)
	{
		try
		{
			a(1, gl10, i1, j1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:invokevirtual   #2175 <Method void a(int, GL10, int, int)>
			return;
	//    6    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(GL10 gl10)
	//*   7    9:astore_1        
		{
			((Throwable) (gl10)).printStackTrace();
	//    8   10:aload_1         
	//    9   11:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
	//   10   14:return          
	}

	public void checkMapState(GLMapState glmapstate)
	{
		LatLngBounds latlngbounds;
		if(c == null || V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          14
	//*   3    7:aload_0         
	//*   4    8:getfield        #313 <Field boolean V>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		latlngbounds = c.getLimitLatLngBounds();
	//    7   15:aload_0         
	//    8   16:getfield        #322 <Field MapConfig c>
	//    9   19:invokevirtual   #813 <Method LatLngBounds MapConfig.getLimitLatLngBounds()>
	//   10   22:astore          12
		if(latlngbounds == null) goto _L2; else goto _L1
	//   11   24:aload           12
	//   12   26:ifnull          361
_L1:
		float f1;
		float f2;
		float f3;
		float f4;
		int i1;
		int j1;
		int k1;
		int l1;
		Object aobj[];
		IPoint aipoint[];
		IPoint ipoint;
		IPoint ipoint1;
		try
		{
			aipoint = c.getLimitIPoints();
	//   13   29:aload_0         
	//   14   30:getfield        #322 <Field MapConfig c>
	//   15   33:invokevirtual   #2180 <Method IPoint[] MapConfig.getLimitIPoints()>
	//   16   36:astore          11
		}
	//*  17   38:aload           11
	//*  18   40:astore          10
	//*  19   42:aload           11
	//*  20   44:ifnonnull       126
	//*  21   47:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//*  22   50:astore          11
	//*  23   52:aload           12
	//*  24   54:getfield        #835 <Field LatLng LatLngBounds.northeast>
	//*  25   57:getfield        #840 <Field double LatLng.longitude>
	//*  26   60:aload           12
	//*  27   62:getfield        #835 <Field LatLng LatLngBounds.northeast>
	//*  28   65:getfield        #843 <Field double LatLng.latitude>
	//*  29   68:aload           11
	//*  30   70:invokestatic    #847 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
	//*  31   73:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//*  32   76:astore          13
	//*  33   78:aload           12
	//*  34   80:getfield        #850 <Field LatLng LatLngBounds.southwest>
	//*  35   83:getfield        #840 <Field double LatLng.longitude>
	//*  36   86:aload           12
	//*  37   88:getfield        #850 <Field LatLng LatLngBounds.southwest>
	//*  38   91:getfield        #843 <Field double LatLng.latitude>
	//*  39   94:aload           13
	//*  40   96:invokestatic    #847 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
	//*  41   99:iconst_2        
	//*  42  100:anewarray       IPoint[]
	//*  43  103:astore          10
	//*  44  105:aload           10
	//*  45  107:iconst_0        
	//*  46  108:aload           11
	//*  47  110:aastore         
	//*  48  111:aload           10
	//*  49  113:iconst_1        
	//*  50  114:aload           13
	//*  51  116:aastore         
	//*  52  117:aload_0         
	//*  53  118:getfield        #322 <Field MapConfig c>
	//*  54  121:aload           10
	//*  55  123:invokevirtual   #854 <Method void MapConfig.setLimitIPoints(IPoint[])>
	//*  56  126:aload_0         
	//*  57  127:getfield        #322 <Field MapConfig c>
	//*  58  130:aload           10
	//*  59  132:iconst_0        
	//*  60  133:aaload          
	//*  61  134:getfield        #1369 <Field int IPoint.x>
	//*  62  137:aload           10
	//*  63  139:iconst_0        
	//*  64  140:aaload          
	//*  65  141:getfield        #1370 <Field int IPoint.y>
	//*  66  144:aload           10
	//*  67  146:iconst_1        
	//*  68  147:aaload          
	//*  69  148:getfield        #1369 <Field int IPoint.x>
	//*  70  151:aload           10
	//*  71  153:iconst_1        
	//*  72  154:aaload          
	//*  73  155:getfield        #1370 <Field int IPoint.y>
	//*  74  158:aload_0         
	//*  75  159:invokevirtual   #732 <Method int getMapWidth()>
	//*  76  162:aload_0         
	//*  77  163:invokevirtual   #735 <Method int getMapHeight()>
	//*  78  166:invokestatic    #2183 <Method float fd.b(MapConfig, int, int, int, int, int, int)>
	//*  79  169:fstore_3        
	//*  80  170:aload_1         
	//*  81  171:invokevirtual   #2042 <Method float GLMapState.getMapZoomer()>
	//*  82  174:fstore          4
	//*  83  176:aload_0         
	//*  84  177:getfield        #322 <Field MapConfig c>
	//*  85  180:invokevirtual   #2186 <Method boolean MapConfig.isSetLimitZoomLevel()>
	//*  86  183:ifeq            411
	//*  87  186:aload_0         
	//*  88  187:getfield        #322 <Field MapConfig c>
	//*  89  190:invokevirtual   #1856 <Method float MapConfig.getMaxZoomLevel()>
	//*  90  193:fstore_2        
	//*  91  194:aload_0         
	//*  92  195:getfield        #322 <Field MapConfig c>
	//*  93  198:invokevirtual   #2121 <Method float MapConfig.getMinZoomLevel()>
	//*  94  201:fstore          5
	//*  95  203:fload_3         
	//*  96  204:fload_2         
	//*  97  205:fcmpl           
	//*  98  206:ifge            406
	//*  99  209:fload_3         
	//* 100  210:fload           5
	//* 101  212:fcmpg           
	//* 102  213:ifgt            219
	//* 103  216:goto            406
	//* 104  219:fload_3         
	//* 105  220:fload           4
	//* 106  222:fload_2         
	//* 107  223:invokestatic    #2189 <Method float Math.min(float, float)>
	//* 108  226:invokestatic    #2191 <Method float Math.max(float, float)>
	//* 109  229:fstore_2        
	//* 110  230:goto            408
	//* 111  233:aload_1         
	//* 112  234:fload_2         
	//* 113  235:invokevirtual   #1310 <Method void GLMapState.setMapZoomer(float)>
	//* 114  238:invokestatic    #829 <Method IPoint IPoint.obtain()>
	//* 115  241:astore          11
	//* 116  243:aload_1         
	//* 117  244:aload           11
	//* 118  246:invokevirtual   #2195 <Method void GLMapState.getMapGeoCenter(IPoint)>
	//* 119  249:aload           11
	//* 120  251:getfield        #1369 <Field int IPoint.x>
	//* 121  254:istore          8
	//* 122  256:aload           11
	//* 123  258:getfield        #1370 <Field int IPoint.y>
	//* 124  261:istore          9
	//* 125  263:aload           10
	//* 126  265:iconst_0        
	//* 127  266:aaload          
	//* 128  267:getfield        #1369 <Field int IPoint.x>
	//* 129  270:aload           10
	//* 130  272:iconst_0        
	//* 131  273:aaload          
	//* 132  274:getfield        #1370 <Field int IPoint.y>
	//* 133  277:aload           10
	//* 134  279:iconst_1        
	//* 135  280:aaload          
	//* 136  281:getfield        #1369 <Field int IPoint.x>
	//* 137  284:aload           10
	//* 138  286:iconst_1        
	//* 139  287:aaload          
	//* 140  288:getfield        #1370 <Field int IPoint.y>
	//* 141  291:aload_0         
	//* 142  292:getfield        #322 <Field MapConfig c>
	//* 143  295:aload_1         
	//* 144  296:iload           8
	//* 145  298:iload           9
	//* 146  300:invokestatic    #2198 <Method int[] fd.a(int, int, int, int, MapConfig, GLMapState, int, int)>
	//* 147  303:astore          10
	//* 148  305:iload           8
	//* 149  307:istore          7
	//* 150  309:iload           9
	//* 151  311:istore          6
	//* 152  313:aload           10
	//* 153  315:ifnull          345
	//* 154  318:iload           8
	//* 155  320:istore          7
	//* 156  322:iload           9
	//* 157  324:istore          6
	//* 158  326:aload           10
	//* 159  328:arraylength     
	//* 160  329:iconst_2        
	//* 161  330:icmpne          345
	//* 162  333:aload           10
	//* 163  335:iconst_0        
	//* 164  336:iaload          
	//* 165  337:istore          7
	//* 166  339:aload           10
	//* 167  341:iconst_1        
	//* 168  342:iaload          
	//* 169  343:istore          6
	//* 170  345:aload_1         
	//* 171  346:iload           7
	//* 172  348:iload           6
	//* 173  350:invokevirtual   #1326 <Method void GLMapState.setMapGeoCenter(int, int)>
	//* 174  353:aload           11
	//* 175  355:invokevirtual   #1178 <Method void IPoint.recycle()>
	//* 176  358:goto            403
	//* 177  361:aload_0         
	//* 178  362:getfield        #322 <Field MapConfig c>
	//* 179  365:invokevirtual   #2186 <Method boolean MapConfig.isSetLimitZoomLevel()>
	//* 180  368:ifeq            403
	//* 181  371:aload_1         
	//* 182  372:invokevirtual   #2042 <Method float GLMapState.getMapZoomer()>
	//* 183  375:fstore_2        
	//* 184  376:aload_0         
	//* 185  377:getfield        #322 <Field MapConfig c>
	//* 186  380:invokevirtual   #1856 <Method float MapConfig.getMaxZoomLevel()>
	//* 187  383:fstore_3        
	//* 188  384:aload_1         
	//* 189  385:aload_0         
	//* 190  386:getfield        #322 <Field MapConfig c>
	//* 191  389:invokevirtual   #2121 <Method float MapConfig.getMinZoomLevel()>
	//* 192  392:fload_2         
	//* 193  393:fload_3         
	//* 194  394:invokestatic    #2189 <Method float Math.min(float, float)>
	//* 195  397:invokestatic    #2191 <Method float Math.max(float, float)>
	//* 196  400:invokevirtual   #1310 <Method void GLMapState.setMapZoomer(float)>
	//* 197  403:return          
		// Misplaced declaration of an exception variable
		catch(GLMapState glmapstate)
	//* 198  404:astore_1        
		{
			return;
	//  199  405:return          
		}
		aobj = ((Object []) (aipoint));
		if(aipoint != null)
			break MISSING_BLOCK_LABEL_126;
		ipoint = IPoint.obtain();
		GLMapState.lonlat2Geo(latlngbounds.northeast.longitude, latlngbounds.northeast.latitude, ipoint);
		ipoint1 = IPoint.obtain();
		GLMapState.lonlat2Geo(latlngbounds.southwest.longitude, latlngbounds.southwest.latitude, ipoint1);
		aobj = ((Object []) (new IPoint[2]));
		aobj[0] = ipoint;
		aobj[1] = ipoint1;
		c.setLimitIPoints(((IPoint []) (aobj)));
		f2 = fd.b(c, aobj[0].x, aobj[0].y, aobj[1].x, aobj[1].y, getMapWidth(), getMapHeight());
		f3 = glmapstate.getMapZoomer();
		if(!c.isSetLimitZoomLevel()) goto _L4; else goto _L3
_L3:
		f1 = c.getMaxZoomLevel();
		f4 = c.getMinZoomLevel();
		if(f2 < f1 && f2 > f4) goto _L6; else goto _L5
_L6:
		f1 = Math.max(f2, Math.min(f3, f1));
_L9:
		glmapstate.setMapZoomer(f1);
		ipoint = IPoint.obtain();
		glmapstate.getMapGeoCenter(ipoint);
		k1 = ipoint.x;
		l1 = ipoint.y;
		aobj = ((Object []) (fd.a(aobj[0].x, aobj[0].y, aobj[1].x, aobj[1].y, c, glmapstate, k1, l1)));
		j1 = k1;
		i1 = l1;
		if(aobj == null)
			break MISSING_BLOCK_LABEL_345;
		j1 = k1;
		i1 = l1;
		if(aobj.length == 2)
		{
			j1 = aobj[0];
			i1 = aobj[1];
		}
		glmapstate.setMapGeoCenter(j1, i1);
		ipoint.recycle();
		  goto _L7
_L2:
		if(c.isSetLimitZoomLevel())
		{
			f1 = glmapstate.getMapZoomer();
			f2 = c.getMaxZoomLevel();
			glmapstate.setMapZoomer(Math.max(c.getMinZoomLevel(), Math.min(f1, f2)));
		}
_L7:
		return;
_L5:
		f1 = f2;
	//  200  406:fload_3         
	//  201  407:fstore_2        
		continue; /* Loop/switch isn't completed */
	//  202  408:goto            233
_L4:
		f1 = f3;
	//  203  411:fload           4
	//  204  413:fstore_2        
		if(f2 > 0.0F)
	//* 205  414:fload_3         
	//* 206  415:fconst_0        
	//* 207  416:fcmpl           
	//* 208  417:ifle            233
		{
			f1 = f3;
	//  209  420:fload           4
	//  210  422:fstore_2        
			if(f3 < f2)
	//* 211  423:fload           4
	//* 212  425:fload_3         
	//* 213  426:fcmpg           
	//* 214  427:ifge            233
				f1 = f2;
	//  215  430:fload_3         
	//  216  431:fstore_2        
		}
		if(true) goto _L9; else goto _L8
	//  217  432:goto            233
_L8:
	}

	public void clear()
		throws RemoteException
	{
		try
		{
			clear(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #2200 <Method void clear(boolean)>
			return;
	//    3    5:return          
		}
		catch(Throwable throwable)
	//*   4    6:astore_1        
		{
			hm.c(throwable, "AMapDelegateImp", "clear");
	//    5    7:aload_1         
	//    6    8:ldc2            #1165 <String "AMapDelegateImp">
	//    7   11:ldc2            #2201 <String "clear">
	//    8   14:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			return;
	//   11   21:return          
		}
	}

	public void clear(boolean flag)
		throws RemoteException
	{
		String s1;
		String s2;
		Object obj;
		Object obj1;
		try
		{
			i();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #2203 <Method void i()>
		}
	//*   2    4:aconst_null     
	//*   3    5:astore          4
	//*   4    7:aconst_null     
	//*   5    8:astore          5
	//*   6   10:aload           4
	//*   7   12:astore_2        
	//*   8   13:aload           5
	//*   9   15:astore_3        
	//*  10   16:aload_0         
	//*  11   17:getfield        #1635 <Field dk ab>
	//*  12   20:ifnull          59
	//*  13   23:iload_1         
	//*  14   24:ifeq            46
	//*  15   27:aload_0         
	//*  16   28:getfield        #1635 <Field dk ab>
	//*  17   31:invokevirtual   #2205 <Method String dk.c()>
	//*  18   34:astore_2        
	//*  19   35:aload_0         
	//*  20   36:getfield        #1635 <Field dk ab>
	//*  21   39:invokevirtual   #2207 <Method String dk.d()>
	//*  22   42:astore_3        
	//*  23   43:goto            59
	//*  24   46:aload_0         
	//*  25   47:getfield        #1635 <Field dk ab>
	//*  26   50:invokevirtual   #2209 <Method void dk.e()>
	//*  27   53:aload           5
	//*  28   55:astore_3        
	//*  29   56:aload           4
	//*  30   58:astore_2        
	//*  31   59:aload_0         
	//*  32   60:getfield        #589 <Field q S>
	//*  33   63:aload_3         
	//*  34   64:invokevirtual   #2211 <Method void q.b(String)>
	//*  35   67:aload_0         
	//*  36   68:getfield        #594 <Field af R>
	//*  37   71:invokevirtual   #2213 <Method void af.c()>
	//*  38   74:aload_0         
	//*  39   75:getfield        #599 <Field y b>
	//*  40   78:aload_2         
	//*  41   79:invokevirtual   #2214 <Method void y.a(String)>
	//*  42   82:aload_0         
	//*  43   83:getfield        #604 <Field n W>
	//*  44   86:invokevirtual   #2215 <Method void n.b()>
	//*  45   89:aload_0         
	//*  46   90:getfield        #570 <Field fq Q>
	//*  47   93:ifnull          103
	//*  48   96:aload_0         
	//*  49   97:getfield        #570 <Field fq Q>
	//*  50  100:invokevirtual   #2217 <Method void fq.k()>
	//*  51  103:aload_0         
	//*  52  104:getfield        #663 <Field bb aZ>
	//*  53  107:ifnull          117
	//*  54  110:aload_0         
	//*  55  111:getfield        #663 <Field bb aZ>
	//*  56  114:invokevirtual   #2218 <Method void bb.c()>
	//*  57  117:aload_0         
	//*  58  118:invokevirtual   #891 <Method void resetRenderTime()>
	//*  59  121:return          
		catch(Throwable throwable)
	//*  60  122:astore_2        
		{
			hm.c(throwable, "AMapDelegateImp", "clear");
	//   61  123:aload_2         
	//   62  124:ldc2            #1165 <String "AMapDelegateImp">
	//   63  127:ldc2            #2201 <String "clear">
	//   64  130:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//   65  133:aload_2         
	//   66  134:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			return;
	//   67  137:return          
		}
		obj = null;
		obj1 = null;
		s1 = ((String) (obj));
		s2 = ((String) (obj1));
		if(ab == null)
			break MISSING_BLOCK_LABEL_59;
		if(!flag)
			break MISSING_BLOCK_LABEL_46;
		s1 = ab.c();
		s2 = ab.d();
		break MISSING_BLOCK_LABEL_59;
		ab.e();
		s2 = ((String) (obj1));
		s1 = ((String) (obj));
		S.b(s2);
		R.c();
		b.a(s1);
		W.b();
		if(Q != null)
			Q.k();
		if(aZ != null)
			aZ.c();
		resetRenderTime();
		return;
	}

	public long createGLOverlay(int i1)
	{
		long l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_2        
		if(f != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #545 <Field GLMapEngine f>
	//*   4    6:ifnull          19
			l1 = f.createOverlay(1, i1);
	//    5    9:aload_0         
	//    6   10:getfield        #545 <Field GLMapEngine f>
	//    7   13:iconst_1        
	//    8   14:iload_1         
	//    9   15:invokevirtual   #2224 <Method long GLMapEngine.createOverlay(int, int)>
	//   10   18:lstore_2        
		return l1;
	//   11   19:lload_2         
	//   12   20:lreturn         
	}

	public void createSurface(GL10 gl10, EGLConfig eglconfig)
	{
		try
		{
			a(1, gl10, eglconfig);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #1526 <Method void a(int, GL10, EGLConfig)>
			return;
	//    5    7:return          
		}
		// Misplaced declaration of an exception variable
		catch(GL10 gl10)
	//*   6    8:astore_1        
		{
			((Throwable) (gl10)).printStackTrace();
	//    7    9:aload_1         
	//    8   10:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
	//    9   13:return          
	}

	public int d()
	{
		if(aY != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #673 <Field r aY>
	//*   2    4:ifnull          15
			return aY.a();
	//    3    7:aload_0         
	//    4    8:getfield        #673 <Field r aY>
	//    5   11:invokevirtual   #2225 <Method int r.a()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public String d(String s1)
	{
		if(S != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #589 <Field q S>
	//*   2    4:ifnull          16
			return S.a(s1);
	//    3    7:aload_0         
	//    4    8:getfield        #589 <Field q S>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #2228 <Method String q.a(String)>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public void d(int i1, boolean flag)
	{
		if(aO && aP)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            33
	//*   3    7:aload_0         
	//*   4    8:getfield        #392 <Field boolean aP>
	//*   5   11:ifeq            33
		{
			resetRenderTime();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #891 <Method void resetRenderTime()>
			queueEvent(new Runnable(flag, i1) {

				public void run()
				{
					if(c.f != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field b c>
				//*   2    4:getfield        #34  <Field GLMapEngine b.f>
				//*   3    7:ifnull          119
					{
						if(a)
				//*   4   10:aload_0         
				//*   5   11:getfield        #23  <Field boolean a>
				//*   6   14:ifeq            62
						{
							c.f.setParamater(b, 2702, -1, 1, 0, 0);
				//    7   17:aload_0         
				//    8   18:getfield        #21  <Field b c>
				//    9   21:getfield        #34  <Field GLMapEngine b.f>
				//   10   24:aload_0         
				//   11   25:getfield        #25  <Field int b>
				//   12   28:sipush          2702
				//   13   31:iconst_m1       
				//   14   32:iconst_1        
				//   15   33:iconst_0        
				//   16   34:iconst_0        
				//   17   35:invokevirtual   #40  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
							c.f.setParamater(b, 1024, 1, 0, 0, 0);
				//   18   38:aload_0         
				//   19   39:getfield        #21  <Field b c>
				//   20   42:getfield        #34  <Field GLMapEngine b.f>
				//   21   45:aload_0         
				//   22   46:getfield        #25  <Field int b>
				//   23   49:sipush          1024
				//   24   52:iconst_1        
				//   25   53:iconst_0        
				//   26   54:iconst_0        
				//   27   55:iconst_0        
				//   28   56:invokevirtual   #40  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
						} else
				//*  29   59:goto            104
						{
							c.f.setParamater(b, 2702, -1, 0, 0, 0);
				//   30   62:aload_0         
				//   31   63:getfield        #21  <Field b c>
				//   32   66:getfield        #34  <Field GLMapEngine b.f>
				//   33   69:aload_0         
				//   34   70:getfield        #25  <Field int b>
				//   35   73:sipush          2702
				//   36   76:iconst_m1       
				//   37   77:iconst_0        
				//   38   78:iconst_0        
				//   39   79:iconst_0        
				//   40   80:invokevirtual   #40  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
							c.f.setParamater(b, 1024, 0, 0, 0, 0);
				//   41   83:aload_0         
				//   42   84:getfield        #21  <Field b c>
				//   43   87:getfield        #34  <Field GLMapEngine b.f>
				//   44   90:aload_0         
				//   45   91:getfield        #25  <Field int b>
				//   46   94:sipush          1024
				//   47   97:iconst_0        
				//   48   98:iconst_0        
				//   49   99:iconst_0        
				//   50  100:iconst_0        
				//   51  101:invokevirtual   #40  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
						}
						c.f.setSimple3DEnable(b, false);
				//   52  104:aload_0         
				//   53  105:getfield        #21  <Field b c>
				//   54  108:getfield        #34  <Field GLMapEngine b.f>
				//   55  111:aload_0         
				//   56  112:getfield        #25  <Field int b>
				//   57  115:iconst_0        
				//   58  116:invokevirtual   #43  <Method void GLMapEngine.setSimple3DEnable(int, boolean)>
					}
				//   59  119:return          
				}

				final boolean a;
				final int b;
				final com.amap.api.mapcore.util.b c;

			
			{
				c = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field b c>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field boolean a>
				b = i1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    8   18:aload_0         
	//    9   19:new             #42  <Class b$23>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:iload_2         
	//   13   25:iload_1         
	//   14   26:invokespecial   #2229 <Method void b$23(b, boolean, int)>
	//   15   29:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   16   32:return          
		} else
		{
			bk.c = flag;
	//   17   33:aload_0         
	//   18   34:getfield        #449 <Field b$a bk>
	//   19   37:iload_2         
	//   20   38:putfield        #1632 <Field boolean b$a.c>
			bk.b = true;
	//   21   41:aload_0         
	//   22   42:getfield        #449 <Field b$a bk>
	//   23   45:iconst_1        
	//   24   46:putfield        #1468 <Field boolean b$a.b>
			bk.g = i1;
	//   25   49:aload_0         
	//   26   50:getfield        #449 <Field b$a bk>
	//   27   53:iload_1         
	//   28   54:putfield        #1460 <Field int b$a.g>
			return;
	//   29   57:return          
		}
	}

	public void d(boolean flag)
	{
		if(!V && Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifne            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #570 <Field fq Q>
	//*   5   11:ifnull          22
			Q.d(flag);
	//    6   14:aload_0         
	//    7   15:getfield        #570 <Field fq Q>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #2231 <Method void fq.d(boolean)>
	//   10   22:return          
	}

	public boolean d(int i1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void destroy()
	{
		V = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #313 <Field boolean V>
		if(aC != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #508 <Field f aC>
	//*   5    9:ifnull          19
			aC.a();
	//    6   12:aload_0         
	//    7   13:getfield        #508 <Field f aC>
	//    8   16:invokevirtual   #2237 <Method void f.a()>
		if(aZ != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #663 <Field bb aZ>
	//*  11   23:ifnull          33
			aZ.b();
	//   12   26:aload_0         
	//   13   27:getfield        #663 <Field bb aZ>
	//   14   30:invokevirtual   #2238 <Method void bb.b()>
		if(ac != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #658 <Field LocationSource ac>
	//*  17   37:ifnull          49
			ac.deactivate();
	//   18   40:aload_0         
	//   19   41:getfield        #658 <Field LocationSource ac>
	//   20   44:invokeinterface #2243 <Method void LocationSource.deactivate()>
		ac = null;
	//   21   49:aload_0         
	//   22   50:aconst_null     
	//   23   51:putfield        #658 <Field LocationSource ac>
		aW = null;
	//   24   54:aload_0         
	//   25   55:aconst_null     
	//   26   56:putfield        #584 <Field b$b aW>
		if(aD != null)
	//*  27   59:aload_0         
	//*  28   60:getfield        #552 <Field GLMapRender aD>
	//*  29   63:ifnull          73
			aD.renderPause();
	//   30   66:aload_0         
	//   31   67:getfield        #552 <Field GLMapRender aD>
	//   32   70:invokevirtual   #2246 <Method void GLMapRender.renderPause()>
		if(aY != null)
	//*  33   73:aload_0         
	//*  34   74:getfield        #673 <Field r aY>
	//*  35   77:ifnull          87
			aY.d();
	//   36   80:aload_0         
	//   37   81:getfield        #673 <Field r aY>
	//   38   84:invokevirtual   #2248 <Method void r.d()>
		if(aE != null)
	//*  39   87:aload_0         
	//*  40   88:getfield        #538 <Field o aE>
	//*  41   91:ifnull          114
		{
			aE.a(((AMapGestureListener) (null)));
	//   42   94:aload_0         
	//   43   95:getfield        #538 <Field o aE>
	//   44   98:aconst_null     
	//   45   99:invokevirtual   #2251 <Method void o.a(AMapGestureListener)>
			aE.b();
	//   46  102:aload_0         
	//   47  103:getfield        #538 <Field o aE>
	//   48  106:invokevirtual   #2252 <Method void o.b()>
			aE = null;
	//   49  109:aload_0         
	//   50  110:aconst_null     
	//   51  111:putfield        #538 <Field o aE>
		}
		if(S != null)
	//*  52  114:aload_0         
	//*  53  115:getfield        #589 <Field q S>
	//*  54  118:ifnull          128
			S.c();
	//   55  121:aload_0         
	//   56  122:getfield        #589 <Field q S>
	//   57  125:invokevirtual   #2253 <Method void q.c()>
		if(b != null)
	//*  58  128:aload_0         
	//*  59  129:getfield        #599 <Field y b>
	//*  60  132:ifnull          142
			b.j();
	//   61  135:aload_0         
	//   62  136:getfield        #599 <Field y b>
	//   63  139:invokevirtual   #2254 <Method void y.j()>
		if(R != null)
	//*  64  142:aload_0         
	//*  65  143:getfield        #594 <Field af R>
	//*  66  146:ifnull          156
			R.f();
	//   67  149:aload_0         
	//   68  150:getfield        #594 <Field af R>
	//   69  153:invokevirtual   #2256 <Method void af.f()>
		A();
	//   70  156:aload_0         
	//   71  157:invokespecial   #2258 <Method void A()>
		if(ap != null)
	//*  72  160:aload_0         
	//*  73  161:getfield        #653 <Field Thread ap>
	//*  74  164:ifnull          179
		{
			ap.interrupt();
	//   75  167:aload_0         
	//   76  168:getfield        #653 <Field Thread ap>
	//   77  171:invokevirtual   #2261 <Method void Thread.interrupt()>
			ap = null;
	//   78  174:aload_0         
	//   79  175:aconst_null     
	//   80  176:putfield        #653 <Field Thread ap>
		}
		if(aq != null)
	//*  81  179:aload_0         
	//*  82  180:getfield        #804 <Field Thread aq>
	//*  83  183:ifnull          198
		{
			aq.interrupt();
	//   84  186:aload_0         
	//   85  187:getfield        #804 <Field Thread aq>
	//   86  190:invokevirtual   #2261 <Method void Thread.interrupt()>
			aq = null;
	//   87  193:aload_0         
	//   88  194:aconst_null     
	//   89  195:putfield        #804 <Field Thread aq>
		}
		if(aA != null)
	//*  90  198:aload_0         
	//*  91  199:getfield        #678 <Field du aA>
	//*  92  202:ifnull          217
		{
			aA.a();
	//   93  205:aload_0         
	//   94  206:getfield        #678 <Field du aA>
	//   95  209:invokevirtual   #2262 <Method void du.a()>
			aA = null;
	//   96  212:aload_0         
	//   97  213:aconst_null     
	//   98  214:putfield        #678 <Field du aA>
		}
		if(aB != null)
	//*  99  217:aload_0         
	//* 100  218:getfield        #683 <Field dw aB>
	//* 101  221:ifnull          244
		{
			aB.a(((dw.a) (null)));
	//  102  224:aload_0         
	//  103  225:getfield        #683 <Field dw aB>
	//  104  228:aconst_null     
	//  105  229:invokevirtual   #686 <Method void dw.a(dw$a)>
			aB.a();
	//  106  232:aload_0         
	//  107  233:getfield        #683 <Field dw aB>
	//  108  236:invokevirtual   #2263 <Method void dw.a()>
			aB = null;
	//  109  239:aload_0         
	//  110  240:aconst_null     
	//  111  241:putfield        #683 <Field dw aB>
		}
		eo.b();
	//  112  244:invokestatic    #2264 <Method void eo.b()>
		if(f == null) goto _L2; else goto _L1
	//  113  247:aload_0         
	//  114  248:getfield        #545 <Field GLMapEngine f>
	//  115  251:ifnull          319
_L1:
		f.setMapListener(((IAMapListener) (null)));
	//  116  254:aload_0         
	//  117  255:getfield        #545 <Field GLMapEngine f>
	//  118  258:aconst_null     
	//  119  259:invokevirtual   #617 <Method void GLMapEngine.setMapListener(IAMapListener)>
		f.releaseNetworkState();
	//  120  262:aload_0         
	//  121  263:getfield        #545 <Field GLMapEngine f>
	//  122  266:invokevirtual   #2267 <Method void GLMapEngine.releaseNetworkState()>
		queueEvent(new Runnable() {

			public void run()
			{
				try
				{
					if(com.amap.api.mapcore.util.b.w(a) != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field b a>
			//*   2    4:invokestatic    #27  <Method r b.w(b)>
			//*   3    7:ifnull          20
						com.amap.api.mapcore.util.b.w(a).c();
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field b a>
			//    6   14:invokestatic    #27  <Method r b.w(b)>
			//    7   17:invokevirtual   #32  <Method void r.c()>
					com.amap.api.mapcore.util.b.x(a).a();
			//    8   20:aload_0         
			//    9   21:getfield        #17  <Field b a>
			//   10   24:invokestatic    #36  <Method ds b.x(b)>
			//   11   27:invokevirtual   #40  <Method void ds.a()>
					com.amap.api.mapcore.util.b.a(a, ((ds) (null)));
			//   12   30:aload_0         
			//   13   31:getfield        #17  <Field b a>
			//   14   34:aconst_null     
			//   15   35:invokestatic    #43  <Method ds b.a(b, ds)>
			//   16   38:pop             
					a.f.destroyAMapEngine();
			//   17   39:aload_0         
			//   18   40:getfield        #17  <Field b a>
			//   19   43:getfield        #47  <Field GLMapEngine b.f>
			//   20   46:invokevirtual   #52  <Method void GLMapEngine.destroyAMapEngine()>
					a.f = null;
			//   21   49:aload_0         
			//   22   50:getfield        #17  <Field b a>
			//   23   53:aconst_null     
			//   24   54:putfield        #47  <Field GLMapEngine b.f>
					com.amap.api.mapcore.util.b.y(a).d();
			//   25   57:aload_0         
			//   26   58:getfield        #17  <Field b a>
			//   27   61:invokestatic    #56  <Method n b.y(b)>
			//   28   64:invokevirtual   #61  <Method void n.d()>
					return;
			//   29   67:return          
				}
				catch(Throwable throwable1)
			//*  30   68:astore_1        
				{
					throwable1.printStackTrace();
			//   31   69:aload_1         
			//   32   70:invokevirtual   #64  <Method void Throwable.printStackTrace()>
				}
			//   33   73:return          
			}

			final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  123  269:aload_0         
	//  124  270:new             #76  <Class b$38>
	//  125  273:dup             
	//  126  274:aload_0         
	//  127  275:invokespecial   #2268 <Method void b$38(b)>
	//  128  278:invokevirtual   #1058 <Method void queueEvent(Runnable)>
		int i1 = 0;
	//  129  281:iconst_0        
	//  130  282:istore_1        
_L3:
		int j1;
		Object obj;
		Object obj1;
		try
		{
			obj = ((Object) (f));
	//  131  283:aload_0         
	//  132  284:getfield        #545 <Field GLMapEngine f>
	//  133  287:astore_3        
		}
	//* 134  288:aload_3         
	//* 135  289:ifnull          319
	//* 136  292:iload_1         
	//* 137  293:iconst_1        
	//* 138  294:iadd            
	//* 139  295:istore_2        
	//* 140  296:iload_1         
	//* 141  297:bipush          20
	//* 142  299:icmpge          319
	//* 143  302:ldc2w           #2269 <Long 50L>
	//* 144  305:invokestatic    #2274 <Method void Thread.sleep(long)>
	//* 145  308:iload_2         
	//* 146  309:istore_1        
	//* 147  310:goto            283
	//* 148  313:astore_3        
	//* 149  314:iload_2         
	//* 150  315:istore_1        
	//* 151  316:goto            283
	//* 152  319:aload_0         
	//* 153  320:getfield        #604 <Field n W>
	//* 154  323:ifnull          333
	//* 155  326:aload_0         
	//* 156  327:getfield        #604 <Field n W>
	//* 157  330:invokevirtual   #2275 <Method void n.c()>
	//* 158  333:aload_0         
	//* 159  334:getfield        #638 <Field aw J>
	//* 160  337:ifnull          347
	//* 161  340:aload_0         
	//* 162  341:getfield        #638 <Field aw J>
	//* 163  344:invokevirtual   #2276 <Method void aw.b()>
	//* 164  347:aload_0         
	//* 165  348:getfield        #554 <Field t P>
	//* 166  351:astore_3        
	//* 167  352:aload_3         
	//* 168  353:ifnull          373
	//* 169  356:aload_0         
	//* 170  357:getfield        #554 <Field t P>
	//* 171  360:invokeinterface #2277 <Method void t.b()>
	//* 172  365:goto            373
	//* 173  368:astore_3        
	//* 174  369:aload_3         
	//* 175  370:invokevirtual   #2278 <Method void Exception.printStackTrace()>
	//* 176  373:aload_0         
	//* 177  374:getfield        #570 <Field fq Q>
	//* 178  377:ifnull          392
	//* 179  380:aload_0         
	//* 180  381:getfield        #570 <Field fq Q>
	//* 181  384:invokevirtual   #2279 <Method void fq.j()>
	//* 182  387:aload_0         
	//* 183  388:aconst_null     
	//* 184  389:putfield        #570 <Field fq Q>
	//* 185  392:aload_0         
	//* 186  393:getfield        #1635 <Field dk ab>
	//* 187  396:ifnull          411
	//* 188  399:aload_0         
	//* 189  400:getfield        #1635 <Field dk ab>
	//* 190  403:invokevirtual   #1639 <Method void dk.b()>
	//* 191  406:aload_0         
	//* 192  407:aconst_null     
	//* 193  408:putfield        #1635 <Field dk ab>
	//* 194  411:aload_0         
	//* 195  412:aconst_null     
	//* 196  413:putfield        #658 <Field LocationSource ac>
	//* 197  416:aload_0         
	//* 198  417:invokespecial   #2281 <Method void G()>
	//* 199  420:aload_0         
	//* 200  421:aconst_null     
	//* 201  422:putfield        #353 <Field MyTrafficStyle ao>
	//* 202  425:invokestatic    #2282 <Method void hm.b()>
	//* 203  428:return          
		catch(Throwable throwable)
	//* 204  429:astore_3        
		{
			hm.c(throwable, "AMapDelegateImp", "destroy");
	//  205  430:aload_3         
	//  206  431:ldc2            #1165 <String "AMapDelegateImp">
	//  207  434:ldc2            #2283 <String "destroy">
	//  208  437:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//  209  440:aload_3         
	//  210  441:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			return;
	//  211  444:return          
		}
		if(obj == null)
			break; /* Loop/switch isn't completed */
		j1 = i1 + 1;
		if(i1 >= 20)
			break; /* Loop/switch isn't completed */
		Thread.sleep(50L);
		i1 = j1;
		continue; /* Loop/switch isn't completed */
		obj1;
		i1 = j1;
		if(true) goto _L3; else goto _L2
_L2:
		if(W != null)
			W.c();
		if(J != null)
			J.b();
		obj1 = ((Object) (P));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_373;
		P.b();
		break MISSING_BLOCK_LABEL_373;
		obj1;
		((Exception) (obj1)).printStackTrace();
		if(Q != null)
		{
			Q.j();
			Q = null;
		}
		if(ab != null)
		{
			ab.b();
			ab = null;
		}
		ac = null;
		G();
		ao = null;
		hm.b();
		return;
	}

	public void destroySurface(int i1)
	{
		aS.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #401 <Field Lock aS>
	//    2    4:invokeinterface #2289 <Method void Lock.lock()>
		try
		{
			if(aO)
	//*   3    9:aload_0         
	//*   4   10:getfield        #390 <Field boolean aO>
	//*   5   13:ifeq            23
				f.destroyAMapEngine();
	//    6   16:aload_0         
	//    7   17:getfield        #545 <Field GLMapEngine f>
	//    8   20:invokevirtual   #2292 <Method void GLMapEngine.destroyAMapEngine()>
			aO = false;
	//    9   23:aload_0         
	//   10   24:iconst_0        
	//   11   25:putfield        #390 <Field boolean aO>
			aP = false;
	//   12   28:aload_0         
	//   13   29:iconst_0        
	//   14   30:putfield        #392 <Field boolean aP>
			aR = false;
	//   15   33:aload_0         
	//   16   34:iconst_0        
	//   17   35:putfield        #396 <Field boolean aR>
		}
	//*  18   38:aload_0         
	//*  19   39:getfield        #401 <Field Lock aS>
	//*  20   42:invokeinterface #2295 <Method void Lock.unlock()>
	//*  21   47:return          
		catch(Throwable throwable)
	//*  22   48:astore_2        
		{
			aS.unlock();
	//   23   49:aload_0         
	//   24   50:getfield        #401 <Field Lock aS>
	//   25   53:invokeinterface #2295 <Method void Lock.unlock()>
			return;
	//   26   58:return          
		}
		aS.unlock();
		return;
		Exception exception;
		exception;
	//   27   59:astore_2        
		aS.unlock();
	//   28   60:aload_0         
	//   29   61:getfield        #401 <Field Lock aS>
	//   30   64:invokeinterface #2295 <Method void Lock.unlock()>
		throw exception;
	//   31   69:aload_2         
	//   32   70:athrow          
	}

	public void drawFrame(GL10 gl10)
	{
		if(V || f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #545 <Field GLMapEngine f>
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		a(1, gl10);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:aload_1         
	//   10   18:invokespecial   #2298 <Method void a(int, GL10)>
		f.renderAMap();
	//   11   21:aload_0         
	//   12   22:getfield        #545 <Field GLMapEngine f>
	//   13   25:invokevirtual   #2301 <Method void GLMapEngine.renderAMap()>
		f.pushRendererState();
	//   14   28:aload_0         
	//   15   29:getfield        #545 <Field GLMapEngine f>
	//   16   32:invokevirtual   #2048 <Method void GLMapEngine.pushRendererState()>
		if(av != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #1579 <Field CustomRenderer av>
	//*  19   39:ifnull          52
			av.onDrawFrame(gl10);
	//   20   42:aload_0         
	//   21   43:getfield        #1579 <Field CustomRenderer av>
	//   22   46:aload_1         
	//   23   47:invokeinterface #2304 <Method void CustomRenderer.onDrawFrame(GL10)>
		a(gl10);
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:invokespecial   #2306 <Method void a(GL10)>
		C();
	//   27   57:aload_0         
	//   28   58:invokespecial   #2308 <Method void C()>
		if(!aQ)
	//*  29   61:aload_0         
	//*  30   62:getfield        #394 <Field boolean aQ>
	//*  31   65:ifne            73
			aQ = true;
	//   32   68:aload_0         
	//   33   69:iconst_1        
	//   34   70:putfield        #394 <Field boolean aQ>
		f.popRendererState();
	//   35   73:aload_0         
	//   36   74:getfield        #545 <Field GLMapEngine f>
	//   37   77:invokevirtual   #2069 <Method void GLMapEngine.popRendererState()>
		if(aC != null)
	//*  38   80:aload_0         
	//*  39   81:getfield        #508 <Field f aC>
	//*  40   84:ifnull          104
			aC.a(new aa(153));
	//   41   87:aload_0         
	//   42   88:getfield        #508 <Field f aC>
	//   43   91:new             #1554 <Class aa>
	//   44   94:dup             
	//   45   95:sipush          153
	//   46   98:invokespecial   #1556 <Method void aa(int)>
	//   47  101:invokevirtual   #1559 <Method void f.a(aa)>
	//   48  104:return          
	}

	public int e()
	{
		if(aY != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #673 <Field r aY>
	//*   2    4:ifnull          15
			return aY.b();
	//    3    7:aload_0         
	//    4    8:getfield        #673 <Field r aY>
	//    5   11:invokevirtual   #2310 <Method int r.b()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void e(int i1, boolean flag)
	{
		if(aO && aP)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            33
	//*   3    7:aload_0         
	//*   4    8:getfield        #392 <Field boolean aP>
	//*   5   11:ifeq            33
		{
			resetRenderTime();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #891 <Method void resetRenderTime()>
			queueEvent(new Runnable(flag, i1) {

				public void run()
				{
					try
					{
						if(a)
				//*   0    0:aload_0         
				//*   1    1:getfield        #23  <Field boolean a>
				//*   2    4:ifeq            31
						{
							c.f.setParamater(b, 2017, 1, 0, 0, 0);
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field b c>
				//    5   11:getfield        #36  <Field GLMapEngine b.f>
				//    6   14:aload_0         
				//    7   15:getfield        #25  <Field int b>
				//    8   18:sipush          2017
				//    9   21:iconst_1        
				//   10   22:iconst_0        
				//   11   23:iconst_0        
				//   12   24:iconst_0        
				//   13   25:invokevirtual   #42  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
							break MISSING_BLOCK_LABEL_52;
				//   14   28:goto            52
						}
					}
				//*  15   31:aload_0         
				//*  16   32:getfield        #21  <Field b c>
				//*  17   35:getfield        #36  <Field GLMapEngine b.f>
				//*  18   38:aload_0         
				//*  19   39:getfield        #25  <Field int b>
				//*  20   42:sipush          2017
				//*  21   45:iconst_0        
				//*  22   46:iconst_0        
				//*  23   47:iconst_0        
				//*  24   48:iconst_0        
				//*  25   49:invokevirtual   #42  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				//*  26   52:return          
					catch(Throwable throwable)
				//*  27   53:astore_1        
					{
						throwable.printStackTrace();
				//   28   54:aload_1         
				//   29   55:invokevirtual   #45  <Method void Throwable.printStackTrace()>
						return;
				//   30   58:return          
					}
					c.f.setParamater(b, 2017, 0, 0, 0, 0);
				}

				final boolean a;
				final int b;
				final com.amap.api.mapcore.util.b c;

			
			{
				c = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field b c>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field boolean a>
				b = i1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    8   18:aload_0         
	//    9   19:new             #44  <Class b$24>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:iload_2         
	//   13   25:iload_1         
	//   14   26:invokespecial   #2311 <Method void b$24(b, boolean, int)>
	//   15   29:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   16   32:return          
		} else
		{
			bi.c = flag;
	//   17   33:aload_0         
	//   18   34:getfield        #443 <Field b$a bi>
	//   19   37:iload_2         
	//   20   38:putfield        #1632 <Field boolean b$a.c>
			bi.b = true;
	//   21   41:aload_0         
	//   22   42:getfield        #443 <Field b$a bi>
	//   23   45:iconst_1        
	//   24   46:putfield        #1468 <Field boolean b$a.b>
			bi.g = i1;
	//   25   49:aload_0         
	//   26   50:getfield        #443 <Field b$a bi>
	//   27   53:iload_1         
	//   28   54:putfield        #1460 <Field int b$a.g>
			return;
	//   29   57:return          
		}
	}

	public void e(boolean flag)
	{
		if(!V && Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifne            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #570 <Field fq Q>
	//*   5   11:ifnull          22
			Q.e(flag);
	//    6   14:aload_0         
	//    7   15:getfield        #570 <Field fq Q>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #2313 <Method void fq.e(boolean)>
	//   10   22:return          
	}

	public boolean e(int i1)
	{
		return c(i1, 7);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          7
	//    3    4:invokespecial   #1547 <Method boolean c(int, int)>
	//    4    7:ireturn         
	}

	public int f(int i1)
	{
		if(aY != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #673 <Field r aY>
	//*   2    4:ifnull          16
			return aY.a(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #673 <Field r aY>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #2315 <Method int r.a(int)>
	//    7   15:ireturn         
		else
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public CameraPosition f(boolean flag)
	{
		Object obj;
		Object obj1;
		try
		{
			obj = ((Object) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:astore_2        
		}
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
	//*   5    9:aconst_null     
	//*   6   10:areturn         
	//*   7   11:aload_0         
	//*   8   12:getfield        #390 <Field boolean aO>
	//*   9   15:ifeq            131
	//*  10   18:aload_0         
	//*  11   19:getfield        #315 <Field boolean Y>
	//*  12   22:ifne            131
	//*  13   25:aload_0         
	//*  14   26:getfield        #545 <Field GLMapEngine f>
	//*  15   29:ifnull          131
	//*  16   32:iload_1         
	//*  17   33:ifeq            83
	//*  18   36:invokestatic    #941 <Method DPoint DPoint.obtain()>
	//*  19   39:astore_3        
	//*  20   40:aload_0         
	//*  21   41:aload_0         
	//*  22   42:getfield        #322 <Field MapConfig c>
	//*  23   45:invokevirtual   #1087 <Method int MapConfig.getAnchorX()>
	//*  24   48:aload_0         
	//*  25   49:getfield        #322 <Field MapConfig c>
	//*  26   52:invokevirtual   #1093 <Method int MapConfig.getAnchorY()>
	//*  27   55:aload_3         
	//*  28   56:invokevirtual   #944 <Method void b(int, int, DPoint)>
	//*  29   59:new             #837 <Class LatLng>
	//*  30   62:dup             
	//*  31   63:aload_3         
	//*  32   64:getfield        #946 <Field double DPoint.y>
	//*  33   67:aload_3         
	//*  34   68:getfield        #948 <Field double DPoint.x>
	//*  35   71:iconst_0        
	//*  36   72:invokespecial   #1043 <Method void LatLng(double, double, boolean)>
	//*  37   75:astore_2        
	//*  38   76:aload_3         
	//*  39   77:invokevirtual   #952 <Method void DPoint.recycle()>
	//*  40   80:goto            88
	//*  41   83:aload_0         
	//*  42   84:invokespecial   #2318 <Method LatLng z()>
	//*  43   87:astore_2        
	//*  44   88:invokestatic    #2321 <Method com.amap.api.maps.model.CameraPosition$Builder CameraPosition.builder()>
	//*  45   91:aload_2         
	//*  46   92:invokevirtual   #2327 <Method com.amap.api.maps.model.CameraPosition$Builder com.amap.api.maps.model.CameraPosition$Builder.target(LatLng)>
	//*  47   95:aload_0         
	//*  48   96:getfield        #322 <Field MapConfig c>
	//*  49   99:invokevirtual   #1319 <Method float MapConfig.getSR()>
	//*  50  102:invokevirtual   #2330 <Method com.amap.api.maps.model.CameraPosition$Builder com.amap.api.maps.model.CameraPosition$Builder.bearing(float)>
	//*  51  105:aload_0         
	//*  52  106:getfield        #322 <Field MapConfig c>
	//*  53  109:invokevirtual   #1313 <Method float MapConfig.getSC()>
	//*  54  112:invokevirtual   #2332 <Method com.amap.api.maps.model.CameraPosition$Builder com.amap.api.maps.model.CameraPosition$Builder.tilt(float)>
	//*  55  115:aload_0         
	//*  56  116:getfield        #322 <Field MapConfig c>
	//*  57  119:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//*  58  122:invokevirtual   #2334 <Method com.amap.api.maps.model.CameraPosition$Builder com.amap.api.maps.model.CameraPosition$Builder.zoom(float)>
	//*  59  125:invokevirtual   #2336 <Method CameraPosition com.amap.api.maps.model.CameraPosition$Builder.build()>
	//*  60  128:astore_2        
	//*  61  129:aload_2         
	//*  62  130:areturn         
	//*  63  131:invokestatic    #941 <Method DPoint DPoint.obtain()>
	//*  64  134:astore_2        
	//*  65  135:aload_0         
	//*  66  136:aload_0         
	//*  67  137:getfield        #322 <Field MapConfig c>
	//*  68  140:invokevirtual   #748 <Method int MapConfig.getSX()>
	//*  69  143:aload_0         
	//*  70  144:getfield        #322 <Field MapConfig c>
	//*  71  147:invokevirtual   #751 <Method int MapConfig.getSY()>
	//*  72  150:aload_2         
	//*  73  151:invokevirtual   #2338 <Method void a(int, int, DPoint)>
	//*  74  154:new             #837 <Class LatLng>
	//*  75  157:dup             
	//*  76  158:aload_2         
	//*  77  159:getfield        #946 <Field double DPoint.y>
	//*  78  162:aload_2         
	//*  79  163:getfield        #948 <Field double DPoint.x>
	//*  80  166:invokespecial   #951 <Method void LatLng(double, double)>
	//*  81  169:astore_3        
	//*  82  170:aload_2         
	//*  83  171:invokevirtual   #952 <Method void DPoint.recycle()>
	//*  84  174:invokestatic    #2321 <Method com.amap.api.maps.model.CameraPosition$Builder CameraPosition.builder()>
	//*  85  177:aload_3         
	//*  86  178:invokevirtual   #2327 <Method com.amap.api.maps.model.CameraPosition$Builder com.amap.api.maps.model.CameraPosition$Builder.target(LatLng)>
	//*  87  181:aload_0         
	//*  88  182:getfield        #322 <Field MapConfig c>
	//*  89  185:invokevirtual   #1319 <Method float MapConfig.getSR()>
	//*  90  188:invokevirtual   #2330 <Method com.amap.api.maps.model.CameraPosition$Builder com.amap.api.maps.model.CameraPosition$Builder.bearing(float)>
	//*  91  191:aload_0         
	//*  92  192:getfield        #322 <Field MapConfig c>
	//*  93  195:invokevirtual   #1313 <Method float MapConfig.getSC()>
	//*  94  198:invokevirtual   #2332 <Method com.amap.api.maps.model.CameraPosition$Builder com.amap.api.maps.model.CameraPosition$Builder.tilt(float)>
	//*  95  201:aload_0         
	//*  96  202:getfield        #322 <Field MapConfig c>
	//*  97  205:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//*  98  208:invokevirtual   #2334 <Method com.amap.api.maps.model.CameraPosition$Builder com.amap.api.maps.model.CameraPosition$Builder.zoom(float)>
	//*  99  211:invokevirtual   #2336 <Method CameraPosition com.amap.api.maps.model.CameraPosition$Builder.build()>
	//* 100  214:astore_2        
	//* 101  215:aload_2         
	//* 102  216:areturn         
		catch(Throwable throwable)
	//* 103  217:astore_2        
		{
			throwable.printStackTrace();
	//  104  218:aload_2         
	//  105  219:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			return null;
	//  106  222:aconst_null     
	//  107  223:areturn         
		}
		if(obj == null)
			return null;
		if(!aO || Y || f == null)
			break MISSING_BLOCK_LABEL_131;
		if(!flag)
			break MISSING_BLOCK_LABEL_83;
		obj1 = ((Object) (DPoint.obtain()));
		b(c.getAnchorX(), c.getAnchorY(), ((DPoint) (obj1)));
		obj = ((Object) (new LatLng(((DPoint) (obj1)).y, ((DPoint) (obj1)).x, false)));
		((DPoint) (obj1)).recycle();
		break MISSING_BLOCK_LABEL_88;
		obj = ((Object) (z()));
		obj = ((Object) (CameraPosition.builder().target(((LatLng) (obj))).bearing(c.getSR()).tilt(c.getSC()).zoom(c.getSZ()).build()));
		return ((CameraPosition) (obj));
		obj = ((Object) (DPoint.obtain()));
		a(c.getSX(), c.getSY(), ((DPoint) (obj)));
		obj1 = ((Object) (new LatLng(((DPoint) (obj)).y, ((DPoint) (obj)).x)));
		((DPoint) (obj)).recycle();
		obj = ((Object) (CameraPosition.builder().target(((LatLng) (obj1))).bearing(c.getSR()).tilt(c.getSC()).zoom(c.getSZ()).build()));
		return ((CameraPosition) (obj));
	}

	public void f()
	{
		S.d();
	//    0    0:aload_0         
	//    1    1:getfield        #589 <Field q S>
	//    2    4:invokevirtual   #2339 <Method void q.d()>
	//    3    7:return          
	}

	public void f(int i1, boolean flag)
	{
		if(aO && aP)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            33
	//*   3    7:aload_0         
	//*   4    8:getfield        #392 <Field boolean aP>
	//*   5   11:ifeq            33
		{
			resetRenderTime();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #891 <Method void resetRenderTime()>
			queueEvent(new Runnable(flag, i1) {

				public void run()
				{
					try
					{
						if(a)
				//*   0    0:aload_0         
				//*   1    1:getfield        #23  <Field boolean a>
				//*   2    4:ifeq            31
						{
							c.f.setParamater(b, 2018, 1, 0, 0, 0);
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field b c>
				//    5   11:getfield        #35  <Field GLMapEngine b.f>
				//    6   14:aload_0         
				//    7   15:getfield        #25  <Field int b>
				//    8   18:sipush          2018
				//    9   21:iconst_1        
				//   10   22:iconst_0        
				//   11   23:iconst_0        
				//   12   24:iconst_0        
				//   13   25:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
							break MISSING_BLOCK_LABEL_52;
				//   14   28:goto            52
						}
					}
				//*  15   31:aload_0         
				//*  16   32:getfield        #21  <Field b c>
				//*  17   35:getfield        #35  <Field GLMapEngine b.f>
				//*  18   38:aload_0         
				//*  19   39:getfield        #25  <Field int b>
				//*  20   42:sipush          2018
				//*  21   45:iconst_0        
				//*  22   46:iconst_0        
				//*  23   47:iconst_0        
				//*  24   48:iconst_0        
				//*  25   49:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				//*  26   52:return          
					catch(Throwable throwable)
				//*  27   53:astore_1        
					{
						throwable.printStackTrace();
				//   28   54:aload_1         
				//   29   55:invokevirtual   #44  <Method void Throwable.printStackTrace()>
						return;
				//   30   58:return          
					}
					c.f.setParamater(b, 2018, 0, 0, 0, 0);
				}

				final boolean a;
				final int b;
				final com.amap.api.mapcore.util.b c;

			
			{
				c = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field b c>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field boolean a>
				b = i1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    8   18:aload_0         
	//    9   19:new             #46  <Class b$25>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:iload_2         
	//   13   25:iload_1         
	//   14   26:invokespecial   #2340 <Method void b$25(b, boolean, int)>
	//   15   29:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   16   32:return          
		} else
		{
			bj.c = flag;
	//   17   33:aload_0         
	//   18   34:getfield        #446 <Field b$a bj>
	//   19   37:iload_2         
	//   20   38:putfield        #1632 <Field boolean b$a.c>
			bj.b = true;
	//   21   41:aload_0         
	//   22   42:getfield        #446 <Field b$a bj>
	//   23   45:iconst_1        
	//   24   46:putfield        #1468 <Field boolean b$a.b>
			bj.g = i1;
	//   25   49:aload_0         
	//   26   50:getfield        #446 <Field b$a bj>
	//   27   53:iload_1         
	//   28   54:putfield        #1460 <Field int b$a.g>
			return;
	//   29   57:return          
		}
	}

	public float g()
	{
		return b(U);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #1536 <Field int U>
	//    3    5:invokevirtual   #1853 <Method float b(int)>
	//    4    8:freturn         
	}

	public void g(int i1)
	{
		if(!V && Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifne            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #570 <Field fq Q>
	//*   5   11:ifnull          22
			Q.a(i1);
	//    6   14:aload_0         
	//    7   15:getfield        #570 <Field fq Q>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #2341 <Method void fq.a(int)>
	//   10   22:return          
	}

	public void g(int i1, boolean flag)
	{
		if(aO && aP)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            33
	//*   3    7:aload_0         
	//*   4    8:getfield        #392 <Field boolean aP>
	//*   5   11:ifeq            33
		{
			resetRenderTime();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #891 <Method void resetRenderTime()>
			queueEvent(new Runnable(flag, i1) {

				public void run()
				{
					try
					{
						if(a)
				//*   0    0:aload_0         
				//*   1    1:getfield        #23  <Field boolean a>
				//*   2    4:ifeq            31
						{
							c.f.setParamater(b, 2034, 1, 0, 0, 0);
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field b c>
				//    5   11:getfield        #36  <Field GLMapEngine b.f>
				//    6   14:aload_0         
				//    7   15:getfield        #25  <Field int b>
				//    8   18:sipush          2034
				//    9   21:iconst_1        
				//   10   22:iconst_0        
				//   11   23:iconst_0        
				//   12   24:iconst_0        
				//   13   25:invokevirtual   #42  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
							break MISSING_BLOCK_LABEL_52;
				//   14   28:goto            52
						}
					}
				//*  15   31:aload_0         
				//*  16   32:getfield        #21  <Field b c>
				//*  17   35:getfield        #36  <Field GLMapEngine b.f>
				//*  18   38:aload_0         
				//*  19   39:getfield        #25  <Field int b>
				//*  20   42:sipush          2034
				//*  21   45:iconst_0        
				//*  22   46:iconst_0        
				//*  23   47:iconst_0        
				//*  24   48:iconst_0        
				//*  25   49:invokevirtual   #42  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				//*  26   52:return          
					catch(Throwable throwable)
				//*  27   53:astore_1        
					{
						throwable.printStackTrace();
				//   28   54:aload_1         
				//   29   55:invokevirtual   #45  <Method void Throwable.printStackTrace()>
						return;
				//   30   58:return          
					}
					c.f.setParamater(b, 2034, 0, 0, 0, 0);
				}

				final boolean a;
				final int b;
				final com.amap.api.mapcore.util.b c;

			
			{
				c = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field b c>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field boolean a>
				b = i1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    8   18:aload_0         
	//    9   19:new             #48  <Class b$26>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:iload_2         
	//   13   25:iload_1         
	//   14   26:invokespecial   #2342 <Method void b$26(b, boolean, int)>
	//   15   29:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   16   32:return          
		} else
		{
			bn.c = flag;
	//   17   33:aload_0         
	//   18   34:getfield        #458 <Field b$a bn>
	//   19   37:iload_2         
	//   20   38:putfield        #1632 <Field boolean b$a.c>
			bn.b = true;
	//   21   41:aload_0         
	//   22   42:getfield        #458 <Field b$a bn>
	//   23   45:iconst_1        
	//   24   46:putfield        #1468 <Field boolean b$a.b>
			bn.g = i1;
	//   25   49:aload_0         
	//   26   50:getfield        #458 <Field b$a bn>
	//   27   53:iload_1         
	//   28   54:putfield        #1460 <Field int b$a.g>
			return;
	//   29   57:return          
		}
	}

	void g(boolean flag)
	{
		Handler handler = i;
	//    0    0:aload_0         
	//    1    1:getfield        #414 <Field Handler i>
	//    2    4:astore_3        
		int i1;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			i1 = 1;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			i1 = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		handler.obtainMessage(17, i1, 0).sendToTarget();
	//   10   16:aload_3         
	//   11   17:bipush          17
	//   12   19:iload_2         
	//   13   20:iconst_0        
	//   14   21:invokevirtual   #2345 <Method Message Handler.obtainMessage(int, int, int)>
	//   15   24:invokevirtual   #1013 <Method void Message.sendToTarget()>
	//   16   27:return          
	}

	public Projection getAMapProjection()
		throws RemoteException
	{
		return new Projection(((com.autonavi.amap.mapcore.interfaces.IProjection) (M)));
	//    0    0:new             #2349 <Class Projection>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #622 <Field u M>
	//    4    8:invokespecial   #2352 <Method void Projection(com.autonavi.amap.mapcore.interfaces.IProjection)>
	//    5   11:areturn         
	}

	public UiSettings getAMapUiSettings()
		throws RemoteException
	{
		if(L == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #2356 <Field UiSettings L>
	//*   2    4:ifnonnull       22
			L = new UiSettings(((com.autonavi.amap.mapcore.interfaces.IUiSettings) (N)));
	//    3    7:aload_0         
	//    4    8:new             #2358 <Class UiSettings>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #565 <Field ag N>
	//    8   16:invokespecial   #2361 <Method void UiSettings(com.autonavi.amap.mapcore.interfaces.IUiSettings)>
	//    9   19:putfield        #2356 <Field UiSettings L>
		return L;
	//   10   22:aload_0         
	//   11   23:getfield        #2356 <Field UiSettings L>
	//   12   26:areturn         
	}

	public AMapCameraInfo getCamerInfo()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public float getCameraAngle()
	{
		return o(U);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #1536 <Field int U>
	//    3    5:invokevirtual   #2366 <Method float o(int)>
	//    4    8:freturn         
	}

	public CameraPosition getCameraPosition()
		throws RemoteException
	{
		return f(Z);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #324 <Field boolean Z>
	//    3    5:invokevirtual   #2368 <Method CameraPosition f(boolean)>
	//    4    8:areturn         
	}

	public long getGlOverlayMgrPtr()
	{
		long l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_1        
		if(f != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #545 <Field GLMapEngine f>
	//*   4    6:ifnull          18
			l1 = f.getGlOverlayMgrPtr(1);
	//    5    9:aload_0         
	//    6   10:getfield        #545 <Field GLMapEngine f>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #2371 <Method long GLMapEngine.getGlOverlayMgrPtr(int)>
	//    9   17:lstore_1        
		return l1;
	//   10   18:lload_1         
	//   11   19:lreturn         
	}

	public InfoWindowAnimationManager getInfoWindowAnimationManager()
	{
		return new InfoWindowAnimationManager(((com.autonavi.amap.mapcore.interfaces.IInfoWindowManager) (K)));
	//    0    0:new             #2375 <Class InfoWindowAnimationManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #305 <Field do K>
	//    4    8:invokespecial   #2378 <Method void InfoWindowAnimationManager(com.autonavi.amap.mapcore.interfaces.IInfoWindowManager)>
	//    5   11:areturn         
	}

	public void getLatLngRect(DPoint adpoint[])
	{
		int i1;
		Rectangle rectangle;
		IPoint aipoint[];
		try
		{
			rectangle = c.getGeoRectangle();
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:invokevirtual   #745 <Method Rectangle MapConfig.getGeoRectangle()>
	//    3    7:astore_3        
		}
	//*   4    8:aload_3         
	//*   5    9:ifnull          49
	//*   6   12:aload_3         
	//*   7   13:invokevirtual   #1071 <Method IPoint[] Rectangle.getClipRect()>
	//*   8   16:astore_3        
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:iconst_4        
	//*  13   21:icmpge          49
	//*  14   24:aload_3         
	//*  15   25:iload_2         
	//*  16   26:aaload          
	//*  17   27:getfield        #1369 <Field int IPoint.x>
	//*  18   30:aload_3         
	//*  19   31:iload_2         
	//*  20   32:aaload          
	//*  21   33:getfield        #1370 <Field int IPoint.y>
	//*  22   36:aload_1         
	//*  23   37:iload_2         
	//*  24   38:aaload          
	//*  25   39:invokestatic    #2168 <Method void GLMapState.geo2LonLat(int, int, DPoint)>
	//*  26   42:iload_2         
	//*  27   43:iconst_1        
	//*  28   44:iadd            
	//*  29   45:istore_2        
	//*  30   46:goto            19
	//*  31   49:return          
		// Misplaced declaration of an exception variable
		catch(DPoint adpoint[])
	//*  32   50:astore_1        
		{
			return;
	//   33   51:return          
		}
		if(rectangle == null) goto _L2; else goto _L1
_L1:
		aipoint = rectangle.getClipRect();
		i1 = 0;
_L3:
		if(i1 >= 4)
			break; /* Loop/switch isn't completed */
		GLMapState.geo2LonLat(aipoint[i1].x, aipoint[i1].y, adpoint[i1]);
		i1++;
		if(true) goto _L3; else goto _L2
_L2:
	}

	public Handler getMainHandler()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #414 <Field Handler i>
	//    2    4:areturn         
	}

	public MapConfig getMapConfig()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:areturn         
	}

	public String getMapContentApprovalNumber()
	{
		if(c != null && !c.isCustomStyleEnable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          47
	//*   3    7:aload_0         
	//*   4    8:getfield        #322 <Field MapConfig c>
	//*   5   11:invokevirtual   #1734 <Method boolean MapConfig.isCustomStyleEnable()>
	//*   6   14:ifne            47
		{
			String s1 = eu.a(e, "approval_number", "mc", "");
	//    7   17:aload_0         
	//    8   18:getfield        #501 <Field Context e>
	//    9   21:ldc2            #2385 <String "approval_number">
	//   10   24:ldc2            #2387 <String "mc">
	//   11   27:ldc2            #2389 <String "">
	//   12   30:invokestatic    #2394 <Method String eu.a(Context, String, String, String)>
	//   13   33:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  14   34:aload_1         
	//*  15   35:invokestatic    #1782 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   38:ifne            43
				return s1;
	//   17   41:aload_1         
	//   18   42:areturn         
			else
				return "GS\uFF082017\uFF093426\u53F7 |\240GS\uFF082017\uFF092550\u53F7";
	//   19   43:ldc2            #2396 <String "GS\uFF082017\uFF093426\u53F7 |\240GS\uFF082017\uFF092550\u53F7">
	//   20   46:areturn         
		} else
		{
			return null;
	//   21   47:aconst_null     
	//   22   48:areturn         
		}
	}

	public int getMapHeight()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #1529 <Field int h>
	//    2    4:ireturn         
	}

	public void getMapPrintScreen(com.amap.api.maps.AMap.onMapPrintScreenListener onmapprintscreenlistener)
	{
		G = onmapprintscreenlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #301 <Field com.amap.api.maps.AMap$onMapPrintScreenListener G>
		ak = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #342 <Field boolean ak>
		resetRenderTime();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #891 <Method void resetRenderTime()>
	//    8   14:return          
	}

	public List getMapScreenMarkers()
		throws RemoteException
	{
		if(!fd.b(getMapWidth(), getMapHeight()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #732 <Method int getMapWidth()>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #735 <Method int getMapHeight()>
	//*   4    8:invokestatic    #2402 <Method boolean fd.b(int, int)>
	//*   5   11:ifne            22
			return ((List) (new ArrayList()));
	//    6   14:new             #367 <Class ArrayList>
	//    7   17:dup             
	//    8   18:invokespecial   #368 <Method void ArrayList()>
	//    9   21:areturn         
		else
			return b.f();
	//   10   22:aload_0         
	//   11   23:getfield        #599 <Field y b>
	//   12   26:invokevirtual   #2404 <Method List y.f()>
	//   13   29:areturn         
	}

	public void getMapScreenShot(com.amap.api.maps.AMap.OnMapScreenShotListener onmapscreenshotlistener)
	{
		H = onmapscreenshotlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #303 <Field com.amap.api.maps.AMap$OnMapScreenShotListener H>
		ak = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #342 <Field boolean ak>
		resetRenderTime();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #891 <Method void resetRenderTime()>
	//    8   14:return          
	}

	public int getMapTextZIndex()
		throws RemoteException
	{
		return au;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field int au>
	//    2    4:ireturn         
	}

	public int getMapType()
		throws RemoteException
	{
		return an;
	//    0    0:aload_0         
	//    1    1:getfield        #351 <Field int an>
	//    2    4:ireturn         
	}

	public int getMapWidth()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #1527 <Field int g>
	//    2    4:ireturn         
	}

	public float getMaxZoomLevel()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          15
			return c.getMaxZoomLevel();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:invokevirtual   #1856 <Method float MapConfig.getMaxZoomLevel()>
	//    6   14:freturn         
		else
			return 20F;
	//    7   15:ldc2            #2410 <Float 20F>
	//    8   18:freturn         
	}

	public float getMinZoomLevel()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          15
			return c.getMinZoomLevel();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:invokevirtual   #2121 <Method float MapConfig.getMinZoomLevel()>
	//    6   14:freturn         
		else
			return 3F;
	//    7   15:ldc2            #2411 <Float 3F>
	//    8   18:freturn         
	}

	public Location getMyLocation()
		throws RemoteException
	{
		if(ac != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #658 <Field LocationSource ac>
	//*   2    4:ifnull          15
			return F.a;
	//    3    7:aload_0         
	//    4    8:getfield        #627 <Field g F>
	//    5   11:getfield        #2416 <Field Location g.a>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public MyLocationStyle getMyLocationStyle()
		throws RemoteException
	{
		if(ab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1635 <Field dk ab>
	//*   2    4:ifnull          15
			return ab.a();
	//    3    7:aload_0         
	//    4    8:getfield        #1635 <Field dk ab>
	//    5   11:invokevirtual   #2420 <Method MyLocationStyle dk.a()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public float[] getProjectionMatrix()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          15
			return c.getProjectionMatrix();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:invokevirtual   #2421 <Method float[] MapConfig.getProjectionMatrix()>
	//    6   14:areturn         
		else
			return o;
	//    7   15:aload_0         
	//    8   16:getfield        #485 <Field float[] o>
	//    9   19:areturn         
	}

	public int getRenderMode()
	{
		return P.getRenderMode();
	//    0    0:aload_0         
	//    1    1:getfield        #554 <Field t P>
	//    2    4:invokeinterface #2424 <Method int t.getRenderMode()>
	//    3    9:ireturn         
	}

	public String getSatelliteImageApprovalNumber()
	{
		String s1 = eu.a(e, "approval_number", "si", "");
	//    0    0:aload_0         
	//    1    1:getfield        #501 <Field Context e>
	//    2    4:ldc2            #2385 <String "approval_number">
	//    3    7:ldc2            #2427 <String "si">
	//    4   10:ldc2            #2389 <String "">
	//    5   13:invokestatic    #2394 <Method String eu.a(Context, String, String, String)>
	//    6   16:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*   7   17:aload_1         
	//*   8   18:invokestatic    #1782 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   21:ifne            26
			return s1;
	//   10   24:aload_1         
	//   11   25:areturn         
		else
			return "GS\uFF082018\uFF09984\u53F7";
	//   12   26:ldc2            #2429 <String "GS\uFF082018\uFF09984\u53F7">
	//   13   29:areturn         
	}

	public float getScalePerPixel()
		throws RemoteException
	{
		float f1;
		float f2;
		try
		{
			LatLng latlng = getCameraPosition().target;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1765 <Method CameraPosition getCameraPosition()>
	//    2    4:getfield        #2432 <Field LatLng CameraPosition.target>
	//    3    7:astore_3        
			f1 = g();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #2434 <Method float g()>
	//    6   12:fstore_1        
			f1 = (float)((Math.cos((latlng.latitude * 3.1415926535897931D) / 180D) * 2D * 3.1415926535897931D * 6378137D) / (Math.pow(2D, f1) * 256D));
	//    7   13:aload_3         
	//    8   14:getfield        #843 <Field double LatLng.latitude>
	//    9   17:ldc2w           #2435 <Double 3.1415926535897931D>
	//   10   20:dmul            
	//   11   21:ldc2w           #2437 <Double 180D>
	//   12   24:ddiv            
	//   13   25:invokestatic    #2442 <Method double Math.cos(double)>
	//   14   28:ldc2w           #2443 <Double 2D>
	//   15   31:dmul            
	//   16   32:ldc2w           #2435 <Double 3.1415926535897931D>
	//   17   35:dmul            
	//   18   36:ldc2w           #2445 <Double 6378137D>
	//   19   39:dmul            
	//   20   40:ldc2w           #2443 <Double 2D>
	//   21   43:fload_1         
	//   22   44:f2d             
	//   23   45:invokestatic    #2450 <Method double Math.pow(double, double)>
	//   24   48:ldc2w           #2451 <Double 256D>
	//   25   51:dmul            
	//   26   52:ddiv            
	//   27   53:d2f             
	//   28   54:fstore_1        
			f2 = u();
	//   29   55:aload_0         
	//   30   56:invokevirtual   #2454 <Method float u()>
	//   31   59:fstore_2        
		}
	//*  32   60:fload_1         
	//*  33   61:fload_2         
	//*  34   62:fmul            
	//*  35   63:freturn         
		catch(Throwable throwable)
	//*  36   64:astore_3        
		{
			hm.c(throwable, "AMapDelegateImp", "getScalePerPixel");
	//   37   65:aload_3         
	//   38   66:ldc2            #1165 <String "AMapDelegateImp">
	//   39   69:ldc2            #2455 <String "getScalePerPixel">
	//   40   72:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//   41   75:aload_3         
	//   42   76:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			return 0.0F;
	//   43   79:fconst_0        
	//   44   80:freturn         
		}
		return f1 * f2;
	}

	public float getSkyHeight()
	{
		return c.getSkyHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:invokevirtual   #2458 <Method float MapConfig.getSkyHeight()>
	//    3    7:freturn         
	}

	public View getView()
		throws RemoteException
	{
		return ((View) (Q));
	//    0    0:aload_0         
	//    1    1:getfield        #570 <Field fq Q>
	//    2    4:areturn         
	}

	public float[] getViewMatrix()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          15
			return c.getViewMatrix();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:invokevirtual   #2461 <Method float[] MapConfig.getViewMatrix()>
	//    6   14:areturn         
		else
			return n;
	//    7   15:aload_0         
	//    8   16:getfield        #483 <Field float[] n>
	//    9   19:areturn         
	}

	public float getZoomToSpanLevel(LatLng latlng, LatLng latlng1)
	{
		MapConfig mapconfig = getMapConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #2090 <Method MapConfig getMapConfig()>
	//    2    4:astore_3        
		if(latlng != null && latlng1 != null && aO && !V)
	//*   3    5:aload_1         
	//*   4    6:ifnull          112
	//*   5    9:aload_2         
	//*   6   10:ifnull          112
	//*   7   13:aload_0         
	//*   8   14:getfield        #390 <Field boolean aO>
	//*   9   17:ifeq            112
	//*  10   20:aload_0         
	//*  11   21:getfield        #313 <Field boolean V>
	//*  12   24:ifne            112
		{
			com.amap.api.maps.model.LatLngBounds.Builder builder = new com.amap.api.maps.model.LatLngBounds.Builder();
	//   13   27:new             #1382 <Class com.amap.api.maps.model.LatLngBounds$Builder>
	//   14   30:dup             
	//   15   31:invokespecial   #2158 <Method void com.amap.api.maps.model.LatLngBounds$Builder()>
	//   16   34:astore          4
			builder.include(latlng);
	//   17   36:aload           4
	//   18   38:aload_1         
	//   19   39:invokevirtual   #1386 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   20   42:pop             
			builder.include(latlng1);
	//   21   43:aload           4
	//   22   45:aload_2         
	//   23   46:invokevirtual   #1386 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   24   49:pop             
			latlng = ((LatLng) (new GLMapState(1, f.getNativeInstance())));
	//   25   50:new             #737 <Class GLMapState>
	//   26   53:dup             
	//   27   54:iconst_1        
	//   28   55:aload_0         
	//   29   56:getfield        #545 <Field GLMapEngine f>
	//   30   59:invokevirtual   #820 <Method long GLMapEngine.getNativeInstance()>
	//   31   62:invokespecial   #823 <Method void GLMapState(int, long)>
	//   32   65:astore_1        
			latlng1 = ((LatLng) (fd.a(mapconfig, 0, 0, 0, 0, builder.build(), getMapWidth(), getMapHeight())));
	//   33   66:aload_3         
	//   34   67:iconst_0        
	//   35   68:iconst_0        
	//   36   69:iconst_0        
	//   37   70:iconst_0        
	//   38   71:aload           4
	//   39   73:invokevirtual   #1389 <Method LatLngBounds com.amap.api.maps.model.LatLngBounds$Builder.build()>
	//   40   76:aload_0         
	//   41   77:invokevirtual   #732 <Method int getMapWidth()>
	//   42   80:aload_0         
	//   43   81:invokevirtual   #735 <Method int getMapHeight()>
	//   44   84:invokestatic    #2161 <Method Pair fd.a(MapConfig, int, int, int, int, LatLngBounds, int, int)>
	//   45   87:astore_2        
			((GLMapState) (latlng)).recycle();
	//   46   88:aload_1         
	//   47   89:invokevirtual   #855 <Method void GLMapState.recycle()>
			if(latlng1 != null)
	//*  48   92:aload_2         
	//*  49   93:ifnull          107
				return ((Float)((Pair) (latlng1)).first).floatValue();
	//   50   96:aload_2         
	//   51   97:getfield        #2171 <Field Object Pair.first>
	//   52  100:checkcast       #2150 <Class Float>
	//   53  103:invokevirtual   #2466 <Method float Float.floatValue()>
	//   54  106:freturn         
			else
				return ((GLMapState) (latlng)).getMapZoomer();
	//   55  107:aload_1         
	//   56  108:invokevirtual   #2042 <Method float GLMapState.getMapZoomer()>
	//   57  111:freturn         
		} else
		{
			return mapconfig.getSZ();
	//   58  112:aload_3         
	//   59  113:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//   60  116:freturn         
		}
	}

	public float h(int i1)
	{
		if(aO && !Y && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            34
	//*   3    7:aload_0         
	//*   4    8:getfield        #315 <Field boolean Y>
	//*   5   11:ifne            34
	//*   6   14:aload_0         
	//*   7   15:getfield        #545 <Field GLMapEngine f>
	//*   8   18:ifnull          34
			return f.getMapState(1).getGLUnitWithWin(i1);
	//    9   21:aload_0         
	//   10   22:getfield        #545 <Field GLMapEngine f>
	//   11   25:iconst_1        
	//   12   26:invokevirtual   #729 <Method GLMapState GLMapEngine.getMapState(int)>
	//   13   29:iload_1         
	//   14   30:invokevirtual   #760 <Method float GLMapState.getGLUnitWithWin(int)>
	//   15   33:freturn         
		else
			return 0.0F;
	//   16   34:fconst_0        
	//   17   35:freturn         
	}

	public v h()
	{
		return ((v) (N));
	//    0    0:aload_0         
	//    1    1:getfield        #565 <Field ag N>
	//    2    4:areturn         
	}

	public void h(boolean flag)
	{
		if(!V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifne            15
			Q.f(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #570 <Field fq Q>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #2469 <Method void fq.f(boolean)>
	//    7   15:return          
	}

	public void i()
	{
		if(J != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #638 <Field aw J>
	//*   2    4:ifnull          14
			J.e();
	//    3    7:aload_0         
	//    4    8:getfield        #638 <Field aw J>
	//    5   11:invokevirtual   #2470 <Method void aw.e()>
	//    6   14:return          
	}

	public void i(int i1)
	{
		if(Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #570 <Field fq Q>
	//*   2    4:ifnull          15
			Q.b(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #570 <Field fq Q>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #2472 <Method void fq.b(int)>
	//    7   15:return          
	}

	public void i(boolean flag)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          46
		{
			c.setHideLogoEnble(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #2475 <Method void MapConfig.setHideLogoEnble(boolean)>
			if(c.isCustomStyleEnable())
	//*   7   15:aload_0         
	//*   8   16:getfield        #322 <Field MapConfig c>
	//*   9   19:invokevirtual   #1734 <Method boolean MapConfig.isCustomStyleEnable()>
	//*  10   22:ifeq            46
			{
				ag ag1 = N;
	//   11   25:aload_0         
	//   12   26:getfield        #565 <Field ag N>
	//   13   29:astore_2        
				if(!flag)
	//*  14   30:iload_1         
	//*  15   31:ifne            39
					flag = true;
	//   16   34:iconst_1        
	//   17   35:istore_1        
				else
	//*  18   36:goto            41
					flag = false;
	//   19   39:iconst_0        
	//   20   40:istore_1        
				ag1.setLogoEnable(flag);
	//   21   41:aload_2         
	//   22   42:iload_1         
	//   23   43:invokevirtual   #1804 <Method void ag.setLogoEnable(boolean)>
			}
		}
	//   24   46:return          
	}

	public boolean isIndoorEnabled()
		throws RemoteException
	{
		return c.isIndoorEnable();
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:invokevirtual   #2479 <Method boolean MapConfig.isIndoorEnable()>
	//    3    7:ireturn         
	}

	public boolean isMaploaded()
	{
		return aa;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field boolean aa>
	//    2    4:ireturn         
	}

	public boolean isMyLocationEnabled()
		throws RemoteException
	{
		return T;
	//    0    0:aload_0         
	//    1    1:getfield        #311 <Field boolean T>
	//    2    4:ireturn         
	}

	public boolean isTrafficEnabled()
		throws RemoteException
	{
		return c.isTrafficEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:invokevirtual   #2484 <Method boolean MapConfig.isTrafficEnabled()>
	//    3    7:ireturn         
	}

	public void j()
	{
		if(aO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            17
			i.sendEmptyMessage(18);
	//    3    7:aload_0         
	//    4    8:getfield        #414 <Field Handler i>
	//    5   11:bipush          18
	//    6   13:invokevirtual   #782 <Method boolean Handler.sendEmptyMessage(int)>
	//    7   16:pop             
	//    8   17:return          
	}

	public void j(int i1)
	{
		if(Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #570 <Field fq Q>
	//*   2    4:ifnull          15
			Q.c(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #570 <Field fq Q>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #2486 <Method void fq.c(int)>
	//    7   15:return          
	}

	public void k(int i1)
	{
		if(Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #570 <Field fq Q>
	//*   2    4:ifnull          15
			Q.d(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #570 <Field fq Q>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #2488 <Method void fq.d(int)>
	//    7   15:return          
	}

	public boolean k()
	{
		return Z;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field boolean Z>
	//    2    4:ireturn         
	}

	public float l(int i1)
	{
		if(Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #570 <Field fq Q>
	//*   2    4:ifnull          16
			return Q.e(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #570 <Field fq Q>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #2490 <Method float fq.e(int)>
	//    7   15:freturn         
		else
			return 0.0F;
	//    8   16:fconst_0        
	//    9   17:freturn         
	}

	public Point l()
	{
		if(Q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #570 <Field fq Q>
	//*   2    4:ifnull          15
			return Q.c();
	//    3    7:aload_0         
	//    4    8:getfield        #570 <Field fq Q>
	//    5   11:invokevirtual   #2493 <Method Point fq.c()>
	//    6   14:areturn         
		else
			return new Point();
	//    7   15:new             #468 <Class Point>
	//    8   18:dup             
	//    9   19:invokespecial   #469 <Method void Point()>
	//   10   22:areturn         
	}

	public View m()
	{
		if(P instanceof View)
	//*   0    0:aload_0         
	//*   1    1:getfield        #554 <Field t P>
	//*   2    4:instanceof      #2495 <Class View>
	//*   3    7:ifeq            18
			return (View)P;
	//    4   10:aload_0         
	//    5   11:getfield        #554 <Field t P>
	//    6   14:checkcast       #2495 <Class View>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public void m(int i1)
	{
		queueEvent(new Runnable(i1) {

			public void run()
			{
				if(com.amap.api.mapcore.util.b.s(b) && b.f != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field b b>
			//*   2    4:invokestatic    #30  <Method boolean b.s(b)>
			//*   3    7:ifeq            41
			//*   4   10:aload_0         
			//*   5   11:getfield        #19  <Field b b>
			//*   6   14:getfield        #34  <Field GLMapEngine b.f>
			//*   7   17:ifnull          41
					b.f.setParamater(a, 2014, 0, 0, 0, 0);
			//    8   20:aload_0         
			//    9   21:getfield        #19  <Field b b>
			//   10   24:getfield        #34  <Field GLMapEngine b.f>
			//   11   27:aload_0         
			//   12   28:getfield        #21  <Field int a>
			//   13   31:sipush          2014
			//   14   34:iconst_0        
			//   15   35:iconst_0        
			//   16   36:iconst_0        
			//   17   37:iconst_0        
			//   18   38:invokevirtual   #40  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			//   19   41:return          
			}

			final int a;
			final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field b b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #28  <Class b$17>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #2496 <Method void b$17(b, int)>
	//    6   10:invokevirtual   #1058 <Method void queueEvent(Runnable)>
	//    7   13:return          
	}

	public void moveCamera(CameraUpdate cameraupdate)
		throws RemoteException
	{
		if(cameraupdate == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			a(cameraupdate.getCameraUpdateFactoryDelegate());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #2076 <Method AbstractCameraUpdateMessage CameraUpdate.getCameraUpdateFactoryDelegate()>
	//    6   10:invokevirtual   #1163 <Method void a(AbstractCameraUpdateMessage)>
			return;
	//    7   13:return          
		}
	}

	public float n(int i1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          15
			return c.getSR();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:invokevirtual   #1319 <Method float MapConfig.getSR()>
	//    6   14:freturn         
		else
			return 0.0F;
	//    7   15:fconst_0        
	//    8   16:freturn         
	}

	public boolean n()
	{
		if(g() >= 17F && d != null && d.g != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #2434 <Method float g()>
	//*   2    4:ldc2            #2498 <Float 17F>
	//*   3    7:fcmpl           
	//*   4    8:iflt            79
	//*   5   11:aload_0         
	//*   6   12:getfield        #2500 <Field au d>
	//*   7   15:ifnull          79
	//*   8   18:aload_0         
	//*   9   19:getfield        #2500 <Field au d>
	//*  10   22:getfield        #2504 <Field Point au.g>
	//*  11   25:ifnull          79
		{
			FPoint fpoint = FPoint.obtain();
	//   12   28:invokestatic    #2095 <Method FPoint FPoint.obtain()>
	//   13   31:astore_1        
			b(d.g.x, d.g.y, fpoint);
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #2500 <Field au d>
	//   17   37:getfield        #2504 <Field Point au.g>
	//   18   40:getfield        #1446 <Field int Point.x>
	//   19   43:aload_0         
	//   20   44:getfield        #2500 <Field au d>
	//   21   47:getfield        #2504 <Field Point au.g>
	//   22   50:getfield        #1447 <Field int Point.y>
	//   23   53:aload_1         
	//   24   54:invokevirtual   #2097 <Method void b(int, int, FPoint)>
			if(am.contains((int)fpoint.x, (int)fpoint.y))
	//*  25   57:aload_0         
	//*  26   58:getfield        #349 <Field Rect am>
	//*  27   61:aload_1         
	//*  28   62:getfield        #1478 <Field float FPoint.x>
	//*  29   65:f2i             
	//*  30   66:aload_1         
	//*  31   67:getfield        #1479 <Field float FPoint.y>
	//*  32   70:f2i             
	//*  33   71:invokevirtual   #2507 <Method boolean Rect.contains(int, int)>
	//*  34   74:ifeq            79
				return true;
	//   35   77:iconst_1        
	//   36   78:ireturn         
		}
		return false;
	//   37   79:iconst_0        
	//   38   80:ireturn         
	}

	public float o(int i1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          15
			return c.getSC();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:invokevirtual   #1313 <Method float MapConfig.getSC()>
	//    6   14:freturn         
		else
			return 0.0F;
	//    7   15:fconst_0        
	//    8   16:freturn         
	}

	public int o()
	{
		return ax;
	//    0    0:aload_0         
	//    1    1:getfield        #363 <Field int ax>
	//    2    4:ireturn         
	}

	public void onActivityPause()
	{
		Y = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #315 <Field boolean Y>
		p(U);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #1536 <Field int U>
	//    6   10:invokevirtual   #2510 <Method void p(int)>
	//    7   13:return          
	}

	public void onActivityResume()
	{
		Y = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #315 <Field boolean Y>
		int j1 = U;
	//    3    5:aload_0         
	//    4    6:getfield        #1536 <Field int U>
	//    5    9:istore_2        
		int i1 = j1;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(j1 == 0)
	//*   8   12:iload_2         
	//*   9   13:ifne            25
			i1 = f.getEngineIDWithType(0);
	//   10   16:aload_0         
	//   11   17:getfield        #545 <Field GLMapEngine f>
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #1239 <Method int GLMapEngine.getEngineIDWithType(int)>
	//   14   24:istore_1        
		q(i1);
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:invokevirtual   #2513 <Method void q(int)>
	//   18   30:return          
	}

	public void onChangeFinish()
	{
		Message message = i.obtainMessage();
	//    0    0:aload_0         
	//    1    1:getfield        #414 <Field Handler i>
	//    2    4:invokevirtual   #2517 <Method Message Handler.obtainMessage()>
	//    3    7:astore_1        
		message.what = 11;
	//    4    8:aload_1         
	//    5    9:bipush          11
	//    6   11:putfield        #2520 <Field int Message.what>
		i.sendMessage(message);
	//    7   14:aload_0         
	//    8   15:getfield        #414 <Field Handler i>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #2524 <Method boolean Handler.sendMessage(Message)>
	//   11   22:pop             
	//   12   23:return          
	}

	public void onFling()
	{
		if(R != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #594 <Field af R>
	//*   2    4:ifnull          15
			R.b(true);
	//    3    7:aload_0         
	//    4    8:getfield        #594 <Field af R>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #2526 <Method void af.b(boolean)>
		aj = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #340 <Field boolean aj>
	//   10   20:return          
	}

	public void onIndoorBuildingActivity(int i1, byte abyte0[])
	{
		au au1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		if(abyte0 == null) goto _L2; else goto _L1
	//    2    3:aload_2         
	//    3    4:ifnull          428
_L1:
		au au2 = new au();
	//    4    7:new             #2502 <Class au>
	//    5   10:dup             
	//    6   11:invokespecial   #2529 <Method void au()>
	//    7   14:astore          7
		i1 = ((int) (abyte0[0]));
	//    8   16:aload_2         
	//    9   17:iconst_0        
	//   10   18:baload          
	//   11   19:istore_1        
		au2.a = new String(abyte0, 0 + 1, i1, "utf-8");
	//   12   20:aload           7
	//   13   22:new             #984 <Class String>
	//   14   25:dup             
	//   15   26:aload_2         
	//   16   27:iconst_0        
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:iload_1         
	//   20   31:ldc2            #2531 <String "utf-8">
	//   21   34:invokespecial   #2534 <Method void String(byte[], int, int, String)>
	//   22   37:putfield        #2536 <Field String au.a>
		int j1;
		j1 = i1 + 1;
	//   23   40:iload_1         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:istore_3        
		i1 = j1 + 1;
	//   27   44:iload_3         
	//   28   45:iconst_1        
	//   29   46:iadd            
	//   30   47:istore_1        
		j1 = ((int) (abyte0[j1]));
	//   31   48:aload_2         
	//   32   49:iload_3         
	//   33   50:baload          
	//   34   51:istore_3        
		au2.b = new String(abyte0, i1, j1, "utf-8");
	//   35   52:aload           7
	//   36   54:new             #984 <Class String>
	//   37   57:dup             
	//   38   58:aload_2         
	//   39   59:iload_1         
	//   40   60:iload_3         
	//   41   61:ldc2            #2531 <String "utf-8">
	//   42   64:invokespecial   #2534 <Method void String(byte[], int, int, String)>
	//   43   67:putfield        #2537 <Field String au.b>
		j1 = i1 + j1;
	//   44   70:iload_1         
	//   45   71:iload_3         
	//   46   72:iadd            
	//   47   73:istore_3        
		i1 = j1 + 1;
	//   48   74:iload_3         
	//   49   75:iconst_1        
	//   50   76:iadd            
	//   51   77:istore_1        
		j1 = ((int) (abyte0[j1]));
	//   52   78:aload_2         
	//   53   79:iload_3         
	//   54   80:baload          
	//   55   81:istore_3        
		au2.activeFloorName = new String(abyte0, i1, j1, "utf-8");
	//   56   82:aload           7
	//   57   84:new             #984 <Class String>
	//   58   87:dup             
	//   59   88:aload_2         
	//   60   89:iload_1         
	//   61   90:iload_3         
	//   62   91:ldc2            #2531 <String "utf-8">
	//   63   94:invokespecial   #2534 <Method void String(byte[], int, int, String)>
	//   64   97:putfield        #2540 <Field String au.activeFloorName>
		i1 += j1;
	//   65  100:iload_1         
	//   66  101:iload_3         
	//   67  102:iadd            
	//   68  103:istore_1        
		au2.activeFloorIndex = GLConvertUtil.getInt(abyte0, i1);
	//   69  104:aload           7
	//   70  106:aload_2         
	//   71  107:iload_1         
	//   72  108:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//   73  111:putfield        #2543 <Field int au.activeFloorIndex>
		j1 = i1 + 4;
	//   74  114:iload_1         
	//   75  115:iconst_4        
	//   76  116:iadd            
	//   77  117:istore_3        
		i1 = j1 + 1;
	//   78  118:iload_3         
	//   79  119:iconst_1        
	//   80  120:iadd            
	//   81  121:istore_1        
		j1 = ((int) (abyte0[j1]));
	//   82  122:aload_2         
	//   83  123:iload_3         
	//   84  124:baload          
	//   85  125:istore_3        
		au2.poiid = new String(abyte0, i1, j1, "utf-8");
	//   86  126:aload           7
	//   87  128:new             #984 <Class String>
	//   88  131:dup             
	//   89  132:aload_2         
	//   90  133:iload_1         
	//   91  134:iload_3         
	//   92  135:ldc2            #2531 <String "utf-8">
	//   93  138:invokespecial   #2534 <Method void String(byte[], int, int, String)>
	//   94  141:putfield        #2544 <Field String au.poiid>
		j1 = i1 + j1;
	//   95  144:iload_1         
	//   96  145:iload_3         
	//   97  146:iadd            
	//   98  147:istore_3        
		i1 = j1 + 1;
	//   99  148:iload_3         
	//  100  149:iconst_1        
	//  101  150:iadd            
	//  102  151:istore_1        
		j1 = ((int) (abyte0[j1]));
	//  103  152:aload_2         
	//  104  153:iload_3         
	//  105  154:baload          
	//  106  155:istore_3        
		au2.h = new String(abyte0, i1, j1, "utf-8");
	//  107  156:aload           7
	//  108  158:new             #984 <Class String>
	//  109  161:dup             
	//  110  162:aload_2         
	//  111  163:iload_1         
	//  112  164:iload_3         
	//  113  165:ldc2            #2531 <String "utf-8">
	//  114  168:invokespecial   #2534 <Method void String(byte[], int, int, String)>
	//  115  171:putfield        #2546 <Field String au.h>
		i1 += j1;
	//  116  174:iload_1         
	//  117  175:iload_3         
	//  118  176:iadd            
	//  119  177:istore_1        
		au2.c = GLConvertUtil.getInt(abyte0, i1);
	//  120  178:aload           7
	//  121  180:aload_2         
	//  122  181:iload_1         
	//  123  182:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//  124  185:putfield        #2548 <Field int au.c>
		i1 += 4;
	//  125  188:iload_1         
	//  126  189:iconst_4        
	//  127  190:iadd            
	//  128  191:istore_1        
		au2.floor_indexs = new int[au2.c];
	//  129  192:aload           7
	//  130  194:aload           7
	//  131  196:getfield        #2548 <Field int au.c>
	//  132  199:newarray        int[]
	//  133  201:putfield        #2552 <Field int[] au.floor_indexs>
		au2.floor_names = new String[au2.c];
	//  134  204:aload           7
	//  135  206:aload           7
	//  136  208:getfield        #2548 <Field int au.c>
	//  137  211:anewarray       String[]
	//  138  214:putfield        #2556 <Field String[] au.floor_names>
		au2.d = new String[au2.c];
	//  139  217:aload           7
	//  140  219:aload           7
	//  141  221:getfield        #2548 <Field int au.c>
	//  142  224:anewarray       String[]
	//  143  227:putfield        #2558 <Field String[] au.d>
		j1 = 0;
	//  144  230:iconst_0        
	//  145  231:istore_3        
_L10:
		if(j1 >= au2.c) goto _L4; else goto _L3
	//  146  232:iload_3         
	//  147  233:aload           7
	//  148  235:getfield        #2548 <Field int au.c>
	//  149  238:icmpge          352
_L3:
		au2.floor_indexs[j1] = GLConvertUtil.getInt(abyte0, i1);
	//  150  241:aload           7
	//  151  243:getfield        #2552 <Field int[] au.floor_indexs>
	//  152  246:iload_3         
	//  153  247:aload_2         
	//  154  248:iload_1         
	//  155  249:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//  156  252:iastore         
		int k1;
		byte byte0;
		i1 += 4;
	//  157  253:iload_1         
	//  158  254:iconst_4        
	//  159  255:iadd            
	//  160  256:istore_1        
		k1 = i1 + 1;
	//  161  257:iload_1         
	//  162  258:iconst_1        
	//  163  259:iadd            
	//  164  260:istore          4
		byte0 = abyte0[i1];
	//  165  262:aload_2         
	//  166  263:iload_1         
	//  167  264:baload          
	//  168  265:istore          5
		i1 = k1;
	//  169  267:iload           4
	//  170  269:istore_1        
		if(byte0 <= 0)
			break MISSING_BLOCK_LABEL_303;
	//  171  270:iload           5
	//  172  272:ifle            303
		au2.floor_names[j1] = new String(abyte0, k1, ((int) (byte0)), "utf-8");
	//  173  275:aload           7
	//  174  277:getfield        #2556 <Field String[] au.floor_names>
	//  175  280:iload_3         
	//  176  281:new             #984 <Class String>
	//  177  284:dup             
	//  178  285:aload_2         
	//  179  286:iload           4
	//  180  288:iload           5
	//  181  290:ldc2            #2531 <String "utf-8">
	//  182  293:invokespecial   #2534 <Method void String(byte[], int, int, String)>
	//  183  296:aastore         
		i1 = k1 + byte0;
	//  184  297:iload           4
	//  185  299:iload           5
	//  186  301:iadd            
	//  187  302:istore_1        
		k1 = i1 + 1;
	//  188  303:iload_1         
	//  189  304:iconst_1        
	//  190  305:iadd            
	//  191  306:istore          4
		byte0 = abyte0[i1];
	//  192  308:aload_2         
	//  193  309:iload_1         
	//  194  310:baload          
	//  195  311:istore          5
		i1 = k1;
	//  196  313:iload           4
	//  197  315:istore_1        
		if(byte0 <= 0) goto _L6; else goto _L5
	//  198  316:iload           5
	//  199  318:ifle            453
_L5:
		au2.d[j1] = new String(abyte0, k1, ((int) (byte0)), "utf-8");
	//  200  321:aload           7
	//  201  323:getfield        #2558 <Field String[] au.d>
	//  202  326:iload_3         
	//  203  327:new             #984 <Class String>
	//  204  330:dup             
	//  205  331:aload_2         
	//  206  332:iload           4
	//  207  334:iload           5
	//  208  336:ldc2            #2531 <String "utf-8">
	//  209  339:invokespecial   #2534 <Method void String(byte[], int, int, String)>
	//  210  342:aastore         
		i1 = k1 + byte0;
	//  211  343:iload           4
	//  212  345:iload           5
	//  213  347:iadd            
	//  214  348:istore_1        
		  goto _L6
	//* 215  349:goto            453
_L4:
		au2.e = GLConvertUtil.getInt(abyte0, i1);
	//  216  352:aload           7
	//  217  354:aload_2         
	//  218  355:iload_1         
	//  219  356:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//  220  359:putfield        #2559 <Field int au.e>
		j1 = i1 + 4;
	//  221  362:iload_1         
	//  222  363:iconst_4        
	//  223  364:iadd            
	//  224  365:istore_3        
		au1 = au2;
	//  225  366:aload           7
	//  226  368:astore          6
		if(au2.e <= 0) goto _L2; else goto _L7
	//  227  370:aload           7
	//  228  372:getfield        #2559 <Field int au.e>
	//  229  375:ifle            428
_L7:
		au2.f = new int[au2.e];
	//  230  378:aload           7
	//  231  380:aload           7
	//  232  382:getfield        #2559 <Field int au.e>
	//  233  385:newarray        int[]
	//  234  387:putfield        #2561 <Field int[] au.f>
		i1 = 0;
	//  235  390:iconst_0        
	//  236  391:istore_1        
_L8:
		au1 = au2;
	//  237  392:aload           7
	//  238  394:astore          6
		if(i1 >= au2.e)
			break; /* Loop/switch isn't completed */
	//  239  396:iload_1         
	//  240  397:aload           7
	//  241  399:getfield        #2559 <Field int au.e>
	//  242  402:icmpge          428
		au2.f[i1] = GLConvertUtil.getInt(abyte0, j1);
	//  243  405:aload           7
	//  244  407:getfield        #2561 <Field int[] au.f>
	//  245  410:iload_1         
	//  246  411:aload_2         
	//  247  412:iload_3         
	//  248  413:invokestatic    #1400 <Method int GLConvertUtil.getInt(byte[], int)>
	//  249  416:iastore         
		j1 += 4;
	//  250  417:iload_3         
	//  251  418:iconst_4        
	//  252  419:iadd            
	//  253  420:istore_3        
		i1++;
	//  254  421:iload_1         
	//  255  422:iconst_1        
	//  256  423:iadd            
	//  257  424:istore_1        
		if(true) goto _L8; else goto _L2
	//  258  425:goto            392
_L2:
		try
		{
			br = au1;
	//  259  428:aload_0         
	//  260  429:aload           6
	//  261  431:putfield        #479 <Field au br>
			a(new Runnable() {

				public void run()
				{
					if(com.amap.api.mapcore.util.b.u(a) != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field b a>
				//*   2    4:invokestatic    #26  <Method b$b b.u(b)>
				//*   3    7:ifnull          27
						com.amap.api.mapcore.util.b.u(a).a(com.amap.api.mapcore.util.b.v(a));
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field b a>
				//    6   14:invokestatic    #26  <Method b$b b.u(b)>
				//    7   17:aload_0         
				//    8   18:getfield        #17  <Field b a>
				//    9   21:invokestatic    #30  <Method au b.v(b)>
				//   10   24:invokevirtual   #35  <Method void b$b.a(au)>
				//   11   27:return          
				}

				final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  262  434:aload_0         
	//  263  435:new             #74  <Class b$37>
	//  264  438:dup             
	//  265  439:aload_0         
	//  266  440:invokespecial   #2562 <Method void b$37(b)>
	//  267  443:invokevirtual   #2564 <Method void a(Runnable)>
			return;
	//  268  446:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 269  447:astore_2        
		{
			((Throwable) (abyte0)).printStackTrace();
	//  270  448:aload_2         
	//  271  449:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
		return;
	//  272  452:return          
_L6:
		j1++;
	//  273  453:iload_3         
	//  274  454:iconst_1        
	//  275  455:iadd            
	//  276  456:istore_3        
		if(true) goto _L10; else goto _L9
	//  277  457:goto            232
_L9:
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(Y || !aO || !aK)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean Y>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:getfield        #390 <Field boolean aO>
	//*   5   11:ifeq            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #382 <Field boolean aK>
	//*   8   18:ifne            23
			return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
		bp.mGestureState = 3;
	//   11   23:aload_0         
	//   12   24:getfield        #466 <Field EAMapPlatformGestureInfo bp>
	//   13   27:iconst_3        
	//   14   28:putfield        #2568 <Field int EAMapPlatformGestureInfo.mGestureState>
		bp.mGestureType = 8;
	//   15   31:aload_0         
	//   16   32:getfield        #466 <Field EAMapPlatformGestureInfo bp>
	//   17   35:bipush          8
	//   18   37:putfield        #2571 <Field int EAMapPlatformGestureInfo.mGestureType>
		bp.mLocation = (new float[] {
			motionevent.getX(), motionevent.getY()
		});
	//   19   40:aload_0         
	//   20   41:getfield        #466 <Field EAMapPlatformGestureInfo bp>
	//   21   44:iconst_2        
	//   22   45:newarray        float[]
	//   23   47:dup             
	//   24   48:iconst_0        
	//   25   49:aload_1         
	//   26   50:invokevirtual   #924 <Method float MotionEvent.getX()>
	//   27   53:fastore         
	//   28   54:dup             
	//   29   55:iconst_1        
	//   30   56:aload_1         
	//   31   57:invokevirtual   #927 <Method float MotionEvent.getY()>
	//   32   60:fastore         
	//   33   61:putfield        #2574 <Field float[] EAMapPlatformGestureInfo.mLocation>
		int i1 = a(bp);
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:getfield        #466 <Field EAMapPlatformGestureInfo bp>
	//   37   69:invokevirtual   #2576 <Method int a(EAMapPlatformGestureInfo)>
	//   38   72:istore_2        
		s();
	//   39   73:aload_0         
	//   40   74:invokevirtual   #2578 <Method void s()>
		switch(motionevent.getAction() & 0xff)
	//*  41   77:aload_1         
	//*  42   78:invokevirtual   #2581 <Method int MotionEvent.getAction()>
	//*  43   81:sipush          255
	//*  44   84:iand            
		{
	//*  45   85:tableswitch     0 2: default 112
	//	               0 115
	//	               1 127
	//	               2 132
	//*  46  112:goto            132
		case 0: // '\0'
			t();
	//   47  115:aload_0         
	//   48  116:invokevirtual   #2583 <Method void t()>
			v(i1);
	//   49  119:aload_0         
	//   50  120:iload_2         
	//   51  121:invokespecial   #2585 <Method void v(int)>
			break;

	//*  52  124:goto            132
		case 1: // '\001'
			w(i1);
	//   53  127:aload_0         
	//   54  128:iload_2         
	//   55  129:invokespecial   #2587 <Method void w(int)>
			break;
		}
		if(motionevent.getAction() == 2 && ad)
	//*  56  132:aload_1         
	//*  57  133:invokevirtual   #2581 <Method int MotionEvent.getAction()>
	//*  58  136:iconst_2        
	//*  59  137:icmpne          172
	//*  60  140:aload_0         
	//*  61  141:getfield        #328 <Field boolean ad>
	//*  62  144:ifeq            172
		{
			try
			{
				a(motionevent);
	//   63  147:aload_0         
	//   64  148:aload_1         
	//   65  149:invokespecial   #2589 <Method void a(MotionEvent)>
			}
	//*  66  152:goto            170
			// Misplaced declaration of an exception variable
			catch(MotionEvent motionevent)
	//*  67  155:astore_1        
			{
				hm.c(((Throwable) (motionevent)), "AMapDelegateImp", "onDragMarker");
	//   68  156:aload_1         
	//   69  157:ldc2            #1165 <String "AMapDelegateImp">
	//   70  160:ldc2            #2591 <String "onDragMarker">
	//   71  163:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
				((Throwable) (motionevent)).printStackTrace();
	//   72  166:aload_1         
	//   73  167:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			}
			return true;
	//   74  170:iconst_1        
	//   75  171:ireturn         
		}
		if(aF)
	//*  76  172:aload_0         
	//*  77  173:getfield        #372 <Field boolean aF>
	//*  78  176:ifeq            196
			try
			{
				aE.a(motionevent);
	//   79  179:aload_0         
	//   80  180:getfield        #538 <Field o aE>
	//   81  183:aload_1         
	//   82  184:invokevirtual   #2592 <Method boolean o.a(MotionEvent)>
	//   83  187:pop             
			}
	//*  84  188:goto            196
			catch(Throwable throwable)
	//*  85  191:astore_3        
			{
				throwable.printStackTrace();
	//   86  192:aload_3         
	//   87  193:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			}
		if(z != null)
	//*  88  196:aload_0         
	//*  89  197:getfield        #871 <Field com.amap.api.maps.AMap$OnMapTouchListener z>
	//*  90  200:ifnull          238
		{
			i.removeMessages(14);
	//   91  203:aload_0         
	//   92  204:getfield        #414 <Field Handler i>
	//   93  207:bipush          14
	//   94  209:invokevirtual   #2595 <Method void Handler.removeMessages(int)>
			Message message = i.obtainMessage();
	//   95  212:aload_0         
	//   96  213:getfield        #414 <Field Handler i>
	//   97  216:invokevirtual   #2517 <Method Message Handler.obtainMessage()>
	//   98  219:astore_3        
			message.what = 14;
	//   99  220:aload_3         
	//  100  221:bipush          14
	//  101  223:putfield        #2520 <Field int Message.what>
			message.obj = ((Object) (MotionEvent.obtain(motionevent)));
	//  102  226:aload_3         
	//  103  227:aload_1         
	//  104  228:invokestatic    #2598 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//  105  231:putfield        #2601 <Field Object Message.obj>
			message.sendToTarget();
	//  106  234:aload_3         
	//  107  235:invokevirtual   #1013 <Method void Message.sendToTarget()>
		}
		return true;
	//  108  238:iconst_1        
	//  109  239:ireturn         
	}

	public void p()
	{
		if(c.getMapRect() == null || at)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:invokevirtual   #2605 <Method FPoint[] MapConfig.getMapRect()>
	//*   3    7:ifnull          17
	//*   4   10:aload_0         
	//*   5   11:getfield        #359 <Field boolean at>
	//*   6   14:ifeq            26
		{
			B();
	//    7   17:aload_0         
	//    8   18:invokespecial   #2607 <Method void B()>
			at = false;
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:putfield        #359 <Field boolean at>
		}
		f.getCurTileIDs(1, c.getCurTileIds());
	//   12   26:aload_0         
	//   13   27:getfield        #545 <Field GLMapEngine f>
	//   14   30:iconst_1        
	//   15   31:aload_0         
	//   16   32:getfield        #322 <Field MapConfig c>
	//   17   35:invokevirtual   #2611 <Method int[] MapConfig.getCurTileIds()>
	//   18   38:invokevirtual   #2615 <Method void GLMapEngine.getCurTileIDs(int, int[])>
		Object obj = ((Object) (f.getMapState(1)));
	//   19   41:aload_0         
	//   20   42:getfield        #545 <Field GLMapEngine f>
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #729 <Method GLMapState GLMapEngine.getMapState(int)>
	//   23   49:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_428;
	//   24   50:aload_2         
	//   25   51:ifnull          428
		((GLMapState) (obj)).getViewMatrix(c.getViewMatrix());
	//   26   54:aload_2         
	//   27   55:aload_0         
	//   28   56:getfield        #322 <Field MapConfig c>
	//   29   59:invokevirtual   #2461 <Method float[] MapConfig.getViewMatrix()>
	//   30   62:invokevirtual   #2618 <Method void GLMapState.getViewMatrix(float[])>
		((GLMapState) (obj)).getProjectionMatrix(c.getProjectionMatrix());
	//   31   65:aload_2         
	//   32   66:aload_0         
	//   33   67:getfield        #322 <Field MapConfig c>
	//   34   70:invokevirtual   #2421 <Method float[] MapConfig.getProjectionMatrix()>
	//   35   73:invokevirtual   #2620 <Method void GLMapState.getProjectionMatrix(float[])>
		c.updateFinalMatrix();
	//   36   76:aload_0         
	//   37   77:getfield        #322 <Field MapConfig c>
	//   38   80:invokevirtual   #2623 <Method void MapConfig.updateFinalMatrix()>
		Object obj1 = ((Object) (((GLMapState) (obj)).getMapGeoCenter()));
	//   39   83:aload_2         
	//   40   84:invokevirtual   #2625 <Method Point GLMapState.getMapGeoCenter()>
	//   41   87:astore_3        
		c.setSX(((Point) (obj1)).x);
	//   42   88:aload_0         
	//   43   89:getfield        #322 <Field MapConfig c>
	//   44   92:aload_3         
	//   45   93:getfield        #1446 <Field int Point.x>
	//   46   96:invokevirtual   #2628 <Method void MapConfig.setSX(int)>
		c.setSY(((Point) (obj1)).y);
	//   47   99:aload_0         
	//   48  100:getfield        #322 <Field MapConfig c>
	//   49  103:aload_3         
	//   50  104:getfield        #1447 <Field int Point.y>
	//   51  107:invokevirtual   #2631 <Method void MapConfig.setSY(int)>
		c.setSZ(((GLMapState) (obj)).getMapZoomer());
	//   52  110:aload_0         
	//   53  111:getfield        #322 <Field MapConfig c>
	//   54  114:aload_2         
	//   55  115:invokevirtual   #2042 <Method float GLMapState.getMapZoomer()>
	//   56  118:invokevirtual   #2634 <Method void MapConfig.setSZ(float)>
		c.setSC(((GLMapState) (obj)).getCameraDegree());
	//   57  121:aload_0         
	//   58  122:getfield        #322 <Field MapConfig c>
	//   59  125:aload_2         
	//   60  126:invokevirtual   #2637 <Method float GLMapState.getCameraDegree()>
	//   61  129:invokevirtual   #2640 <Method void MapConfig.setSC(float)>
		c.setSR(((GLMapState) (obj)).getMapAngle());
	//   62  132:aload_0         
	//   63  133:getfield        #322 <Field MapConfig c>
	//   64  136:aload_2         
	//   65  137:invokevirtual   #2643 <Method float GLMapState.getMapAngle()>
	//   66  140:invokevirtual   #2646 <Method void MapConfig.setSR(float)>
		if(!c.isMapStateChange())
			break MISSING_BLOCK_LABEL_397;
	//   67  143:aload_0         
	//   68  144:getfield        #322 <Field MapConfig c>
	//   69  147:invokevirtual   #2649 <Method boolean MapConfig.isMapStateChange()>
	//   70  150:ifeq            397
		c.setSkyHeight(((GLMapState) (obj)).getSkyHeight());
	//   71  153:aload_0         
	//   72  154:getfield        #322 <Field MapConfig c>
	//   73  157:aload_2         
	//   74  158:invokevirtual   #2650 <Method float GLMapState.getSkyHeight()>
	//   75  161:invokevirtual   #2653 <Method void MapConfig.setSkyHeight(float)>
		obj1 = ((Object) (VirtualEarthProjection.pixelsToLatLong(((Point) (obj1)).x, ((Point) (obj1)).y, 20)));
	//   76  164:aload_3         
	//   77  165:getfield        #1446 <Field int Point.x>
	//   78  168:i2l             
	//   79  169:aload_3         
	//   80  170:getfield        #1447 <Field int Point.y>
	//   81  173:i2l             
	//   82  174:bipush          20
	//   83  176:invokestatic    #1035 <Method DPoint VirtualEarthProjection.pixelsToLatLong(long, long, int)>
	//   84  179:astore_3        
		obj = ((Object) (new CameraPosition(new LatLng(((DPoint) (obj1)).y, ((DPoint) (obj1)).x, false), c.getSZ(), c.getSC(), c.getSR())));
	//   85  180:new             #1060 <Class CameraPosition>
	//   86  183:dup             
	//   87  184:new             #837 <Class LatLng>
	//   88  187:dup             
	//   89  188:aload_3         
	//   90  189:getfield        #946 <Field double DPoint.y>
	//   91  192:aload_3         
	//   92  193:getfield        #948 <Field double DPoint.x>
	//   93  196:iconst_0        
	//   94  197:invokespecial   #1043 <Method void LatLng(double, double, boolean)>
	//   95  200:aload_0         
	//   96  201:getfield        #322 <Field MapConfig c>
	//   97  204:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//   98  207:aload_0         
	//   99  208:getfield        #322 <Field MapConfig c>
	//  100  211:invokevirtual   #1313 <Method float MapConfig.getSC()>
	//  101  214:aload_0         
	//  102  215:getfield        #322 <Field MapConfig c>
	//  103  218:invokevirtual   #1319 <Method float MapConfig.getSR()>
	//  104  221:invokespecial   #2656 <Method void CameraPosition(LatLng, float, float, float)>
	//  105  224:astore_2        
		((DPoint) (obj1)).recycle();
	//  106  225:aload_3         
	//  107  226:invokevirtual   #952 <Method void DPoint.recycle()>
		obj1 = ((Object) (i.obtainMessage()));
	//  108  229:aload_0         
	//  109  230:getfield        #414 <Field Handler i>
	//  110  233:invokevirtual   #2517 <Method Message Handler.obtainMessage()>
	//  111  236:astore_3        
		obj1.what = 10;
	//  112  237:aload_3         
	//  113  238:bipush          10
	//  114  240:putfield        #2520 <Field int Message.what>
		obj1.obj = obj;
	//  115  243:aload_3         
	//  116  244:aload_2         
	//  117  245:putfield        #2601 <Field Object Message.obj>
		i.sendMessage(((Message) (obj1)));
	//  118  248:aload_0         
	//  119  249:getfield        #414 <Field Handler i>
	//  120  252:aload_3         
	//  121  253:invokevirtual   #2524 <Method boolean Handler.sendMessage(Message)>
	//  122  256:pop             
		aM = true;
	//  123  257:aload_0         
	//  124  258:iconst_1        
	//  125  259:putfield        #386 <Field boolean aM>
		j();
	//  126  262:aload_0         
	//  127  263:invokevirtual   #2038 <Method void j()>
		B();
	//  128  266:aload_0         
	//  129  267:invokespecial   #2607 <Method void B()>
		if(N.isZoomControlsEnabled() && c.isNeedUpdateZoomControllerState())
	//* 130  270:aload_0         
	//* 131  271:getfield        #565 <Field ag N>
	//* 132  274:invokevirtual   #2659 <Method boolean ag.isZoomControlsEnabled()>
	//* 133  277:ifeq            306
	//* 134  280:aload_0         
	//* 135  281:getfield        #322 <Field MapConfig c>
	//* 136  284:invokevirtual   #2662 <Method boolean MapConfig.isNeedUpdateZoomControllerState()>
	//* 137  287:ifeq            306
			X.invalidateZoomController(c.getSZ());
	//  138  290:aload_0         
	//  139  291:getfield        #714 <Field AMapWidgetListener X>
	//  140  294:aload_0         
	//  141  295:getfield        #322 <Field MapConfig c>
	//  142  298:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//  143  301:invokeinterface #2667 <Method void AMapWidgetListener.invalidateZoomController(float)>
		if(c.getChangeGridRatio() != 1.0D)
	//* 144  306:aload_0         
	//* 145  307:getfield        #322 <Field MapConfig c>
	//* 146  310:invokevirtual   #2670 <Method double MapConfig.getChangeGridRatio()>
	//* 147  313:dconst_1        
	//* 148  314:dcmpl           
	//* 149  315:ifeq            323
			g(true);
	//  150  318:aload_0         
	//  151  319:iconst_1        
	//  152  320:invokevirtual   #784 <Method void g(boolean)>
		boolean flag;
		Throwable throwable;
		if(N.isCompassEnabled() && (c.isTiltChanged() || c.isBearingChanged()))
	//* 153  323:aload_0         
	//* 154  324:getfield        #565 <Field ag N>
	//* 155  327:invokevirtual   #2673 <Method boolean ag.isCompassEnabled()>
	//* 156  330:ifeq            434
	//* 157  333:aload_0         
	//* 158  334:getfield        #322 <Field MapConfig c>
	//* 159  337:invokevirtual   #2676 <Method boolean MapConfig.isTiltChanged()>
	//* 160  340:ifne            429
	//* 161  343:aload_0         
	//* 162  344:getfield        #322 <Field MapConfig c>
	//* 163  347:invokevirtual   #2679 <Method boolean MapConfig.isBearingChanged()>
	//* 164  350:ifeq            434
	//* 165  353:goto            429
	//* 166  356:iload_1         
	//* 167  357:ifeq            369
	//* 168  360:aload_0         
	//* 169  361:getfield        #714 <Field AMapWidgetListener X>
	//* 170  364:invokeinterface #2682 <Method void AMapWidgetListener.invalidateCompassView()>
	//* 171  369:aload_0         
	//* 172  370:getfield        #565 <Field ag N>
	//* 173  373:invokevirtual   #2685 <Method boolean ag.isScaleControlsEnabled()>
	//* 174  376:ifeq            388
	//* 175  379:aload_0         
	//* 176  380:getfield        #714 <Field AMapWidgetListener X>
	//* 177  383:invokeinterface #2688 <Method void AMapWidgetListener.invalidateScaleView()>
	//* 178  388:goto            396
	//* 179  391:astore_2        
	//* 180  392:aload_2         
	//* 181  393:invokevirtual   #766 <Method void Throwable.printStackTrace()>
	//* 182  396:return          
	//* 183  397:aload_0         
	//* 184  398:getfield        #384 <Field boolean aL>
	//* 185  401:ifne            428
	//* 186  404:aload_0         
	//* 187  405:getfield        #545 <Field GLMapEngine f>
	//* 188  408:invokevirtual   #2691 <Method int GLMapEngine.getAnimateionsCount()>
	//* 189  411:ifne            428
	//* 190  414:aload_0         
	//* 191  415:getfield        #545 <Field GLMapEngine f>
	//* 192  418:invokevirtual   #1668 <Method int GLMapEngine.getStateMessageCount()>
	//* 193  421:ifne            428
	//* 194  424:aload_0         
	//* 195  425:invokevirtual   #2693 <Method void onChangeFinish()>
	//* 196  428:return          
			flag = true;
	//  197  429:iconst_1        
	//  198  430:istore_1        
		else
	//* 199  431:goto            356
			flag = false;
	//  200  434:iconst_0        
	//  201  435:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_369;
		X.invalidateCompassView();
		if(N.isScaleControlsEnabled())
			X.invalidateScaleView();
		break MISSING_BLOCK_LABEL_396;
		throwable;
		throwable.printStackTrace();
		return;
		if(!aL && f.getAnimateionsCount() == 0 && f.getStateMessageCount() == 0)
			onChangeFinish();
	//* 202  436:goto            356
	}

	public void p(int i1)
	{
		if(aD != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #552 <Field GLMapRender aD>
	//*   2    4:ifnull          14
			aD.renderPause();
	//    3    7:aload_0         
	//    4    8:getfield        #552 <Field GLMapRender aD>
	//    5   11:invokevirtual   #2246 <Method void GLMapRender.renderPause()>
		r(i1);
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokevirtual   #2695 <Method void r(int)>
	//    9   19:return          
	}

	public void q()
	{
		if(aD != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #552 <Field GLMapRender aD>
	//*   2    4:ifnull          16
			aD.resetTickCount(6);
	//    3    7:aload_0         
	//    4    8:getfield        #552 <Field GLMapRender aD>
	//    5   11:bipush          6
	//    6   13:invokevirtual   #902 <Method void GLMapRender.resetTickCount(int)>
	//    7   16:return          
	}

	public void q(int i1)
	{
		r(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #2695 <Method void r(int)>
		if(aD != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #552 <Field GLMapRender aD>
	//*   5    9:ifnull          19
			aD.renderResume();
	//    6   12:aload_0         
	//    7   13:getfield        #552 <Field GLMapRender aD>
	//    8   16:invokevirtual   #2698 <Method void GLMapRender.renderResume()>
	//    9   19:return          
	}

	public void queueEvent(Runnable runnable)
	{
		P.queueEvent(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #554 <Field t P>
	//    2    4:aload_1         
	//    3    5:invokeinterface #2699 <Method void t.queueEvent(Runnable)>
	//    4   10:return          
	}

	public void r()
	{
		if(aD != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #552 <Field GLMapRender aD>
	//*   2    4:ifnull          16
			aD.resetTickCount(30);
	//    3    7:aload_0         
	//    4    8:getfield        #552 <Field GLMapRender aD>
	//    5   11:bipush          30
	//    6   13:invokevirtual   #902 <Method void GLMapRender.resetTickCount(int)>
	//    7   16:return          
	}

	public void r(int i1)
	{
		queueEvent(new Runnable(i1) {

			public void run()
			{
				try
				{
					b.f.clearAllMessages(a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field b b>
			//    2    4:getfield        #32  <Field GLMapEngine b.f>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field int a>
			//    5   11:invokevirtual   #37  <Method void GLMapEngine.clearAllMessages(int)>
					b.f.clearAnimations(a, true);
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field b b>
			//    8   18:getfield        #32  <Field GLMapEngine b.f>
			//    9   21:aload_0         
			//   10   22:getfield        #21  <Field int a>
			//   11   25:iconst_1        
			//   12   26:invokevirtual   #41  <Method void GLMapEngine.clearAnimations(int, boolean)>
					return;
			//   13   29:return          
				}
				catch(Throwable throwable)
			//*  14   30:astore_1        
				{
					throwable.printStackTrace();
			//   15   31:aload_1         
			//   16   32:invokevirtual   #44  <Method void Throwable.printStackTrace()>
				}
			//   17   35:return          
			}

			final int a;
			final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field b b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #32  <Class b$19>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #2700 <Method void b$19(b, int)>
	//    6   10:invokevirtual   #1058 <Method void queueEvent(Runnable)>
	//    7   13:return          
	}

	public void reloadMap()
	{
	//    0    0:return          
	}

	public void removeGLOverlay(BaseMapOverlay basemapoverlay)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field GLMapEngine f>
	//*   2    4:ifnull          19
			f.getOverlayBundle(1).removeOverlay(basemapoverlay);
	//    3    7:aload_0         
	//    4    8:getfield        #545 <Field GLMapEngine f>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #1926 <Method GLOverlayBundle GLMapEngine.getOverlayBundle(int)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #2705 <Method void GLOverlayBundle.removeOverlay(BaseMapOverlay)>
	//    9   19:return          
	}

	public void removecache()
		throws RemoteException
	{
		removecache(((com.amap.api.maps.AMap.OnCacheRemoveListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #2709 <Method void removecache(com.amap.api.maps.AMap$OnCacheRemoveListener)>
	//    3    5:return          
	}

	public void removecache(com.amap.api.maps.AMap.OnCacheRemoveListener oncacheremovelistener)
		throws RemoteException
	{
		if(i != null && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #414 <Field Handler i>
	//*   2    4:ifnull          61
	//*   3    7:aload_0         
	//*   4    8:getfield        #545 <Field GLMapEngine f>
	//*   5   11:ifnull          61
		{
			try
			{
				oncacheremovelistener = ((com.amap.api.maps.AMap.OnCacheRemoveListener) (new d(e, oncacheremovelistener)));
	//    6   14:new             #113 <Class b$d>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #501 <Field Context e>
	//   11   23:aload_1         
	//   12   24:invokespecial   #2712 <Method void b$d(b, Context, com.amap.api.maps.AMap$OnCacheRemoveListener)>
	//   13   27:astore_1        
				i.removeCallbacks(((Runnable) (oncacheremovelistener)));
	//   14   28:aload_0         
	//   15   29:getfield        #414 <Field Handler i>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #2715 <Method void Handler.removeCallbacks(Runnable)>
				i.post(((Runnable) (oncacheremovelistener)));
	//   18   36:aload_0         
	//   19   37:getfield        #414 <Field Handler i>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #791 <Method boolean Handler.post(Runnable)>
	//   22   44:pop             
				return;
	//   23   45:return          
			}
			// Misplaced declaration of an exception variable
			catch(com.amap.api.maps.AMap.OnCacheRemoveListener oncacheremovelistener)
	//*  24   46:astore_1        
			{
				hm.c(((Throwable) (oncacheremovelistener)), "AMapDelegateImp", "removecache");
	//   25   47:aload_1         
	//   26   48:ldc2            #1165 <String "AMapDelegateImp">
	//   27   51:ldc2            #2716 <String "removecache">
	//   28   54:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
			}
			((Throwable) (oncacheremovelistener)).printStackTrace();
	//   29   57:aload_1         
	//   30   58:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
	//   31   61:return          
	}

	public void renderSurface(GL10 gl10)
	{
		drawFrame(gl10);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #2719 <Method void drawFrame(GL10)>
	//    3    5:return          
	}

	public void requestRender()
	{
		if(aD != null && !aD.isRenderPause())
	//*   0    0:aload_0         
	//*   1    1:getfield        #552 <Field GLMapRender aD>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:getfield        #552 <Field GLMapRender aD>
	//*   5   11:invokevirtual   #2723 <Method boolean GLMapRender.isRenderPause()>
	//*   6   14:ifne            26
			P.requestRender();
	//    7   17:aload_0         
	//    8   18:getfield        #554 <Field t P>
	//    9   21:invokeinterface #2725 <Method void t.requestRender()>
	//   10   26:return          
	}

	public void resetMinMaxZoomPreference()
	{
		c.resetMinMaxZoomPreference();
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:invokevirtual   #2728 <Method void MapConfig.resetMinMaxZoomPreference()>
		try
		{
			if(N.isZoomControlsEnabled() && c.isNeedUpdateZoomControllerState())
	//*   3    7:aload_0         
	//*   4    8:getfield        #565 <Field ag N>
	//*   5   11:invokevirtual   #2659 <Method boolean ag.isZoomControlsEnabled()>
	//*   6   14:ifeq            43
	//*   7   17:aload_0         
	//*   8   18:getfield        #322 <Field MapConfig c>
	//*   9   21:invokevirtual   #2662 <Method boolean MapConfig.isNeedUpdateZoomControllerState()>
	//*  10   24:ifeq            43
				X.invalidateZoomController(c.getSZ());
	//   11   27:aload_0         
	//   12   28:getfield        #714 <Field AMapWidgetListener X>
	//   13   31:aload_0         
	//   14   32:getfield        #322 <Field MapConfig c>
	//   15   35:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//   16   38:invokeinterface #2667 <Method void AMapWidgetListener.invalidateZoomController(float)>
			return;
	//   17   43:return          
		}
		catch(RemoteException remoteexception)
	//*  18   44:astore_1        
		{
			return;
	//   19   45:return          
		}
	}

	public void resetRenderTime()
	{
		if(aD != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #552 <Field GLMapRender aD>
	//*   2    4:ifnull          15
			aD.resetTickCount(2);
	//    3    7:aload_0         
	//    4    8:getfield        #552 <Field GLMapRender aD>
	//    5   11:iconst_2        
	//    6   12:invokevirtual   #902 <Method void GLMapRender.resetTickCount(int)>
	//    7   15:return          
	}

	public void s()
	{
		if(aD != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #552 <Field GLMapRender aD>
	//*   2    4:ifnull          15
			aD.resetTickCount(2);
	//    3    7:aload_0         
	//    4    8:getfield        #552 <Field GLMapRender aD>
	//    5   11:iconst_2        
	//    6   12:invokevirtual   #902 <Method void GLMapRender.resetTickCount(int)>
	//    7   15:return          
	}

	public void s(int i1)
	{
		an = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #351 <Field int an>
		int j1;
		byte byte0;
		if(i1 == 1)
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
		{
			i1 = 0;
	//    6   10:iconst_0        
	//    7   11:istore_1        
			j1 = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
			byte0 = 0;
	//   10   14:iconst_0        
	//   11   15:istore_3        
		} else
	//*  12   16:goto            86
		if(i1 == 2)
	//*  13   19:iload_1         
	//*  14   20:iconst_2        
	//*  15   21:icmpne          33
		{
			i1 = 1;
	//   16   24:iconst_1        
	//   17   25:istore_1        
			j1 = 0;
	//   18   26:iconst_0        
	//   19   27:istore_2        
			byte0 = 0;
	//   20   28:iconst_0        
	//   21   29:istore_3        
		} else
	//*  22   30:goto            86
		if(i1 == 3)
	//*  23   33:iload_1         
	//*  24   34:iconst_3        
	//*  25   35:icmpne          47
		{
			i1 = 0;
	//   26   38:iconst_0        
	//   27   39:istore_1        
			j1 = 1;
	//   28   40:iconst_1        
	//   29   41:istore_2        
			byte0 = 4;
	//   30   42:iconst_4        
	//   31   43:istore_3        
		} else
	//*  32   44:goto            86
		if(i1 == 4)
	//*  33   47:iload_1         
	//*  34   48:iconst_4        
	//*  35   49:icmpne          61
		{
			i1 = 0;
	//   36   52:iconst_0        
	//   37   53:istore_1        
			j1 = 0;
	//   38   54:iconst_0        
	//   39   55:istore_2        
			byte0 = 4;
	//   40   56:iconst_4        
	//   41   57:istore_3        
		} else
	//*  42   58:goto            86
		if(i1 == 5)
	//*  43   61:iload_1         
	//*  44   62:iconst_5        
	//*  45   63:icmpne          75
		{
			i1 = 2;
	//   46   66:iconst_2        
	//   47   67:istore_1        
			j1 = 0;
	//   48   68:iconst_0        
	//   49   69:istore_2        
			byte0 = 5;
	//   50   70:iconst_5        
	//   51   71:istore_3        
		} else
	//*  52   72:goto            86
		{
			try
			{
				an = 1;
	//   53   75:aload_0         
	//   54   76:iconst_1        
	//   55   77:putfield        #351 <Field int an>
			}
	//*  56   80:iconst_0        
	//*  57   81:istore_1        
	//*  58   82:iconst_0        
	//*  59   83:istore_2        
	//*  60   84:iconst_0        
	//*  61   85:istore_3        
	//*  62   86:aload_0         
	//*  63   87:getfield        #322 <Field MapConfig c>
	//*  64   90:iload_1         
	//*  65   91:invokevirtual   #2731 <Method void MapConfig.setMapStyleMode(int)>
	//*  66   94:aload_0         
	//*  67   95:getfield        #322 <Field MapConfig c>
	//*  68   98:iload_2         
	//*  69   99:invokevirtual   #2734 <Method void MapConfig.setMapStyleTime(int)>
	//*  70  102:aload_0         
	//*  71  103:getfield        #322 <Field MapConfig c>
	//*  72  106:iload_3         
	//*  73  107:invokevirtual   #2737 <Method void MapConfig.setMapStyleState(int)>
	//*  74  110:aload_0         
	//*  75  111:getfield        #322 <Field MapConfig c>
	//*  76  114:invokevirtual   #1734 <Method boolean MapConfig.isCustomStyleEnable()>
	//*  77  117:ifeq            150
	//*  78  120:aload_0         
	//*  79  121:iconst_1        
	//*  80  122:iload_1         
	//*  81  123:iload_2         
	//*  82  124:iload_3         
	//*  83  125:iconst_1        
	//*  84  126:iconst_0        
	//*  85  127:aconst_null     
	//*  86  128:invokevirtual   #1845 <Method void a(int, int, int, int, boolean, boolean, StyleItem[])>
	//*  87  131:aload_0         
	//*  88  132:getfield        #322 <Field MapConfig c>
	//*  89  135:iconst_0        
	//*  90  136:invokevirtual   #1798 <Method void MapConfig.setCustomStyleEnable(boolean)>
	//*  91  139:aload_0         
	//*  92  140:getfield        #565 <Field ag N>
	//*  93  143:iconst_1        
	//*  94  144:invokevirtual   #1804 <Method void ag.setLogoEnable(boolean)>
	//*  95  147:goto            181
	//*  96  150:aload_0         
	//*  97  151:getfield        #322 <Field MapConfig c>
	//*  98  154:invokevirtual   #980 <Method String MapConfig.getMapLanguage()>
	//*  99  157:ldc2            #982 <String "en">
	//* 100  160:invokevirtual   #988 <Method boolean String.equals(Object)>
	//* 101  163:ifeq            173
	//* 102  166:aload_0         
	//* 103  167:ldc2            #2739 <String "zh_cn">
	//* 104  170:invokevirtual   #2742 <Method void setMapLanguage(String)>
	//* 105  173:aload_0         
	//* 106  174:iconst_1        
	//* 107  175:iload_1         
	//* 108  176:iload_2         
	//* 109  177:iload_3         
	//* 110  178:invokevirtual   #2744 <Method void b(int, int, int, int)>
	//* 111  181:aload_0         
	//* 112  182:invokevirtual   #891 <Method void resetRenderTime()>
	//* 113  185:return          
			catch(Throwable throwable)
	//* 114  186:astore          4
			{
				hm.c(throwable, "AMapDelegateImp", "setMaptype");
	//  115  188:aload           4
	//  116  190:ldc2            #1165 <String "AMapDelegateImp">
	//  117  193:ldc2            #2746 <String "setMaptype">
	//  118  196:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
				throwable.printStackTrace();
	//  119  199:aload           4
	//  120  201:invokevirtual   #766 <Method void Throwable.printStackTrace()>
				return;
	//  121  204:return          
			}
			i1 = 0;
			j1 = 0;
			byte0 = 0;
		}
		c.setMapStyleMode(i1);
		c.setMapStyleTime(j1);
		c.setMapStyleState(((int) (byte0)));
		if(c.isCustomStyleEnable())
		{
			a(1, i1, j1, ((int) (byte0)), true, false, ((StyleItem []) (null)));
			c.setCustomStyleEnable(false);
			N.setLogoEnable(true);
			break MISSING_BLOCK_LABEL_181;
		}
		if(c.getMapLanguage().equals("en"))
			setMapLanguage("zh_cn");
		b(1, i1, j1, ((int) (byte0)));
		resetRenderTime();
		return;
	}

	public void set3DBuildingEnabled(boolean flag)
		throws RemoteException
	{
		p(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #2510 <Method void p(int)>
		c(1, flag);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:iload_1         
	//    6    8:invokevirtual   #2749 <Method void c(int, boolean)>
		q(1);
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #2513 <Method void q(int)>
	//   10   16:return          
	}

	public void setAMapGestureListener(AMapGestureListener amapgesturelistener)
	{
		if(aE != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #538 <Field o aE>
	//*   2    4:ifnull          20
		{
			I = amapgesturelistener;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #1753 <Field AMapGestureListener I>
			aE.a(amapgesturelistener);
	//    6   12:aload_0         
	//    7   13:getfield        #538 <Field o aE>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #2251 <Method void o.a(AMapGestureListener)>
		}
	//   10   20:return          
	}

	public void setCenterToPixel(int i1, int j1)
		throws RemoteException
	{
		Z = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #324 <Field boolean Z>
		aU = i1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #1200 <Field int aU>
		aV = j1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:putfield        #1202 <Field int aV>
		if(aP && aO)
	//*   9   15:aload_0         
	//*  10   16:getfield        #392 <Field boolean aP>
	//*  11   19:ifeq            95
	//*  12   22:aload_0         
	//*  13   23:getfield        #390 <Field boolean aO>
	//*  14   26:ifeq            95
		{
			if(c.getAnchorX() != aU || c.getAnchorY() != aV)
	//*  15   29:aload_0         
	//*  16   30:getfield        #322 <Field MapConfig c>
	//*  17   33:invokevirtual   #1087 <Method int MapConfig.getAnchorX()>
	//*  18   36:aload_0         
	//*  19   37:getfield        #1200 <Field int aU>
	//*  20   40:icmpne          57
	//*  21   43:aload_0         
	//*  22   44:getfield        #322 <Field MapConfig c>
	//*  23   47:invokevirtual   #1093 <Method int MapConfig.getAnchorY()>
	//*  24   50:aload_0         
	//*  25   51:getfield        #1202 <Field int aV>
	//*  26   54:icmpeq          82
			{
				c.setAnchorX(aU);
	//   27   57:aload_0         
	//   28   58:getfield        #322 <Field MapConfig c>
	//   29   61:aload_0         
	//   30   62:getfield        #1200 <Field int aU>
	//   31   65:invokevirtual   #1562 <Method void MapConfig.setAnchorX(int)>
				c.setAnchorY(aV);
	//   32   68:aload_0         
	//   33   69:getfield        #322 <Field MapConfig c>
	//   34   72:aload_0         
	//   35   73:getfield        #1202 <Field int aV>
	//   36   76:invokevirtual   #1565 <Method void MapConfig.setAnchorY(int)>
			} else
	//*  37   79:goto            83
			{
				return;
	//   38   82:return          
			}
			queueEvent(new Runnable() {

				public void run()
				{
					try
					{
						a.c.setAnchorX(Math.max(0, Math.min(com.amap.api.mapcore.util.b.o(a), a.g)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field b a>
				//    2    4:getfield        #28  <Field MapConfig b.c>
				//    3    7:iconst_0        
				//    4    8:aload_0         
				//    5    9:getfield        #17  <Field b a>
				//    6   12:invokestatic    #32  <Method int b.o(b)>
				//    7   15:aload_0         
				//    8   16:getfield        #17  <Field b a>
				//    9   19:getfield        #36  <Field int b.g>
				//   10   22:invokestatic    #42  <Method int Math.min(int, int)>
				//   11   25:invokestatic    #45  <Method int Math.max(int, int)>
				//   12   28:invokevirtual   #51  <Method void MapConfig.setAnchorX(int)>
						a.c.setAnchorY(Math.max(0, Math.min(com.amap.api.mapcore.util.b.p(a), a.h)));
				//   13   31:aload_0         
				//   14   32:getfield        #17  <Field b a>
				//   15   35:getfield        #28  <Field MapConfig b.c>
				//   16   38:iconst_0        
				//   17   39:aload_0         
				//   18   40:getfield        #17  <Field b a>
				//   19   43:invokestatic    #54  <Method int b.p(b)>
				//   20   46:aload_0         
				//   21   47:getfield        #17  <Field b a>
				//   22   50:getfield        #57  <Field int b.h>
				//   23   53:invokestatic    #42  <Method int Math.min(int, int)>
				//   24   56:invokestatic    #45  <Method int Math.max(int, int)>
				//   25   59:invokevirtual   #60  <Method void MapConfig.setAnchorY(int)>
						a.f.setParamater(1, 1100, a.c.getAnchorX(), a.c.getAnchorY(), 0, 0);
				//   26   62:aload_0         
				//   27   63:getfield        #17  <Field b a>
				//   28   66:getfield        #64  <Field GLMapEngine b.f>
				//   29   69:iconst_1        
				//   30   70:sipush          1100
				//   31   73:aload_0         
				//   32   74:getfield        #17  <Field b a>
				//   33   77:getfield        #28  <Field MapConfig b.c>
				//   34   80:invokevirtual   #68  <Method int MapConfig.getAnchorX()>
				//   35   83:aload_0         
				//   36   84:getfield        #17  <Field b a>
				//   37   87:getfield        #28  <Field MapConfig b.c>
				//   38   90:invokevirtual   #71  <Method int MapConfig.getAnchorY()>
				//   39   93:iconst_0        
				//   40   94:iconst_0        
				//   41   95:invokevirtual   #77  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
						com.amap.api.mapcore.util.b.c(a, true);
				//   42   98:aload_0         
				//   43   99:getfield        #17  <Field b a>
				//   44  102:iconst_1        
				//   45  103:invokestatic    #80  <Method boolean b.c(b, boolean)>
				//   46  106:pop             
						return;
				//   47  107:return          
					}
					catch(Throwable throwable)
				//*  48  108:astore_1        
					{
						throwable.printStackTrace();
				//   49  109:aload_1         
				//   50  110:invokevirtual   #83  <Method void Throwable.printStackTrace()>
					}
				//   51  113:return          
				}

				final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   39   83:aload_0         
	//   40   84:new             #66  <Class b$34>
	//   41   87:dup             
	//   42   88:aload_0         
	//   43   89:invokespecial   #2752 <Method void b$34(b)>
	//   44   92:invokevirtual   #1058 <Method void queueEvent(Runnable)>
		}
	//   45   95:return          
	}

	public void setCustomMapStyleID(String s1)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s1))) && !s1.equals(((Object) (c.getCustomStyleID()))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #1782 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            34
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #322 <Field MapConfig c>
	//*   6   12:invokevirtual   #1785 <Method String MapConfig.getCustomStyleID()>
	//*   7   15:invokevirtual   #988 <Method boolean String.equals(Object)>
	//*   8   18:ifne            34
		{
			c.setCustomStyleID(s1);
	//    9   21:aload_0         
	//   10   22:getfield        #322 <Field MapConfig c>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #2756 <Method void MapConfig.setCustomStyleID(String)>
			O = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #309 <Field boolean O>
		}
	//   16   34:return          
	}

	public void setCustomMapStylePath(String s1)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s1))) && !s1.equals(((Object) (c.getCustomStylePath()))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #1782 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            34
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #322 <Field MapConfig c>
	//*   6   12:invokevirtual   #1776 <Method String MapConfig.getCustomStylePath()>
	//*   7   15:invokevirtual   #988 <Method boolean String.equals(Object)>
	//*   8   18:ifne            34
		{
			c.setCustomStylePath(s1);
	//    9   21:aload_0         
	//   10   22:getfield        #322 <Field MapConfig c>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #2760 <Method void MapConfig.setCustomStylePath(String)>
			O = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #309 <Field boolean O>
		}
	//   16   34:return          
	}

	public void setCustomRenderer(CustomRenderer customrenderer)
		throws RemoteException
	{
		av = customrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1579 <Field CustomRenderer av>
	//    3    5:return          
	}

	public void setCustomTextureResourcePath(String s1)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #1782 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            15
			c.setCustomTextureResourcePath(s1);
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #2763 <Method void MapConfig.setCustomTextureResourcePath(String)>
	//    7   15:return          
	}

	public void setIndoorBuildingInfo(IndoorBuildingInfo indoorbuildinginfo)
		throws RemoteException
	{
		if(V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(indoorbuildinginfo == null || indoorbuildinginfo.activeFloorName == null || indoorbuildinginfo.poiid == null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          26
	//*   6   12:aload_1         
	//*   7   13:getfield        #2768 <Field String IndoorBuildingInfo.activeFloorName>
	//*   8   16:ifnull          26
	//*   9   19:aload_1         
	//*  10   20:getfield        #2769 <Field String IndoorBuildingInfo.poiid>
	//*  11   23:ifnonnull       27
		{
			return;
	//   12   26:return          
		} else
		{
			d = (au)indoorbuildinginfo;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:checkcast       #2502 <Class au>
	//   16   32:putfield        #2500 <Field au d>
			resetRenderTime();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #891 <Method void resetRenderTime()>
			queueEvent(new Runnable() {

				public void run()
				{
					if(a.f != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field b a>
				//*   2    4:getfield        #26  <Field GLMapEngine b.f>
				//*   3    7:ifnull          51
						a.f.setIndoorBuildingToBeActive(1, a.d.activeFloorName, a.d.activeFloorIndex, a.d.poiid);
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field b a>
				//    6   14:getfield        #26  <Field GLMapEngine b.f>
				//    7   17:iconst_1        
				//    8   18:aload_0         
				//    9   19:getfield        #17  <Field b a>
				//   10   22:getfield        #30  <Field au b.d>
				//   11   25:getfield        #36  <Field String au.activeFloorName>
				//   12   28:aload_0         
				//   13   29:getfield        #17  <Field b a>
				//   14   32:getfield        #30  <Field au b.d>
				//   15   35:getfield        #40  <Field int au.activeFloorIndex>
				//   16   38:aload_0         
				//   17   39:getfield        #17  <Field b a>
				//   18   42:getfield        #30  <Field au b.d>
				//   19   45:getfield        #43  <Field String au.poiid>
				//   20   48:invokevirtual   #49  <Method void GLMapEngine.setIndoorBuildingToBeActive(int, String, int, String)>
				//   21   51:return          
				}

				final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   19   39:aload_0         
	//   20   40:new             #68  <Class b$35>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:invokespecial   #2770 <Method void b$35(b)>
	//   24   48:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   25   51:return          
		}
	}

	public void setIndoorEnabled(boolean flag)
		throws RemoteException
	{
		if(aO && !V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            166
	//*   3    7:aload_0         
	//*   4    8:getfield        #313 <Field boolean V>
	//*   5   11:ifne            166
		{
			c.setIndoorEnable(flag);
	//    6   14:aload_0         
	//    7   15:getfield        #322 <Field MapConfig c>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #2774 <Method void MapConfig.setIndoorEnable(boolean)>
			resetRenderTime();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #891 <Method void resetRenderTime()>
			if(flag)
	//*  12   26:iload_1         
	//*  13   27:ifeq            55
			{
				if(f != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #545 <Field GLMapEngine f>
	//*  16   34:ifnull          138
					f.setParamater(1, 1026, 1, 0, 0, 0);
	//   17   37:aload_0         
	//   18   38:getfield        #545 <Field GLMapEngine f>
	//   19   41:iconst_1        
	//   20   42:sipush          1026
	//   21   45:iconst_1        
	//   22   46:iconst_0        
	//   23   47:iconst_0        
	//   24   48:iconst_0        
	//   25   49:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			} else
	//*  26   52:goto            138
			{
				if(f != null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #545 <Field GLMapEngine f>
	//*  29   59:ifnull          77
					f.setParamater(1, 1026, 0, 0, 0, 0);
	//   30   62:aload_0         
	//   31   63:getfield        #545 <Field GLMapEngine f>
	//   32   66:iconst_1        
	//   33   67:sipush          1026
	//   34   70:iconst_0        
	//   35   71:iconst_0        
	//   36   72:iconst_0        
	//   37   73:iconst_0        
	//   38   74:invokevirtual   #1193 <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				MapConfig mapconfig = c;
	//   39   77:aload_0         
	//   40   78:getfield        #322 <Field MapConfig c>
	//   41   81:astore_3        
				float f1;
				if(c.isSetLimitZoomLevel())
	//*  42   82:aload_0         
	//*  43   83:getfield        #322 <Field MapConfig c>
	//*  44   86:invokevirtual   #2186 <Method boolean MapConfig.isSetLimitZoomLevel()>
	//*  45   89:ifeq            103
					f1 = c.getMaxZoomLevel();
	//   46   92:aload_0         
	//   47   93:getfield        #322 <Field MapConfig c>
	//   48   96:invokevirtual   #1856 <Method float MapConfig.getMaxZoomLevel()>
	//   49   99:fstore_2        
				else
	//*  50  100:goto            107
					f1 = 20F;
	//   51  103:ldc2            #2410 <Float 20F>
	//   52  106:fstore_2        
				mapconfig.maxZoomLevel = f1;
	//   53  107:aload_3         
	//   54  108:fload_2         
	//   55  109:putfield        #2777 <Field float MapConfig.maxZoomLevel>
				if(N.isZoomControlsEnabled())
	//*  56  112:aload_0         
	//*  57  113:getfield        #565 <Field ag N>
	//*  58  116:invokevirtual   #2659 <Method boolean ag.isZoomControlsEnabled()>
	//*  59  119:ifeq            138
					X.invalidateZoomController(c.getSZ());
	//   60  122:aload_0         
	//   61  123:getfield        #714 <Field AMapWidgetListener X>
	//   62  126:aload_0         
	//   63  127:getfield        #322 <Field MapConfig c>
	//   64  130:invokevirtual   #1234 <Method float MapConfig.getSZ()>
	//   65  133:invokeinterface #2667 <Method void AMapWidgetListener.invalidateZoomController(float)>
			}
			if(N.isIndoorSwitchEnabled())
	//*  66  138:aload_0         
	//*  67  139:getfield        #565 <Field ag N>
	//*  68  142:invokevirtual   #2780 <Method boolean ag.isIndoorSwitchEnabled()>
	//*  69  145:ifeq            190
			{
				i.post(new Runnable(flag) {

					public void run()
					{
						if(a)
					//*   0    0:aload_0         
					//*   1    1:getfield        #21  <Field boolean a>
					//*   2    4:ifeq            16
						{
							b.b(true);
					//    3    7:aload_0         
					//    4    8:getfield        #19  <Field b b>
					//    5   11:iconst_1        
					//    6   12:invokevirtual   #28  <Method void b.b(boolean)>
							return;
					//    7   15:return          
						}
						if(com.amap.api.mapcore.util.b.e(b) != null && com.amap.api.mapcore.util.b.e(b).e() != null)
					//*   8   16:aload_0         
					//*   9   17:getfield        #19  <Field b b>
					//*  10   20:invokestatic    #32  <Method fq b.e(b)>
					//*  11   23:ifnull          53
					//*  12   26:aload_0         
					//*  13   27:getfield        #19  <Field b b>
					//*  14   30:invokestatic    #32  <Method fq b.e(b)>
					//*  15   33:invokevirtual   #37  <Method fo fq.e()>
					//*  16   36:ifnull          53
							com.amap.api.mapcore.util.b.e(b).e().a(false);
					//   17   39:aload_0         
					//   18   40:getfield        #19  <Field b b>
					//   19   43:invokestatic    #32  <Method fq b.e(b)>
					//   20   46:invokevirtual   #37  <Method fo fq.e()>
					//   21   49:iconst_0        
					//   22   50:invokevirtual   #41  <Method void fo.a(boolean)>
					//   23   53:return          
					}

					final boolean a;
					final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field b b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   70  148:aload_0         
	//   71  149:getfield        #414 <Field Handler i>
	//   72  152:new             #54  <Class b$29>
	//   73  155:dup             
	//   74  156:aload_0         
	//   75  157:iload_1         
	//   76  158:invokespecial   #2783 <Method void b$29(b, boolean)>
	//   77  161:invokevirtual   #791 <Method boolean Handler.post(Runnable)>
	//   78  164:pop             
				return;
	//   79  165:return          
			}
		} else
		{
			bl.c = flag;
	//   80  166:aload_0         
	//   81  167:getfield        #452 <Field b$a bl>
	//   82  170:iload_1         
	//   83  171:putfield        #1632 <Field boolean b$a.c>
			bl.b = true;
	//   84  174:aload_0         
	//   85  175:getfield        #452 <Field b$a bl>
	//   86  178:iconst_1        
	//   87  179:putfield        #1468 <Field boolean b$a.b>
			bl.g = 1;
	//   88  182:aload_0         
	//   89  183:getfield        #452 <Field b$a bl>
	//   90  186:iconst_1        
	//   91  187:putfield        #1460 <Field int b$a.g>
		}
	//   92  190:return          
	}

	public void setInfoWindowAdapter(com.amap.api.maps.AMap.CommonInfoWindowAdapter commoninfowindowadapter)
		throws RemoteException
	{
		if(V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(J != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #638 <Field aw J>
	//*   6   12:ifnull          23
			J.a(commoninfowindowadapter);
	//    7   15:aload_0         
	//    8   16:getfield        #638 <Field aw J>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #2787 <Method void aw.a(com.amap.api.maps.AMap$CommonInfoWindowAdapter)>
	//   11   23:return          
	}

	public void setInfoWindowAdapter(com.amap.api.maps.AMap.InfoWindowAdapter infowindowadapter)
		throws RemoteException
	{
		if(V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(J != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #638 <Field aw J>
	//*   6   12:ifnull          23
			J.a(infowindowadapter);
	//    7   15:aload_0         
	//    8   16:getfield        #638 <Field aw J>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #2790 <Method void aw.a(com.amap.api.maps.AMap$InfoWindowAdapter)>
	//   11   23:return          
	}

	public void setLoadOfflineData(boolean flag)
		throws RemoteException
	{
		queueEvent(new Runnable(flag) {

			public void run()
			{
				if(b.f != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field b b>
			//*   2    4:getfield        #30  <Field GLMapEngine b.f>
			//*   3    7:ifnull          44
				{
					GLMapEngine glmapengine = b.f;
			//    4   10:aload_0         
			//    5   11:getfield        #19  <Field b b>
			//    6   14:getfield        #30  <Field GLMapEngine b.f>
			//    7   17:astore_2        
					int i1;
					if(a)
			//*   8   18:aload_0         
			//*   9   19:getfield        #21  <Field boolean a>
			//*  10   22:ifeq            30
						i1 = 1;
			//   11   25:iconst_1        
			//   12   26:istore_1        
					else
			//*  13   27:goto            32
						i1 = 0;
			//   14   30:iconst_0        
			//   15   31:istore_1        
					glmapengine.setParamater(1, 2601, i1, 0, 0, 0);
			//   16   32:aload_2         
			//   17   33:iconst_1        
			//   18   34:sipush          2601
			//   19   37:iload_1         
			//   20   38:iconst_0        
			//   21   39:iconst_0        
			//   22   40:iconst_0        
			//   23   41:invokevirtual   #36  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				}
			//   24   44:return          
			}

			final boolean a;
			final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field b b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #58  <Class b$30>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #2792 <Method void b$30(b, boolean)>
	//    6   10:invokevirtual   #1058 <Method void queueEvent(Runnable)>
	//    7   13:return          
	}

	public void setLocationSource(LocationSource locationsource)
		throws RemoteException
	{
		boolean flag;
		try
		{
			flag = V;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field boolean V>
	//    2    4:istore_2        
		}
	//*   3    5:iload_2         
	//*   4    6:ifeq            10
	//*   5    9:return          
	//*   6   10:aload_0         
	//*   7   11:getfield        #658 <Field LocationSource ac>
	//*   8   14:ifnull          36
	//*   9   17:aload_0         
	//*  10   18:getfield        #658 <Field LocationSource ac>
	//*  11   21:instanceof      #655 <Class ax>
	//*  12   24:ifeq            36
	//*  13   27:aload_0         
	//*  14   28:getfield        #658 <Field LocationSource ac>
	//*  15   31:invokeinterface #2243 <Method void LocationSource.deactivate()>
	//*  16   36:aload_0         
	//*  17   37:aload_1         
	//*  18   38:putfield        #658 <Field LocationSource ac>
	//*  19   41:aload_1         
	//*  20   42:ifnull          59
	//*  21   45:aload_0         
	//*  22   46:getfield        #570 <Field fq Q>
	//*  23   49:invokevirtual   #2797 <Method fp fq.f()>
	//*  24   52:iconst_1        
	//*  25   53:invokevirtual   #2800 <Method void fp.a(boolean)>
	//*  26   56:goto            70
	//*  27   59:aload_0         
	//*  28   60:getfield        #570 <Field fq Q>
	//*  29   63:invokevirtual   #2797 <Method fp fq.f()>
	//*  30   66:iconst_0        
	//*  31   67:invokevirtual   #2800 <Method void fp.a(boolean)>
	//*  32   70:return          
		// Misplaced declaration of an exception variable
		catch(LocationSource locationsource)
	//*  33   71:astore_1        
		{
			hm.c(((Throwable) (locationsource)), "AMapDelegateImp", "setLocationSource");
	//   34   72:aload_1         
	//   35   73:ldc2            #1165 <String "AMapDelegateImp">
	//   36   76:ldc2            #2801 <String "setLocationSource">
	//   37   79:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
			((Throwable) (locationsource)).printStackTrace();
	//   38   82:aload_1         
	//   39   83:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			return;
	//   40   86:return          
		}
		if(flag)
			return;
		if(ac != null && (ac instanceof ax))
			ac.deactivate();
		ac = locationsource;
		if(locationsource == null)
			break MISSING_BLOCK_LABEL_59;
		Q.f().a(true);
		break MISSING_BLOCK_LABEL_70;
		Q.f().a(false);
	}

	public void setMapCustomEnable(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			E();
	//    2    4:aload_0         
	//    3    5:invokespecial   #2804 <Method void E()>
		a(flag, false);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #2806 <Method void a(boolean, boolean)>
	//    8   14:return          
	}

	public void setMapLanguage(String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))) || c == null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #1782 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #322 <Field MapConfig c>
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		if(c.isCustomStyleEnable())
	//*   7   15:aload_0         
	//*   8   16:getfield        #322 <Field MapConfig c>
	//*   9   19:invokevirtual   #1734 <Method boolean MapConfig.isCustomStyleEnable()>
	//*  10   22:ifeq            26
			return;
	//   11   25:return          
		if(c.getMapLanguage().equals(((Object) (s1))))
	//*  12   26:aload_0         
	//*  13   27:getfield        #322 <Field MapConfig c>
	//*  14   30:invokevirtual   #980 <Method String MapConfig.getMapLanguage()>
	//*  15   33:aload_1         
	//*  16   34:invokevirtual   #988 <Method boolean String.equals(Object)>
	//*  17   37:ifeq            41
			return;
	//   18   40:return          
		boolean flag;
		if(!s1.equals("en"))
	//*  19   41:aload_1         
	//*  20   42:ldc2            #982 <String "en">
	//*  21   45:invokevirtual   #988 <Method boolean String.equals(Object)>
	//*  22   48:ifne            56
			flag = true;
	//   23   51:iconst_1        
	//   24   52:istore_2        
		else
	//*  25   53:goto            58
			flag = false;
	//   26   56:iconst_0        
	//   27   57:istore_2        
		if(flag)
	//*  28   58:iload_2         
	//*  29   59:ifeq            80
		{
			c.setMapLanguage("zh_cn");
	//   30   62:aload_0         
	//   31   63:getfield        #322 <Field MapConfig c>
	//   32   66:ldc2            #2739 <String "zh_cn">
	//   33   69:invokevirtual   #2807 <Method void MapConfig.setMapLanguage(String)>
			au = 0;
	//   34   72:aload_0         
	//   35   73:iconst_0        
	//   36   74:putfield        #361 <Field int au>
		} else
	//*  37   77:goto            118
		{
			if(an != 1)
	//*  38   80:aload_0         
	//*  39   81:getfield        #351 <Field int an>
	//*  40   84:iconst_1        
	//*  41   85:icmpeq          101
				try
				{
					setMapType(1);
	//   42   88:aload_0         
	//   43   89:iconst_1        
	//   44   90:invokevirtual   #2810 <Method void setMapType(int)>
				}
	//*  45   93:goto            101
				// Misplaced declaration of an exception variable
				catch(String s1)
	//*  46   96:astore_1        
				{
					((Throwable) (s1)).printStackTrace();
	//   47   97:aload_1         
	//   48   98:invokevirtual   #766 <Method void Throwable.printStackTrace()>
				}
			c.setMapLanguage("en");
	//   49  101:aload_0         
	//   50  102:getfield        #322 <Field MapConfig c>
	//   51  105:ldc2            #982 <String "en">
	//   52  108:invokevirtual   #2807 <Method void MapConfig.setMapLanguage(String)>
			au = -10000;
	//   53  111:aload_0         
	//   54  112:sipush          -10000
	//   55  115:putfield        #361 <Field int au>
		}
		try
		{
			a(getCameraPosition());
	//   56  118:aload_0         
	//   57  119:aload_0         
	//   58  120:invokevirtual   #1765 <Method CameraPosition getCameraPosition()>
	//   59  123:invokespecial   #976 <Method void a(CameraPosition)>
		}
	//*  60  126:goto            134
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  61  129:astore_1        
		{
			((Throwable) (s1)).printStackTrace();
	//   62  130:aload_1         
	//   63  131:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
		R.a(c.getMapLanguage());
	//   64  134:aload_0         
	//   65  135:getfield        #594 <Field af R>
	//   66  138:aload_0         
	//   67  139:getfield        #322 <Field MapConfig c>
	//   68  142:invokevirtual   #980 <Method String MapConfig.getMapLanguage()>
	//   69  145:invokevirtual   #2811 <Method void af.a(String)>
	//   70  148:return          
	}

	public void setMapStatusLimits(LatLngBounds latlngbounds)
	{
		try
		{
			c.setLimitLatLngBounds(latlngbounds);
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2816 <Method void MapConfig.setLimitLatLngBounds(LatLngBounds)>
			F();
	//    4    8:aload_0         
	//    5    9:invokespecial   #2818 <Method void F()>
			return;
	//    6   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLngBounds latlngbounds)
	//*   7   13:astore_1        
		{
			((Throwable) (latlngbounds)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
	//   10   18:return          
	}

	public void setMapTextEnable(boolean flag)
		throws RemoteException
	{
		if(aO && aP)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:getfield        #392 <Field boolean aP>
	//*   5   11:ifeq            32
		{
			resetRenderTime();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #891 <Method void resetRenderTime()>
			queueEvent(new Runnable(flag) {

				public void run()
				{
					try
					{
						if(a)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field boolean a>
				//*   2    4:ifeq            28
						{
							b.f.setParamater(1, 1024, 1, 0, 0, 0);
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field b b>
				//    5   11:getfield        #32  <Field GLMapEngine b.f>
				//    6   14:iconst_1        
				//    7   15:sipush          1024
				//    8   18:iconst_1        
				//    9   19:iconst_0        
				//   10   20:iconst_0        
				//   11   21:iconst_0        
				//   12   22:invokevirtual   #38  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
							break MISSING_BLOCK_LABEL_46;
				//   13   25:goto            46
						}
					}
				//*  14   28:aload_0         
				//*  15   29:getfield        #19  <Field b b>
				//*  16   32:getfield        #32  <Field GLMapEngine b.f>
				//*  17   35:iconst_1        
				//*  18   36:sipush          1024
				//*  19   39:iconst_0        
				//*  20   40:iconst_0        
				//*  21   41:iconst_0        
				//*  22   42:iconst_0        
				//*  23   43:invokevirtual   #38  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				//*  24   46:return          
					catch(Throwable throwable)
				//*  25   47:astore_1        
					{
						throwable.printStackTrace();
				//   26   48:aload_1         
				//   27   49:invokevirtual   #41  <Method void Throwable.printStackTrace()>
						return;
				//   28   52:return          
					}
					b.f.setParamater(1, 1024, 0, 0, 0, 0);
				}

				final boolean a;
				final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field b b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   18:aload_0         
	//    9   19:new             #60  <Class b$31>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:invokespecial   #2820 <Method void b$31(b, boolean)>
	//   14   28:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   15   31:return          
		} else
		{
			bh.c = flag;
	//   16   32:aload_0         
	//   17   33:getfield        #440 <Field b$a bh>
	//   18   36:iload_1         
	//   19   37:putfield        #1632 <Field boolean b$a.c>
			bh.b = true;
	//   20   40:aload_0         
	//   21   41:getfield        #440 <Field b$a bh>
	//   22   44:iconst_1        
	//   23   45:putfield        #1468 <Field boolean b$a.b>
			bh.g = 1;
	//   24   48:aload_0         
	//   25   49:getfield        #440 <Field b$a bh>
	//   26   52:iconst_1        
	//   27   53:putfield        #1460 <Field int b$a.g>
			return;
	//   28   56:return          
		}
	}

	public void setMapTextZIndex(int i1)
		throws RemoteException
	{
		au = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #361 <Field int au>
	//    3    5:return          
	}

	public void setMapType(int i1)
		throws RemoteException
	{
		if(aC != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #508 <Field f aC>
	//*   2    4:ifnull          26
			aC.a(new aa(1, ((Object) (Integer.valueOf(i1)))));
	//    3    7:aload_0         
	//    4    8:getfield        #508 <Field f aC>
	//    5   11:new             #1554 <Class aa>
	//    6   14:dup             
	//    7   15:iconst_1        
	//    8   16:iload_1         
	//    9   17:invokestatic    #2826 <Method Integer Integer.valueOf(int)>
	//   10   20:invokespecial   #2829 <Method void aa(int, Object)>
	//   11   23:invokevirtual   #1559 <Method void f.a(aa)>
		an = i1;
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:putfield        #351 <Field int an>
	//   15   31:return          
	}

	public void setMaskLayerParams(int i1, int j1, int k1, int l1, int i2, long l2)
	{
		float f1;
		if(aw == null)
			break MISSING_BLOCK_LABEL_174;
	//    0    0:aload_0         
	//    1    1:getfield        #648 <Field z aw>
	//    2    4:ifnull          174
		f1 = (float)l1 / 255F;
	//    3    7:iload           4
	//    4    9:i2f             
	//    5   10:ldc2            #2832 <Float 255F>
	//    6   13:fdiv            
	//    7   14:fstore          8
		if(i2 == -1)
	//*   8   16:iload           5
	//*   9   18:iconst_m1       
	//*  10   19:icmpne          52
		{
			GLAlphaAnimation glalphaanimation;
			GLAlphaAnimation glalphaanimation1;
			try
			{
				glalphaanimation = new GLAlphaAnimation(f1, 0.0F);
	//   11   22:new             #2834 <Class GLAlphaAnimation>
	//   12   25:dup             
	//   13   26:fload           8
	//   14   28:fconst_0        
	//   15   29:invokespecial   #2837 <Method void GLAlphaAnimation(float, float)>
	//   16   32:astore          9
				glalphaanimation.setAnimationListener(new com.amap.api.maps.model.animation.Animation.AnimationListener(i2) {

					public void onAnimationEnd()
					{
						b.i.post(new Runnable(this) {

							public void run()
							{
								com.amap.api.mapcore.util.b.b(a.b, a.a);
							//    0    0:aload_0         
							//    1    1:getfield        #17  <Field b$36 a>
							//    2    4:getfield        #25  <Field b b$36.b>
							//    3    7:aload_0         
							//    4    8:getfield        #17  <Field b$36 a>
							//    5   11:getfield        #28  <Field int b$36.a>
							//    6   14:invokestatic    #33  <Method int b.b(b, int)>
							//    7   17:pop             
								if(com.amap.api.mapcore.util.b.e(a.b) != null)
							//*   8   18:aload_0         
							//*   9   19:getfield        #17  <Field b$36 a>
							//*  10   22:getfield        #25  <Field b b$36.b>
							//*  11   25:invokestatic    #37  <Method fq b.e(b)>
							//*  12   28:ifnull          48
									com.amap.api.mapcore.util.b.e(a.b).h().setVisibility(0);
							//   13   31:aload_0         
							//   14   32:getfield        #17  <Field b$36 a>
							//   15   35:getfield        #25  <Field b b$36.b>
							//   16   38:invokestatic    #37  <Method fq b.e(b)>
							//   17   41:invokevirtual   #43  <Method fs fq.h()>
							//   18   44:iconst_0        
							//   19   45:invokevirtual   #49  <Method void fs.setVisibility(int)>
							//   20   48:return          
							}

							final _cls36 a;

			
			{
				a = _pcls36;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field b$36 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
						}
);
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field b b>
					//    2    4:getfield        #32  <Field Handler b.i>
					//    3    7:new             #13  <Class b$36$1>
					//    4   10:dup             
					//    5   11:aload_0         
					//    6   12:invokespecial   #35  <Method void b$36$1(b$36)>
					//    7   15:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
					//    8   18:pop             
					//    9   19:return          
					}

					public void onAnimationStart()
					{
					//    0    0:return          
					}

					final int a;
					final com.amap.api.mapcore.util.b b;

			
			{
				b = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field b b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   17   34:aload           9
	//   18   36:new             #70  <Class b$36>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:iload           5
	//   22   43:invokespecial   #2838 <Method void b$36(b, int)>
	//   23   46:invokevirtual   #2842 <Method void GLAlphaAnimation.setAnimationListener(com.amap.api.maps.model.animation.Animation$AnimationListener)>
			}
	//*  24   49:goto            134
	//*  25   52:aload_0         
	//*  26   53:iload           5
	//*  27   55:putfield        #363 <Field int ax>
	//*  28   58:new             #2834 <Class GLAlphaAnimation>
	//*  29   61:dup             
	//*  30   62:fconst_0        
	//*  31   63:fload           8
	//*  32   65:invokespecial   #2837 <Method void GLAlphaAnimation(float, float)>
	//*  33   68:astore          10
	//*  34   70:fload           8
	//*  35   72:ldc2            #2843 <Float 0.2F>
	//*  36   75:fcmpl           
	//*  37   76:ifle            108
	//*  38   79:aload           10
	//*  39   81:astore          9
	//*  40   83:aload_0         
	//*  41   84:getfield        #570 <Field fq Q>
	//*  42   87:ifnull          134
	//*  43   90:aload_0         
	//*  44   91:getfield        #570 <Field fq Q>
	//*  45   94:invokevirtual   #2846 <Method fs fq.h()>
	//*  46   97:iconst_4        
	//*  47   98:invokevirtual   #2851 <Method void fs.setVisibility(int)>
	//*  48  101:aload           10
	//*  49  103:astore          9
	//*  50  105:goto            134
	//*  51  108:aload           10
	//*  52  110:astore          9
	//*  53  112:aload_0         
	//*  54  113:getfield        #570 <Field fq Q>
	//*  55  116:ifnull          134
	//*  56  119:aload_0         
	//*  57  120:getfield        #570 <Field fq Q>
	//*  58  123:invokevirtual   #2846 <Method fs fq.h()>
	//*  59  126:iconst_0        
	//*  60  127:invokevirtual   #2851 <Method void fs.setVisibility(int)>
	//*  61  130:aload           10
	//*  62  132:astore          9
	//*  63  134:aload           9
	//*  64  136:new             #2853 <Class LinearInterpolator>
	//*  65  139:dup             
	//*  66  140:invokespecial   #2854 <Method void LinearInterpolator()>
	//*  67  143:invokevirtual   #2858 <Method void GLAlphaAnimation.setInterpolator(android.view.animation.Interpolator)>
	//*  68  146:aload           9
	//*  69  148:lload           6
	//*  70  150:invokevirtual   #2861 <Method void GLAlphaAnimation.setDuration(long)>
	//*  71  153:aload_0         
	//*  72  154:getfield        #648 <Field z aw>
	//*  73  157:iload_1         
	//*  74  158:iload_2         
	//*  75  159:iload_3         
	//*  76  160:iload           4
	//*  77  162:invokevirtual   #2863 <Method void z.a(int, int, int, int)>
	//*  78  165:aload_0         
	//*  79  166:getfield        #648 <Field z aw>
	//*  80  169:aload           9
	//*  81  171:invokevirtual   #2866 <Method void z.a(GLAlphaAnimation)>
	//*  82  174:return          
			catch(Throwable throwable)
	//*  83  175:astore          9
			{
				throwable.printStackTrace();
	//   84  177:aload           9
	//   85  179:invokevirtual   #766 <Method void Throwable.printStackTrace()>
				return;
	//   86  182:return          
			}
			break MISSING_BLOCK_LABEL_134;
		}
		ax = i2;
		glalphaanimation1 = new GLAlphaAnimation(0.0F, f1);
		if(f1 <= 0.2F)
			break MISSING_BLOCK_LABEL_108;
		glalphaanimation = glalphaanimation1;
		if(Q == null)
			break MISSING_BLOCK_LABEL_134;
		Q.h().setVisibility(4);
		glalphaanimation = glalphaanimation1;
		break MISSING_BLOCK_LABEL_134;
		glalphaanimation = glalphaanimation1;
		if(Q == null)
			break MISSING_BLOCK_LABEL_134;
		Q.h().setVisibility(0);
		glalphaanimation = glalphaanimation1;
		glalphaanimation.setInterpolator(((android.view.animation.Interpolator) (new LinearInterpolator())));
		glalphaanimation.setDuration(l2);
		aw.a(i1, j1, k1, l1);
		aw.a(glalphaanimation);
	}

	public void setMaxZoomLevel(float f1)
	{
		c.setMaxZoomLevel(f1);
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #2869 <Method void MapConfig.setMaxZoomLevel(float)>
	//    4    8:return          
	}

	public void setMinZoomLevel(float f1)
	{
		c.setMinZoomLevel(f1);
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MapConfig c>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #2872 <Method void MapConfig.setMinZoomLevel(float)>
	//    4    8:return          
	}

	public void setMyLocationEnabled(boolean flag)
		throws RemoteException
	{
		if(V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		fp fp1;
		if(Q == null)
			break MISSING_BLOCK_LABEL_114;
	//    4    8:aload_0         
	//    5    9:getfield        #570 <Field fq Q>
	//    6   12:ifnull          114
		fp1 = Q.f();
	//    7   15:aload_0         
	//    8   16:getfield        #570 <Field fq Q>
	//    9   19:invokevirtual   #2797 <Method fp fq.f()>
	//   10   22:astore_2        
		if(ac == null)
			break MISSING_BLOCK_LABEL_109;
	//   11   23:aload_0         
	//   12   24:getfield        #658 <Field LocationSource ac>
	//   13   27:ifnull          109
		if(flag)
	//*  14   30:iload_1         
	//*  15   31:ifeq            78
		{
			try
			{
				ac.activate(((com.amap.api.maps.LocationSource.OnLocationChangedListener) (F)));
	//   16   34:aload_0         
	//   17   35:getfield        #658 <Field LocationSource ac>
	//   18   38:aload_0         
	//   19   39:getfield        #627 <Field g F>
	//   20   42:invokeinterface #2877 <Method void LocationSource.activate(com.amap.api.maps.LocationSource$OnLocationChangedListener)>
				fp1.a(true);
	//   21   47:aload_2         
	//   22   48:iconst_1        
	//   23   49:invokevirtual   #2800 <Method void fp.a(boolean)>
				if(ab == null)
	//*  24   52:aload_0         
	//*  25   53:getfield        #1635 <Field dk ab>
	//*  26   56:ifnonnull       114
					ab = new dk(((s) (this)), e);
	//   27   59:aload_0         
	//   28   60:new             #1637 <Class dk>
	//   29   63:dup             
	//   30   64:aload_0         
	//   31   65:aload_0         
	//   32   66:getfield        #501 <Field Context e>
	//   33   69:invokespecial   #1640 <Method void dk(s, Context)>
	//   34   72:putfield        #1635 <Field dk ab>
			}
	//*  35   75:goto            114
	//*  36   78:aload_0         
	//*  37   79:getfield        #1635 <Field dk ab>
	//*  38   82:ifnull          97
	//*  39   85:aload_0         
	//*  40   86:getfield        #1635 <Field dk ab>
	//*  41   89:invokevirtual   #1639 <Method void dk.b()>
	//*  42   92:aload_0         
	//*  43   93:aconst_null     
	//*  44   94:putfield        #1635 <Field dk ab>
	//*  45   97:aload_0         
	//*  46   98:getfield        #658 <Field LocationSource ac>
	//*  47  101:invokeinterface #2243 <Method void LocationSource.deactivate()>
	//*  48  106:goto            114
	//*  49  109:aload_2         
	//*  50  110:iconst_0        
	//*  51  111:invokevirtual   #2800 <Method void fp.a(boolean)>
	//*  52  114:iload_1         
	//*  53  115:ifne            126
	//*  54  118:aload_0         
	//*  55  119:getfield        #565 <Field ag N>
	//*  56  122:iload_1         
	//*  57  123:invokevirtual   #2880 <Method void ag.setMyLocationButtonEnabled(boolean)>
	//*  58  126:aload_0         
	//*  59  127:iload_1         
	//*  60  128:putfield        #311 <Field boolean T>
	//*  61  131:aload_0         
	//*  62  132:invokevirtual   #891 <Method void resetRenderTime()>
	//*  63  135:return          
			catch(Throwable throwable)
	//*  64  136:astore_2        
			{
				hm.c(throwable, "AMapDelegateImp", "setMyLocationEnabled");
	//   65  137:aload_2         
	//   66  138:ldc2            #1165 <String "AMapDelegateImp">
	//   67  141:ldc2            #2881 <String "setMyLocationEnabled">
	//   68  144:invokestatic    #1170 <Method void hm.c(Throwable, String, String)>
				throwable.printStackTrace();
	//   69  147:aload_2         
	//   70  148:invokevirtual   #766 <Method void Throwable.printStackTrace()>
				return;
	//   71  151:return          
			}
			break MISSING_BLOCK_LABEL_114;
		}
		if(ab != null)
		{
			ab.b();
			ab = null;
		}
		ac.deactivate();
		break MISSING_BLOCK_LABEL_114;
		fp1.a(false);
		if(flag)
			break MISSING_BLOCK_LABEL_126;
		N.setMyLocationButtonEnabled(flag);
		T = flag;
		resetRenderTime();
		return;
	}

	public void setMyLocationRotateAngle(float f1)
		throws RemoteException
	{
		if(ab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1635 <Field dk ab>
	//*   2    4:ifnull          15
			ab.a(f1);
	//    3    7:aload_0         
	//    4    8:getfield        #1635 <Field dk ab>
	//    5   11:fload_1         
	//    6   12:invokevirtual   #2884 <Method void dk.a(float)>
	//    7   15:return          
	}

	public void setMyLocationStyle(MyLocationStyle mylocationstyle)
		throws RemoteException
	{
		if(V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(ab == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #1635 <Field dk ab>
	//*   6   12:ifnonnull       31
			ab = new dk(((s) (this)), e);
	//    7   15:aload_0         
	//    8   16:new             #1637 <Class dk>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #501 <Field Context e>
	//   13   25:invokespecial   #1640 <Method void dk(s, Context)>
	//   14   28:putfield        #1635 <Field dk ab>
		if(ab != null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #1635 <Field dk ab>
	//*  17   35:ifnull          110
		{
			if(mylocationstyle.getInterval() < 1000L)
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #2891 <Method long MyLocationStyle.getInterval()>
	//*  20   42:ldc2w           #2892 <Long 1000L>
	//*  21   45:lcmp            
	//*  22   46:ifge            57
				mylocationstyle.interval(1000L);
	//   23   49:aload_1         
	//   24   50:ldc2w           #2892 <Long 1000L>
	//   25   53:invokevirtual   #2897 <Method MyLocationStyle MyLocationStyle.interval(long)>
	//   26   56:pop             
			if(ac != null && (ac instanceof ax))
	//*  27   57:aload_0         
	//*  28   58:getfield        #658 <Field LocationSource ac>
	//*  29   61:ifnull          102
	//*  30   64:aload_0         
	//*  31   65:getfield        #658 <Field LocationSource ac>
	//*  32   68:instanceof      #655 <Class ax>
	//*  33   71:ifeq            102
			{
				((ax)ac).a(mylocationstyle.getInterval());
	//   34   74:aload_0         
	//   35   75:getfield        #658 <Field LocationSource ac>
	//   36   78:checkcast       #655 <Class ax>
	//   37   81:aload_1         
	//   38   82:invokevirtual   #2891 <Method long MyLocationStyle.getInterval()>
	//   39   85:invokevirtual   #2899 <Method void ax.a(long)>
				((ax)ac).a(mylocationstyle.getMyLocationType());
	//   40   88:aload_0         
	//   41   89:getfield        #658 <Field LocationSource ac>
	//   42   92:checkcast       #655 <Class ax>
	//   43   95:aload_1         
	//   44   96:invokevirtual   #2902 <Method int MyLocationStyle.getMyLocationType()>
	//   45   99:invokevirtual   #2903 <Method void ax.a(int)>
			}
			ab.a(mylocationstyle);
	//   46  102:aload_0         
	//   47  103:getfield        #1635 <Field dk ab>
	//   48  106:aload_1         
	//   49  107:invokevirtual   #2905 <Method void dk.a(MyLocationStyle)>
		}
	//   50  110:return          
	}

	public void setMyLocationType(int i1)
		throws RemoteException
	{
		if(ab != null && ab.a() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1635 <Field dk ab>
	//*   2    4:ifnull          40
	//*   3    7:aload_0         
	//*   4    8:getfield        #1635 <Field dk ab>
	//*   5   11:invokevirtual   #2420 <Method MyLocationStyle dk.a()>
	//*   6   14:ifnull          40
		{
			ab.a().myLocationType(i1);
	//    7   17:aload_0         
	//    8   18:getfield        #1635 <Field dk ab>
	//    9   21:invokevirtual   #2420 <Method MyLocationStyle dk.a()>
	//   10   24:iload_1         
	//   11   25:invokevirtual   #2910 <Method MyLocationStyle MyLocationStyle.myLocationType(int)>
	//   12   28:pop             
			setMyLocationStyle(ab.a());
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #1635 <Field dk ab>
	//   16   34:invokevirtual   #2420 <Method MyLocationStyle dk.a()>
	//   17   37:invokevirtual   #2912 <Method void setMyLocationStyle(MyLocationStyle)>
		}
	//   18   40:return          
	}

	public void setMyTrafficStyle(MyTrafficStyle mytrafficstyle)
		throws RemoteException
	{
		if(V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean V>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		ao = mytrafficstyle;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #353 <Field MyTrafficStyle ao>
		if(aO && aP && mytrafficstyle != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #390 <Field boolean aO>
	//*   9   17:ifeq            48
	//*  10   20:aload_0         
	//*  11   21:getfield        #392 <Field boolean aP>
	//*  12   24:ifeq            48
	//*  13   27:aload_1         
	//*  14   28:ifnull          48
		{
			resetRenderTime();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #891 <Method void resetRenderTime()>
			queueEvent(new Runnable() {

				public void run()
				{
					try
					{
						a.f.setTrafficStyle(1, com.amap.api.mapcore.util.b.q(a).getSmoothColor(), com.amap.api.mapcore.util.b.q(a).getSlowColor(), com.amap.api.mapcore.util.b.q(a).getCongestedColor(), com.amap.api.mapcore.util.b.q(a).getSeriousCongestedColor());
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field b a>
				//    2    4:getfield        #28  <Field GLMapEngine b.f>
				//    3    7:iconst_1        
				//    4    8:aload_0         
				//    5    9:getfield        #17  <Field b a>
				//    6   12:invokestatic    #32  <Method MyTrafficStyle b.q(b)>
				//    7   15:invokevirtual   #38  <Method int MyTrafficStyle.getSmoothColor()>
				//    8   18:aload_0         
				//    9   19:getfield        #17  <Field b a>
				//   10   22:invokestatic    #32  <Method MyTrafficStyle b.q(b)>
				//   11   25:invokevirtual   #41  <Method int MyTrafficStyle.getSlowColor()>
				//   12   28:aload_0         
				//   13   29:getfield        #17  <Field b a>
				//   14   32:invokestatic    #32  <Method MyTrafficStyle b.q(b)>
				//   15   35:invokevirtual   #44  <Method int MyTrafficStyle.getCongestedColor()>
				//   16   38:aload_0         
				//   17   39:getfield        #17  <Field b a>
				//   18   42:invokestatic    #32  <Method MyTrafficStyle b.q(b)>
				//   19   45:invokevirtual   #47  <Method int MyTrafficStyle.getSeriousCongestedColor()>
				//   20   48:invokevirtual   #53  <Method void GLMapEngine.setTrafficStyle(int, int, int, int, int)>
						return;
				//   21   51:return          
					}
					catch(Throwable throwable)
				//*  22   52:astore_1        
					{
						throwable.printStackTrace();
				//   23   53:aload_1         
				//   24   54:invokevirtual   #56  <Method void Throwable.printStackTrace()>
					}
				//   25   57:return          
				}

				final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   17   35:aload_0         
	//   18   36:new             #64  <Class b$33>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:invokespecial   #2915 <Method void b$33(b)>
	//   22   44:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   23   47:return          
		} else
		{
			bo.c = false;
	//   24   48:aload_0         
	//   25   49:getfield        #461 <Field b$a bo>
	//   26   52:iconst_0        
	//   27   53:putfield        #1632 <Field boolean b$a.c>
			bo.b = true;
	//   28   56:aload_0         
	//   29   57:getfield        #461 <Field b$a bo>
	//   30   60:iconst_1        
	//   31   61:putfield        #1468 <Field boolean b$a.b>
			bo.g = 1;
	//   32   64:aload_0         
	//   33   65:getfield        #461 <Field b$a bo>
	//   34   68:iconst_1        
	//   35   69:putfield        #1460 <Field int b$a.g>
			return;
	//   36   72:return          
		}
	}

	public void setOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener oncamerachangelistener)
		throws RemoteException
	{
		x = oncamerachangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #867 <Field com.amap.api.maps.AMap$OnCameraChangeListener x>
	//    3    5:return          
	}

	public void setOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener onindoorbuildingactivelistener)
		throws RemoteException
	{
		D = onindoorbuildingactivelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #879 <Field com.amap.api.maps.AMap$OnIndoorBuildingActiveListener D>
	//    3    5:return          
	}

	public void setOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener oninfowindowclicklistener)
		throws RemoteException
	{
		C = oninfowindowclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #877 <Field com.amap.api.maps.AMap$OnInfoWindowClickListener C>
	//    3    5:return          
	}

	public void setOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener onmapclicklistener)
		throws RemoteException
	{
		y = onmapclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #869 <Field com.amap.api.maps.AMap$OnMapClickListener y>
	//    3    5:return          
	}

	public void setOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener onmaplongclicklistener)
		throws RemoteException
	{
		B = onmaplongclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #875 <Field com.amap.api.maps.AMap$OnMapLongClickListener B>
	//    3    5:return          
	}

	public void setOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener onmaptouchlistener)
		throws RemoteException
	{
		z = onmaptouchlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #871 <Field com.amap.api.maps.AMap$OnMapTouchListener z>
	//    3    5:return          
	}

	public void setOnMaploadedListener(com.amap.api.maps.AMap.OnMapLoadedListener onmaploadedlistener)
		throws RemoteException
	{
		w = onmaploadedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #865 <Field com.amap.api.maps.AMap$OnMapLoadedListener w>
	//    3    5:return          
	}

	public void setOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener onmarkerclicklistener)
		throws RemoteException
	{
		t = onmarkerclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #859 <Field com.amap.api.maps.AMap$OnMarkerClickListener t>
	//    3    5:return          
	}

	public void setOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener onmarkerdraglistener)
		throws RemoteException
	{
		v = onmarkerdraglistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #863 <Field com.amap.api.maps.AMap$OnMarkerDragListener v>
	//    3    5:return          
	}

	public void setOnMultiPointClickListener(com.amap.api.maps.AMap.OnMultiPointClickListener onmultipointclicklistener)
	{
		if(aZ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #663 <Field bb aZ>
	//*   2    4:ifnull          15
			aZ.a(onmultipointclicklistener);
	//    3    7:aload_0         
	//    4    8:getfield        #663 <Field bb aZ>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #2937 <Method void bb.a(com.amap.api.maps.AMap$OnMultiPointClickListener)>
	//    7   15:return          
	}

	public void setOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener onmylocationchangelistener)
	{
		E = onmylocationchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #857 <Field com.amap.api.maps.AMap$OnMyLocationChangeListener E>
	//    3    5:return          
	}

	public void setOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener onpoiclicklistener)
		throws RemoteException
	{
		A = onpoiclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #873 <Field com.amap.api.maps.AMap$OnPOIClickListener A>
	//    3    5:return          
	}

	public void setOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener onpolylineclicklistener)
		throws RemoteException
	{
		u = onpolylineclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #861 <Field com.amap.api.maps.AMap$OnPolylineClickListener u>
	//    3    5:return          
	}

	public void setRenderFps(int i1)
	{
		try
		{
			ay = Math.max(10, Math.min(i1, 40));
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:iload_1         
	//    3    4:bipush          40
	//    4    6:invokestatic    #1571 <Method int Math.min(int, int)>
	//    5    9:invokestatic    #1574 <Method int Math.max(int, int)>
	//    6   12:putfield        #365 <Field int ay>
			return;
	//    7   15:return          
		}
		catch(Throwable throwable)
	//*   8   16:astore_2        
		{
			throwable.printStackTrace();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #766 <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
	}

	public void setRenderMode(int i1)
	{
		if(P != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #554 <Field t P>
	//*   2    4:ifnull          17
			P.setRenderMode(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #554 <Field t P>
	//    5   11:iload_1         
	//    6   12:invokeinterface #608 <Method void t.setRenderMode(int)>
	//    7   17:return          
	}

	public void setRunLowFrame(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            5
		{
			return;
	//    2    4:return          
		} else
		{
			t();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #2583 <Method void t()>
			return;
	//    5    9:return          
		}
	}

	public void setTrafficEnabled(boolean flag)
		throws RemoteException
	{
		if(aO && !V)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            29
	//*   3    7:aload_0         
	//*   4    8:getfield        #313 <Field boolean V>
	//*   5   11:ifne            29
		{
			queueEvent(new Runnable(flag, flag) {

				public void run()
				{
					if(c.c.isTrafficEnabled() == a)
						break MISSING_BLOCK_LABEL_82;
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field b c>
				//    2    4:getfield        #34  <Field MapConfig b.c>
				//    3    7:invokevirtual   #40  <Method boolean MapConfig.isTrafficEnabled()>
				//    4   10:aload_0         
				//    5   11:getfield        #22  <Field boolean a>
				//    6   14:icmpeq          82
					c.c.setTrafficEnabled(b);
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field b c>
				//    9   21:getfield        #34  <Field MapConfig b.c>
				//   10   24:aload_0         
				//   11   25:getfield        #24  <Field boolean b>
				//   12   28:invokevirtual   #41  <Method void MapConfig.setTrafficEnabled(boolean)>
					com.amap.api.mapcore.util.b.t(c).setTrafficMode(a);
				//   13   31:aload_0         
				//   14   32:getfield        #20  <Field b c>
				//   15   35:invokestatic    #45  <Method GLMapRender b.t(b)>
				//   16   38:aload_0         
				//   17   39:getfield        #22  <Field boolean a>
				//   18   42:invokevirtual   #50  <Method void GLMapRender.setTrafficMode(boolean)>
					int i1;
					Throwable throwable;
					if(a)
				//*  19   45:aload_0         
				//*  20   46:getfield        #22  <Field boolean a>
				//*  21   49:ifeq            89
						i1 = 1;
				//   22   52:iconst_1        
				//   23   53:istore_1        
					else
				//*  24   54:goto            57
				//*  25   57:aload_0         
				//*  26   58:getfield        #20  <Field b c>
				//*  27   61:getfield        #54  <Field GLMapEngine b.f>
				//*  28   64:iconst_1        
				//*  29   65:sipush          2010
				//*  30   68:iload_1         
				//*  31   69:iconst_0        
				//*  32   70:iconst_0        
				//*  33   71:iconst_0        
				//*  34   72:invokevirtual   #60  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				//*  35   75:aload_0         
				//*  36   76:getfield        #20  <Field b c>
				//*  37   79:invokevirtual   #63  <Method void b.resetRenderTime()>
				//*  38   82:return          
				//*  39   83:astore_2        
				//*  40   84:aload_2         
				//*  41   85:invokevirtual   #66  <Method void Throwable.printStackTrace()>
				//*  42   88:return          
						i1 = 0;
				//   43   89:iconst_0        
				//   44   90:istore_1        
					c.f.setParamater(1, 2010, i1, 0, 0, 0);
					c.resetRenderTime();
					return;
					throwable;
					throwable.printStackTrace();
					return;
				//*  45   91:goto            57
				}

				final boolean a;
				final boolean b;
				final com.amap.api.mapcore.util.b c;

			
			{
				c = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field b c>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field boolean a>
				b = flag1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field boolean b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    6   14:aload_0         
	//    7   15:new             #52  <Class b$28>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:iload_1         
	//   12   22:invokespecial   #2948 <Method void b$28(b, boolean, boolean)>
	//   13   25:invokevirtual   #1058 <Method void queueEvent(Runnable)>
			return;
	//   14   28:return          
		} else
		{
			ba.c = flag;
	//   15   29:aload_0         
	//   16   30:getfield        #419 <Field b$a ba>
	//   17   33:iload_1         
	//   18   34:putfield        #1632 <Field boolean b$a.c>
			ba.b = true;
	//   19   37:aload_0         
	//   20   38:getfield        #419 <Field b$a ba>
	//   21   41:iconst_1        
	//   22   42:putfield        #1468 <Field boolean b$a.b>
			ba.g = 1;
	//   23   45:aload_0         
	//   24   46:getfield        #419 <Field b$a ba>
	//   25   49:iconst_1        
	//   26   50:putfield        #1460 <Field int b$a.g>
			return;
	//   27   53:return          
		}
	}

	public void setVisibilityEx(int i1)
	{
		if(P != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #554 <Field t P>
	//*   2    4:ifnull          23
			try
			{
				P.setVisibility(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #554 <Field t P>
	//    5   11:iload_1         
	//    6   12:invokeinterface #2950 <Method void t.setVisibility(int)>
				return;
	//    7   17:return          
			}
			catch(Throwable throwable)
	//*   8   18:astore_2        
			{
				throwable.printStackTrace();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #766 <Method void Throwable.printStackTrace()>
			}
	//   11   23:return          
	}

	public void setZOrderOnTop(boolean flag)
		throws RemoteException
	{
	//    0    0:return          
	}

	public void setZoomScaleParam(float f1)
	{
		aH = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #376 <Field float aH>
	//    3    5:return          
	}

	public void stopAnimation()
		throws RemoteException
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field GLMapEngine f>
	//*   2    4:ifnull          14
			f.interruptAnimation();
	//    3    7:aload_0         
	//    4    8:getfield        #545 <Field GLMapEngine f>
	//    5   11:invokevirtual   #1726 <Method void GLMapEngine.interruptAnimation()>
		resetRenderTime();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #891 <Method void resetRenderTime()>
	//    8   18:return          
	}

	public dr t(int i1)
	{
		if(aX == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #668 <Field ds aX>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return aX.a(i1);
	//    5    9:aload_0         
	//    6   10:getfield        #668 <Field ds aX>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #2955 <Method dr ds.a(int)>
	//    9   17:areturn         
	}

	public void t()
	{
		if(aO && aD != null && !aD.isRenderPause())
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean aO>
	//*   2    4:ifeq            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #552 <Field GLMapRender aD>
	//*   5   11:ifnull          28
	//*   6   14:aload_0         
	//*   7   15:getfield        #552 <Field GLMapRender aD>
	//*   8   18:invokevirtual   #2723 <Method boolean GLMapRender.isRenderPause()>
	//*   9   21:ifne            28
			requestRender();
	//   10   24:aload_0         
	//   11   25:invokevirtual   #2956 <Method void requestRender()>
	//   12   28:return          
	}

	public float u()
	{
		return aH;
	//    0    0:aload_0         
	//    1    1:getfield        #376 <Field float aH>
	//    2    4:freturn         
	}

	public float u(int i1)
	{
		GLMapState glmapstate = new GLMapState(1, f.getNativeInstance());
	//    0    0:new             #737 <Class GLMapState>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:aload_0         
	//    4    6:getfield        #545 <Field GLMapEngine f>
	//    5    9:invokevirtual   #820 <Method long GLMapEngine.getNativeInstance()>
	//    6   12:invokespecial   #823 <Method void GLMapState(int, long)>
	//    7   15:astore_3        
		glmapstate.setMapZoomer(i1);
	//    8   16:aload_3         
	//    9   17:iload_1         
	//   10   18:i2f             
	//   11   19:invokevirtual   #1310 <Method void GLMapState.setMapZoomer(float)>
		glmapstate.recalculate();
	//   12   22:aload_3         
	//   13   23:invokevirtual   #1373 <Method void GLMapState.recalculate()>
		float f1 = glmapstate.getGLUnitWithWin(1);
	//   14   26:aload_3         
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #760 <Method float GLMapState.getGLUnitWithWin(int)>
	//   17   31:fstore_2        
		glmapstate.recycle();
	//   18   32:aload_3         
	//   19   33:invokevirtual   #855 <Method void GLMapState.recycle()>
		return f1;
	//   20   36:fload_2         
	//   21   37:freturn         
	}

	protected void v()
	{
		AMapNativeRenderer.nativeDrawLineInit();
	//    0    0:invokestatic    #2961 <Method void AMapNativeRenderer.nativeDrawLineInit()>
	//    1    3:return          
	}

	public Context w()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #501 <Field Context e>
	//    2    4:areturn         
	}

	public float[] x()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field MapConfig c>
	//*   2    4:ifnull          15
			return c.getMvpMatrix();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field MapConfig c>
	//    5   11:invokevirtual   #2964 <Method float[] MapConfig.getMvpMatrix()>
	//    6   14:areturn         
		else
			return m;
	//    7   15:aload_0         
	//    8   16:getfield        #481 <Field float[] m>
	//    9   19:areturn         
	}

	public ds y()
	{
		return aX;
	//    0    0:aload_0         
	//    1    1:getfield        #668 <Field ds aX>
	//    2    4:areturn         
	}

	private com.amap.api.maps.AMap.OnPOIClickListener A;
	private com.amap.api.maps.AMap.OnMapLongClickListener B;
	private com.amap.api.maps.AMap.OnInfoWindowClickListener C;
	private com.amap.api.maps.AMap.OnIndoorBuildingActiveListener D;
	private com.amap.api.maps.AMap.OnMyLocationChangeListener E;
	private g F;
	private com.amap.api.maps.AMap.onMapPrintScreenListener G;
	private com.amap.api.maps.AMap.OnMapScreenShotListener H;
	private AMapGestureListener I;
	private aw J;
	private do K;
	private UiSettings L;
	private u M;
	private final ag N = new ag(((s) (this)));
	private boolean O;
	private final t P;
	private fq Q;
	private final af R;
	private final q S = new q(((s) (this)));
	private boolean T;
	private int U;
	private boolean V;
	private n W;
	private AMapWidgetListener X;
	private boolean Y;
	private boolean Z;
	protected boolean a;
	private du aA;
	private dw aB;
	private f aC;
	private GLMapRender aD;
	private o aE;
	private boolean aF;
	private float aG;
	private float aH;
	private float aI;
	private boolean aJ;
	private boolean aK;
	private boolean aL;
	private boolean aM;
	private int aN;
	private volatile boolean aO;
	private volatile boolean aP;
	private boolean aQ;
	private boolean aR;
	private Lock aS;
	private int aT;
	private int aU;
	private int aV;
	private b aW;
	private ds aX;
	private r aY;
	private bb aZ;
	private boolean aa;
	private dk ab;
	private LocationSource ac;
	private boolean ad;
	private Marker ae;
	private k af;
	private boolean ag;
	private boolean ah;
	private boolean ai;
	private boolean aj;
	private boolean ak;
	private boolean al;
	private Rect am;
	private int an;
	private MyTrafficStyle ao;
	private Thread ap;
	private Thread aq;
	private boolean ar;
	private boolean as;
	private boolean at;
	private int au;
	private CustomRenderer av;
	private final z aw = new z();
	private int ax;
	private int ay;
	private List az;
	protected final y b;
	private a ba;
	private a bb;
	private a bc;
	private a bd;
	private a be;
	private a bf;
	private a bg;
	private a bh;
	private a bi;
	private a bj;
	private a bk;
	private a bl;
	private Runnable bm;
	private a bn;
	private a bo;
	private EAMapPlatformGestureInfo bp;
	private long bq;
	private au br;
	private IPoint bs[];
	protected MapConfig c;
	protected au d;
	protected Context e;
	protected GLMapEngine f;
	public int g;
	public int h;
	protected final Handler i = new Handler(Looper.getMainLooper()) {

		public void handleMessage(Message message)
		{
			if(message == null || com.amap.api.mapcore.util.b.a(a))
		//*   0    0:aload_1         
		//*   1    1:ifnull          14
		//*   2    4:aload_0         
		//*   3    5:getfield        #12  <Field b a>
		//*   4    8:invokestatic    #23  <Method boolean b.a(b)>
		//*   5   11:ifeq            15
				return;
		//    6   14:return          
			message.what;
		//    7   15:aload_1         
		//    8   16:getfield        #29  <Field int Message.what>
			JVM INSTR tableswitch 2 20: default 990
		//		               2 108
		//		               3 974
		//		               4 974
		//		               5 974
		//		               6 974
		//		               7 974
		//		               8 974
		//		               9 974
		//		               10 176
		//		               11 605
		//		               12 305
		//		               13 335
		//		               14 257
		//		               15 368
		//		               16 214
		//		               17 744
		//		               18 944
		//		               19 858
		//		               20 819;
		//    9   19:tableswitch     2 20: default 990
		//		               2 108
		//		               3 974
		//		               4 974
		//		               5 974
		//		               6 974
		//		               7 974
		//		               8 974
		//		               9 974
		//		               10 176
		//		               11 605
		//		               12 305
		//		               13 335
		//		               14 257
		//		               15 368
		//		               16 214
		//		               17 744
		//		               18 944
		//		               19 858
		//		               20 819
			   goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
			break MISSING_BLOCK_LABEL_990;
_L3:
			break; /* Loop/switch isn't completed */
_L2:
			StringBuilder stringbuilder;
			stringbuilder = new StringBuilder();
		//   10  108:new             #31  <Class StringBuilder>
		//   11  111:dup             
		//   12  112:invokespecial   #34  <Method void StringBuilder()>
		//   13  115:astore          4
			stringbuilder.append("Key\u9A8C\u8BC1\u5931\u8D25\uFF1A[");
		//   14  117:aload           4
		//   15  119:ldc1            #36  <String "Key\u9A8C\u8BC1\u5931\u8D25\uFF1A[">
		//   16  121:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   17  124:pop             
			if(message.obj == null) goto _L16; else goto _L15
		//   18  125:aload_1         
		//   19  126:getfield        #44  <Field Object Message.obj>
		//   20  129:ifnull          145
_L15:
			stringbuilder.append(message.obj);
		//   21  132:aload           4
		//   22  134:aload_1         
		//   23  135:getfield        #44  <Field Object Message.obj>
		//   24  138:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
		//   25  141:pop             
			  goto _L17
		//*  26  142:goto            154
_L16:
			stringbuilder.append(gp.b);
		//   27  145:aload           4
		//   28  147:getstatic       #53  <Field String gp.b>
		//   29  150:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   30  153:pop             
_L17:
			stringbuilder.append("]");
		//   31  154:aload           4
		//   32  156:ldc1            #55  <String "]">
		//   33  158:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   34  161:pop             
			Log.w("amapsdk", stringbuilder.toString());
		//   35  162:ldc1            #57  <String "amapsdk">
		//   36  164:aload           4
		//   37  166:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   38  169:invokestatic    #67  <Method int Log.w(String, String)>
		//   39  172:pop             
			break; /* Loop/switch isn't completed */
		//   40  173:goto            974
_L4:
			message = ((Message) ((CameraPosition)message.obj));
		//   41  176:aload_1         
		//   42  177:getfield        #44  <Field Object Message.obj>
		//   43  180:checkcast       #69  <Class CameraPosition>
		//   44  183:astore_1        
			boolean flag;
			if(message == null)
				break; /* Loop/switch isn't completed */
		//   45  184:aload_1         
		//   46  185:ifnull          974
			int i1;
			Object obj;
			fs fs1;
			try
			{
				if(com.amap.api.mapcore.util.b.b(a) != null)
		//*  47  188:aload_0         
		//*  48  189:getfield        #12  <Field b a>
		//*  49  192:invokestatic    #72  <Method com.amap.api.maps.AMap$OnCameraChangeListener b.b(b)>
		//*  50  195:ifnull          974
					com.amap.api.mapcore.util.b.b(a).onCameraChange(((CameraPosition) (message)));
		//   51  198:aload_0         
		//   52  199:getfield        #12  <Field b a>
		//   53  202:invokestatic    #72  <Method com.amap.api.maps.AMap$OnCameraChangeListener b.b(b)>
		//   54  205:aload_1         
		//   55  206:invokeinterface #78  <Method void com.amap.api.maps.AMap$OnCameraChangeListener.onCameraChange(CameraPosition)>
				break; /* Loop/switch isn't completed */
		//   56  211:goto            974
			}
		//*  57  214:aload_0         
		//*  58  215:getfield        #12  <Field b a>
		//*  59  218:invokestatic    #82  <Method com.amap.api.maps.AMap$OnMapLoadedListener b.c(b)>
		//*  60  221:astore_1        
		//*  61  222:aload_1         
		//*  62  223:ifnull          974
		//*  63  226:aload_0         
		//*  64  227:getfield        #12  <Field b a>
		//*  65  230:invokestatic    #82  <Method com.amap.api.maps.AMap$OnMapLoadedListener b.c(b)>
		//*  66  233:invokeinterface #87  <Method void com.amap.api.maps.AMap$OnMapLoadedListener.onMapLoaded()>
		//*  67  238:goto            974
		//*  68  241:astore_1        
		//*  69  242:aload_1         
		//*  70  243:ldc1            #89  <String "AMapDelegateImp">
		//*  71  245:ldc1            #90  <String "onMapLoaded">
		//*  72  247:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
		//*  73  250:aload_1         
		//*  74  251:invokevirtual   #98  <Method void Throwable.printStackTrace()>
		//*  75  254:goto            974
		//*  76  257:aload_0         
		//*  77  258:getfield        #12  <Field b a>
		//*  78  261:invokestatic    #102 <Method com.amap.api.maps.AMap$OnMapTouchListener b.d(b)>
		//*  79  264:ifnull          286
		//*  80  267:aload_0         
		//*  81  268:getfield        #12  <Field b a>
		//*  82  271:invokestatic    #102 <Method com.amap.api.maps.AMap$OnMapTouchListener b.d(b)>
		//*  83  274:aload_1         
		//*  84  275:getfield        #44  <Field Object Message.obj>
		//*  85  278:checkcast       #104 <Class MotionEvent>
		//*  86  281:invokeinterface #110 <Method void com.amap.api.maps.AMap$OnMapTouchListener.onTouch(MotionEvent)>
		//*  87  286:goto            974
		//*  88  289:astore_1        
		//*  89  290:aload_1         
		//*  90  291:ldc1            #89  <String "AMapDelegateImp">
		//*  91  293:ldc1            #112 <String "onTouchHandler">
		//*  92  295:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
		//*  93  298:aload_1         
		//*  94  299:invokevirtual   #98  <Method void Throwable.printStackTrace()>
		//*  95  302:goto            974
		//*  96  305:aload_0         
		//*  97  306:getfield        #12  <Field b a>
		//*  98  309:invokestatic    #116 <Method fq b.e(b)>
		//*  99  312:ifnull          974
		//* 100  315:aload_0         
		//* 101  316:getfield        #12  <Field b a>
		//* 102  319:invokestatic    #116 <Method fq b.e(b)>
		//* 103  322:aload_0         
		//* 104  323:getfield        #12  <Field b a>
		//* 105  326:invokevirtual   #120 <Method float b.g()>
		//* 106  329:invokevirtual   #125 <Method void fq.a(float)>
		//* 107  332:goto            974
		//* 108  335:aload_0         
		//* 109  336:getfield        #12  <Field b a>
		//* 110  339:invokestatic    #116 <Method fq b.e(b)>
		//* 111  342:ifnull          974
		//* 112  345:aload_0         
		//* 113  346:getfield        #12  <Field b a>
		//* 114  349:invokestatic    #116 <Method fq b.e(b)>
		//* 115  352:invokevirtual   #128 <Method fn fq.g()>
		//* 116  355:astore_1        
		//* 117  356:aload_1         
		//* 118  357:ifnonnull       361
		//* 119  360:return          
		//* 120  361:aload_1         
		//* 121  362:invokevirtual   #132 <Method void fn.b()>
		//* 122  365:goto            974
		//* 123  368:aload_1         
		//* 124  369:getfield        #44  <Field Object Message.obj>
		//* 125  372:checkcast       #134 <Class Bitmap>
		//* 126  375:astore          4
		//* 127  377:aload_1         
		//* 128  378:getfield        #137 <Field int Message.arg1>
		//* 129  381:istore_2        
		//* 130  382:aload           4
		//* 131  384:ifnull          524
		//* 132  387:aload_0         
		//* 133  388:getfield        #12  <Field b a>
		//* 134  391:invokestatic    #116 <Method fq b.e(b)>
		//* 135  394:ifnull          524
		//* 136  397:new             #139 <Class Canvas>
		//* 137  400:dup             
		//* 138  401:aload           4
		//* 139  403:invokespecial   #142 <Method void Canvas(Bitmap)>
		//* 140  406:astore_1        
		//* 141  407:aload_0         
		//* 142  408:getfield        #12  <Field b a>
		//* 143  411:invokestatic    #116 <Method fq b.e(b)>
		//* 144  414:invokevirtual   #146 <Method fs fq.h()>
		//* 145  417:astore          5
		//* 146  419:aload           5
		//* 147  421:ifnull          430
		//* 148  424:aload           5
		//* 149  426:aload_1         
		//* 150  427:invokevirtual   #152 <Method void fs.onDraw(Canvas)>
		//* 151  430:aload_0         
		//* 152  431:getfield        #12  <Field b a>
		//* 153  434:invokestatic    #116 <Method fq b.e(b)>
		//* 154  437:aload_1         
		//* 155  438:invokevirtual   #154 <Method void fq.a(Canvas)>
		//* 156  441:aload_0         
		//* 157  442:getfield        #12  <Field b a>
		//* 158  445:invokestatic    #158 <Method com.amap.api.maps.AMap$onMapPrintScreenListener b.f(b)>
		//* 159  448:ifnull          482
		//* 160  451:aload_0         
		//* 161  452:getfield        #12  <Field b a>
		//* 162  455:invokestatic    #158 <Method com.amap.api.maps.AMap$onMapPrintScreenListener b.f(b)>
		//* 163  458:new             #160 <Class BitmapDrawable>
		//* 164  461:dup             
		//* 165  462:aload_0         
		//* 166  463:getfield        #12  <Field b a>
		//* 167  466:getfield        #163 <Field Context b.e>
		//* 168  469:invokevirtual   #169 <Method Resources Context.getResources()>
		//* 169  472:aload           4
		//* 170  474:invokespecial   #172 <Method void BitmapDrawable(Resources, Bitmap)>
		//* 171  477:invokeinterface #178 <Method void com.amap.api.maps.AMap$onMapPrintScreenListener.onMapPrint(android.graphics.drawable.Drawable)>
		//* 172  482:aload_0         
		//* 173  483:getfield        #12  <Field b a>
		//* 174  486:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
		//* 175  489:ifnull          991
		//* 176  492:aload_0         
		//* 177  493:getfield        #12  <Field b a>
		//* 178  496:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
		//* 179  499:aload           4
		//* 180  501:invokeinterface #186 <Method void com.amap.api.maps.AMap$OnMapScreenShotListener.onMapScreenShot(Bitmap)>
		//* 181  506:aload_0         
		//* 182  507:getfield        #12  <Field b a>
		//* 183  510:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
		//* 184  513:aload           4
		//* 185  515:iload_2         
		//* 186  516:invokeinterface #189 <Method void com.amap.api.maps.AMap$OnMapScreenShotListener.onMapScreenShot(Bitmap, int)>
		//* 187  521:goto            991
		//* 188  524:aload_0         
		//* 189  525:getfield        #12  <Field b a>
		//* 190  528:invokestatic    #158 <Method com.amap.api.maps.AMap$onMapPrintScreenListener b.f(b)>
		//* 191  531:ifnull          547
		//* 192  534:aload_0         
		//* 193  535:getfield        #12  <Field b a>
		//* 194  538:invokestatic    #158 <Method com.amap.api.maps.AMap$onMapPrintScreenListener b.f(b)>
		//* 195  541:aconst_null     
		//* 196  542:invokeinterface #178 <Method void com.amap.api.maps.AMap$onMapPrintScreenListener.onMapPrint(android.graphics.drawable.Drawable)>
		//* 197  547:aload_0         
		//* 198  548:getfield        #12  <Field b a>
		//* 199  551:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
		//* 200  554:ifnull          584
		//* 201  557:aload_0         
		//* 202  558:getfield        #12  <Field b a>
		//* 203  561:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
		//* 204  564:aconst_null     
		//* 205  565:invokeinterface #186 <Method void com.amap.api.maps.AMap$OnMapScreenShotListener.onMapScreenShot(Bitmap)>
		//* 206  570:aload_0         
		//* 207  571:getfield        #12  <Field b a>
		//* 208  574:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
		//* 209  577:aconst_null     
		//* 210  578:iload_2         
		//* 211  579:invokeinterface #189 <Method void com.amap.api.maps.AMap$OnMapScreenShotListener.onMapScreenShot(Bitmap, int)>
		//* 212  584:aload_0         
		//* 213  585:getfield        #12  <Field b a>
		//* 214  588:aconst_null     
		//* 215  589:invokestatic    #192 <Method com.amap.api.maps.AMap$onMapPrintScreenListener b.a(b, com.amap.api.maps.AMap$onMapPrintScreenListener)>
		//* 216  592:pop             
		//* 217  593:aload_0         
		//* 218  594:getfield        #12  <Field b a>
		//* 219  597:aconst_null     
		//* 220  598:invokestatic    #195 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.a(b, com.amap.api.maps.AMap$OnMapScreenShotListener)>
		//* 221  601:pop             
		//* 222  602:goto            974
		//* 223  605:aload_0         
		//* 224  606:getfield        #12  <Field b a>
		//* 225  609:invokevirtual   #199 <Method CameraPosition b.getCameraPosition()>
		//* 226  612:astore_1        
		//* 227  613:aload_1         
		//* 228  614:ifnull          638
		//* 229  617:aload_0         
		//* 230  618:getfield        #12  <Field b a>
		//* 231  621:invokestatic    #116 <Method fq b.e(b)>
		//* 232  624:ifnull          638
		//* 233  627:aload_0         
		//* 234  628:getfield        #12  <Field b a>
		//* 235  631:invokestatic    #116 <Method fq b.e(b)>
		//* 236  634:aload_1         
		//* 237  635:invokevirtual   #201 <Method void fq.a(CameraPosition)>
		//* 238  638:aload_0         
		//* 239  639:getfield        #12  <Field b a>
		//* 240  642:aload_1         
		//* 241  643:invokestatic    #204 <Method void b.a(b, CameraPosition)>
		//* 242  646:aload_0         
		//* 243  647:getfield        #12  <Field b a>
		//* 244  650:invokestatic    #206 <Method boolean b.h(b)>
		//* 245  653:ifeq            694
		//* 246  656:aload_0         
		//* 247  657:getfield        #12  <Field b a>
		//* 248  660:iconst_0        
		//* 249  661:invokestatic    #209 <Method boolean b.a(b, boolean)>
		//* 250  664:pop             
		//* 251  665:aload_0         
		//* 252  666:getfield        #12  <Field b a>
		//* 253  669:invokestatic    #213 <Method af b.i(b)>
		//* 254  672:ifnull          686
		//* 255  675:aload_0         
		//* 256  676:getfield        #12  <Field b a>
		//* 257  679:invokestatic    #213 <Method af b.i(b)>
		//* 258  682:iconst_0        
		//* 259  683:invokevirtual   #218 <Method void af.b(boolean)>
		//* 260  686:aload_0         
		//* 261  687:getfield        #12  <Field b a>
		//* 262  690:iconst_1        
		//* 263  691:invokevirtual   #220 <Method void b.g(boolean)>
		//* 264  694:aload_0         
		//* 265  695:getfield        #12  <Field b a>
		//* 266  698:invokestatic    #223 <Method boolean b.j(b)>
		//* 267  701:ifeq            720
		//* 268  704:aload_0         
		//* 269  705:getfield        #12  <Field b a>
		//* 270  708:invokevirtual   #225 <Method void b.j()>
		//* 271  711:aload_0         
		//* 272  712:getfield        #12  <Field b a>
		//* 273  715:iconst_0        
		//* 274  716:invokestatic    #227 <Method boolean b.b(b, boolean)>
		//* 275  719:pop             
		//* 276  720:aload_0         
		//* 277  721:getfield        #12  <Field b a>
		//* 278  724:iconst_1        
		//* 279  725:aload_1         
		//* 280  726:invokevirtual   #230 <Method void b.a(boolean, CameraPosition)>
		//* 281  729:goto            974
		//* 282  732:astore_1        
		//* 283  733:aload_1         
		//* 284  734:ldc1            #89  <String "AMapDelegateImp">
		//* 285  736:ldc1            #232 <String "CameraUpdateFinish">
		//* 286  738:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
		//* 287  741:goto            974
		//* 288  744:aload_0         
		//* 289  745:getfield        #12  <Field b a>
		//* 290  748:getfield        #235 <Field GLMapEngine b.f>
		//* 291  751:iconst_1        
		//* 292  752:invokevirtual   #241 <Method boolean GLMapEngine.isInMapAnimation(int)>
		//* 293  755:ifeq            779
		//* 294  758:aload_0         
		//* 295  759:getfield        #12  <Field b a>
		//* 296  762:invokestatic    #213 <Method af b.i(b)>
		//* 297  765:ifnull          779
		//* 298  768:aload_0         
		//* 299  769:getfield        #12  <Field b a>
		//* 300  772:invokestatic    #213 <Method af b.i(b)>
		//* 301  775:iconst_0        
		//* 302  776:invokevirtual   #218 <Method void af.b(boolean)>
		//* 303  779:aload_0         
		//* 304  780:getfield        #12  <Field b a>
		//* 305  783:invokestatic    #213 <Method af b.i(b)>
		//* 306  786:ifnull          974
		//* 307  789:aload_0         
		//* 308  790:getfield        #12  <Field b a>
		//* 309  793:invokestatic    #213 <Method af b.i(b)>
		//* 310  796:astore          4
		//* 311  798:aload_1         
		//* 312  799:getfield        #137 <Field int Message.arg1>
		//* 313  802:ifeq            994
		//* 314  805:iconst_1        
		//* 315  806:istore_3        
		//* 316  807:goto            810
		//* 317  810:aload           4
		//* 318  812:iload_3         
		//* 319  813:invokevirtual   #243 <Method void af.a(boolean)>
		//* 320  816:goto            974
		//* 321  819:aload_0         
		//* 322  820:getfield        #12  <Field b a>
		//* 323  823:invokestatic    #247 <Method com.amap.api.maps.AMap$OnPOIClickListener b.k(b)>
		//* 324  826:aload_1         
		//* 325  827:getfield        #44  <Field Object Message.obj>
		//* 326  830:checkcast       #249 <Class Poi>
		//* 327  833:invokeinterface #255 <Method void com.amap.api.maps.AMap$OnPOIClickListener.onPOIClick(Poi)>
		//* 328  838:goto            974
		//* 329  841:astore_1        
		//* 330  842:aload_1         
		//* 331  843:ldc1            #89  <String "AMapDelegateImp">
		//* 332  845:ldc2            #257 <String "OnPOIClickListener.onPOIClick">
		//* 333  848:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
		//* 334  851:aload_1         
		//* 335  852:invokevirtual   #98  <Method void Throwable.printStackTrace()>
		//* 336  855:goto            974
		//* 337  858:aload_0         
		//* 338  859:getfield        #12  <Field b a>
		//* 339  862:invokestatic    #261 <Method com.amap.api.maps.AMap$OnMapClickListener b.l(b)>
		//* 340  865:ifnull          974
		//* 341  868:invokestatic    #267 <Method DPoint DPoint.obtain()>
		//* 342  871:astore          4
		//* 343  873:aload_0         
		//* 344  874:getfield        #12  <Field b a>
		//* 345  877:aload_1         
		//* 346  878:getfield        #137 <Field int Message.arg1>
		//* 347  881:aload_1         
		//* 348  882:getfield        #270 <Field int Message.arg2>
		//* 349  885:aload           4
		//* 350  887:invokevirtual   #273 <Method void b.b(int, int, DPoint)>
		//* 351  890:aload_0         
		//* 352  891:getfield        #12  <Field b a>
		//* 353  894:invokestatic    #261 <Method com.amap.api.maps.AMap$OnMapClickListener b.l(b)>
		//* 354  897:new             #275 <Class LatLng>
		//* 355  900:dup             
		//* 356  901:aload           4
		//* 357  903:getfield        #279 <Field double DPoint.y>
		//* 358  906:aload           4
		//* 359  908:getfield        #282 <Field double DPoint.x>
		//* 360  911:invokespecial   #285 <Method void LatLng(double, double)>
		//* 361  914:invokeinterface #291 <Method void com.amap.api.maps.AMap$OnMapClickListener.onMapClick(LatLng)>
		//* 362  919:aload           4
		//* 363  921:invokevirtual   #294 <Method void DPoint.recycle()>
		//* 364  924:goto            999
		//* 365  927:astore_1        
		//* 366  928:aload_1         
		//* 367  929:ldc1            #89  <String "AMapDelegateImp">
		//* 368  931:ldc2            #296 <String "OnMapClickListener.onMapClick">
		//* 369  934:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
		//* 370  937:aload_1         
		//* 371  938:invokevirtual   #98  <Method void Throwable.printStackTrace()>
		//* 372  941:goto            999
		//* 373  944:aload_0         
		//* 374  945:getfield        #12  <Field b a>
		//* 375  948:invokestatic    #300 <Method aw b.m(b)>
		//* 376  951:ifnull          974
		//* 377  954:aload_0         
		//* 378  955:getfield        #12  <Field b a>
		//* 379  958:invokestatic    #303 <Method boolean b.n(b)>
		//* 380  961:ifeq            974
		//* 381  964:aload_0         
		//* 382  965:getfield        #12  <Field b a>
		//* 383  968:invokestatic    #300 <Method aw b.m(b)>
		//* 384  971:invokevirtual   #307 <Method void aw.c()>
		//* 385  974:return          
			// Misplaced declaration of an exception variable
			catch(Message message)
		//* 386  975:astore_1        
			{
				hm.c(((Throwable) (message)), "AMapDelegateImp", "handleMessage");
		//  387  976:aload_1         
		//  388  977:ldc1            #89  <String "AMapDelegateImp">
		//  389  979:ldc2            #308 <String "handleMessage">
		//  390  982:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
			}
			break MISSING_BLOCK_LABEL_985;
_L10:
			message = ((Message) (com.amap.api.mapcore.util.b.c(a)));
			if(message == null)
				break; /* Loop/switch isn't completed */
			try
			{
				com.amap.api.mapcore.util.b.c(a).onMapLoaded();
				break; /* Loop/switch isn't completed */
			}
			// Misplaced declaration of an exception variable
			catch(Message message) { }
			hm.c(((Throwable) (message)), "AMapDelegateImp", "onMapLoaded");
			((Throwable) (message)).printStackTrace();
			break; /* Loop/switch isn't completed */
_L8:
			try
			{
				if(com.amap.api.mapcore.util.b.d(a) != null)
					com.amap.api.mapcore.util.b.d(a).onTouch((MotionEvent)message.obj);
				break; /* Loop/switch isn't completed */
			}
			// Misplaced declaration of an exception variable
			catch(Message message) { }
			hm.c(((Throwable) (message)), "AMapDelegateImp", "onTouchHandler");
			((Throwable) (message)).printStackTrace();
			break; /* Loop/switch isn't completed */
_L6:
			if(com.amap.api.mapcore.util.b.e(a) != null)
				com.amap.api.mapcore.util.b.e(a).a(a.g());
			break; /* Loop/switch isn't completed */
_L7:
			if(com.amap.api.mapcore.util.b.e(a) == null)
				break; /* Loop/switch isn't completed */
			message = ((Message) (com.amap.api.mapcore.util.b.e(a).g()));
			if(message == null)
				return;
			((fn) (message)).b();
			break; /* Loop/switch isn't completed */
_L9:
			obj = ((Object) ((Bitmap)message.obj));
			i1 = message.arg1;
			if(obj == null) goto _L19; else goto _L18
_L18:
			if(com.amap.api.mapcore.util.b.e(a) == null) goto _L19; else goto _L20
_L20:
			message = ((Message) (new Canvas(((Bitmap) (obj)))));
			fs1 = com.amap.api.mapcore.util.b.e(a).h();
			if(fs1 == null) goto _L22; else goto _L21
_L21:
			fs1.onDraw(((Canvas) (message)));
_L22:
			com.amap.api.mapcore.util.b.e(a).a(((Canvas) (message)));
			if(com.amap.api.mapcore.util.b.f(a) != null)
				com.amap.api.mapcore.util.b.f(a).onMapPrint(((android.graphics.drawable.Drawable) (new BitmapDrawable(a.e.getResources(), ((Bitmap) (obj))))));
			if(com.amap.api.mapcore.util.b.g(a) != null)
			{
				com.amap.api.mapcore.util.b.g(a).onMapScreenShot(((Bitmap) (obj)));
				com.amap.api.mapcore.util.b.g(a).onMapScreenShot(((Bitmap) (obj)), i1);
			}
			  goto _L23
_L19:
			if(com.amap.api.mapcore.util.b.f(a) != null)
				com.amap.api.mapcore.util.b.f(a).onMapPrint(((android.graphics.drawable.Drawable) (null)));
			if(com.amap.api.mapcore.util.b.g(a) != null)
			{
				com.amap.api.mapcore.util.b.g(a).onMapScreenShot(((Bitmap) (null)));
				com.amap.api.mapcore.util.b.g(a).onMapScreenShot(((Bitmap) (null)), i1);
			}
_L23:
			com.amap.api.mapcore.util.b.a(a, ((com.amap.api.maps.AMap.onMapPrintScreenListener) (null)));
			com.amap.api.mapcore.util.b.a(a, ((com.amap.api.maps.AMap.OnMapScreenShotListener) (null)));
			break; /* Loop/switch isn't completed */
_L5:
			message = ((Message) (a.getCameraPosition()));
			if(message == null) goto _L25; else goto _L24
_L24:
			if(com.amap.api.mapcore.util.b.e(a) != null)
				com.amap.api.mapcore.util.b.e(a).a(((CameraPosition) (message)));
_L25:
			com.amap.api.mapcore.util.b.a(a, ((CameraPosition) (message)));
			if(com.amap.api.mapcore.util.b.h(a))
			{
				com.amap.api.mapcore.util.b.a(a, false);
				if(com.amap.api.mapcore.util.b.i(a) != null)
					com.amap.api.mapcore.util.b.i(a).b(false);
				a.g(true);
			}
			if(com.amap.api.mapcore.util.b.j(a))
			{
				a.j();
				com.amap.api.mapcore.util.b.b(a, false);
			}
			a.a(true, ((CameraPosition) (message)));
			break; /* Loop/switch isn't completed */
			message;
			hm.c(((Throwable) (message)), "AMapDelegateImp", "CameraUpdateFinish");
			break; /* Loop/switch isn't completed */
_L11:
			if(a.f.isInMapAnimation(1) && com.amap.api.mapcore.util.b.i(a) != null)
				com.amap.api.mapcore.util.b.i(a).b(false);
			if(com.amap.api.mapcore.util.b.i(a) == null)
				break; /* Loop/switch isn't completed */
			obj = ((Object) (com.amap.api.mapcore.util.b.i(a)));
			if(message.arg1 != 0)
				flag = true;
			else
		//* 391  985:aload_1         
		//* 392  986:invokevirtual   #98  <Method void Throwable.printStackTrace()>
		//* 393  989:return          
		//* 394  990:return          
		//* 395  991:goto            584
				flag = false;
		//  396  994:iconst_0        
		//  397  995:istore_3        
			((af) (obj)).a(flag);
			break; /* Loop/switch isn't completed */
_L14:
			try
			{
				com.amap.api.mapcore.util.b.k(a).onPOIClick((Poi)message.obj);
				break; /* Loop/switch isn't completed */
			}
			// Misplaced declaration of an exception variable
			catch(Message message) { }
			hm.c(((Throwable) (message)), "AMapDelegateImp", "OnPOIClickListener.onPOIClick");
			((Throwable) (message)).printStackTrace();
			break; /* Loop/switch isn't completed */
_L13:
			if(com.amap.api.mapcore.util.b.l(a) == null)
				break; /* Loop/switch isn't completed */
			obj = ((Object) (DPoint.obtain()));
			a.b(message.arg1, message.arg2, ((DPoint) (obj)));
			try
			{
				com.amap.api.mapcore.util.b.l(a).onMapClick(new LatLng(((DPoint) (obj)).y, ((DPoint) (obj)).x));
				((DPoint) (obj)).recycle();
				break MISSING_BLOCK_LABEL_999;
			}
			// Misplaced declaration of an exception variable
			catch(Message message) { }
			hm.c(((Throwable) (message)), "AMapDelegateImp", "OnMapClickListener.onMapClick");
			((Throwable) (message)).printStackTrace();
			break MISSING_BLOCK_LABEL_999;
_L12:
			if(com.amap.api.mapcore.util.b.m(a) != null && com.amap.api.mapcore.util.b.n(a))
				com.amap.api.mapcore.util.b.m(a).c();
			return;
			((Throwable) (message)).printStackTrace();
			return;
			return;
		//* 398  996:goto            810
		//  399  999:return          
		}

		final com.amap.api.mapcore.util.b a;

			
			{
				a = com.amap.api.mapcore.util.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field b a>
				super(looper);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void Handler(Looper)>
			//    6   10:return          
			}
	}
;
	Point j;
	Rect k;
	protected String l;
	float m[];
	float n[];
	float o[];
	float p[];
	String q;
	String r;
	int s;
	private com.amap.api.maps.AMap.OnMarkerClickListener t;
	private com.amap.api.maps.AMap.OnPolylineClickListener u;
	private com.amap.api.maps.AMap.OnMarkerDragListener v;
	private com.amap.api.maps.AMap.OnMapLoadedListener w;
	private com.amap.api.maps.AMap.OnCameraChangeListener x;
	private com.amap.api.maps.AMap.OnMapClickListener y;
	private com.amap.api.maps.AMap.OnMapTouchListener z;
}
