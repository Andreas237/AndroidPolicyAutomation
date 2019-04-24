// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.glanimation;

import android.graphics.Point;
import android.os.SystemClock;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

// Referenced classes of package com.autonavi.ae.gmap.glanimation:
//			AbstractAdglAnimation, AbstractAdglAnimationParam1V

public class AdglMapAnimPivotZoom extends AbstractAdglAnimation
{

	public AdglMapAnimPivotZoom(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AbstractAdglAnimation()>
		zoomParam = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field AbstractAdglAnimationParam1V zoomParam>
		reset();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #28  <Method void reset()>
		duration = i;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #31  <Field int duration>
	//   10   18:return          
	}

	public void commitAnimation(Object obj)
	{
		isOver = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #37  <Field boolean isOver>
		hasCheckParams = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #39  <Field boolean hasCheckParams>
		obj = ((Object) ((GLMapState)obj));
	//    6   10:aload_1         
	//    7   11:checkcast       #41  <Class GLMapState>
	//    8   14:astore_1        
		if(obj == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       20
			return;
	//   11   19:return          
		float f = ((GLMapState) (obj)).getMapZoomer();
	//   12   20:aload_1         
	//   13   21:invokevirtual   #45  <Method float GLMapState.getMapZoomer()>
	//   14   24:fstore_2        
		if((double)Math.abs(mapLevelTo - f) < 9.9999999999999995E-07D)
	//*  15   25:aload_0         
	//*  16   26:getfield        #47  <Field float mapLevelTo>
	//*  17   29:fload_2         
	//*  18   30:fsub            
	//*  19   31:invokestatic    #53  <Method float Math.abs(float)>
	//*  20   34:f2d             
	//*  21   35:ldc2w           #54  <Double 9.9999999999999995E-07D>
	//*  22   38:dcmpg           
	//*  23   39:ifge            53
		{
			isOver = true;
	//   24   42:aload_0         
	//   25   43:iconst_1        
	//   26   44:putfield        #37  <Field boolean isOver>
			hasCheckParams = true;
	//   27   47:aload_0         
	//   28   48:iconst_1        
	//   29   49:putfield        #39  <Field boolean hasCheckParams>
			return;
	//   30   52:return          
		}
		zoomParam.setFromValue(f);
	//   31   53:aload_0         
	//   32   54:getfield        #25  <Field AbstractAdglAnimationParam1V zoomParam>
	//   33   57:fload_2         
	//   34   58:invokevirtual   #61  <Method void AbstractAdglAnimationParam1V.setFromValue(float)>
		zoomParam.setToValue(mapLevelTo);
	//   35   61:aload_0         
	//   36   62:getfield        #25  <Field AbstractAdglAnimationParam1V zoomParam>
	//   37   65:aload_0         
	//   38   66:getfield        #47  <Field float mapLevelTo>
	//   39   69:invokevirtual   #64  <Method void AbstractAdglAnimationParam1V.setToValue(float)>
		if(!zoomCenter)
	//*  40   72:aload_0         
	//*  41   73:getfield        #66  <Field boolean zoomCenter>
	//*  42   76:ifne            152
		{
			IPoint ipoint = IPoint.obtain();
	//   43   79:invokestatic    #72  <Method IPoint IPoint.obtain()>
	//   44   82:astore_3        
			((GLMapState) (obj)).getMapGeoCenter(ipoint);
	//   45   83:aload_1         
	//   46   84:aload_3         
	//   47   85:invokevirtual   #76  <Method void GLMapState.getMapGeoCenter(IPoint)>
			beginCenterGeoX = ipoint.x;
	//   48   88:aload_0         
	//   49   89:aload_3         
	//   50   90:getfield        #79  <Field int IPoint.x>
	//   51   93:putfield        #81  <Field int beginCenterGeoX>
			beginCenterGeoY = ipoint.y;
	//   52   96:aload_0         
	//   53   97:aload_3         
	//   54   98:getfield        #84  <Field int IPoint.y>
	//   55  101:putfield        #86  <Field int beginCenterGeoY>
			IPoint ipoint1 = IPoint.obtain();
	//   56  104:invokestatic    #72  <Method IPoint IPoint.obtain()>
	//   57  107:astore          4
			((GLMapState) (obj)).screenToP20Point((int)winPivotX, (int)winPivotY, ((Point) (ipoint1)));
	//   58  109:aload_1         
	//   59  110:aload_0         
	//   60  111:getfield        #88  <Field float winPivotX>
	//   61  114:f2i             
	//   62  115:aload_0         
	//   63  116:getfield        #90  <Field float winPivotY>
	//   64  119:f2i             
	//   65  120:aload           4
	//   66  122:invokevirtual   #94  <Method void GLMapState.screenToP20Point(int, int, Point)>
			pivotGeoX = ipoint1.x;
	//   67  125:aload_0         
	//   68  126:aload           4
	//   69  128:getfield        #79  <Field int IPoint.x>
	//   70  131:putfield        #96  <Field int pivotGeoX>
			pivotGeoY = ipoint1.y;
	//   71  134:aload_0         
	//   72  135:aload           4
	//   73  137:getfield        #84  <Field int IPoint.y>
	//   74  140:putfield        #98  <Field int pivotGeoY>
			ipoint.recycle();
	//   75  143:aload_3         
	//   76  144:invokevirtual   #101 <Method void IPoint.recycle()>
			ipoint1.recycle();
	//   77  147:aload           4
	//   78  149:invokevirtual   #101 <Method void IPoint.recycle()>
		}
		hasCheckParams = true;
	//   79  152:aload_0         
	//   80  153:iconst_1        
	//   81  154:putfield        #39  <Field boolean hasCheckParams>
		isOver = false;
	//   82  157:aload_0         
	//   83  158:iconst_0        
	//   84  159:putfield        #37  <Field boolean isOver>
		startTime = SystemClock.uptimeMillis();
	//   85  162:aload_0         
	//   86  163:invokestatic    #107 <Method long SystemClock.uptimeMillis()>
	//   87  166:putfield        #111 <Field long startTime>
	//   88  169:return          
	}

	public void doAnimation(Object obj)
	{
		GLMapState glmapstate = (GLMapState)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #41  <Class GLMapState>
	//    2    4:astore          6
		if(glmapstate == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(!hasCheckParams)
	//*   6   12:aload_0         
	//*   7   13:getfield        #39  <Field boolean hasCheckParams>
	//*   8   16:ifne            24
			commitAnimation(obj);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #114 <Method void commitAnimation(Object)>
		if(isOver)
	//*  12   24:aload_0         
	//*  13   25:getfield        #37  <Field boolean isOver>
	//*  14   28:ifeq            32
			return;
	//   15   31:return          
		offsetTime = SystemClock.uptimeMillis() - startTime;
	//   16   32:aload_0         
	//   17   33:invokestatic    #107 <Method long SystemClock.uptimeMillis()>
	//   18   36:aload_0         
	//   19   37:getfield        #111 <Field long startTime>
	//   20   40:lsub            
	//   21   41:putfield        #117 <Field long offsetTime>
		float f2 = (float)offsetTime / (float)duration;
	//   22   44:aload_0         
	//   23   45:getfield        #117 <Field long offsetTime>
	//   24   48:l2f             
	//   25   49:aload_0         
	//   26   50:getfield        #31  <Field int duration>
	//   27   53:i2f             
	//   28   54:fdiv            
	//   29   55:fstore_3        
		float f = f2;
	//   30   56:fload_3         
	//   31   57:fstore_2        
		if(f2 > 1.0F)
	//*  32   58:fload_3         
	//*  33   59:fconst_1        
	//*  34   60:fcmpl           
	//*  35   61:ifle            71
		{
			f = 1.0F;
	//   36   64:fconst_1        
	//   37   65:fstore_2        
			isOver = true;
	//   38   66:aload_0         
	//   39   67:iconst_1        
	//   40   68:putfield        #37  <Field boolean isOver>
		}
		if(f >= 0.0F && f <= 1.0F)
	//*  41   71:fload_2         
	//*  42   72:fconst_0        
	//*  43   73:fcmpl           
	//*  44   74:iflt            221
	//*  45   77:fload_2         
	//*  46   78:fconst_1        
	//*  47   79:fcmpg           
	//*  48   80:ifgt            221
		{
			zoomParam.setNormalizedTime(f);
	//   49   83:aload_0         
	//   50   84:getfield        #25  <Field AbstractAdglAnimationParam1V zoomParam>
	//   51   87:fload_2         
	//   52   88:invokevirtual   #120 <Method void AbstractAdglAnimationParam1V.setNormalizedTime(float)>
			float f3 = zoomParam.getCurValue();
	//   53   91:aload_0         
	//   54   92:getfield        #25  <Field AbstractAdglAnimationParam1V zoomParam>
	//   55   95:invokevirtual   #123 <Method float AbstractAdglAnimationParam1V.getCurValue()>
	//   56   98:fstore_3        
			f = f3;
	//   57   99:fload_3         
	//   58  100:fstore_2        
			if(f3 > 20F)
	//*  59  101:fload_3         
	//*  60  102:ldc1            #124 <Float 20F>
	//*  61  104:fcmpl           
	//*  62  105:ifle            116
			{
				f = 20F;
	//   63  108:ldc1            #124 <Float 20F>
	//   64  110:fstore_2        
				isOver = true;
	//   65  111:aload_0         
	//   66  112:iconst_1        
	//   67  113:putfield        #37  <Field boolean isOver>
			}
			f3 = f;
	//   68  116:fload_2         
	//   69  117:fstore_3        
			if(f < 3F)
	//*  70  118:fload_2         
	//*  71  119:ldc1            #125 <Float 3F>
	//*  72  121:fcmpg           
	//*  73  122:ifge            133
			{
				f3 = 3F;
	//   74  125:ldc1            #125 <Float 3F>
	//   75  127:fstore_3        
				isOver = true;
	//   76  128:aload_0         
	//   77  129:iconst_1        
	//   78  130:putfield        #37  <Field boolean isOver>
			}
			if(!zoomCenter)
	//*  79  133:aload_0         
	//*  80  134:getfield        #66  <Field boolean zoomCenter>
	//*  81  137:ifne            215
			{
				float f1 = (float)Math.pow(2D, f3 - zoomParam.getFromValue());
	//   82  140:ldc2w           #126 <Double 2D>
	//   83  143:fload_3         
	//   84  144:aload_0         
	//   85  145:getfield        #25  <Field AbstractAdglAnimationParam1V zoomParam>
	//   86  148:invokevirtual   #130 <Method float AbstractAdglAnimationParam1V.getFromValue()>
	//   87  151:fsub            
	//   88  152:f2d             
	//   89  153:invokestatic    #134 <Method double Math.pow(double, double)>
	//   90  156:d2f             
	//   91  157:fstore_2        
				int i = (int)((float)(pivotGeoX - beginCenterGeoX) * (1.0F - 1.0F / f1));
	//   92  158:aload_0         
	//   93  159:getfield        #96  <Field int pivotGeoX>
	//   94  162:aload_0         
	//   95  163:getfield        #81  <Field int beginCenterGeoX>
	//   96  166:isub            
	//   97  167:i2f             
	//   98  168:fconst_1        
	//   99  169:fconst_1        
	//  100  170:fload_2         
	//  101  171:fdiv            
	//  102  172:fsub            
	//  103  173:fmul            
	//  104  174:f2i             
	//  105  175:istore          4
				int j = (int)((float)(pivotGeoY - beginCenterGeoY) * (1.0F - 1.0F / f1));
	//  106  177:aload_0         
	//  107  178:getfield        #98  <Field int pivotGeoY>
	//  108  181:aload_0         
	//  109  182:getfield        #86  <Field int beginCenterGeoY>
	//  110  185:isub            
	//  111  186:i2f             
	//  112  187:fconst_1        
	//  113  188:fconst_1        
	//  114  189:fload_2         
	//  115  190:fdiv            
	//  116  191:fsub            
	//  117  192:fmul            
	//  118  193:f2i             
	//  119  194:istore          5
				glmapstate.setMapGeoCenter(beginCenterGeoX + i, beginCenterGeoY + j);
	//  120  196:aload           6
	//  121  198:aload_0         
	//  122  199:getfield        #81  <Field int beginCenterGeoX>
	//  123  202:iload           4
	//  124  204:iadd            
	//  125  205:aload_0         
	//  126  206:getfield        #86  <Field int beginCenterGeoY>
	//  127  209:iload           5
	//  128  211:iadd            
	//  129  212:invokevirtual   #138 <Method void GLMapState.setMapGeoCenter(int, int)>
			}
			glmapstate.setMapZoomer(f3);
	//  130  215:aload           6
	//  131  217:fload_3         
	//  132  218:invokevirtual   #141 <Method void GLMapState.setMapZoomer(float)>
		}
	//  133  221:return          
	}

	public void reset()
	{
		isOver = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #37  <Field boolean isOver>
		hasCheckParams = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #39  <Field boolean hasCheckParams>
		zoomCenter = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #66  <Field boolean zoomCenter>
		mapLevelTo = 0.0F;
	//    9   15:aload_0         
	//   10   16:fconst_0        
	//   11   17:putfield        #47  <Field float mapLevelTo>
		beginCenterGeoX = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #81  <Field int beginCenterGeoX>
		beginCenterGeoY = 0;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #86  <Field int beginCenterGeoY>
		pivotGeoX = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #96  <Field int pivotGeoX>
		pivotGeoY = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #98  <Field int pivotGeoY>
		winPivotX = 0.0F;
	//   24   40:aload_0         
	//   25   41:fconst_0        
	//   26   42:putfield        #88  <Field float winPivotX>
		winPivotY = 0.0F;
	//   27   45:aload_0         
	//   28   46:fconst_0        
	//   29   47:putfield        #90  <Field float winPivotY>
		if(zoomParam != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #25  <Field AbstractAdglAnimationParam1V zoomParam>
	//*  32   54:ifnull          64
			zoomParam.reset();
	//   33   57:aload_0         
	//   34   58:getfield        #25  <Field AbstractAdglAnimationParam1V zoomParam>
	//   35   61:invokevirtual   #142 <Method void AbstractAdglAnimationParam1V.reset()>
	//   36   64:return          
	}

	public void setToMapZoomAndPivot(float f, int i, Point point)
	{
		zoomParam = new AbstractAdglAnimationParam1V();
	//    0    0:aload_0         
	//    1    1:new             #57  <Class AbstractAdglAnimationParam1V>
	//    2    4:dup             
	//    3    5:invokespecial   #145 <Method void AbstractAdglAnimationParam1V()>
	//    4    8:putfield        #25  <Field AbstractAdglAnimationParam1V zoomParam>
		zoomParam.setInterpolatorType(i, 1.0F);
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field AbstractAdglAnimationParam1V zoomParam>
	//    7   15:iload_2         
	//    8   16:fconst_1        
	//    9   17:invokevirtual   #149 <Method void AbstractAdglAnimationParam1V.setInterpolatorType(int, float)>
		float f1 = f;
	//   10   20:fload_1         
	//   11   21:fstore          4
		if(f > 20F)
	//*  12   23:fload_1         
	//*  13   24:ldc1            #124 <Float 20F>
	//*  14   26:fcmpl           
	//*  15   27:ifle            34
			f1 = 20F;
	//   16   30:ldc1            #124 <Float 20F>
	//   17   32:fstore          4
		f = f1;
	//   18   34:fload           4
	//   19   36:fstore_1        
		if(f1 < 3F)
	//*  20   37:fload           4
	//*  21   39:ldc1            #125 <Float 3F>
	//*  22   41:fcmpg           
	//*  23   42:ifge            48
			f = 3F;
	//   24   45:ldc1            #125 <Float 3F>
	//   25   47:fstore_1        
		mapLevelTo = f;
	//   26   48:aload_0         
	//   27   49:fload_1         
	//   28   50:putfield        #47  <Field float mapLevelTo>
		if(point != null)
	//*  29   53:aload_3         
	//*  30   54:ifnull          80
		{
			winPivotX = point.x;
	//   31   57:aload_0         
	//   32   58:aload_3         
	//   33   59:getfield        #152 <Field int Point.x>
	//   34   62:i2f             
	//   35   63:putfield        #88  <Field float winPivotX>
			winPivotY = point.y;
	//   36   66:aload_0         
	//   37   67:aload_3         
	//   38   68:getfield        #153 <Field int Point.y>
	//   39   71:i2f             
	//   40   72:putfield        #90  <Field float winPivotY>
			zoomCenter = false;
	//   41   75:aload_0         
	//   42   76:iconst_0        
	//   43   77:putfield        #66  <Field boolean zoomCenter>
		}
	//   44   80:return          
	}

	private int beginCenterGeoX;
	private int beginCenterGeoY;
	private boolean hasCheckParams;
	private float mapLevelTo;
	private int pivotGeoX;
	private int pivotGeoY;
	private float winPivotX;
	private float winPivotY;
	private boolean zoomCenter;
	AbstractAdglAnimationParam1V zoomParam;
}
