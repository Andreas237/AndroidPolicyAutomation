// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.graphics.Point;

public class IPoint extends Point
	implements Cloneable
{

	public IPoint()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Point()>
	//    2    4:return          
	}

	public IPoint(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Point()>
		x = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int x>
		y = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field int y>
	//    8   14:return          
	}

	public static IPoint obtain()
	{
		IPoint ipoint = (IPoint)M_POOL.acquire();
	//    0    0:getstatic       #19  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #36  <Method Object com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #2   <Class IPoint>
	//    3    9:astore_0        
		if(ipoint == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       22
		{
			return new IPoint();
	//    6   14:new             #2   <Class IPoint>
	//    7   17:dup             
	//    8   18:invokespecial   #37  <Method void IPoint()>
	//    9   21:areturn         
		} else
		{
			ipoint.set(0, 0);
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #40  <Method void set(int, int)>
			return ipoint;
	//   14   28:aload_0         
	//   15   29:areturn         
		}
	}

	public static IPoint obtain(int i, int j)
	{
		IPoint ipoint = (IPoint)M_POOL.acquire();
	//    0    0:getstatic       #19  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #36  <Method Object com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #2   <Class IPoint>
	//    3    9:astore_2        
		if(ipoint == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       24
		{
			return new IPoint(i, j);
	//    6   14:new             #2   <Class IPoint>
	//    7   17:dup             
	//    8   18:iload_0         
	//    9   19:iload_1         
	//   10   20:invokespecial   #43  <Method void IPoint(int, int)>
	//   11   23:areturn         
		} else
		{
			ipoint.set(i, j);
	//   12   24:aload_2         
	//   13   25:iload_0         
	//   14   26:iload_1         
	//   15   27:invokevirtual   #40  <Method void set(int, int)>
			return ipoint;
	//   16   30:aload_2         
	//   17   31:areturn         
		}
	}

	public Object clone()
	{
		IPoint ipoint;
		try
		{
			ipoint = (IPoint)((Object)this).clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class IPoint>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   6   10:astore_1        
		{
			clonenotsupportedexception.printStackTrace();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #53  <Method void CloneNotSupportedException.printStackTrace()>
			return ((Object) (null));
	//    9   15:aconst_null     
	//   10   16:areturn         
		}
		return ((Object) (ipoint));
	}

	public void recycle()
	{
		M_POOL.release(((Object) (this)));
	//    0    0:getstatic       #19  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #58  <Method boolean com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.release(Object)>
	//    3    7:pop             
	//    4    8:return          
	}

	private static final com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool M_POOL = new com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool(32);

	static 
	{
	//    0    0:new             #13  <Class com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:bipush          32
	//    3    6:invokespecial   #17  <Method void com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool(int)>
	//    4    9:putstatic       #19  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//*   5   12:return          
	}
}
