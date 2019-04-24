// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.graphics.PointF;

public class FPoint extends PointF
{

	public FPoint()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void PointF()>
	//    2    4:return          
	}

	public FPoint(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void PointF()>
		x = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #25  <Field float x>
		y = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #28  <Field float y>
	//    8   14:return          
	}

	public static FPoint obtain()
	{
		FPoint fpoint = (FPoint)M_POOL.acquire();
	//    0    0:getstatic       #17  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #34  <Method Object com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #2   <Class FPoint>
	//    3    9:astore_0        
		if(fpoint == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       22
		{
			return new FPoint();
	//    6   14:new             #2   <Class FPoint>
	//    7   17:dup             
	//    8   18:invokespecial   #35  <Method void FPoint()>
	//    9   21:areturn         
		} else
		{
			fpoint.set(0.0F, 0.0F);
	//   10   22:aload_0         
	//   11   23:fconst_0        
	//   12   24:fconst_0        
	//   13   25:invokevirtual   #38  <Method void set(float, float)>
			return fpoint;
	//   14   28:aload_0         
	//   15   29:areturn         
		}
	}

	public static FPoint obtain(float f, float f1)
	{
		FPoint fpoint = (FPoint)M_POOL.acquire();
	//    0    0:getstatic       #17  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #34  <Method Object com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #2   <Class FPoint>
	//    3    9:astore_2        
		if(fpoint == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       24
		{
			return new FPoint(f, f1);
	//    6   14:new             #2   <Class FPoint>
	//    7   17:dup             
	//    8   18:fload_0         
	//    9   19:fload_1         
	//   10   20:invokespecial   #41  <Method void FPoint(float, float)>
	//   11   23:areturn         
		} else
		{
			fpoint.set(f, f1);
	//   12   24:aload_2         
	//   13   25:fload_0         
	//   14   26:fload_1         
	//   15   27:invokevirtual   #38  <Method void set(float, float)>
			return fpoint;
	//   16   30:aload_2         
	//   17   31:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		obj = ((Object) ((FPoint)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class FPoint>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		return x == ((FPoint) (obj)).x && y == ((FPoint) (obj)).y;
	//    7   11:aload_0         
	//    8   12:getfield        #25  <Field float x>
	//    9   15:aload_1         
	//   10   16:getfield        #25  <Field float x>
	//   11   19:fcmpl           
	//   12   20:ifne            37
	//   13   23:aload_0         
	//   14   24:getfield        #28  <Field float y>
	//   15   27:aload_1         
	//   16   28:getfield        #28  <Field float y>
	//   17   31:fcmpl           
	//   18   32:ifne            37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	public int hashCode()
	{
		Float.floatToIntBits(x);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float x>
	//    2    4:invokestatic    #51  <Method int Float.floatToIntBits(float)>
	//    3    7:pop             
		return Float.floatToIntBits(y) * 37;
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field float y>
	//    6   12:invokestatic    #51  <Method int Float.floatToIntBits(float)>
	//    7   15:bipush          37
	//    8   17:imul            
	//    9   18:ireturn         
	}

	public void recycle()
	{
		M_POOL.release(((Object) (this)));
	//    0    0:getstatic       #17  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #55  <Method boolean com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.release(Object)>
	//    3    7:pop             
	//    4    8:return          
	}

	private static final com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool M_POOL = new com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool(32);

	static 
	{
	//    0    0:new             #11  <Class com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:bipush          32
	//    3    6:invokespecial   #15  <Method void com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool(int)>
	//    4    9:putstatic       #17  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//*   5   12:return          
	}
}
