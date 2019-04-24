// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.message;

import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

// Referenced classes of package com.autonavi.amap.mapcore.message:
//			AbstractGestureMapMessage

public class ScaleGestureMapMessage extends AbstractGestureMapMessage
{

	public ScaleGestureMapMessage(int i, float f, int j, int k)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #25  <Method void AbstractGestureMapMessage(int)>
		scaleDelta = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #27  <Field float scaleDelta>
		pivotX = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #29  <Field int pivotX>
		pivotY = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #31  <Field int pivotY>
		setParams(i, f, j, k);
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:fload_2         
	//   15   23:iload_3         
	//   16   24:iload           4
	//   17   26:invokespecial   #34  <Method void setParams(int, float, int, int)>
	//   18   29:return          
	}

	public static void destory()
	{
		M_POOL.destory();
	//    0    0:getstatic       #22  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #37  <Method void com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.destory()>
	//    2    6:return          
	}

	public static ScaleGestureMapMessage obtain(int i, float f, int j, int k)
	{
		ScaleGestureMapMessage scalegesturemapmessage = (ScaleGestureMapMessage)M_POOL.acquire();
	//    0    0:getstatic       #22  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #43  <Method Object com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #2   <Class ScaleGestureMapMessage>
	//    3    9:astore          4
		if(scalegesturemapmessage == null)
	//*   4   11:aload           4
	//*   5   13:ifnonnull       28
		{
			return new ScaleGestureMapMessage(i, f, j, k);
	//    6   16:new             #2   <Class ScaleGestureMapMessage>
	//    7   19:dup             
	//    8   20:iload_0         
	//    9   21:fload_1         
	//   10   22:iload_2         
	//   11   23:iload_3         
	//   12   24:invokespecial   #45  <Method void ScaleGestureMapMessage(int, float, int, int)>
	//   13   27:areturn         
		} else
		{
			scalegesturemapmessage.reset();
	//   14   28:aload           4
	//   15   30:invokevirtual   #48  <Method void reset()>
			scalegesturemapmessage.setParams(i, f, j, k);
	//   16   33:aload           4
	//   17   35:iload_0         
	//   18   36:fload_1         
	//   19   37:iload_2         
	//   20   38:iload_3         
	//   21   39:invokespecial   #34  <Method void setParams(int, float, int, int)>
			return scalegesturemapmessage;
	//   22   42:aload           4
	//   23   44:areturn         
		}
	}

	private void setMapZoomer(GLMapState glmapstate)
	{
		float f = scaleDelta;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float scaleDelta>
	//    2    4:fstore_2        
		glmapstate.setMapZoomer(glmapstate.getMapZoomer() + f);
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #56  <Method float GLMapState.getMapZoomer()>
	//    6   10:fload_2         
	//    7   11:fadd            
	//    8   12:invokevirtual   #59  <Method void GLMapState.setMapZoomer(float)>
		glmapstate.recalculate();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #62  <Method void GLMapState.recalculate()>
	//   11   19:return          
	}

	private void setParams(int i, float f, int j, int k)
	{
		setState(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #65  <Method void setState(int)>
		scaleDelta = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #27  <Field float scaleDelta>
		pivotX = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #29  <Field int pivotX>
		pivotY = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #31  <Field int pivotY>
	//   12   21:return          
	}

	public int getType()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void recycle()
	{
		M_POOL.release(((Object) (this)));
	//    0    0:getstatic       #22  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #72  <Method boolean com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.release(Object)>
	//    3    7:pop             
	//    4    8:return          
	}

	public void runCameraUpdate(GLMapState glmapstate)
	{
		if(isUseAnchor)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field boolean isUseAnchor>
	//*   2    4:ifeq            13
		{
			setMapZoomer(glmapstate);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #79  <Method void setMapZoomer(GLMapState)>
			return;
	//    6   12:return          
		}
		int i = pivotX;
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field int pivotX>
	//    9   17:istore_2        
		int j = pivotY;
	//   10   18:aload_0         
	//   11   19:getfield        #31  <Field int pivotY>
	//   12   22:istore_3        
		if(isGestureScaleByMapCenter)
	//*  13   23:aload_0         
	//*  14   24:getfield        #82  <Field boolean isGestureScaleByMapCenter>
	//*  15   27:ifeq            44
		{
			i = width >> 1;
	//   16   30:aload_0         
	//   17   31:getfield        #85  <Field int width>
	//   18   34:iconst_1        
	//   19   35:ishr            
	//   20   36:istore_2        
			j = height >> 1;
	//   21   37:aload_0         
	//   22   38:getfield        #88  <Field int height>
	//   23   41:iconst_1        
	//   24   42:ishr            
	//   25   43:istore_3        
		}
		IPoint ipoint = null;
	//   26   44:aconst_null     
	//   27   45:astore          4
		IPoint ipoint1 = null;
	//   28   47:aconst_null     
	//   29   48:astore          5
		if(i > 0 || j > 0)
	//*  30   50:iload_2         
	//*  31   51:ifgt            58
	//*  32   54:iload_3         
	//*  33   55:ifle            91
		{
			ipoint = IPoint.obtain();
	//   34   58:invokestatic    #93  <Method IPoint IPoint.obtain()>
	//   35   61:astore          4
			ipoint1 = IPoint.obtain();
	//   36   63:invokestatic    #93  <Method IPoint IPoint.obtain()>
	//   37   66:astore          5
			win2geo(glmapstate, i, j, ipoint);
	//   38   68:aload_0         
	//   39   69:aload_1         
	//   40   70:iload_2         
	//   41   71:iload_3         
	//   42   72:aload           4
	//   43   74:invokevirtual   #97  <Method void win2geo(GLMapState, int, int, IPoint)>
			glmapstate.setMapGeoCenter(ipoint.x, ipoint.y);
	//   44   77:aload_1         
	//   45   78:aload           4
	//   46   80:getfield        #100 <Field int IPoint.x>
	//   47   83:aload           4
	//   48   85:getfield        #103 <Field int IPoint.y>
	//   49   88:invokevirtual   #107 <Method void GLMapState.setMapGeoCenter(int, int)>
		}
		setMapZoomer(glmapstate);
	//   50   91:aload_0         
	//   51   92:aload_1         
	//   52   93:invokespecial   #79  <Method void setMapZoomer(GLMapState)>
		if(i > 0 || j > 0)
	//*  53   96:iload_2         
	//*  54   97:ifgt            104
	//*  55  100:iload_3         
	//*  56  101:ifle            152
		{
			win2geo(glmapstate, i, j, ipoint1);
	//   57  104:aload_0         
	//   58  105:aload_1         
	//   59  106:iload_2         
	//   60  107:iload_3         
	//   61  108:aload           5
	//   62  110:invokevirtual   #97  <Method void win2geo(GLMapState, int, int, IPoint)>
			if(ipoint != null)
	//*  63  113:aload           4
	//*  64  115:ifnull          148
				glmapstate.setMapGeoCenter(ipoint.x * 2 - ipoint1.x, ipoint.y * 2 - ipoint1.y);
	//   65  118:aload_1         
	//   66  119:aload           4
	//   67  121:getfield        #100 <Field int IPoint.x>
	//   68  124:iconst_2        
	//   69  125:imul            
	//   70  126:aload           5
	//   71  128:getfield        #100 <Field int IPoint.x>
	//   72  131:isub            
	//   73  132:aload           4
	//   74  134:getfield        #103 <Field int IPoint.y>
	//   75  137:iconst_2        
	//   76  138:imul            
	//   77  139:aload           5
	//   78  141:getfield        #103 <Field int IPoint.y>
	//   79  144:isub            
	//   80  145:invokevirtual   #107 <Method void GLMapState.setMapGeoCenter(int, int)>
			glmapstate.recalculate();
	//   81  148:aload_1         
	//   82  149:invokevirtual   #62  <Method void GLMapState.recalculate()>
		}
		if(ipoint != null)
	//*  83  152:aload           4
	//*  84  154:ifnull          162
			ipoint.recycle();
	//   85  157:aload           4
	//   86  159:invokevirtual   #109 <Method void IPoint.recycle()>
		if(ipoint1 != null)
	//*  87  162:aload           5
	//*  88  164:ifnull          172
			ipoint1.recycle();
	//   89  167:aload           5
	//   90  169:invokevirtual   #109 <Method void IPoint.recycle()>
	//   91  172:return          
	}

	private static final com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool M_POOL = new com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool(256);
	public int pivotX;
	public int pivotY;
	public float scaleDelta;

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
