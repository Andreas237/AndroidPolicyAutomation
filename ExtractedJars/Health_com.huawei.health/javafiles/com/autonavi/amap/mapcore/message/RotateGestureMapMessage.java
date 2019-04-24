// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.message;

import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

// Referenced classes of package com.autonavi.amap.mapcore.message:
//			AbstractGestureMapMessage

public class RotateGestureMapMessage extends AbstractGestureMapMessage
{

	public RotateGestureMapMessage(int i, float f, int j, int k)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #25  <Method void AbstractGestureMapMessage(int)>
		pivotX = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #27  <Field int pivotX>
		pivotY = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #29  <Field int pivotY>
		angleDelta = 0.0F;
	//    9   15:aload_0         
	//   10   16:fconst_0        
	//   11   17:putfield        #31  <Field float angleDelta>
		setParams(i, f, j, k);
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:fload_2         
	//   15   23:iload_3         
	//   16   24:iload           4
	//   17   26:invokespecial   #34  <Method void setParams(int, float, int, int)>
		angleDelta = f;
	//   18   29:aload_0         
	//   19   30:fload_2         
	//   20   31:putfield        #31  <Field float angleDelta>
		pivotX = j;
	//   21   34:aload_0         
	//   22   35:iload_3         
	//   23   36:putfield        #27  <Field int pivotX>
		pivotY = k;
	//   24   39:aload_0         
	//   25   40:iload           4
	//   26   42:putfield        #29  <Field int pivotY>
	//   27   45:return          
	}

	public static void destory()
	{
		M_POOL.destory();
	//    0    0:getstatic       #22  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #37  <Method void com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.destory()>
	//    2    6:return          
	}

	public static RotateGestureMapMessage obtain(int i, float f, int j, int k)
	{
		RotateGestureMapMessage rotategesturemapmessage = (RotateGestureMapMessage)M_POOL.acquire();
	//    0    0:getstatic       #22  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #43  <Method Object com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #2   <Class RotateGestureMapMessage>
	//    3    9:astore          4
		if(rotategesturemapmessage == null)
	//*   4   11:aload           4
	//*   5   13:ifnonnull       28
		{
			return new RotateGestureMapMessage(i, f, j, k);
	//    6   16:new             #2   <Class RotateGestureMapMessage>
	//    7   19:dup             
	//    8   20:iload_0         
	//    9   21:fload_1         
	//   10   22:iload_2         
	//   11   23:iload_3         
	//   12   24:invokespecial   #45  <Method void RotateGestureMapMessage(int, float, int, int)>
	//   13   27:areturn         
		} else
		{
			rotategesturemapmessage.reset();
	//   14   28:aload           4
	//   15   30:invokevirtual   #48  <Method void reset()>
			rotategesturemapmessage.setParams(i, f, j, k);
	//   16   33:aload           4
	//   17   35:iload_0         
	//   18   36:fload_1         
	//   19   37:iload_2         
	//   20   38:iload_3         
	//   21   39:invokespecial   #34  <Method void setParams(int, float, int, int)>
			return rotategesturemapmessage;
	//   22   42:aload           4
	//   23   44:areturn         
		}
	}

	private void setParams(int i, float f, int j, int k)
	{
		setState(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #51  <Method void setState(int)>
		angleDelta = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #31  <Field float angleDelta>
		pivotX = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int pivotX>
		pivotY = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #29  <Field int pivotY>
	//   12   21:return          
	}

	public int getType()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	public void recycle()
	{
		M_POOL.release(((Object) (this)));
	//    0    0:getstatic       #22  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #58  <Method boolean com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.release(Object)>
	//    3    7:pop             
	//    4    8:return          
	}

	public void runCameraUpdate(GLMapState glmapstate)
	{
		float f = angleDelta;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float angleDelta>
	//    2    4:fstore_2        
		f = glmapstate.getMapAngle() + f;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #66  <Method float GLMapState.getMapAngle()>
	//    5    9:fload_2         
	//    6   10:fadd            
	//    7   11:fstore_2        
		if(isGestureScaleByMapCenter)
	//*   8   12:aload_0         
	//*   9   13:getfield        #70  <Field boolean isGestureScaleByMapCenter>
	//*  10   16:ifeq            29
		{
			glmapstate.setMapAngle(f);
	//   11   19:aload_1         
	//   12   20:fload_2         
	//   13   21:invokevirtual   #74  <Method void GLMapState.setMapAngle(float)>
			glmapstate.recalculate();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #77  <Method void GLMapState.recalculate()>
			return;
	//   16   28:return          
		}
		int i = pivotX;
	//   17   29:aload_0         
	//   18   30:getfield        #27  <Field int pivotX>
	//   19   33:istore_3        
		int j = pivotY;
	//   20   34:aload_0         
	//   21   35:getfield        #29  <Field int pivotY>
	//   22   38:istore          4
		if(isUseAnchor)
	//*  23   40:aload_0         
	//*  24   41:getfield        #80  <Field boolean isUseAnchor>
	//*  25   44:ifeq            58
		{
			i = anchorX;
	//   26   47:aload_0         
	//   27   48:getfield        #83  <Field int anchorX>
	//   28   51:istore_3        
			j = anchorY;
	//   29   52:aload_0         
	//   30   53:getfield        #86  <Field int anchorY>
	//   31   56:istore          4
		}
		IPoint ipoint = null;
	//   32   58:aconst_null     
	//   33   59:astore          5
		IPoint ipoint1 = null;
	//   34   61:aconst_null     
	//   35   62:astore          6
		if(i > 0 || j > 0)
	//*  36   64:iload_3         
	//*  37   65:ifgt            73
	//*  38   68:iload           4
	//*  39   70:ifle            107
		{
			ipoint = IPoint.obtain();
	//   40   73:invokestatic    #91  <Method IPoint IPoint.obtain()>
	//   41   76:astore          5
			ipoint1 = IPoint.obtain();
	//   42   78:invokestatic    #91  <Method IPoint IPoint.obtain()>
	//   43   81:astore          6
			win2geo(glmapstate, i, j, ipoint);
	//   44   83:aload_0         
	//   45   84:aload_1         
	//   46   85:iload_3         
	//   47   86:iload           4
	//   48   88:aload           5
	//   49   90:invokevirtual   #95  <Method void win2geo(GLMapState, int, int, IPoint)>
			glmapstate.setMapGeoCenter(ipoint.x, ipoint.y);
	//   50   93:aload_1         
	//   51   94:aload           5
	//   52   96:getfield        #98  <Field int IPoint.x>
	//   53   99:aload           5
	//   54  101:getfield        #101 <Field int IPoint.y>
	//   55  104:invokevirtual   #105 <Method void GLMapState.setMapGeoCenter(int, int)>
		}
		glmapstate.setMapAngle(f);
	//   56  107:aload_1         
	//   57  108:fload_2         
	//   58  109:invokevirtual   #74  <Method void GLMapState.setMapAngle(float)>
		glmapstate.recalculate();
	//   59  112:aload_1         
	//   60  113:invokevirtual   #77  <Method void GLMapState.recalculate()>
		if(i > 0 || j > 0)
	//*  61  116:iload_3         
	//*  62  117:ifgt            125
	//*  63  120:iload           4
	//*  64  122:ifle            174
		{
			win2geo(glmapstate, i, j, ipoint1);
	//   65  125:aload_0         
	//   66  126:aload_1         
	//   67  127:iload_3         
	//   68  128:iload           4
	//   69  130:aload           6
	//   70  132:invokevirtual   #95  <Method void win2geo(GLMapState, int, int, IPoint)>
			if(ipoint != null)
	//*  71  135:aload           5
	//*  72  137:ifnull          170
				glmapstate.setMapGeoCenter(ipoint.x * 2 - ipoint1.x, ipoint.y * 2 - ipoint1.y);
	//   73  140:aload_1         
	//   74  141:aload           5
	//   75  143:getfield        #98  <Field int IPoint.x>
	//   76  146:iconst_2        
	//   77  147:imul            
	//   78  148:aload           6
	//   79  150:getfield        #98  <Field int IPoint.x>
	//   80  153:isub            
	//   81  154:aload           5
	//   82  156:getfield        #101 <Field int IPoint.y>
	//   83  159:iconst_2        
	//   84  160:imul            
	//   85  161:aload           6
	//   86  163:getfield        #101 <Field int IPoint.y>
	//   87  166:isub            
	//   88  167:invokevirtual   #105 <Method void GLMapState.setMapGeoCenter(int, int)>
			glmapstate.recalculate();
	//   89  170:aload_1         
	//   90  171:invokevirtual   #77  <Method void GLMapState.recalculate()>
		}
		if(ipoint != null)
	//*  91  174:aload           5
	//*  92  176:ifnull          184
			ipoint.recycle();
	//   93  179:aload           5
	//   94  181:invokevirtual   #107 <Method void IPoint.recycle()>
		if(ipoint1 != null)
	//*  95  184:aload           6
	//*  96  186:ifnull          194
			ipoint1.recycle();
	//   97  189:aload           6
	//   98  191:invokevirtual   #107 <Method void IPoint.recycle()>
	//   99  194:return          
	}

	private static final com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool M_POOL = new com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool(256);
	public float angleDelta;
	public int pivotX;
	public int pivotY;

	static 
	{
	//    0    0:new             #16  <Class com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:sipush          256
	//    3    7:invokespecial   #20  <Method void com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool(int)>
	//    4   10:putstatic       #22  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//*   5   13:return          
	}
}
