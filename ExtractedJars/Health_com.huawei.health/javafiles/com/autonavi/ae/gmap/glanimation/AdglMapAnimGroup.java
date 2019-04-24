// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.glanimation;

import android.os.SystemClock;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

// Referenced classes of package com.autonavi.ae.gmap.glanimation:
//			AbstractAdglAnimation, AbstractAdglAnimationParam1V, AbstractAdglAnimationParam2V

public class AdglMapAnimGroup extends AbstractAdglAnimation
{

	public AdglMapAnimGroup(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractAdglAnimation()>
		zoomStartParam = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
		zoomEndParam = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
		moveParam = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
		rotateMapParam = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
		rotateCameraParam = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
		reset();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #48  <Method void reset()>
		duration = i;
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:putfield        #51  <Field int duration>
	//   22   38:return          
	}

	public static boolean checkLevel(float f)
	{
		return f >= 3F && f <= 20F;
	//    0    0:fload_0         
	//    1    1:ldc1            #55  <Float 3F>
	//    2    3:fcmpl           
	//    3    4:iflt            16
	//    4    7:fload_0         
	//    5    8:ldc1            #56  <Float 20F>
	//    6   10:fcmpg           
	//    7   11:ifgt            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	private void initZoomEndParam(float f, float f1, int i)
	{
		if(zoomEndParam == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//*   2    4:ifnonnull       18
			zoomEndParam = new AbstractAdglAnimationParam1V();
	//    3    7:aload_0         
	//    4    8:new             #60  <Class AbstractAdglAnimationParam1V>
	//    5   11:dup             
	//    6   12:invokespecial   #61  <Method void AbstractAdglAnimationParam1V()>
	//    7   15:putfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
		zoomEndParam.reset();
	//    8   18:aload_0         
	//    9   19:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//   10   22:invokevirtual   #62  <Method void AbstractAdglAnimationParam1V.reset()>
		zoomEndParam.setInterpolatorType(i, 1.0F);
	//   11   25:aload_0         
	//   12   26:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//   13   29:iload_3         
	//   14   30:fconst_1        
	//   15   31:invokevirtual   #66  <Method void AbstractAdglAnimationParam1V.setInterpolatorType(int, float)>
		zoomEndParam.setToValue(f1);
	//   16   34:aload_0         
	//   17   35:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//   18   38:fload_2         
	//   19   39:invokevirtual   #70  <Method void AbstractAdglAnimationParam1V.setToValue(float)>
		zoomEndParam.setFromValue(f);
	//   20   42:aload_0         
	//   21   43:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//   22   46:fload_1         
	//   23   47:invokevirtual   #73  <Method void AbstractAdglAnimationParam1V.setFromValue(float)>
	//   24   50:return          
	}

	private void initZoomStartParam(float f, int i)
	{
		if(zoomStartParam == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//*   2    4:ifnonnull       18
			zoomStartParam = new AbstractAdglAnimationParam1V();
	//    3    7:aload_0         
	//    4    8:new             #60  <Class AbstractAdglAnimationParam1V>
	//    5   11:dup             
	//    6   12:invokespecial   #61  <Method void AbstractAdglAnimationParam1V()>
	//    7   15:putfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
		zoomStartParam.reset();
	//    8   18:aload_0         
	//    9   19:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   10   22:invokevirtual   #62  <Method void AbstractAdglAnimationParam1V.reset()>
		zoomStartParam.setInterpolatorType(i, 1.0F);
	//   11   25:aload_0         
	//   12   26:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   13   29:iload_2         
	//   14   30:fconst_1        
	//   15   31:invokevirtual   #66  <Method void AbstractAdglAnimationParam1V.setInterpolatorType(int, float)>
		zoomStartParam.setToValue(f);
	//   16   34:aload_0         
	//   17   35:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   18   38:fload_1         
	//   19   39:invokevirtual   #70  <Method void AbstractAdglAnimationParam1V.setToValue(float)>
	//   20   42:return          
	}

	public void commitAnimation(Object obj)
	{
		isOver = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #80  <Field boolean isOver>
		hasCheckParams = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #82  <Field boolean hasCheckParams>
		obj = ((Object) ((GLMapState)obj));
	//    6   10:aload_1         
	//    7   11:checkcast       #84  <Class GLMapState>
	//    8   14:astore_1        
		if(obj == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       20
			return;
	//   11   19:return          
		if(needZoom)
	//*  12   20:aload_0         
	//*  13   21:getfield        #86  <Field boolean needZoom>
	//*  14   24:ifeq            253
		{
			if(zoomStartParam == null)
	//*  15   27:aload_0         
	//*  16   28:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//*  17   31:ifnonnull       40
			{
				hasCheckParams = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #82  <Field boolean hasCheckParams>
				return;
	//   21   39:return          
			}
			float f = ((GLMapState) (obj)).getMapZoomer();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #90  <Method float GLMapState.getMapZoomer()>
	//   24   44:fstore_2        
			zoomStartParam.setFromValue(f);
	//   25   45:aload_0         
	//   26   46:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   27   49:fload_2         
	//   28   50:invokevirtual   #73  <Method void AbstractAdglAnimationParam1V.setFromValue(float)>
			if(hasMidZoom)
	//*  29   53:aload_0         
	//*  30   54:getfield        #92  <Field boolean hasMidZoom>
	//*  31   57:ifeq            167
			{
				float f3 = zoomStartParam.getToValue();
	//   32   60:aload_0         
	//   33   61:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   34   64:invokevirtual   #95  <Method float AbstractAdglAnimationParam1V.getToValue()>
	//   35   67:fstore_3        
				float f5 = zoomEndParam.getFromValue();
	//   36   68:aload_0         
	//   37   69:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//   38   72:invokevirtual   #98  <Method float AbstractAdglAnimationParam1V.getFromValue()>
	//   39   75:fstore          4
				float f7 = zoomEndParam.getToValue();
	//   40   77:aload_0         
	//   41   78:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//   42   81:invokevirtual   #95  <Method float AbstractAdglAnimationParam1V.getToValue()>
	//   43   84:fstore          5
				if((double)Math.abs(f3 - f) < 9.9999999999999995E-07D || (double)Math.abs(f5 - f7) < 9.9999999999999995E-07D)
	//*  44   86:fload_3         
	//*  45   87:fload_2         
	//*  46   88:fsub            
	//*  47   89:invokestatic    #104 <Method float Math.abs(float)>
	//*  48   92:f2d             
	//*  49   93:ldc2w           #105 <Double 9.9999999999999995E-07D>
	//*  50   96:dcmpg           
	//*  51   97:iflt            116
	//*  52  100:fload           4
	//*  53  102:fload           5
	//*  54  104:fsub            
	//*  55  105:invokestatic    #104 <Method float Math.abs(float)>
	//*  56  108:f2d             
	//*  57  109:ldc2w           #105 <Double 9.9999999999999995E-07D>
	//*  58  112:dcmpg           
	//*  59  113:ifge            151
				{
					hasMidZoom = false;
	//   60  116:aload_0         
	//   61  117:iconst_0        
	//   62  118:putfield        #92  <Field boolean hasMidZoom>
					zoomStartParam.setToValue(zoomEndParam.getToValue());
	//   63  121:aload_0         
	//   64  122:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   65  125:aload_0         
	//   66  126:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//   67  129:invokevirtual   #95  <Method float AbstractAdglAnimationParam1V.getToValue()>
	//   68  132:invokevirtual   #70  <Method void AbstractAdglAnimationParam1V.setToValue(float)>
					zoomStartParam.needToCaculate();
	//   69  135:aload_0         
	//   70  136:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   71  139:invokevirtual   #110 <Method boolean AbstractAdglAnimationParam1V.needToCaculate()>
	//   72  142:pop             
					zoomEndParam = null;
	//   73  143:aload_0         
	//   74  144:aconst_null     
	//   75  145:putfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
				} else
	//*  76  148:goto            167
				{
					zoomStartParam.needToCaculate();
	//   77  151:aload_0         
	//   78  152:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   79  155:invokevirtual   #110 <Method boolean AbstractAdglAnimationParam1V.needToCaculate()>
	//   80  158:pop             
					zoomEndParam.needToCaculate();
	//   81  159:aload_0         
	//   82  160:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//   83  163:invokevirtual   #110 <Method boolean AbstractAdglAnimationParam1V.needToCaculate()>
	//   84  166:pop             
				}
			}
			if(!hasMidZoom && (double)Math.abs(zoomStartParam.getFromValue() - zoomStartParam.getToValue()) < 9.9999999999999995E-07D)
	//*  85  167:aload_0         
	//*  86  168:getfield        #92  <Field boolean hasMidZoom>
	//*  87  171:ifne            205
	//*  88  174:aload_0         
	//*  89  175:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//*  90  178:invokevirtual   #98  <Method float AbstractAdglAnimationParam1V.getFromValue()>
	//*  91  181:aload_0         
	//*  92  182:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//*  93  185:invokevirtual   #95  <Method float AbstractAdglAnimationParam1V.getToValue()>
	//*  94  188:fsub            
	//*  95  189:invokestatic    #104 <Method float Math.abs(float)>
	//*  96  192:f2d             
	//*  97  193:ldc2w           #105 <Double 9.9999999999999995E-07D>
	//*  98  196:dcmpg           
	//*  99  197:ifge            205
				needZoom = false;
	//  100  200:aload_0         
	//  101  201:iconst_0        
	//  102  202:putfield        #86  <Field boolean needZoom>
			if(needZoom)
	//* 103  205:aload_0         
	//* 104  206:getfield        #86  <Field boolean needZoom>
	//* 105  209:ifeq            253
				if(hasMidZoom)
	//* 106  212:aload_0         
	//* 107  213:getfield        #92  <Field boolean hasMidZoom>
	//* 108  216:ifeq            245
				{
					startZoomDuration = duration - midZoomDuration >> 1;
	//  109  219:aload_0         
	//  110  220:aload_0         
	//  111  221:getfield        #51  <Field int duration>
	//  112  224:aload_0         
	//  113  225:getfield        #112 <Field int midZoomDuration>
	//  114  228:isub            
	//  115  229:iconst_1        
	//  116  230:ishr            
	//  117  231:putfield        #114 <Field int startZoomDuration>
					endZoomDuration = startZoomDuration;
	//  118  234:aload_0         
	//  119  235:aload_0         
	//  120  236:getfield        #114 <Field int startZoomDuration>
	//  121  239:putfield        #116 <Field int endZoomDuration>
				} else
	//* 122  242:goto            253
				{
					startZoomDuration = duration;
	//  123  245:aload_0         
	//  124  246:aload_0         
	//  125  247:getfield        #51  <Field int duration>
	//  126  250:putfield        #114 <Field int startZoomDuration>
				}
		}
		if(needMove && moveParam != null)
	//* 127  253:aload_0         
	//* 128  254:getfield        #118 <Field boolean needMove>
	//* 129  257:ifeq            321
	//* 130  260:aload_0         
	//* 131  261:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//* 132  264:ifnull          321
		{
			IPoint ipoint = IPoint.obtain();
	//  133  267:invokestatic    #124 <Method IPoint IPoint.obtain()>
	//  134  270:astore          8
			((GLMapState) (obj)).getMapGeoCenter(ipoint);
	//  135  272:aload_1         
	//  136  273:aload           8
	//  137  275:invokevirtual   #128 <Method void GLMapState.getMapGeoCenter(IPoint)>
			int i = ipoint.x;
	//  138  278:aload           8
	//  139  280:getfield        #131 <Field int IPoint.x>
	//  140  283:istore          6
			int k = ipoint.y;
	//  141  285:aload           8
	//  142  287:getfield        #134 <Field int IPoint.y>
	//  143  290:istore          7
			ipoint.recycle();
	//  144  292:aload           8
	//  145  294:invokevirtual   #137 <Method void IPoint.recycle()>
			moveParam.setFromValue(i, k);
	//  146  297:aload_0         
	//  147  298:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//  148  301:iload           6
	//  149  303:i2f             
	//  150  304:iload           7
	//  151  306:i2f             
	//  152  307:invokevirtual   #142 <Method void AbstractAdglAnimationParam2V.setFromValue(float, float)>
			needMove = moveParam.needToCaculate();
	//  153  310:aload_0         
	//  154  311:aload_0         
	//  155  312:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//  156  315:invokevirtual   #143 <Method boolean AbstractAdglAnimationParam2V.needToCaculate()>
	//  157  318:putfield        #118 <Field boolean needMove>
		}
		if(needRotateMap && rotateMapParam != null)
	//* 158  321:aload_0         
	//* 159  322:getfield        #145 <Field boolean needRotateMap>
	//* 160  325:ifeq            439
	//* 161  328:aload_0         
	//* 162  329:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//* 163  332:ifnull          439
		{
			float f6 = ((GLMapState) (obj)).getMapAngle();
	//  164  335:aload_1         
	//  165  336:invokevirtual   #148 <Method float GLMapState.getMapAngle()>
	//  166  339:fstore          4
			float f4 = rotateMapParam.getToValue();
	//  167  341:aload_0         
	//  168  342:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//  169  345:invokevirtual   #95  <Method float AbstractAdglAnimationParam1V.getToValue()>
	//  170  348:fstore_3        
			float f1 = f4;
	//  171  349:fload_3         
	//  172  350:fstore_2        
			if(f6 > 180F)
	//* 173  351:fload           4
	//* 174  353:ldc1            #149 <Float 180F>
	//* 175  355:fcmpl           
	//* 176  356:ifle            370
			{
				f1 = f4;
	//  177  359:fload_3         
	//  178  360:fstore_2        
				if(f4 == 0.0F)
	//* 179  361:fload_3         
	//* 180  362:fconst_0        
	//* 181  363:fcmpl           
	//* 182  364:ifne            370
					f1 = 360F;
	//  183  367:ldc1            #150 <Float 360F>
	//  184  369:fstore_2        
			}
			int j = (int)f1 - (int)f6;
	//  185  370:fload_2         
	//  186  371:f2i             
	//  187  372:fload           4
	//  188  374:f2i             
	//  189  375:isub            
	//  190  376:istore          6
			if((float)j > 180F)
	//* 191  378:iload           6
	//* 192  380:i2f             
	//* 193  381:ldc1            #149 <Float 180F>
	//* 194  383:fcmpl           
	//* 195  384:ifle            395
			{
				f4 = f1 - 360F;
	//  196  387:fload_2         
	//  197  388:ldc1            #150 <Float 360F>
	//  198  390:fsub            
	//  199  391:fstore_3        
			} else
	//* 200  392:goto            411
			{
				f4 = f1;
	//  201  395:fload_2         
	//  202  396:fstore_3        
				if((float)j < -180F)
	//* 203  397:iload           6
	//* 204  399:i2f             
	//* 205  400:ldc1            #151 <Float -180F>
	//* 206  402:fcmpg           
	//* 207  403:ifge            411
					f4 = f1 + 360F;
	//  208  406:fload_2         
	//  209  407:ldc1            #150 <Float 360F>
	//  210  409:fadd            
	//  211  410:fstore_3        
			}
			rotateMapParam.setFromValue(f6);
	//  212  411:aload_0         
	//  213  412:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//  214  415:fload           4
	//  215  417:invokevirtual   #73  <Method void AbstractAdglAnimationParam1V.setFromValue(float)>
			rotateMapParam.setToValue(f4);
	//  216  420:aload_0         
	//  217  421:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//  218  424:fload_3         
	//  219  425:invokevirtual   #70  <Method void AbstractAdglAnimationParam1V.setToValue(float)>
			needRotateMap = rotateMapParam.needToCaculate();
	//  220  428:aload_0         
	//  221  429:aload_0         
	//  222  430:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//  223  433:invokevirtual   #110 <Method boolean AbstractAdglAnimationParam1V.needToCaculate()>
	//  224  436:putfield        #145 <Field boolean needRotateMap>
		}
		if(needRotateCamera && rotateCameraParam != null)
	//* 225  439:aload_0         
	//* 226  440:getfield        #153 <Field boolean needRotateCamera>
	//* 227  443:ifeq            477
	//* 228  446:aload_0         
	//* 229  447:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//* 230  450:ifnull          477
		{
			float f2 = ((GLMapState) (obj)).getCameraDegree();
	//  231  453:aload_1         
	//  232  454:invokevirtual   #156 <Method float GLMapState.getCameraDegree()>
	//  233  457:fstore_2        
			rotateCameraParam.setFromValue(f2);
	//  234  458:aload_0         
	//  235  459:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//  236  462:fload_2         
	//  237  463:invokevirtual   #73  <Method void AbstractAdglAnimationParam1V.setFromValue(float)>
			needRotateCamera = rotateCameraParam.needToCaculate();
	//  238  466:aload_0         
	//  239  467:aload_0         
	//  240  468:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//  241  471:invokevirtual   #110 <Method boolean AbstractAdglAnimationParam1V.needToCaculate()>
	//  242  474:putfield        #153 <Field boolean needRotateCamera>
		}
		if(!needMove && !needZoom && !needRotateMap && !needRotateCamera)
	//* 243  477:aload_0         
	//* 244  478:getfield        #118 <Field boolean needMove>
	//* 245  481:ifne            513
	//* 246  484:aload_0         
	//* 247  485:getfield        #86  <Field boolean needZoom>
	//* 248  488:ifne            513
	//* 249  491:aload_0         
	//* 250  492:getfield        #145 <Field boolean needRotateMap>
	//* 251  495:ifne            513
	//* 252  498:aload_0         
	//* 253  499:getfield        #153 <Field boolean needRotateCamera>
	//* 254  502:ifne            513
			isOver = true;
	//  255  505:aload_0         
	//  256  506:iconst_1        
	//  257  507:putfield        #80  <Field boolean isOver>
		else
	//* 258  510:goto            518
			isOver = false;
	//  259  513:aload_0         
	//  260  514:iconst_0        
	//  261  515:putfield        #80  <Field boolean isOver>
		hasCheckParams = true;
	//  262  518:aload_0         
	//  263  519:iconst_1        
	//  264  520:putfield        #82  <Field boolean hasCheckParams>
		startTime = SystemClock.uptimeMillis();
	//  265  523:aload_0         
	//  266  524:invokestatic    #162 <Method long SystemClock.uptimeMillis()>
	//  267  527:putfield        #166 <Field long startTime>
	//  268  530:return          
	}

	public void doAnimation(Object obj)
	{
		GLMapState glmapstate = (GLMapState)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #84  <Class GLMapState>
	//    2    4:astore          8
		if(glmapstate == null)
	//*   3    6:aload           8
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(!hasCheckParams)
	//*   6   12:aload_0         
	//*   7   13:getfield        #82  <Field boolean hasCheckParams>
	//*   8   16:ifne            24
			commitAnimation(obj);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #169 <Method void commitAnimation(Object)>
		if(isOver)
	//*  12   24:aload_0         
	//*  13   25:getfield        #80  <Field boolean isOver>
	//*  14   28:ifeq            32
			return;
	//   15   31:return          
		offsetTime = SystemClock.uptimeMillis() - startTime;
	//   16   32:aload_0         
	//   17   33:invokestatic    #162 <Method long SystemClock.uptimeMillis()>
	//   18   36:aload_0         
	//   19   37:getfield        #166 <Field long startTime>
	//   20   40:lsub            
	//   21   41:putfield        #172 <Field long offsetTime>
		if((float)duration == 0.0F)
	//*  22   44:aload_0         
	//*  23   45:getfield        #51  <Field int duration>
	//*  24   48:i2f             
	//*  25   49:fconst_0        
	//*  26   50:fcmpl           
	//*  27   51:ifne            60
		{
			isOver = true;
	//   28   54:aload_0         
	//   29   55:iconst_1        
	//   30   56:putfield        #80  <Field boolean isOver>
			return;
	//   31   59:return          
		}
		float f = (float)offsetTime / (float)duration;
	//   32   60:aload_0         
	//   33   61:getfield        #172 <Field long offsetTime>
	//   34   64:l2f             
	//   35   65:aload_0         
	//   36   66:getfield        #51  <Field int duration>
	//   37   69:i2f             
	//   38   70:fdiv            
	//   39   71:fstore_2        
		float f3;
		if(f > 1.0F)
	//*  40   72:fload_2         
	//*  41   73:fconst_1        
	//*  42   74:fcmpl           
	//*  43   75:ifle            88
		{
			f3 = 1.0F;
	//   44   78:fconst_1        
	//   45   79:fstore_3        
			isOver = true;
	//   46   80:aload_0         
	//   47   81:iconst_1        
	//   48   82:putfield        #80  <Field boolean isOver>
		} else
	//*  49   85:goto            102
		{
			f3 = f;
	//   50   88:fload_2         
	//   51   89:fstore_3        
			if(f < 0.0F)
	//*  52   90:fload_2         
	//*  53   91:fconst_0        
	//*  54   92:fcmpg           
	//*  55   93:ifge            102
			{
				isOver = true;
	//   56   96:aload_0         
	//   57   97:iconst_1        
	//   58   98:putfield        #80  <Field boolean isOver>
				return;
	//   59  101:return          
			}
		}
		if(needZoom)
	//*  60  102:aload_0         
	//*  61  103:getfield        #86  <Field boolean needZoom>
	//*  62  106:ifeq            275
		{
			glmapstate.getMapZoomer();
	//   63  109:aload           8
	//   64  111:invokevirtual   #90  <Method float GLMapState.getMapZoomer()>
	//   65  114:pop             
			float f1;
			if(hasMidZoom)
	//*  66  115:aload_0         
	//*  67  116:getfield        #92  <Field boolean hasMidZoom>
	//*  68  119:ifeq            253
			{
				if(offsetTime <= (long)startZoomDuration)
	//*  69  122:aload_0         
	//*  70  123:getfield        #172 <Field long offsetTime>
	//*  71  126:aload_0         
	//*  72  127:getfield        #114 <Field int startZoomDuration>
	//*  73  130:i2l             
	//*  74  131:lcmp            
	//*  75  132:ifgt            166
				{
					f1 = (float)offsetTime / (float)startZoomDuration;
	//   76  135:aload_0         
	//   77  136:getfield        #172 <Field long offsetTime>
	//   78  139:l2f             
	//   79  140:aload_0         
	//   80  141:getfield        #114 <Field int startZoomDuration>
	//   81  144:i2f             
	//   82  145:fdiv            
	//   83  146:fstore_2        
					zoomStartParam.setNormalizedTime(f1);
	//   84  147:aload_0         
	//   85  148:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   86  151:fload_2         
	//   87  152:invokevirtual   #175 <Method void AbstractAdglAnimationParam1V.setNormalizedTime(float)>
					f1 = zoomStartParam.getCurValue();
	//   88  155:aload_0         
	//   89  156:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   90  159:invokevirtual   #178 <Method float AbstractAdglAnimationParam1V.getCurValue()>
	//   91  162:fstore_2        
				} else
	//*  92  163:goto            235
				if(offsetTime <= (long)(startZoomDuration + midZoomDuration))
	//*  93  166:aload_0         
	//*  94  167:getfield        #172 <Field long offsetTime>
	//*  95  170:aload_0         
	//*  96  171:getfield        #114 <Field int startZoomDuration>
	//*  97  174:aload_0         
	//*  98  175:getfield        #112 <Field int midZoomDuration>
	//*  99  178:iadd            
	//* 100  179:i2l             
	//* 101  180:lcmp            
	//* 102  181:ifgt            195
				{
					f1 = zoomStartParam.getToValue();
	//  103  184:aload_0         
	//  104  185:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//  105  188:invokevirtual   #95  <Method float AbstractAdglAnimationParam1V.getToValue()>
	//  106  191:fstore_2        
				} else
	//* 107  192:goto            235
				{
					f1 = (float)(offsetTime - (long)startZoomDuration - (long)midZoomDuration) / (float)endZoomDuration;
	//  108  195:aload_0         
	//  109  196:getfield        #172 <Field long offsetTime>
	//  110  199:aload_0         
	//  111  200:getfield        #114 <Field int startZoomDuration>
	//  112  203:i2l             
	//  113  204:lsub            
	//  114  205:aload_0         
	//  115  206:getfield        #112 <Field int midZoomDuration>
	//  116  209:i2l             
	//  117  210:lsub            
	//  118  211:l2f             
	//  119  212:aload_0         
	//  120  213:getfield        #116 <Field int endZoomDuration>
	//  121  216:i2f             
	//  122  217:fdiv            
	//  123  218:fstore_2        
					zoomEndParam.setNormalizedTime(f1);
	//  124  219:aload_0         
	//  125  220:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//  126  223:fload_2         
	//  127  224:invokevirtual   #175 <Method void AbstractAdglAnimationParam1V.setNormalizedTime(float)>
					f1 = zoomEndParam.getCurValue();
	//  128  227:aload_0         
	//  129  228:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//  130  231:invokevirtual   #178 <Method float AbstractAdglAnimationParam1V.getCurValue()>
	//  131  234:fstore_2        
				}
				if(isOver)
	//* 132  235:aload_0         
	//* 133  236:getfield        #80  <Field boolean isOver>
	//* 134  239:ifeq            250
					f1 = zoomEndParam.getToValue();
	//  135  242:aload_0         
	//  136  243:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//  137  246:invokevirtual   #95  <Method float AbstractAdglAnimationParam1V.getToValue()>
	//  138  249:fstore_2        
			} else
	//* 139  250:goto            269
			{
				zoomStartParam.setNormalizedTime(f3);
	//  140  253:aload_0         
	//  141  254:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//  142  257:fload_3         
	//  143  258:invokevirtual   #175 <Method void AbstractAdglAnimationParam1V.setNormalizedTime(float)>
				f1 = zoomStartParam.getCurValue();
	//  144  261:aload_0         
	//  145  262:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//  146  265:invokevirtual   #178 <Method float AbstractAdglAnimationParam1V.getCurValue()>
	//  147  268:fstore_2        
			}
			glmapstate.setMapZoomer(f1);
	//  148  269:aload           8
	//  149  271:fload_2         
	//  150  272:invokevirtual   #181 <Method void GLMapState.setMapZoomer(float)>
		}
		if(moveParam != null && needMove)
	//* 151  275:aload_0         
	//* 152  276:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//* 153  279:ifnull          374
	//* 154  282:aload_0         
	//* 155  283:getfield        #118 <Field boolean needMove>
	//* 156  286:ifeq            374
		{
			moveParam.setNormalizedTime(f3);
	//  157  289:aload_0         
	//  158  290:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//  159  293:fload_3         
	//  160  294:invokevirtual   #182 <Method void AbstractAdglAnimationParam2V.setNormalizedTime(float)>
			int i = (int)moveParam.getFromXValue();
	//  161  297:aload_0         
	//  162  298:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//  163  301:invokevirtual   #185 <Method float AbstractAdglAnimationParam2V.getFromXValue()>
	//  164  304:f2i             
	//  165  305:istore          4
			int j = (int)moveParam.getFromYValue();
	//  166  307:aload_0         
	//  167  308:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//  168  311:invokevirtual   #188 <Method float AbstractAdglAnimationParam2V.getFromYValue()>
	//  169  314:f2i             
	//  170  315:istore          5
			int k = (int)moveParam.getToXValue();
	//  171  317:aload_0         
	//  172  318:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//  173  321:invokevirtual   #191 <Method float AbstractAdglAnimationParam2V.getToXValue()>
	//  174  324:f2i             
	//  175  325:istore          6
			int l = (int)moveParam.getToYValue();
	//  176  327:aload_0         
	//  177  328:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//  178  331:invokevirtual   #194 <Method float AbstractAdglAnimationParam2V.getToYValue()>
	//  179  334:f2i             
	//  180  335:istore          7
			float f2 = moveParam.getCurMult();
	//  181  337:aload_0         
	//  182  338:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//  183  341:invokevirtual   #197 <Method float AbstractAdglAnimationParam2V.getCurMult()>
	//  184  344:fstore_2        
			glmapstate.setMapGeoCenter(i + (int)((float)(k - i) * f2), j + (int)((float)(l - j) * f2));
	//  185  345:aload           8
	//  186  347:iload           4
	//  187  349:iload           6
	//  188  351:iload           4
	//  189  353:isub            
	//  190  354:i2f             
	//  191  355:fload_2         
	//  192  356:fmul            
	//  193  357:f2i             
	//  194  358:iadd            
	//  195  359:iload           5
	//  196  361:iload           7
	//  197  363:iload           5
	//  198  365:isub            
	//  199  366:i2f             
	//  200  367:fload_2         
	//  201  368:fmul            
	//  202  369:f2i             
	//  203  370:iadd            
	//  204  371:invokevirtual   #201 <Method void GLMapState.setMapGeoCenter(int, int)>
		}
		if(rotateMapParam != null && needRotateMap)
	//* 205  374:aload_0         
	//* 206  375:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//* 207  378:ifnull          410
	//* 208  381:aload_0         
	//* 209  382:getfield        #145 <Field boolean needRotateMap>
	//* 210  385:ifeq            410
		{
			rotateMapParam.setNormalizedTime(f3);
	//  211  388:aload_0         
	//  212  389:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//  213  392:fload_3         
	//  214  393:invokevirtual   #175 <Method void AbstractAdglAnimationParam1V.setNormalizedTime(float)>
			glmapstate.setMapAngle((int)rotateMapParam.getCurValue());
	//  215  396:aload           8
	//  216  398:aload_0         
	//  217  399:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//  218  402:invokevirtual   #178 <Method float AbstractAdglAnimationParam1V.getCurValue()>
	//  219  405:f2i             
	//  220  406:i2f             
	//  221  407:invokevirtual   #204 <Method void GLMapState.setMapAngle(float)>
		}
		if(rotateCameraParam != null && needRotateCamera)
	//* 222  410:aload_0         
	//* 223  411:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//* 224  414:ifnull          446
	//* 225  417:aload_0         
	//* 226  418:getfield        #153 <Field boolean needRotateCamera>
	//* 227  421:ifeq            446
		{
			rotateCameraParam.setNormalizedTime(f3);
	//  228  424:aload_0         
	//  229  425:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//  230  428:fload_3         
	//  231  429:invokevirtual   #175 <Method void AbstractAdglAnimationParam1V.setNormalizedTime(float)>
			glmapstate.setCameraDegree((int)rotateCameraParam.getCurValue());
	//  232  432:aload           8
	//  233  434:aload_0         
	//  234  435:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//  235  438:invokevirtual   #178 <Method float AbstractAdglAnimationParam1V.getCurValue()>
	//  236  441:f2i             
	//  237  442:i2f             
	//  238  443:invokevirtual   #207 <Method void GLMapState.setCameraDegree(float)>
		}
	//  239  446:return          
	}

	public boolean isValid()
	{
		return needRotateCamera || needRotateMap || needMove || needZoom;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field boolean needRotateCamera>
	//    2    4:ifne            28
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field boolean needRotateMap>
	//    5   11:ifne            28
	//    6   14:aload_0         
	//    7   15:getfield        #118 <Field boolean needMove>
	//    8   18:ifne            28
	//    9   21:aload_0         
	//   10   22:getfield        #86  <Field boolean needZoom>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public void reset()
	{
		isOver = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #80  <Field boolean isOver>
		hasCheckParams = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #82  <Field boolean hasCheckParams>
		needZoom = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #86  <Field boolean needZoom>
		needMove = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #118 <Field boolean needMove>
		moveParam = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
		needRotateMap = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #145 <Field boolean needRotateMap>
		rotateMapParam = null;
	//   18   30:aload_0         
	//   19   31:aconst_null     
	//   20   32:putfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
		hasMidZoom = false;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #92  <Field boolean hasMidZoom>
		duration = 0;
	//   24   40:aload_0         
	//   25   41:iconst_0        
	//   26   42:putfield        #51  <Field int duration>
		if(rotateMapParam != null)
	//*  27   45:aload_0         
	//*  28   46:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//*  29   49:ifnull          59
			rotateMapParam.reset();
	//   30   52:aload_0         
	//   31   53:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//   32   56:invokevirtual   #62  <Method void AbstractAdglAnimationParam1V.reset()>
		if(moveParam != null)
	//*  33   59:aload_0         
	//*  34   60:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//*  35   63:ifnull          73
			moveParam.reset();
	//   36   66:aload_0         
	//   37   67:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//   38   70:invokevirtual   #209 <Method void AbstractAdglAnimationParam2V.reset()>
		if(zoomStartParam != null)
	//*  39   73:aload_0         
	//*  40   74:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//*  41   77:ifnull          87
			zoomStartParam.reset();
	//   42   80:aload_0         
	//   43   81:getfield        #37  <Field AbstractAdglAnimationParam1V zoomStartParam>
	//   44   84:invokevirtual   #62  <Method void AbstractAdglAnimationParam1V.reset()>
		if(zoomEndParam != null)
	//*  45   87:aload_0         
	//*  46   88:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//*  47   91:ifnull          101
			zoomEndParam.reset();
	//   48   94:aload_0         
	//   49   95:getfield        #39  <Field AbstractAdglAnimationParam1V zoomEndParam>
	//   50   98:invokevirtual   #62  <Method void AbstractAdglAnimationParam1V.reset()>
		if(rotateCameraParam != null)
	//*  51  101:aload_0         
	//*  52  102:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//*  53  105:ifnull          115
			rotateCameraParam.reset();
	//   54  108:aload_0         
	//   55  109:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//   56  112:invokevirtual   #62  <Method void AbstractAdglAnimationParam1V.reset()>
	//   57  115:return          
	}

	public void setDuration(int i)
	{
		duration = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field int duration>
	//    3    5:return          
	}

	public void setToCameraDegree(float f, int i)
	{
		needRotateCamera = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #153 <Field boolean needRotateCamera>
		if(f <= 60F && f >= 0.0F)
	//*   3    5:fload_1         
	//*   4    6:ldc1            #212 <Float 60F>
	//*   5    8:fcmpg           
	//*   6    9:ifgt            65
	//*   7   12:fload_1         
	//*   8   13:fconst_0        
	//*   9   14:fcmpl           
	//*  10   15:iflt            65
		{
			needRotateCamera = true;
	//   11   18:aload_0         
	//   12   19:iconst_1        
	//   13   20:putfield        #153 <Field boolean needRotateCamera>
			if(rotateCameraParam == null)
	//*  14   23:aload_0         
	//*  15   24:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//*  16   27:ifnonnull       41
				rotateCameraParam = new AbstractAdglAnimationParam1V();
	//   17   30:aload_0         
	//   18   31:new             #60  <Class AbstractAdglAnimationParam1V>
	//   19   34:dup             
	//   20   35:invokespecial   #61  <Method void AbstractAdglAnimationParam1V()>
	//   21   38:putfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
			rotateCameraParam.reset();
	//   22   41:aload_0         
	//   23   42:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//   24   45:invokevirtual   #62  <Method void AbstractAdglAnimationParam1V.reset()>
			rotateCameraParam.setInterpolatorType(i, 1.0F);
	//   25   48:aload_0         
	//   26   49:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//   27   52:iload_2         
	//   28   53:fconst_1        
	//   29   54:invokevirtual   #66  <Method void AbstractAdglAnimationParam1V.setInterpolatorType(int, float)>
			rotateCameraParam.setToValue(f);
	//   30   57:aload_0         
	//   31   58:getfield        #45  <Field AbstractAdglAnimationParam1V rotateCameraParam>
	//   32   61:fload_1         
	//   33   62:invokevirtual   #70  <Method void AbstractAdglAnimationParam1V.setToValue(float)>
		}
	//   34   65:return          
	}

	public void setToMapAngle(float f, int i)
	{
		needRotateMap = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #145 <Field boolean needRotateMap>
		if(rotateMapParam == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//*   5    9:ifnonnull       23
			rotateMapParam = new AbstractAdglAnimationParam1V();
	//    6   12:aload_0         
	//    7   13:new             #60  <Class AbstractAdglAnimationParam1V>
	//    8   16:dup             
	//    9   17:invokespecial   #61  <Method void AbstractAdglAnimationParam1V()>
	//   10   20:putfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
		rotateMapParam.reset();
	//   11   23:aload_0         
	//   12   24:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//   13   27:invokevirtual   #62  <Method void AbstractAdglAnimationParam1V.reset()>
		rotateMapParam.setInterpolatorType(i, 1.0F);
	//   14   30:aload_0         
	//   15   31:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//   16   34:iload_2         
	//   17   35:fconst_1        
	//   18   36:invokevirtual   #66  <Method void AbstractAdglAnimationParam1V.setInterpolatorType(int, float)>
		rotateMapParam.setToValue(f % 360F);
	//   19   39:aload_0         
	//   20   40:getfield        #43  <Field AbstractAdglAnimationParam1V rotateMapParam>
	//   21   43:fload_1         
	//   22   44:ldc1            #150 <Float 360F>
	//   23   46:frem            
	//   24   47:invokevirtual   #70  <Method void AbstractAdglAnimationParam1V.setToValue(float)>
	//   25   50:return          
	}

	public void setToMapCenterGeo(int i, int j, int k)
	{
		if(i > 0 && j > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            58
	//*   2    4:iload_2         
	//*   3    5:ifle            58
		{
			needMove = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #118 <Field boolean needMove>
			if(moveParam == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//*   9   17:ifnonnull       31
				moveParam = new AbstractAdglAnimationParam2V();
	//   10   20:aload_0         
	//   11   21:new             #139 <Class AbstractAdglAnimationParam2V>
	//   12   24:dup             
	//   13   25:invokespecial   #216 <Method void AbstractAdglAnimationParam2V()>
	//   14   28:putfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
			moveParam.reset();
	//   15   31:aload_0         
	//   16   32:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//   17   35:invokevirtual   #209 <Method void AbstractAdglAnimationParam2V.reset()>
			moveParam.setInterpolatorType(k, 1.0F);
	//   18   38:aload_0         
	//   19   39:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//   20   42:iload_3         
	//   21   43:fconst_1        
	//   22   44:invokevirtual   #217 <Method void AbstractAdglAnimationParam2V.setInterpolatorType(int, float)>
			moveParam.setToValue(i, j);
	//   23   47:aload_0         
	//   24   48:getfield        #41  <Field AbstractAdglAnimationParam2V moveParam>
	//   25   51:iload_1         
	//   26   52:i2f             
	//   27   53:iload_2         
	//   28   54:i2f             
	//   29   55:invokevirtual   #219 <Method void AbstractAdglAnimationParam2V.setToValue(float, float)>
		}
	//   30   58:return          
	}

	public void setToMapLevel(float f, float f1, int i)
	{
		needZoom = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #86  <Field boolean needZoom>
		midZoomDuration = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #112 <Field int midZoomDuration>
		hasMidZoom = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #92  <Field boolean hasMidZoom>
		if(i > 0 && i < duration)
	//*   9   15:iload_3         
	//*  10   16:ifle            32
	//*  11   19:iload_3         
	//*  12   20:aload_0         
	//*  13   21:getfield        #51  <Field int duration>
	//*  14   24:icmpge          32
			midZoomDuration = i;
	//   15   27:aload_0         
	//   16   28:iload_3         
	//   17   29:putfield        #112 <Field int midZoomDuration>
		if(checkLevel(f) && checkLevel(f1))
	//*  18   32:fload_1         
	//*  19   33:invokestatic    #222 <Method boolean checkLevel(float)>
	//*  20   36:ifeq            65
	//*  21   39:fload_2         
	//*  22   40:invokestatic    #222 <Method boolean checkLevel(float)>
	//*  23   43:ifeq            65
		{
			hasMidZoom = true;
	//   24   46:aload_0         
	//   25   47:iconst_1        
	//   26   48:putfield        #92  <Field boolean hasMidZoom>
			initZoomStartParam(f1, 0);
	//   27   51:aload_0         
	//   28   52:fload_2         
	//   29   53:iconst_0        
	//   30   54:invokespecial   #224 <Method void initZoomStartParam(float, int)>
			initZoomEndParam(f1, f, 0);
	//   31   57:aload_0         
	//   32   58:fload_2         
	//   33   59:fload_1         
	//   34   60:iconst_0        
	//   35   61:invokespecial   #226 <Method void initZoomEndParam(float, float, int)>
			return;
	//   36   64:return          
		}
		if(checkLevel(f))
	//*  37   65:fload_1         
	//*  38   66:invokestatic    #222 <Method boolean checkLevel(float)>
	//*  39   69:ifeq            84
		{
			hasMidZoom = false;
	//   40   72:aload_0         
	//   41   73:iconst_0        
	//   42   74:putfield        #92  <Field boolean hasMidZoom>
			initZoomStartParam(f, 0);
	//   43   77:aload_0         
	//   44   78:fload_1         
	//   45   79:iconst_0        
	//   46   80:invokespecial   #224 <Method void initZoomStartParam(float, int)>
			return;
	//   47   83:return          
		}
		if(checkLevel(f1))
	//*  48   84:fload_2         
	//*  49   85:invokestatic    #222 <Method boolean checkLevel(float)>
	//*  50   88:ifeq            103
		{
			hasMidZoom = false;
	//   51   91:aload_0         
	//   52   92:iconst_0        
	//   53   93:putfield        #92  <Field boolean hasMidZoom>
			initZoomStartParam(f1, 0);
	//   54   96:aload_0         
	//   55   97:fload_2         
	//   56   98:iconst_0        
	//   57   99:invokespecial   #224 <Method void initZoomStartParam(float, int)>
			return;
	//   58  102:return          
		} else
		{
			needZoom = false;
	//   59  103:aload_0         
	//   60  104:iconst_0        
	//   61  105:putfield        #86  <Field boolean needZoom>
			return;
	//   62  108:return          
		}
	}

	public void setToMapLevel(float f, int i)
	{
		needZoom = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #86  <Field boolean needZoom>
		midZoomDuration = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #112 <Field int midZoomDuration>
		hasMidZoom = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #92  <Field boolean hasMidZoom>
		if(checkLevel(f))
	//*   9   15:fload_1         
	//*  10   16:invokestatic    #222 <Method boolean checkLevel(float)>
	//*  11   19:ifeq            29
		{
			initZoomStartParam(f, i);
	//   12   22:aload_0         
	//   13   23:fload_1         
	//   14   24:iload_2         
	//   15   25:invokespecial   #224 <Method void initZoomStartParam(float, int)>
			return;
	//   16   28:return          
		} else
		{
			needZoom = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #86  <Field boolean needZoom>
			return;
	//   20   34:return          
		}
	}

	public boolean typeEqueal(AdglMapAnimGroup adglmapanimgroup)
	{
		return needRotateCamera == adglmapanimgroup.needRotateCamera && needRotateMap == adglmapanimgroup.needRotateMap && needZoom == adglmapanimgroup.needZoom && needMove == adglmapanimgroup.needMove;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field boolean needRotateCamera>
	//    2    4:aload_1         
	//    3    5:getfield        #153 <Field boolean needRotateCamera>
	//    4    8:icmpne          46
	//    5   11:aload_0         
	//    6   12:getfield        #145 <Field boolean needRotateMap>
	//    7   15:aload_1         
	//    8   16:getfield        #145 <Field boolean needRotateMap>
	//    9   19:icmpne          46
	//   10   22:aload_0         
	//   11   23:getfield        #86  <Field boolean needZoom>
	//   12   26:aload_1         
	//   13   27:getfield        #86  <Field boolean needZoom>
	//   14   30:icmpne          46
	//   15   33:aload_0         
	//   16   34:getfield        #118 <Field boolean needMove>
	//   17   37:aload_1         
	//   18   38:getfield        #118 <Field boolean needMove>
	//   19   41:icmpne          46
	//   20   44:iconst_1        
	//   21   45:ireturn         
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	public static final int CAMERA_MAX_DEGREE = 60;
	public static final int CAMERA_MIN_DEGREE = 0;
	public static final int MAXMAPLEVEL = 20;
	public static final int MINMAPLEVEL = 3;
	int endZoomDuration;
	boolean hasCheckParams;
	boolean hasMidZoom;
	int midZoomDuration;
	AbstractAdglAnimationParam2V moveParam;
	public boolean needMove;
	boolean needRotateCamera;
	boolean needRotateMap;
	boolean needZoom;
	AbstractAdglAnimationParam1V rotateCameraParam;
	AbstractAdglAnimationParam1V rotateMapParam;
	int startZoomDuration;
	AbstractAdglAnimationParam1V zoomEndParam;
	AbstractAdglAnimationParam1V zoomStartParam;
}
