// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.graphics.Point;

// Referenced classes of package com.autonavi.amap.mapcore:
//			VirtualEarthProjection, DPoint, IPoint

public class MapProjection
{

	public MapProjection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void geo2LonLat(int i, int j, DPoint dpoint)
	{
		DPoint dpoint1 = VirtualEarthProjection.pixelsToLatLong(i, j, 20);
	//    0    0:iload_0         
	//    1    1:i2l             
	//    2    2:iload_1         
	//    3    3:i2l             
	//    4    4:bipush          20
	//    5    6:invokestatic    #17  <Method DPoint VirtualEarthProjection.pixelsToLatLong(long, long, int)>
	//    6    9:astore_3        
		dpoint.x = dpoint1.x;
	//    7   10:aload_2         
	//    8   11:aload_3         
	//    9   12:getfield        #23  <Field double DPoint.x>
	//   10   15:putfield        #23  <Field double DPoint.x>
		dpoint.y = dpoint1.y;
	//   11   18:aload_2         
	//   12   19:aload_3         
	//   13   20:getfield        #26  <Field double DPoint.y>
	//   14   23:putfield        #26  <Field double DPoint.y>
		dpoint1.recycle();
	//   15   26:aload_3         
	//   16   27:invokevirtual   #29  <Method void DPoint.recycle()>
	//   17   30:return          
	}

	public static void lonlat2Geo(double d, double d1, IPoint ipoint)
	{
		Point point = VirtualEarthProjection.latLongToPixels(d1, d, 20);
	//    0    0:dload_2         
	//    1    1:dload_0         
	//    2    2:bipush          20
	//    3    4:invokestatic    #35  <Method Point VirtualEarthProjection.latLongToPixels(double, double, int)>
	//    4    7:astore          5
		ipoint.x = point.x;
	//    5    9:aload           4
	//    6   11:aload           5
	//    7   13:getfield        #40  <Field int Point.x>
	//    8   16:putfield        #43  <Field int IPoint.x>
		ipoint.y = point.y;
	//    9   19:aload           4
	//   10   21:aload           5
	//   11   23:getfield        #45  <Field int Point.y>
	//   12   26:putfield        #46  <Field int IPoint.y>
	//   13   29:return          
	}
}
