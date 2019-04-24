// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


public class DPoint
{

	public DPoint()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public DPoint(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		x = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #26  <Field double x>
		y = d1;
	//    5    9:aload_0         
	//    6   10:dload_3         
	//    7   11:putfield        #28  <Field double y>
	//    8   14:return          
	}

	public static DPoint obtain()
	{
		DPoint dpoint = (DPoint)M_POOL.acquire();
	//    0    0:getstatic       #20  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #34  <Method Object com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #2   <Class DPoint>
	//    3    9:astore_0        
		if(dpoint == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       22
		{
			return new DPoint();
	//    6   14:new             #2   <Class DPoint>
	//    7   17:dup             
	//    8   18:invokespecial   #35  <Method void DPoint()>
	//    9   21:areturn         
		} else
		{
			dpoint.set(0.0D, 0.0D);
	//   10   22:aload_0         
	//   11   23:dconst_0        
	//   12   24:dconst_0        
	//   13   25:invokespecial   #38  <Method void set(double, double)>
			return dpoint;
	//   14   28:aload_0         
	//   15   29:areturn         
		}
	}

	public static DPoint obtain(double d, double d1)
	{
		DPoint dpoint = (DPoint)M_POOL.acquire();
	//    0    0:getstatic       #20  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #34  <Method Object com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #2   <Class DPoint>
	//    3    9:astore          4
		if(dpoint == null)
	//*   4   11:aload           4
	//*   5   13:ifnonnull       26
		{
			return new DPoint(d, d1);
	//    6   16:new             #2   <Class DPoint>
	//    7   19:dup             
	//    8   20:dload_0         
	//    9   21:dload_2         
	//   10   22:invokespecial   #41  <Method void DPoint(double, double)>
	//   11   25:areturn         
		} else
		{
			dpoint.set(d, d1);
	//   12   26:aload           4
	//   13   28:dload_0         
	//   14   29:dload_2         
	//   15   30:invokespecial   #38  <Method void set(double, double)>
			return dpoint;
	//   16   33:aload           4
	//   17   35:areturn         
		}
	}

	private void set(double d, double d1)
	{
		x = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #26  <Field double x>
		y = d1;
	//    3    5:aload_0         
	//    4    6:dload_3         
	//    5    7:putfield        #28  <Field double y>
	//    6   10:return          
	}

	public void recycle()
	{
		M_POOL.release(((Object) (this)));
	//    0    0:getstatic       #20  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #46  <Method boolean com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.release(Object)>
	//    3    7:pop             
	//    4    8:return          
	}

	private static final com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool M_POOL = new com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool(32);
	public double x;
	public double y;

	static 
	{
	//    0    0:new             #14  <Class com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:bipush          32
	//    3    6:invokespecial   #18  <Method void com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool(int)>
	//    4    9:putstatic       #20  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//*   5   12:return          
	}
}
